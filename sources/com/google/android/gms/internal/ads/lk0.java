package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 implements xk0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f17038h = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw f17039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f17040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou0 f17041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f17042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pl0 f17043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jw0 f17044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f17045g;

    public lk0(Context context, ou0 ou0Var, uw uwVar, fe1 fe1Var, ScheduledExecutorService scheduledExecutorService, pl0 pl0Var, jw0 jw0Var) {
        this.f17045g = context;
        this.f17041c = ou0Var;
        this.f17039a = uwVar;
        this.f17040b = fe1Var;
        this.f17042d = scheduledExecutorService;
        this.f17043e = pl0Var;
        this.f17044f = jw0Var;
    }

    @Override // com.google.android.gms.internal.ads.xk0
    public final ListenableFuture a(mx mxVar) {
        ListenableFuture listenableFutureU;
        uw uwVar = this.f17039a;
        fe1 fe1Var = (fe1) uwVar.f20920d;
        String str = mxVar.f17569d;
        zzt.zzc();
        if (zzs.zzF(str)) {
            listenableFutureU = zw1.l(new yk0(1));
        } else {
            listenableFutureU = zw1.u(((k00) ((fe1) uwVar.f20919c)).b(new ze(5, uwVar, mxVar)), ExecutionException.class, c60.f13058c, fe1Var);
        }
        kc1 kc1VarU = zw1.u(listenableFutureU, yk0.class, new ek0(uwVar, mxVar, Binder.getCallingUid(), 0), fe1Var);
        fw0 fw0VarF = fw0.f(this.f17045g, 11);
        ps1.B(kc1VarU, fw0VarF);
        ListenableFuture listenableFutureX = zw1.x(kc1VarU, new rr(this, 5), this.f17040b);
        if (((Boolean) zzba.zzc().a(am.I6)).booleanValue()) {
            listenableFutureX = zw1.u(zw1.v(listenableFutureX, ((Integer) zzba.zzc().a(am.J6)).intValue(), TimeUnit.SECONDS, this.f17042d), TimeoutException.class, c60.f13059d, l00.f16615h);
        }
        ps1.a0(listenableFutureX, this.f17044f, fw0VarF, false);
        listenableFutureX.addListener(new zd1(0, listenableFutureX, new x11(this, 18)), l00.f16615h);
        return listenableFutureX;
    }
}
