package dj;

import android.content.Context;
import com.applovin.impl.z8;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f38928a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f38929b = r9.b.u(new defpackage.c(5));

    public static void a(g gVar, xi.f binaryMessenger, final l lVar) {
        gVar.getClass();
        n.f(binaryMessenger, "binaryMessenger");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        String strN = defpackage.e.n("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeApp", strConcat);
        wj.j jVar = f38929b;
        Object obj = null;
        k5.g gVar2 = new k5.g(binaryMessenger, strN, (xi.l) jVar.getValue(), obj);
        if (lVar != null) {
            final int i10 = 0;
            gVar2.C(new xi.b() { // from class: dj.f
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i10) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.firebase.core.CoreFirebaseOptions");
                            a aVar = (a) obj4;
                            cj.c cVar = new cj.c(bVar, 16);
                            l lVar2 = (l) lVar;
                            lVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            Context context = lVar2.f38942a;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new z8(context, aVar, (String) obj3, taskCompletionSource, lVar2, 6));
                            l.b(taskCompletionSource, cVar);
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 17);
                            l lVar3 = (l) lVar;
                            lVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(lVar3.f38942a, lVar3, taskCompletionSource2));
                            l.b(taskCompletionSource2, cVar2);
                            break;
                        default:
                            cj.c cVar3 = new cj.c(bVar, 15);
                            l lVar4 = (l) lVar;
                            lVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(lVar4.f38942a, taskCompletionSource3, lVar4));
                            l.b(taskCompletionSource3, cVar3);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeCore", strConcat), (xi.l) jVar.getValue(), obj);
        if (lVar != null) {
            final int i11 = 1;
            gVar3.C(new xi.b() { // from class: dj.f
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i11) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.firebase.core.CoreFirebaseOptions");
                            a aVar = (a) obj4;
                            cj.c cVar = new cj.c(bVar, 16);
                            l lVar2 = (l) lVar;
                            lVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            Context context = lVar2.f38942a;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new z8(context, aVar, (String) obj3, taskCompletionSource, lVar2, 6));
                            l.b(taskCompletionSource, cVar);
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 17);
                            l lVar3 = (l) lVar;
                            lVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(lVar3.f38942a, lVar3, taskCompletionSource2));
                            l.b(taskCompletionSource2, cVar2);
                            break;
                        default:
                            cj.c cVar3 = new cj.c(bVar, 15);
                            l lVar4 = (l) lVar;
                            lVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(lVar4.f38942a, taskCompletionSource3, lVar4));
                            l.b(taskCompletionSource3, cVar3);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.optionsFromResource", strConcat), (xi.l) jVar.getValue(), obj);
        if (lVar == null) {
            gVar4.C(null);
        } else {
            final int i12 = 2;
            gVar4.C(new xi.b() { // from class: dj.f
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i12) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.firebase.core.CoreFirebaseOptions");
                            a aVar = (a) obj4;
                            cj.c cVar = new cj.c(bVar, 16);
                            l lVar2 = (l) lVar;
                            lVar2.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            Context context = lVar2.f38942a;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new z8(context, aVar, (String) obj3, taskCompletionSource, lVar2, 6));
                            l.b(taskCompletionSource, cVar);
                            break;
                        case 1:
                            cj.c cVar2 = new cj.c(bVar, 17);
                            l lVar3 = (l) lVar;
                            lVar3.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(lVar3.f38942a, lVar3, taskCompletionSource2));
                            l.b(taskCompletionSource2, cVar2);
                            break;
                        default:
                            cj.c cVar3 = new cj.c(bVar, 15);
                            l lVar4 = (l) lVar;
                            lVar4.getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new j(lVar4.f38942a, taskCompletionSource3, lVar4));
                            l.b(taskCompletionSource3, cVar3);
                            break;
                    }
                }
            });
        }
    }
}
