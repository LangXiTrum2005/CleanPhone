package oj;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f47481a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f47482b = r9.b.u(new defpackage.c(16));

    public static xi.l a() {
        return (xi.l) f47482b.getValue();
    }

    public static void b(xi.f binaryMessenger, final f fVar, String str) {
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        String strConcat = str.length() > 0 ? ".".concat(str) : "";
        ne.c cVarH = binaryMessenger.h(new xi.k());
        k5.g gVar = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i10 = 6;
            gVar.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i11 = i10;
                    f fVar2 = fVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i11 = 12;
            gVar2.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i12 = i11;
                    f fVar2 = fVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i12 = 13;
            gVar3.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i13 = i12;
                    f fVar2 = fVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i13 = 14;
            gVar4.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i14 = i13;
                    f fVar2 = fVar;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i14 = 0;
            gVar5.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i15 = i14;
                    f fVar2 = fVar;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i15 = 1;
            gVar6.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i16 = i15;
                    f fVar2 = fVar;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i16 = 2;
            gVar7.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i17 = i16;
                    f fVar2 = fVar;
                    switch (i17) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        k5.g gVar8 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i17 = 3;
            gVar8.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i18 = i17;
                    f fVar2 = fVar;
                    switch (i18) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        k5.g gVar9 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i18 = 4;
            gVar9.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i19 = i18;
                    f fVar2 = fVar;
                    switch (i19) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar9.C(null);
        }
        k5.g gVar10 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i19 = 5;
            gVar10.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i110 = i19;
                    f fVar2 = fVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar10.C(null);
        }
        k5.g gVar11 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i20 = 7;
            gVar11.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i110 = i20;
                    f fVar2 = fVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar11.C(null);
        }
        k5.g gVar12 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i21 = 8;
            gVar12.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i110 = i21;
                    f fVar2 = fVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar12.C(null);
        }
        k5.g gVar13 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i22 = 9;
            gVar13.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i110 = i22;
                    f fVar2 = fVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar13.C(null);
        }
        k5.g gVar14 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), cVarH);
        if (fVar != null) {
            final int i23 = 10;
            gVar14.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i110 = i23;
                    f fVar2 = fVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        } else {
            gVar14.C(null);
        }
        k5.g gVar15 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), cVarH);
        if (fVar == null) {
            gVar15.C(null);
        } else {
            final int i24 = 11;
            gVar15.C(new xi.b() { // from class: oj.d
                @Override // xi.b
                public final void t(Object obj, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    int i110 = i24;
                    f fVar2 = fVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.d(str2, str3, (g) obj4);
                                listQ = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.f(str4, list3, (g) obj7);
                                listQ2 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ3 = j1.f.C(fVar2.a(str5, (g) obj9));
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ4 = j1.f.C(fVar2.n(str6, (g) obj11));
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ5 = j1.f.C(fVar2.k(str7, (g) obj13));
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ6 = j1.f.C(fVar2.i(str8, (g) obj15));
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.p(str9, zBooleanValue, (g) obj18);
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ8 = j1.f.C(fVar2.r(str10, (g) obj20));
                            } catch (Throwable th9) {
                                listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ9 = j1.f.C(fVar2.m(str11, (g) obj22));
                            } catch (Throwable th10) {
                                listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.t(list12, (g) obj23);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th11) {
                                listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ11 = j1.f.C(fVar2.q(list14, (g) obj24));
                            } catch (Throwable th12) {
                                listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listQ12 = j1.f.C(fVar2.u(list16, (g) obj25));
                            } catch (Throwable th13) {
                                listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.c(str12, str13, (g) obj28);
                                listQ13 = j1.f.C(null);
                            } catch (Throwable th14) {
                                listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.s(str14, jLongValue, (g) obj31);
                                listQ14 = j1.f.C(null);
                            } catch (Throwable th15) {
                                listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            bVar.e(listQ14);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                fVar2.l(str15, dDoubleValue, (g) obj34);
                                listQ15 = j1.f.C(null);
                            } catch (Throwable th16) {
                                listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                            }
                            bVar.e(listQ15);
                            break;
                    }
                }
            });
        }
    }
}
