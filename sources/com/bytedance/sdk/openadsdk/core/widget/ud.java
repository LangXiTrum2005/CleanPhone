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
import android.window.OnBackInvokedCallback;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends Dialog {
    private boolean bjy;
    private int exu;
    private String fs;
    private final Context jpc;
    private com.bytedance.sdk.openadsdk.core.mo.jpc lnr;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mml;
    private com.bytedance.sdk.openadsdk.core.mo.qdl mo;
    private com.bytedance.sdk.openadsdk.core.mo.qdl mzz;
    public InterfaceC0139ud qdl;
    private OnBackInvokedCallback rdp;
    private String rq;
    private String to;
    private String tvp;
    private com.bytedance.sdk.openadsdk.core.mo.mml ud;
    private View wd;

    public static class qdl implements OnBackInvokedCallback {
        private final WeakReference<ud> qdl;

        public qdl(ud udVar) {
            this.qdl = new WeakReference<>(udVar);
        }

        public void onBackInvoked() {
            ud udVar = this.qdl.get();
            if (udVar != null) {
                com.bytedance.sdk.component.utils.aaj.qdl("CustomCommonDialog", "onBackInvoked");
                udVar.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ud$ud, reason: collision with other inner class name */
    public interface InterfaceC0139ud {
        void qdl();

        void ud();
    }

    public ud(Context context) {
        super(context, ljh.mo(context, "tt_custom_dialog"));
        this.exu = -1;
        this.bjy = false;
        this.jpc = context;
    }

    private void lnr() {
        if (this.rdp == null || !com.bytedance.sdk.openadsdk.utils.ljh.qdl()) {
            return;
        }
        com.bytedance.sdk.component.utils.aaj.qdl("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.rdp);
    }

    private void qdl() {
        this.mo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ud.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0139ud interfaceC0139ud = ud.this.qdl;
                if (interfaceC0139ud != null) {
                    interfaceC0139ud.qdl();
                }
            }
        });
        this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ud.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0139ud interfaceC0139ud = ud.this.qdl;
                if (interfaceC0139ud != null) {
                    interfaceC0139ud.ud();
                }
            }
        });
    }

    private void ud() {
        if (TextUtils.isEmpty(this.to)) {
            this.lnr.setVisibility(8);
        } else {
            this.lnr.setText(this.to);
            this.lnr.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.tvp)) {
            this.mml.setText(this.tvp);
        }
        if (TextUtils.isEmpty(this.rq)) {
            this.mo.setText(ljh.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), "tt_postive_txt"));
        } else {
            this.mo.setText(this.rq);
        }
        if (TextUtils.isEmpty(this.fs)) {
            this.mzz.setText(ljh.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), "tt_negtive_txt"));
        } else {
            this.mzz.setText(this.fs);
        }
        int i2 = this.exu;
        if (i2 != -1) {
            this.ud.setImageResource(i2);
            this.ud.setVisibility(0);
        } else {
            this.ud.setVisibility(8);
        }
        if (this.bjy) {
            this.wd.setVisibility(8);
            this.mzz.setVisibility(8);
        } else {
            this.mzz.setVisibility(0);
            this.wd.setVisibility(0);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        lnr();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.aaj.qdl("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(qdl(this.jpc));
        if (com.bytedance.sdk.openadsdk.utils.ljh.qdl()) {
            com.bytedance.sdk.component.utils.aaj.qdl("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.rdp = new qdl(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.rdp);
        }
        setCanceledOnTouchOutside(false);
        ud();
        qdl();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ud();
    }

    private View qdl(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        RelativeLayout.LayoutParams layoutParamsF = a.f(-1, -2, 13);
        mzzVar.setMinimumWidth(qdl(260.0f));
        mzzVar.setPadding(0, qdl(32.0f), 0, 0);
        mzzVar.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_custom_dialog_bg"));
        mzzVar.setOrientation(1);
        mzzVar.setLayoutParams(layoutParamsF);
        this.lnr = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = qdl(16.0f);
        layoutParams.rightMargin = qdl(16.0f);
        layoutParams.bottomMargin = qdl(16.0f);
        this.lnr.setGravity(17);
        this.lnr.setVisibility(0);
        this.lnr.setTextColor(Color.parseColor("#333333"));
        this.lnr.setTextSize(18.0f);
        this.lnr.setLayoutParams(layoutParams);
        this.ud = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = qdl(16.0f);
        layoutParams2.rightMargin = qdl(16.0f);
        layoutParams2.bottomMargin = qdl(10.0f);
        this.ud.setMaxHeight(qdl(150.0f));
        this.ud.setMaxWidth(qdl(150.0f));
        this.ud.setVisibility(0);
        this.ud.setLayoutParams(layoutParams2);
        this.mml = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = qdl(20.0f);
        layoutParams3.rightMargin = qdl(20.0f);
        this.mml.setGravity(17);
        this.mml.setLineSpacing(qdl(3.0f), 1.2f);
        this.mml.setTextSize(18.0f);
        this.mml.setTextColor(Color.parseColor("#000000"));
        this.mml.setLayoutParams(layoutParams3);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams4.topMargin = qdl(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        mzzVar2.setOrientation(0);
        mzzVar2.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.mo.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.mo.qdl(context);
        this.mzz = qdlVar;
        qdlVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
        layoutParams6.leftMargin = qdl(10.0f);
        layoutParams6.weight = 1.0f;
        this.mzz.setPadding(0, qdl(16.0f), 0, qdl(16.0f));
        this.mzz.setBackground(null);
        this.mzz.setGravity(17);
        this.mzz.setSingleLine(true);
        this.mzz.setTextColor(Color.parseColor("#999999"));
        this.mzz.setTextSize(16.0f);
        this.mzz.setLayoutParams(layoutParams6);
        this.wd = new View(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(1, -1);
        this.wd.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.wd.setLayoutParams(layoutParams7);
        this.mo = new com.bytedance.sdk.openadsdk.core.mo.qdl(context);
        this.mzz.setId(520093719);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -2);
        layoutParams8.rightMargin = qdl(10.0f);
        layoutParams8.weight = 1.0f;
        this.mo.setPadding(0, qdl(16.0f), 0, qdl(16.0f));
        this.mo.setBackground(null);
        this.mo.setGravity(17);
        this.mo.setSingleLine(true);
        this.mo.setTextColor(Color.parseColor("#38ADFF"));
        this.mo.setTextSize(16.0f);
        this.mo.setLayoutParams(layoutParams8);
        wdVar.addView(mzzVar);
        mzzVar.addView(this.lnr);
        mzzVar.addView(this.ud);
        mzzVar.addView(this.mml);
        mzzVar.addView(view);
        mzzVar.addView(mzzVar2);
        mzzVar2.addView(this.mzz);
        mzzVar2.addView(this.wd);
        mzzVar2.addView(this.mo);
        return wdVar;
    }

    public ud lnr(String str) {
        this.fs = str;
        return this;
    }

    public ud ud(String str) {
        this.rq = str;
        return this;
    }

    private int qdl(float f) {
        return ax.ud(getContext(), f);
    }

    public ud qdl(InterfaceC0139ud interfaceC0139ud) {
        this.qdl = interfaceC0139ud;
        return this;
    }

    public ud qdl(String str) {
        this.tvp = str;
        return this;
    }
}
