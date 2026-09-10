package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class in0 implements nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15803a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15808f;

    public in0(Context context, y70 y70Var, yv0 yv0Var, fe1 fe1Var, jm jmVar) {
        this.f15804b = context;
        this.f15805c = y70Var;
        this.f15808f = yv0Var;
        this.f15807e = fe1Var;
        this.f15806d = jmVar;
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        String string;
        switch (this.f15803a) {
            case 0:
                if (((Boolean) zzba.zzc().a(am.Ne)).booleanValue()) {
                    lj1 lj1VarA = ((yh0) this.f15808f).a();
                    lj1VarA.l("action", "cstm_tbs_rndr");
                    lj1VarA.m();
                }
                try {
                    string = du0Var.f13713v.getString("tab_url");
                    break;
                } catch (Exception unused) {
                    string = null;
                }
                return zw1.x(be1.f12743b, new hn0(this, string != null ? Uri.parse(string) : null, ju0Var, du0Var, (fu0) ju0Var.f16196b.f20920d, 0), (Executor) this.f15806d);
            default:
                ro0 ro0Var = new ro0(new View(this.f15804b), null, tc0.f20294m, (eu0) du0Var.f13711u.get(0));
                vu0 vu0Var = new vu0(ju0Var, du0Var, (String) null);
                f50 f50Var = (f50) ((y70) this.f15805c);
                e50 e50Var = new e50(f50Var.f14224d, f50Var.f14226e, vu0Var, ro0Var);
                ba0 ba0Var = (ba0) e50Var.f13841c0.zzb();
                ma0 ma0Var = (ma0) e50Var.f13844f0.zzb();
                rc0 rc0Var = (rc0) e50Var.f13845h0.zzb();
                oc0 oc0Var = (oc0) e50Var.f13854q0.zzb();
                d70 d70Var = (d70) e50Var.W.zzb();
                v90 v90Var = new v90();
                v90Var.f21140f = new AtomicBoolean(false);
                v90Var.f21135a = ba0Var;
                v90Var.f21136b = ma0Var;
                v90Var.f21137c = rc0Var;
                v90Var.f21138d = oc0Var;
                v90Var.f21139e = d70Var;
                hu0 hu0Var = du0Var.f13708s;
                hm hmVar = new hm(v90Var, hu0Var.f15395b, hu0Var.f15394a);
                yv0 yv0Var = (yv0) this.f15808f;
                Objects.requireNonNull(yv0Var);
                md0 md0Var = new md0(24, this, hmVar);
                v90 v90Var2 = new v90(yv0Var, vv0.CUSTOM_RENDER_SYN, null, yv0.f22377d, Collections.EMPTY_LIST, ((k00) ((fe1) this.f15807e)).b(new ns0(md0Var, 2)));
                v90 v90VarA = ((yv0) v90Var2.f21140f).a(v90Var2.m(), vv0.CUSTOM_RENDER_ACK);
                return new v90((yv0) v90VarA.f21140f, v90VarA.f21135a, (String) v90VarA.f21136b, (ListenableFuture) v90VarA.f21137c, (List) v90VarA.f21138d, zw1.x((ListenableFuture) v90VarA.f21139e, new mt(2, zw1.d(e50Var.W())), l00.f16615h)).m();
        }
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        String string;
        hu0 hu0Var;
        switch (this.f15803a) {
            case 0:
                Context context = this.f15804b;
                if ((context instanceof Activity) && nm.a(context)) {
                    try {
                        string = du0Var.f13713v.getString("tab_url");
                    } catch (Exception unused) {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                        return true;
                    }
                    break;
                }
                return false;
            default:
                return (((jm) this.f15806d) == null || (hu0Var = du0Var.f13708s) == null || hu0Var.f15394a == null) ? false : true;
        }
    }

    public in0(Context context, Executor executor, ed0 ed0Var, cu0 cu0Var, yh0 yh0Var) {
        this.f15804b = context;
        this.f15805c = ed0Var;
        this.f15806d = executor;
        this.f15807e = cu0Var;
        this.f15808f = yh0Var;
    }
}
