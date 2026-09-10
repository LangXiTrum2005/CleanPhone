package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends Dialog {
    private String JVA;
    private com.bytedance.sdk.openadsdk.core.JXs.Lxb JXs;
    private com.bytedance.sdk.openadsdk.core.JXs.ZU LD;
    public Lxb Lxb;
    private int NXR;
    private final Context OY;
    private String QAg;
    private boolean STP;
    private com.bytedance.sdk.openadsdk.core.JXs.OY ZU;
    private View ebl;
    private com.bytedance.sdk.openadsdk.core.JXs.Lxb lc;
    private com.bytedance.sdk.openadsdk.core.JXs.OY lk;
    private String nBu;
    private String sLN;

    public interface Lxb {
        void LD();

        void Lxb();
    }

    public LD(Context context) {
        super(context, com.bytedance.sdk.component.utils.tD.lc(context, "tt_custom_dialog"));
        this.NXR = -1;
        this.STP = false;
        this.OY = context;
    }

    private void LD() {
        if (TextUtils.isEmpty(this.nBu)) {
            this.lk.setVisibility(8);
        } else {
            this.lk.setText(this.nBu);
            this.lk.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.QAg)) {
            this.ZU.setText(this.QAg);
        }
        if (TextUtils.isEmpty(this.JVA)) {
            this.lc.setText(com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), "tt_postive_txt"));
        } else {
            this.lc.setText(this.JVA);
        }
        if (TextUtils.isEmpty(this.sLN)) {
            this.JXs.setText(com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), "tt_negtive_txt"));
        } else {
            this.JXs.setText(this.sLN);
        }
        int i = this.NXR;
        if (i != -1) {
            this.LD.setImageResource(i);
            this.LD.setVisibility(0);
        } else {
            this.LD.setVisibility(8);
        }
        if (this.STP) {
            this.ebl.setVisibility(8);
            this.JXs.setVisibility(8);
        } else {
            this.JXs.setVisibility(0);
            this.ebl.setVisibility(0);
        }
    }

    private void Lxb() {
        this.lc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.LD.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Lxb lxb = LD.this.Lxb;
                if (lxb != null) {
                    lxb.Lxb();
                }
            }
        });
        this.JXs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.LD.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Lxb lxb = LD.this.Lxb;
                if (lxb != null) {
                    lxb.LD();
                }
            }
        });
    }

    public LD lk(String str) {
        this.sLN = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Lxb(this.OY));
        setCanceledOnTouchOutside(false);
        LD();
        Lxb();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        LD();
    }

    private View Lxb(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        eblVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        jXs.setMinimumWidth(Lxb(260.0f));
        jXs.setPadding(0, Lxb(32.0f), 0, 0);
        jXs.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_custom_dialog_bg"));
        jXs.setOrientation(1);
        jXs.setLayoutParams(layoutParams);
        this.lk = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = Lxb(16.0f);
        layoutParams2.rightMargin = Lxb(16.0f);
        layoutParams2.bottomMargin = Lxb(16.0f);
        this.lk.setGravity(17);
        this.lk.setVisibility(0);
        this.lk.setTextColor(Color.parseColor("#333333"));
        this.lk.setTextSize(18.0f);
        this.lk.setLayoutParams(layoutParams2);
        this.LD = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = Lxb(16.0f);
        layoutParams3.rightMargin = Lxb(16.0f);
        layoutParams3.bottomMargin = Lxb(10.0f);
        this.LD.setMaxHeight(Lxb(150.0f));
        this.LD.setMaxWidth(Lxb(150.0f));
        this.LD.setVisibility(0);
        this.LD.setLayoutParams(layoutParams3);
        this.ZU = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = Lxb(20.0f);
        layoutParams4.rightMargin = Lxb(20.0f);
        this.ZU.setGravity(17);
        this.ZU.setLineSpacing(Lxb(3.0f), 1.2f);
        this.ZU.setTextSize(18.0f);
        this.ZU.setTextColor(Color.parseColor("#000000"));
        this.ZU.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = Lxb(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        jXs2.setOrientation(0);
        jXs2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.JXs.Lxb lxb = new com.bytedance.sdk.openadsdk.core.JXs.Lxb(context);
        this.JXs = lxb;
        lxb.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = Lxb(10.0f);
        layoutParams7.weight = 1.0f;
        this.JXs.setPadding(0, Lxb(16.0f), 0, Lxb(16.0f));
        this.JXs.setBackground(null);
        this.JXs.setGravity(17);
        this.JXs.setSingleLine(true);
        this.JXs.setTextColor(Color.parseColor("#999999"));
        this.JXs.setTextSize(16.0f);
        this.JXs.setLayoutParams(layoutParams7);
        this.ebl = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.ebl.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.ebl.setLayoutParams(layoutParams8);
        this.lc = new com.bytedance.sdk.openadsdk.core.JXs.Lxb(context);
        this.JXs.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = Lxb(10.0f);
        layoutParams9.weight = 1.0f;
        this.lc.setPadding(0, Lxb(16.0f), 0, Lxb(16.0f));
        this.lc.setBackground(null);
        this.lc.setGravity(17);
        this.lc.setSingleLine(true);
        this.lc.setTextColor(Color.parseColor("#38ADFF"));
        this.lc.setTextSize(16.0f);
        this.lc.setLayoutParams(layoutParams9);
        eblVar.addView(jXs);
        jXs.addView(this.lk);
        jXs.addView(this.LD);
        jXs.addView(this.ZU);
        jXs.addView(view);
        jXs.addView(jXs2);
        jXs2.addView(this.JXs);
        jXs2.addView(this.ebl);
        jXs2.addView(this.lc);
        return eblVar;
    }

    public LD LD(String str) {
        this.JVA = str;
        return this;
    }

    private int Lxb(float f) {
        return le.lk(getContext(), f);
    }

    public LD Lxb(Lxb lxb) {
        this.Lxb = lxb;
        return this;
    }

    public LD Lxb(String str) {
        this.QAg = str;
        return this;
    }
}
