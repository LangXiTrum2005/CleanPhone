package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzrd extends Exception {
    public zzrd(long j, long j2) {
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 63 + String.valueOf(j).length());
        androidx.datastore.preferences.protobuf.a.A(sb, "Unexpected audio track timestamp discontinuity: expected ", j2, ", got ");
        sb.append(j);
        super(sb.toString());
    }
}
