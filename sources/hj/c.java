package hj;

import com.ironsource.ph;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.List;
import kotlin.jvm.internal.n;
import xi.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f42363a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f42364b = r9.b.u(new defpackage.c(10));

    public static l a() {
        return (l) f42364b.getValue();
    }

    public static void b(c cVar, xi.f binaryMessenger, final f fVar) {
        cVar.getClass();
        n.f(binaryMessenger, "binaryMessenger");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_performance_platform_interface.FirebasePerformanceHostApi.setPerformanceCollectionEnabled", strConcat), a(), obj);
        if (fVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: hj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i10) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            b bVar2 = new b(bVar, 0);
                            f fVar2 = (f) fVar;
                            fVar2.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new cj.i(zBooleanValue, bVar2, fVar2, 7));
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 29);
                            f fVar3 = (f) fVar;
                            fVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(21, cVar2, fVar3));
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 28);
                            f fVar4 = (f) fVar;
                            fVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj4, cVar3, fVar4, 27));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            Object obj6 = list.get(1);
                            n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.TraceAttributes");
                            b bVar3 = new b(bVar, 2);
                            f fVar5 = (f) fVar;
                            fVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue, bVar3, (j) obj6, fVar5, 2));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricOptions");
                            b bVar4 = new b(bVar, 1);
                            f fVar6 = (f) fVar;
                            fVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((i) obj7, bVar4, fVar6, 28));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            Object obj9 = list2.get(1);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricAttributes");
                            cj.c cVar4 = new cj.c(bVar, 27);
                            f fVar7 = (f) fVar;
                            fVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue2, cVar4, (h) obj9, fVar7, 1));
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_performance_platform_interface.FirebasePerformanceHostApi.isPerformanceCollectionEnabled", strConcat), a(), obj);
        if (fVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: hj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i11) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            b bVar2 = new b(bVar, 0);
                            f fVar2 = (f) fVar;
                            fVar2.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new cj.i(zBooleanValue, bVar2, fVar2, 7));
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 29);
                            f fVar3 = (f) fVar;
                            fVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(21, cVar2, fVar3));
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 28);
                            f fVar4 = (f) fVar;
                            fVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj4, cVar3, fVar4, 27));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            Object obj6 = list.get(1);
                            n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.TraceAttributes");
                            b bVar3 = new b(bVar, 2);
                            f fVar5 = (f) fVar;
                            fVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue, bVar3, (j) obj6, fVar5, 2));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricOptions");
                            b bVar4 = new b(bVar, 1);
                            f fVar6 = (f) fVar;
                            fVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((i) obj7, bVar4, fVar6, 28));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            Object obj9 = list2.get(1);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricAttributes");
                            cj.c cVar4 = new cj.c(bVar, 27);
                            f fVar7 = (f) fVar;
                            fVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue2, cVar4, (h) obj9, fVar7, 1));
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_performance_platform_interface.FirebasePerformanceHostApi.startTrace", strConcat), a(), obj);
        if (fVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: hj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i12) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            b bVar2 = new b(bVar, 0);
                            f fVar2 = (f) fVar;
                            fVar2.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new cj.i(zBooleanValue, bVar2, fVar2, 7));
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 29);
                            f fVar3 = (f) fVar;
                            fVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(21, cVar2, fVar3));
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 28);
                            f fVar4 = (f) fVar;
                            fVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj4, cVar3, fVar4, 27));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            Object obj6 = list.get(1);
                            n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.TraceAttributes");
                            b bVar3 = new b(bVar, 2);
                            f fVar5 = (f) fVar;
                            fVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue, bVar3, (j) obj6, fVar5, 2));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricOptions");
                            b bVar4 = new b(bVar, 1);
                            f fVar6 = (f) fVar;
                            fVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((i) obj7, bVar4, fVar6, 28));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            Object obj9 = list2.get(1);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricAttributes");
                            cj.c cVar4 = new cj.c(bVar, 27);
                            f fVar7 = (f) fVar;
                            fVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue2, cVar4, (h) obj9, fVar7, 1));
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_performance_platform_interface.FirebasePerformanceHostApi.stopTrace", strConcat), a(), obj);
        if (fVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: hj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i13) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            b bVar2 = new b(bVar, 0);
                            f fVar2 = (f) fVar;
                            fVar2.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new cj.i(zBooleanValue, bVar2, fVar2, 7));
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 29);
                            f fVar3 = (f) fVar;
                            fVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(21, cVar2, fVar3));
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 28);
                            f fVar4 = (f) fVar;
                            fVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj4, cVar3, fVar4, 27));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            Object obj6 = list.get(1);
                            n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.TraceAttributes");
                            b bVar3 = new b(bVar, 2);
                            f fVar5 = (f) fVar;
                            fVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue, bVar3, (j) obj6, fVar5, 2));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricOptions");
                            b bVar4 = new b(bVar, 1);
                            f fVar6 = (f) fVar;
                            fVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((i) obj7, bVar4, fVar6, 28));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            Object obj9 = list2.get(1);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricAttributes");
                            cj.c cVar4 = new cj.c(bVar, 27);
                            f fVar7 = (f) fVar;
                            fVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue2, cVar4, (h) obj9, fVar7, 1));
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_performance_platform_interface.FirebasePerformanceHostApi.startHttpMetric", strConcat), a(), obj);
        if (fVar != null) {
            final int i14 = 4;
            gVar5.C(new xi.b() { // from class: hj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i14) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            b bVar2 = new b(bVar, 0);
                            f fVar2 = (f) fVar;
                            fVar2.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new cj.i(zBooleanValue, bVar2, fVar2, 7));
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 29);
                            f fVar3 = (f) fVar;
                            fVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(21, cVar2, fVar3));
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 28);
                            f fVar4 = (f) fVar;
                            fVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj4, cVar3, fVar4, 27));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            Object obj6 = list.get(1);
                            n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.TraceAttributes");
                            b bVar3 = new b(bVar, 2);
                            f fVar5 = (f) fVar;
                            fVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue, bVar3, (j) obj6, fVar5, 2));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricOptions");
                            b bVar4 = new b(bVar, 1);
                            f fVar6 = (f) fVar;
                            fVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((i) obj7, bVar4, fVar6, 28));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            Object obj9 = list2.get(1);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricAttributes");
                            cj.c cVar4 = new cj.c(bVar, 27);
                            f fVar7 = (f) fVar;
                            fVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue2, cVar4, (h) obj9, fVar7, 1));
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_performance_platform_interface.FirebasePerformanceHostApi.stopHttpMetric", strConcat), a(), obj);
        if (fVar == null) {
            gVar6.C(null);
        } else {
            final int i15 = 5;
            gVar6.C(new xi.b() { // from class: hj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i15) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            b bVar2 = new b(bVar, 0);
                            f fVar2 = (f) fVar;
                            fVar2.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new cj.i(zBooleanValue, bVar2, fVar2, 7));
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 29);
                            f fVar3 = (f) fVar;
                            fVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(21, cVar2, fVar3));
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 28);
                            f fVar4 = (f) fVar;
                            fVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj4, cVar3, fVar4, 27));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj5).longValue();
                            Object obj6 = list.get(1);
                            n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.TraceAttributes");
                            b bVar3 = new b(bVar, 2);
                            f fVar5 = (f) fVar;
                            fVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue, bVar3, (j) obj6, fVar5, 2));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricOptions");
                            b bVar4 = new b(bVar, 1);
                            f fVar6 = (f) fVar;
                            fVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((i) obj7, bVar4, fVar6, 28));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            Object obj9 = list2.get(1);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.firebase.performance.HttpMetricAttributes");
                            cj.c cVar4 = new cj.c(bVar, 27);
                            f fVar7 = (f) fVar;
                            fVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new gj.a(jLongValue2, cVar4, (h) obj9, fVar7, 1));
                            break;
                    }
                }
            });
        }
    }
}
