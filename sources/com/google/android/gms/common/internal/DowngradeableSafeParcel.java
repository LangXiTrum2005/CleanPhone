package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private boolean zzb = false;

    public static boolean canUnparcelSafely(String str) {
        synchronized (zza) {
        }
        return true;
    }

    public static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    public abstract boolean prepareForClientVersion(int i2);

    public void setShouldDowngrade(boolean z2) {
        this.zzb = z2;
    }

    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
