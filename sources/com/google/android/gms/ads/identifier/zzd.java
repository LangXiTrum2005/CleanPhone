package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.OnFailureListener;
import j9.e;
import j9.h;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import k9.k;
import k9.o;
import k9.p;
import k9.q;
import m9.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);

    @Nullable
    private final p zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = new d(context, null, d.f45913m, new q("ads_identifier:api"), h.f43737c);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzdVar, long j10, Exception exc) {
        ConnectionResult connectionResult;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof e) && (connectionResult = ((e) exc).f43728a.f11657d) != null && connectionResult.f11641b == 24) {
            zzdVar.zze.set(j10);
        }
    }

    public final synchronized void zzc(int i10, int i11, long j10, long j11, int i12) {
        AtomicLong atomicLong = this.zze;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            p pVar = this.zzd;
            if (pVar != null) {
                ((d) pVar).d(new o(0, Arrays.asList(new k(35401, i11, 0, j10, j11, null, null, 0, i12)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                });
            }
        }
    }
}
