package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class xmv extends LinearLayout {
    private TextView lnr;
    private qdl mml;
    private com.bytedance.adsdk.ud.mo mo;
    private LinearLayout mzz;
    private TextView qdl;
    private com.bytedance.sdk.component.utils.uw ud;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.to wd;

    public interface qdl {
    }

    public xmv(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.mml.to toVar) {
        super(context);
        this.wd = toVar;
        qdl(context, view);
    }

    public TextView getTopTextView() {
        return this.qdl;
    }

    public LinearLayout getWriggleLayout() {
        return this.mzz;
    }

    public View getWriggleProgressIv() {
        return this.mo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.ud == null) {
                this.ud = new com.bytedance.sdk.component.utils.uw(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.mo.xmv.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.mml.to toVar = this.wd;
            if (toVar != null) {
                toVar.lnr();
                this.wd.mzz();
                this.wd.mo();
                this.wd.jpc();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.ud.mo moVar = this.mo;
            if (moVar != null) {
                moVar.mzz();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
    }

    public void setOnShakeViewListener(qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void setShakeText(String str) {
        this.lnr.setText(str);
    }

    private void qdl(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.mzz = (LinearLayout) findViewById(2097610722);
        this.qdl = (TextView) findViewById(2097610719);
        this.lnr = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.ud.mo moVar = (com.bytedance.adsdk.ud.mo) findViewById(2097610706);
        this.mo = moVar;
        moVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.mo.setImageAssetsFolder("images/");
        this.mo.qdl(true);
    }

    public void qdl() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.xmv.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    xmv.this.mo.qdl();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
