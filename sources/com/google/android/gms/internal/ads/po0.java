package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class po0 implements nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f18745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yv0 f18746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18748e;

    public /* synthetic */ po0(yv0 yv0Var, fe1 fe1Var, Object obj, Object obj2, int i10) {
        this.f18744a = i10;
        this.f18746c = yv0Var;
        this.f18745b = fe1Var;
        this.f18748e = obj2;
        this.f18747d = obj;
    }

    public static final String c(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i10).length());
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i10);
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.qh, com.google.android.gms.internal.ads.ra0] */
    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        qm0 qm0VarA;
        ju0 ju0Var2;
        switch (this.f18744a) {
            case 0:
                Iterator it = du0Var.f13710t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            qm0VarA = ((pm0) this.f18747d).a((String) it.next(), du0Var.f13713v);
                        } catch (qu0 unused) {
                        }
                    } else {
                        qm0VarA = null;
                    }
                }
                qm0 qm0Var = qm0VarA;
                if (qm0Var == null) {
                    return zw1.l(new tn0(3, "Unable to instantiate mediation adapter class."));
                }
                m00 m00Var = new m00();
                qm0Var.f19128c.m0(new t6.l(this, qm0Var, m00Var));
                if (du0Var.M) {
                    ju0Var2 = ju0Var;
                    Bundle bundle = ((ou0) ju0Var2.f16195a.f20839b).f18363d.zzm;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                } else {
                    ju0Var2 = ju0Var;
                }
                yv0 yv0Var = this.f18746c;
                vv0 vv0Var = vv0.ADAPTER_LOAD_AD_SYN;
                Objects.requireNonNull(yv0Var);
                uw uwVar = new uw(this, ju0Var2, du0Var, qm0Var, 10);
                fe1 fe1Var = this.f18745b;
                v90 v90Var = new v90(yv0Var, vv0Var, null, yv0.f22377d, Collections.EMPTY_LIST, ((k00) fe1Var).b(new ns0(uwVar, 2)));
                v90 v90VarA = ((yv0) v90Var.f21140f).a(v90Var.m(), vv0.ADAPTER_LOAD_AD_ACK);
                mt mtVar = new mt(2, m00Var);
                k00 k00Var = l00.f16615h;
                v90 v90Var2 = new v90((yv0) v90VarA.f21140f, v90VarA.f21135a, (String) v90VarA.f21136b, (ListenableFuture) v90VarA.f21137c, (List) v90VarA.f21138d, zw1.x((ListenableFuture) v90VarA.f21139e, mtVar, k00Var));
                return ((yv0) v90Var2.f21140f).a(v90Var2.m(), vv0.ADAPTER_WRAP_ADAPTER).d(new hz(this, ju0Var, du0Var, qm0Var, 9)).m();
            default:
                m00 m00Var2 = new m00();
                vf vfVar = new vf(26);
                o8 o8Var = new o8(this, m00Var2, ju0Var, du0Var, vfVar, 2);
                synchronized (vfVar) {
                    vfVar.f21157b = o8Var;
                }
                hu0 hu0Var = du0Var.f13708s;
                hm hmVar = new hm(vfVar, hu0Var.f15395b, hu0Var.f15394a);
                vv0 vv0Var2 = vv0.CUSTOM_RENDER_SYN;
                yv0 yv0Var2 = this.f18746c;
                Objects.requireNonNull(yv0Var2);
                lj1 lj1Var = new lj1((Object) this, false, (Object) hmVar, 27);
                fe1 fe1Var2 = this.f18745b;
                v90 v90Var3 = new v90(yv0Var2, vv0Var2, null, yv0.f22377d, Collections.EMPTY_LIST, ((k00) fe1Var2).b(new ns0(lj1Var, 2)));
                v90 v90VarA2 = ((yv0) v90Var3.f21140f).a(v90Var3.m(), vv0.CUSTOM_RENDER_ACK);
                mt mtVar2 = new mt(2, m00Var2);
                k00 k00Var2 = l00.f16615h;
                return new v90((yv0) v90VarA2.f21140f, v90VarA2.f21135a, (String) v90VarA2.f21136b, (ListenableFuture) v90VarA2.f21137c, (List) v90VarA2.f21138d, zw1.x((ListenableFuture) v90VarA2.f21139e, mtVar2, k00Var2)).m();
        }
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        hu0 hu0Var;
        switch (this.f18744a) {
            case 0:
                return !du0Var.f13710t.isEmpty();
            default:
                return (((jm) this.f18747d) == null || (hu0Var = du0Var.f13708s) == null || hu0Var.f15394a == null) ? false : true;
        }
    }
}
