package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.ads.d02;
import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.ey1;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.g51;
import com.google.android.gms.internal.ads.iw0;
import com.google.android.gms.internal.ads.iy1;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jy1;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.internal.ads.lj1;
import com.google.android.gms.internal.ads.lm;
import com.google.android.gms.internal.ads.ps1;
import com.google.android.gms.internal.ads.q10;
import com.google.android.gms.internal.ads.uu0;
import com.google.android.gms.internal.ads.ux1;
import com.google.android.gms.internal.ads.w00;
import com.google.android.gms.internal.ads.wy1;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.ads.ys0;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11750c;

    public /* synthetic */ q(int i10, int i11, Object obj) {
        this.f11748a = i11;
        this.f11749b = i10;
        this.f11750c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        je jeVarQ;
        boolean z10 = false;
        int i10 = 1;
        switch (this.f11748a) {
            case 0:
                ((r) this.f11750c).b(this.f11749b);
                break;
            case 1:
                int i11 = this.f11749b;
                fg fgVar = (fg) this.f11750c;
                if (i11 > 0) {
                    try {
                        Thread.sleep(i11 * 1000);
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = fgVar.f14387a;
                    jeVarQ = ps1.q(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    jeVarQ = null;
                }
                fg fgVar2 = (fg) this.f11750c;
                fgVar2.f14394h = jeVarQ;
                int i12 = this.f11749b;
                if (i12 < 4) {
                    if (jeVarQ == null || !jeVarQ.Z() || jeVarQ.u0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !jeVarQ.x0() || !jeVarQ.y0().z() || jeVarQ.y0().A() == -2) {
                        int i13 = i12 + 1;
                        if (fgVar2.l) {
                            Future<?> futureSubmit = fgVar2.f14388b.submit(new q(i13, i10, fgVar2));
                            if (i13 == 0) {
                                fgVar2.f14395i = futureSubmit;
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                lm lmVar = (lm) this.f11750c;
                int i14 = this.f11749b;
                yh0 yh0Var = lmVar.f17057d;
                if (yh0Var != null) {
                    lj1 lj1VarA = yh0Var.a();
                    lj1VarA.l("action", "cct_nav");
                    lj1VarA.l("cct_navs", String.valueOf(i14));
                    lj1VarA.m();
                }
                break;
            case 3:
                w00 w00Var = (w00) this.f11750c;
                int i15 = this.f11749b;
                d10 d10Var = w00Var.f21350q;
                if (d10Var != null) {
                    d10Var.onWindowVisibilityChanged(i15);
                }
                break;
            case 4:
                q10 q10Var = (q10) this.f11750c;
                int i16 = this.f11749b;
                d10 d10Var2 = q10Var.f18861g;
                if (d10Var2 != null) {
                    d10Var2.onWindowVisibilityChanged(i16);
                }
                break;
            case 5:
                ((g51) this.f11750c).b(this.f11749b + 1);
                break;
            case 6:
                wy1 wy1Var = (wy1) this.f11750c;
                int i17 = ((ux1) wy1Var.f21623a[this.f11749b].f20972e).f20942b;
                d02 d02Var = wy1Var.f21646v;
                d02Var.f(d02Var.o(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new ey1(z10 ? (byte) 1 : (byte) 0, 27));
                break;
            case 7:
                iw0 iw0Var = (iw0) this.f11750c;
                int i18 = this.f11749b;
                iw0Var.getClass();
                String str = uu0.f20901a;
                jy1 jy1Var = (jy1) iw0Var.f15865c;
                iy1 iy1Var = new iy1(i18);
                kj1 kj1Var = jy1Var.f16219a.B;
                ps1.c0(Looper.myLooper() == ((ys0) kj1Var.f16464c).f22362a.getLooper());
                kj1Var.f16462a++;
                zd1 zd1Var = new zd1(23, kj1Var, iy1Var);
                ys0 ys0Var = (ys0) kj1Var.f16463b;
                if (ys0Var.f22362a.getLooper().getThread().isAlive()) {
                    ys0Var.e(zd1Var);
                }
                kj1Var.x(Integer.valueOf(i18));
                break;
            case 8:
                ((SystemForegroundService) this.f11750c).f5042e.cancel(this.f11749b);
                break;
            case 9:
                t.t tVar = ((t.l) this.f11750c).f50295a;
                if (tVar.f50306e == null) {
                    tVar.f50306e = new t.q();
                }
                tVar.f50306e.A(this.f11749b);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f11750c;
                int size = arrayList.size();
                if (this.f11749b != 1) {
                    for (int i19 = 0; i19 < size; i19++) {
                        ((x0.e) arrayList.get(i19)).a();
                    }
                } else {
                    for (int i20 = 0; i20 < size; i20++) {
                        ((x0.e) arrayList.get(i20)).b();
                    }
                }
                break;
        }
    }

    public /* synthetic */ q(wy1 wy1Var, int i10, boolean z10) {
        this.f11748a = 6;
        this.f11750c = wy1Var;
        this.f11749b = i10;
    }

    public q(t.l lVar, int i10, CharSequence charSequence) {
        this.f11748a = 9;
        this.f11750c = lVar;
        this.f11749b = i10;
    }

    public q(List list, int i10, Throwable th2) {
        this.f11748a = 10;
        q1.e(list, "initCallbacks cannot be null");
        this.f11750c = new ArrayList(list);
        this.f11749b = i10;
    }
}
