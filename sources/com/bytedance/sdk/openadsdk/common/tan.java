package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class tan extends Dialog {
    private static final String[] lr = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private ImageView di;
    private Button fi;
    private String ik;
    private TextView ka;
    private final Handler ri;

    public tan(Context context) {
        super(context, uq.di(context, "tt_privacy_dialog_theme_ad_report"));
        this.ri = new Handler(Looper.getMainLooper());
        this.ik = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ri(getContext()), new ViewGroup.LayoutParams(qd.ik(getContext()), (int) (((double) qd.fi(getContext())) * 0.9d)));
        lr();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.ri.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tan.3
                @Override // java.lang.Runnable
                public void run() {
                    tan.this.ka.setText(tan.this.ik);
                }
            }, 1000L);
        } catch (Exception e) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    private void lr() {
        final String strDi = ig.di();
        final String strMj = ig.mj();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tan.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) tan.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strDi, strMj, str, str2, tan.this.ik};
                    for (int i = 0; i < tan.lr.length; i++) {
                        sb.append(tan.lr[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tan.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tan.this.ka.setText("loading ...");
                tan.this.cancel();
            }
        });
    }

    public void ri(wjv wjvVar) {
        try {
            this.ik = com.bytedance.sdk.component.utils.ri.ri(wjvVar.iq()).toString();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTPrivacyAdReportDialog", th.getMessage());
        }
    }

    private View ri(Context context) {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fiVar.setBackground(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_ad_report_info_bg"));
        fiVar.setOrientation(1);
        fiVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(context);
        xhaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, ri(44.0f)));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ri(191.0f), ri(24.0f));
        layoutParams2.addRule(13);
        mjVar.setGravity(17);
        mjVar.setText("Ad Report");
        mjVar.setTextColor(Color.parseColor("#161823"));
        mjVar.setTextSize(1, 17.0f);
        mjVar.setLayoutParams(layoutParams2);
        this.di = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ri(40.0f), ri(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = ri(8.0f);
        this.di.setPadding(ri(12.0f), ri(14.0f), ri(12.0f), ri(14.0f));
        this.di.setImageResource(uq.ka(context, "tt_ad_xmark"));
        this.di.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, ri(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = ri(16.0f);
        layoutParams5.rightMargin = ri(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(ri(16.0f));
        layoutParams5.setMarginEnd(ri(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        fiVar2.setOrientation(1);
        fiVar2.setLayoutParams(layoutParams6);
        String strDi = ig.di();
        String strMj = ig.mj();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi = ri(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi2 = ri(context, "App", strDi);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi3 = ri(context, "App version", strMj);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi4 = ri(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi5 = ri(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi6 = ri(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.di.fi fiVar3 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, ri(76.0f));
        fiVar3.setBackgroundColor(-1);
        fiVar3.setLayoutParams(layoutParams7);
        this.fi = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iRi = ri(16.0f);
        layoutParams8.setMargins(iRi, iRi, iRi, iRi);
        this.fi.setBackground(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_ad_report_info_button_bg"));
        this.fi.setText("copy all");
        this.fi.setTextColor(Color.parseColor("#333333"));
        this.fi.setTextSize(14.0f);
        this.fi.setLayoutParams(layoutParams8);
        fiVar.addView(xhaVar);
        xhaVar.addView(mjVar);
        xhaVar.addView(this.di);
        fiVar.addView(view);
        fiVar.addView(scrollView);
        scrollView.addView(fiVar2);
        fiVar2.addView(fiVarRi);
        fiVar2.addView(fiVarRi2);
        fiVar2.addView(fiVarRi3);
        fiVar2.addView(fiVarRi4);
        fiVar2.addView(fiVarRi5);
        fiVar2.addView(fiVarRi6);
        fiVar.addView(fiVar3);
        fiVar3.addView(this.fi);
        return fiVar;
    }

    private com.bytedance.sdk.openadsdk.core.di.fi ri(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : ri(74.0f));
        fiVar.setOrientation(1);
        fiVar.setPadding(0, ri(16.0f), 0, ri(16.0f));
        fiVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = ri(7.0f);
        mjVar.setIncludeFontPadding(false);
        mjVar.setText(str);
        mjVar.setTextColor(Color.parseColor("#333333"));
        mjVar.setTextSize(16.0f);
        mjVar.setTypeface(Typeface.defaultFromStyle(1));
        mjVar.setLayoutParams(layoutParams2);
        fiVar.addView(mjVar);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        if (str.equals("Creative info")) {
            this.ka = mjVar2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        mjVar2.setIncludeFontPadding(false);
        mjVar2.setTextColor(Color.parseColor("#666666"));
        mjVar2.setText(str2);
        mjVar2.setTextSize(14.0f);
        mjVar2.setLayoutParams(layoutParams3);
        fiVar.addView(mjVar2);
        return fiVar;
    }

    private int ri(float f) {
        return qd.lr(getContext(), f);
    }
}
