package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzfw {
    public final int zzd;

    public static String zze(int i2) {
        char c2 = (char) ((i2 >> 24) & 255);
        char c3 = (char) ((i2 >> 16) & 255);
        char c4 = (char) ((i2 >> 8) & 255);
        char c5 = (char) (i2 & 255);
        StringBuilder sb = new StringBuilder(android.support.v4.media.a.b(String.valueOf(c2).length(), String.valueOf(c3).length(), String.valueOf(c4).length(), String.valueOf(c5).length()));
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        sb.append(c5);
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
