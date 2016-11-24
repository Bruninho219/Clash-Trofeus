package clash;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JProgressBar;


public class Main extends javax.swing.JFrame
{
    public int x=1;
    public int trofeus=0;
    public String liga="";
    private BufferedImage imagem;
    public String img=null;
    public String ruta = "C:/LigaImg/";
    public int y=0;
    public int progresso=0;
    
    public Main()
    {
        initComponents();
        this.setResizable(false);
        img= ruta + "fantasma.png";
        ImagLiga.setIcon(new javax.swing.ImageIcon(img));
        trofeusfalta.setText("BRS219");
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jSlider1 = new javax.swing.JSlider();
        ok = new java.awt.Button();
        trofeusfalta = new java.awt.Label();
        barra = new javax.swing.JProgressBar();
        label2 = new java.awt.Label();
        Up = new java.awt.Button();
        Down = new java.awt.Button();
        telaX = new java.awt.TextField();
        ImagLiga = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ok.setLabel("OK");
        ok.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                okActionPerformed(evt);
            }
        });

        trofeusfalta.setBackground(new java.awt.Color(153, 153, 153));

        label2.setText("Troféus:");

        Up.setActionCommand("Ud");
        Up.setLabel("+");
        Up.setMinimumSize(new java.awt.Dimension(23, 26));
        Up.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpActionPerformed(evt);
            }
        });

        Down.setLabel("-");
        Down.setMinimumSize(new java.awt.Dimension(20, 26));
        Down.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DownActionPerformed(evt);
            }
        });

        telaX.setName(""); // NOI18N
        telaX.setText("0");

        button1.setLabel("Ajuda");
        button1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("+");
        button2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button2ActionPerformed(evt);
            }
        });

        button3.setLabel("-");
        button3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trofeusfalta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaX, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(ImagLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Up, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImagLiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trofeusfalta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void Imagem()
    {
        img= ruta + liga + ".png";
                
        imagem=null;
        try
        {
            imagem = ImageIO.read(new File(img));
        }
        catch(IOException exc)
        {
            ImagLiga.setIcon(new javax.swing.ImageIcon(img));
        }
        if(imagem != null)
        {
            ImagLiga.setIcon(new javax.swing.ImageIcon(img));
        }
        calcula();
    }
    public void buscaImg()
    {
        if(x==1)
        {
            liga="fantasma";
            y=0;
        }
        if(x==2)
        {
            liga="bronze3";
            y=400;
        }
        if(x==3)
        {
            liga="bronze2";
            y=500;
        }
        if(x==4)
        {
            liga="bronze1";
            y=600;
        }
        if(x==5)
        {
            liga="prata3";
            y=800;
        }
        if(x==6)
        {
            liga="prata2";
            y=1000;
        }
        if(x==7)
        {
            liga="prata1";
            y=1200;
        }
        if(x==8)
        {
            liga="ouro3";
            y=1400;
        }
        if(x==9)
        {
            liga="ouro2";
            y=1600;
        }
        if(x==10)
        {
            liga="ouro1";
            y=1800;
        }
        if(x==11)
        {
            liga="cristal3";
            y=2000;
        }
        if(x==12)
        {
            liga="cristal2";
            y=2200;
        }
        if(x==13)
        {
            liga="cristal1";
            y=2400;
        }
        if(x==14)
        {
            liga="master3";
            y=2600;
        }
        if(x==15)
        {
            liga="master2";
            y=2800;
        }
        if(x==16)
        {
            liga="master1";
            y=3000;
        }
        if(x==17)
        {
            liga="campeao3";
            y=3200;
        }
        if(x==18)
        {
            liga="campeao2";
            y=3500;
        }
        if(x==19)
        {
            liga="campeao1";
            y=3800;
        }
        if(x==20)
        {
            liga="tita3";
            y=4100;
        }
        if(x==21)
        {
            liga="tita2";
            y=4400;
        }
        if(x==22)
        {
            liga="tita1";
            y=4700;
        }
        if(x==23)
        {
            liga="lendaria";
            y=5000;
        }
        if(x>23)
        {
            liga="fantasma";
            x=1;
            y=0;
        }
        Imagem();
    }
            
    private void UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpActionPerformed
        //OK
        if(x>23)
        {
            x=1;
        }
        else
        {
            x++;
        }
        buscaImg();
    }//GEN-LAST:event_UpActionPerformed

    private void DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownActionPerformed
        //OK
        if(x==1)
        {
            x=23;
        }
        else
        {
            x--;
        }
        buscaImg();
    }//GEN-LAST:event_DownActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        ///CALCULA
        calcula();
    }//GEN-LAST:event_okActionPerformed
    
    public void calcula()
    {
        String txt;
        int valor;  //digito
        int zz;     //zz=informo-banco
        progresso = 0;
        
        valor = Integer.parseInt(telaX.getText());
        zz=valor-y;
        
        if(zz>=0)
        {
            progresso=100;
            txt = "Concluído";
        }
        else
        {
            progresso=valor*100/y;
            zz=zz*-1;
            txt = Integer.toString(zz);
        }
        
        barra.setValue (progresso);
        barra.setStringPainted (true);
        trofeusfalta.setText(txt);
    }
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        Download d = new Download();
        d.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button2ActionPerformed
    {//GEN-HEADEREND:event_button2ActionPerformed
        int yy=0;
        String txt;
        yy = Integer.parseInt(telaX.getText()) + 1;
        txt = Integer.toString(yy);
        telaX.setText("");
        telaX.setText(txt);
        calcula();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button3ActionPerformed
    {//GEN-HEADEREND:event_button3ActionPerformed
        if(Integer.parseInt(telaX.getText())!=0)
        {
            int yy=0;
            String txt;
            yy = Integer.parseInt(telaX.getText()) - 1;
            txt = Integer.toString(yy);
            telaX.setText("");
            telaX.setText(txt);
            calcula();
        }
    }//GEN-LAST:event_button3ActionPerformed
    
    public static void main(String args[])
    {        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Down;
    private javax.swing.JLabel ImagLiga;
    private java.awt.Button Up;
    private javax.swing.JProgressBar barra;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JSlider jSlider1;
    private java.awt.Label label2;
    private java.awt.Button ok;
    private java.awt.TextField telaX;
    private java.awt.Label trofeusfalta;
    // End of variables declaration//GEN-END:variables
}