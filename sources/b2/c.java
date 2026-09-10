package b2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oa.o0 f5240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f5241j;

    public c(a aVar, oa.o0 o0Var, b bVar) {
        this.f5232a = (String) aVar.f5214d;
        this.f5233b = aVar.f5211a;
        this.f5234c = (String) aVar.f5215e;
        this.f5235d = aVar.f5212b;
        this.f5237f = (String) aVar.f5216f;
        this.f5238g = (String) aVar.f5217g;
        this.f5236e = aVar.f5213c;
        this.f5239h = (String) aVar.f5218h;
        this.f5240i = o0Var;
        this.f5241j = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5232a.equals(cVar.f5232a) && this.f5233b == cVar.f5233b && this.f5234c.equals(cVar.f5234c) && this.f5235d == cVar.f5235d && this.f5236e == cVar.f5236e) {
                oa.o0 o0Var = cVar.f5240i;
                oa.o0 o0Var2 = this.f5240i;
                o0Var2.getClass();
                if (oa.q.g(o0Var, o0Var2) && this.f5241j.equals(cVar.f5241j) && Objects.equals(this.f5237f, cVar.f5237f) && Objects.equals(this.f5238g, cVar.f5238g) && Objects.equals(this.f5239h, cVar.f5239h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f5241j.hashCode() + ((this.f5240i.hashCode() + ((((d5.u.e((d5.u.e(217, 31, this.f5232a) + this.f5233b) * 31, 31, this.f5234c) + this.f5235d) * 31) + this.f5236e) * 31)) * 31)) * 31;
        String str = this.f5237f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5238g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5239h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
