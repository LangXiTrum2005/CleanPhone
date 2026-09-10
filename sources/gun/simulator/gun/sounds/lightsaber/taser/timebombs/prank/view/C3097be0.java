package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.be0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3097be0 implements Dm0 {
    public static final C3097be0 g = new C3097be0();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final Yd0 j = new Yd0(0);
    public static final Yd0 k = new Yd0(1);
    public long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4179a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final Ym0 d = new Ym0(0);
    public final C3491g4 c = new C3491g4(15);
    public final C3491g4 e = new C3491g4(new C3844k50(7), 16);

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, Vm0 vm0, JSONObject jSONObject, boolean z) {
        char c;
        boolean zContains;
        boolean z2;
        if (AbstractC2340Cl.c(view) == null) {
            Ym0 ym0 = this.d;
            if (ym0.e.contains(view)) {
                c = 1;
            } else {
                c = ym0.k ? (char) 2 : (char) 3;
            }
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectA = vm0.a(view);
            En0.c(jSONObject, jSONObjectA);
            Object objD = ym0.d(view);
            if (objD != null) {
                try {
                    jSONObjectA.put("adSessionId", objD);
                } catch (JSONException unused) {
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(ym0.f(view)));
                } catch (JSONException unused2) {
                }
                HashSet hashSet = ym0.i;
                int i2 = ym0.f4041a;
                switch (i2) {
                    case 0:
                        zContains = hashSet.contains(objD);
                        break;
                    default:
                        zContains = hashSet.contains(objD);
                        break;
                }
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (JSONException unused3) {
                    }
                }
                switch (i2) {
                    case 0:
                        ym0.k = true;
                        break;
                    default:
                        ym0.k = true;
                        break;
                }
                return;
            }
            HashMap map = ym0.c;
            C5223zm0 c5223zm0 = (C5223zm0) map.get(view);
            if (c5223zm0 != null) {
                map.remove(view);
            }
            if (c5223zm0 != null) {
                C3996lo0 c3996lo0 = c5223zm0.f5341a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = c5223zm0.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", c3996lo0.b);
                    jSONObjectA.put("friendlyObstructionPurpose", c3996lo0.c);
                    jSONObjectA.put("friendlyObstructionReason", c3996lo0.d);
                } catch (JSONException unused4) {
                }
                z2 = true;
            } else {
                z2 = false;
            }
            vm0.l(view, jSONObjectA, this, c == 1, z || z2);
        }
    }
}
