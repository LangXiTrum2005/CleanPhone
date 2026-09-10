package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2375Du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2996a;
    public final C3826ju b;
    public final Executor c;
    public final C2777Th d;
    public final C2777Th e;
    public final C2881Xh f;
    public final C2907Yh g;
    public final C3633hi h;
    public final C2648Oi i;

    public C2375Du(Context context, C3826ju c3826ju, ScheduledExecutorService scheduledExecutorService, C2777Th c2777Th, C2777Th c2777Th2, C2777Th c2777Th3, C2881Xh c2881Xh, C2907Yh c2907Yh, C3633hi c3633hi, C2648Oi c2648Oi) {
        this.f2996a = context;
        this.b = c3826ju;
        this.c = scheduledExecutorService;
        this.d = c2777Th;
        this.e = c2777Th2;
        this.f = c2881Xh;
        this.g = c2907Yh;
        this.h = c3633hi;
        this.i = c2648Oi;
    }

    public static C2375Du a() {
        C4266ou c4266ouB = C4266ou.b();
        c4266ouB.a();
        return ((C4844vY) c4266ouB.d.a(C4844vY.class)).c();
    }

    public static ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final long b(String str) {
        Long lValueOf;
        C2907Yh c2907Yh = this.g;
        C2777Th c2777Th = c2907Yh.c;
        C2803Uh c2803UhC = C2907Yh.c(c2777Th);
        Long lValueOf2 = null;
        if (c2803UhC == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(c2803UhC.b.getLong(str));
            } catch (JSONException unused) {
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            c2907Yh.b(C2907Yh.c(c2777Th), str);
            return lValueOf.longValue();
        }
        C2803Uh c2803UhC2 = C2907Yh.c(c2907Yh.d);
        if (c2803UhC2 != null) {
            try {
                lValueOf2 = Long.valueOf(c2803UhC2.b.getLong(str));
            } catch (JSONException unused2) {
            }
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        Pattern pattern = C2907Yh.e;
        return 0L;
    }

    public final String c(String str) {
        C2907Yh c2907Yh = this.g;
        C2777Th c2777Th = c2907Yh.c;
        String strE = C2907Yh.e(c2777Th, str);
        if (strE != null) {
            c2907Yh.b(C2907Yh.c(c2777Th), str);
            return strE;
        }
        String strE2 = C2907Yh.e(c2907Yh.d, str);
        if (strE2 != null) {
            return strE2;
        }
        C2907Yh.f(str, "String");
        return "";
    }

    public final void d(boolean z) {
        C2648Oi c2648Oi = this.i;
        synchronized (c2648Oi) {
            c2648Oi.b.e = z;
            if (!z) {
                c2648Oi.a();
            }
        }
    }
}
