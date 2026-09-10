package mi;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import fn.a1;
import io.flutter.embedding.android.FlutterActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45976b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f45975a = i10;
        this.f45976b = obj;
    }

    public final void onBackCancelled() {
        switch (this.f45975a) {
            case 0:
                FlutterActivity flutterActivity = (FlutterActivity) this.f45976b;
                if (flutterActivity.u("cancelBackGesture")) {
                    e eVar = flutterActivity.f43205b;
                    eVar.c();
                    ni.c cVar = eVar.f45984b;
                    if (cVar != null) {
                        cVar.f46746j.f53209a.a("cancelBackGesture", null, null);
                        return;
                    } else {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
                        return;
                    }
                }
                return;
            default:
                x3.j jVar = (x3.j) this.f45976b;
                x3.c cVar2 = jVar.f53583a;
                if (cVar2 == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (!jVar.f53584b) {
                    cVar2.c(jVar, null);
                }
                x3.f fVar = cVar2.f53578b;
                fVar.getClass();
                if (jVar.equals(fVar.f53592h) && -1 == fVar.f53591g) {
                    f.n nVarC = fVar.f53590f;
                    if (nVarC == null) {
                        nVarC = fVar.c(-1);
                    }
                    fVar.f53590f = null;
                    fVar.f53591g = 0;
                    fVar.f53592h = null;
                    if (nVarC != null) {
                        nVarC.f40239d.a();
                    }
                    a1 a1Var = fVar.f53585a;
                    a1Var.getClass();
                    a1Var.e0(null, x3.g.f53598e);
                }
                jVar.f53584b = false;
                return;
        }
    }

    public final void onBackInvoked() {
        switch (this.f45975a) {
            case 0:
                FlutterActivity flutterActivity = (FlutterActivity) this.f45976b;
                if (flutterActivity.u("commitBackGesture")) {
                    e eVar = flutterActivity.f43205b;
                    eVar.c();
                    ni.c cVar = eVar.f45984b;
                    if (cVar == null) {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
                    } else {
                        cVar.f46746j.f53209a.a("commitBackGesture", null, null);
                    }
                }
                break;
            default:
                ((x3.j) this.f45976b).a();
                break;
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        switch (this.f45975a) {
            case 0:
                FlutterActivity flutterActivity = (FlutterActivity) this.f45976b;
                if (flutterActivity.u("updateBackGestureProgress")) {
                    e eVar = flutterActivity.f43205b;
                    eVar.c();
                    ni.c cVar = eVar.f45984b;
                    if (cVar != null) {
                        cVar.f46746j.f53209a.a("updateBackGestureProgress", wi.a.a(backEvent), null);
                        return;
                    } else {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                        return;
                    }
                }
                return;
            default:
                kotlin.jvm.internal.n.f(backEvent, "backEvent");
                x3.j jVar = (x3.j) this.f45976b;
                x3.b bVarA = n0.c.a(backEvent);
                x3.c cVar2 = jVar.f53583a;
                if (cVar2 == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (jVar.f53584b) {
                    x3.f fVar = cVar2.f53578b;
                    fVar.getClass();
                    if (jVar.equals(fVar.f53592h) && -1 == fVar.f53591g) {
                        f.n nVarC = fVar.f53590f;
                        if (nVarC == null) {
                            nVarC = fVar.c(-1);
                        }
                        if (nVarC != null) {
                            nVarC.f40239d.c(new f.a(bVarA));
                        }
                        a1 a1Var = fVar.f53585a;
                        x3.h hVar = new x3.h(bVarA);
                        a1Var.getClass();
                        a1Var.e0(null, hVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        switch (this.f45975a) {
            case 0:
                FlutterActivity flutterActivity = (FlutterActivity) this.f45976b;
                if (flutterActivity.u("startBackGesture")) {
                    e eVar = flutterActivity.f43205b;
                    eVar.c();
                    ni.c cVar = eVar.f45984b;
                    if (cVar != null) {
                        cVar.f46746j.f53209a.a("startBackGesture", wi.a.a(backEvent), null);
                        return;
                    } else {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                        return;
                    }
                }
                return;
            default:
                kotlin.jvm.internal.n.f(backEvent, "backEvent");
                x3.j jVar = (x3.j) this.f45976b;
                x3.b bVarA = n0.c.a(backEvent);
                x3.c cVar2 = jVar.f53583a;
                if (cVar2 == null) {
                    throw new IllegalStateException("This input is not added to any dispatcher.");
                }
                if (jVar.f53584b) {
                    return;
                }
                cVar2.c(jVar, bVarA);
                jVar.f53584b = true;
                return;
        }
    }
}
