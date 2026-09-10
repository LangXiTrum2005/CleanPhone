package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ip0 implements db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f15812a = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.db0
    public final void b(zzt zztVar) {
        Object obj = this.f15812a.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdq) obj).zze(zztVar);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
