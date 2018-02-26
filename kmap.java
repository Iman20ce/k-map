import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
public class kmap extends JFrame  {
 
 static String output="";
 static int A[][]=new int[4][4];
 static int checked[][]=new int[4][4];
 static int val[]=new int[16];
 JLabel label[]=new JLabel[10];
 JButton btn[]=new JButton[16];
 JPanel tbl;
 JLabel txt;
 JButton compute,reset;
 public kmap()
 {
  JFrame f =new JFrame();
  f.setTitle("KARNAUGH MAP IN SOP:-");
  f.setSize(600, 600);
  f.setVisible(true);
  f.setLocation(300,50);
  f.setDefaultCloseOperation(EXIT_ON_CLOSE);
  f.setResizable(false);
  f.setLayout(null);
  tbl=new JPanel();
  txt=new JLabel();
  tbl.setBounds(150, 40, 400, 400);                                            
  tbl.setBackground(Color.GRAY);
  
  txt.setBounds(0,500,500,100);
  txt.setBackground(Color.BLACK);
  //ading button in tbl
  tbl.setLayout(new GridLayout(4,4));
 
  for(int i=0;i<16;i++)
  {
   btn[i]=new JButton();
   btn[i].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
  tbl.add(btn[i]);
   tbl.validate();
   val[i]=2;
  }
  //
  label[0]=new JLabel("A'B'");
  label[0].setBounds(130,30,30,75);
  f.add(label[0]);
  label[1]=new JLabel("A'B");
  label[1].setBounds(130,120,30,75);
  f.add(label[1]);
  label[2]=new JLabel("AB");
  label[2].setBounds(130,210,30,75);
  f.add(label[2]); 
  label[3]=new JLabel("AB'");
  label[3].setBounds(130,300,30,75);
  f.add(label[3]);
  label[4]=new JLabel("C'D'");
  label[4].setBounds(200,0,80,30);
  f.add(label[4]);
  label[5]=new JLabel("C'D");
  label[5].setBounds(200,0,80,30);
  f.add(label[5]);
  label[6]=new JLabel("CD");
  label[6].setBounds(200,0,80,30);
  f.add(label[6]);
  label[7]=new JLabel("CD'");
  label[7].setBounds(200,0,80,30);
  f.add(label[7]);
  f.validate();
  //
  //button dading
  
 // f.add(button);
  compute=new JButton("COMPUTE");
  compute.setBounds(10, 100, 100, 50);
  f.add(compute);
  //compute.setIcon(new ImageIcon("compute.png"));
  reset=new JButton("RESET");
  reset.setBounds(10, 170, 100, 50);
  f.add(reset);
  f.add(tbl);
  compute.validate();
  reset.validate();
  f.add(txt);
  f.validate();
  //zero - one change change over
  btn[0].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
    val[0]++;
    val[0]%=3;
    //txt.settxt("val of btn[0]"+val[0]);
    if(val[0]==0)
    {
     btn[0].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[0]==1)
    {
     btn[0].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[0]==2)
    {
     btn[0].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  
  btn[1].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
    val[1]++;
    val[1]%=3;
    //txt.settxt("val of btn[0]"+val[0]);
    if(val[1]==0)
    {
     btn[1].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[1]==1)
    {
     btn[1].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[1]==2)
    {
     btn[1].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });

  btn[2].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[2]++;
    val[2]%=3;
   if(val[2]==0)
    {
     btn[2].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[2]==1)
    {
     btn[2].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[2]==2)
    {
     btn[2].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[3].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[3]++;
    val[3]%=3;
    if(val[3]==0)
    {
     btn[3].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[3]==1)
    {
     btn[3].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[3]==2)
    {
     btn[3].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[4].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[4]++;
    val[4]%=3;
    if(val[4]==0)
    {
     btn[4].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[4]==1)
    {
     btn[4].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[4]==2)
    {
     btn[4].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[5].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[5]++;
    val[5]%=3;
    if(val[5]==0)
    {
     btn[5].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[5]==1)
    {
     btn[5].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[5]==2)
    {
     btn[5].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[6].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[6]++;
    val[6]%=3;
   if(val[6]==0)
    {
     btn[6].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[6]==1)
    {
     btn[6].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[6]==2)
    {
     btn[6].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[7].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[7]++;
    val[7]%=3;
   if(val[7]==0)
    {
     btn[7].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[7]==1)
    {
     btn[7].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[7]==2)
    {
     btn[7].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[8].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[8]++;
    val[8]%=3;
    if(val[8]==0)
    {
     btn[8].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[8]==1)
    {
     btn[8].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[8]==2)
    {
     btn[8].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[9].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[9]++;
    val[9]%=3;
    if(val[9]==0)
    {
     btn[9].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[9]==1)
    {
     btn[9].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[9]==2)
    {
     btn[9].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[10].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[10]++;
    val[10]%=3;
    if(val[10]==0)
    {
     btn[10].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[10]==1)
    {
     btn[10].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[10]==2)
    {
     btn[10].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[11].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[11]++;
    val[11]%=3;
    if(val[11]==0)
    {
     btn[11].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[11]==1)
    {
     btn[11].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[11]==2)
    {
     btn[11].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[12].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[12]++;
    val[12]%=3;
   if(val[12]==0)
    {
     btn[12].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[12]==1)
    {
     btn[12].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[12]==2)
    {
     btn[12].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[13].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[13]++;
    val[13]%=3;
    if(val[13]==0)
    {
     btn[13].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[13]==1)
    {
     btn[13].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[13]==2)
    {
     btn[13].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[14].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[14]++;
    val[14]%=3;
    if(val[14]==0)
    {
     btn[14].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[14]==1)
    {
     btn[14].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[14]==2)
    {
     btn[14].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  btn[15].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    val[15]++;
    val[15]%=3;
    if(val[15]==0)
    {
     btn[15].setIcon(new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[15]==1)
    {
     btn[15].setIcon(new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
    if(val[15]==2)
    {
     btn[15].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }
   }
  });
  //reset
  reset.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    txt.setText("");
    output="";
   
    for(int i=0;i<16;i++)
    {
     btn[i].setIcon(new ImageIcon(((new ImageIcon("x.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
     val[i]=2;
    }
   }
  });
  //compute
  compute.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
    compute();
    txt.setText("");
  
    txt.setText("SOP="+output.substring(1));
    
   }
  });
 }
 //end of constructor
 //compute Algorithm for K-MAP
 static void compute()
 {
  initialize();
  // algo bigins
  
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<4;j++)
   {
    if(A[i][j]==1&&checked[i][j]==0)
    {
     int pass8=check8(i,j);
     if(pass8==0)
     {
      int pass4=check4(i,j);
      if(pass4==0)
      {
       int pass2=check2(i,j);
       if(pass2==0)
       {
        nogrouping(i,j);
       }
      }
     }
    }
   }
  }
  
 }
 //algo ends
 //function for checking 8
 /*static int check16(int r,int c)
 {
  int result = 0;
  if(A[0][0]==1 && A[0][1]==1 && A[0][2]==1 && A[0][3]==1 && A[1][0]==1 && A[1][1]==1 && A[1][2]==1 && A[1][3]==1 && A[2][0]==1 && A[2][1]==1 && A[2][2]==1 && A[2][3]==1
      && A[3][0]==1 && A[3][1]==1 && A[3][2]==1 && A[3][3]==1); 
      String local=""; 
  {
      local="1";
  }
  output = output+"+"+local;
  result = 1;

  checked[0][0] = 1; checked[0][1] = 1; checked[0][2] = 1; checked[0][3] = 1;
  checked[1][0] = 1; checked[1][1] = 1; checked[1][2] = 1; checked[1][3] = 1;
  checked[2][0] = 1; checked[2][1] = 1; checked[2][2] = 1; checked[2][3] = 1;
  checked[3][0] = 1; checked[3][1] = 1; checked[3][2] = 1; checked[3][3] = 1;

  return result;
 }*/
 static int check8(int r,int c)
 {
  int result=0;
  //case1
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(r+1)%4][0]==1&&A[(r+1)%4][1]==1&&A[(r+1)%4][2]==1&&A[(r+1)%4][3]==1)
  {
   String local="";
   if(r==0)
   {
     local="A'";
   }
   if(r==1)
   {
     local="B";
   }
   if(r==2)
   {
     local="A";
   }
   if(r==3)
   {
     local="B'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
   checked[(r+1)%4][0]=1;checked[(r+1)%4][1]=1;checked[(r+1)%4][2]=1;checked[(r+1)%4][3]=1;
   // make it color
  // makecolor(r,c);
  }else
  //case2
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(4+(r-1))%4][0]==1&&A[(4+(r-1))%4][1]==1&&A[(4+(r-1))%4][2]==1&&A[(4+(r-1))%4][3]==1)
  {
   String local="";
   if(r==0)
   {
     local="B'";
   }
   if(r==1)
   {
     local="A'";
   }
   if(r==2)
   {
     local="B";
   }
   if(r==3)
   {
     local="A";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
   checked[(4+(r-1))%4][0]=1;checked[(4+(r-1))%4][1]=1;checked[(4+(r-1))%4][2]=1;checked[(4+(r-1))%4][3]=1;
  }else
  //case3
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(c+1)%4]==1&&A[1][(c+1)%4]==1&&A[2][(c+1)%4]==1&&A[3][(c+1)%4]==1)
  {
   String local="";
   if(c==0)
   {
     local="C'";
   }
   if(c==1)
   {
     local="D";
   }
   if(c==2)
   {
     local="C";
   }
   if(c==3)
   {
     local="D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
   checked[0][(c+1)%4]=1;checked[1][(c+1)%4]=1;checked[2][(c+1)%4]=1;checked[3][(c+1)%4]=1;
  }else
  //case 4
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(4+(c-1))%4]==1&&A[1][(4+(c-1))%4]==1&&A[2][(4+(c-1))%4]==1&&A[3][(4+(c-1))%4]==1)
  {
   String local="";
   if(c==0)
   {
     local="D'";
   }
   if(c==1)
   {
     local="C'";
   }
   if(c==2)
   {
     local="D";
   }
   if(c==3)
   {
     local="C";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
   checked[0][(4+(c-1))%4]=1;checked[1][(4+(c-1))%4]=1;checked[2][(4+(c-1))%4]=1;checked[3][(4+(c-1))%4]=1;
  }
  
  return result;
 }
 //ends of check8
 //check4 start
 static int check4(int r,int c)
 {
  int result=0;
  String local="";
  //case1
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
  }else
  //case2
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1)
  {
   if(c==0)
   {
    local="C'D'";
   }
   if(c==1)
   {
    local="C'D";
   }
   if(c==2)
   {
    local="CD";
   }
   if(c==3)
   {
    local="CD'";
    
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
  }else
  //case3 row+ col+
  if(A[r][c]==1&&A[r][(c+1)%4]==1&&A[(r+1)%4][c]==1&&A[(r+1)%4][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[r][(c+1)%4]=1;checked[(r+1)%4][c]=1;checked[(r+1)%4][(c+1)%4]=1;
  }else
  //case4 row+ col--
  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1&&A[(r+1)%4][(4+(c-1))%4]==1&&A[(r+1)%4][c]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;checked[(r+1)%4][(4+(c-1))%4]=1;checked[(r+1)%4][c]=1;
   
  }else
  //case5 row - and col -
  if(A[(4+(r-1))%4][(4+(c-1))%4]==1&&A[(4+(r-1))%4][c]==1&&A[r][(4+(c-1))%4]==1&&A[r][c]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[(4+(r-1))%4][(4+(c-1))%4]=1;checked[(4+(r-1))%4][c]=1;checked[r][(4+(c-1))%4]=1;checked[r][c]=1;
  }else
  //case6 row- col+
  if(A[(4+(r-1))%4][c]==1&&A[(4+(r-1))%4][(c+1)%4]==1&&A[r][c]==1&&A[r][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[(4+(r-1))%4][c]=1;checked[(4+(r-1))%4][(c+1)%4]=1;checked[r][c]=1;checked[r][(c+1)%4]=1;
  }
  
  return result;
 }
 //check for 2 check2
 static int check2(int r,int c)
 {
  int result=0;
  String local="";
  //case 1 col++
  if(A[r][c]==1&&A[r][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[r][(c+1)%4]=1;
   
  }else
  //case 2 col--
  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;  
  }else
  //case3 row++
  if(A[r][c]==1&&A[(r+1)%4][c]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"C'D'";
   }
   if(c==1)
   {
    local=local+"C'D";
   }
   if(c==2)
   {
    local=local+"CD";
   }
   if(c==3)
   {
    local=local+"CD'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[(r+1)%4][c]=1;
   }else
  // case4 row--
  if(A[r][c]==1&&A[(4+(r-1))%4][c]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"C'D'";
   }
   if(c==1)
   {
    local=local+"C'D";
   }
   if(c==2)
   {
    local=local+"CD";
   }
   if(c==3)
   {
    local=local+"CD'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[(4+(r-1))%4][c]=1;
   }
  return result;
 }
 // no grouping
 static void nogrouping(int r, int c)
 {
  String local="";
  if(r==0)
  {
   local="A'B'";
  }
  if(r==1)
  {
   local="A'B";
  }
  if(r==2)
  {
   local="AB";
  }
  if(r==3)
  {
   local="AB'";
  }
  if(c==0)
  {
   local=local+"C'D'";
  }
  if(c==1)
  {
   local=local+"C'D";
  }
  if(c==2)
  {
   local=local+"CD";
  }
  if(c==3)
  {
   local=local+"CD'";
  }
  output=output+"+"+local;
  
  checked[r][c]=1;
 }
 
 // initialize 2D-Array
 static void initialize()
 {
  int count=0;
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<4;j++)
   {
    A[i][j]=val[count];
    checked[i][j]=0;
    count++;
   }
  }
 }
 //end of initialize
 
 
 
 public static void main(String args[])
 {
  kmap object =new kmap();
 }

}