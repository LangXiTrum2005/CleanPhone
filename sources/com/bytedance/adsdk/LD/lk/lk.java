package com.bytedance.adsdk.LD.lk;

import android.graphics.Typeface;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class lk {
    private Typeface JXs;
    private final String LD;
    private final String Lxb;
    private final float ZU;
    private final String lk;

    public lk(String str, String str2, String str3, float f) {
        this.Lxb = str;
        this.LD = str2;
        this.lk = str3;
        this.ZU = f;
    }

    public String LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public Typeface ZU() {
        return this.JXs;
    }

    public String lk() {
        return this.lk;
    }

    public void Lxb(Typeface typeface) {
        this.JXs = typeface;
    }
}
