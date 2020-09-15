import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UI extends JFrame {
    private JPanel catalogPanel = new JPanel();
    private JList fileList = new JList();
    private JScrollPane fileScroll = new JScrollPane(fileList);
    private JPanel buttonPanel = new JPanel();
    private JButton addButton = new JButton("Создать папку");
    private JButton backButton = new JButton("Назад");
    private JButton deleteButton = new JButton("Удалить");
    private JButton renameButton = new JButton("Переименовать");
    private ArrayList<String> dirCache= new ArrayList();

    public UI(){
        super("Проводник");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        catalogPanel.setLayout(new BorderLayout(5,5));
        catalogPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        buttonPanel.setLayout(new GridLayout(1,4,5,5));
        JDialog createNewDirDialog = new JDialog(UI.this,"Создание папки",true);
        JPanel createNewDirPanel = new JPanel();
        createNewDirDialog.add(createNewDirPanel);
        File disc[] = File.listRoots();
        fileScroll.setPreferredSize(new Dimension(400,500));
        fileList.setListData(disc);
        fileList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        fileList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    DefaultListModel model = new DefaultListModel();
                    String selectedObject = fileList.getSelectedValue().toString();
                    String fullPath = toFullPath(dirCache);
                    File selectedFile;
                    if (dirCache.size() > 1) {
                        selectedFile = new File(fullPath, selectedObject);
                    } else {
                        selectedFile = new File(fullPath + selectedObject);
                    }

                    if (selectedFile.isDirectory()) {
                        String[] rootStr = selectedFile.list();
                        for (String str : rootStr) {
                            File checkObject = new File(selectedFile.getPath(), str);
                            if (!checkObject.isHidden()) {
                                if (checkObject.isDirectory()) {
                                    model.addElement(str);
                                } else {
                                    model.addElement("файл-" + str);
                                }
                            }
                        }
                        dirCache.add(selectedObject);
                        fileList.setModel(model);
                    }
                }
            }


            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dirCache.size() > 1){
                    dirCache.remove(dirCache.size() - 1);
                    String backDir = toFullPath(dirCache);
                    String[] objects = new File(backDir).list();
                    DefaultListModel backRootModel = new DefaultListModel();

                    for (String str : objects){
                        File checkFile = new File(backDir, str);
                        if (!checkFile.isHidden()){
                            if (checkFile.isDirectory()){
                                backRootModel.addElement(str);
                            } else {
                                backRootModel.addElement("файл-" + str );
                            }
                        }
                    }
                    fileList.setModel(backRootModel);
                } else {
                    dirCache.removeAll(dirCache);
                    fileList.setListData(disc);
                }
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!dirCache.isEmpty()){
                    String currentPath;
                    File newFolder;
                    CreateNewFolderJDialog newFolderJDialog = new CreateNewFolderJDialog(UI.this);

                    if (newFolderJDialog.getReady()){
                        currentPath = toFullPath(dirCache);
                        newFolder = new File(currentPath,newFolderJDialog.getNewName());
                        if (!newFolder.exists()){
                            newFolder.mkdir();
                        }

                        File updateDir = new File(currentPath);
                        String updateMas[] = updateDir.list();
                        DefaultListModel updateModel = new DefaultListModel();
                        for (String str : updateMas){
                            File check = new File (updateDir.getPath(),str);
                            if (!check.isHidden()){
                                if (check.isDirectory()){
                                    updateModel.addElement(str);
                                } else {
                                    updateModel.addElement("файл-" + str);
                                }
                            }
                        }
                        fileList.setModel(updateModel);
                    }
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedObject = fileList.getSelectedValue().toString();
                String currentPath = toFullPath(dirCache);
                if (!selectedObject.isEmpty()){
                    deleteDir(new File(currentPath,selectedObject));
                    File updateDir = new File(currentPath);
                    String updateMas[] = updateDir.list();
                    DefaultListModel updateModel = new DefaultListModel();

                    for (String str : updateMas){
                        File check = new File (updateDir.getPath(), str);
                        if (!check.isHidden()){
                            if (check.isDirectory()){
                                updateModel.addElement(str);
                            } else {
                                updateModel.addElement("файл-" + str);
                            }
                        }
                    }
                    fileList.setModel(updateModel);
                }
            }
        });

        renameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if (!dirCache.isEmpty() & fileList.getSelectedValue() != null){
                     String currentPath = toFullPath(dirCache);
                     String selectedObject = fileList.getSelectedValue().toString();
                     RenameJDialog renamer = new RenameJDialog(UI.this);
                     if (renamer.getReady()){
                         File renameFile = new File(currentPath, selectedObject);
                         renameFile.renameTo(new File(currentPath, renamer.getNewName()));

                         File updateDir = new File(currentPath);
                         String updateMas[] = updateDir.list();
                         DefaultListModel updateModel = new DefaultListModel();

                         for (String str : updateMas){
                             File check = new File (updateDir.getPath(), str);
                             if (!check.isHidden()){
                                 if (check.isDirectory()){
                                     updateModel.addElement(str);
                                 } else {
                                     updateModel.addElement("файл-" + str);
                                 }
                             }
                         }
                         fileList.setModel(updateModel);

                     }
                 }
            }
        });

        buttonPanel.add(backButton);
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(renameButton);
        catalogPanel.setLayout(new BorderLayout());
        catalogPanel.add(fileScroll, BorderLayout.CENTER);
        catalogPanel.add(buttonPanel, BorderLayout.SOUTH);
        getContentPane().add(catalogPanel);
        setSize(600,600);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public String toFullPath(List<String> file){
        String listPart = "";
        for (String str : file){
            listPart = listPart + str;
        }
        return listPart;
    }

    public void deleteDir(File file){
        File[] objects = file.listFiles();
        if (objects != null){
            for (File f : objects){
                deleteDir(f);
            }
        }
        file.delete();
    }
}
