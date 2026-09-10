package com.adjust.sdk.sig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements l2, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f6932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6933b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f6934c = {"[UNINITIALIZED]"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List[] f6935d = new List[1];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f6936e = new boolean[1];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f6937f = d0.f6931a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1 f6938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u1 f6939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1 f6940i;

    public d2(z zVar) {
        this.f6932a = zVar;
        final int i10 = 0;
        this.f6938g = v1.a(new g0(this) { // from class: com.adjust.sdk.sig.r3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d2 f7006b;

            {
                this.f7006b = this;
            }

            @Override // com.adjust.sdk.sig.g0
            public final Object a() {
                int i11 = i10;
                d2 d2Var = this.f7006b;
                switch (i11) {
                    case 0:
                        return d2.b(d2Var);
                    case 1:
                        return d2.c(d2Var);
                    default:
                        return Integer.valueOf(d2.a(d2Var));
                }
            }
        });
        final int i11 = 1;
        this.f6939h = v1.a(new g0(this) { // from class: com.adjust.sdk.sig.r3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d2 f7006b;

            {
                this.f7006b = this;
            }

            @Override // com.adjust.sdk.sig.g0
            public final Object a() {
                int i12 = i11;
                d2 d2Var = this.f7006b;
                switch (i12) {
                    case 0:
                        return d2.b(d2Var);
                    case 1:
                        return d2.c(d2Var);
                    default:
                        return Integer.valueOf(d2.a(d2Var));
                }
            }
        });
        final int i12 = 2;
        this.f6940i = v1.a(new g0(this) { // from class: com.adjust.sdk.sig.r3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d2 f7006b;

            {
                this.f7006b = this;
            }

            @Override // com.adjust.sdk.sig.g0
            public final Object a() {
                int i13 = i12;
                d2 d2Var = this.f7006b;
                switch (i13) {
                    case 0:
                        return d2.b(d2Var);
                    case 1:
                        return d2.c(d2Var);
                    default:
                        return Integer.valueOf(d2.a(d2Var));
                }
            }
        });
    }

    public static final int a(d2 d2Var) {
        int iHashCode = Arrays.hashCode((l2[]) d2Var.f6939h.getValue()) + 1231163861;
        int i10 = 1;
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (i11 <= 0) {
                break;
            }
            int i13 = i11 - 1;
            int i14 = i12 * 31;
            String strB = d2Var.b(1 - i11).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i12 = i14 + iHashCode2;
            i11 = i13;
        }
        int iHashCode3 = 1;
        while (i10 > 0) {
            int i15 = i10 - 1;
            int i16 = iHashCode3 * 31;
            p2 p2VarD = d2Var.b(d2Var.e() - i10).d();
            iHashCode3 = i16 + (p2VarD != null ? p2VarD.toString().hashCode() : 0);
            i10 = i15;
        }
        return (((iHashCode * 31) + i12) * 31) + iHashCode3;
    }

    @Override // com.adjust.sdk.sig.l2
    public final String b() {
        return "com.adjust.sdk.sig.755f89ae93acbe52c30f8a09";
    }

    @Override // com.adjust.sdk.sig.h
    public final Set c() {
        return this.f6937f.keySet();
    }

    @Override // com.adjust.sdk.sig.l2
    public final p2 d() {
        return e3.f6950a;
    }

    @Override // com.adjust.sdk.sig.l2
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return "com.adjust.sdk.sig.755f89ae93acbe52c30f8a09".equals(l2Var.b()) && Arrays.equals((l2[]) this.f6939h.getValue(), (l2[]) ((d2) obj).f6939h.getValue()) && 1 == l2Var.e() && g1.a(b(0).b(), l2Var.b(0).b()) && g1.a(b(0).d(), l2Var.b(0).d());
    }

    @Override // com.adjust.sdk.sig.l2
    public final List getAnnotations() {
        return c0.f6929a;
    }

    public final int hashCode() {
        return ((Number) this.f6940i.getValue()).intValue();
    }

    public final String toString() {
        return e2.a(this);
    }

    public static final r1[] b(d2 d2Var) {
        z zVar = d2Var.f6932a;
        return new r1[]{new z1()};
    }

    public static final l2[] c(d2 d2Var) {
        l2[] l2VarArr;
        z zVar = d2Var.f6932a;
        ArrayList arrayList = new ArrayList(0);
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return (arrayList == null || (l2VarArr = (l2[]) arrayList.toArray(new l2[0])) == null) ? c2.f6930a : l2VarArr;
    }

    @Override // com.adjust.sdk.sig.l2
    public final l2 b(int i10) {
        return ((r1[]) this.f6938g.getValue())[i10].a();
    }

    @Override // com.adjust.sdk.sig.l2
    public final String a(int i10) {
        return this.f6934c[i10];
    }
}
