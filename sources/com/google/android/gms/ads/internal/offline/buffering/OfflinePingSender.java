package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.qt;
import d5.k;
import d5.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw f10900b;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f10900b = zzay.zzb().zzj(context, new qt());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final n doWork() {
        try {
            this.f10900b.zzg();
            return n.a();
        } catch (RemoteException unused) {
            return new k();
        }
    }
}
