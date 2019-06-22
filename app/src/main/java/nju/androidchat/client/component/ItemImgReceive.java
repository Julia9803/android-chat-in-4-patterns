package nju.androidchat.client.component;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import androidx.annotation.StyleableRes;

import java.util.UUID;

import nju.androidchat.client.R;

public class ItemImgReceive extends LinearLayout {


    @StyleableRes
    int index0 = 0;

    private ImageView imageView;
    private Context context;
    private UUID messageId;
    private String url;
    private OnRecallMessageRequested onRecallMessageRequested;


    public ItemImgReceive(Context context, String img, UUID messageId) {
        super(context);
        this.context = context;
        inflate(context, R.layout.item_img_receive, this);
        this.imageView = findViewById(R.id.chat_item_content_img);
        this.messageId = messageId;
        setImg(img);
    }

    public void init(Context context) {

    }

    public String getImg() {
        return this.url;
    }

    public void setImg(String img) {
        this.url = img;
        Glide.with(context).load(url).into(this.imageView);
    }
}
