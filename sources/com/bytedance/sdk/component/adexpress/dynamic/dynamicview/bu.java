package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class bu extends di {
    private TextView ac;
    private TextView ihz;
    private TextView lr;
    private TextView ri;
    private TextView uq;
    private LinearLayout wjv;

    public bu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.ri = new TextView(this.sf);
        this.lr = new TextView(this.sf);
        this.ac = new TextView(this.sf);
        this.wjv = new LinearLayout(this.sf);
        this.ihz = new TextView(this.sf);
        this.uq = new TextView(this.sf);
        this.ri.setTag(9);
        this.lr.setTag(10);
        this.ac.setTag(12);
        this.wjv.addView(this.ac);
        this.wjv.addView(this.uq);
        this.wjv.addView(this.lr);
        this.wjv.addView(this.ihz);
        this.wjv.addView(this.ri);
        addView(this.wjv, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.xha, this.mj);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        this.ac.setText("Function");
        this.lr.setText("Permission list");
        this.ihz.setText(" | ");
        this.uq.setText(" | ");
        this.ri.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar = this.f18035co;
        if (xhaVar != null) {
            this.ac.setTextColor(xhaVar.xha());
            this.ac.setTextSize(this.f18035co.fi());
            this.lr.setTextColor(this.f18035co.xha());
            this.lr.setTextSize(this.f18035co.fi());
            this.ihz.setTextColor(this.f18035co.xha());
            this.uq.setTextColor(this.f18035co.xha());
            this.ri.setTextColor(this.f18035co.xha());
            this.ri.setTextSize(this.f18035co.fi());
            return false;
        }
        this.ac.setTextColor(-1);
        this.ac.setTextSize(12.0f);
        this.lr.setTextColor(-1);
        this.lr.setTextSize(12.0f);
        this.ihz.setTextColor(-1);
        this.uq.setTextColor(-1);
        this.ri.setTextColor(-1);
        this.ri.setTextSize(12.0f);
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public boolean ka() {
        this.ri.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ri.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.lr.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.lr.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.ac.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ac.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }
}
