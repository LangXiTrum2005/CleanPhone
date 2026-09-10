package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class id extends LinearLayout {
    private LinearLayout JXs;
    private com.bytedance.sdk.component.utils.DY LD;
    private TextView Lxb;
    private Lxb ZU;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu ebl;
    private com.bytedance.adsdk.LD.lc lc;
    private TextView lk;

    public interface Lxb {
    }

    public id(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu nbu) {
        super(context);
        this.ebl = nbu;
        Lxb(context, view);
    }

    public TextView getTopTextView() {
        return this.Lxb;
    }

    public LinearLayout getWriggleLayout() {
        return this.JXs;
    }

    public View getWriggleProgressIv() {
        return this.lc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.LD == null) {
                this.LD = new com.bytedance.sdk.component.utils.DY(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.lc.id.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu nbu = this.ebl;
            if (nbu != null) {
                nbu.lk();
                this.ebl.JXs();
                this.ebl.lc();
                this.ebl.OY();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.LD.lc lcVar = this.lc;
            if (lcVar != null) {
                lcVar.JXs();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public void setOnShakeViewListener(Lxb lxb) {
        this.ZU = lxb;
    }

    public void setShakeText(String str) {
        this.lk.setText(str);
    }

    private void Lxb(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.JXs = (LinearLayout) findViewById(2097610722);
        this.Lxb = (TextView) findViewById(2097610719);
        this.lk = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.LD.lc lcVar = (com.bytedance.adsdk.LD.lc) findViewById(2097610706);
        this.lc = lcVar;
        lcVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.lc.setImageAssetsFolder("images/");
        this.lc.Lxb(true);
    }

    public void Lxb() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.id.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    id.this.lc.Lxb();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
