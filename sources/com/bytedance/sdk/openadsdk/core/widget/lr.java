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
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.utils.ay;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends Dialog {
    private int aw;
    private OnBackInvokedCallback bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18149co;
    private com.bytedance.sdk.openadsdk.core.di.ri di;
    private com.bytedance.sdk.openadsdk.core.di.ri fi;
    private com.bytedance.sdk.openadsdk.core.di.mj ik;
    private String jbs;
    private com.bytedance.sdk.openadsdk.core.di.mj ka;
    private com.bytedance.sdk.openadsdk.core.di.ka lr;
    private final Context mj;
    private String qt;
    public InterfaceC0262lr ri;
    private String sf;
    private boolean vr;
    private View xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.lr$lr, reason: collision with other inner class name */
    public interface InterfaceC0262lr {
        void lr();

        void ri();
    }

    public static class ri implements OnBackInvokedCallback {
        private final WeakReference<lr> ri;

        public ri(lr lrVar) {
            this.ri = new WeakReference<>(lrVar);
        }

        public void onBackInvoked() {
            lr lrVar = this.ri.get();
            if (lrVar != null) {
                com.bytedance.sdk.component.utils.ac.ri("CustomCommonDialog", "onBackInvoked");
                lrVar.onBackPressed();
            }
        }
    }

    public lr(Context context) {
        super(context, uq.di(context, "tt_custom_dialog"));
        this.aw = -1;
        this.vr = false;
        this.mj = context;
    }

    private void ik() {
        if (this.bgr == null || !ay.ri()) {
            return;
        }
        com.bytedance.sdk.component.utils.ac.ri("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.bgr);
    }

    private void lr() {
        if (TextUtils.isEmpty(this.qt)) {
            this.ik.setVisibility(8);
        } else {
            this.ik.setText(this.qt);
            this.ik.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.jbs)) {
            this.ka.setText(this.jbs);
        }
        if (TextUtils.isEmpty(this.sf)) {
            this.di.setText(uq.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), "tt_postive_txt"));
        } else {
            this.di.setText(this.sf);
        }
        if (TextUtils.isEmpty(this.f18149co)) {
            this.fi.setText(uq.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), "tt_negtive_txt"));
        } else {
            this.fi.setText(this.f18149co);
        }
        int i = this.aw;
        if (i != -1) {
            this.lr.setImageResource(i);
            this.lr.setVisibility(0);
        } else {
            this.lr.setVisibility(8);
        }
        if (this.vr) {
            this.xha.setVisibility(8);
            this.fi.setVisibility(8);
        } else {
            this.fi.setVisibility(0);
            this.xha.setVisibility(0);
        }
    }

    private void ri() {
        this.di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.lr.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0262lr interfaceC0262lr = lr.this.ri;
                if (interfaceC0262lr != null) {
                    interfaceC0262lr.ri();
                }
            }
        });
        this.fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.lr.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0262lr interfaceC0262lr = lr.this.ri;
                if (interfaceC0262lr != null) {
                    interfaceC0262lr.lr();
                }
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        ik();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.ac.ri("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ri(this.mj));
        if (ay.ri()) {
            com.bytedance.sdk.component.utils.ac.ri("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.bgr = new ri(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.bgr);
        }
        setCanceledOnTouchOutside(false);
        lr();
        ri();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        lr();
    }

    private View ri(Context context) {
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(context);
        xhaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        fiVar.setMinimumWidth(ri(260.0f));
        fiVar.setPadding(0, ri(32.0f), 0, 0);
        fiVar.setBackground(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_custom_dialog_bg"));
        fiVar.setOrientation(1);
        fiVar.setLayoutParams(layoutParams);
        this.ik = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = ri(16.0f);
        layoutParams2.rightMargin = ri(16.0f);
        layoutParams2.bottomMargin = ri(16.0f);
        this.ik.setGravity(17);
        this.ik.setVisibility(0);
        this.ik.setTextColor(Color.parseColor("#333333"));
        this.ik.setTextSize(18.0f);
        this.ik.setLayoutParams(layoutParams2);
        this.lr = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = ri(16.0f);
        layoutParams3.rightMargin = ri(16.0f);
        layoutParams3.bottomMargin = ri(10.0f);
        this.lr.setMaxHeight(ri(150.0f));
        this.lr.setMaxWidth(ri(150.0f));
        this.lr.setVisibility(0);
        this.lr.setLayoutParams(layoutParams3);
        this.ka = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = ri(20.0f);
        layoutParams4.rightMargin = ri(20.0f);
        this.ka.setGravity(17);
        this.ka.setLineSpacing(ri(3.0f), 1.2f);
        this.ka.setTextSize(18.0f);
        this.ka.setTextColor(Color.parseColor("#000000"));
        this.ka.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = ri(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        fiVar2.setOrientation(0);
        fiVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.di.ri riVar = new com.bytedance.sdk.openadsdk.core.di.ri(context);
        this.fi = riVar;
        riVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = ri(10.0f);
        layoutParams7.weight = 1.0f;
        this.fi.setPadding(0, ri(16.0f), 0, ri(16.0f));
        this.fi.setBackground(null);
        this.fi.setGravity(17);
        this.fi.setSingleLine(true);
        this.fi.setTextColor(Color.parseColor("#999999"));
        this.fi.setTextSize(16.0f);
        this.fi.setLayoutParams(layoutParams7);
        this.xha = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.xha.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.xha.setLayoutParams(layoutParams8);
        this.di = new com.bytedance.sdk.openadsdk.core.di.ri(context);
        this.fi.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = ri(10.0f);
        layoutParams9.weight = 1.0f;
        this.di.setPadding(0, ri(16.0f), 0, ri(16.0f));
        this.di.setBackground(null);
        this.di.setGravity(17);
        this.di.setSingleLine(true);
        this.di.setTextColor(Color.parseColor("#38ADFF"));
        this.di.setTextSize(16.0f);
        this.di.setLayoutParams(layoutParams9);
        xhaVar.addView(fiVar);
        fiVar.addView(this.ik);
        fiVar.addView(this.lr);
        fiVar.addView(this.ka);
        fiVar.addView(view);
        fiVar.addView(fiVar2);
        fiVar2.addView(this.fi);
        fiVar2.addView(this.xha);
        fiVar2.addView(this.di);
        return xhaVar;
    }

    public lr ik(String str) {
        this.f18149co = str;
        return this;
    }

    public lr lr(String str) {
        this.sf = str;
        return this;
    }

    private int ri(float f) {
        return qd.lr(getContext(), f);
    }

    public lr ri(InterfaceC0262lr interfaceC0262lr) {
        this.ri = interfaceC0262lr;
        return this;
    }

    public lr ri(String str) {
        this.jbs = str;
        return this;
    }
}
