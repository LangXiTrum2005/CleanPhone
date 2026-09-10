package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcn extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzcn(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        super(android.support.v4.media.a.s(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
