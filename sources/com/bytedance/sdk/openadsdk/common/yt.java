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
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class yt extends Dialog {
    private static final String[] ud = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private String lnr;
    private TextView mml;
    private ImageView mo;
    private Button mzz;
    private final Handler qdl;

    public yt(Context context) {
        super(context, ljh.mo(context, "tt_privacy_dialog_theme_ad_report"));
        this.qdl = new Handler(Looper.getMainLooper());
        this.lnr = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(qdl(getContext()), new ViewGroup.LayoutParams(ax.lnr(getContext()), (int) (((double) ax.mzz(getContext())) * 0.9d)));
        ud();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.qdl.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.yt.3
                @Override // java.lang.Runnable
                public void run() {
                    yt.this.mml.setText(yt.this.lnr);
                }
            }, 1000L);
        } catch (Exception e2) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e2);
        }
    }

    private void ud() {
        final String strMo = gy.mo();
        final String strJpc = gy.jpc();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.yt.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) yt.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strMo, strJpc, str, str2, yt.this.lnr};
                    for (int i2 = 0; i2 < yt.ud.length; i2++) {
                        sb.append(yt.ud[i2]);
                        sb.append(": ");
                        sb.append(strArr[i2]);
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.mo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.yt.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                yt.this.mml.setText("loading ...");
                yt.this.cancel();
            }
        });
    }

    public void qdl(String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        JSONObject jSONObjectUjt;
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObjectUjt = new JSONObject(str);
            } else {
                jSONObjectUjt = ljhVar.ujt();
            }
            this.lnr = com.bytedance.sdk.component.utils.qdl.qdl(jSONObjectUjt).toString();
        } catch (JSONException e2) {
            aaj.lnr("TTPrivacyAdReportDialog", e2.getMessage());
        }
    }

    private View qdl(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        mzzVar.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_ad_report_info_bg"));
        mzzVar.setOrientation(1);
        mzzVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, qdl(44.0f)));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(qdl(191.0f), qdl(24.0f));
        layoutParams2.addRule(13);
        jpcVar.setGravity(17);
        jpcVar.setText("Ad Report");
        jpcVar.setTextColor(Color.parseColor("#161823"));
        jpcVar.setTextSize(1, 17.0f);
        jpcVar.setLayoutParams(layoutParams2);
        this.mo = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(qdl(40.0f), qdl(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = qdl(8.0f);
        this.mo.setPadding(qdl(12.0f), qdl(14.0f), qdl(12.0f), qdl(14.0f));
        this.mo.setImageResource(ljh.mml(context, "tt_ad_xmark"));
        this.mo.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, qdl(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = qdl(16.0f);
        layoutParams5.rightMargin = qdl(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(qdl(16.0f));
        layoutParams5.setMarginEnd(qdl(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        mzzVar2.setOrientation(1);
        mzzVar2.setLayoutParams(layoutParams6);
        String strMo = gy.mo();
        String strJpc = gy.jpc();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVarQdl = qdl(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVarQdl2 = qdl(context, "App", strMo);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVarQdl3 = qdl(context, "App version", strJpc);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVarQdl4 = qdl(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVarQdl5 = qdl(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVarQdl6 = qdl(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, qdl(76.0f));
        mzzVar3.setBackgroundColor(-1);
        mzzVar3.setLayoutParams(layoutParams7);
        this.mzz = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iQdl = qdl(16.0f);
        layoutParams8.setMargins(iQdl, iQdl, iQdl, iQdl);
        this.mzz.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_ad_report_info_button_bg"));
        this.mzz.setText("copy all");
        this.mzz.setTextColor(Color.parseColor("#333333"));
        this.mzz.setTextSize(14.0f);
        this.mzz.setLayoutParams(layoutParams8);
        mzzVar.addView(wdVar);
        wdVar.addView(jpcVar);
        wdVar.addView(this.mo);
        mzzVar.addView(view);
        mzzVar.addView(scrollView);
        scrollView.addView(mzzVar2);
        mzzVar2.addView(mzzVarQdl);
        mzzVar2.addView(mzzVarQdl2);
        mzzVar2.addView(mzzVarQdl3);
        mzzVar2.addView(mzzVarQdl4);
        mzzVar2.addView(mzzVarQdl5);
        mzzVar2.addView(mzzVarQdl6);
        mzzVar.addView(mzzVar3);
        mzzVar3.addView(this.mzz);
        return mzzVar;
    }

    private com.bytedance.sdk.openadsdk.core.mo.mzz qdl(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : qdl(74.0f));
        mzzVar.setOrientation(1);
        mzzVar.setPadding(0, qdl(16.0f), 0, qdl(16.0f));
        mzzVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = qdl(7.0f);
        jpcVar.setIncludeFontPadding(false);
        jpcVar.setText(str);
        jpcVar.setTextColor(Color.parseColor("#333333"));
        jpcVar.setTextSize(16.0f);
        jpcVar.setTypeface(Typeface.defaultFromStyle(1));
        jpcVar.setLayoutParams(layoutParams2);
        mzzVar.addView(jpcVar);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        if (str.equals("Creative info")) {
            this.mml = jpcVar2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        jpcVar2.setIncludeFontPadding(false);
        jpcVar2.setTextColor(Color.parseColor("#666666"));
        jpcVar2.setText(str2);
        jpcVar2.setTextSize(14.0f);
        jpcVar2.setLayoutParams(layoutParams3);
        mzzVar.addView(jpcVar2);
        return mzzVar;
    }

    private int qdl(float f) {
        return ax.ud(getContext(), f);
    }
}
