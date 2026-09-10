package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dz implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx1 f13768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hx1 f13769c;

    public /* synthetic */ dz(hx1 hx1Var, hx1 hx1Var2, int i10) {
        this.f13767a = i10;
        this.f13768b = hx1Var;
        this.f13769c = hx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f13767a) {
            case 0:
                return new cz((Context) this.f13768b.f15424a, (zzg) this.f13769c.f15424a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f13768b.f15424a;
                h21 h21Var = (h21) this.f13769c.f15424a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                d5.u.r(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb2.append(")");
                return new s21(executorService, sb2.toString(), h21Var.Z());
            case 2:
                return new s61((Context) this.f13768b.f15424a, (ExecutorService) this.f13769c.f15424a);
            default:
                return new w61((Context) this.f13768b.f15424a, (ExecutorService) this.f13769c.f15424a);
        }
    }
}
