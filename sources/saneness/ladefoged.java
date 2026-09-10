package saneness;

import ads_mobile_sdk.dl2;
import ads_mobile_sdk.j73;
import ads_mobile_sdk.nw1;
import ads_mobile_sdk.r4;
import ads_mobile_sdk.s23;
import ads_mobile_sdk.s4;
import ads_mobile_sdk.s7;
import ads_mobile_sdk.zk2;
import ads_mobile_sdk.zu2;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ladefoged implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        s23 s23Var = s23.g;
        s23Var.getClass();
        s23Var.b.clear();
        Iterator it = Collections.unmodifiableCollection(s4.c.b).iterator();
        while (it.hasNext()) {
            ((r4) it.next()).getClass();
        }
        s23Var.f = System.nanoTime();
        s23Var.d.a();
        long jNanoTime = System.nanoTime();
        zk2 zk2Var = s23Var.c.b;
        if (s23Var.d.f.size() > 0) {
            for (String str : s23Var.d.f) {
                JSONObject jSONObjectA = zk2Var.a(null);
                View view = (View) s23Var.d.c.get(str);
                j73 j73Var = s23Var.c.a;
                String str2 = (String) s23Var.d.g.get(str);
                if (str2 != null) {
                    JSONObject jSONObjectA2 = j73Var.a(view);
                    try {
                        jSONObjectA2.put("adSessionId", str);
                    } catch (JSONException e) {
                        estimative.attabal("Error with setting ad session id", e);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", str2);
                    } catch (JSONException unused) {
                    }
                    nw1.a(jSONObjectA, jSONObjectA2);
                }
                nw1.a(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zu2 zu2Var = s23Var.e;
                zu2Var.b.a(new kunsan(zu2Var, hashSet, jSONObjectA, jNanoTime));
            }
        }
        if (s23Var.d.e.size() > 0) {
            JSONObject jSONObjectA3 = zk2Var.a(null);
            zk2Var.a(null, jSONObjectA3, s23Var, true, false);
            nw1.a(jSONObjectA3);
            zu2 zu2Var2 = s23Var.e;
            zu2Var2.b.a(new mahratti(zu2Var2, s23Var.d.e, jSONObjectA3, jNanoTime));
        } else {
            zu2 zu2Var3 = s23Var.e;
            zu2Var3.b.a(new radula(zu2Var3));
        }
        s7 s7Var = s23Var.d;
        s7Var.a.clear();
        s7Var.b.clear();
        s7Var.c.clear();
        s7Var.d.clear();
        s7Var.e.clear();
        s7Var.f.clear();
        s7Var.g.clear();
        s7Var.j = false;
        s7Var.h.clear();
        long jNanoTime2 = System.nanoTime() - s23Var.f;
        if (s23Var.a.size() > 0) {
            Iterator it2 = s23Var.a.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        dl2.d.a();
    }
}
