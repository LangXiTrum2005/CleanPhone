package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i2, int i3) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21 + String.valueOf(i3).length() + 1);
        androidx.datastore.preferences.protobuf.a.z(sb, "Buffer too small (", i2, " < ", i3);
        sb.append(")");
        super(sb.toString());
    }
}
