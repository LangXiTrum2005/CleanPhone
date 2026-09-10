package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qp0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19154b;

    public /* synthetic */ qp0(Object obj, int i10) {
        this.f19153a = i10;
        this.f19154b = obj;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        switch (this.f19153a) {
            case 0:
                return zw1.d(new rp0(b0.b.a((Context) this.f19154b, "com.google.android.gms.permission.AD_ID") == 0, 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) this.f19154b).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return zw1.d(new eq0(arrayList, 0));
            case 2:
                return zw1.d(new rp0(((ou0) this.f19154b).f18375q, 1));
            case 3:
                ct0 ct0Var = (ct0) this.f19154b;
                String str = null;
                if (ct0Var == null) {
                    return zw1.d(new yp0(str, 2));
                }
                String str2 = ct0Var.f13250a;
                return p9.d.a(str2) ? zw1.d(new yp0(str, 2)) : zw1.d(new yp0(str2, 2));
            case 4:
                return zw1.d(new mr0((cu0) this.f19154b, 0));
            case 5:
                return zw1.d(new fq0(2, (Bundle) this.f19154b));
            case 6:
                return zw1.d(new yp0((String) this.f19154b, 4));
            default:
                return zw1.z(zw1.v(zw1.d(new Bundle()), ((Long) zzba.zzc().a(am.f12253m5)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f19154b), i6.f15614o, l00.f16608a);
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f19153a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            case 6:
                return 31;
            default:
                return 49;
        }
    }
}
