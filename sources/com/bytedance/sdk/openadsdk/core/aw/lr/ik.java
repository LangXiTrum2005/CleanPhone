package com.bytedance.sdk.openadsdk.core.aw.lr;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private boolean di;
    private EnumC0229ik fi;
    private final String ik;
    private final boolean ka;
    private static final Map<String, lr> ri = new ConcurrentHashMap();
    private static final AtomicBoolean lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ik$ik, reason: collision with other inner class name */
    public enum EnumC0229ik {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public static class lr {
        float ik;
        String lr;
        final wjv ri;

        public lr(String str, wjv wjvVar) {
            this(str, wjvVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public lr(String str, wjv wjvVar, float f) {
            this.lr = str;
            this.ri = wjvVar;
            this.ik = f;
        }
    }

    public static class ri {
        private final String ri;
        private EnumC0229ik lr = EnumC0229ik.TRACKING_URL;
        private boolean ik = false;

        public ri(String str) {
            this.ri = str;
        }

        public ri ri(boolean z) {
            this.ik = z;
            return this;
        }

        public ik ri() {
            return new ik(this.ri, this.lr, Boolean.valueOf(this.ik));
        }
    }

    static {
        su.ri(new su.ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.1
            @Override // com.bytedance.sdk.component.utils.su.ri
            public void ri(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || ik.ri.size() <= 0) {
                    return;
                }
                ik.xha();
            }
        }, nr.ri());
    }

    public ik(String str, EnumC0229ik enumC0229ik, Boolean bool) {
        this.ik = str;
        this.fi = enumC0229ik;
        this.ka = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.aw.lr.ri> ik(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ri.C0230ri(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).ri());
                }
            }
        }
        return arrayList;
    }

    public static void lr(wjv wjvVar, List<ik> list, com.bytedance.sdk.openadsdk.core.aw.ri.ri riVar, long j, String str, String str2) {
        ri(wjvVar, list, riVar, j, str, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xha() {
        if (lr.compareAndSet(false, true)) {
            Map<String, lr> map = ri;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    ri((String) entry.getKey(), (lr) entry.getValue(), true);
                }
            }
            lr.set(false);
        }
    }

    public boolean ka() {
        return this.di;
    }

    public void l_() {
        this.di = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(final boolean z, final String str, final String str2, final lr lrVar, final String str3, final boolean z2) {
        wjv wjvVar;
        if (lrVar == null || (wjvVar = lrVar.ri) == null) {
            return;
        }
        final boolean zZz = wjvVar.zz();
        final String str4 = zZz ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik(str4) { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", lrVar.lr);
                    jSONObject.put("success", z);
                    jSONObject.put("url", str3);
                    if (zZz) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put(InMobiNetworkValues.DESCRIPTION, str);
                        }
                        float f = lrVar.ik;
                        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, ((double) Math.round(f * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), lrVar.ri, str2, str4, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.3.1
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ik() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ri() {
                        if (!z2) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }

    public static List<String> ri(wjv wjvVar, List<ik> list, com.bytedance.sdk.openadsdk.core.aw.ri.ri riVar, long j, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ik ikVar : list) {
            if (ikVar != null && (!ikVar.ka() || ikVar.ik())) {
                arrayList.add(ikVar.lr());
                ikVar.l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.aw.ik.ik(arrayList, wjvVar).ri(riVar).ri(j).lr(str).ri(str2).ri();
    }

    public static List<com.bytedance.sdk.openadsdk.core.aw.lr.lr> lr(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.aw.lr.lr.ri(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).ri());
                }
            }
        }
        return arrayList;
    }

    public boolean ik() {
        return this.ka;
    }

    public String lr() {
        return this.ik;
    }

    public static boolean ri(wjv wjvVar, List<ik> list, com.bytedance.sdk.openadsdk.core.aw.ri.ri riVar, long j, String str, lr lrVar, String str2) {
        List<String> listRi = ri(wjvVar, list, riVar, j, str, str2);
        ri(listRi, lrVar);
        return !listRi.isEmpty();
    }

    public static void ri(List<String> list, lr lrVar) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                ri(str, lrVar, false);
            }
        }
    }

    private static void ri(final String str, final lr lrVar, final boolean z) {
        com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
        if (lrVarIk == null) {
            return;
        }
        lrVarIk.ri(true);
        lrVarIk.ik(str);
        lrVarIk.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.2
            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar2) {
                String str2;
                boolean z2;
                lr lrVar3 = lrVar;
                if (lrVar3 == null || lrVar3.ri == null) {
                    return;
                }
                String str3 = null;
                if (lrVar2 == null || !lrVar2.di()) {
                    if (lrVar2 != null) {
                        str3 = lrVar2.ri() + ":" + lrVar2.lr();
                        if (!z && (lrVar2.ri() <= 300 || lrVar2.ri() >= 400)) {
                            ik.ri.put(str, lrVar);
                        }
                    }
                    str2 = str3;
                    z2 = false;
                } else {
                    str2 = null;
                    z2 = true;
                }
                ik.lr(z2, str2, ig.ik(lrVar.ri.lji()), lrVar, str, z);
                if (!z2 || ik.ri.isEmpty()) {
                    return;
                }
                ik.xha();
            }

            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                wjv wjvVar;
                lr lrVar2 = lrVar;
                if (lrVar2 != null && (wjvVar = lrVar2.ri) != null) {
                    ik.lr(false, iOException != null ? iOException.getMessage() : null, ig.ik(wjvVar.lji()), lrVar, str, z);
                }
                if (z || lrVar == null) {
                    return;
                }
                ik.ri.put(str, lrVar);
            }
        });
    }

    public static List<ik> ri(JSONArray jSONArray) {
        return ri(jSONArray, false);
    }

    public static List<ik> ri(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new ri(strOptString).ri(z).ri());
                }
            }
        }
        return arrayList;
    }
}
