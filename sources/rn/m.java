package rn;

import com.ironsource.sdk.controller.y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import xj.v;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class m implements pn.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f49727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49729d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f49730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f49731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f49732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f49733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f49734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f49735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f49736k;

    public m(String str, e eVar, int i10) {
        this.f49726a = str;
        this.f49727b = eVar;
        this.f49728c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f49730e = strArr;
        int i12 = this.f49728c;
        this.f49731f = new List[i12];
        this.f49732g = new boolean[i12];
        this.f49733h = w.f53867a;
        final int i13 = 0;
        jk.a aVar = new jk.a(this) { // from class: rn.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f49725b;

            {
                this.f49725b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
            @Override // jk.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f49725b.f49727b.c();
                    default:
                        m mVar = this.f49725b;
                        pn.d[] typeParams = (pn.d[]) mVar.f49735j.getValue();
                        kotlin.jvm.internal.n.f(typeParams, "typeParams");
                        int iHashCode = (mVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int iD = mVar.d();
                        int i14 = 1;
                        while (true) {
                            int iHashCode2 = 0;
                            if (iD > 0) {
                                int i15 = iD - 1;
                                int i16 = i14 * 31;
                                String strH = mVar.g(mVar.d() - iD).h();
                                if (strH != null) {
                                    iHashCode2 = strH.hashCode();
                                }
                                i14 = i16 + iHashCode2;
                                iD = i15;
                            } else {
                                int iD2 = mVar.d();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iD2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + i14) * 31) + iHashCode3);
                                    }
                                    int i17 = iD2 - 1;
                                    int i18 = iHashCode3 * 31;
                                    com.google.android.gms.internal.auth.o kind = mVar.g(mVar.d() - iD2).getKind();
                                    iHashCode3 = i18 + (kind != null ? kind.hashCode() : 0);
                                    iD2 = i17;
                                }
                            }
                        }
                        break;
                }
            }
        };
        wj.e eVar2 = wj.e.f53280a;
        this.f49734i = r9.b.t(eVar2, aVar);
        this.f49735j = r9.b.t(eVar2, new defpackage.c(this));
        final int i14 = 1;
        this.f49736k = r9.b.t(eVar2, new jk.a(this) { // from class: rn.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f49725b;

            {
                this.f49725b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
            @Override // jk.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f49725b.f49727b.c();
                    default:
                        m mVar = this.f49725b;
                        pn.d[] typeParams = (pn.d[]) mVar.f49735j.getValue();
                        kotlin.jvm.internal.n.f(typeParams, "typeParams");
                        int iHashCode = (mVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int iD = mVar.d();
                        int i15 = 1;
                        while (true) {
                            int iHashCode2 = 0;
                            if (iD > 0) {
                                int i16 = iD - 1;
                                int i17 = i15 * 31;
                                String strH = mVar.g(mVar.d() - iD).h();
                                if (strH != null) {
                                    iHashCode2 = strH.hashCode();
                                }
                                i15 = i17 + iHashCode2;
                                iD = i16;
                            } else {
                                int iD2 = mVar.d();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iD2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + i15) * 31) + iHashCode3);
                                    }
                                    int i18 = iD2 - 1;
                                    int i19 = iHashCode3 * 31;
                                    com.google.android.gms.internal.auth.o kind = mVar.g(mVar.d() - iD2).getKind();
                                    iHashCode3 = i19 + (kind != null ? kind.hashCode() : 0);
                                    iD2 = i18;
                                }
                            }
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // rn.b
    public final Set a() {
        return this.f49733h.keySet();
    }

    @Override // pn.d
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // pn.d
    public final int c(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        Integer num = (Integer) this.f49733h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // pn.d
    public final int d() {
        return this.f49728c;
    }

    @Override // pn.d
    public final String e(int i10) {
        return this.f49730e[i10];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, wj.d] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, wj.d] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            pn.d dVar = (pn.d) obj;
            if (this.f49726a.equals(dVar.h()) && Arrays.equals((pn.d[]) this.f49735j.getValue(), (pn.d[]) ((m) obj).f49735j.getValue())) {
                int iD = dVar.d();
                int i10 = this.f49728c;
                if (i10 == iD) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (kotlin.jvm.internal.n.a(g(i11).h(), dVar.g(i11).h()) && kotlin.jvm.internal.n.a(g(i11).getKind(), dVar.g(i11).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pn.d
    public final List f(int i10) {
        List list = this.f49731f[i10];
        return list == null ? v.f53866a : list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // pn.d
    public final pn.d g(int i10) {
        return ((nn.a[]) this.f49734i.getValue())[i10].d();
    }

    @Override // pn.d
    public final List getAnnotations() {
        return v.f53866a;
    }

    @Override // pn.d
    public final com.google.android.gms.internal.auth.o getKind() {
        return pn.f.f48503e;
    }

    @Override // pn.d
    public final String h() {
        return this.f49726a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    public int hashCode() {
        return ((Number) this.f49736k.getValue()).intValue();
    }

    @Override // pn.d
    public final boolean i(int i10) {
        return this.f49732g[i10];
    }

    @Override // pn.d
    public boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z10) {
        int i10 = this.f49729d + 1;
        this.f49729d = i10;
        String[] strArr = this.f49730e;
        strArr[i10] = str;
        this.f49732g[i10] = z10;
        this.f49731f[i10] = null;
        if (i10 == this.f49728c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f49733h = map;
        }
    }

    public final String toString() {
        return xj.n.u0(com.bumptech.glide.d.O(0, this.f49728c), ", ", this.f49726a.concat("("), ")", new y(this, 7), 24);
    }
}
