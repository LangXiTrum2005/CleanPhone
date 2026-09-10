package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f14942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fe1 f14944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f14945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mm0 f14946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ou0 f14947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f14948g;

    public gs0(zzj zzjVar, Context context, fe1 fe1Var, ScheduledExecutorService scheduledExecutorService, mm0 mm0Var, ou0 ou0Var, VersionInfoParcel versionInfoParcel) {
        this.f14942a = zzjVar;
        this.f14943b = context;
        this.f14944c = fe1Var;
        this.f14945d = scheduledExecutorService;
        this.f14946e = mm0Var;
        this.f14947f = ou0Var;
        this.f14948g = versionInfoParcel;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x0079  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (java.util.Arrays.asList(r1.split(",")).contains(r5.f14943b.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.bs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gs0.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 56;
    }
}
