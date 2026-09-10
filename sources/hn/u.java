package hn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements k4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42458b;

    public /* synthetic */ u(String str, int i10) {
        this.f42457a = i10;
        this.f42458b = str;
    }

    public static u b(l1.q qVar) {
        String str;
        qVar.N(2);
        int iZ = qVar.z();
        int i10 = iZ >> 1;
        int iZ2 = ((qVar.z() >> 3) & 31) | ((iZ & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbI = d5.u.i(str);
        sbI.append(i10 < 10 ? ".0" : ".");
        sbI.append(i10);
        return new u(l1.d.k(sbI, iZ2 < 10 ? ".0" : ".", iZ2), 2);
    }

    @Override // k4.c
    public String d() {
        return this.f42458b;
    }

    public String toString() {
        switch (this.f42457a) {
            case 0:
                return wi.d.k(new StringBuilder("<"), this.f42458b, '>');
            case 4:
                return this.f42458b;
            default:
                return super.toString();
        }
    }

    public u(String str) {
        this.f42457a = 3;
        this.f42458b = defpackage.e.n("UnityScar", str);
    }

    @Override // k4.c
    public void a(l4.b bVar) {
    }
}
