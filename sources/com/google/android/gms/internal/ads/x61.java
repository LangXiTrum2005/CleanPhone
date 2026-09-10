package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x61 implements p61, b31 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f21756g = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f21758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21759c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21760d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21761e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21762f = false;

    public x61(Context context, ExecutorService executorService, String[] strArr) {
        this.f21757a = context;
        this.f21758b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void a(HashMap map, Context context, View view) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void b(HashMap map) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void c(HashMap map) {
        long j10;
        long j11;
        d();
        synchronized (this) {
            try {
                j10 = this.f21762f ? this.f21760d - this.f21759c : -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.f21761e;
            this.f21761e = -1L;
        }
        map.put("vf", Long.valueOf(j11));
    }

    public final void d() {
        synchronized (this) {
            try {
                if (this.f21762f) {
                    this.f21760d = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b31
    public final ListenableFuture zza() {
        pe1 pe1Var = new pe1(Executors.callable(new ry0(this, 9), null));
        this.f21758b.execute(pe1Var);
        return pe1Var;
    }
}
