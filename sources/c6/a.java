package c6;

import android.os.Binder;
import android.os.Handler;
import android.os.Process;
import com.adjust.sdk.AdjustFactory;
import com.google.android.gms.internal.measurement.ab;
import com.ironsource.sdk.controller.y;
import ea.b0;
import ea.e4;
import ea.f1;
import ea.s1;
import ea.u;
import ea.v0;
import eb.d0;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.n;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5926b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f5925a = i10;
        this.f5926b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Throwable th2;
        Exception exc;
        dg.d dVar;
        switch (this.f5925a) {
            case 0:
                synchronized (((d) this.f5926b)) {
                    try {
                        d dVar2 = (d) this.f5926b;
                        if (dVar2.f5942i == null) {
                            return null;
                        }
                        dVar2.t();
                        if (((d) this.f5926b).k()) {
                            ((d) this.f5926b).r();
                            ((d) this.f5926b).f5944k = 0;
                        }
                        return null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 1:
                return new ab(((f1) this.f5926b).l);
            case 2:
                s1 s1Var = (s1) this.f5926b;
                s1Var.f39761a.V();
                v0 v0Var = s1Var.f39761a.f39378h;
                e4.T(v0Var);
                v0Var.G0();
                throw new IllegalStateException("Unexpected call on client side");
            case 3:
                g1.a aVar = (g1.a) this.f5926b;
                aVar.f41338d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.f41339e.d();
                    Binder.flushPendingCommands();
                    aVar.a(null);
                    return null;
                } catch (Throwable th4) {
                    try {
                        aVar.f41337c.set(true);
                        throw th4;
                    } catch (Throwable th5) {
                        aVar.a(null);
                        throw th5;
                    }
                }
            case 4:
                uf.b bVar = (uf.b) this.f5926b;
                ec.a aVar2 = dg.d.f38854k;
                aVar2.a("transcode(): called...");
                d0 d0Var = new d0(bVar);
                Handler handler = (Handler) d0Var.f39976b;
                dg.d dVar3 = null;
                try {
                    wf.f fVar = new wf.f(bVar);
                    ig.c cVar = bVar.f52198a;
                    n.e(cVar, "getDataSink(...)");
                    wf.e eVar = new wf.e(bVar.f52202e, bVar.f52201d);
                    ne.a aVar3 = bVar.f52203f;
                    n.e(aVar3, "getValidator(...)");
                    jj.d dVar4 = bVar.f52204g;
                    n.e(dVar4, "getTimeInterpolator(...)");
                    j2.n nVar = bVar.f52205h;
                    n.e(nVar, "getAudioStretcher(...)");
                    b0 b0Var = bVar.f52206i;
                    n.e(b0Var, "getAudioResampler(...)");
                    dVar = new dg.d(fVar, cVar, eVar, aVar3, nVar, b0Var, dVar4);
                    try {
                        try {
                            if (dVar.c()) {
                                dVar.b(new y(d0Var, 1));
                                handler.post(new dg.e(d0Var, 0));
                            } else {
                                handler.post(new dg.e(d0Var, 1));
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            dVar3 = dVar;
                            if (dVar3 == null) {
                                throw th2;
                            }
                            dVar3.a();
                            throw th2;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (com.bumptech.glide.d.C(exc)) {
                            aVar2.b(1, exc, "Transcode canceled.");
                            handler.post(new dg.e(d0Var));
                            if (dVar != null) {
                            }
                            return null;
                        }
                        aVar2.b(3, exc, "Unexpected error while transcoding.");
                        handler.post(new i0(d0Var, false, exc, 4));
                        throw exc;
                    }
                    break;
                } catch (Exception e11) {
                    exc = e11;
                    dVar = null;
                } catch (Throwable th7) {
                    th2 = th7;
                }
                dVar.a();
                return null;
            default:
                try {
                    return ((Callable) this.f5926b).call();
                } catch (Throwable th8) {
                    AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th8.getMessage(), th8.getClass().getCanonicalName());
                    return null;
                }
        }
    }

    public a(s1 s1Var, u uVar, String str) {
        this.f5925a = 2;
        this.f5926b = s1Var;
    }
}
