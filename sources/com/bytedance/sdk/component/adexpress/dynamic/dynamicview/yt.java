package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class yt extends mo {
    private TextView aaj;
    private TextView jyq;
    private LinearLayout ljh;
    private TextView oth;
    private TextView qdl;
    private TextView ud;

    public yt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.qdl = new TextView(this.rq);
        this.ud = new TextView(this.rq);
        this.aaj = new TextView(this.rq);
        this.ljh = new LinearLayout(this.rq);
        this.jyq = new TextView(this.rq);
        this.oth = new TextView(this.rq);
        this.qdl.setTag(9);
        this.ud.setTag(10);
        this.aaj.setTag(12);
        this.ljh.addView(this.aaj);
        this.ljh.addView(this.oth);
        this.ljh.addView(this.ud);
        this.ljh.addView(this.jyq);
        this.ljh.addView(this.qdl);
        addView(this.ljh, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.wd, this.jpc);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public boolean mml() {
        this.qdl.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.qdl.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.ud.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ud.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.aaj.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.aaj.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        this.aaj.setText("Function");
        this.ud.setText("Permission list");
        this.jyq.setText(" | ");
        this.oth.setText(" | ");
        this.qdl.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = this.fs;
        if (wdVar != null) {
            this.aaj.setTextColor(wdVar.wd());
            this.aaj.setTextSize(this.fs.mzz());
            this.ud.setTextColor(this.fs.wd());
            this.ud.setTextSize(this.fs.mzz());
            this.jyq.setTextColor(this.fs.wd());
            this.oth.setTextColor(this.fs.wd());
            this.qdl.setTextColor(this.fs.wd());
            this.qdl.setTextSize(this.fs.mzz());
            return false;
        }
        this.aaj.setTextColor(-1);
        this.aaj.setTextSize(12.0f);
        this.ud.setTextColor(-1);
        this.ud.setTextSize(12.0f);
        this.jyq.setTextColor(-1);
        this.oth.setTextColor(-1);
        this.qdl.setTextColor(-1);
        this.qdl.setTextSize(12.0f);
        return false;
    }
}
