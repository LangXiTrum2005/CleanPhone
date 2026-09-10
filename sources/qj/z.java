package qj;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z f49099a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f49100b = r9.b.u(new defpackage.c(19));

    public static xi.l a() {
        return (xi.l) f49100b.getValue();
    }

    public static void b(xi.f binaryMessenger, final w wVar, String messageChannelSuffix) {
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        kotlin.jvm.internal.n.f(messageChannelSuffix, "messageChannelSuffix");
        String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping", strConcat), a(), obj);
        if (wVar != null) {
            final int i10 = 1;
            gVar.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i11 = i10;
                    a0 a0Var = wVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume", strConcat), a(), obj);
        if (wVar != null) {
            final int i11 = 2;
            gVar2.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i12 = i11;
                    a0 a0Var = wVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed", strConcat), a(), obj);
        if (wVar != null) {
            final int i12 = 3;
            gVar3.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i13 = i12;
                    a0 a0Var = wVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play", strConcat), a(), obj);
        if (wVar != null) {
            final int i13 = 4;
            gVar4.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i14 = i13;
                    a0 a0Var = wVar;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause", strConcat), a(), obj);
        if (wVar != null) {
            final int i14 = 5;
            gVar5.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i15 = i14;
                    a0 a0Var = wVar;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo", strConcat), a(), obj);
        if (wVar != null) {
            final int i15 = 6;
            gVar6.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i16 = i15;
                    a0 a0Var = wVar;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getCurrentPosition", strConcat), a(), obj);
        if (wVar != null) {
            final int i16 = 7;
            gVar7.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i17 = i16;
                    a0 a0Var = wVar;
                    switch (i17) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        k5.g gVar8 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getBufferedPosition", strConcat), a(), obj);
        if (wVar != null) {
            final int i17 = 8;
            gVar8.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i18 = i17;
                    a0 a0Var = wVar;
                    switch (i18) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        k5.g gVar9 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getAudioTracks", strConcat), a(), obj);
        if (wVar != null) {
            final int i18 = 9;
            gVar9.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i19 = i18;
                    a0 a0Var = wVar;
                    switch (i19) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar9.C(null);
        }
        k5.g gVar10 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.selectAudioTrack", strConcat), a(), obj);
        if (wVar == null) {
            gVar10.C(null);
        } else {
            final int i19 = 0;
            gVar10.C(new xi.b() { // from class: qj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
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
                    int i110 = i19;
                    a0 a0Var = wVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((w) a0Var).f(jLongValue, ((Long) obj4).longValue());
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th2) {
                                listQ6 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ6);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((w) a0Var).g(((Boolean) obj5).booleanValue());
                                listQ7 = j1.f.C(null);
                            } catch (Throwable th3) {
                                listQ7 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ7);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).i(((Double) obj6).doubleValue());
                                listQ8 = j1.f.C(null);
                            } catch (Throwable th4) {
                                listQ8 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ8);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((w) a0Var).h(((Double) obj7).doubleValue());
                                listQ9 = j1.f.C(null);
                            } catch (Throwable th5) {
                                listQ9 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            bVar.e(listQ9);
                            break;
                        case 4:
                            try {
                                al.b bVar2 = (al.b) ((w) a0Var).f49093e;
                                bVar2.getClass();
                                p1.b0 b0Var = (p1.b0) bVar2;
                                b0Var.l1();
                                b0Var.i1(1, true);
                                listQ3 = j1.f.C(null);
                            } catch (Throwable th6) {
                                listQ3 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ3);
                            break;
                        case 5:
                            try {
                                al.b bVar3 = (al.b) ((w) a0Var).f49093e;
                                bVar3.getClass();
                                p1.b0 b0Var2 = (p1.b0) bVar3;
                                b0Var2.l1();
                                b0Var2.i1(1, false);
                                listQ4 = j1.f.C(null);
                            } catch (Throwable th7) {
                                listQ4 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ4);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                al.b bVar4 = (al.b) ((w) a0Var).f49093e;
                                bVar4.getClass();
                                bVar4.E0(((p1.b0) bVar4).M0(), jLongValue2);
                                listQ10 = j1.f.C(null);
                            } catch (Throwable th8) {
                                listQ10 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            bVar.e(listQ10);
                            break;
                        case 7:
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).O0()));
                            } catch (Throwable th9) {
                                listQ2 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        case 8:
                            try {
                                listQ = j1.f.C(Long.valueOf(((p1.b0) ((w) a0Var).f49093e).I0()));
                            } catch (Throwable th10) {
                                listQ = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                        default:
                            try {
                                listQ5 = j1.f.C(((w) a0Var).e());
                            } catch (Throwable th11) {
                                listQ5 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        }
    }
}
