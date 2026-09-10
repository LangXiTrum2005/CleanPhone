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
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class kqm extends Dialog {
    private static final String[] LD = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private Button JXs;
    private final Handler Lxb;
    private TextView ZU;
    private ImageView lc;
    private String lk;

    public kqm(@NonNull Context context) {
        super(context, tD.lc(context, "tt_privacy_dialog_theme_ad_report"));
        this.Lxb = new Handler(Looper.getMainLooper());
        this.lk = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Lxb(getContext()), new ViewGroup.LayoutParams(le.lk(getContext()), (int) (((double) le.ZU(getContext())) * 0.9d)));
        LD();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.Lxb.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.kqm.3
                @Override // java.lang.Runnable
                public void run() {
                    kqm.this.ZU.setText(kqm.this.lk);
                }
            }, 1000L);
        } catch (Exception e) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    private void LD() {
        final String strJXs = nJ.JXs();
        final String strEbl = nJ.ebl();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.JXs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.kqm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) kqm.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strJXs, strEbl, str, str2, kqm.this.lk};
                    for (int i = 0; i < kqm.LD.length; i++) {
                        sb.append(kqm.LD[i]);
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
        this.lc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.kqm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                kqm.this.ZU.setText("loading ...");
                kqm.this.cancel();
            }
        });
    }

    public void Lxb(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.lk = com.bytedance.sdk.component.utils.Lxb.Lxb(new JSONObject(str)).toString();
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTPrivacyAdReportDialog", e.getMessage());
        }
    }

    private View Lxb(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jXs.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_ad_report_info_bg"));
        jXs.setOrientation(1);
        jXs.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        eblVar.setLayoutParams(new ViewGroup.LayoutParams(-1, Lxb(44.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Lxb(191.0f), Lxb(24.0f));
        layoutParams2.addRule(13);
        oy.setGravity(17);
        oy.setText("Ad Report");
        oy.setTextColor(Color.parseColor("#161823"));
        oy.setTextSize(1, 17.0f);
        oy.setLayoutParams(layoutParams2);
        this.lc = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(Lxb(40.0f), Lxb(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = Lxb(8.0f);
        this.lc.setPadding(Lxb(12.0f), Lxb(14.0f), Lxb(12.0f), Lxb(14.0f));
        this.lc.setImageResource(tD.ZU(context, "tt_ad_xmark"));
        this.lc.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, Lxb(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = Lxb(16.0f);
        layoutParams5.rightMargin = Lxb(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(Lxb(16.0f));
        layoutParams5.setMarginEnd(Lxb(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        jXs2.setOrientation(1);
        jXs2.setLayoutParams(layoutParams6);
        String strJXs = nJ.JXs();
        String strEbl = nJ.ebl();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXsLxb = Lxb(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXsLxb2 = Lxb(context, "App", strJXs);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXsLxb3 = Lxb(context, "App version", strEbl);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXsLxb4 = Lxb(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXsLxb5 = Lxb(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXsLxb6 = Lxb(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs3 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, Lxb(76.0f));
        jXs3.setBackgroundColor(-1);
        jXs3.setLayoutParams(layoutParams7);
        this.JXs = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iLxb = Lxb(16.0f);
        layoutParams8.setMargins(iLxb, iLxb, iLxb, iLxb);
        this.JXs.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_ad_report_info_button_bg"));
        this.JXs.setText("copy all");
        this.JXs.setTextColor(Color.parseColor("#333333"));
        this.JXs.setTextSize(14.0f);
        this.JXs.setLayoutParams(layoutParams8);
        jXs.addView(eblVar);
        eblVar.addView(oy);
        eblVar.addView(this.lc);
        jXs.addView(view);
        jXs.addView(scrollView);
        scrollView.addView(jXs2);
        jXs2.addView(jXsLxb);
        jXs2.addView(jXsLxb2);
        jXs2.addView(jXsLxb3);
        jXs2.addView(jXsLxb4);
        jXs2.addView(jXsLxb5);
        jXs2.addView(jXsLxb6);
        jXs.addView(jXs3);
        jXs3.addView(this.JXs);
        return jXs;
    }

    private com.bytedance.sdk.openadsdk.core.JXs.JXs Lxb(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : Lxb(74.0f));
        jXs.setOrientation(1);
        jXs.setPadding(0, Lxb(16.0f), 0, Lxb(16.0f));
        jXs.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = Lxb(7.0f);
        oy.setIncludeFontPadding(false);
        oy.setText(str);
        oy.setTextColor(Color.parseColor("#333333"));
        oy.setTextSize(16.0f);
        oy.setTypeface(Typeface.defaultFromStyle(1));
        oy.setLayoutParams(layoutParams2);
        jXs.addView(oy);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        if (str.equals("Creative info")) {
            this.ZU = oy2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        oy2.setIncludeFontPadding(false);
        oy2.setTextColor(Color.parseColor("#666666"));
        oy2.setText(str2);
        oy2.setTextSize(14.0f);
        oy2.setLayoutParams(layoutParams3);
        jXs.addView(oy2);
        return jXs;
    }

    private int Lxb(float f) {
        return le.lk(getContext(), f);
    }
}
