package f8;

import an.h;
import cc.a2;
import com.google.android.gms.internal.ads.g10;
import ea.f2;
import go.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import xj.o;
import xj.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f40682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f40683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f40684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f40685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f40686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f40688g;

    public a(Map map) {
        this.f40682a = k.H(map, c8.a.f5957b);
        this.f40683b = k.H(map, c8.a.f5956a);
        this.f40684c = k.H(map, c8.a.f5958c);
        Object obj = map.get("createDate");
        n.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        this.f40685d = k.z((Map) obj);
        Object obj2 = map.get("updateDate");
        n.d(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        this.f40686e = k.z((Map) obj2);
        Object obj3 = map.get("containsPathModified");
        n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        this.f40687f = ((Boolean) obj3).booleanValue();
        Object obj4 = map.get("orders");
        n.d(obj4, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj4;
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            arrayList = o.M(new e("_id", false));
        } else {
            for (Object obj5 : list) {
                n.d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                Map map2 = (Map) obj5;
                Object obj6 = map2.get("type");
                n.d(obj6, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj6).intValue();
                Object obj7 = map2.get("asc");
                n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                String str = iIntValue != 0 ? iIntValue != 1 ? null : "date_modified" : "date_added";
                if (str != null) {
                    arrayList.add(new e(str, zBooleanValue));
                }
            }
        }
        this.f40688g = arrayList;
    }

    public static String V(ArrayList arrayList, c cVar, String str) {
        if (cVar.f40693c) {
            return "";
        }
        long j10 = cVar.f40691a;
        long j11 = cVar.f40692b;
        String strH = l1.d.h("AND ( ", str, " >= ? AND ", str, " <= ? )");
        long j12 = 1000;
        arrayList.add(String.valueOf(j10 / j12));
        arrayList.add(String.valueOf(j11 / j12));
        return strH;
    }

    @Override // cc.a2
    public final String B(int i10, ArrayList arrayList, boolean z10) {
        String str;
        boolean z11;
        String strConcat;
        String strConcat2;
        String strO;
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 & 1;
        boolean z12 = i11 == 1;
        int i12 = i10 & 2;
        boolean z13 = i12 == 2;
        int i13 = i10 & 4;
        boolean z14 = i13 == 4;
        f2 f2Var = this.f40683b;
        if (z12) {
            arrayList.add("1");
            if (f2Var.o().f40698e) {
                str = "media_type = ? ";
            } else {
                t.b0(arrayList, f2Var.F());
                str = "media_type = ?  AND width >= ? AND width <= ? AND height >= ? AND height <=?";
            }
        } else {
            str = "";
        }
        if (z13) {
            f2 f2Var2 = this.f40682a;
            g10 g10Var = (g10) f2Var2.f39410c;
            if (g10Var == null) {
                n.l("durationConstraint");
                throw null;
            }
            String str2 = g10Var.f14655c ? "( duration IS NULL OR ( duration >=? AND duration <=? ) )" : "duration >=? AND duration <=?";
            String[] strArrH = f2Var2.h();
            strConcat = "media_type = ? AND ".concat(str2);
            z11 = z14;
            arrayList.add("3");
            t.b0(arrayList, strArrH);
            if (!f2Var2.o().f40698e) {
                String[] strArrF = f2Var2.F();
                strConcat = wi.d.h(strConcat, " AND width >= ? AND width <= ? AND height >= ? AND height <=?");
                t.b0(arrayList, strArrF);
            }
        } else {
            z11 = z14;
            strConcat = "";
        }
        if (z11) {
            f2 f2Var3 = this.f40684c;
            g10 g10Var2 = (g10) f2Var3.f39410c;
            if (g10Var2 == null) {
                n.l("durationConstraint");
                throw null;
            }
            String str3 = g10Var2.f14655c ? "( duration IS NULL OR ( duration >=? AND duration <=? ) )" : "duration >=? AND duration <=?";
            String[] strArrH2 = f2Var3.h();
            strConcat2 = "media_type = ? AND ".concat(str3);
            arrayList.add("2");
            t.b0(arrayList, strArrH2);
        } else {
            strConcat2 = "";
        }
        if (z12) {
            sb2.append("( " + str + " )");
        }
        if (z13) {
            if (sb2.length() > 0) {
                sb2.append("OR ");
            }
            sb2.append("( " + strConcat + " )");
        }
        if (z11) {
            if (sb2.length() > 0) {
                sb2.append("OR ");
            }
            sb2.append("( " + strConcat2 + " )");
        }
        String str4 = "( " + ((Object) sb2) + " )";
        String strI = wi.d.i(V(arrayList, this.f40685d, "date_added"), " ", V(arrayList, this.f40686e, "date_modified"));
        if (!f2Var.o().f40698e && i11 == 1) {
            String strConcat3 = i12 == 2 ? "OR ( media_type = 3 )" : "";
            if (i13 == 4) {
                strConcat3 = strConcat3.concat(" OR ( media_type = 2 )");
            }
            strO = defpackage.e.o("AND (( media_type = 1 AND width > 0 AND height > 0 ) ", strConcat3, ")");
        } else {
            strO = "";
        }
        String str5 = str4 + " " + strI + " " + strO;
        if (h.T0(str5).toString().length() == 0) {
            return "";
        }
        return z10 ? defpackage.e.o(" AND ( ", str5, " )") : defpackage.e.o(" ( ", str5, " ) ");
    }

    @Override // cc.a2
    public final String E() {
        ArrayList arrayList = this.f40688g;
        if (arrayList.isEmpty()) {
            return null;
        }
        return xj.n.u0(arrayList, ",", null, null, new bh.a(3), 30);
    }

    @Override // cc.a2
    public final boolean q() {
        return this.f40687f;
    }
}
