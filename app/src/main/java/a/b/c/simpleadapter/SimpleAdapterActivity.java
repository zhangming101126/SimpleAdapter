package a.b.c.simpleadapter;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterActivity extends AppCompatActivity
{
   
   private ListView mLv1;
   
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.simpleadapterlayout);
      initView();
      SimpleAdapter adapter=new SimpleAdapter(this, getdata(), R.layout.simpleadapter_item, new String[]{ "img",
              "title", "info" }, new int[]{ R.id.icon_img, R.id.title_tv, R.id.info_tv });
   
      mLv1.setAdapter(adapter);
      mLv1.setOnItemClickListener(new aaa());
   }
   
   private List<? extends Map<String,?>> getdata()
   {
      List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
      Map<String,Object> map=new HashMap<String,Object>();
      map.put("img", R.drawable.a1);
      map.put("title", "小宗");
      map.put("info", "电台DJ");
      list.add(map);
   
      map = new HashMap<String, Object>();
      map.put("img", R.drawable.a2);
      map.put("title", "貂蝉");
      map.put("info", "四大美女");
      list.add(map);
   
      map = new HashMap<String, Object>();
      map.put("img", R.drawable.a3);
      map.put("title", "奶茶");
      map.put("info", "清纯妹妹");
      list.add(map);
   
      map = new HashMap<String, Object>();
      map.put("img", R.drawable.a4);
      map.put("title", "大黄");
      map.put("info", "是小狗");
      list.add(map);
   
      map = new HashMap<String, Object>();
      map.put("img", R.drawable.a5);
      map.put("title", "hello");
      map.put("info", "every thing");
      list.add(map);
   
      map = new HashMap<String, Object>();
      map.put("img", R.drawable.a6);
      map.put("title", "world");
      map.put("info", "hello world");
      list.add(map);
   
      return list;

   }
   
   private void initView()
   {
      mLv1=(ListView)findViewById(R.id.lv1);
   }
   
   private class aaa implements android.widget.AdapterView.OnItemClickListener
   {
   
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id)
      {
         HashMap<String,Object> map=(HashMap<String,Object>)parent.getItemAtPosition(position);
   
         String txt=(String)map.get("title");
//         Toast.makeText(SimpleAdapterActivity.this, txt, Toast.LENGTH_SHORT).show();
   
         AlertDialog.Builder builder= new AlertDialog.Builder(SimpleAdapterActivity.this);
         builder.setTitle("提示").setMessage(txt).create().show();
   

         
      }
   }
}
