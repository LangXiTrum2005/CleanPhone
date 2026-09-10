package com.bytedance.sdk.openadsdk.core.fs.ud;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.bqt;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private static final Map<String, ud> qdl = new ConcurrentHashMap();
    private static final AtomicBoolean ud = new AtomicBoolean(false);
    private final String lnr;
    private final boolean mml;
    private boolean mo;
    private EnumC0114lnr mzz;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fs.ud.lnr$lnr, reason: collision with other inner class name */
    public enum EnumC0114lnr {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public static class qdl {
        private final String qdl;
        private EnumC0114lnr ud = EnumC0114lnr.TRACKING_URL;
        private boolean lnr = false;

        public qdl(String str) {
            this.qdl = str;
        }

        public qdl qdl(boolean z2) {
            this.lnr = z2;
            return this;
        }

        public lnr qdl() {
            return new lnr(this.qdl, this.ud, Boolean.valueOf(this.lnr));
        }
    }

    public static class ud {
        float lnr;
        final ljh qdl;
        String ud;

        public ud(String str, ljh ljhVar) {
            this(str, ljhVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public ud(String str, ljh ljhVar, float f) {
            this.ud = str;
            this.qdl = ljhVar;
            this.lnr = f;
        }
    }

    static {
        bqt.qdl(new bqt.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.1
            @Override // com.bytedance.sdk.component.utils.bqt.qdl
            public void qdl(Context context, Intent intent, boolean z2, int i2) {
                if (i2 == 0 || lnr.qdl.size() <= 0) {
                    return;
                }
                lnr.ud();
            }
        }, yt.qdl());
    }

    public lnr(String str, EnumC0114lnr enumC0114lnr, Boolean bool) {
        this.lnr = str;
        this.mzz = enumC0114lnr;
        this.mml = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.qdl> lnr(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.fs.ud.qdl.C0115qdl(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).qdl());
                }
            }
        }
        return arrayList;
    }

    public static void ud(ljh ljhVar, List<lnr> list, com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar, long j, String str, String str2) {
        qdl(ljhVar, list, qdlVar, j, str, null, str2);
    }

    public void j_() {
        this.mo = true;
    }

    public boolean mml() {
        return this.mml;
    }

    public boolean mzz() {
        return this.mo;
    }

    public static List<String> qdl(ljh ljhVar, List<lnr> list, com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar, long j, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (lnr lnrVar : list) {
            if (lnrVar != null && (!lnrVar.mzz() || lnrVar.mml())) {
                arrayList.add(lnrVar.lnr());
                lnrVar.j_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.fs.lnr.lnr(arrayList, ljhVar).qdl(qdlVar).qdl(j).ud(str).qdl(str2).qdl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud() {
        if (ud.compareAndSet(false, true)) {
            Map<String, ud> map = qdl;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    qdl((String) entry.getKey(), (ud) entry.getValue(), true);
                }
            }
            ud.set(false);
        }
    }

    public String lnr() {
        return this.lnr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(final boolean z2, final String str, final String str2, final ud udVar, final String str3, final boolean z3) {
        ljh ljhVar;
        if (udVar == null || (ljhVar = udVar.qdl) == null) {
            return;
        }
        final boolean zUj = ljhVar.uj();
        final String str4 = zUj ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(new jpc(str4) { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", udVar.ud);
                    jSONObject.put("success", z2);
                    jSONObject.put("url", str3);
                    if (zUj) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        float f = udVar.lnr;
                        if (f >= 0.0f) {
                            jSONObject.put("progress", ((double) Math.round(f * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), udVar.qdl, str2, str4, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.3.1
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject lnr() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        if (!z3) {
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

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.ud> ud(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.fs.ud.ud.qdl(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).qdl());
                }
            }
        }
        return arrayList;
    }

    public static boolean qdl(ljh ljhVar, List<lnr> list, com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar, long j, String str, ud udVar, String str2) {
        List<String> listQdl = qdl(ljhVar, list, qdlVar, j, str, str2);
        qdl(listQdl, udVar);
        return !listQdl.isEmpty();
    }

    public static void qdl(List<String> list, ud udVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            if (!TextUtils.isEmpty(str)) {
                qdl(str, udVar, false);
            }
        }
    }

    private static void qdl(final String str, final ud udVar, final boolean z2) {
        com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
        if (udVarLnr == null) {
            return;
        }
        udVarLnr.qdl(true);
        udVarLnr.ud(str);
        udVarLnr.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.2
            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar2) {
                String str2;
                boolean z3;
                ud udVar3 = udVar;
                if (udVar3 == null || udVar3.qdl == null) {
                    return;
                }
                String str3 = null;
                if (udVar2 == null || !udVar2.mo()) {
                    if (udVar2 != null) {
                        str3 = udVar2.qdl() + ":" + udVar2.ud();
                        if (!z2 && (udVar2.qdl() <= 300 || udVar2.qdl() >= 400)) {
                            lnr.qdl.put(str, udVar);
                        }
                    }
                    str2 = str3;
                    z3 = false;
                } else {
                    str2 = null;
                    z3 = true;
                }
                lnr.ud(z3, str2, gy.lnr(udVar.qdl.vz()), udVar, str, z2);
                if (!z3 || lnr.qdl.isEmpty()) {
                    return;
                }
                lnr.ud();
            }

            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                ljh ljhVar;
                ud udVar2 = udVar;
                if (udVar2 != null && (ljhVar = udVar2.qdl) != null) {
                    lnr.ud(false, iOException != null ? iOException.getMessage() : null, gy.lnr(ljhVar.vz()), udVar, str, z2);
                }
                if (z2 || udVar == null) {
                    return;
                }
                lnr.qdl.put(str, udVar);
            }
        });
    }

    public static JSONArray qdl(List<lnr> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jSONArray.put(list.get(i2).lnr());
        }
        return jSONArray;
    }

    public static List<lnr> qdl(JSONArray jSONArray) {
        return qdl(jSONArray, false);
    }

    public static List<lnr> qdl(JSONArray jSONArray, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String strOptString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new qdl(strOptString).qdl(z2).qdl());
                }
            }
        }
        return arrayList;
    }
}
