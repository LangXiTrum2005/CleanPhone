package pj;

import android.app.Activity;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v9.e f48389a;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        v9.e eVar = this.f48389a;
        if (eVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            eVar.f52505d = (Activity) ((fc.f) bVar).f40780b;
        }
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        v9.e eVar = new v9.e(aVar.f50787a, 29);
        this.f48389a = eVar;
        d dVar = e.f48388x9;
        xi.f fVar = aVar.f50789c;
        dVar.getClass();
        d.a(fVar, eVar);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        v9.e eVar = this.f48389a;
        if (eVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            eVar.f52505d = null;
        }
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        if (this.f48389a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        d dVar = e.f48388x9;
        xi.f fVar = aVar.f50789c;
        dVar.getClass();
        d.a(fVar, null);
        this.f48389a = null;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        onAttachedToActivity(bVar);
    }
}
