package com.smartdigimkt.expressad.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        b();
    }

    private View a() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    private void b() {
        setOrientation(0);
        int iA = v.a(getContext(), 10.0f);
        setPadding(0, iA, 0, iA);
        ImageView imageView = (ImageView) a();
        imageView.setTag("backward");
        imageView.setImageDrawable(getResources().getDrawable(k.a(getContext(), "sdm_expressad_backward", k.d)));
        addView(imageView);
        ImageView imageView2 = (ImageView) a();
        imageView2.setTag("forward");
        imageView2.setImageDrawable(getResources().getDrawable(k.a(getContext(), "sdm_expressad_forward", k.d)));
        addView(imageView2);
        ImageView imageView3 = (ImageView) a();
        imageView3.setTag("refresh");
        imageView3.setImageDrawable(getResources().getDrawable(k.a(getContext(), "sdm_expressad_refresh", k.d)));
        addView(imageView3);
        ImageView imageView4 = (ImageView) a();
        imageView4.setTag("exits");
        imageView4.setImageDrawable(getResources().getDrawable(k.a(getContext(), "sdm_expressad_exits", k.d)));
        addView(imageView4);
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setOnClickListener(onClickListener);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
