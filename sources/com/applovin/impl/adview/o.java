package com.applovin.impl.adview;

import android.os.Looper;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.gms.internal.ads.kj1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import l1.w;
import l1.y;
import p1.h0;
import p1.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7522c;

    public /* synthetic */ o(int i10, int i11, Object obj) {
        this.f7520a = i11;
        this.f7522c = obj;
        this.f7521b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7520a;
        int i11 = this.f7521b;
        Object obj = this.f7522c;
        switch (i10) {
            case 0:
                ((a) obj).a(i11);
                break;
            case 1:
                ((com.applovin.impl.sdk.j.a) obj).a(i11);
                break;
            case 2:
                ((MaxAdPlacer) obj).a(i11);
                break;
            case 3:
                v6.c cVar = (v6.c) ((io.flutter.plugin.platform.c) obj).f43313b.f42854d;
                if ((i11 & 4) != 0) {
                    ((xi.p) cVar.f52487a).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                } else {
                    ((xi.p) cVar.f52487a).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                }
                break;
            case 4:
                h0 h0Var = (h0) obj;
                q1.f fVar = h0Var.f48069w;
                int i12 = ((p1.a) h0Var.f48042a[i11].f20972e).f47906b;
                fVar.I(fVar.H(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new ni.g(21));
                break;
            default:
                v vVar = ((l2.v) obj).f44942b;
                String str = y.f44830a;
                kj1 kj1Var = vVar.f48170a.C;
                p1.t tVar = new p1.t(i11);
                kj1Var.getClass();
                go.k.t(Looper.myLooper() == ((w) kj1Var.f16464c).f44825a.getLooper());
                kj1Var.f16462a++;
                kj1Var.q(new com.unity3d.services.ads.operation.show.b(24, kj1Var, tVar));
                kj1Var.s(Integer.valueOf(i11));
                break;
        }
    }

    public /* synthetic */ o(h0 h0Var, int i10, boolean z10) {
        this.f7520a = 4;
        this.f7522c = h0Var;
        this.f7521b = i10;
    }
}
