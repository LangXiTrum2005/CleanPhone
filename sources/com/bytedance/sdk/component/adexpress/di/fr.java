package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class fr extends LinearLayout {
    private com.bytedance.adsdk.lr.di di;
    private LinearLayout fi;
    private TextView ik;
    private ri ka;
    private com.bytedance.sdk.component.utils.ay lr;
    private TextView ri;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.qt xha;

    public interface ri {
    }

    public fr(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.ka.qt qtVar) {
        super(context);
        this.xha = qtVar;
        ri(context, view);
    }

    public TextView getTopTextView() {
        return this.ri;
    }

    public LinearLayout getWriggleLayout() {
        return this.fi;
    }

    public View getWriggleProgressIv() {
        return this.di;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.lr == null) {
                this.lr = new com.bytedance.sdk.component.utils.ay(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.di.fr.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.ka.qt qtVar = this.xha;
            if (qtVar != null) {
                qtVar.ik();
                this.xha.fi();
                this.xha.di();
                this.xha.mj();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.lr.di diVar = this.di;
            if (diVar != null) {
                diVar.fi();
            }
        } catch (Exception unused) {
        }
    }

    public void setOnShakeViewListener(ri riVar) {
        this.ka = riVar;
    }

    public void setShakeText(String str) {
        this.ik.setText(str);
    }

    private void ri(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.fi = (LinearLayout) findViewById(2097610722);
        this.ri = (TextView) findViewById(2097610719);
        this.ik = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.lr.di diVar = (com.bytedance.adsdk.lr.di) findViewById(2097610706);
        this.di = diVar;
        diVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.di.setImageAssetsFolder("images/");
        this.di.ri(true);
    }

    public void ri() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.fr.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fr.this.di.ri();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }
}
