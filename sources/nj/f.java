package nj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.HashSet;
import m5.k;
import xi.l;
import xi.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class f implements ti.b, ui.a, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f46778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f46779b;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        k kVar = this.f46778a;
        if (kVar == null) {
            Log.wtf("QuickActionsAndroid", "quickActions was never set.");
            return;
        }
        fc.f fVar = (fc.f) bVar;
        Activity activity = (Activity) fVar.f40780b;
        kVar.f45903c = activity;
        fVar.d(this);
        onNewIntent(activity.getIntent());
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        k kVar = new k(aVar.f50787a);
        this.f46778a = kVar;
        b bVar = c.f46772u9;
        xi.f fVar = aVar.f50789c;
        bVar.getClass();
        b.a(fVar, kVar);
        this.f46779b = new d(fVar);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        this.f46778a.f45903c = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        b bVar = c.f46772u9;
        xi.f fVar = aVar.f50789c;
        bVar.getClass();
        b.a(fVar, null);
        this.f46778a = null;
    }

    @Override // xi.s
    public final boolean onNewIntent(Intent intent) {
        Activity activity = (Activity) this.f46778a.f45903c;
        if (!intent.hasExtra("some unique action key") || activity == null) {
            return false;
        }
        Context applicationContext = activity.getApplicationContext();
        String stringExtra = intent.getStringExtra("some unique action key");
        if (stringExtra == null) {
            return false;
        }
        d dVar = this.f46779b;
        bh.a aVar = new bh.a(new bh.a(16), 17);
        dVar.getClass();
        new k5.g(dVar.f46774a, "dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsFlutterApi.launchAction", (l) d.f46773b.getValue(), (Object) null).y(j1.f.C(stringExtra), new ae.a(4, "dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsFlutterApi.launchAction", aVar));
        d0.c.I(applicationContext, stringExtra);
        return false;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        fc.f fVar = (fc.f) bVar;
        ((HashSet) fVar.f40784f).remove(this);
        onAttachedToActivity(fVar);
    }
}
