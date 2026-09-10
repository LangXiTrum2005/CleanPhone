package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f14752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f14753c;

    public /* synthetic */ g40(fx1 fx1Var, fx1 fx1Var2, int i10) {
        this.f14751a = i10;
        this.f14752b = fx1Var;
        this.f14753c = fx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        k00 k00Var;
        switch (this.f14751a) {
            case 0:
                return new f40((b40) this.f14752b.zzb(), (yh0) this.f14753c.zzb());
            case 1:
                return new h40((ScheduledExecutorService) this.f14753c.zzb());
            case 2:
                return ((Boolean) zzba.zzc().a(am.N3)).booleanValue() ? new qf((of) this.f14753c.zzb()) : new qf((of) this.f14752b.zzb());
            case 3:
                yh yhVar = (yh) this.f14752b.zzb();
                kt ktVar = (kt) this.f14753c.zzb();
                if (((Boolean) zzba.zzc().a(am.Q6)).booleanValue()) {
                    k00Var = l00.f16610c;
                } else {
                    k00Var = ((Boolean) zzba.zzc().a(am.P6)).booleanValue() ? l00.f16608a : l00.f16613f;
                }
                ic1.h(k00Var);
                return new y60(yhVar.f22251c, ktVar, k00Var);
            case 4:
                d70 d70Var = (d70) this.f14752b.zzb();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                Set setSingleton = ((JSONObject) this.f14753c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new nc0(d70Var, k00Var2));
                ic1.h(setSingleton);
                return setSingleton;
            case 5:
                d70 d70Var2 = (d70) this.f14752b.zzb();
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                Set setSingleton2 = ((JSONObject) this.f14753c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new nc0(d70Var2, k00Var3));
                ic1.h(setSingleton2);
                return setSingleton2;
            case 6:
                d70 d70Var3 = (d70) this.f14752b.zzb();
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                Set setSingleton3 = ((JSONObject) this.f14753c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new nc0(d70Var3, k00Var4));
                ic1.h(setSingleton3);
                return setSingleton3;
            case 7:
                d70 d70Var4 = (d70) this.f14752b.zzb();
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                Set setSingleton4 = ((JSONObject) this.f14753c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new nc0(d70Var4, k00Var5));
                ic1.h(setSingleton4);
                return setSingleton4;
            case 8:
                return new dd0((bb0) this.f14752b.zzb(), (kc0) this.f14753c.zzb());
            case 9:
                return new fi0((ci0) this.f14753c.zzb(), (String) this.f14752b.zzb());
            case 10:
                return new hj0((yi0) this.f14752b.zzb(), (mh0) this.f14753c.zzb());
            case 11:
                yv0 yv0Var = (yv0) this.f14752b.zzb();
                CookieManager cookieManagerZza = zzt.zzf().zza((Context) this.f14753c.zzb());
                Objects.requireNonNull(yv0Var);
                sf sfVar = new sf(cookieManagerZza, 4);
                fe1 fe1Var = yv0Var.f22378a;
                be1 be1Var = yv0.f22377d;
                List list = Collections.EMPTY_LIST;
                ListenableFuture listenableFutureB = ((k00) fe1Var).b(sfVar);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                v90 v90Var = new v90(yv0Var, vv0.WEBVIEW_COOKIE, null, be1Var, list, zw1.v(listenableFutureB, 1L, TimeUnit.SECONDS, yv0Var.f22379b));
                c60 c60Var = new c60(14);
                yv0 yv0Var2 = (yv0) v90Var.f21140f;
                return new v90(yv0Var2, v90Var.f21135a, (String) v90Var.f21136b, (ListenableFuture) v90Var.f21137c, (List) v90Var.f21138d, zw1.u((ListenableFuture) v90Var.f21139e, Exception.class, c60Var, yv0Var2.f22378a)).m();
            case 12:
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                yq0 yq0Var = new yq0(k00Var6, 2);
                p9.a aVar = (p9.a) this.f14752b.zzb();
                ic1.h(k00Var6);
                return new xq0(yq0Var, ((Long) xm.f21926f.o()).longValue(), aVar, k00Var6, (yh0) this.f14753c.zzb());
            case 13:
                return new cu0((p9.a) this.f14752b.zzb(), (yh0) this.f14753c.zzb());
            case 14:
                return new yx0((zx0) this.f14752b.zzb(), (sx0) this.f14753c.zzb());
            case 15:
                s0.i iVar = (s0.i) this.f14752b.zzb();
                ExecutorService executorService = l00.f16614g;
                ic1.h(executorService);
                return new w11(iVar, new wv0(executorService, 2), (kh0) this.f14753c.zzb(), new tt0((byte) 0, 4));
            case 16:
                Executor executor = (Executor) this.f14752b.zzb();
                return new u21(executor);
            default:
                return new a71((c21) this.f14752b.zzb(), (d31) this.f14753c.zzb());
        }
    }
}
