package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzrb extends Exception {
    public final boolean zza;

    public zzrb(int i2, int i3, int i4, int i5, int i6, zzv zzvVar, boolean z2, Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i3).length();
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i5).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i6).length() + 2 + strValueOf.length());
        androidx.datastore.preferences.protobuf.a.z(sb, "AudioTrack init failed 0 Config(", i3, ", ", i4);
        androidx.datastore.preferences.protobuf.a.z(sb, ", ", i5, ", ", i6);
        super(android.support.v4.media.a.s(sb, ") ", strValueOf, ""), exc);
        this.zza = false;
    }
}
