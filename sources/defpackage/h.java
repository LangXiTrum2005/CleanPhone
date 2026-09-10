package defpackage;

import cj.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import dj.b;
import hj.i;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kj.c;
import kotlin.jvm.internal.n;
import lj.a0;
import lj.b0;
import lj.c0;
import lj.d0;
import lj.e0;
import lj.f0;
import lj.g0;
import lj.h0;
import lj.i0;
import lj.j0;
import lj.k0;
import lj.l;
import lj.m;
import lj.p;
import lj.w;
import lj.x;
import lj.y;
import lj.z;
import qj.d;
import qj.e;
import qj.f;
import qj.g;
import qj.j;
import qj.k;
import qj.o;
import qj.q;
import qj.r;
import qj.s;
import qj.t;
import qj.v;
import tj.x0;
import xi.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f42047d;

    public /* synthetic */ h(int i10) {
        this.f42047d = i10;
    }

    private final Object l(byte b10, ByteBuffer byteBuffer) {
        int i10 = 0;
        if (b10 == -127) {
            Long l = (Long) e(byteBuffer);
            if (l != null) {
                int iLongValue = (int) l.longValue();
                q.f49080b.getClass();
                q[] qVarArrValues = q.values();
                int length = qVarArrValues.length;
                while (i10 < length) {
                    q qVar = qVarArrValues[i10];
                    if (qVar.f49082a == iLongValue) {
                        return qVar;
                    }
                    i10++;
                }
            }
        } else if (b10 == -126) {
            Long l10 = (Long) e(byteBuffer);
            if (l10 != null) {
                int iLongValue2 = (int) l10.longValue();
                o.f49072b.getClass();
                o[] oVarArrValues = o.values();
                int length2 = oVarArrValues.length;
                while (i10 < length2) {
                    o oVar = oVarArrValues[i10];
                    if (oVar.f49079a == iLongValue2) {
                        return oVar;
                    }
                    i10++;
                }
            }
        } else if (b10 == -125) {
            Object objE = e(byteBuffer);
            List list = objE instanceof List ? (List) objE : null;
            if (list != null) {
                Object obj = list.get(0);
                n.d(obj, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj).longValue();
                Object obj2 = list.get(1);
                n.d(obj2, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue2 = ((Long) obj2).longValue();
                Object obj3 = list.get(2);
                n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue3 = ((Long) obj3).longValue();
                Object obj4 = list.get(3);
                n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                return new j(jLongValue, jLongValue2, jLongValue3, ((Long) obj4).longValue());
            }
        } else if (b10 == -124) {
            Object objE2 = e(byteBuffer);
            List list2 = objE2 instanceof List ? (List) objE2 : null;
            if (list2 != null) {
                Object obj5 = list2.get(0);
                n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.PlatformPlaybackState");
                return new t((o) obj5);
            }
        } else if (b10 == -123) {
            Object objE3 = e(byteBuffer);
            List list3 = objE3 instanceof List ? (List) objE3 : null;
            if (list3 != null) {
                Object obj6 = list3.get(0);
                n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                return new k(((Boolean) obj6).booleanValue());
            }
        } else if (b10 == -122) {
            Object objE4 = e(byteBuffer);
            List list4 = objE4 instanceof List ? (List) objE4 : null;
            if (list4 != null) {
                return new d((String) list4.get(0));
            }
        } else if (b10 == -121) {
            Object objE5 = e(byteBuffer);
            List list5 = objE5 instanceof List ? (List) objE5 : null;
            if (list5 != null) {
                Object obj7 = list5.get(0);
                n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                return new r(((Long) obj7).longValue());
            }
        } else if (b10 == -120) {
            Object objE6 = e(byteBuffer);
            List list6 = objE6 instanceof List ? (List) objE6 : null;
            if (list6 != null) {
                Object obj8 = list6.get(0);
                n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                q qVar2 = (q) list6.get(1);
                Object obj9 = list6.get(2);
                n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                return new f((String) obj8, qVar2, (Map) obj9, (String) list6.get(3));
            }
        } else if (b10 == -119) {
            Object objE7 = e(byteBuffer);
            List list7 = objE7 instanceof List ? (List) objE7 : null;
            if (list7 != null) {
                Object obj10 = list7.get(0);
                n.d(obj10, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue4 = ((Long) obj10).longValue();
                Object obj11 = list7.get(1);
                n.d(obj11, "null cannot be cast to non-null type kotlin.Long");
                return new v(jLongValue4, ((Long) obj11).longValue());
            }
        } else if (b10 == -118) {
            Object objE8 = e(byteBuffer);
            List list8 = objE8 instanceof List ? (List) objE8 : null;
            if (list8 != null) {
                Object obj12 = list8.get(0);
                n.d(obj12, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue5 = ((Long) obj12).longValue();
                Object obj13 = list8.get(1);
                n.d(obj13, "null cannot be cast to non-null type kotlin.Long");
                return new s(jLongValue5, ((Long) obj13).longValue());
            }
        } else if (b10 == -117) {
            Object objE9 = e(byteBuffer);
            List list9 = objE9 instanceof List ? (List) objE9 : null;
            if (list9 != null) {
                Object obj14 = list9.get(0);
                n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj14;
                Object obj15 = list9.get(1);
                n.d(obj15, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj15;
                Object obj16 = list9.get(2);
                n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj16;
                Object obj17 = list9.get(3);
                n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                return new e(str, str2, str3, ((Boolean) obj17).booleanValue(), (Long) list9.get(4), (Long) list9.get(5), (Long) list9.get(6), (String) list9.get(7));
            }
        } else if (b10 == -116) {
            Object objE10 = e(byteBuffer);
            List list10 = objE10 instanceof List ? (List) objE10 : null;
            if (list10 != null) {
                Object obj18 = list10.get(0);
                n.d(obj18, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue6 = ((Long) obj18).longValue();
                Object obj19 = list10.get(1);
                n.d(obj19, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue7 = ((Long) obj19).longValue();
                String str4 = (String) list10.get(2);
                String str5 = (String) list10.get(3);
                Object obj20 = list10.get(4);
                n.d(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                return new g(jLongValue6, jLongValue7, str4, str5, ((Boolean) obj20).booleanValue(), (Long) list10.get(5), (Long) list10.get(6), (Long) list10.get(7), (String) list10.get(8));
            }
        } else {
            if (b10 != -115) {
                return super.f(b10, byteBuffer);
            }
            Object objE11 = e(byteBuffer);
            List list11 = objE11 instanceof List ? (List) objE11 : null;
            if (list11 != null) {
                return new qj.n((List) list11.get(0));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v199, types: [lj.f0[]] */
    /* JADX WARN: Type inference failed for: r1v201, types: [lj.c0[]] */
    /* JADX WARN: Type inference failed for: r1v203, types: [lj.m[]] */
    /* JADX WARN: Type inference failed for: r1v205, types: [lj.l[]] */
    /* JADX WARN: Type inference failed for: r1v207, types: [lj.y[]] */
    /* JADX WARN: Type inference failed for: r1v209, types: [lj.g0[]] */
    /* JADX WARN: Type inference failed for: r1v211, types: [lj.p[]] */
    /* JADX WARN: Type inference failed for: r1v237, types: [x5.d[]] */
    /* JADX WARN: Type inference failed for: r1v239, types: [x5.a[]] */
    /* JADX WARN: Type inference failed for: r1v241, types: [x5.c[]] */
    /* JADX WARN: Type inference failed for: r1v85, types: [kj.c[]] */
    /* JADX WARN: Type inference failed for: r1v87, types: [kj.u[]] */
    /* JADX WARN: Type inference failed for: r1v89, types: [kj.s[]] */
    /* JADX WARN: Type inference failed for: r3v109, types: [x5.d] */
    /* JADX WARN: Type inference failed for: r3v110, types: [x5.a] */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v112, types: [x5.c] */
    /* JADX WARN: Type inference failed for: r3v33, types: [kj.c] */
    /* JADX WARN: Type inference failed for: r3v34, types: [kj.u] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [kj.s] */
    /* JADX WARN: Type inference failed for: r3v72, types: [lj.f0] */
    /* JADX WARN: Type inference failed for: r3v73, types: [lj.c0] */
    /* JADX WARN: Type inference failed for: r3v74, types: [lj.m] */
    /* JADX WARN: Type inference failed for: r3v75, types: [lj.l] */
    /* JADX WARN: Type inference failed for: r3v76, types: [lj.y] */
    /* JADX WARN: Type inference failed for: r3v77, types: [lj.g0] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79, types: [lj.p] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object] */
    @Override // xi.u
    public Object f(byte b10, ByteBuffer byteBuffer) {
        ?? r3;
        Object h0Var;
        Object a0Var;
        ?? r10;
        ?? r11;
        switch (this.f42047d) {
            case 0:
                if (b10 == -127) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list != null) {
                        return new b((Boolean) list.get(0));
                    }
                    return null;
                }
                if (b10 != -126) {
                    return super.f(b10, byteBuffer);
                }
                Object objE2 = e(byteBuffer);
                List list2 = objE2 instanceof List ? (List) objE2 : null;
                if (list2 != null) {
                    return new a((Boolean) list2.get(0));
                }
                return null;
            case 1:
                if (b10 != -127) {
                    return super.f(b10, byteBuffer);
                }
                Object objE3 = e(byteBuffer);
                List list3 = objE3 instanceof List ? (List) objE3 : null;
                if (list3 == null) {
                    return null;
                }
                Object obj = list3.get(0);
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                return new a((String) obj, (Map) list3.get(1));
            case 2:
                if (b10 != -127) {
                    if (b10 != -126) {
                        return super.f(b10, byteBuffer);
                    }
                    Object objE4 = e(byteBuffer);
                    List list4 = objE4 instanceof List ? (List) objE4 : null;
                    if (list4 == null) {
                        return null;
                    }
                    Object obj2 = list4.get(0);
                    n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                    Object obj3 = list4.get(1);
                    n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.firebase.core.CoreFirebaseOptions");
                    Boolean bool = (Boolean) list4.get(2);
                    Object obj4 = list4.get(3);
                    n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.Any?>");
                    return new b((String) obj2, (dj.a) obj3, bool, (Map) obj4);
                }
                Object objE5 = e(byteBuffer);
                List list5 = objE5 instanceof List ? (List) objE5 : null;
                if (list5 == null) {
                    return null;
                }
                Object obj5 = list5.get(0);
                n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj5;
                Object obj6 = list5.get(1);
                n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj6;
                Object obj7 = list5.get(2);
                n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj7;
                Object obj8 = list5.get(3);
                n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                return new dj.a(str, str2, str3, (String) obj8, (String) list5.get(4), (String) list5.get(5), (String) list5.get(6), (String) list5.get(7), (String) list5.get(8), (String) list5.get(9), (String) list5.get(10), (String) list5.get(11), (String) list5.get(12), (String) list5.get(13));
            case 3:
                if (b10 == -127) {
                    Object objE6 = e(byteBuffer);
                    List list6 = objE6 instanceof List ? (List) objE6 : null;
                    if (list6 == null) {
                        return null;
                    }
                    String str4 = (String) list6.get(0);
                    Object obj9 = list6.get(1);
                    n.d(obj9, "null cannot be cast to non-null type kotlin.String");
                    Object obj10 = list6.get(2);
                    n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                    Object obj11 = list6.get(3);
                    n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                    return new fj.a(str4, (String) obj9, (String) obj10, (String) obj11);
                }
                if (b10 != -126) {
                    return super.f(b10, byteBuffer);
                }
                Object objE7 = e(byteBuffer);
                List list7 = objE7 instanceof List ? (List) objE7 : null;
                if (list7 == null) {
                    return null;
                }
                Object obj12 = list7.get(0);
                n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                String str5 = (String) obj12;
                Object obj13 = list7.get(1);
                n.d(obj13, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj13;
                String str7 = (String) list7.get(2);
                Object obj14 = list7.get(3);
                n.d(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj14).booleanValue();
                Object obj15 = list7.get(4);
                n.d(obj15, "null cannot be cast to non-null type kotlin.String");
                String str8 = (String) obj15;
                Object obj16 = list7.get(5);
                n.d(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                Object obj17 = list7.get(6);
                n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.firebase.crashlytics.generated.CrashlyticsStackFrame>");
                return new fj.f(str5, str6, str7, zBooleanValue, str8, (List) obj16, (List) obj17);
            case 4:
                if (b10 == -127) {
                    Long l = (Long) e(byteBuffer);
                    if (l == null) {
                        return null;
                    }
                    int iLongValue = (int) l.longValue();
                    hj.g.f42372b.getClass();
                    for (hj.g gVar : hj.g.values()) {
                        if (gVar.f42374a == iLongValue) {
                            return gVar;
                        }
                    }
                    return null;
                }
                if (b10 == -126) {
                    Object objE8 = e(byteBuffer);
                    List list8 = objE8 instanceof List ? (List) objE8 : null;
                    if (list8 == null) {
                        return null;
                    }
                    Object obj18 = list8.get(0);
                    n.d(obj18, "null cannot be cast to non-null type kotlin.String");
                    Object obj19 = list8.get(1);
                    n.d(obj19, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMethod");
                    return new i((String) obj18, (hj.g) obj19);
                }
                if (b10 == -125) {
                    Object objE9 = e(byteBuffer);
                    List list9 = objE9 instanceof List ? (List) objE9 : null;
                    if (list9 != null) {
                        return new hj.h((Long) list9.get(0), (Long) list9.get(1), (Long) list9.get(2), (String) list9.get(3), (Map) list9.get(4));
                    }
                    return null;
                }
                if (b10 != -124) {
                    return super.f(b10, byteBuffer);
                }
                Object objE10 = e(byteBuffer);
                List list10 = objE10 instanceof List ? (List) objE10 : null;
                if (list10 != null) {
                    return new hj.j((Map) list10.get(0), (Map) list10.get(1));
                }
                return null;
            case 5:
                int i10 = 0;
                if (b10 == -127) {
                    Long l10 = (Long) e(byteBuffer);
                    if (l10 == null) {
                        return null;
                    }
                    int iLongValue2 = (int) l10.longValue();
                    kj.s.f44707b.getClass();
                    ?? Values = kj.s.values();
                    int length = Values.length;
                    while (i10 < length) {
                        r3 = Values[i10];
                        if (r3.f44709a != iLongValue2) {
                            i10++;
                        }
                    }
                    return null;
                }
                if (b10 == -126) {
                    Long l11 = (Long) e(byteBuffer);
                    if (l11 == null) {
                        return null;
                    }
                    int iLongValue3 = (int) l11.longValue();
                    kj.u.f44712b.getClass();
                    ?? Values2 = kj.u.values();
                    int length2 = Values2.length;
                    while (i10 < length2) {
                        r3 = Values2[i10];
                        if (r3.f44714a != iLongValue3) {
                            i10++;
                        }
                    }
                    return null;
                }
                if (b10 == -125) {
                    Long l12 = (Long) e(byteBuffer);
                    if (l12 == null) {
                        return null;
                    }
                    int iLongValue4 = (int) l12.longValue();
                    c.f44661b.getClass();
                    ?? Values3 = c.values();
                    int length3 = Values3.length;
                    while (i10 < length3) {
                        r3 = Values3[i10];
                        if (r3.f44665a != iLongValue4) {
                            i10++;
                        }
                    }
                    return null;
                }
                if (b10 == -124) {
                    Object objE11 = e(byteBuffer);
                    List list11 = objE11 instanceof List ? (List) objE11 : null;
                    if (list11 == null) {
                        return null;
                    }
                    Object obj20 = list11.get(0);
                    n.d(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue2 = ((Boolean) obj20).booleanValue();
                    Object obj21 = list11.get(1);
                    n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                    return new kj.e((Long) list11.get(2), zBooleanValue2, ((Boolean) obj21).booleanValue());
                }
                if (b10 == -123) {
                    Object objE12 = e(byteBuffer);
                    List list12 = objE12 instanceof List ? (List) objE12 : null;
                    if (list12 == null) {
                        return null;
                    }
                    Double d10 = (Double) list12.get(0);
                    Double d11 = (Double) list12.get(1);
                    Object obj22 = list12.get(2);
                    n.d(obj22, "null cannot be cast to non-null type kotlin.Long");
                    return new kj.q(d10, d11, ((Long) obj22).longValue());
                }
                if (b10 == -122) {
                    Object objE13 = e(byteBuffer);
                    List list13 = objE13 instanceof List ? (List) objE13 : null;
                    if (list13 == null) {
                        return null;
                    }
                    Object obj23 = list13.get(0);
                    n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                    return new kj.r((kj.q) obj23);
                }
                if (b10 == -121) {
                    Object objE14 = e(byteBuffer);
                    List list14 = objE14 instanceof List ? (List) objE14 : null;
                    if (list14 != null) {
                        return new kj.v((Long) list14.get(0));
                    }
                    return null;
                }
                if (b10 == -120) {
                    Object objE15 = e(byteBuffer);
                    List list15 = objE15 instanceof List ? (List) objE15 : null;
                    if (list15 == null) {
                        return null;
                    }
                    Object obj24 = list15.get(0);
                    n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceType");
                    return new kj.t((kj.u) obj24, (kj.s) list15.get(1));
                }
                if (b10 == -119) {
                    Object objE16 = e(byteBuffer);
                    List list16 = objE16 instanceof List ? (List) objE16 : null;
                    if (list16 == null) {
                        return null;
                    }
                    Object obj25 = list16.get(0);
                    n.d(obj25, "null cannot be cast to non-null type kotlin.String");
                    return new kj.a((String) obj25, (String) list16.get(1));
                }
                if (b10 != -118) {
                    return super.f(b10, byteBuffer);
                }
                Object objE17 = e(byteBuffer);
                List list17 = objE17 instanceof List ? (List) objE17 : null;
                if (list17 == null) {
                    return null;
                }
                Object obj26 = list17.get(0);
                n.d(obj26, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.CacheRetrievalType");
                kj.a aVar = (kj.a) list17.get(1);
                Object obj27 = list17.get(2);
                n.d(obj27, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                return new kj.b((c) obj26, aVar, (List) obj27);
                return r3;
            case 6:
                int i11 = 0;
                if (b10 == -127) {
                    Long l13 = (Long) e(byteBuffer);
                    if (l13 != null) {
                        int iLongValue5 = (int) l13.longValue();
                        p.f45424b.getClass();
                        ?? Values4 = p.values();
                        int length4 = Values4.length;
                        while (i11 < length4) {
                            r10 = Values4[i11];
                            if (r10.f45437a == iLongValue5) {
                                return r10;
                            }
                            i11++;
                        }
                    }
                    return null;
                }
                if (b10 == -126) {
                    Long l14 = (Long) e(byteBuffer);
                    if (l14 != null) {
                        int iLongValue6 = (int) l14.longValue();
                        g0.f45375b.getClass();
                        ?? Values5 = g0.values();
                        int length5 = Values5.length;
                        while (i11 < length5) {
                            r10 = Values5[i11];
                            if (r10.f45378a == iLongValue6) {
                                return r10;
                            }
                            i11++;
                        }
                    }
                    return null;
                }
                if (b10 == -125) {
                    Long l15 = (Long) e(byteBuffer);
                    if (l15 != null) {
                        int iLongValue7 = (int) l15.longValue();
                        y.f45466b.getClass();
                        ?? Values6 = y.values();
                        int length6 = Values6.length;
                        while (i11 < length6) {
                            r10 = Values6[i11];
                            if (r10.f45470a == iLongValue7) {
                                return r10;
                            }
                            i11++;
                        }
                    }
                    return null;
                }
                if (b10 == -124) {
                    Long l16 = (Long) e(byteBuffer);
                    if (l16 != null) {
                        int iLongValue8 = (int) l16.longValue();
                        l.f45404b.getClass();
                        ?? Values7 = l.values();
                        int length7 = Values7.length;
                        while (i11 < length7) {
                            r10 = Values7[i11];
                            if (r10.f45406a == iLongValue8) {
                                return r10;
                            }
                            i11++;
                        }
                    }
                    return null;
                }
                if (b10 == -123) {
                    Long l17 = (Long) e(byteBuffer);
                    if (l17 != null) {
                        int iLongValue9 = (int) l17.longValue();
                        m.f45409b.getClass();
                        ?? Values8 = m.values();
                        int length8 = Values8.length;
                        while (i11 < length8) {
                            r10 = Values8[i11];
                            if (r10.f45411a == iLongValue9) {
                                return r10;
                            }
                            i11++;
                        }
                    }
                    return null;
                }
                if (b10 == -122) {
                    Long l18 = (Long) e(byteBuffer);
                    if (l18 != null) {
                        int iLongValue10 = (int) l18.longValue();
                        c0.f45351b.getClass();
                        ?? Values9 = c0.values();
                        int length9 = Values9.length;
                        while (i11 < length9) {
                            r10 = Values9[i11];
                            if (r10.f45356a == iLongValue10) {
                                return r10;
                            }
                            i11++;
                        }
                    }
                    return null;
                }
                if (b10 == -121) {
                    Long l19 = (Long) e(byteBuffer);
                    if (l19 != null) {
                        int iLongValue11 = (int) l19.longValue();
                        f0.f45367b.getClass();
                        ?? Values10 = f0.values();
                        int length10 = Values10.length;
                        while (i11 < length10) {
                            r10 = Values10[i11];
                            if (r10.f45372a == iLongValue11) {
                                return r10;
                            }
                            i11++;
                        }
                    }
                } else if (b10 == -120) {
                    Object objE18 = e(byteBuffer);
                    List list18 = objE18 instanceof List ? (List) objE18 : null;
                    if (list18 != null) {
                        Object obj28 = list18.get(0);
                        n.d(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list18.get(1);
                        n.d(obj29, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                        return new e0((String) obj28, (y) obj29);
                    }
                } else if (b10 == -119) {
                    Object objE19 = e(byteBuffer);
                    List list19 = objE19 instanceof List ? (List) objE19 : null;
                    if (list19 != null) {
                        return new lj.j((String) list19.get(0), (String) list19.get(1));
                    }
                } else if (b10 == -118) {
                    Object objE20 = e(byteBuffer);
                    List list20 = objE20 instanceof List ? (List) objE20 : null;
                    if (list20 != null) {
                        Object obj30 = list20.get(0);
                        n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResponse");
                        Object obj31 = list20.get(1);
                        n.d(obj31, "null cannot be cast to non-null type kotlin.String");
                        Object obj32 = list20.get(2);
                        n.d(obj32, "null cannot be cast to non-null type kotlin.Long");
                        return new lj.q((p) obj30, (String) obj31, ((Long) obj32).longValue());
                    }
                } else if (b10 == -117) {
                    Object objE21 = e(byteBuffer);
                    List list21 = objE21 instanceof List ? (List) objE21 : null;
                    if (list21 != null) {
                        Object obj33 = list21.get(0);
                        n.d(obj33, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue = ((Long) obj33).longValue();
                        Object obj34 = list21.get(1);
                        n.d(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list21.get(2);
                        n.d(obj35, "null cannot be cast to non-null type kotlin.String");
                        return new lj.s(jLongValue, (String) obj34, (String) obj35);
                    }
                } else if (b10 == -116) {
                    Object objE22 = e(byteBuffer);
                    List list22 = objE22 instanceof List ? (List) objE22 : null;
                    if (list22 != null) {
                        Object obj36 = list22.get(0);
                        n.d(obj36, "null cannot be cast to non-null type kotlin.String");
                        String str9 = (String) obj36;
                        Object obj37 = list22.get(1);
                        n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                        String str10 = (String) obj37;
                        Object obj38 = list22.get(2);
                        n.d(obj38, "null cannot be cast to non-null type kotlin.String");
                        String str11 = (String) obj38;
                        Object obj39 = list22.get(3);
                        n.d(obj39, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                        y yVar = (y) obj39;
                        Object obj40 = list22.get(4);
                        n.d(obj40, "null cannot be cast to non-null type kotlin.String");
                        h0Var = new w(str9, str10, str11, yVar, (String) obj40, (lj.s) list22.get(5), (List) list22.get(6), (List) list22.get(7));
                        return h0Var;
                    }
                } else if (b10 == -115) {
                    Object objE23 = e(byteBuffer);
                    List list23 = objE23 instanceof List ? (List) objE23 : null;
                    if (list23 != null) {
                        Object obj41 = list23.get(0);
                        n.d(obj41, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
                        Object obj42 = list23.get(1);
                        n.d(obj42, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformProductDetails>");
                        Object obj43 = list23.get(2);
                        n.d(obj43, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformUnfetchedProduct>");
                        return new x((lj.q) obj41, (List) obj42, (List) obj43);
                    }
                } else if (b10 == -114) {
                    Object objE24 = e(byteBuffer);
                    List list24 = objE24 instanceof List ? (List) objE24 : null;
                    if (list24 != null) {
                        Object obj44 = list24.get(0);
                        n.d(obj44, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
                        Object obj45 = list24.get(1);
                        n.d(obj45, "null cannot be cast to non-null type kotlin.String");
                        return new lj.k((lj.q) obj44, (String) obj45);
                    }
                } else if (b10 == -113) {
                    Object objE25 = e(byteBuffer);
                    List list25 = objE25 instanceof List ? (List) objE25 : null;
                    if (list25 != null) {
                        Object obj46 = list25.get(0);
                        n.d(obj46, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
                        Object obj47 = list25.get(1);
                        n.d(obj47, "null cannot be cast to non-null type kotlin.String");
                        return new lj.n((lj.q) obj46, (String) obj47);
                    }
                } else if (b10 == -112) {
                    Object objE26 = e(byteBuffer);
                    List list26 = objE26 instanceof List ? (List) objE26 : null;
                    if (list26 != null) {
                        Object obj48 = list26.get(0);
                        n.d(obj48, "null cannot be cast to non-null type kotlin.String");
                        String str12 = (String) obj48;
                        Object obj49 = list26.get(1);
                        n.d(obj49, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformReplacementMode");
                        h0Var = new lj.o(str12, (g0) obj49, (String) list26.get(2), (String) list26.get(3), (String) list26.get(4), (String) list26.get(5), (String) list26.get(6));
                        return h0Var;
                    }
                } else if (b10 == -111) {
                    Object objE27 = e(byteBuffer);
                    List list27 = objE27 instanceof List ? (List) objE27 : null;
                    if (list27 != null) {
                        Object obj50 = list27.get(0);
                        n.d(obj50, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue2 = ((Long) obj50).longValue();
                        Object obj51 = list27.get(1);
                        n.d(obj51, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformRecurrenceMode");
                        f0 f0Var = (f0) obj51;
                        Object obj52 = list27.get(2);
                        n.d(obj52, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue3 = ((Long) obj52).longValue();
                        Object obj53 = list27.get(3);
                        n.d(obj53, "null cannot be cast to non-null type kotlin.String");
                        String str13 = (String) obj53;
                        Object obj54 = list27.get(4);
                        n.d(obj54, "null cannot be cast to non-null type kotlin.String");
                        Object obj55 = list27.get(5);
                        n.d(obj55, "null cannot be cast to non-null type kotlin.String");
                        h0Var = new lj.v(jLongValue2, f0Var, jLongValue3, str13, (String) obj54, (String) obj55);
                        return h0Var;
                    }
                } else if (b10 == -110) {
                    Object objE28 = e(byteBuffer);
                    List list28 = objE28 instanceof List ? (List) objE28 : null;
                    if (list28 != null) {
                        String str14 = (String) list28.get(0);
                        Object obj56 = list28.get(1);
                        n.d(obj56, "null cannot be cast to non-null type kotlin.String");
                        String str15 = (String) obj56;
                        Object obj57 = list28.get(2);
                        n.d(obj57, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue4 = ((Long) obj57).longValue();
                        Object obj58 = list28.get(3);
                        n.d(obj58, "null cannot be cast to non-null type kotlin.String");
                        String str16 = (String) obj58;
                        Object obj59 = list28.get(4);
                        n.d(obj59, "null cannot be cast to non-null type kotlin.String");
                        String str17 = (String) obj59;
                        Object obj60 = list28.get(5);
                        n.d(obj60, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        List list29 = (List) obj60;
                        Object obj61 = list28.get(6);
                        n.d(obj61, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue3 = ((Boolean) obj61).booleanValue();
                        Object obj62 = list28.get(7);
                        n.d(obj62, "null cannot be cast to non-null type kotlin.String");
                        String str18 = (String) obj62;
                        Object obj63 = list28.get(8);
                        n.d(obj63, "null cannot be cast to non-null type kotlin.String");
                        String str19 = (String) obj63;
                        Object obj64 = list28.get(9);
                        n.d(obj64, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue4 = ((Boolean) obj64).booleanValue();
                        Object obj65 = list28.get(10);
                        n.d(obj65, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue5 = ((Long) obj65).longValue();
                        Object obj66 = list28.get(11);
                        n.d(obj66, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPurchaseState");
                        a0Var = new z(str14, str15, jLongValue4, str16, str17, list29, zBooleanValue3, str18, str19, zBooleanValue4, jLongValue5, (c0) obj66, (lj.j) list28.get(12), (lj.t) list28.get(13));
                        return a0Var;
                    }
                } else if (b10 == -109) {
                    Object objE29 = e(byteBuffer);
                    List list30 = objE29 instanceof List ? (List) objE29 : null;
                    if (list30 != null) {
                        Object obj67 = list30.get(0);
                        n.d(obj67, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        Object obj68 = list30.get(1);
                        n.d(obj68, "null cannot be cast to non-null type kotlin.String");
                        return new lj.t((String) obj68, (List) obj67);
                    }
                } else if (b10 == -108) {
                    Object objE30 = e(byteBuffer);
                    List list31 = objE30 instanceof List ? (List) objE30 : null;
                    if (list31 != null) {
                        Object obj69 = list31.get(0);
                        n.d(obj69, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue6 = ((Long) obj69).longValue();
                        Object obj70 = list31.get(1);
                        n.d(obj70, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue7 = ((Long) obj70).longValue();
                        String str20 = (String) list31.get(2);
                        Object obj71 = list31.get(3);
                        n.d(obj71, "null cannot be cast to non-null type kotlin.String");
                        String str21 = (String) obj71;
                        Object obj72 = list31.get(4);
                        n.d(obj72, "null cannot be cast to non-null type kotlin.String");
                        String str22 = (String) obj72;
                        Object obj73 = list31.get(5);
                        n.d(obj73, "null cannot be cast to non-null type kotlin.String");
                        Object obj74 = list31.get(6);
                        n.d(obj74, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        a0Var = new a0(jLongValue6, jLongValue7, str20, str21, str22, (String) obj73, (List) obj74);
                        return a0Var;
                    }
                } else if (b10 == -107) {
                    Object objE31 = e(byteBuffer);
                    List list32 = objE31 instanceof List ? (List) objE31 : null;
                    if (list32 != null) {
                        Object obj75 = list32.get(0);
                        n.d(obj75, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
                        Object obj76 = list32.get(1);
                        n.d(obj76, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPurchaseHistoryRecord>");
                        return new b0((lj.q) obj75, (List) obj76);
                    }
                } else if (b10 == -106) {
                    Object objE32 = e(byteBuffer);
                    List list33 = objE32 instanceof List ? (List) objE32 : null;
                    if (list33 != null) {
                        Object obj77 = list33.get(0);
                        n.d(obj77, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
                        Object obj78 = list33.get(1);
                        n.d(obj78, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPurchase>");
                        return new d0((lj.q) obj77, (List) obj78);
                    }
                } else if (b10 == -105) {
                    Object objE33 = e(byteBuffer);
                    List list34 = objE33 instanceof List ? (List) objE33 : null;
                    if (list34 != null) {
                        Object obj79 = list34.get(0);
                        n.d(obj79, "null cannot be cast to non-null type kotlin.String");
                        String str23 = (String) obj79;
                        String str24 = (String) list34.get(1);
                        Object obj80 = list34.get(2);
                        n.d(obj80, "null cannot be cast to non-null type kotlin.String");
                        String str25 = (String) obj80;
                        Object obj81 = list34.get(3);
                        n.d(obj81, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        List list35 = (List) obj81;
                        Object obj82 = list34.get(4);
                        n.d(obj82, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPricingPhase>");
                        h0Var = new h0(str23, str24, str25, list35, (List) obj82, (lj.r) list34.get(5));
                        return h0Var;
                    }
                } else if (b10 == -104) {
                    Object objE34 = e(byteBuffer);
                    List list36 = objE34 instanceof List ? (List) objE34 : null;
                    if (list36 != null) {
                        String str26 = (String) list36.get(0);
                        Object obj83 = list36.get(1);
                        n.d(obj83, "null cannot be cast to non-null type kotlin.String");
                        Object obj84 = list36.get(2);
                        n.d(obj84, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformUserChoiceProduct>");
                        return new j0(str26, (String) obj83, (List) obj84);
                    }
                } else if (b10 == -103) {
                    Object objE35 = e(byteBuffer);
                    List list37 = objE35 instanceof List ? (List) objE35 : null;
                    if (list37 != null) {
                        Object obj85 = list37.get(0);
                        n.d(obj85, "null cannot be cast to non-null type kotlin.String");
                        String str27 = (String) list37.get(1);
                        Object obj86 = list37.get(2);
                        n.d(obj86, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                        return new k0((String) obj85, str27, (y) obj86);
                    }
                } else if (b10 == -102) {
                    Object objE36 = e(byteBuffer);
                    List list38 = objE36 instanceof List ? (List) objE36 : null;
                    if (list38 != null) {
                        Object obj87 = list38.get(0);
                        n.d(obj87, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue8 = ((Long) obj87).longValue();
                        Object obj88 = list38.get(1);
                        n.d(obj88, "null cannot be cast to non-null type kotlin.Long");
                        return new lj.r(jLongValue8, ((Long) obj88).longValue());
                    }
                } else if (b10 == -101) {
                    Object objE37 = e(byteBuffer);
                    List list39 = objE37 instanceof List ? (List) objE37 : null;
                    if (list39 != null) {
                        Object obj89 = list39.get(0);
                        n.d(obj89, "null cannot be cast to non-null type kotlin.Boolean");
                        return new lj.u(((Boolean) obj89).booleanValue());
                    }
                } else {
                    if (b10 != -100) {
                        return super.f(b10, byteBuffer);
                    }
                    Object objE38 = e(byteBuffer);
                    List list40 = objE38 instanceof List ? (List) objE38 : null;
                    if (list40 != null) {
                        Object obj90 = list40.get(0);
                        n.d(obj90, "null cannot be cast to non-null type kotlin.String");
                        return new i0((String) obj90);
                    }
                }
                return null;
            case 7:
                if (b10 != -127) {
                    return super.f(b10, byteBuffer);
                }
                Object objE39 = e(byteBuffer);
                List list41 = objE39 instanceof List ? (List) objE39 : null;
                if (list41 == null) {
                    return null;
                }
                Object obj91 = list41.get(0);
                n.d(obj91, "null cannot be cast to non-null type kotlin.String");
                Object obj92 = list41.get(1);
                n.d(obj92, "null cannot be cast to non-null type kotlin.String");
                return new nj.h((String) obj91, (String) obj92, (String) list41.get(2));
            case 8:
                if (b10 != -127) {
                    if (b10 != -126) {
                        return super.f(b10, byteBuffer);
                    }
                    Object objE40 = e(byteBuffer);
                    List list42 = objE40 instanceof List ? (List) objE40 : null;
                    if (list42 == null) {
                        return null;
                    }
                    Object obj93 = list42.get(0);
                    n.d(obj93, "null cannot be cast to non-null type kotlin.Boolean");
                    return new pj.a(((Boolean) obj93).booleanValue());
                }
                Object objE41 = e(byteBuffer);
                List list43 = objE41 instanceof List ? (List) objE41 : null;
                if (list43 == null) {
                    return null;
                }
                Object obj94 = list43.get(0);
                n.d(obj94, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue5 = ((Boolean) obj94).booleanValue();
                Object obj95 = list43.get(1);
                n.d(obj95, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue6 = ((Boolean) obj95).booleanValue();
                Object obj96 = list43.get(2);
                n.d(obj96, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                return new pj.h((Map) obj96, zBooleanValue5, zBooleanValue6);
            case 9:
                return l(b10, byteBuffer);
            case 10:
                int i12 = 0;
                if (b10 == -127) {
                    Long l20 = (Long) e(byteBuffer);
                    if (l20 != null) {
                        int iLongValue12 = (int) l20.longValue();
                        tj.p.f50877b.getClass();
                        tj.p[] pVarArrValues = tj.p.values();
                        int length11 = pVarArrValues.length;
                        while (i12 < length11) {
                            tj.p pVar = pVarArrValues[i12];
                            if (pVar.f50883a == iLongValue12) {
                                return pVar;
                            }
                            i12++;
                        }
                    }
                } else if (b10 == -126) {
                    Long l21 = (Long) e(byteBuffer);
                    if (l21 != null) {
                        int iLongValue13 = (int) l21.longValue();
                        tj.i.f50831b.getClass();
                        tj.i[] iVarArrValues = tj.i.values();
                        int length12 = iVarArrValues.length;
                        while (i12 < length12) {
                            tj.i iVar = iVarArrValues[i12];
                            if (iVar.f50839a == iLongValue13) {
                                return iVar;
                            }
                            i12++;
                        }
                    }
                } else if (b10 == -125) {
                    Long l22 = (Long) e(byteBuffer);
                    if (l22 != null) {
                        int iLongValue14 = (int) l22.longValue();
                        tj.u.f50912b.getClass();
                        tj.u[] uVarArrValues = tj.u.values();
                        int length13 = uVarArrValues.length;
                        while (i12 < length13) {
                            tj.u uVar = uVarArrValues[i12];
                            if (uVar.f50915a == iLongValue14) {
                                return uVar;
                            }
                            i12++;
                        }
                    }
                } else if (b10 == -124) {
                    Long l23 = (Long) e(byteBuffer);
                    if (l23 != null) {
                        int iLongValue15 = (int) l23.longValue();
                        tj.k0.f50849b.getClass();
                        tj.k0[] k0VarArrValues = tj.k0.values();
                        int length14 = k0VarArrValues.length;
                        while (i12 < length14) {
                            tj.k0 k0Var = k0VarArrValues[i12];
                            if (k0Var.f50858a == iLongValue15) {
                                return k0Var;
                            }
                            i12++;
                        }
                    }
                } else if (b10 == -123) {
                    Long l24 = (Long) e(byteBuffer);
                    if (l24 != null) {
                        int iLongValue16 = (int) l24.longValue();
                        tj.t.f50907b.getClass();
                        tj.t[] tVarArrValues = tj.t.values();
                        int length15 = tVarArrValues.length;
                        while (i12 < length15) {
                            tj.t tVar = tVarArrValues[i12];
                            if (tVar.f50909a == iLongValue16) {
                                return tVar;
                            }
                            i12++;
                        }
                    }
                } else {
                    if (b10 != -122) {
                        return super.f(b10, byteBuffer);
                    }
                    Long l25 = (Long) e(byteBuffer);
                    if (l25 != null) {
                        int iLongValue17 = (int) l25.longValue();
                        x0.f50933b.getClass();
                        x0[] x0VarArrValues = x0.values();
                        int length16 = x0VarArrValues.length;
                        while (i12 < length16) {
                            x0 x0Var = x0VarArrValues[i12];
                            if (x0Var.f50935a == iLongValue17) {
                                return x0Var;
                            }
                            i12++;
                        }
                    }
                }
                return null;
            default:
                int i13 = 0;
                if (b10 == -127) {
                    Long l26 = (Long) e(byteBuffer);
                    if (l26 == null) {
                        return null;
                    }
                    int iLongValue18 = (int) l26.longValue();
                    x5.c.f53647b.getClass();
                    ?? Values11 = x5.c.values();
                    int length17 = Values11.length;
                    while (i13 < length17) {
                        r11 = Values11[i13];
                        if (r11.f53652a != iLongValue18) {
                            i13++;
                        }
                    }
                    return null;
                }
                if (b10 == -126) {
                    Long l27 = (Long) e(byteBuffer);
                    if (l27 == null) {
                        return null;
                    }
                    int iLongValue19 = (int) l27.longValue();
                    x5.a.f53632b.getClass();
                    ?? Values12 = x5.a.values();
                    int length18 = Values12.length;
                    while (i13 < length18) {
                        r11 = Values12[i13];
                        if (r11.f53642a != iLongValue19) {
                            i13++;
                        }
                    }
                    return null;
                }
                if (b10 != -125) {
                    if (b10 != -124) {
                        return super.f(b10, byteBuffer);
                    }
                    Object objE42 = e(byteBuffer);
                    List list44 = objE42 instanceof List ? (List) objE42 : null;
                    if (list44 != null) {
                        return new x5.b((x5.c) list44.get(0), (x5.a) list44.get(1), (x5.d) list44.get(2), (String) list44.get(3));
                    }
                    return null;
                }
                Long l28 = (Long) e(byteBuffer);
                if (l28 == null) {
                    return null;
                }
                int iLongValue20 = (int) l28.longValue();
                x5.d.f53653b.getClass();
                ?? Values13 = x5.d.values();
                int length19 = Values13.length;
                while (i13 < length19) {
                    r11 = Values13[i13];
                    if (r11.f53656a != iLongValue20) {
                        i13++;
                    }
                }
                return null;
                return r11;
        }
    }

    /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
    @Override // xi.u
    public void k(ByteArrayOutputStream stream, Object obj) {
        int i10 = this.f42047d;
        n.f(stream, "stream");
        switch (i10) {
            case 0:
                if (obj instanceof b) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, j1.f.C(((b) obj).f5073a));
                } else if (!(obj instanceof a)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, j1.f.C(((a) obj).f3310a));
                }
                break;
            case 1:
                if (!(obj instanceof a)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    a aVar = (a) obj;
                    k(stream, xj.o.Q(aVar.f6436a, aVar.f6437b));
                }
                break;
            case 2:
                if (obj instanceof dj.a) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    dj.a aVar2 = (dj.a) obj;
                    k(stream, xj.o.Q(aVar2.f38904a, aVar2.f38905b, aVar2.f38906c, aVar2.f38907d, aVar2.f38908e, aVar2.f38909f, aVar2.f38910g, aVar2.f38911h, aVar2.f38912i, aVar2.f38913j, aVar2.f38914k, aVar2.l, aVar2.f38915m, aVar2.f38916n));
                } else if (!(obj instanceof b)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    b bVar = (b) obj;
                    k(stream, xj.o.Q(bVar.f38917a, bVar.f38918b, bVar.f38919c, bVar.f38920d));
                }
                break;
            case 3:
                if (obj instanceof fj.a) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    fj.a aVar3 = (fj.a) obj;
                    k(stream, xj.o.Q(aVar3.f40953a, aVar3.f40954b, aVar3.f40955c, aVar3.f40956d));
                } else if (!(obj instanceof fj.f)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    fj.f fVar = (fj.f) obj;
                    k(stream, xj.o.Q(fVar.f40964a, fVar.f40965b, fVar.f40966c, Boolean.valueOf(fVar.f40967d), fVar.f40968e, fVar.f40969f, fVar.f40970g));
                }
                break;
            case 4:
                if (obj instanceof hj.g) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, Long.valueOf(((hj.g) obj).f42374a));
                } else if (obj instanceof i) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    i iVar = (i) obj;
                    k(stream, xj.o.Q(iVar.f42380a, iVar.f42381b));
                } else if (obj instanceof hj.h) {
                    stream.write(131);
                    hj.h hVar = (hj.h) obj;
                    k(stream, xj.o.Q(hVar.f42375a, hVar.f42376b, hVar.f42377c, hVar.f42378d, hVar.f42379e));
                } else if (!(obj instanceof hj.j)) {
                    super.k(stream, obj);
                } else {
                    stream.write(132);
                    hj.j jVar = (hj.j) obj;
                    k(stream, xj.o.Q(jVar.f42382a, jVar.f42383b));
                }
                break;
            case 5:
                if (obj instanceof kj.s) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, Long.valueOf(((kj.s) obj).f44709a));
                } else if (obj instanceof kj.u) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, Long.valueOf(((kj.u) obj).f44714a));
                } else if (obj instanceof c) {
                    stream.write(131);
                    k(stream, Long.valueOf(((c) obj).f44665a));
                } else if (obj instanceof kj.e) {
                    stream.write(132);
                    kj.e eVar = (kj.e) obj;
                    k(stream, xj.o.Q(Boolean.valueOf(eVar.f44668a), Boolean.valueOf(eVar.f44669b), eVar.f44670c));
                } else if (obj instanceof kj.q) {
                    stream.write(133);
                    kj.q qVar = (kj.q) obj;
                    k(stream, xj.o.Q(qVar.f44703a, qVar.f44704b, Long.valueOf(qVar.f44705c)));
                } else if (obj instanceof kj.r) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
                    k(stream, j1.f.C(((kj.r) obj).f44706a));
                } else if (obj instanceof kj.v) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_E_AC3);
                    k(stream, j1.f.C(((kj.v) obj).f44715a));
                } else if (obj instanceof kj.t) {
                    stream.write(136);
                    kj.t tVar = (kj.t) obj;
                    k(stream, xj.o.Q(tVar.f44710a, tVar.f44711b));
                } else if (obj instanceof kj.a) {
                    stream.write(137);
                    kj.a aVar4 = (kj.a) obj;
                    k(stream, xj.o.Q(aVar4.f44656a, aVar4.f44657b));
                } else if (!(obj instanceof kj.b)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_DTS);
                    kj.b bVar2 = (kj.b) obj;
                    k(stream, xj.o.Q(bVar2.f44658a, bVar2.f44659b, bVar2.f44660c));
                }
                break;
            case 6:
                if (obj instanceof p) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, Long.valueOf(((p) obj).f45437a));
                    break;
                } else if (obj instanceof g0) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, Long.valueOf(((g0) obj).f45378a));
                    break;
                } else if (obj instanceof y) {
                    stream.write(131);
                    k(stream, Long.valueOf(((y) obj).f45470a));
                    break;
                } else if (obj instanceof l) {
                    stream.write(132);
                    k(stream, Long.valueOf(((l) obj).f45406a));
                    break;
                } else if (obj instanceof m) {
                    stream.write(133);
                    k(stream, Long.valueOf(((m) obj).f45411a));
                    break;
                } else if (obj instanceof c0) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
                    k(stream, Long.valueOf(((c0) obj).f45356a));
                    break;
                } else {
                    if (obj instanceof f0) {
                        stream.write(TsExtractor.TS_STREAM_TYPE_E_AC3);
                        k(stream, Long.valueOf(((f0) obj).f45372a));
                    } else if (obj instanceof e0) {
                        stream.write(136);
                        e0 e0Var = (e0) obj;
                        k(stream, xj.o.Q(e0Var.f45362a, e0Var.f45363b));
                    } else if (obj instanceof lj.j) {
                        stream.write(137);
                        lj.j jVar2 = (lj.j) obj;
                        k(stream, xj.o.Q(jVar2.f45394a, jVar2.f45395b));
                    } else if (obj instanceof lj.q) {
                        stream.write(TsExtractor.TS_STREAM_TYPE_DTS);
                        lj.q qVar2 = (lj.q) obj;
                        k(stream, xj.o.Q(qVar2.f45438a, qVar2.f45439b, Long.valueOf(qVar2.f45440c)));
                    } else if (obj instanceof lj.s) {
                        stream.write(139);
                        lj.s sVar = (lj.s) obj;
                        k(stream, xj.o.Q(Long.valueOf(sVar.f45443a), sVar.f45444b, sVar.f45445c));
                    } else if (obj instanceof w) {
                        stream.write(140);
                        w wVar = (w) obj;
                        k(stream, xj.o.Q(wVar.f45455a, wVar.f45456b, wVar.f45457c, wVar.f45458d, wVar.f45459e, wVar.f45460f, wVar.f45461g, wVar.f45462h));
                    } else if (obj instanceof x) {
                        stream.write(141);
                        x xVar = (x) obj;
                        k(stream, xj.o.Q(xVar.f45463a, xVar.f45464b, xVar.f45465c));
                    } else if (obj instanceof lj.k) {
                        stream.write(142);
                        lj.k kVar = (lj.k) obj;
                        k(stream, xj.o.Q(kVar.f45399a, kVar.f45400b));
                    } else if (obj instanceof lj.n) {
                        stream.write(143);
                        lj.n nVar = (lj.n) obj;
                        k(stream, xj.o.Q(nVar.f45415a, nVar.f45416b));
                    } else if (obj instanceof lj.o) {
                        stream.write(144);
                        lj.o oVar = (lj.o) obj;
                        k(stream, xj.o.Q(oVar.f45417a, oVar.f45418b, oVar.f45419c, oVar.f45420d, oVar.f45421e, oVar.f45422f, oVar.f45423g));
                    } else if (obj instanceof lj.v) {
                        stream.write(145);
                        lj.v vVar = (lj.v) obj;
                        k(stream, xj.o.Q(Long.valueOf(vVar.f45449a), vVar.f45450b, Long.valueOf(vVar.f45451c), vVar.f45452d, vVar.f45453e, vVar.f45454f));
                    } else if (obj instanceof z) {
                        stream.write(146);
                        z zVar = (z) obj;
                        k(stream, xj.o.Q(zVar.f45471a, zVar.f45472b, Long.valueOf(zVar.f45473c), zVar.f45474d, zVar.f45475e, zVar.f45476f, Boolean.valueOf(zVar.f45477g), zVar.f45478h, zVar.f45479i, Boolean.valueOf(zVar.f45480j), Long.valueOf(zVar.f45481k), zVar.l, zVar.f45482m, zVar.f45483n));
                    } else if (obj instanceof lj.t) {
                        stream.write(147);
                        lj.t tVar2 = (lj.t) obj;
                        k(stream, xj.o.Q(tVar2.f45446a, tVar2.f45447b));
                    } else if (obj instanceof a0) {
                        stream.write(148);
                        a0 a0Var = (a0) obj;
                        k(stream, xj.o.Q(Long.valueOf(a0Var.f45337a), Long.valueOf(a0Var.f45338b), a0Var.f45339c, a0Var.f45340d, a0Var.f45341e, a0Var.f45342f, a0Var.f45343g));
                    } else if (obj instanceof b0) {
                        stream.write(149);
                        b0 b0Var = (b0) obj;
                        k(stream, xj.o.Q(b0Var.f45347a, b0Var.f45348b));
                    } else if (obj instanceof d0) {
                        stream.write(150);
                        d0 d0Var = (d0) obj;
                        k(stream, xj.o.Q(d0Var.f45359a, d0Var.f45360b));
                    } else if (obj instanceof h0) {
                        stream.write(151);
                        h0 h0Var = (h0) obj;
                        k(stream, xj.o.Q(h0Var.f45380a, h0Var.f45381b, h0Var.f45382c, h0Var.f45383d, h0Var.f45384e, h0Var.f45385f));
                    } else if (obj instanceof j0) {
                        stream.write(152);
                        j0 j0Var = (j0) obj;
                        k(stream, xj.o.Q(j0Var.f45396a, j0Var.f45397b, j0Var.f45398c));
                    } else if (obj instanceof k0) {
                        stream.write(153);
                        k0 k0Var = (k0) obj;
                        k(stream, xj.o.Q(k0Var.f45401a, k0Var.f45402b, k0Var.f45403c));
                    } else if (obj instanceof lj.r) {
                        stream.write(154);
                        lj.r rVar = (lj.r) obj;
                        k(stream, xj.o.Q(Long.valueOf(rVar.f45441a), Long.valueOf(rVar.f45442b)));
                    } else if (obj instanceof lj.u) {
                        stream.write(155);
                        k(stream, j1.f.C(Boolean.valueOf(((lj.u) obj).f45448a)));
                    } else if (!(obj instanceof i0)) {
                        super.k(stream, obj);
                    } else {
                        stream.write(156);
                        k(stream, j1.f.C(((i0) obj).f45393a));
                    }
                    break;
                }
                break;
            case 7:
                if (!(obj instanceof nj.h)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    nj.h hVar2 = (nj.h) obj;
                    k(stream, xj.o.Q(hVar2.f46780a, hVar2.f46781b, hVar2.f46782c));
                }
                break;
            case 8:
                if (obj instanceof pj.h) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    pj.h hVar3 = (pj.h) obj;
                    k(stream, xj.o.Q(Boolean.valueOf(hVar3.f48390a), Boolean.valueOf(hVar3.f48391b), hVar3.f48392c));
                } else if (!(obj instanceof pj.a)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, j1.f.C(Boolean.valueOf(((pj.a) obj).f48381a)));
                }
                break;
            case 9:
                if (obj instanceof q) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, Long.valueOf(((q) obj).f49082a));
                } else if (obj instanceof o) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, Long.valueOf(((o) obj).f49079a));
                } else if (obj instanceof j) {
                    stream.write(131);
                    k(stream, ((j) obj).a());
                } else if (obj instanceof t) {
                    stream.write(132);
                    k(stream, j1.f.C(((t) obj).f49086a));
                } else if (obj instanceof k) {
                    stream.write(133);
                    k(stream, j1.f.C(Boolean.valueOf(((k) obj).f49068a)));
                } else if (obj instanceof d) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
                    k(stream, j1.f.C(((d) obj).f49036a));
                } else if (obj instanceof r) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_E_AC3);
                    k(stream, j1.f.C(Long.valueOf(((r) obj).f49083a)));
                } else if (obj instanceof f) {
                    stream.write(136);
                    k(stream, ((f) obj).a());
                } else if (obj instanceof v) {
                    stream.write(137);
                    k(stream, ((v) obj).a());
                } else if (obj instanceof s) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_DTS);
                    k(stream, ((s) obj).a());
                } else if (obj instanceof e) {
                    stream.write(139);
                    k(stream, ((e) obj).a());
                } else if (obj instanceof g) {
                    stream.write(140);
                    k(stream, ((g) obj).a());
                } else if (!(obj instanceof qj.n)) {
                    super.k(stream, obj);
                } else {
                    stream.write(141);
                    k(stream, j1.f.C(((qj.n) obj).f49071a));
                }
                break;
            case 10:
                if (obj instanceof tj.p) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, Long.valueOf(((tj.p) obj).f50883a));
                } else if (obj instanceof tj.i) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, Long.valueOf(((tj.i) obj).f50839a));
                } else if (obj instanceof tj.u) {
                    stream.write(131);
                    k(stream, Long.valueOf(((tj.u) obj).f50915a));
                } else if (obj instanceof tj.k0) {
                    stream.write(132);
                    k(stream, Long.valueOf(((tj.k0) obj).f50858a));
                } else if (obj instanceof tj.t) {
                    stream.write(133);
                    k(stream, Long.valueOf(((tj.t) obj).f50909a));
                } else if (!(obj instanceof x0)) {
                    super.k(stream, obj);
                } else {
                    stream.write(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
                    k(stream, Long.valueOf(((x0) obj).f50935a));
                }
                break;
            default:
                if (obj instanceof x5.c) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, Long.valueOf(((x5.c) obj).f53652a));
                } else if (obj instanceof x5.a) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, Long.valueOf(((x5.a) obj).f53642a));
                } else if (obj instanceof x5.d) {
                    stream.write(131);
                    k(stream, Long.valueOf(((x5.d) obj).f53656a));
                } else if (!(obj instanceof x5.b)) {
                    super.k(stream, obj);
                } else {
                    stream.write(132);
                    k(stream, ((x5.b) obj).a());
                }
                break;
        }
    }
}
