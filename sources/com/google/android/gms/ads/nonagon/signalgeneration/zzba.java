package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Binder;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ek0;
import com.google.android.gms.internal.ads.jk0;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.mx;
import com.google.android.gms.internal.ads.od1;
import com.google.android.gms.internal.ads.qn;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.ze;
import com.google.android.gms.internal.ads.zk0;
import com.google.android.gms.internal.ads.zw1;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f11446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk0 f11447b;

    public zzba(Executor executor, jk0 jk0Var) {
        this.f11446a = executor;
        this.f11447b = jk0Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) throws Exception {
        ListenableFuture listenableFutureB;
        final mx mxVar = (mx) obj;
        jk0 jk0Var = this.f11447b;
        jk0Var.getClass();
        String str = mxVar.f17569d;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureB = zw1.l(new yk0(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.D8)).booleanValue() || ((Boolean) qn.f19129a.o()).booleanValue()) {
                listenableFutureB = ((k00) jk0Var.f16107c).b(new ze(6, jk0Var, mxVar));
            } else {
                listenableFutureB = jk0Var.f16108d.c(mxVar);
            }
        }
        return zw1.x(zw1.u((vd1) zw1.v(vd1.r(listenableFutureB), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.J6)).intValue(), TimeUnit.SECONDS, jk0Var.f16105a), Throwable.class, new ek0(jk0Var, mxVar, Binder.getCallingUid(), 1), jk0Var.f16106b), new od1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.od1
            public final ListenableFuture zza(Object obj2) {
                zk0 zk0Var = (zk0) obj2;
                zzbc zzbcVar = new zzbc(new JsonReader(new InputStreamReader(zk0Var.f22647a)), zk0Var.f22648b);
                try {
                    zzbcVar.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzo(mxVar.f17566a).toString();
                } catch (JSONException unused) {
                    zzbcVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zw1.d(zzbcVar);
            }
        }, this.f11446a);
    }
}
