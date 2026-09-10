package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b40 f14209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh0 f14210b;

    public f40(b40 b40Var, yh0 yh0Var) {
        this.f14209a = b40Var;
        this.f14210b = yh0Var;
    }

    public final void a(Context context, VersionInfoParcel versionInfoParcel) {
        if (((Boolean) zzba.zzc().a(am.Ef)).booleanValue()) {
            Executor threadPoolExecutor = l00.f16608a;
            if (((Boolean) zzba.zzc().a(am.Gf)).booleanValue()) {
                e40 e40Var = new e40(((Integer) zzba.zzc().a(am.If)).intValue());
                int iIntValue = ((Integer) zzba.zzc().a(am.Hf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), e40Var);
            }
            threadPoolExecutor.execute(new o1(this, context, versionInfoParcel, 6));
        }
    }
}
