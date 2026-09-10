package com.bytedance.adsdk.lr.ik;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private Typeface fi;
    private final String ik;
    private final float ka;
    private final String lr;
    private final String ri;

    public ik(String str, String str2, String str3, float f) {
        this.ri = str;
        this.lr = str2;
        this.ik = str3;
        this.ka = f;
    }

    public String ik() {
        return this.ik;
    }

    public Typeface ka() {
        return this.fi;
    }

    public String lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public void ri(Typeface typeface) {
        this.fi = typeface;
    }
}
