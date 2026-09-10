package ea;

import android.util.Log;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.v9;
import com.google.android.gms.internal.measurement.y9;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f39233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f39234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f39235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f39236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f39237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f39238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.i1 f39239i;

    public b(c cVar, String str, int i10, com.google.android.gms.internal.measurement.i1 i1Var, int i11) {
        this.f39237g = i11;
        this.f39238h = cVar;
        this.f39231a = str;
        this.f39232b = i10;
        this.f39239i = i1Var;
    }

    public static Boolean c(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, q8 q8Var, s0 s0Var) {
        List listZ;
        k9.c0.h(q8Var);
        if (str != null && q8Var.u() && q8Var.C() != 1 && (q8Var.C() != 7 ? q8Var.v() : q8Var.A() != 0)) {
            int iC = q8Var.C();
            boolean zY = q8Var.y();
            String strW = (zY || iC == 2 || iC == 7) ? q8Var.w() : q8Var.w().toUpperCase(Locale.ENGLISH);
            if (q8Var.A() == 0) {
                listZ = null;
            } else {
                listZ = q8Var.z();
                if (!zY) {
                    ArrayList arrayList = new ArrayList(listZ.size());
                    Iterator it = listZ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listZ = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iC == 2 ? strW : null;
            if (iC != 7 ? strW != null : listZ != null && !listZ.isEmpty()) {
                if (!zY && iC != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iC - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zY ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (s0Var != null) {
                                    s0Var.f39756i.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strW));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strW));
                    case 4:
                        return Boolean.valueOf(str.contains(strW));
                    case 5:
                        return Boolean.valueOf(str.equals(strW));
                    case 6:
                        if (listZ != null) {
                            return Boolean.valueOf(listZ.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    public static Boolean e(BigDecimal bigDecimal, n8 n8Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i10;
        k9.c0.h(n8Var);
        if (n8Var.u()) {
            if (n8Var.E() != 1 && (n8Var.E() != 5 ? n8Var.x() : n8Var.z() && n8Var.B())) {
                int iE = n8Var.E();
                try {
                    if (n8Var.E() == 5) {
                        if (h4.k1(n8Var.A()) && h4.k1(n8Var.C())) {
                            BigDecimal bigDecimal5 = new BigDecimal(n8Var.A());
                            bigDecimal4 = new BigDecimal(n8Var.C());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iE == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i10 = iE - 1;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d10 != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (h4.k1(n8Var.y())) {
                        bigDecimal2 = new BigDecimal(n8Var.y());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iE == 5) {
                            i10 = iE - 1;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d10 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i10 = iE - 1;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d10 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean a(Long l, Long l10, v9 v9Var, long j10, r rVar, boolean z10) {
        HashSet hashSet;
        Iterator it;
        x.e eVar;
        Iterator it2;
        Iterator it3;
        l8 l8Var;
        boolean z11;
        String strB;
        Object obj;
        Boolean boolE;
        Boolean boolE2;
        String str;
        n8 n8VarX;
        long j11;
        Boolean boolE3;
        y9 y9Var;
        Long lValueOf;
        Double dValueOf;
        l8 l8Var2;
        Boolean boolE4;
        int i10;
        com.google.android.gms.internal.measurement.c4.a();
        c cVar = this.f39238h;
        m1 m1Var = (m1) cVar.f3623a;
        g gVar = m1Var.f39585d;
        s0 s0Var = m1Var.f39587f;
        o0 o0Var = m1Var.f39591j;
        c0 c0Var = d0.F0;
        String str2 = this.f39231a;
        boolean zR0 = gVar.R0(str2, c0Var);
        j8 j8Var = (j8) this.f39239i;
        long j12 = j8Var.F() ? rVar.f39733e : j10;
        m1.h(s0Var);
        bo.b bVar = s0Var.f39760n;
        bo.b bVar2 = s0Var.f39756i;
        boolean zIsLoggable = Log.isLoggable(s0Var.Q0(), 2);
        int i11 = this.f39232b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            m1.h(s0Var);
            bVar.e("Evaluating filter. audience, filter, event", Integer.valueOf(i11), j8Var.u() ? Integer.valueOf(j8Var.v()) : null, o0Var.a(j8Var.w()));
            m1.h(s0Var);
            h4 h4Var = cVar.f39807b.f39377g;
            e4.T(h4Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (j8Var.u()) {
                i10 = 0;
                h4.b1(sb2, 0, "filter_id", Integer.valueOf(j8Var.v()));
            } else {
                i10 = 0;
            }
            h4.b1(sb2, i10, "event_name", ((m1) h4Var.f3623a).f39591j.a(j8Var.w()));
            String strX0 = h4.X0(j8Var.C(), j8Var.D(), j8Var.F());
            if (!strX0.isEmpty()) {
                h4.b1(sb2, 0, "filter_type", strX0);
            }
            if (j8Var.A()) {
                h4.c1(sb2, 1, "event_count_filter", j8Var.B());
            }
            if (j8Var.y() > 0) {
                sb2.append("  filters {\n");
                Iterator it4 = j8Var.x().iterator();
                while (it4.hasNext()) {
                    h4Var.U0(sb2, 2, (l8) it4.next());
                }
            }
            h4.V0(sb2, 1);
            sb2.append("}\n}\n");
            bVar.c(sb2.toString(), "Filter definition");
        }
        if (!j8Var.u() || j8Var.v() > 256) {
            m1.h(s0Var);
            bVar2.d("Invalid event filter ID. appId, id", s0.O0(str2), String.valueOf(j8Var.u() ? Integer.valueOf(j8Var.v()) : null));
            return false;
        }
        boolean z12 = j8Var.C() || j8Var.D() || j8Var.F();
        if (z10 && !z12) {
            m1.h(s0Var);
            bVar.d("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i11), j8Var.u() ? Integer.valueOf(j8Var.v()) : null);
            return true;
        }
        String strZ = v9Var.z();
        if (!j8Var.A()) {
            hashSet = new HashSet();
            it = j8Var.x().iterator();
            while (true) {
                if (it.hasNext()) {
                    eVar = new x.e(0);
                    it2 = v9Var.w().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = j8Var.x().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zR0 = zR0;
                                    s0Var = s0Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                l8Var = (l8) it3.next();
                                if (l8Var.y()) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                strB = l8Var.B();
                                if (strB.isEmpty()) {
                                    obj = eVar.get(strB);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zR0 = zR0;
                                                s0Var = s0Var;
                                                if (obj == null) {
                                                    m1.h(s0Var);
                                                    bVar2.d("Unknown param type. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                    break;
                                                }
                                                m1.h(s0Var);
                                                bVar.d("Missing param for filter. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (l8Var.u()) {
                                                if (l8Var.w()) {
                                                    zR0 = zR0;
                                                    s0Var = s0Var;
                                                    m1.h(s0Var);
                                                    bVar2.d("No filter for String param. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (h4.k1(str)) {
                                                    zR0 = zR0;
                                                    s0Var = s0Var;
                                                    m1.h(s0Var);
                                                    bVar2.d("Invalid param value for number filter. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                    break;
                                                }
                                                n8VarX = l8Var.x();
                                                if (h4.k1(str)) {
                                                    zR0 = zR0;
                                                    s0Var = s0Var;
                                                    j11 = 0;
                                                    boolE3 = e(new BigDecimal(str), n8VarX, 0.0d);
                                                } else {
                                                    boolE3 = null;
                                                }
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                s0Var = s0Var;
                                                zR0 = zR0;
                                            } else {
                                                q8 q8VarV = l8Var.v();
                                                m1.h(s0Var);
                                                boolE3 = d((String) obj, q8VarV, s0Var);
                                            }
                                            j11 = 0;
                                            if (boolE3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolE3.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            s0Var = s0Var;
                                            zR0 = zR0;
                                        } else if (l8Var.w()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolE2 = e(new BigDecimal(dDoubleValue), l8Var.x(), Math.ulp(dDoubleValue));
                                            if (boolE2 != null) {
                                                if (boolE2.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            m1.h(s0Var);
                                            bVar2.d("No number filter for double param. event, param", o0Var.a(strZ), o0Var.b(strB));
                                        }
                                    } else if (l8Var.w()) {
                                        boolE = e(new BigDecimal(((Long) obj).longValue()), l8Var.x(), 0.0d);
                                        if (boolE != null) {
                                            if (boolE.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        m1.h(s0Var);
                                        bVar2.d("No number filter for long param. event, param", o0Var.a(strZ), o0Var.b(strB));
                                    }
                                } else {
                                    m1.h(s0Var);
                                    bVar2.c(o0Var.a(strZ), "Event has empty param name. event");
                                }
                            }
                        } else {
                            y9Var = (y9) it2.next();
                            if (!hashSet.contains(y9Var.v())) {
                                if (y9Var.y()) {
                                    String strV = y9Var.v();
                                    if (y9Var.y()) {
                                        lValueOf = Long.valueOf(y9Var.z());
                                    } else {
                                        lValueOf = null;
                                    }
                                    eVar.put(strV, lValueOf);
                                } else if (y9Var.C()) {
                                    String strV2 = y9Var.v();
                                    if (y9Var.C()) {
                                        dValueOf = Double.valueOf(y9Var.D());
                                    } else {
                                        dValueOf = null;
                                    }
                                    eVar.put(strV2, dValueOf);
                                } else if (y9Var.w()) {
                                    eVar.put(y9Var.v(), y9Var.x());
                                } else {
                                    m1.h(s0Var);
                                    bVar2.d("Unknown value for param. event, param", o0Var.a(strZ), o0Var.b(y9Var.v()));
                                }
                            }
                        }
                    }
                } else {
                    l8Var2 = (l8) it.next();
                    if (l8Var2.B().isEmpty()) {
                        m1.h(s0Var);
                        bVar2.c(o0Var.a(strZ), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(l8Var2.B());
                    }
                }
                zR0 = zR0;
                s0Var = s0Var;
                break;
            }
        }
        try {
            boolE4 = e(new BigDecimal(j12), j8Var.B(), 0.0d);
        } catch (NumberFormatException unused) {
            boolE4 = null;
        }
        if (boolE4 != null) {
            if (boolE4.booleanValue()) {
                hashSet = new HashSet();
                it = j8Var.x().iterator();
                while (true) {
                    if (it.hasNext()) {
                        eVar = new x.e(0);
                        it2 = v9Var.w().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = j8Var.x().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zR0 = zR0;
                                        s0Var = s0Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    l8Var = (l8) it3.next();
                                    if (l8Var.y() || !l8Var.z()) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    strB = l8Var.B();
                                    if (strB.isEmpty()) {
                                        obj = eVar.get(strB);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zR0 = zR0;
                                                    s0Var = s0Var;
                                                    if (obj == null) {
                                                        m1.h(s0Var);
                                                        bVar2.d("Unknown param type. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                        break;
                                                    }
                                                    m1.h(s0Var);
                                                    bVar.d("Missing param for filter. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (l8Var.u()) {
                                                    if (l8Var.w()) {
                                                        zR0 = zR0;
                                                        s0Var = s0Var;
                                                        m1.h(s0Var);
                                                        bVar2.d("No filter for String param. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (h4.k1(str)) {
                                                        zR0 = zR0;
                                                        s0Var = s0Var;
                                                        m1.h(s0Var);
                                                        bVar2.d("Invalid param value for number filter. event, param", o0Var.a(strZ), o0Var.b(strB));
                                                        break;
                                                    }
                                                    n8VarX = l8Var.x();
                                                    if (h4.k1(str)) {
                                                        boolE3 = null;
                                                    } else {
                                                        try {
                                                            zR0 = zR0;
                                                            s0Var = s0Var;
                                                            j11 = 0;
                                                            try {
                                                                boolE3 = e(new BigDecimal(str), n8VarX, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolE3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zR0 = zR0;
                                                            s0Var = s0Var;
                                                            j11 = 0;
                                                        }
                                                    }
                                                    if (boolE3 != null) {
                                                        break;
                                                    }
                                                    if (boolE3.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    s0Var = s0Var;
                                                    zR0 = zR0;
                                                } else {
                                                    q8 q8VarV2 = l8Var.v();
                                                    m1.h(s0Var);
                                                    boolE3 = d((String) obj, q8VarV2, s0Var);
                                                }
                                                j11 = 0;
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                s0Var = s0Var;
                                                zR0 = zR0;
                                            } else if (l8Var.w()) {
                                                m1.h(s0Var);
                                                bVar2.d("No number filter for double param. event, param", o0Var.a(strZ), o0Var.b(strB));
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolE2 = e(new BigDecimal(dDoubleValue2), l8Var.x(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolE2 = null;
                                                }
                                                if (boolE2 != null) {
                                                    if (boolE2.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (l8Var.w()) {
                                            m1.h(s0Var);
                                            bVar2.d("No number filter for long param. event, param", o0Var.a(strZ), o0Var.b(strB));
                                        } else {
                                            try {
                                                boolE = e(new BigDecimal(((Long) obj).longValue()), l8Var.x(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolE = null;
                                            }
                                            if (boolE != null) {
                                                if (boolE.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        m1.h(s0Var);
                                        bVar2.c(o0Var.a(strZ), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                y9Var = (y9) it2.next();
                                if (!hashSet.contains(y9Var.v())) {
                                    if (y9Var.y()) {
                                        String strV3 = y9Var.v();
                                        if (y9Var.y()) {
                                            lValueOf = Long.valueOf(y9Var.z());
                                        } else {
                                            lValueOf = null;
                                        }
                                        eVar.put(strV3, lValueOf);
                                    } else if (y9Var.C()) {
                                        String strV4 = y9Var.v();
                                        if (y9Var.C()) {
                                            dValueOf = Double.valueOf(y9Var.D());
                                        } else {
                                            dValueOf = null;
                                        }
                                        eVar.put(strV4, dValueOf);
                                    } else if (y9Var.w()) {
                                        eVar.put(y9Var.v(), y9Var.x());
                                    } else {
                                        m1.h(s0Var);
                                        bVar2.d("Unknown value for param. event, param", o0Var.a(strZ), o0Var.b(y9Var.v()));
                                    }
                                }
                            }
                        }
                    } else {
                        l8Var2 = (l8) it.next();
                        if (l8Var2.B().isEmpty()) {
                            m1.h(s0Var);
                            bVar2.c(o0Var.a(strZ), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(l8Var2.B());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zR0 = zR0;
        s0Var = s0Var;
        break;
        m1.h(s0Var);
        bVar.c(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f39233c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f39234d = bool2;
        if (!z12 || !v9Var.A()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(v9Var.B());
        if (j8Var.D()) {
            if (zR0 && j8Var.A()) {
                lValueOf2 = l;
            }
            this.f39236f = lValueOf2;
            return true;
        }
        if (zR0 && j8Var.A()) {
            lValueOf2 = l10;
        }
        this.f39235e = lValueOf2;
        return true;
    }

    public boolean b(Long l, Long l10, ma maVar, boolean z10) {
        boolean z11;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        com.google.android.gms.internal.measurement.c4.a();
        m1 m1Var = (m1) this.f39238h.f3623a;
        g gVar = m1Var.f39585d;
        o0 o0Var = m1Var.f39591j;
        s0 s0Var = m1Var.f39587f;
        boolean zR0 = gVar.R0(this.f39231a, d0.D0);
        p8 p8Var = (p8) this.f39239i;
        boolean zY = p8Var.y();
        boolean z12 = p8Var.z();
        boolean zB = p8Var.B();
        boolean z13 = zY || z12 || zB;
        if (z10 && !z13) {
            m1.h(s0Var);
            s0Var.f39760n.d("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f39232b), p8Var.u() ? Integer.valueOf(p8Var.v()) : null);
            return true;
        }
        l8 l8VarX = p8Var.x();
        boolean z14 = l8VarX.z();
        if (!maVar.z()) {
            z11 = zB;
            if (!maVar.D()) {
                if (!maVar.x()) {
                    m1.h(s0Var);
                    s0Var.f39756i.c(o0Var.c(maVar.w()), "User property has no value, property");
                } else if (l8VarX.u()) {
                    String strY = maVar.y();
                    q8 q8VarV = l8VarX.v();
                    m1.h(s0Var);
                    boolC = c(d(strY, q8VarV, s0Var), z14);
                } else if (!l8VarX.w()) {
                    m1.h(s0Var);
                    s0Var.f39756i.c(o0Var.c(maVar.w()), "No string or number filter defined. property");
                } else if (h4.k1(maVar.y())) {
                    String strY2 = maVar.y();
                    n8 n8VarX = l8VarX.x();
                    if (h4.k1(strY2)) {
                        try {
                            boolE = e(new BigDecimal(strY2), n8VarX, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                    } else {
                        boolE = null;
                    }
                    boolC = c(boolE, z14);
                } else {
                    m1.h(s0Var);
                    s0Var.f39756i.d("Invalid user property value for Numeric number filter. property, value", o0Var.c(maVar.w()), maVar.y());
                }
                boolC = null;
            } else if (l8VarX.w()) {
                double dE = maVar.E();
                try {
                    boolE2 = e(new BigDecimal(dE), l8VarX.x(), Math.ulp(dE));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, z14);
            } else {
                m1.h(s0Var);
                s0Var.f39756i.c(o0Var.c(maVar.w()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (l8VarX.w()) {
            z11 = zB;
            try {
                boolE3 = e(new BigDecimal(maVar.A()), l8VarX.x(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, z14);
        } else {
            m1.h(s0Var);
            s0Var.f39756i.c(o0Var.c(maVar.w()), "No number filter for long property. property");
            z11 = zB;
            boolC = null;
        }
        m1.h(s0Var);
        s0Var.f39760n.c(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f39233c = Boolean.TRUE;
        if (!z11 || boolC.booleanValue()) {
            if (!z10 || p8Var.y()) {
                this.f39234d = boolC;
            }
            if (boolC.booleanValue() && z13 && maVar.u()) {
                long jV = maVar.v();
                if (l != null) {
                    jV = l.longValue();
                }
                if (zR0 && p8Var.y() && !p8Var.z() && l10 != null) {
                    jV = l10.longValue();
                }
                if (p8Var.z()) {
                    this.f39236f = Long.valueOf(jV);
                } else {
                    this.f39235e = Long.valueOf(jV);
                }
            }
        }
        return true;
    }
}
