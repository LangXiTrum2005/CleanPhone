package com.bytedance.sdk.openadsdk.slm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.wjv.fi;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static volatile boolean fi;
    private static volatile boolean ik;
    private static final HashMap<String, Integer> ri = new HashMap<>();
    private static volatile int lr = 10000;
    private static volatile boolean ka = true;

    public static boolean lr() {
        return ik;
    }

    public static void ri() {
        String strRi = fi.ri("stats_control", "");
        if (!TextUtils.isEmpty(strRi)) {
            try {
                JSONObject jSONObject = new JSONObject(strRi);
                lr = jSONObject.optInt("sampling_def", 10000);
                String strOptString = jSONObject.optString("sampling");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        ri.put(next, Integer.valueOf(jSONObject2.optInt(next, lr)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        ka = false;
        ik = false;
        if (lr == 10000 && ri.isEmpty()) {
            ka = true;
        } else if (lr == 0 && ri.isEmpty()) {
            ik = true;
        }
        fi = true;
    }

    public static int lr(String str, int i) {
        if (ik) {
            return 0;
        }
        if (!fi) {
            return i;
        }
        Integer numValueOf = ri.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i);
        }
        return numValueOf.intValue();
    }

    public static boolean ri(String str, int i) {
        if (ka || !fi) {
            return true;
        }
        if (ik) {
            return false;
        }
        if (i < 0) {
            i = lr;
        }
        Integer numValueOf = ri.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf.intValue() <= 0) {
            return false;
        }
        return numValueOf.intValue() >= 10000 || ((int) ((Math.random() * 10000.0d) + 1.0d)) <= numValueOf.intValue();
    }
}
