package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ib;
import com.google.android.gms.internal.ads.lj1;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.md0;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.tb;
import com.google.android.gms.internal.ads.va;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C0375hc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ib f11084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11085b = new Object();

    public zzbl(Context context) {
        ib ibVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f11085b) {
            try {
                if (f11084a == null) {
                    am.a(context);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12435y5)).booleanValue()) {
                        ibVar = zzay.zzb(context);
                    } else {
                        ibVar = new ib(new tb(new lj1(context.getApplicationContext())), new md0(new s6(20)));
                        ibVar.a();
                    }
                    f11084a = ibVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        m00 m00Var = new m00();
        f11084a.b(new zzbk(str, null, m00Var));
        return m00Var;
    }

    public final ListenableFuture zzb(int i10, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbi zzbiVar = new zzbi();
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i10, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, C0375hc.f28788a, zzbhVar.zzm(), zzbhVar.zzn());
            } catch (va e10) {
                String message = e10.getMessage();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        f11084a.b(zzbhVar);
        return zzbiVar;
    }
}
