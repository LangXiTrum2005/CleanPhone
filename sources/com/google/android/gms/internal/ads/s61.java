package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s61 implements p61, b31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f19879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f19880c = null;

    public s61(Context context, ExecutorService executorService) {
        this.f19878a = context;
        this.f19879b = executorService;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.p61
    public final void c(HashMap map) {
        NetworkCapabilities networkCapabilities;
        long j10;
        synchronized (this) {
            networkCapabilities = this.f19880c;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f19880c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j10 = 2;
                    } else if (this.f19880c.hasTransport(1)) {
                        j10 = 1;
                    } else {
                        j10 = this.f19880c.hasTransport(0) ? 0L : -1L;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        map.put("nt", Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.b31
    public final ListenableFuture zza() {
        pe1 pe1Var = new pe1(Executors.callable(new ry0(this, 8), null));
        this.f19879b.execute(pe1Var);
        return pe1Var;
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void b(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void a(HashMap map, Context context, View view) {
    }
}
