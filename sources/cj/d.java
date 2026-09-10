package cj;

import bc.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f6442a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f6443b = r9.b.u(new defpackage.c(2));

    public static xi.l a() {
        return (xi.l) f6443b.getValue();
    }

    public static void b(d dVar, xi.f binaryMessenger, final m mVar) {
        dVar.getClass();
        n.f(binaryMessenger, "binaryMessenger");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent", strConcat), a(), obj);
        if (mVar != null) {
            final int i10 = 3;
            gVar.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i10) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId", strConcat), a(), obj);
        if (mVar != null) {
            final int i11 = 6;
            gVar2.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i11) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty", strConcat), a(), obj);
        if (mVar != null) {
            final int i12 = 7;
            gVar3.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i12) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled", strConcat), a(), obj);
        if (mVar != null) {
            final int i13 = 8;
            gVar4.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i13) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData", strConcat), a(), obj);
        if (mVar != null) {
            final int i14 = 9;
            gVar5.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i14) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration", strConcat), a(), obj);
        if (mVar != null) {
            final int i15 = 10;
            gVar6.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i15) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent", strConcat), a(), obj);
        if (mVar != null) {
            final int i16 = 11;
            gVar7.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i16) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        k5.g gVar8 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters", strConcat), a(), obj);
        if (mVar != null) {
            final int i17 = 0;
            gVar8.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i17) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        k5.g gVar9 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId", strConcat), a(), obj);
        if (mVar != null) {
            final int i18 = 1;
            gVar9.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i18) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar9.C(null);
        }
        k5.g gVar10 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId", strConcat), a(), obj);
        if (mVar != null) {
            final int i19 = 2;
            gVar10.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i19) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar10.C(null);
        }
        k5.g gVar11 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement", strConcat), a(), obj);
        if (mVar != null) {
            final int i20 = 4;
            gVar11.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i20) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        } else {
            gVar11.C(null);
        }
        k5.g gVar12 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logTransaction", strConcat), a(), obj);
        if (mVar == null) {
            gVar12.C(null);
        } else {
            final int i21 = 5;
            gVar12.C(new xi.b() { // from class: cj.b
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i21) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            c cVar = new c(bVar, 3);
                            m mVar2 = (m) mVar;
                            mVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k(mVar2, map, taskCompletionSource));
                            Task task = taskCompletionSource.getTask();
                            n.e(task, "getTask(...)");
                            task.addOnCompleteListener(new h(7, mVar2, cVar));
                            break;
                        case 1:
                            c cVar2 = new c(bVar, 9);
                            m mVar3 = (m) mVar;
                            mVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource2, mVar3, 1));
                            Task task2 = taskCompletionSource2.getTask();
                            n.e(task2, "getTask(...)");
                            task2.addOnCompleteListener(new h(5, mVar3, cVar2));
                            break;
                        case 2:
                            c cVar3 = new c(bVar, 0);
                            m mVar4 = (m) mVar;
                            mVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(taskCompletionSource3, mVar4, 0));
                            Task task3 = taskCompletionSource3.getTask();
                            n.e(task3, "getTask(...)");
                            task3.addOnCompleteListener(new h(2, mVar4, cVar3));
                            break;
                        case 3:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            c cVar4 = new c(bVar, 5);
                            m mVar5 = (m) mVar;
                            mVar5.getClass();
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj3, mVar5, taskCompletionSource4, 2));
                            Task task4 = taskCompletionSource4.getTask();
                            n.e(task4, "getTask(...)");
                            task4.addOnCompleteListener(new h(9, mVar5, cVar4));
                            break;
                        case 4:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            c cVar5 = new c(bVar, 1);
                            ((m) mVar).getClass();
                            cVar5.invoke(new wj.h(t9.e.c(new f("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            c cVar6 = new c(bVar, 10);
                            ((m) mVar).getClass();
                            cVar6.invoke(new wj.h(t9.e.c(new f("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            c cVar7 = new c(bVar, 8);
                            m mVar6 = (m) mVar;
                            mVar6.getClass();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.fragment.app.d(mVar6, str, taskCompletionSource5, 4));
                            Task task5 = taskCompletionSource5.getTask();
                            n.e(task5, "getTask(...)");
                            task5.addOnCompleteListener(new h(3, mVar6, cVar7));
                            break;
                        case 7:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) list.get(1);
                            c cVar8 = new c(bVar, 6);
                            m mVar7 = (m) mVar;
                            mVar7.getClass();
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new r(mVar7, (String) obj6, str2, taskCompletionSource6, 1));
                            Task task6 = taskCompletionSource6.getTask();
                            n.e(task6, "getTask(...)");
                            task6.addOnCompleteListener(new h(0, mVar7, cVar8));
                            break;
                        case 8:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            c cVar9 = new c(bVar, 4);
                            m mVar8 = (m) mVar;
                            mVar8.getClass();
                            TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i(mVar8, zBooleanValue, taskCompletionSource7, 0));
                            Task task7 = taskCompletionSource7.getTask();
                            n.e(task7, "getTask(...)");
                            task7.addOnCompleteListener(new h(1, mVar8, cVar9));
                            break;
                        case 9:
                            c cVar10 = new c(bVar, 2);
                            m mVar9 = (m) mVar;
                            mVar9.getClass();
                            TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(mVar9, taskCompletionSource8));
                            Task task8 = taskCompletionSource8.getTask();
                            n.e(task8, "getTask(...)");
                            task8.addOnCompleteListener(new h(8, mVar9, cVar10));
                            break;
                        case 10:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            c cVar11 = new c(bVar, 11);
                            m mVar10 = (m) mVar;
                            mVar10.getClass();
                            TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new l(mVar10, jLongValue, taskCompletionSource9, 0));
                            Task task9 = taskCompletionSource9.getTask();
                            n.e(task9, "getTask(...)");
                            task9.addOnCompleteListener(new h(4, mVar10, cVar11));
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            c cVar12 = new c(bVar, 7);
                            m mVar11 = (m) mVar;
                            mVar11.getClass();
                            TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new k((Map) obj9, mVar11, taskCompletionSource10, 1));
                            Task task10 = taskCompletionSource10.getTask();
                            n.e(task10, "getTask(...)");
                            task10.addOnCompleteListener(new h(6, mVar11, cVar12));
                            break;
                    }
                }
            });
        }
    }
}
