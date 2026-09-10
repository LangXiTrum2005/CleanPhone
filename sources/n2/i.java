package n2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.s1;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f46470f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s1 f46471g = new s1(new i0.a(28));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s1 f46472h = new s1(new i0.a(29));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f46473a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46477e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j2.n f46475c = new j2.n(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46474b = true;

    public final void a(ArrayList arrayList, int i10) {
        switch (i10) {
            case 0:
                arrayList.add(new u3.a());
                break;
            case 1:
                arrayList.add(new u3.c());
                break;
            case 2:
                arrayList.add(new u3.d(0));
                break;
            case 3:
                arrayList.add(new o2.a());
                break;
            case 4:
                k kVarM = f46471g.m(0);
                if (kVarM == null) {
                    arrayList.add(new s2.c());
                } else {
                    arrayList.add(kVarM);
                }
                break;
            case 5:
                arrayList.add(new t2.b());
                break;
            case 6:
                arrayList.add(new f3.e(this.f46475c, this.f46474b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new g3.d(0));
                break;
            case 8:
                j2.n nVar = this.f46475c;
                int i11 = this.f46474b ? 0 : 32;
                f0 f0Var = j0.f47265b;
                arrayList.add(new h3.g(nVar, i11, null, null, n1.f47281e, null));
                arrayList.add(new h3.k(this.f46475c, this.f46474b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new i3.c());
                break;
            case 10:
                arrayList.add(new u3.q());
                break;
            case 11:
                if (this.f46473a == null) {
                    f0 f0Var2 = j0.f47265b;
                    this.f46473a = n1.f47281e;
                }
                arrayList.add(new u3.t(1, !this.f46474b ? 1 : 0, this.f46475c, new l1.x(0L), new j0.h(0, this.f46473a)));
                break;
            case 12:
                arrayList.add(new v3.c());
                break;
            case 14:
                arrayList.add(new j3.a(this.f46476d));
                break;
            case 15:
                k kVarM2 = f46472h.m(new Object[0]);
                if (kVarM2 != null) {
                    arrayList.add(kVarM2);
                }
                break;
            case 16:
                arrayList.add(new p2.b(1 ^ (this.f46474b ? 1 : 0), this.f46475c));
                break;
            case 17:
                arrayList.add(new j3.a((byte) 0, 0));
                break;
            case 18:
                arrayList.add(new q2.a(1));
                break;
            case 19:
                arrayList.add(new j3.a((byte) 0, 1));
                break;
            case 20:
                arrayList.add(new u2.b(this.f46477e));
                break;
            case 21:
                arrayList.add(new q2.a(0));
                break;
        }
    }

    @Override // n2.n
    public final synchronized k[] createExtractors() {
        return d(Uri.EMPTY, new HashMap());
    }

    @Override // n2.n
    public final synchronized k[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f46470f;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iU = android.support.v4.media.session.a.u((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iU != -1) {
                a(arrayList, iU);
            }
            int iV = android.support.v4.media.session.a.v(uri);
            if (iV != -1 && iV != iU) {
                a(arrayList, iV);
            }
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                if (i11 != iU && i11 != iV) {
                    a(arrayList, i11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (k[]) arrayList.toArray(new k[0]);
    }
}
