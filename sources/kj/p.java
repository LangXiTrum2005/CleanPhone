package kj;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import ea.f4;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class p implements ti.b, ui.a, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ti.a f44701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fc.f f44702b;

    public final b a() {
        Set<String> stringSet;
        fc.f fVar = this.f44702b;
        n nVar = (fVar == null || ((Activity) fVar.f40781c) == null) ? null : (n) fVar.f40782d;
        if (nVar == null) {
            throw new d("no_activity", "image_picker plugin requires a foreground activity.");
        }
        f7.a aVar = nVar.f44691d;
        aVar.getClass();
        HashMap map = new HashMap();
        boolean z10 = false;
        SharedPreferences sharedPreferences = aVar.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z11 = true;
        if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) != null) {
            map.put("pathList", new ArrayList(stringSet));
            z10 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            map.put("error", new a(sharedPreferences.getString("flutter_image_picker_error_code", ""), sharedPreferences.getString("flutter_image_picker_error_message", null)));
        } else {
            z11 = z10;
        }
        if (z11) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                map.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals("video") ? c.VIDEO : c.IMAGE);
            }
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                map.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                map.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            map.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        }
        if (map.isEmpty()) {
            return null;
        }
        c cVar = (c) map.get("type");
        ArrayList<String> arrayList = (ArrayList) map.get("pathList");
        if (cVar == null || arrayList == null) {
            aVar.c();
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Double d10 = (Double) map.get("maxWidth");
            Double d11 = (Double) map.get("maxHeight");
            Integer num = (Integer) map.get("imageQuality");
            arrayList2.add(nVar.f44690c.g(str, d10, d11, num == null ? 100 : num.intValue()));
        }
        aVar.c();
        return new b(cVar, (a) map.get("error"), arrayList2);
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        ti.a aVar = this.f44701a;
        xi.f fVar = aVar.f50789c;
        Application application = (Application) aVar.f50787a;
        fc.f fVar2 = (fc.f) bVar;
        Activity activity = (Activity) fVar2.f40780b;
        fc.f fVar3 = new fc.f(7);
        fVar3.f40780b = application;
        fVar3.f40781c = activity;
        fVar3.f40784f = bVar;
        fVar3.f40785g = fVar;
        fVar3.f40782d = new n(activity, new f4(activity, new j2.n(9)), new f7.a(activity, 3));
        h.f44675q9.getClass();
        g.a(fVar, this);
        fVar3.f40783e = new o(this, activity);
        fVar2.b((n) fVar3.f40782d);
        fVar2.e((n) fVar3.f40782d);
        androidx.lifecycle.o lifecycle = ((HiddenLifecycleReference) fVar2.f40781c).getLifecycle();
        fVar3.f40786h = lifecycle;
        lifecycle.a((o) fVar3.f40783e);
        this.f44702b = fVar3;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        this.f44701a = aVar;
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        fc.f fVar = this.f44702b;
        if (fVar != null) {
            ui.b bVar = (ui.b) fVar.f40784f;
            if (bVar != null) {
                ((fc.f) bVar).H((n) fVar.f40782d);
                ui.b bVar2 = (ui.b) fVar.f40784f;
                ((HashSet) ((fc.f) bVar2).f40782d).remove((n) fVar.f40782d);
                fVar.f40784f = null;
            }
            androidx.lifecycle.o oVar = (androidx.lifecycle.o) fVar.f40786h;
            if (oVar != null) {
                oVar.b((o) fVar.f40783e);
                fVar.f40786h = null;
            }
            xi.f fVar2 = (xi.f) fVar.f40785g;
            h.f44675q9.getClass();
            g.a(fVar2, null);
            Application application = (Application) fVar.f40780b;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks((o) fVar.f40783e);
                fVar.f40780b = null;
            }
            fVar.f40781c = null;
            fVar.f40783e = null;
            fVar.f40782d = null;
            this.f44702b = null;
        }
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        this.f44701a = null;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        onAttachedToActivity(bVar);
    }
}
