package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzidq extends IllegalArgumentException {
    public zzidq(int i2, int i3) {
        super(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 32 + String.valueOf(i3).length()), i2, "Unpaired surrogate at index ", i3, " of "));
    }
}
