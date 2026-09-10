package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z32 extends e32 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f5 f22481r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a32[] f22482k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ci[] f22483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f22484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22485o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[][] f22486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b2.z f22487q;

    static {
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        List list = Collections.EMPTY_LIST;
        t3 t3Var = t3.f20138a;
        f22481r = new f5("MergingMediaSource", new b0(), null, new w1(), f7.B);
    }

    public z32(b02 b02Var, a32... a32VarArr) {
        this.f22482k = a32VarArr;
        this.f22484n = new ArrayList(Arrays.asList(a32VarArr));
        this.l = new ArrayList(a32VarArr.length);
        int i10 = 0;
        while (true) {
            int length = a32VarArr.length;
            if (i10 >= length) {
                this.f22483m = new ci[length];
                this.f22486p = new long[0][];
                new HashMap();
                ps1.v(new r91(0).isEmpty());
                return;
            }
            this.l.add(new ArrayList());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void a(f5 f5Var) {
        this.f22482k[0].a(f5Var);
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void b(q32 q32Var) {
        x32 x32Var = (x32) q32Var;
        int i10 = 0;
        while (true) {
            a32[] a32VarArr = this.f22482k;
            if (i10 >= a32VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i10);
            q32[] q32VarArr = x32Var.f21729a;
            boolean[] zArr = x32Var.f21730b;
            q32 q32Var2 = zArr[i10] ? ((t42) q32VarArr[i10]).f20163a : q32VarArr[i10];
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((y32) list.get(i11)).f22099b.equals(q32Var2)) {
                    list.remove(i11);
                    break;
                }
            }
            a32 a32Var = a32VarArr[i10];
            q32[] q32VarArr2 = x32Var.f21729a;
            a32Var.b(zArr[i10] ? ((t42) q32VarArr2[i10]).f20163a : q32VarArr2[i10]);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final q32 c(r32 r32Var, u uVar, long j10) {
        a32[] a32VarArr = this.f22482k;
        int length = a32VarArr.length;
        q32[] q32VarArr = new q32[length];
        ci[] ciVarArr = this.f22483m;
        int iE = ciVarArr[0].e(r32Var.f19359a);
        for (int i10 = 0; i10 < length; i10++) {
            r32 r32VarA = r32Var.a(ciVarArr[i10].f(iE));
            q32VarArr[i10] = a32VarArr[i10].c(r32VarA, uVar, j10 - this.f22486p[iE][i10]);
            ((List) this.l.get(i10)).add(new y32(r32VarA, q32VarArr[i10]));
        }
        return new x32(this.f22486p[iE], q32VarArr);
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final f5 f() {
        a32[] a32VarArr = this.f22482k;
        return a32VarArr.length > 0 ? a32VarArr[0].f() : f22481r;
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void h(ox1 ox1Var) {
        this.f13826j = uu0.o();
        int i10 = 0;
        while (true) {
            a32[] a32VarArr = this.f22482k;
            if (i10 >= a32VarArr.length) {
                return;
            }
            t(Integer.valueOf(i10), a32VarArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.e32, com.google.android.gms.internal.ads.a32
    public final void j() {
        super.j();
        Arrays.fill(this.f22483m, (Object) null);
        this.f22485o = -1;
        this.f22487q = null;
        ArrayList arrayList = this.f22484n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f22482k);
    }

    @Override // com.google.android.gms.internal.ads.e32, com.google.android.gms.internal.ads.a32
    public final void r() throws b2.z {
        b2.z zVar = this.f22487q;
        if (zVar != null) {
            throw zVar;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void s(Object obj, a32 a32Var, ci ciVar) {
        int iC;
        Integer num = (Integer) obj;
        if (this.f22487q != null) {
            return;
        }
        if (this.f22485o == -1) {
            iC = ciVar.c();
            this.f22485o = iC;
        } else {
            int iC2 = ciVar.c();
            int i10 = this.f22485o;
            if (iC2 != i10) {
                this.f22487q = new b2.z();
                return;
            }
            iC = i10;
        }
        int length = this.f22486p.length;
        ci[] ciVarArr = this.f22483m;
        if (length == 0) {
            this.f22486p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iC, ciVarArr.length);
        }
        ArrayList arrayList = this.f22484n;
        arrayList.remove(a32Var);
        ciVarArr[num.intValue()] = ciVar;
        if (arrayList.isEmpty()) {
            k(ciVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* synthetic */ r32 v(Object obj, r32 r32Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((y32) list.get(i10)).f22098a.equals(r32Var)) {
                return ((y32) ((List) arrayList.get(0)).get(i10)).f22098a;
            }
        }
        return null;
    }
}
