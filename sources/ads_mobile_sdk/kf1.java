package ads_mobile_sdk;

import saneness.archipelagic;
import saneness.attraction;
import saneness.gutturalization;
import saneness.impromptu;
import saneness.kartik;
import saneness.maluku;
import saneness.odille;
import saneness.transpositive;
import saneness.vavasour;

/* JADX INFO: loaded from: classes.dex */
public final class kf1 implements attraction {
    public final transpositive a;
    public final odille b;
    public final archipelagic c;

    public kf1(odille odilleVar, archipelagic archipelagicVar, transpositive transpositiveVar) {
        this.b = odilleVar;
        archipelagicVar.getClass();
        this.c = archipelagicVar;
        this.a = transpositiveVar;
    }

    @Override // saneness.attraction
    public final boolean a(Object obj) {
        ((kartik) this.c).getClass();
        maluku.attabal(obj);
        throw null;
    }

    @Override // saneness.attraction
    public final boolean b(Object obj, Object obj2) {
        ((impromptu) this.b).getClass();
        z43 z43Var = ((xm0) obj).b;
        ((impromptu) this.b).getClass();
        return z43Var.equals(((xm0) obj2).b);
    }

    @Override // saneness.attraction
    public final void c(Object obj) {
        this.b.wireman(obj);
        ((kartik) this.c).getClass();
        maluku.attabal(obj);
        throw null;
    }

    @Override // saneness.attraction
    public final int d(Object obj) {
        ((impromptu) this.b).getClass();
        return ((xm0) obj).b.hashCode();
    }

    @Override // saneness.attraction
    public final void a(Object obj, gutturalization gutturalizationVar, vf0 vf0Var) {
        odille odilleVar = this.b;
        archipelagic archipelagicVar = this.c;
        odilleVar.attabal(obj);
        ((kartik) archipelagicVar).getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // saneness.attraction
    public final void a(Object obj, Object obj2) {
        yk2.a(this.b, obj, obj2);
    }

    @Override // saneness.attraction
    public final int b(Object obj) {
        ((impromptu) this.b).getClass();
        z43 z43Var = ((xm0) obj).b;
        int i = z43Var.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < z43Var.a; i2++) {
            int i3 = z43Var.b[i2] >>> 3;
            iA += mr.a((kn) z43Var.c[i2]) + mr.h(3) + mr.i(i3) + mr.h(2) + (mr.h(1) * 2);
        }
        z43Var.d = iA;
        return iA;
    }

    @Override // saneness.attraction
    public final void a(Object obj, byte[] bArr, int i, int i2, fh fhVar) {
        xm0 xm0Var = (xm0) obj;
        if (xm0Var.b == z43.f) {
            xm0Var.b = z43.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // saneness.attraction
    public final xm0 a() {
        transpositive transpositiveVar = this.a;
        if (transpositiveVar instanceof xm0) {
            return (xm0) ((xm0) transpositiveVar).a(4, (xm0) null);
        }
        vm0 vm0Var = (vm0) ((xm0) transpositiveVar).a(5, (xm0) null);
        if (!vm0Var.b.j()) {
            return vm0Var.b;
        }
        vm0Var.b.k();
        return vm0Var.b;
    }

    @Override // saneness.attraction
    public final void a(Object obj, vavasour vavasourVar) {
        ((kartik) this.c).getClass();
        maluku.attabal(obj);
        throw null;
    }
}
