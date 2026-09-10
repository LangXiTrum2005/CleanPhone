package com.iab.omid.library.adcolony.a;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public float a(int i2, int i3) {
        if (i3 <= 0 || i2 <= 0) {
            return 0.0f;
        }
        float f = i2 / i3;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
