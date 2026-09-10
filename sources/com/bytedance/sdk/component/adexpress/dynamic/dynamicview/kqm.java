package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class kqm extends lc {
    private TextView DY;
    private TextView HD;
    private TextView LD;
    private TextView Lxb;
    private TextView Sfi;
    private LinearLayout eK;

    public kqm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.Lxb = new TextView(this.JVA);
        this.LD = new TextView(this.JVA);
        this.DY = new TextView(this.JVA);
        this.eK = new LinearLayout(this.JVA);
        this.Sfi = new TextView(this.JVA);
        this.HD = new TextView(this.JVA);
        this.Lxb.setTag(9);
        this.LD.setTag(10);
        this.DY.setTag(12);
        this.eK.addView(this.DY);
        this.eK.addView(this.HD);
        this.eK.addView(this.LD);
        this.eK.addView(this.Sfi);
        this.eK.addView(this.Lxb);
        addView(this.eK, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        this.DY.setText("Function");
        this.LD.setText("Permission list");
        this.Sfi.setText(" | ");
        this.HD.setText(" | ");
        this.Lxb.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar = this.sLN;
        if (eblVar != null) {
            this.DY.setTextColor(eblVar.ebl());
            this.DY.setTextSize(this.sLN.JXs());
            this.LD.setTextColor(this.sLN.ebl());
            this.LD.setTextSize(this.sLN.JXs());
            this.Sfi.setTextColor(this.sLN.ebl());
            this.HD.setTextColor(this.sLN.ebl());
            this.Lxb.setTextColor(this.sLN.ebl());
            this.Lxb.setTextSize(this.sLN.JXs());
            return false;
        }
        this.DY.setTextColor(-1);
        this.DY.setTextSize(12.0f);
        this.LD.setTextColor(-1);
        this.LD.setTextSize(12.0f);
        this.Sfi.setTextColor(-1);
        this.HD.setTextColor(-1);
        this.Lxb.setTextColor(-1);
        this.Lxb.setTextSize(12.0f);
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs
    public boolean ZU() {
        this.Lxb.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.Lxb.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.LD.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.LD.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.DY.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.DY.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.ebl, this.OY);
    }
}
