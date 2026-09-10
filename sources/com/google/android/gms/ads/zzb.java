package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.internal.ads.qt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile zzch f11587a;

    public static zzch zza(Context context) {
        if (f11587a == null) {
            synchronized (zzb.class) {
                try {
                    if (f11587a == null) {
                        f11587a = zzay.zzb().zzd(context, new qt());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11587a;
    }
}
