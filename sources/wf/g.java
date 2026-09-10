package wf;

import cg.k;
import cg.l;
import cg.m;
import cg.o;
import cg.p;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import wj.r;
import xj.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf.c f53196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cg.e f53198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f53199d;

    public g(vf.c cVar, int i10, cg.e pipeline) {
        n.f(pipeline, "pipeline");
        this.f53196a = cVar;
        this.f53197b = i10;
        this.f53198c = pipeline;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public final boolean a() {
        p nVar;
        String str;
        boolean z10;
        m mVar;
        cg.e eVar = this.f53198c;
        ec.a aVar = eVar.f6386b;
        aVar.c("LOOP");
        ArrayList arrayList = eVar.f6385a;
        int size = arrayList.size();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            r rVar = r.f53297a;
            if (i10 >= size) {
                if (arrayList.isEmpty() || ((cg.f) xj.n.w0(arrayList)).f6390d) {
                    nVar = new l(rVar);
                } else {
                    nVar = z11 ? new cg.n(rVar) : new o(z12);
                }
                this.f53199d = nVar;
                return nVar instanceof cg.n;
            }
            cg.f fVar = (cg.f) arrayList.get(i10);
            boolean z13 = i10 == 0;
            j jVar = fVar.f6389c;
            cg.a aVar2 = fVar.f6387a;
            String str2 = fVar.f6388b;
            boolean z14 = true;
            if (fVar.f6390d) {
                int i11 = fVar.f6392f;
                if (fVar.f6390d) {
                    str = "(eos)";
                } else {
                    str = "";
                }
                aVar.c(str2 + " SKIP #" + i11 + " " + str);
            } else {
                if (z13) {
                    jVar.clear();
                    jVar.addLast(new cg.n(rVar));
                }
                if (!jVar.isEmpty() || (aVar2 instanceof cg.j)) {
                    aVar.c(str2 + " START #" + fVar.f6392f + " (" + jVar.f53861c + " pending)");
                    fVar.f6391e = false;
                    while (true) {
                        if (!jVar.isEmpty() && !fVar.f6390d) {
                            cg.n nVar2 = (cg.n) jVar.removeFirst();
                            p pVarC = aVar2.c(nVar2);
                            if (!(pVarC instanceof cg.n)) {
                                if (pVarC instanceof o) {
                                    jVar.addFirst(nVar2);
                                    mVar = (m) pVarC;
                                } else {
                                    if (!(pVarC instanceof k)) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    mVar = (m) pVarC;
                                }
                                z10 = true;
                                break;
                            }
                            fVar.f6392f++;
                            fVar.f6391e = z14;
                            fVar.f6390d = pVarC instanceof l;
                            j jVar2 = fVar.f6393g;
                            if (jVar2 != null) {
                                jVar2.addLast(pVarC);
                            }
                            z14 = true;
                        } else {
                            if (fVar.f6391e || fVar.f6390d || !(aVar2 instanceof cg.j)) {
                                z10 = true;
                            } else {
                                p pVarH = ((cg.j) aVar2).h();
                                if (!(pVarH instanceof cg.n)) {
                                    z10 = true;
                                    if (!(pVarH instanceof m)) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    mVar = (m) pVarH;
                                    break;
                                }
                                z10 = true;
                                fVar.f6392f++;
                                fVar.f6391e = true;
                                fVar.f6390d = pVarH instanceof l;
                                j jVar3 = fVar.f6393g;
                                if (jVar3 != null) {
                                    jVar3.addLast(pVarH);
                                }
                            }
                            mVar = null;
                            break;
                        }
                    }
                    if (mVar != null) {
                        z12 = (z12 || mVar.a()) ? z10 : false;
                        aVar.c(str2 + " FAILED #" + fVar.f6392f);
                    } else {
                        aVar.c(str2 + " SUCCESS #" + fVar.f6392f + " " + (fVar.f6390d ? "(eos)" : ""));
                    }
                    z11 = (z11 || fVar.f6391e) ? z10 : false;
                } else {
                    int i12 = fVar.f6392f;
                    if (fVar.f6390d) {
                        str = "(eos)";
                    } else {
                        str = "";
                    }
                    aVar.c(str2 + " SKIP #" + i12 + " " + str);
                }
            }
            i10++;
        }
    }
}
