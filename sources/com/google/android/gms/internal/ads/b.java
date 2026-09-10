package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b f12557b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b f12558c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b f12559d = new b(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b f12560e = new b(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b f12561f = new b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b f12562g = new b(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b f12563h = new b(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b f12564i = new b(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b f12565j = new b(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b f12566k = new b(9);
    public static final /* synthetic */ b l = new b(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ b f12567m = new b(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b f12568n = new b(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ b f12569o = new b(17);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b f12570p = new b(19);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ b f12571q = new b(20);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b f12572r = new b(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12573a;

    public /* synthetic */ b(int i10) {
        this.f12573a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int i10 = 0;
        switch (this.f12573a) {
            case 0:
                return Integer.compare(((e) ((List) obj).get(0)).f13790f, ((e) ((List) obj2).get(0)).f13790f);
            case 1:
                return ((i) ((List) obj).get(0)).compareTo((i) ((List) obj2).get(0));
            case 2:
                List list = (List) obj2;
                List list2 = (List) obj;
                return t91.f(l.c((l) Collections.max(list2, f12565j), (l) Collections.max(list, f12561f))).b(list2.size(), list.size()).a((l) Collections.max(list2, f12562g), (l) Collections.max(list, f12563h), f12564i).e();
            case 3:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                if (num2.intValue() == -1) {
                    return num.intValue() == -1 ? 0 : -1;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
            case 4:
                return l.c((l) obj, (l) obj2);
            case 5:
                return l.d((l) obj, (l) obj2);
            case 6:
                return l.d((l) obj, (l) obj2);
            case 7:
                return l.d((l) obj, (l) obj2);
            case 8:
                return l.c((l) obj, (l) obj2);
            case 9:
                return Float.compare(((f0) obj).f14128c, ((f0) obj2).f14128c);
            case 10:
                return ((f0) obj).f14126a - ((f0) obj2).f14126a;
            case 11:
                return Integer.compare(((w8) obj).f21440a.f21777b, ((w8) obj2).f21440a.f21777b);
            case 12:
                return Long.compare(((v8) obj).f21100b, ((v8) obj2).f21100b);
            case 13:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 14:
                qc qcVar = (qc) obj;
                qc qcVar2 = (qc) obj2;
                int i11 = 0;
                while (true) {
                    length = qcVar.f19023a.length;
                    if (i10 < length && i11 < qcVar2.f19023a.length) {
                        int iCompare = Integer.compare(qc.f(qcVar.b(i10)), qc.f(qcVar2.b(i11)));
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        i10++;
                        i11++;
                    }
                }
                return Integer.compare(length, qcVar2.f19023a.length);
            case 15:
                pi piVar = (pi) obj;
                pi piVar2 = (pi) obj2;
                int i12 = piVar.f18664c - piVar2.f18664c;
                return i12 != 0 ? i12 : Long.compare(piVar.f18662a, piVar2.f18662a);
            case 16:
                mi miVar = (mi) obj;
                mi miVar2 = (mi) obj2;
                float f10 = miVar.f17448b;
                float f11 = miVar2.f17448b;
                if (f10 < f11) {
                    return -1;
                }
                if (f10 <= f11) {
                    float f12 = miVar.f17447a;
                    float f13 = miVar2.f17447a;
                    if (f12 < f13) {
                        return -1;
                    }
                    if (f12 <= f13) {
                        float f14 = (miVar.f17450d - f10) * (miVar.f17449c - f12);
                        float f15 = (miVar2.f17450d - f11) * (miVar2.f17449c - f13);
                        if (f14 > f15) {
                            return -1;
                        }
                        if (f14 >= f15) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 17:
                cy0 cy0Var = (cy0) obj2;
                cy0 cy0Var2 = (cy0) obj;
                int iCompare2 = Double.compare(cy0Var.f13309e, cy0Var2.f13309e);
                return iCompare2 == 0 ? Long.compare(cy0Var2.f13306b, cy0Var.f13306b) : iCompare2;
            case 18:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 19:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 20:
                return ((g22) obj2).f14674j - ((g22) obj).f14674j;
            default:
                return ((y42) Collections.max((List) obj)).compareTo((y42) Collections.max((List) obj2));
        }
    }
}
