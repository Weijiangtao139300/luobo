package weijiangtao.bwie.com.luobo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] inage={"http://i02.pictn.sogoucdn.com/1651ce2254cf6b73","http://i02.pictn.sogoucdn.com/4933f75c403d8cee"
    ,"http://i03.pictn.sogoucdn.com/478917880bf94a59","http://i04.pictn.sogoucdn.com/736140b4553c1c0b"};
    
    private List<String> list=new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner banner = (Banner) findViewById(R.id.banner);
        //设置图片加载器
        banner.setImageLoader(new haha());
        //设置图片集合

        list.add("http://i02.pictn.sogoucdn.com/1651ce2254cf6b73");
        list.add("http://i02.pictn.sogoucdn.com/4933f75c403d8cee");
        list.add("http://i03.pictn.sogoucdn.com/478917880bf94a59");
        list.add("http://i04.pictn.sogoucdn.com/736140b4553c1c0b");
        
        
        
        banner.setImages(list);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
        
        
    }
}
