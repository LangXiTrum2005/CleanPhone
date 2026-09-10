package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e90 implements mb0, vc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a8 f13892a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kw0 f13895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VersionInfoParcel f13896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f13897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13898g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13899h = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f13893b = new AtomicBoolean();

    public e90(Context context, kw0 kw0Var, VersionInfoParcel versionInfoParcel, k00 k00Var) {
        this.f13894c = context;
        this.f13895d = kw0Var;
        this.f13896e = versionInfoParcel;
        this.f13897f = k00Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    public final void a() {
        a8 a8Var;
        ListenableFuture listenableFutureA;
        int i10;
        dt dtVarB;
        boolean andSet = this.f13893b.getAndSet(true);
        Executor executor = this.f13897f;
        if (!andSet) {
            if (((Boolean) fn.f14476o.o()).booleanValue()) {
                i10 = 2;
            } else {
                i10 = 3;
                if (!((Boolean) fn.f14477p.o()).booleanValue()) {
                    if (((Boolean) fn.f14475n.o()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(zzt.zzh().g().zzi().f12961e).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i10 = 2;
                            } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                                i10 = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i10 = 1;
                    }
                }
            }
            int i11 = i10 - 1;
            kw0 kw0Var = this.f13895d;
            Context context = this.f13894c;
            if (i11 == 1) {
                dtVarB = zzt.zzr().b(context, VersionInfoParcel.forPackage(), kw0Var);
            } else if (i11 == 2) {
                dtVarB = zzt.zzr().a(context, VersionInfoParcel.forPackage(), kw0Var);
            }
            jq jqVar = x10.f21684j;
            this.f13892a = new a8(context, dtVarB.a("google.afma.sdkConstants.getSdkConstants", jqVar, jqVar), this.f13896e, executor);
            this.f13898g = true;
        }
        if (this.f13898g && (a8Var = this.f13892a) != null) {
            if (!((Boolean) fn.f14463a.o()).booleanValue()) {
                listenableFutureA = a8Var.a();
            } else if (((AtomicBoolean) a8Var.f11930f).compareAndSet(false, true)) {
                ListenableFuture listenableFutureA2 = a8Var.a();
                listenableFutureA2.addListener(new d(a8Var, 16), l00.f16615h);
                listenableFutureA = listenableFutureA2;
            } else {
                listenableFutureA = be1.f12743b;
            }
            if (!this.f13899h && ((Boolean) zm.f22667i.o()).booleanValue()) {
                listenableFutureA.addListener(new x60(this, 3), executor);
            }
            v71.j(listenableFutureA, "persistFlagsClient", l00.f16615h);
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zzd(zzbc zzbcVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zze(String str) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
    }
}
