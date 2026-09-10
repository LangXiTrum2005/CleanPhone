package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.Window;
import bc.i;
import ii.a;
import j1.f;
import java.util.List;
import k5.g;
import kotlin.jvm.internal.n;
import r9.b;
import wj.j;
import xi.l;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f40203a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f40204b = b.u(new c(0));

    public static void a(f fVar, xi.f binaryMessenger, final a aVar) {
        fVar.getClass();
        n.f(binaryMessenger, "binaryMessenger");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        String strN = e.n("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", strConcat);
        j jVar = f40204b;
        Object obj = null;
        g gVar = new g(binaryMessenger, strN, (l) jVar.getValue(), obj);
        if (aVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: d
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    Window window;
                    int i11 = i10;
                    g gVar2 = aVar;
                    switch (i11) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type <root>.ToggleMessage");
                            b bVar2 = (b) obj3;
                            try {
                                a aVar2 = (a) gVar2;
                                aVar2.getClass();
                                i iVar = aVar2.f43032a;
                                n.c(iVar);
                                Boolean bool = bVar2.f5073a;
                                n.c(bool);
                                iVar.f5552b = bool.booleanValue();
                                Activity activity = (Activity) iVar.f5553c;
                                if (activity != null && (window = activity.getWindow()) != null) {
                                    if (iVar.f5552b) {
                                        window.addFlags(128);
                                    } else {
                                        window.clearFlags(128);
                                    }
                                }
                                listQ2 = f.C(null);
                            } catch (Throwable th2) {
                                listQ2 = o.Q(th2.getClass().getSimpleName(), th2.toString(), e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            try {
                                i iVar2 = ((a) gVar2).f43032a;
                                n.c(iVar2);
                                listQ = f.C(new a(Boolean.valueOf(iVar2.f5552b)));
                            } catch (Throwable th3) {
                                listQ = o.Q(th3.getClass().getSimpleName(), th3.toString(), e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        g gVar2 = new g(binaryMessenger, e.n("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", strConcat), (l) jVar.getValue(), obj);
        if (aVar == null) {
            gVar2.C(null);
        } else {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: d
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    Window window;
                    int i12 = i11;
                    g gVar3 = aVar;
                    switch (i12) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type <root>.ToggleMessage");
                            b bVar2 = (b) obj3;
                            try {
                                a aVar2 = (a) gVar3;
                                aVar2.getClass();
                                i iVar = aVar2.f43032a;
                                n.c(iVar);
                                Boolean bool = bVar2.f5073a;
                                n.c(bool);
                                iVar.f5552b = bool.booleanValue();
                                Activity activity = (Activity) iVar.f5553c;
                                if (activity != null && (window = activity.getWindow()) != null) {
                                    if (iVar.f5552b) {
                                        window.addFlags(128);
                                    } else {
                                        window.clearFlags(128);
                                    }
                                }
                                listQ2 = f.C(null);
                            } catch (Throwable th2) {
                                listQ2 = o.Q(th2.getClass().getSimpleName(), th2.toString(), e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            try {
                                i iVar2 = ((a) gVar3).f43032a;
                                n.c(iVar2);
                                listQ = f.C(new a(Boolean.valueOf(iVar2.f5552b)));
                            } catch (Throwable th3) {
                                listQ = o.Q(th3.getClass().getSimpleName(), th3.toString(), e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        }
    }
}
