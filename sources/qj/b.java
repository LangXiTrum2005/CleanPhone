package qj;

import android.util.Log;
import android.util.LongSparseArray;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f49028a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f49029b = r9.b.u(new defpackage.c(18));

    public static xi.l a() {
        return (xi.l) f49029b.getValue();
    }

    public static void b(xi.f binaryMessenger, final c0 c0Var) {
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", ""), a(), obj);
        if (c0Var != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: qj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i11 = i10;
                    c cVar = c0Var;
                    switch (i11) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c0) cVar).f49032a;
                                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                                    ((w) longSparseArray.valueAt(i12)).d();
                                }
                                longSparseArray.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((c0) cVar).a((f) obj3)));
                                break;
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ3 = j1.f.C(((c0) cVar).b((f) obj4));
                                break;
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c0) cVar).f49032a;
                                w wVar = (w) longSparseArray2.get(jLongValue);
                                if (wVar == null) {
                                    String strJ = defpackage.e.j(jLongValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        strJ = wi.d.h(strJ, " and no active players created by the plugin.");
                                    }
                                    throw new IllegalStateException(strJ);
                                }
                                wVar.d();
                                longSparseArray2.remove(jLongValue);
                                listQ4 = j1.f.C(null);
                                bVar.e(listQ4);
                                return;
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((c0) cVar).f49034c.f45919a = ((Boolean) obj6).booleanValue();
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listQ6 = j1.f.C(((c0) cVar).c((String) obj7, (String) list.get(1)));
                                break;
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            return;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView", ""), a(), obj);
        if (c0Var != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: qj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i12 = i11;
                    c cVar = c0Var;
                    switch (i12) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c0) cVar).f49032a;
                                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                                    ((w) longSparseArray.valueAt(i13)).d();
                                }
                                longSparseArray.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((c0) cVar).a((f) obj3)));
                                break;
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ3 = j1.f.C(((c0) cVar).b((f) obj4));
                                break;
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c0) cVar).f49032a;
                                w wVar = (w) longSparseArray2.get(jLongValue);
                                if (wVar == null) {
                                    String strJ = defpackage.e.j(jLongValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        strJ = wi.d.h(strJ, " and no active players created by the plugin.");
                                    }
                                    throw new IllegalStateException(strJ);
                                }
                                wVar.d();
                                longSparseArray2.remove(jLongValue);
                                listQ4 = j1.f.C(null);
                                bVar.e(listQ4);
                                return;
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((c0) cVar).f49034c.f45919a = ((Boolean) obj6).booleanValue();
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listQ6 = j1.f.C(((c0) cVar).c((String) obj7, (String) list.get(1)));
                                break;
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            return;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView", ""), a(), obj);
        if (c0Var != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: qj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i13 = i12;
                    c cVar = c0Var;
                    switch (i13) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c0) cVar).f49032a;
                                for (int i14 = 0; i14 < longSparseArray.size(); i14++) {
                                    ((w) longSparseArray.valueAt(i14)).d();
                                }
                                longSparseArray.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((c0) cVar).a((f) obj3)));
                                break;
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ3 = j1.f.C(((c0) cVar).b((f) obj4));
                                break;
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c0) cVar).f49032a;
                                w wVar = (w) longSparseArray2.get(jLongValue);
                                if (wVar == null) {
                                    String strJ = defpackage.e.j(jLongValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        strJ = wi.d.h(strJ, " and no active players created by the plugin.");
                                    }
                                    throw new IllegalStateException(strJ);
                                }
                                wVar.d();
                                longSparseArray2.remove(jLongValue);
                                listQ4 = j1.f.C(null);
                                bVar.e(listQ4);
                                return;
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((c0) cVar).f49034c.f45919a = ((Boolean) obj6).booleanValue();
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listQ6 = j1.f.C(((c0) cVar).c((String) obj7, (String) list.get(1)));
                                break;
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            return;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", ""), a(), obj);
        if (c0Var != null) {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: qj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i14 = i13;
                    c cVar = c0Var;
                    switch (i14) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c0) cVar).f49032a;
                                for (int i15 = 0; i15 < longSparseArray.size(); i15++) {
                                    ((w) longSparseArray.valueAt(i15)).d();
                                }
                                longSparseArray.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((c0) cVar).a((f) obj3)));
                                break;
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ3 = j1.f.C(((c0) cVar).b((f) obj4));
                                break;
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c0) cVar).f49032a;
                                w wVar = (w) longSparseArray2.get(jLongValue);
                                if (wVar == null) {
                                    String strJ = defpackage.e.j(jLongValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        strJ = wi.d.h(strJ, " and no active players created by the plugin.");
                                    }
                                    throw new IllegalStateException(strJ);
                                }
                                wVar.d();
                                longSparseArray2.remove(jLongValue);
                                listQ4 = j1.f.C(null);
                                bVar.e(listQ4);
                                return;
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((c0) cVar).f49034c.f45919a = ((Boolean) obj6).booleanValue();
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listQ6 = j1.f.C(((c0) cVar).c((String) obj7, (String) list.get(1)));
                                break;
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            return;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", ""), a(), obj);
        if (c0Var != null) {
            final int i14 = 4;
            gVar5.C(new xi.b() { // from class: qj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i15 = i14;
                    c cVar = c0Var;
                    switch (i15) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c0) cVar).f49032a;
                                for (int i16 = 0; i16 < longSparseArray.size(); i16++) {
                                    ((w) longSparseArray.valueAt(i16)).d();
                                }
                                longSparseArray.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((c0) cVar).a((f) obj3)));
                                break;
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ3 = j1.f.C(((c0) cVar).b((f) obj4));
                                break;
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c0) cVar).f49032a;
                                w wVar = (w) longSparseArray2.get(jLongValue);
                                if (wVar == null) {
                                    String strJ = defpackage.e.j(jLongValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        strJ = wi.d.h(strJ, " and no active players created by the plugin.");
                                    }
                                    throw new IllegalStateException(strJ);
                                }
                                wVar.d();
                                longSparseArray2.remove(jLongValue);
                                listQ4 = j1.f.C(null);
                                bVar.e(listQ4);
                                return;
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((c0) cVar).f49034c.f45919a = ((Boolean) obj6).booleanValue();
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listQ6 = j1.f.C(((c0) cVar).c((String) obj7, (String) list.get(1)));
                                break;
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            return;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset", ""), a(), obj);
        if (c0Var == null) {
            gVar6.C(null);
        } else {
            final int i15 = 5;
            gVar6.C(new xi.b() { // from class: qj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i16 = i15;
                    c cVar = c0Var;
                    switch (i16) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c0) cVar).f49032a;
                                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                                    ((w) longSparseArray.valueAt(i17)).d();
                                }
                                longSparseArray.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ);
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ2 = j1.f.C(Long.valueOf(((c0) cVar).a((f) obj3)));
                                break;
                            } catch (Throwable th3) {
                                listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ2);
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listQ3 = j1.f.C(((c0) cVar).b((f) obj4));
                                break;
                            } catch (Throwable th4) {
                                listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            bVar.e(listQ3);
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c0) cVar).f49032a;
                                w wVar = (w) longSparseArray2.get(jLongValue);
                                if (wVar == null) {
                                    String strJ = defpackage.e.j(jLongValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        strJ = wi.d.h(strJ, " and no active players created by the plugin.");
                                    }
                                    throw new IllegalStateException(strJ);
                                }
                                wVar.d();
                                longSparseArray2.remove(jLongValue);
                                listQ4 = j1.f.C(null);
                                bVar.e(listQ4);
                                return;
                            } catch (Throwable th5) {
                                listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((c0) cVar).f49034c.f45919a = ((Boolean) obj6).booleanValue();
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            bVar.e(listQ5);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listQ6 = j1.f.C(((c0) cVar).c((String) obj7, (String) list.get(1)));
                                break;
                            } catch (Throwable th7) {
                                listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            bVar.e(listQ6);
                            return;
                    }
                }
            });
        }
    }
}
