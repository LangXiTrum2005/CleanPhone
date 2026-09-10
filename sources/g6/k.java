package g6;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f41639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s6.a f41641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0.b f41642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41643e;

    public k(Class cls, Class cls2, Class cls3, List list, s6.a aVar, l0.b bVar) {
        this.f41639a = cls;
        this.f41640b = list;
        this.f41641c = aVar;
        this.f41642d = bVar;
        this.f41643e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final a0 a(int i10, int i11, b2.w wVar, com.bumptech.glide.load.data.g gVar, e6.i iVar) {
        a0 a0VarA;
        e6.m mVar;
        int iE;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object fVar;
        String str;
        l0.b bVar = this.f41642d;
        Object objG = bVar.g();
        a7.h.c(objG, "Argument must not be null");
        List list = (List) objG;
        try {
            a0 a0VarB = b(gVar, i10, i11, iVar, list);
            bVar.e(list);
            j jVar = (j) wVar.f5411c;
            int i12 = wVar.f5410b;
            i iVar2 = jVar.f41614a;
            Class<?> cls = a0VarB.get().getClass();
            e6.l lVarD = null;
            if (i12 != 4) {
                e6.m mVarE = iVar2.e(cls);
                mVar = mVarE;
                a0VarA = mVarE.a(jVar.f41621h, a0VarB, jVar.l, jVar.f41625m);
            } else {
                a0VarA = a0VarB;
                mVar = null;
            }
            if (!a0VarB.equals(a0VarA)) {
                a0VarB.b();
            }
            if (iVar2.f41599c.a().f10483d.D(a0VarA.c()) != null) {
                lVarD = iVar2.f41599c.a().f10483d.D(a0VarA.c());
                if (lVarD == null) {
                    throw new com.bumptech.glide.g(a0VarA.c());
                }
                iE = lVarD.e(jVar.f41627o);
            } else {
                iE = 3;
            }
            e6.l lVar = lVarD;
            e6.f fVar2 = jVar.f41633u;
            ArrayList arrayListB = iVar2.b();
            int size = arrayListB.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                if (((k6.q) arrayListB.get(i13)).f44369a.equals(fVar2)) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            switch (jVar.f41626n.f41647a) {
                default:
                    z11 = true;
                    if (((z10 || i12 != 3) && i12 != 1) || iE != 2) {
                    }
                case 0:
                case 1:
                    z11 = false;
                    break;
            }
            if (z11) {
                if (lVar == null) {
                    throw new com.bumptech.glide.g(a0VarA.get().getClass());
                }
                int iC = v0.i.c(iE);
                if (iC == 0) {
                    z12 = false;
                    z13 = true;
                    fVar = new f(jVar.f41633u, jVar.f41622i);
                } else {
                    if (iC != 1) {
                        if (iE == 1) {
                            str = "SOURCE";
                        } else if (iE != 2) {
                            str = iE != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                    }
                    z13 = true;
                    z12 = false;
                    fVar = new c0(iVar2.f41599c.f10466a, jVar.f41633u, jVar.f41622i, jVar.l, jVar.f41625m, mVar, cls, jVar.f41627o);
                }
                z zVar = (z) z.f41712e.g();
                zVar.f41716d = z12;
                zVar.f41715c = z13;
                zVar.f41714b = a0VarA;
                g9.k kVar = jVar.f41619f;
                kVar.f41770b = fVar;
                kVar.f41771c = lVar;
                kVar.f41772d = zVar;
                a0VarA = zVar;
            }
            return this.f41641c.a(a0VarA, iVar);
        } catch (Throwable th2) {
            bVar.e(list);
            throw th2;
        }
    }

    public final a0 b(com.bumptech.glide.load.data.g gVar, int i10, int i11, e6.i iVar, List list) throws w {
        List list2 = this.f41640b;
        int size = list2.size();
        a0 a0VarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            e6.k kVar = (e6.k) list2.get(i12);
            try {
                if (kVar.b(gVar.a(), iVar)) {
                    a0VarA = kVar.a(gVar.a(), i10, i11, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e10);
                }
                list.add(e10);
            }
            if (a0VarA != null) {
                break;
            }
        }
        if (a0VarA != null) {
            return a0VarA;
        }
        throw new w(this.f41643e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f41639a + ", decoders=" + this.f41640b + ", transcoder=" + this.f41641c + '}';
    }
}
