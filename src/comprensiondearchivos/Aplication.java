/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprensiondearchivos;

import CodificacionHuffman.Elementos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import CodificacionHuffman.HuffmanApp;
import static CodificacionHuffman.HuffmanApp.Ordenados;
import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ecuad
 */
public class Aplication extends javax.swing.JFrame {

    /**
     * Creates new form Aplication
     */
    
    private String archivo;
    public Aplication() {
        initComponents();
        this.archivo = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        directorio = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Procesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        antes = new javax.swing.JLabel();
        despues = new javax.swing.JLabel();
        razon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        antes1 = new javax.swing.JLabel();
        despues1 = new javax.swing.JLabel();
        razon1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Procesar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COMPRESIÓN DE ARCHIVOS POR HUFFMAN");

        jLabel3.setText("Archivo de entada:");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar la aplicacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Procesar.setText("Comprimir archivo");
        Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de apariciones de los caracteres:");

        Resultados.setColumns(20);
        Resultados.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Resultados.setRows(5);
        jScrollPane1.setViewportView(Resultados);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel37.setText("Razones de comprension");

        antes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        antes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antes.setText("00");

        despues.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        despues.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        despues.setText("00");

        razon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        razon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        razon.setText("00%");

        jLabel4.setText("Antes:");

        jLabel5.setText("Despues:");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("Método binario");

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setText("Método archivos");

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        antes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        antes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antes1.setText("00");

        despues1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        despues1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        despues1.setText("00");

        razon1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        razon1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        razon1.setText("00%");

        Procesar1.setText("Descomprimir archivo");
        Procesar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procesar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator9)
                                            .addComponent(antes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator12)
                                            .addComponent(despues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(antes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator10)
                                            .addComponent(jSeparator13)
                                            .addComponent(despues1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(razon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(razon1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Procesar1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel4)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(antes)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(antes1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(despues)
                                                    .addComponent(despues1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(razon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(razon1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Procesar)
                    .addComponent(Procesar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        JFileChooser ventanaBusqueda = new JFileChooser();//Objeto ventana de busqueda
        ventanaBusqueda.setFileSelectionMode(JFileChooser.FILES_ONLY);//Tipo de busqueda
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto...", "txt");
        ventanaBusqueda.setFileFilter(filter);//Extenciones
        ventanaBusqueda.setMultiSelectionEnabled(true);//Seleccionar varios archivos
        int returnVal = ventanaBusqueda.showOpenDialog(null);//Condicional de aceptacion seleccion
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            File archivo = ventanaBusqueda.getSelectedFile();
            directorio.setText(archivo.getPath());
            this.directorio.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private String TextoABinario(String texto) throws FileNotFoundException
    {
        //String textoBinario = null;
        String n;
        int x=0;
        PrintWriter archHF = new PrintWriter("originalBinario.txt");
        
        for (int i=0; i<texto.length(); i++){
            x=texto.charAt(i);
            n=Integer.toBinaryString(x);
            //textoBinario = textoBinario + n;
            archHF.print(n);
        }
        archHF.close();
        
        return new Scanner(new File("originalBinario.txt")).useDelimiter("\\A").next();
        
    }
    
    private void ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarActionPerformed
        if(!new File(this.directorio.getText()).exists())
        {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el archivo especificado no existe.", "Error al procesar", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        //Lectura del contenido del Archivo, guardando el contenido en la variable text
        String cont, anterior="", text="";
        FileReader f = null;
        try {f = new FileReader(directorio.getText());} catch (FileNotFoundException ex) {}
        
        try (BufferedReader b = new BufferedReader(f)) {
            while((cont = b.readLine())!=null) {
                anterior=cont;
                text=text+anterior + "\n";
            }
        } catch (IOException ex) {}
        
        try {
            text = new Scanner(new File(directorio.getText())).useDelimiter("\\A").next();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //System.out.println(text);
        //Invocacion a la codificacion de huffman --< texto codificado
        
        String textComprimido = null;
        try {
            textComprimido = HuffmanApp.Procesar(text);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Texto original al texto binario mediante el codigo Ascii
        
        String textBin = null;
        try {
            textBin = this.TextoABinario(text).replace("null", "");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Metodo de 0s y 1s, pesos:
        int peso1 = textBin.length();
        int peso2 = textComprimido.length();
        
        
        //System.out.println("------------------------------");
        //System.out.println("Texto: " + text);
        //System.out.println("Binario: " + textBin);
        //System.out.println("Comprimido: " + textComprimido);
        
        //Razones metodo 0s y 1s
        this.antes.setText("" + peso1 + " ");
        this.despues.setText(""+ peso2+ "");
        //Calculo de la razon:
        double razon = ((((double)peso2/(double)peso1)*100) - 100);
        this.razon.setText("" + Math.abs((int)razon) + "%");
        
        //Razones por archivos
        
        File normHF = new File("originalBinario.txt");
        File comprHF = new File("compressHF.txt");
        
        peso1 = ((int) normHF.length())/1024;
        peso2 = ((int) comprHF.length())/1024;
        
        this.antes1.setText("" + peso1 + " KB");
        this.despues1.setText(""+ peso2+ " KB");
        razon = ((((double)peso2/(double)peso1)*100) - 100);
        this.razon1.setText("" + Math.abs((int)razon) + "%");
        
        
        //Mostrar en la interfaz las frecuencias de cada caracter
        Collections.sort(Ordenados, new Comparator<Elementos>(){
            @Override
            public int compare(Elementos p1, Elementos p2) {
                return new Integer(p2.getFreq()).compareTo(p1.getFreq());
            }
        });
        String strCadena="";
        for (Iterator<Elementos> it = Ordenados.iterator(); it.hasNext();) {
            Elementos opc = (Elementos) it.next();
            if(opc.getCaracter() != ' ')
                strCadena += opc.getCaracter()+" -> "+opc.getFreq()+"\n";
            else
                strCadena += "\' \'"+" -> "+opc.getFreq()+"\n";
        }
        Resultados.setText(strCadena);
        
        
        
    }//GEN-LAST:event_ProcesarActionPerformed

    private void Procesar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procesar1ActionPerformed
         if(!new File(this.directorio.getText()).exists())
        {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el archivo especificado no existe.", "Error al procesar", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        //Lectura del contenido del Archivo comprimido en la variable text
        String cont, anterior="", text="";
        FileReader f = null;
        try {f = new FileReader(directorio.getText());} catch (FileNotFoundException ex) {}
        
        try (BufferedReader b = new BufferedReader(f)) {
            while((cont = b.readLine())!=null) {
                anterior=cont+"\n";
                text=text+anterior;
            }
        } catch (IOException ex) {}
        
        //Lectura del arcH con los caracteres y frecuencias
        
        try{
            FileInputStream fis = new FileInputStream("objHF.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            HuffmanApp.codeToChar = (HashMap) ois.readObject();//El método readObject() recupera el objeto
            ois.close(); fis.close();
          }catch(FileNotFoundException e){}catch(IOException e){}catch(ClassNotFoundException e){e.printStackTrace();}
        
        System.out.println(text);
        //Invocacion a la codificacion de huffman --< texto codificado
        
        String textDescomprimido = null;
       
        textDescomprimido = HuffmanApp.decompress(text);
        
        
        //Escribiendo el texto descomprimido
        try {
            PrintWriter archivoDescomprimido = new PrintWriter("TextoDescomprimido.txt");
            archivoDescomprimido.print(textDescomprimido);
            archivoDescomprimido.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Abriendo el bloc de notas con el texro descomprimido
        if(!new File("TextoDescomprimido.txt").exists()) return;      
        try {
                File path = new File ("TextoDescomprimido.txt");
                Desktop.getDesktop().open(path);
           }catch (IOException ex) {}
        
        
    }//GEN-LAST:event_Procesar1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Procesar;
    private javax.swing.JButton Procesar1;
    public static javax.swing.JTextArea Resultados;
    private javax.swing.JLabel antes;
    private javax.swing.JLabel antes1;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel despues;
    private javax.swing.JLabel despues1;
    private javax.swing.JTextField directorio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel razon;
    private javax.swing.JLabel razon1;
    // End of variables declaration//GEN-END:variables
}