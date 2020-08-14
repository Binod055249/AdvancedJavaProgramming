package com.example.advancedjavaprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AbstractClasses extends AppCompatActivity {

  private TextView txtDesktopComputer,txtDesktopComputerPerformance,txtLaptopComputer,txtLaptopComputerPerformance,
    txtSmartPhoneComputer,txtSmartPhoneComputerPerformance,txtTabletComputer,txtTabletComputerPerformance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_classes);

        txtDesktopComputer=findViewById(R.id.txtDesktopComputer);
        txtDesktopComputerPerformance=findViewById(R.id.txtDesktopComputerPerformance);

        txtLaptopComputer=findViewById(R.id.txtLaptopComputer);
        txtLaptopComputerPerformance=findViewById(R.id.txtLaptopComputerPerformance);

        txtSmartPhoneComputer=findViewById(R.id.txtSmartPhoneComputer);
        txtSmartPhoneComputerPerformance=findViewById(R.id.txtSmartPhoneComputerPerformance);

        txtTabletComputer=findViewById(R.id.txtTabletComputer);
        txtTabletComputerPerformance=findViewById(R.id.txtTabletComputerPerformance);

        DesktopComputerAbstractClass desktopComputerAbstractClass=new DesktopComputerAbstractClass("iMac",
                "HighQuality Screen","Physical keyboard","Physical mouse",200,1000);
        LaptopComputerAbstractClass laptopComputerAbstractClass=new LaptopComputerAbstractClass("MacBookPro",
                "High quality screen","physical keybord","Physical mouse","High quality Touch Pad",
                2000,1500);

         SmartPhoneComputerAbstractClass smartPhoneComputerAbstractClass=new SmartPhoneComputerAbstractClass("iPhone6s",
                 "Retina Screen","Virtual Keyboard","iOS",500,400);

         TabletComputerAbstractClass tabletComputerAbstractClass=new TabletComputerAbstractClass("iPad",
                 "Retina Screen","Virtual Keyboard","iOS",800,700,10);

         txtDesktopComputerPerformance.setText("Performance: "+desktopComputerAbstractClass.evaluatePerformance()+"\n");
         txtLaptopComputerPerformance.setText("Performance: "+laptopComputerAbstractClass.evaluatePerformance()+"\n");
         txtSmartPhoneComputerPerformance.setText("Performance: "+smartPhoneComputerAbstractClass.evaluatePerformance()+"\n");
         txtTabletComputerPerformance.setText("Performance: "+tabletComputerAbstractClass.evaluatePerformance()+"\n");

         ComputerAbstractClass[] computerAbstractClasses=new ComputerAbstractClass[4];
         computerAbstractClasses[0]=desktopComputerAbstractClass;
         computerAbstractClasses[1]=laptopComputerAbstractClass;
         computerAbstractClasses[2]=smartPhoneComputerAbstractClass;
         computerAbstractClasses[3]=tabletComputerAbstractClass;

         for (ComputerAbstractClass computerAbstractClass:computerAbstractClasses){

             if(computerAbstractClass instanceof DesktopComputerAbstractClass){
                 DesktopComputerAbstractClass currentDesktopComputer=(DesktopComputerAbstractClass) computerAbstractClass;
                 txtDesktopComputer.setText(currentDesktopComputer.toString());
             }
             if(computerAbstractClass instanceof LaptopComputerAbstractClass){
                 LaptopComputerAbstractClass currentLaptopComputer=(LaptopComputerAbstractClass) computerAbstractClass;
                 txtLaptopComputer.setText(currentLaptopComputer.toString());
             }
             if(computerAbstractClass instanceof SmartPhoneComputerAbstractClass){
                 if(!(computerAbstractClass instanceof TabletComputerAbstractClass )){
                 SmartPhoneComputerAbstractClass currentSmartPhoneComputer=(SmartPhoneComputerAbstractClass) computerAbstractClass;
                 txtSmartPhoneComputer.setText(currentSmartPhoneComputer.toString());
             }
              }
             if(computerAbstractClass instanceof TabletComputerAbstractClass){
                 TabletComputerAbstractClass currentTabletComputer=(TabletComputerAbstractClass) computerAbstractClass;
                 txtTabletComputer.setText(currentTabletComputer.toString());
             }
         }

    }
}