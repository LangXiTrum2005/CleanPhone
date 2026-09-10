package dg;

import cg.m;
import cg.p;
import com.google.android.gms.internal.ads.j30;
import com.ironsource.sdk.controller.y;
import ea.b0;
import j2.n;
import java.util.Collection;
import java.util.List;
import wf.g;
import wf.i;
import xj.k;
import zc.u;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ec.a f38854k = new ec.a("TranscodeEngine");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf.f f38855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ig.a f38856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.a f38857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lg.a f38858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg.a f38859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ec.a f38860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f38861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fc.f f38862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j30 f38863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fc.f f38864j;

    public d(wf.f fVar, ig.c dataSink, wf.e eVar, ne.a validator, n audioStretcher, b0 audioResampler, jj.d interpolator) {
        kotlin.jvm.internal.n.f(dataSink, "dataSink");
        wf.e eVar2 = dataSink.f43014d;
        kotlin.jvm.internal.n.f(validator, "validator");
        kotlin.jvm.internal.n.f(audioStretcher, "audioStretcher");
        kotlin.jvm.internal.n.f(audioResampler, "audioResampler");
        kotlin.jvm.internal.n.f(interpolator, "interpolator");
        this.f38855a = fVar;
        this.f38856b = dataSink;
        this.f38857c = validator;
        this.f38858d = audioStretcher;
        this.f38859e = audioResampler;
        ec.a aVar = new ec.a("TranscodeEngine");
        this.f38860f = aVar;
        u uVar = new u(eVar, fVar);
        wf.e eVar3 = (wf.e) uVar.f54880c;
        this.f38861g = uVar;
        fc.f fVar2 = new fc.f(fVar, uVar, new c(5, this, d.class, "createPipeline", "createPipeline(Lcom/otaliastudios/transcoder/common/TrackType;IILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", 0));
        this.f38862h = fVar2;
        wf.e eVar4 = (wf.e) fVar2.f40785g;
        this.f38863i = new j30(interpolator, fVar, uVar, eVar4);
        this.f38864j = new fc.f(fVar, uVar, eVar4);
        aVar.a("Created Tracks, Segments, Timer...");
        dataSink.f43012b.setOrientationHint(0);
        zm.e eVar5 = new zm.e(l.V(xj.n.g0(xj.n.j0(xj.n.B0((Iterable) fVar.p(), (Collection) fVar.m()))), new bh.a(2)));
        double[] dArr = (double[]) (!eVar5.hasNext() ? null : eVar5.next());
        if (dArr != null) {
            dataSink.f43012b.setLocation((float) dArr[0], (float) dArr[1]);
        }
        eVar3.getClass();
        vf.c cVar = vf.c.VIDEO;
        eVar2.b(cVar, (vf.b) eVar3.l(cVar));
        eVar3.getClass();
        vf.c cVar2 = vf.c.AUDIO;
        eVar2.b(cVar2, (vf.b) eVar3.l(cVar2));
        aVar.a("Set up the DataSink...");
    }

    public final void a() {
        try {
            fc.f fVar = this.f38862h;
            wf.e eVar = (wf.e) fVar.f40784f;
            eVar.getClass();
            g gVar = (g) eg.a.a(eVar, vf.c.VIDEO);
            if (gVar != null) {
                fVar.m(gVar);
            }
            g gVar2 = (g) eg.a.a(eVar, vf.c.AUDIO);
            if (gVar2 != null) {
                fVar.m(gVar2);
            }
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
        try {
            this.f38856b.release();
        } catch (Throwable th3) {
            t9.e.c(th3);
        }
        try {
            wf.f fVar2 = this.f38855a;
            ec.a aVar = fVar2.f53192a;
            aVar.a("release(): releasing...");
            fVar2.b((List) fVar2.p());
            fVar2.b((List) fVar2.m());
            fVar2.b(fVar2.f53193b);
            aVar.a("release(): released.");
        } catch (Throwable th4) {
            t9.e.c(th4);
        }
        try {
            this.f38864j.G();
        } catch (Throwable th5) {
            t9.e.c(th5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0127  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:48:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[SYNTHETIC] */
    public final void b(y yVar) throws InterruptedException {
        p pVar;
        boolean zA;
        boolean zA2;
        j30 j30Var = this.f38863i;
        long jA = j30Var.a();
        i iVar = (i) j30Var.f15953g;
        i iVar2 = (i) j30Var.f15952f;
        String str = "transcode(): about to start, durationUs=" + jA + ", audioUs=" + iVar2.o() + ", videoUs=" + iVar2.j();
        ec.a aVar = this.f38860f;
        aVar.a(str);
        long j10 = 0;
        while (true) {
            fc.f fVar = this.f38862h;
            vf.c cVar = vf.c.AUDIO;
            g gVarX = fVar.x(cVar);
            wf.e eVar = (wf.e) fVar.f40785g;
            vf.c cVar2 = vf.c.VIDEO;
            g gVarX2 = fVar.x(cVar2);
            boolean zA3 = (gVarX != null ? gVarX.a() : false) | (gVarX2 != null ? gVarX2.a() : false);
            boolean z10 = (zA3 || fVar.v(cVar2) || fVar.v(cVar)) ? false : true;
            eVar.getClass();
            int iIntValue = ((Number) eVar.l(cVar)).intValue() + 1;
            wf.f fVar2 = this.f38855a;
            int size = ((List) fVar2.m()).size();
            eVar.getClass();
            int iIntValue2 = ((Number) eVar.l(cVar2)).intValue() + 1;
            int size2 = ((List) fVar2.p()).size();
            iVar = iVar;
            StringBuilder sb2 = new StringBuilder("iteration #");
            sb2.append(j10);
            sb2.append(" audio=");
            sb2.append(iIntValue);
            long j11 = j10;
            l1.d.p(sb2, "/", size, " video=", iIntValue2);
            sb2.append("/");
            sb2.append(size2);
            sb2.append(" advanced=");
            sb2.append(zA3);
            sb2.append(" completed=");
            sb2.append(z10);
            aVar.c(sb2.toString());
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (z10) {
                yVar.invoke(Double.valueOf(1.0d));
                this.f38856b.stop();
                return;
            }
            if (!zA3) {
                if (gVarX != null) {
                    p pVar2 = gVarX.f53199d;
                    if (pVar2 == null || (pVar2 instanceof cg.n)) {
                        zA2 = false;
                    } else {
                        if (!(pVar2 instanceof m)) {
                            throw new aa.b((byte) 0, 20);
                        }
                        zA2 = ((m) pVar2).a();
                    }
                    if (zA2) {
                        if (gVarX2 == null) {
                            Thread.sleep(2L);
                        } else {
                            pVar = gVarX2.f53199d;
                            if (pVar != null) {
                                zA = false;
                            } else {
                                if (pVar instanceof m) {
                                    throw new aa.b((byte) 0, 20);
                                }
                                zA = ((m) pVar).a();
                            }
                            if (zA) {
                                Thread.sleep(2L);
                            }
                        }
                    }
                } else if (gVarX2 == null) {
                    Thread.sleep(2L);
                } else {
                    pVar = gVarX2.f53199d;
                    if (pVar != null || (pVar instanceof cg.n)) {
                        zA = false;
                    } else {
                        if (pVar instanceof m) {
                            throw new aa.b((byte) 0, 20);
                        }
                        zA = ((m) pVar).a();
                    }
                    if (zA) {
                        Thread.sleep(2L);
                    }
                }
            }
            if (zA3) {
                j10 = j11 + 1;
                if (j10 % 10 == 0) {
                    double dDoubleValue = ((Number) iVar.b()).doubleValue();
                    double dDoubleValue2 = ((Number) iVar.h()).doubleValue();
                    aVar.c("transcode(): got progress, video=" + dDoubleValue2 + " audio=" + dDoubleValue);
                    wf.e eVar2 = (wf.e) this.f38861g.f54882e;
                    eVar2.getClass();
                    yVar.invoke(Double.valueOf((dDoubleValue2 + dDoubleValue) / ((double) k.m0(new Object[]{eg.a.a(eVar2, cVar2), eg.a.a(eVar2, cVar)}).size())));
                }
            } else {
                j10 = j11;
            }
        }
    }

    public final boolean c() {
        vf.b bVar;
        u uVar = this.f38861g;
        wf.e eVar = (wf.e) uVar.f54880c;
        eVar.getClass();
        vf.b bVar2 = (vf.b) eVar.l(vf.c.VIDEO);
        wf.e eVar2 = (wf.e) uVar.f54880c;
        eVar2.getClass();
        vf.b bVar3 = (vf.b) eVar2.l(vf.c.AUDIO);
        this.f38857c.getClass();
        vf.b bVar4 = vf.b.f52575d;
        if (bVar2 == bVar4 || bVar3 == bVar4 || bVar2 == (bVar = vf.b.f52573b) || bVar3 == bVar) {
            return true;
        }
        this.f38860f.a("Validator has decided that the input is fine and transcoding is not necessary.");
        return false;
    }
}
