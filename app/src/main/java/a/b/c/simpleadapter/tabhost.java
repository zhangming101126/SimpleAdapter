package a.b.c.simpleadapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;

/**
 * Created by Zhangming on 2018/11/26 0026 2:13
 * Company kknn
 * Package Name: a.b.c.simpleadapter
 *
 * @description
 */
public class tabhost extends AppCompatActivity{
   
   
   private TabHost mTabhost;
   private TabWidget mTabs;
   private LinearLayout mWidgetLayoutRed;
   private LinearLayout mWidgetLayoutGreen;
   private LinearLayout mWidgetLayoutBlue;
   private FrameLayout mTabcontent;
   
   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.tabhostlayout);
      initView();
      
      // 从TabActivity上面获取放置Tab的TabHost
      
      // 添加第一个标签
      TabHost.TabSpec tab1=mTabhost.newTabSpec("0");
      tab1.setIndicator("红色");
      tab1.setContent(R.id.widget_layout_red);
      mTabhost.addTab(tab1);
      
      // 添加第二个标签
      mTabhost.addTab(mTabhost
                              // 创建新标签
                              .newTabSpec("1")
                              // 设置标签标题
                              .setIndicator("绿色")
                              // 设置该标签的布局内容
                              .setContent(R.id.widget_layout_green));
      
      // 添加第三个标签
      mTabhost.addTab(mTabhost.newTabSpec("2")
                              .setIndicator("蓝色")
                              .setContent(R.id.widget_layout_blue));
      
   }
   
   
   
   private void initView()
   {
      mTabhost=(TabHost)findViewById(R.id.tabhost11);

   }
   

}
