package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import saneness.estimative;
import saneness.ladefoged;
import saneness.leukopoietic;
import saneness.repagination;
import saneness.vinificator;
import saneness.wettest;

/* JADX INFO: loaded from: classes.dex */
public final class s23 implements repagination {
    public static final s23 g = new s23();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final ladefoged j = new ladefoged();
    public static final wettest k = new wettest();
    public long f;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final s7 d = new s7();
    public final r62 c = new r62();
    public final zu2 e = new zu2(new pv1());

    public final void a(View view, vinificator vinificatorVar, JSONObject jSONObject, boolean z) {
        char c;
        Object obj;
        boolean z2;
        if (leukopoietic.attabal(view) == null) {
            s7 s7Var = this.d;
            if (s7Var.d.contains(view)) {
                c = 1;
            } else {
                c = s7Var.j ? (char) 2 : (char) 3;
            }
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectA = vinificatorVar.a(view);
            nw1.a(jSONObject, jSONObjectA);
            s7 s7Var2 = this.d;
            if (s7Var2.a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) s7Var2.a.get(view);
                if (obj2 != null) {
                    s7Var2.a.remove(view);
                }
                obj = obj2;
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    jSONObjectA.put("adSessionId", obj);
                } catch (JSONException e) {
                    estimative.attabal("Error with setting ad session id", e);
                }
                s7 s7Var3 = this.d;
                if (s7Var3.i.containsKey(view)) {
                    s7Var3.i.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException unused) {
                }
                boolean zContains = this.d.h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (JSONException unused2) {
                    }
                }
                this.d.j = true;
                return;
            }
            s7 s7Var4 = this.d;
            r7 r7Var = (r7) s7Var4.b.get(view);
            if (r7Var != null) {
                s7Var4.b.remove(view);
            }
            if (r7Var != null) {
                uk0 uk0Var = r7Var.a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = r7Var.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", uk0Var.b);
                    jSONObjectA.put("friendlyObstructionPurpose", uk0Var.c);
                    jSONObjectA.put("friendlyObstructionReason", uk0Var.d);
                } catch (JSONException unused3) {
                }
                z2 = true;
            } else {
                z2 = false;
            }
            vinificatorVar.a(view, jSONObjectA, this, c == 1, z || z2);
        }
    }
}
