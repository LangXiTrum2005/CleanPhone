package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Zd0 implements Am0 {
    public static final Zd0 g = new Zd0();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final Yd0 j = new Yd0(2);
    public static final Yd0 k = new Yd0(3);
    public long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4082a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final Gm0 d = new Gm0();
    public final C3491g4 c = new C3491g4(17);
    public final C3491g4 e = new C3491g4(new C3844k50(8), 18);

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, Em0 em0, JSONObject jSONObject, boolean z) {
        char c;
        String str;
        if (AbstractC3375el.d(view) == null) {
            Gm0 gm0 = this.d;
            if (gm0.d.contains(view)) {
                c = 1;
            } else {
                c = gm0.i ? (char) 2 : (char) 3;
            }
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectA = em0.a(view);
            Gn0.c(jSONObject, jSONObjectA);
            HashMap map = gm0.f3138a;
            if (map.size() == 0) {
                str = null;
            } else {
                String str2 = (String) map.get(view);
                if (str2 != null) {
                    map.remove(view);
                }
                str = str2;
            }
            boolean z2 = false;
            if (str == null) {
                AbstractC3950lJ.z(gm0.b.get(view));
                em0.i(view, jSONObjectA, this, c == 1, z);
                return;
            }
            try {
                jSONObjectA.put("adSessionId", str);
            } catch (JSONException unused) {
            }
            WeakHashMap weakHashMap = gm0.h;
            if (weakHashMap.containsKey(view)) {
                weakHashMap.put(view, Boolean.TRUE);
            } else {
                z2 = true;
            }
            try {
                jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z2));
            } catch (JSONException unused2) {
            }
            gm0.i = true;
        }
    }
}
