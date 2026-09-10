package wl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zl.n;
import zl.q;
import zl.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends zl.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f53436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f53437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f53438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f53439h;

    public static g f() {
        g gVar = new g();
        gVar.f53434c = 1;
        gVar.f53436e = "";
        gVar.f53437f = h.NONE;
        List list = Collections.EMPTY_LIST;
        gVar.f53438g = list;
        gVar.f53439h = list;
        return gVar;
    }

    @Override // zl.i
    public final zl.a a() {
        i iVarE = e();
        iVarE.isInitialized();
        return iVarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        i iVar = null;
        try {
            try {
                i.f53446n.getClass();
                g(new i(eVar));
                return this;
            } catch (q e10) {
                i iVar2 = (i) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    iVar = iVar2;
                    if (iVar != null) {
                        g(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (iVar != null) {
                g(iVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(n nVar) {
        g((i) nVar);
        return this;
    }

    public final Object clone() {
        g gVarF = f();
        gVarF.g(e());
        return gVarF;
    }

    public final i e() {
        i iVar = new i(this);
        int i10 = this.f53433b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        iVar.f53449c = this.f53434c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        iVar.f53450d = this.f53435d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        iVar.f53451e = this.f53436e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        iVar.f53452f = this.f53437f;
        if ((i10 & 16) == 16) {
            this.f53438g = Collections.unmodifiableList(this.f53438g);
            this.f53433b &= -17;
        }
        iVar.f53453g = this.f53438g;
        if ((this.f53433b & 32) == 32) {
            this.f53439h = Collections.unmodifiableList(this.f53439h);
            this.f53433b &= -33;
        }
        iVar.f53455i = this.f53439h;
        iVar.f53448b = i11;
        return iVar;
    }

    public final void g(i iVar) {
        if (iVar == i.f53445m) {
            return;
        }
        int i10 = iVar.f53448b;
        if ((i10 & 1) == 1) {
            int i11 = iVar.f53449c;
            this.f53433b = 1 | this.f53433b;
            this.f53434c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = iVar.f53450d;
            this.f53433b = 2 | this.f53433b;
            this.f53435d = i12;
        }
        if ((i10 & 4) == 4) {
            this.f53433b |= 4;
            this.f53436e = iVar.f53451e;
        }
        if ((i10 & 8) == 8) {
            h hVar = iVar.f53452f;
            hVar.getClass();
            this.f53433b = 8 | this.f53433b;
            this.f53437f = hVar;
        }
        if (!iVar.f53453g.isEmpty()) {
            if (this.f53438g.isEmpty()) {
                this.f53438g = iVar.f53453g;
                this.f53433b &= -17;
            } else {
                if ((this.f53433b & 16) != 16) {
                    this.f53438g = new ArrayList(this.f53438g);
                    this.f53433b |= 16;
                }
                this.f53438g.addAll(iVar.f53453g);
            }
        }
        if (!iVar.f53455i.isEmpty()) {
            if (this.f53439h.isEmpty()) {
                this.f53439h = iVar.f53455i;
                this.f53433b &= -33;
            } else {
                if ((this.f53433b & 32) != 32) {
                    this.f53439h = new ArrayList(this.f53439h);
                    this.f53433b |= 32;
                }
                this.f53439h.addAll(iVar.f53455i);
            }
        }
        this.f55044a = this.f55044a.h(iVar.f53447a);
    }
}
