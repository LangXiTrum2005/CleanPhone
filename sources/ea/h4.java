package ea;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.i9;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.ka;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.la;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.r9;
import com.google.android.gms.internal.measurement.t9;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.v9;
import com.google.android.gms.internal.measurement.x9;
import com.google.android.gms.internal.measurement.y9;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h4 extends z3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39466e;

    public static u K0(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleL0 = L0(bVar.f23307c, true);
        String string = (!bundleL0.containsKey("_o") || (obj = bundleL0.get("_o")) == null) ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : obj.toString();
        String strG = z1.g(bVar.f23305a, z1.f39936a, z1.f39941f);
        if (strG == null) {
            strG = bVar.f23305a;
        }
        return new u(strG, new t(bundleL0), string, bVar.f23306b, 0L);
    }

    public static Bundle L0(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(L0((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void O0(u9 u9Var, String str, Long l) {
        List listI = u9Var.i();
        int i10 = 0;
        while (true) {
            if (i10 >= listI.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((y9) listI.get(i10)).v())) {
                break;
            } else {
                i10++;
            }
        }
        x9 x9VarG = y9.G();
        x9VarG.i(str);
        x9VarG.k(l.longValue());
        if (i10 < 0) {
            u9Var.m(x9VarG);
        } else {
            u9Var.b();
            ((v9) u9Var.f23489b).L(i10, (y9) x9VarG.f());
        }
    }

    public static final Bundle P0(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y9 y9Var = (y9) it.next();
            String strV = y9Var.v();
            if (y9Var.C()) {
                bundle.putDouble(strV, y9Var.D());
            } else if (y9Var.A()) {
                bundle.putFloat(strV, y9Var.B());
            } else if (y9Var.w()) {
                bundle.putString(strV, y9Var.x());
            } else if (y9Var.y()) {
                bundle.putLong(strV, y9Var.z());
            }
        }
        return bundle;
    }

    public static final y9 Q0(v9 v9Var, String str) {
        for (y9 y9Var : v9Var.w()) {
            if (y9Var.v().equals(str)) {
                return y9Var;
            }
        }
        return null;
    }

    public static final String R0(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable S0(v9 v9Var, String str) {
        y9 y9VarQ0 = Q0(v9Var, str);
        if (y9VarQ0 == null) {
            return null;
        }
        return Y0(y9VarQ0);
    }

    public static final void V0(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final void W0(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String X0(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable Y0(y9 y9Var) {
        if (y9Var.w()) {
            return y9Var.x();
        }
        if (y9Var.y()) {
            return Long.valueOf(y9Var.z());
        }
        if (y9Var.C()) {
            return Double.valueOf(y9Var.D());
        }
        if (y9Var.F() > 0) {
            return t1(y9Var.E());
        }
        return null;
    }

    public static final void Z0(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                W0(builder, str3, string, hashSet);
            }
        }
    }

    public static final void a1(StringBuilder sb2, String str, ga gaVar) {
        if (gaVar == null) {
            return;
        }
        V0(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (gaVar.x() != 0) {
            V0(sb2, 4);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l : gaVar.w()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (gaVar.v() != 0) {
            V0(sb2, 4);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l10 : gaVar.u()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (gaVar.z() != 0) {
            V0(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (t9 t9Var : gaVar.y()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(t9Var.u() ? Integer.valueOf(t9Var.v()) : null);
                sb2.append(":");
                sb2.append(t9Var.w() ? Long.valueOf(t9Var.x()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (gaVar.B() != 0) {
            V0(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (ia iaVar : gaVar.A()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(iaVar.u() ? Integer.valueOf(iaVar.v()) : null);
                sb2.append(": [");
                Iterator it = iaVar.w().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i18 = i19;
                }
                sb2.append(X3.j.f27836e);
                i16 = i17;
            }
            sb2.append("}\n");
        }
        V0(sb2, 3);
        sb2.append("}\n");
    }

    public static final void b1(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        V0(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void c1(StringBuilder sb2, int i10, String str, n8 n8Var) {
        String str2;
        if (n8Var == null) {
            return;
        }
        V0(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (n8Var.u()) {
            int iE = n8Var.E();
            if (iE == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iE == 2) {
                str2 = "LESS_THAN";
            } else if (iE != 3) {
                str2 = iE != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            b1(sb2, i10, "comparison_type", str2);
        }
        if (n8Var.v()) {
            b1(sb2, i10, "match_as_float", Boolean.valueOf(n8Var.w()));
        }
        if (n8Var.x()) {
            b1(sb2, i10, "comparison_value", n8Var.y());
        }
        if (n8Var.z()) {
            b1(sb2, i10, "min_comparison_value", n8Var.A());
        }
        if (n8Var.B()) {
            b1(sb2, i10, "max_comparison_value", n8Var.C());
        }
        V0(sb2, i10);
        sb2.append("}\n");
    }

    public static boolean k1(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean l1(com.google.android.gms.internal.measurement.r1 r1Var, int i10) {
        if (i10 < r1Var.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) r1Var.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList m1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.g1 r1(com.google.android.gms.internal.measurement.g1 g1Var, byte[] bArr) throws com.google.android.gms.internal.measurement.u1 {
        com.google.android.gms.internal.measurement.z0 z0VarA = com.google.android.gms.internal.measurement.z0.a();
        if (z0VarA != null) {
            g1Var.getClass();
            g1Var.h(bArr, bArr.length, z0VarA);
            return g1Var;
        }
        g1Var.getClass();
        int length = bArr.length;
        int i10 = com.google.android.gms.internal.measurement.n0.f23760a;
        g1Var.h(bArr, length, com.google.android.gms.internal.measurement.z0.f24190b);
        return g1Var;
    }

    public static int s1(ca caVar, String str) {
        for (int i10 = 0; i10 < ((da) caVar.f23489b).b2(); i10++) {
            if (str.equals(((da) caVar.f23489b).c2(i10).w())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] t1(com.google.android.gms.internal.measurement.s1 s1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = s1Var.iterator();
        while (it.hasNext()) {
            y9 y9Var = (y9) it.next();
            if (y9Var != null) {
                Bundle bundle = new Bundle();
                for (y9 y9Var2 : y9Var.E()) {
                    if (y9Var2.w()) {
                        bundle.putString(y9Var2.v(), y9Var2.x());
                    } else if (y9Var2.y()) {
                        bundle.putLong(y9Var2.v(), y9Var2.z());
                    } else if (y9Var2.C()) {
                        bundle.putDouble(y9Var2.v(), y9Var2.D());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap u1(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(u1((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(u1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(u1((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void M0(Map map) {
        long epochMilli;
        m1 m1Var = (m1) this.f3623a;
        String strR0 = R0("Date", map);
        if (TextUtils.isEmpty(strR0)) {
            return;
        }
        try {
            epochMilli = ZonedDateTime.parse(strR0, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(strR0, "Unable to parse header time, time");
            epochMilli = 0;
        }
        if (epochMilli > 0) {
            m1Var.f39592k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            G0();
            if (this.f39466e == 0) {
                this.f39465d = jElapsedRealtime;
                this.f39466e = epochMilli;
            }
        }
    }

    public final long N0(long j10) {
        G0();
        long j11 = this.f39466e;
        if (j11 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 - this.f39465d) + j10;
    }

    public final void T0(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = s1Var.iterator();
        while (it.hasNext()) {
            y9 y9Var = (y9) it.next();
            if (y9Var != null) {
                V0(sb2, i11);
                sb2.append("param {\n");
                b1(sb2, i11, "name", y9Var.u() ? ((m1) this.f3623a).f39591j.b(y9Var.v()) : null);
                b1(sb2, i11, "string_value", y9Var.w() ? y9Var.x() : null);
                b1(sb2, i11, "int_value", y9Var.y() ? Long.valueOf(y9Var.z()) : null);
                b1(sb2, i11, "double_value", y9Var.C() ? Double.valueOf(y9Var.D()) : null);
                if (y9Var.F() > 0) {
                    T0(sb2, i11, y9Var.E());
                }
                V0(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void U0(StringBuilder sb2, int i10, l8 l8Var) {
        String str;
        if (l8Var == null) {
            return;
        }
        V0(sb2, i10);
        sb2.append("filter {\n");
        if (l8Var.y()) {
            b1(sb2, i10, "complement", Boolean.valueOf(l8Var.z()));
        }
        if (l8Var.A()) {
            b1(sb2, i10, "param_name", ((m1) this.f3623a).f39591j.b(l8Var.B()));
        }
        if (l8Var.u()) {
            int i11 = i10 + 1;
            q8 q8VarV = l8Var.v();
            if (q8VarV != null) {
                V0(sb2, i11);
                sb2.append("string_filter {\n");
                if (q8VarV.u()) {
                    switch (q8VarV.C()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    b1(sb2, i11, "match_type", str);
                }
                if (q8VarV.v()) {
                    b1(sb2, i11, "expression", q8VarV.w());
                }
                if (q8VarV.x()) {
                    b1(sb2, i11, "case_sensitive", Boolean.valueOf(q8VarV.y()));
                }
                if (q8VarV.A() > 0) {
                    V0(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : q8VarV.z()) {
                        V0(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                V0(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (l8Var.w()) {
            c1(sb2, i10 + 1, "number_filter", l8Var.x());
        }
        V0(sb2, i10);
        sb2.append("}\n");
    }

    public final void d1(la laVar, Object obj) {
        k9.c0.h(obj);
        laVar.b();
        ((ma) laVar.f23489b).J();
        laVar.b();
        ((ma) laVar.f23489b).L();
        laVar.b();
        ((ma) laVar.f23489b).N();
        if (obj instanceof String) {
            laVar.b();
            ((ma) laVar.f23489b).I((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            laVar.b();
            ((ma) laVar.f23489b).K(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            laVar.b();
            ((ma) laVar.f23489b).M(dDoubleValue);
        } else {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void e1(x9 x9Var, Object obj) {
        x9Var.b();
        ((y9) x9Var.f23489b).J();
        x9Var.b();
        ((y9) x9Var.f23489b).L();
        x9Var.b();
        ((y9) x9Var.f23489b).N();
        x9Var.b();
        ((y9) x9Var.f23489b).Q();
        if (obj instanceof String) {
            x9Var.j((String) obj);
            return;
        }
        if (obj instanceof Long) {
            x9Var.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            x9Var.b();
            ((y9) x9Var.f23489b).M(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                x9 x9VarG = y9.G();
                for (String str : bundle.keySet()) {
                    x9 x9VarG2 = y9.G();
                    x9VarG2.i(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        x9VarG2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        x9VarG2.j((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        x9VarG2.b();
                        ((y9) x9VarG2.f23489b).M(dDoubleValue2);
                    }
                    x9VarG.b();
                    ((y9) x9VarG.f23489b).O((y9) x9VarG2.f());
                }
                if (((y9) x9VarG.f23489b).F() > 0) {
                    arrayList.add((y9) x9VarG.f());
                }
            }
        }
        x9Var.b();
        ((y9) x9Var.f23489b).P(arrayList);
    }

    public final t3 f1(String str, ca caVar, u9 u9Var, String str2) {
        int iIndexOf;
        v4.a();
        m1 m1Var = (m1) this.f3623a;
        g gVar = m1Var.f39585d;
        if (!gVar.R0(str, d0.O0)) {
            return null;
        }
        m1Var.f39592k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(gVar.N0(str, d0.t0).split(",")));
        e4 e4Var = this.f39807b;
        b4 b4Var = e4Var.f39380j;
        f1 f1Var = e4Var.f39371a;
        f1 f1Var2 = b4Var.f39807b.f39371a;
        e4.T(f1Var2);
        String strT0 = f1Var2.T0(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((m1) b4Var.f3623a).f39585d;
        builder.scheme(gVar2.N0(str, d0.f39319m0));
        if (TextUtils.isEmpty(strT0)) {
            builder.authority(gVar2.N0(str, d0.f39321n0));
        } else {
            String strN0 = gVar2.N0(str, d0.f39321n0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strT0).length() + 1 + String.valueOf(strN0).length());
            sb2.append(strT0);
            sb2.append(".");
            sb2.append(strN0);
            builder.authority(sb2.toString());
        }
        builder.path(gVar2.N0(str, d0.f39323o0));
        W0(builder, "gmp_app_id", ((da) caVar.f23489b).J(), hashSet);
        gVar.M0();
        W0(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strD = ((da) caVar.f23489b).D();
        c0 c0Var = d0.R0;
        if (gVar.R0(str, c0Var)) {
            e4.T(f1Var);
            if (f1Var.a1(str)) {
                strD = "";
            }
        }
        W0(builder, "app_instance_id", strD, hashSet);
        W0(builder, "rdid", ((da) caVar.f23489b).A(), hashSet);
        W0(builder, "bundle_id", caVar.p(), hashSet);
        String strO = u9Var.o();
        String strG = z1.g(strO, z1.f39941f, z1.f39936a);
        if (true != TextUtils.isEmpty(strG)) {
            strO = strG;
        }
        W0(builder, "app_event_name", strO, hashSet);
        W0(builder, "app_version", String.valueOf(((da) caVar.f23489b).P()), hashSet);
        String strO2 = ((da) caVar.f23489b).o2();
        if (gVar.R0(str, c0Var)) {
            e4.T(f1Var);
            if (f1Var.Z0(str) && !TextUtils.isEmpty(strO2) && (iIndexOf = strO2.indexOf(".")) != -1) {
                strO2 = strO2.substring(0, iIndexOf);
            }
        }
        W0(builder, "os_version", strO2, hashSet);
        W0(builder, "timestamp", String.valueOf(u9Var.q()), hashSet);
        if (((da) caVar.f23489b).C()) {
            W0(builder, O6.f26746s, "1", hashSet);
        }
        W0(builder, "privacy_sandbox_version", String.valueOf(((da) caVar.f23489b).L0()), hashSet);
        W0(builder, "trigger_uri_source", "1", hashSet);
        W0(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        W0(builder, "request_uuid", str2, hashSet);
        List<y9> listI = u9Var.i();
        Bundle bundle = new Bundle();
        for (y9 y9Var : listI) {
            String strV = y9Var.v();
            if (y9Var.C()) {
                bundle.putString(strV, String.valueOf(y9Var.D()));
            } else if (y9Var.A()) {
                bundle.putString(strV, String.valueOf(y9Var.B()));
            } else if (y9Var.w()) {
                bundle.putString(strV, y9Var.x());
            } else if (y9Var.y()) {
                bundle.putString(strV, String.valueOf(y9Var.z()));
            }
        }
        Z0(builder, gVar.N0(str, d0.f39330s0).split("\\|"), bundle, hashSet);
        List<ma> listUnmodifiableList = Collections.unmodifiableList(((da) caVar.f23489b).a2());
        Bundle bundle2 = new Bundle();
        for (ma maVar : listUnmodifiableList) {
            String strW = maVar.w();
            if (maVar.D()) {
                bundle2.putString(strW, String.valueOf(maVar.E()));
            } else if (maVar.B()) {
                bundle2.putString(strW, String.valueOf(maVar.C()));
            } else if (maVar.x()) {
                bundle2.putString(strW, maVar.y());
            } else if (maVar.z()) {
                bundle2.putString(strW, String.valueOf(maVar.A()));
            }
        }
        Z0(builder, gVar.N0(str, d0.r0).split("\\|"), bundle2, hashSet);
        W0(builder, "dma", true != ((da) caVar.f23489b).I0() ? "0" : "1", hashSet);
        if (!((da) caVar.f23489b).K0().isEmpty()) {
            W0(builder, "dma_cps", ((da) caVar.f23489b).K0(), hashSet);
        }
        if (((da) caVar.f23489b).Q0()) {
            i9 i9VarR0 = ((da) caVar.f23489b).R0();
            if (!i9VarR0.I().isEmpty()) {
                W0(builder, "dl_gclid", i9VarR0.I(), hashSet);
            }
            if (!i9VarR0.K().isEmpty()) {
                W0(builder, "dl_gbraid", i9VarR0.K(), hashSet);
            }
            if (!i9VarR0.M().isEmpty()) {
                W0(builder, "dl_gs", i9VarR0.M(), hashSet);
            }
            if (i9VarR0.O() > 0) {
                W0(builder, "dl_ss_ts", String.valueOf(i9VarR0.O()), hashSet);
            }
            if (!i9VarR0.Q().isEmpty()) {
                W0(builder, "mr_gclid", i9VarR0.Q(), hashSet);
            }
            if (!i9VarR0.S().isEmpty()) {
                W0(builder, "mr_gbraid", i9VarR0.S(), hashSet);
            }
            if (!i9VarR0.U().isEmpty()) {
                W0(builder, "mr_gs", i9VarR0.U(), hashSet);
            }
            if (i9VarR0.W() > 0) {
                W0(builder, "mr_click_ts", String.valueOf(i9VarR0.W()), hashSet);
            }
        }
        return new t3(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final v9 g1(q qVar) {
        u9 u9VarK = v9.K();
        long j10 = qVar.f39714f;
        u9VarK.b();
        ((v9) u9VarK.f23489b).S(j10);
        long j11 = qVar.f39713e;
        u9VarK.b();
        ((v9) u9VarK.f23489b).u(j11);
        t tVar = qVar.f39715g;
        Objects.requireNonNull(tVar);
        Bundle bundle = tVar.f39765a;
        for (String str : bundle.keySet()) {
            x9 x9VarG = y9.G();
            x9VarG.i(str);
            Object obj = bundle.get(str);
            k9.c0.h(obj);
            e1(x9VarG, obj);
            u9VarK.m(x9VarG);
        }
        String str2 = qVar.f39711c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            x9 x9VarG2 = y9.G();
            x9VarG2.i("_o");
            x9VarG2.j(str2);
            u9VarK.l((y9) x9VarG2.f());
        }
        return (v9) u9VarK.f();
    }

    public final String h1(ba baVar) {
        String str;
        String str2;
        String str3;
        l9 l9VarN0;
        StringBuilder sbI = d5.u.i("\nbatch {\n");
        if (baVar.z()) {
            b1(sbI, 0, "upload_subdomain", baVar.A());
        }
        if (baVar.x()) {
            b1(sbI, 0, "sgtm_join_id", baVar.y());
        }
        for (da daVar : baVar.u()) {
            if (daVar != null) {
                V0(sbI, 1);
                sbI.append("bundle {\n");
                if (daVar.U()) {
                    b1(sbI, 1, "protocol_version", Integer.valueOf(daVar.U0()));
                }
                m1 m1Var = (m1) this.f3623a;
                g gVar = m1Var.f39585d;
                o0 o0Var = m1Var.f39591j;
                if (gVar.R0(daVar.u(), d0.M0) && daVar.A0()) {
                    b1(sbI, 1, "session_stitching_token", daVar.B0());
                }
                b1(sbI, 1, O6.H, daVar.n2());
                if (daVar.w()) {
                    b1(sbI, 1, "gmp_version", Long.valueOf(daVar.x()));
                }
                if (daVar.y()) {
                    b1(sbI, 1, "uploading_gmp_version", Long.valueOf(daVar.z()));
                }
                if (daVar.w0()) {
                    b1(sbI, 1, "dynamite_version", Long.valueOf(daVar.x0()));
                }
                if (daVar.Q()) {
                    b1(sbI, 1, "config_version", Long.valueOf(daVar.R()));
                }
                b1(sbI, 1, "gmp_app_id", daVar.J());
                b1(sbI, 1, MBridgeConstans.APP_ID, daVar.u());
                b1(sbI, 1, "app_version", daVar.v());
                if (daVar.O()) {
                    b1(sbI, 1, "app_version_major", Integer.valueOf(daVar.P()));
                }
                b1(sbI, 1, "firebase_instance_id", daVar.N());
                if (daVar.E()) {
                    b1(sbI, 1, "dev_cert_hash", Long.valueOf(daVar.F()));
                }
                b1(sbI, 1, "app_store", daVar.t2());
                if (daVar.d2()) {
                    b1(sbI, 1, "upload_timestamp_millis", Long.valueOf(daVar.e2()));
                }
                if (daVar.f2()) {
                    b1(sbI, 1, "start_timestamp_millis", Long.valueOf(daVar.g2()));
                }
                if (daVar.h2()) {
                    b1(sbI, 1, "end_timestamp_millis", Long.valueOf(daVar.i2()));
                }
                if (daVar.j2()) {
                    b1(sbI, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(daVar.k2()));
                }
                if (daVar.l2()) {
                    b1(sbI, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(daVar.m2()));
                }
                b1(sbI, 1, "app_instance_id", daVar.D());
                b1(sbI, 1, "resettable_device_id", daVar.A());
                b1(sbI, 1, "ds_id", daVar.T());
                if (daVar.B()) {
                    b1(sbI, 1, "limited_ad_tracking", Boolean.valueOf(daVar.C()));
                }
                b1(sbI, 1, "os_version", daVar.o2());
                b1(sbI, 1, "device_model", daVar.p2());
                b1(sbI, 1, "user_default_language", daVar.q2());
                if (daVar.r2()) {
                    b1(sbI, 1, "time_zone_offset_minutes", Integer.valueOf(daVar.s2()));
                }
                if (daVar.G()) {
                    b1(sbI, 1, "bundle_sequential_index", Integer.valueOf(daVar.H()));
                }
                if (daVar.O0()) {
                    b1(sbI, 1, "delivery_index", Integer.valueOf(daVar.P0()));
                }
                if (daVar.K()) {
                    b1(sbI, 1, "service_upload", Boolean.valueOf(daVar.L()));
                }
                b1(sbI, 1, "health_monitor", daVar.I());
                if (daVar.u0()) {
                    b1(sbI, 1, "retry_counter", Integer.valueOf(daVar.v0()));
                }
                if (daVar.y0()) {
                    b1(sbI, 1, "consent_signals", daVar.z0());
                }
                if (daVar.H0()) {
                    b1(sbI, 1, "is_dma_region", Boolean.valueOf(daVar.I0()));
                }
                if (daVar.J0()) {
                    b1(sbI, 1, "core_platform_services", daVar.K0());
                }
                if (daVar.F0()) {
                    b1(sbI, 1, "consent_diagnostics", daVar.G0());
                }
                if (daVar.C0()) {
                    b1(sbI, 1, "target_os_version", Long.valueOf(daVar.D0()));
                }
                v4.a();
                if (gVar.R0(daVar.u(), d0.O0)) {
                    b1(sbI, 1, "ad_services_version", Integer.valueOf(daVar.L0()));
                    if (daVar.M0() && (l9VarN0 = daVar.N0()) != null) {
                        V0(sbI, 2);
                        sbI.append("attribution_eligibility_status {\n");
                        b1(sbI, 2, "eligible", Boolean.valueOf(l9VarN0.u()));
                        b1(sbI, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(l9VarN0.v()));
                        b1(sbI, 2, "pre_r", Boolean.valueOf(l9VarN0.w()));
                        b1(sbI, 2, "r_extensions_too_old", Boolean.valueOf(l9VarN0.x()));
                        b1(sbI, 2, "adservices_extension_too_old", Boolean.valueOf(l9VarN0.y()));
                        b1(sbI, 2, "ad_storage_not_allowed", Boolean.valueOf(l9VarN0.z()));
                        b1(sbI, 2, "measurement_manager_disabled", Boolean.valueOf(l9VarN0.A()));
                        V0(sbI, 2);
                        sbI.append("}\n");
                    }
                }
                if (daVar.Q0()) {
                    i9 i9VarR0 = daVar.R0();
                    V0(sbI, 2);
                    sbI.append("ad_campaign_info {\n");
                    if (i9VarR0.H()) {
                        b1(sbI, 2, "deep_link_gclid", i9VarR0.I());
                    }
                    if (i9VarR0.J()) {
                        b1(sbI, 2, "deep_link_gbraid", i9VarR0.K());
                    }
                    if (i9VarR0.L()) {
                        b1(sbI, 2, "deep_link_gad_source", i9VarR0.M());
                    }
                    if (i9VarR0.X()) {
                        b1(sbI, 2, "deep_link_url", i9VarR0.Y());
                    }
                    if (i9VarR0.N()) {
                        b1(sbI, 2, "deep_link_session_millis", Long.valueOf(i9VarR0.O()));
                    }
                    if (i9VarR0.P()) {
                        b1(sbI, 2, "market_referrer_gclid", i9VarR0.Q());
                    }
                    if (i9VarR0.R()) {
                        b1(sbI, 2, "market_referrer_gbraid", i9VarR0.S());
                    }
                    if (i9VarR0.T()) {
                        b1(sbI, 2, "market_referrer_gad_source", i9VarR0.U());
                    }
                    if (i9VarR0.V()) {
                        b1(sbI, 2, "market_referrer_click_millis", Long.valueOf(i9VarR0.W()));
                    }
                    V0(sbI, 2);
                    sbI.append("}\n");
                }
                if (daVar.V()) {
                    b1(sbI, 1, "batching_timestamp_millis", Long.valueOf(daVar.W()));
                }
                if (daVar.S0()) {
                    ka kaVarT0 = daVar.T0();
                    V0(sbI, 2);
                    sbI.append("sgtm_diagnostics {\n");
                    int iY = kaVarT0.y();
                    if (iY == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iY == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iY != 3) {
                        str2 = iY != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    b1(sbI, 2, "upload_type", str2);
                    b1(sbI, 2, "client_upload_eligibility", com.google.android.gms.internal.measurement.f2.B(kaVarT0.u()));
                    int iZ = kaVarT0.z();
                    if (iZ == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iZ == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iZ == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iZ != 4) {
                        str3 = iZ != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    b1(sbI, 2, "service_upload_eligibility", str3);
                    V0(sbI, 2);
                    sbI.append("}\n");
                }
                if (daVar.X()) {
                    r9 r9VarY = daVar.Y();
                    V0(sbI, 2);
                    sbI.append("consent_info_extra {\n");
                    for (q9 q9Var : r9VarY.u()) {
                        V0(sbI, 3);
                        sbI.append("limited_data_modes {\n");
                        int iV = q9Var.v();
                        if (iV == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iV == 2) {
                            str = "AD_STORAGE";
                        } else if (iV != 3) {
                            str = iV != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        b1(sbI, 3, "type", str);
                        int iW = q9Var.w();
                        b1(sbI, 3, X3.a.f27684t, iW != 1 ? iW != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        V0(sbI, 3);
                        sbI.append("}\n");
                    }
                    V0(sbI, 2);
                    sbI.append("}\n");
                }
                com.google.android.gms.internal.measurement.s1<ma> s1VarA2 = daVar.a2();
                if (s1VarA2 != null) {
                    for (ma maVar : s1VarA2) {
                        if (maVar != null) {
                            V0(sbI, 2);
                            sbI.append("user_property {\n");
                            b1(sbI, 2, "set_timestamp_millis", maVar.u() ? Long.valueOf(maVar.v()) : null);
                            b1(sbI, 2, "name", o0Var.c(maVar.w()));
                            b1(sbI, 2, "string_value", maVar.y());
                            b1(sbI, 2, "int_value", maVar.z() ? Long.valueOf(maVar.A()) : null);
                            b1(sbI, 2, "double_value", maVar.D() ? Double.valueOf(maVar.E()) : null);
                            V0(sbI, 2);
                            sbI.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.s1<n9> s1VarM = daVar.M();
                if (s1VarM != null) {
                    for (n9 n9Var : s1VarM) {
                        if (n9Var != null) {
                            V0(sbI, 2);
                            sbI.append("audience_membership {\n");
                            if (n9Var.u()) {
                                b1(sbI, 2, "audience_id", Integer.valueOf(n9Var.v()));
                            }
                            if (n9Var.z()) {
                                b1(sbI, 2, "new_audience", Boolean.valueOf(n9Var.A()));
                            }
                            a1(sbI, "current_data", n9Var.w());
                            if (n9Var.x()) {
                                a1(sbI, "previous_data", n9Var.y());
                            }
                            V0(sbI, 2);
                            sbI.append("}\n");
                        }
                    }
                }
                List<v9> listU1 = daVar.U1();
                if (listU1 != null) {
                    for (v9 v9Var : listU1) {
                        if (v9Var != null) {
                            V0(sbI, 2);
                            sbI.append("event {\n");
                            b1(sbI, 2, "name", o0Var.a(v9Var.z()));
                            if (v9Var.A()) {
                                b1(sbI, 2, "timestamp_millis", Long.valueOf(v9Var.B()));
                            }
                            if (gVar.R0(null, d0.f39301e1) && v9Var.G()) {
                                b1(sbI, 2, "corrected_timestamp_millis", Long.valueOf(v9Var.H()));
                            }
                            if (v9Var.C()) {
                                b1(sbI, 2, "previous_timestamp_millis", Long.valueOf(v9Var.D()));
                            }
                            if (v9Var.E()) {
                                b1(sbI, 2, "count", Integer.valueOf(v9Var.F()));
                            }
                            if (v9Var.x() != 0) {
                                T0(sbI, 2, (com.google.android.gms.internal.measurement.s1) v9Var.w());
                            }
                            V0(sbI, 2);
                            sbI.append("}\n");
                        }
                    }
                }
                V0(sbI, 1);
                sbI.append("}\n");
            }
        }
        sbI.append("} // End-of-batch\n");
        return sbI.toString();
    }

    public final String i1(p8 p8Var) {
        StringBuilder sbI = d5.u.i("\nproperty_filter {\n");
        if (p8Var.u()) {
            b1(sbI, 0, "filter_id", Integer.valueOf(p8Var.v()));
        }
        b1(sbI, 0, "property_name", ((m1) this.f3623a).f39591j.c(p8Var.w()));
        String strX0 = X0(p8Var.y(), p8Var.z(), p8Var.B());
        if (!strX0.isEmpty()) {
            b1(sbI, 0, "filter_type", strX0);
        }
        U0(sbI, 1, p8Var.x());
        sbI.append("}\n");
        return sbI.toString();
    }

    public final Parcelable j1(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (l9.b unused) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List n1(com.google.android.gms.internal.measurement.r1 r1Var, List list) {
        int i10;
        m1 m1Var = (m1) this.f3623a;
        ArrayList arrayList = new ArrayList(r1Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39756i.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39756i.d("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final boolean o1(long j10, long j11) {
        if (j10 == 0 || j11 <= 0) {
            return true;
        }
        ((m1) this.f3623a).f39592k.getClass();
        return Math.abs(System.currentTimeMillis() - j10) > j11;
    }

    public final long p1(byte[] bArr) {
        k9.c0.h(bArr);
        m1 m1Var = (m1) this.f3623a;
        l4 l4Var = m1Var.f39590i;
        m1.f(l4Var);
        l4Var.G0();
        MessageDigest messageDigestZ0 = l4.Z0();
        if (messageDigestZ0 != null) {
            return l4.a1(messageDigestZ0.digest(bArr));
        }
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39753f.b("Failed to get MD5");
        return 0L;
    }

    public final byte[] q1(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(e10, "Failed to gzip content");
            throw e10;
        }
    }

    @Override // ea.z3
    public final void J0() {
    }
}
