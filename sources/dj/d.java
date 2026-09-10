package dj;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.List;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f38923a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f38924b = r9.b.u(new defpackage.c(4));

    public static void a(d dVar, xi.f binaryMessenger, final l lVar) {
        dVar.getClass();
        n.f(binaryMessenger, "binaryMessenger");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        String strN = defpackage.e.n("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", strConcat);
        wj.j jVar = f38924b;
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, strN, (xi.l) jVar.getValue(), obj);
        if (lVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: dj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i10) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            final String str = (String) obj3;
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            cj.c cVar = new cj.c(bVar, 13);
                            ((l) lVar).getClass();
                            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            final int i11 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: dj.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            String str2 = str;
                                            boolean z10 = zBooleanValue;
                                            TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                            try {
                                                mb.g gVarF = mb.g.f(str2);
                                                gVarF.a();
                                                if (gVarF.f45932e.compareAndSet(!z10, z10)) {
                                                    boolean z11 = com.google.android.gms.common.api.internal.c.f11675e.f11676a.get();
                                                    if (z10 && z11) {
                                                        gVarF.l(true);
                                                    } else if (!z10 && z11) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                taskCompletionSource2.setResult(r.f53297a);
                                            } catch (Exception e10) {
                                                taskCompletionSource2.setException(e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            String str3 = str;
                                            boolean z12 = zBooleanValue;
                                            TaskCompletionSource taskCompletionSource3 = taskCompletionSource;
                                            try {
                                                mb.g.f(str3).m(z12);
                                                taskCompletionSource3.setResult(r.f53297a);
                                            } catch (Exception e11) {
                                                taskCompletionSource3.setException(e11);
                                            }
                                            break;
                                    }
                                }
                            });
                            l.b(taskCompletionSource, cVar);
                            break;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            final String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            cj.c cVar2 = new cj.c(bVar, 14);
                            ((l) lVar).getClass();
                            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            final int i12 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: dj.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            String str3 = str2;
                                            boolean z10 = zBooleanValue2;
                                            TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                                            try {
                                                mb.g gVarF = mb.g.f(str3);
                                                gVarF.a();
                                                if (gVarF.f45932e.compareAndSet(!z10, z10)) {
                                                    boolean z11 = com.google.android.gms.common.api.internal.c.f11675e.f11676a.get();
                                                    if (z10 && z11) {
                                                        gVarF.l(true);
                                                    } else if (!z10 && z11) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                taskCompletionSource3.setResult(r.f53297a);
                                            } catch (Exception e10) {
                                                taskCompletionSource3.setException(e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            String str4 = str2;
                                            boolean z12 = zBooleanValue2;
                                            TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                                            try {
                                                mb.g.f(str4).m(z12);
                                                taskCompletionSource4.setResult(r.f53297a);
                                            } catch (Exception e11) {
                                                taskCompletionSource4.setException(e11);
                                            }
                                            break;
                                    }
                                }
                            });
                            l.b(taskCompletionSource2, cVar2);
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 12);
                            ((l) lVar).getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b((String) obj7, taskCompletionSource3));
                            l.b(taskCompletionSource3, cVar3);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", strConcat), (xi.l) jVar.getValue(), obj);
        if (lVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: dj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i11) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            final String str = (String) obj3;
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            cj.c cVar = new cj.c(bVar, 13);
                            ((l) lVar).getClass();
                            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            final int i12 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: dj.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            String str3 = str;
                                            boolean z10 = zBooleanValue;
                                            TaskCompletionSource taskCompletionSource3 = taskCompletionSource;
                                            try {
                                                mb.g gVarF = mb.g.f(str3);
                                                gVarF.a();
                                                if (gVarF.f45932e.compareAndSet(!z10, z10)) {
                                                    boolean z11 = com.google.android.gms.common.api.internal.c.f11675e.f11676a.get();
                                                    if (z10 && z11) {
                                                        gVarF.l(true);
                                                    } else if (!z10 && z11) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                taskCompletionSource3.setResult(r.f53297a);
                                            } catch (Exception e10) {
                                                taskCompletionSource3.setException(e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            String str4 = str;
                                            boolean z12 = zBooleanValue;
                                            TaskCompletionSource taskCompletionSource4 = taskCompletionSource;
                                            try {
                                                mb.g.f(str4).m(z12);
                                                taskCompletionSource4.setResult(r.f53297a);
                                            } catch (Exception e11) {
                                                taskCompletionSource4.setException(e11);
                                            }
                                            break;
                                    }
                                }
                            });
                            l.b(taskCompletionSource, cVar);
                            break;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            final String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            cj.c cVar2 = new cj.c(bVar, 14);
                            ((l) lVar).getClass();
                            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            final int i13 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: dj.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            String str3 = str2;
                                            boolean z10 = zBooleanValue2;
                                            TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                                            try {
                                                mb.g gVarF = mb.g.f(str3);
                                                gVarF.a();
                                                if (gVarF.f45932e.compareAndSet(!z10, z10)) {
                                                    boolean z11 = com.google.android.gms.common.api.internal.c.f11675e.f11676a.get();
                                                    if (z10 && z11) {
                                                        gVarF.l(true);
                                                    } else if (!z10 && z11) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                taskCompletionSource3.setResult(r.f53297a);
                                            } catch (Exception e10) {
                                                taskCompletionSource3.setException(e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            String str4 = str2;
                                            boolean z12 = zBooleanValue2;
                                            TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                                            try {
                                                mb.g.f(str4).m(z12);
                                                taskCompletionSource4.setResult(r.f53297a);
                                            } catch (Exception e11) {
                                                taskCompletionSource4.setException(e11);
                                            }
                                            break;
                                    }
                                }
                            });
                            l.b(taskCompletionSource2, cVar2);
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 12);
                            ((l) lVar).getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b((String) obj7, taskCompletionSource3));
                            l.b(taskCompletionSource3, cVar3);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete", strConcat), (xi.l) jVar.getValue(), obj);
        if (lVar == null) {
            gVar3.C(null);
        } else {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: dj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    switch (i12) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            final String str = (String) obj3;
                            Object obj4 = list.get(1);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            cj.c cVar = new cj.c(bVar, 13);
                            ((l) lVar).getClass();
                            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            final int i13 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: dj.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            String str3 = str;
                                            boolean z10 = zBooleanValue;
                                            TaskCompletionSource taskCompletionSource3 = taskCompletionSource;
                                            try {
                                                mb.g gVarF = mb.g.f(str3);
                                                gVarF.a();
                                                if (gVarF.f45932e.compareAndSet(!z10, z10)) {
                                                    boolean z11 = com.google.android.gms.common.api.internal.c.f11675e.f11676a.get();
                                                    if (z10 && z11) {
                                                        gVarF.l(true);
                                                    } else if (!z10 && z11) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                taskCompletionSource3.setResult(r.f53297a);
                                            } catch (Exception e10) {
                                                taskCompletionSource3.setException(e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            String str4 = str;
                                            boolean z12 = zBooleanValue;
                                            TaskCompletionSource taskCompletionSource4 = taskCompletionSource;
                                            try {
                                                mb.g.f(str4).m(z12);
                                                taskCompletionSource4.setResult(r.f53297a);
                                            } catch (Exception e11) {
                                                taskCompletionSource4.setException(e11);
                                            }
                                            break;
                                    }
                                }
                            });
                            l.b(taskCompletionSource, cVar);
                            break;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            final String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            cj.c cVar2 = new cj.c(bVar, 14);
                            ((l) lVar).getClass();
                            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            final int i14 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: dj.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            String str3 = str2;
                                            boolean z10 = zBooleanValue2;
                                            TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                                            try {
                                                mb.g gVarF = mb.g.f(str3);
                                                gVarF.a();
                                                if (gVarF.f45932e.compareAndSet(!z10, z10)) {
                                                    boolean z11 = com.google.android.gms.common.api.internal.c.f11675e.f11676a.get();
                                                    if (z10 && z11) {
                                                        gVarF.l(true);
                                                    } else if (!z10 && z11) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                taskCompletionSource3.setResult(r.f53297a);
                                            } catch (Exception e10) {
                                                taskCompletionSource3.setException(e10);
                                                return;
                                            }
                                            break;
                                        default:
                                            String str4 = str2;
                                            boolean z12 = zBooleanValue2;
                                            TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                                            try {
                                                mb.g.f(str4).m(z12);
                                                taskCompletionSource4.setResult(r.f53297a);
                                            } catch (Exception e11) {
                                                taskCompletionSource4.setException(e11);
                                            }
                                            break;
                                    }
                                }
                            });
                            l.b(taskCompletionSource2, cVar2);
                            break;
                        default:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            cj.c cVar3 = new cj.c(bVar, 12);
                            ((l) lVar).getClass();
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new com.unity3d.services.ads.operation.show.b((String) obj7, taskCompletionSource3));
                            l.b(taskCompletionSource3, cVar3);
                            break;
                    }
                }
            });
        }
    }
}
