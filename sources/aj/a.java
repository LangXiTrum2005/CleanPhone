package aj;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import fc.f;
import java.util.HashMap;
import ti.b;
import wi.j;
import xi.o;
import xi.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements b, ui.a, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f3609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ui.b f3610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f3611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3612d = new HashMap();

    public a(wi.b bVar) {
        this.f3609a = (PackageManager) bVar.f53211a;
        bVar.f53212b = this;
    }

    public final void a(String str, String str2, boolean z10, j jVar) {
        if (this.f3610b == null) {
            jVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap map = this.f3611c;
        if (map == null) {
            jVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            jVar.b("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = jVar.hashCode();
        this.f3612d.put(Integer.valueOf(iHashCode), jVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z10);
        ((Activity) ((f) this.f3610b).f40780b).startActivityForResult(intent, iHashCode);
    }

    public final HashMap b() {
        HashMap map = this.f3611c;
        PackageManager packageManager = this.f3609a;
        if (map == null) {
            this.f3611c = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            for (ResolveInfo resolveInfo : Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f3611c.put(str, resolveInfo);
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f3611c.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f3611c.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f3612d;
        if (!map.containsKey(numValueOf)) {
            return false;
        }
        ((o) map.remove(Integer.valueOf(i10))).a(i11 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        this.f3610b = bVar;
        ((f) bVar).b(this);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        ((f) this.f3610b).H(this);
        this.f3610b = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((f) this.f3610b).H(this);
        this.f3610b = null;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        this.f3610b = bVar;
        ((f) bVar).b(this);
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
    }
}
