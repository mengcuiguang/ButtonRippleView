# ButtonRippleView
按钮内的波纹扩散

![image](https://github.com/mengcuiguang/ButtonRippleView/blob/master/test.gif )  

为什么写？

    最近项目上有需求，需要在按钮上添加波纹效果，到网上找了好多，几本都是用的系统5.0效果，而且还不能指定在 按钮范围内动画，重要的是，系统自带的波纹在5.0以下，不支持波纹效果.所有写了下面这个Demo，希望可以帮助到需要的同学。

使用方法：

    <com.meng.buttonrippleview.AnimationButton
        android:id="@+id/abt1"
        android:layout_marginTop="20dp"
        android:layout_marginLeft="10dp"
        android:layout_marginRight="10dp"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:text="波纹结束，吐司执行"
        android:layout_centerInParent="true"
        button:backGroundColor="#4d8c46"
        button:backGroundDownColor="#29801f"
        button:backGroundRoundColor="#669939"
        button:buttonTextColor="#eeeff1"
        button:backGroundRoundRx="40dp"
        button:backGroundRoundRy="40dp"
        android:textColor="#232323"/>
        
        
        
        
    AnimationButton abt1 = (AnimationButton) findViewById(R.id.abt1);
        abt1.setonClickAnimListener(new AnimationButton.ClickAnimListener() {
            @Override
            public void clickAnimComplete() {
                Toast.makeText(MainActivity.this, "波纹结束，我执行", Toast.LENGTH_SHORT).show();
            }
        });

