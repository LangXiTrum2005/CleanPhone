package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public abstract class F8 {
    public static G8 a() {
        synchronized (G8.d) {
            G8 g8 = G8.f22843e;
            if (g8 == null) {
                return new G8();
            }
            G8.f22843e = g8.f22846c;
            g8.f22846c = null;
            G8.f--;
            return g8;
        }
    }
}
