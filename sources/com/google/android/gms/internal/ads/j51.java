package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j51 implements p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o61 f15986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15989e;

    public j51(Context context, h21 h21Var, o61 o61Var) {
        this.f15985a = context;
        this.f15987c = h21Var.Q();
        this.f15988d = h21Var.X();
        this.f15989e = h21Var.Y();
        this.f15986b = o61Var;
    }

    public final void a(HashMap map) {
        String strU0;
        je jeVar;
        map.put("v", this.f15987c);
        map.put("t", new Throwable());
        try {
            ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
            strU0 = (listenableFuture == null || (Build.VERSION.SDK_INT >= 31 && !listenableFuture.isDone()) || (jeVar = (je) listenableFuture.get(this.f15988d, TimeUnit.MILLISECONDS)) == null || jeVar.u0().length() <= 1) ? "E" : jeVar.u0();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strU0.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.f15989e, TimeUnit.MILLISECONDS);
                    if (!pi1.l(str)) {
                        strU0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strU0);
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zzb() {
        HashMap mapA = this.f15986b.a();
        a(mapA);
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zzc() {
        HashMap mapB = this.f15986b.b(this.f15985a, null);
        a(mapB);
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zzd() {
        HashMap mapC = this.f15986b.c();
        a(mapC);
        return mapC;
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
