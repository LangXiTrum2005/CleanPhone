package fj;

import android.os.Handler;
import android.os.Looper;
import bc.r;
import cj.i;
import com.applovin.impl.sdk.x;
import com.ironsource.ph;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.List;
import k5.g;
import kotlin.jvm.internal.n;
import wj.j;
import xi.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f40959a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f40960b = r9.b.u(new defpackage.c(7));

    public static l a() {
        return (l) f40960b.getValue();
    }

    public static void b(c cVar, xi.f binaryMessenger, final ej.d dVar) {
        cVar.getClass();
        n.f(binaryMessenger, "binaryMessenger");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        Object obj = null;
        g gVar = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.checkForUnsentReports", strConcat), a(), obj);
        if (dVar != null) {
            final int i10 = 1;
            gVar.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i10) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i11 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i11, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        g gVar2 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.crash", strConcat), a(), obj);
        if (dVar != null) {
            final int i11 = 2;
            gVar2.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i11) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i12 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i12, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        g gVar3 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.deleteUnsentReports", strConcat), a(), obj);
        if (dVar != null) {
            final int i12 = 3;
            gVar3.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i12) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i13 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i13, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        g gVar4 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.didCrashOnPreviousExecution", strConcat), a(), obj);
        if (dVar != null) {
            final int i13 = 4;
            gVar4.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i13) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i14 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i14, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        g gVar5 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.recordError", strConcat), a(), obj);
        if (dVar != null) {
            final int i14 = 5;
            gVar5.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i14) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i15 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i15, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        g gVar6 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.log", strConcat), a(), obj);
        if (dVar != null) {
            final int i15 = 6;
            gVar6.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i15) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i16 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i16, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        g gVar7 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.sendUnsentReports", strConcat), a(), obj);
        if (dVar != null) {
            final int i16 = 7;
            gVar7.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i16) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i17 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i17, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        g gVar8 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.setCrashlyticsCollectionEnabled", strConcat), a(), obj);
        if (dVar != null) {
            final int i17 = 8;
            gVar8.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i17) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i18 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i18, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        g gVar9 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.setUserIdentifier", strConcat), a(), obj);
        if (dVar != null) {
            final int i18 = 9;
            gVar9.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i18) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i19 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i19, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        } else {
            gVar9.C(null);
        }
        g gVar10 = new g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_crashlytics_platform_interface.FirebaseCrashlyticsHostApi.setCustomKey", strConcat), a(), obj);
        if (dVar == null) {
            gVar10.C(null);
        } else {
            final int i19 = 0;
            gVar10.C(new xi.b() { // from class: fj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i19) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar2 = new cj.c(bVar, 18);
                            ej.d dVar2 = (ej.d) dVar;
                            dVar2.getClass();
                            int i110 = 18;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(i110, (String) obj4, cVar2, dVar2, (String) obj3));
                            break;
                        case 1:
                            cj.c cVar3 = new cj.c(bVar, 22);
                            ej.d dVar3 = (ej.d) dVar;
                            dVar3.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(10, cVar3, dVar3));
                            break;
                        case 2:
                            ((ej.d) dVar).getClass();
                            Looper looperMyLooper = Looper.myLooper();
                            n.c(looperMyLooper);
                            new Handler(looperMyLooper).postDelayed(new x(10), 50L);
                            break;
                        case 3:
                            cj.c cVar4 = new cj.c(bVar, 24);
                            ej.d dVar4 = (ej.d) dVar;
                            dVar4.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(12, cVar4, dVar4));
                            break;
                        case 4:
                            cj.c cVar5 = new cj.c(bVar, 23);
                            ej.d dVar5 = (ej.d) dVar;
                            dVar5.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(11, cVar5, dVar5));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.firebase.crashlytics.generated.RecordErrorRequest");
                            cj.c cVar6 = new cj.c(bVar, 21);
                            ej.d dVar6 = (ej.d) dVar;
                            dVar6.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r((f) obj5, dVar6, cVar6, new Handler(Looper.getMainLooper()), 19));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar7 = new cj.c(bVar, 25);
                            ej.d dVar7 = (ej.d) dVar;
                            dVar7.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj6, cVar7, dVar7, 25));
                            break;
                        case 7:
                            cj.c cVar8 = new cj.c(bVar, 26);
                            ej.d dVar8 = (ej.d) dVar;
                            dVar8.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b(13, cVar8, dVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            cj.c cVar9 = new cj.c(bVar, 20);
                            ej.d dVar9 = (ej.d) dVar;
                            dVar9.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(zBooleanValue, cVar9, dVar9, 6));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar10 = new cj.c(bVar, 19);
                            ej.d dVar10 = (ej.d) dVar;
                            dVar10.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new ph((String) obj8, cVar10, dVar10, 24));
                            break;
                    }
                }
            });
        }
    }
}
