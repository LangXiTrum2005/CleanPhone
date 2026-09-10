package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ae0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3008ae0 implements Bm0 {
    public static final C3008ae0 g = new C3008ae0();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final Yd0 j = new Yd0(4);
    public static final Yd0 k = new Yd0(5);
    public long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4132a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final Ym0 d = new Ym0(1);
    public final C3491g4 c = new C3491g4(19);
    public final C3491g4 e = new C3491g4(new C3844k50(9), 20);

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, Lm0 lm0, JSONObject jSONObject, boolean z) {
        char c;
        boolean zContains;
        if (AbstractC2995aW.b(view) == null) {
            Ym0 ym0 = this.d;
            if (ym0.e.contains(view)) {
                c = 1;
            } else {
                c = ym0.k ? (char) 2 : (char) 3;
            }
            if (c == 3) {
            }
            JSONObject jSONObjectA = lm0.a(view);
            In0.c(jSONObject, jSONObjectA);
            String strD = ym0.d(view);
            if (strD == null) {
                AbstractC3950lJ.z(ym0.c.get(view));
                lm0.f(view, jSONObjectA, this, c == 1, z);
                return;
            }
            try {
                jSONObjectA.put("adSessionId", strD);
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
                    zContains = hashSet.contains(strD);
                    break;
                default:
                    zContains = hashSet.contains(strD);
                    break;
            }
            Boolean boolValueOf = Boolean.valueOf(zContains);
            if (zContains) {
                try {
                    jSONObjectA.put("isPipActive", boolValueOf);
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
        }
    }
}
