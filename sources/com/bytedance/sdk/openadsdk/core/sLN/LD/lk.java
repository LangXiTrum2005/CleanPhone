package com.bytedance.sdk.openadsdk.core.sLN.LD;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.HD;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
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
public class lk {
    private static final Map<String, LD> JXs = new ConcurrentHashMap();
    private static final AtomicBoolean lc = new AtomicBoolean(false);
    private EnumC0110lk LD;
    private final String Lxb;
    private boolean ZU;
    private boolean lk;

    public static class LD {
        tD LD;
        String Lxb;
        float lk;

        public LD(String str, tD tDVar) {
            this(str, tDVar, -1.0f);
        }

        public LD(String str, tD tDVar, float f) {
            this.Lxb = str;
            this.LD = tDVar;
            this.lk = f;
        }
    }

    public static class Lxb {
        private final String Lxb;
        private EnumC0110lk LD = EnumC0110lk.TRACKING_URL;
        private boolean lk = false;

        public Lxb(String str) {
            this.Lxb = str;
        }

        public Lxb Lxb(boolean z) {
            this.lk = z;
            return this;
        }

        public lk Lxb() {
            return new lk(this.Lxb, this.LD, Boolean.valueOf(this.lk));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sLN.LD.lk$lk, reason: collision with other inner class name */
    public enum EnumC0110lk {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        HD.Lxb(new HD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.sLN.LD.lk.1
            @Override // com.bytedance.sdk.component.utils.HD.Lxb
            public void Lxb(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || lk.JXs.size() <= 0) {
                    return;
                }
                lk.LD();
            }
        }, kqm.Lxb());
    }

    public lk(String str, EnumC0110lk enumC0110lk, Boolean bool) {
        this.Lxb = str;
        this.LD = enumC0110lk;
        this.lk = bool.booleanValue();
    }

    public static void LD(@NonNull List<lk> list, @Nullable com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb lxb, @Nullable long j, @Nullable String str) {
        Lxb(list, lxb, j, str, null);
    }

    public boolean JXs() {
        return this.ZU;
    }

    public boolean ZU() {
        return this.lk;
    }

    public void j_() {
        this.ZU = true;
    }

    public String lk() {
        return this.Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD() {
        if (lc.compareAndSet(false, true)) {
            Map<String, LD> map = JXs;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    Lxb((String) entry.getKey(), (LD) entry.getValue(), true);
                }
            }
            lc.set(false);
        }
    }

    public static List<String> Lxb(@NonNull List<lk> list, @Nullable com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb lxb, @Nullable long j, @Nullable String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (lk lkVar : list) {
            if (lkVar != null && (!lkVar.JXs() || lkVar.ZU())) {
                arrayList.add(lkVar.lk());
                lkVar.j_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.sLN.lk.lk(arrayList).Lxb(lxb).Lxb(j).Lxb(str).Lxb();
    }

    public static List<com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb> lk(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb.C0109Lxb(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).Lxb());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(final boolean z, final String str, final String str2, final LD ld, final String str3, final boolean z2) {
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new OY("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.sLN.LD.lk.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", ld.Lxb);
                    jSONObject.put("success", z);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put("url", str3);
                    float f = ld.lk;
                    if (f >= 0.0f) {
                        jSONObject.put("progress", ((double) Math.round(f * 100.0f)) / 100.0d);
                    }
                    if (z2) {
                        jSONObject.put("retry", true);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.ZU.lk.LD(ld.LD, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.sLN.LD.LD> LD(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.LD.Lxb(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).Lxb());
                }
            }
        }
        return arrayList;
    }

    public static void Lxb(@NonNull List<lk> list, @Nullable com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb lxb, @Nullable long j, @Nullable String str, LD ld) {
        Lxb(Lxb(list, lxb, j, str), ld);
    }

    public static void Lxb(List<String> list, LD ld) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                Lxb(str, ld, false);
            }
        }
    }

    private static void Lxb(final String str, final LD ld, final boolean z) {
        com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
        if (ldLk == null) {
            return;
        }
        ldLk.Lxb(true);
        ldLk.LD(str);
        ldLk.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.sLN.LD.lk.2
            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld2) {
                String str2;
                boolean z2;
                LD ld3 = ld;
                if (ld3 == null || ld3.LD == null) {
                    return;
                }
                String str3 = null;
                if (ld2 == null || !ld2.lc()) {
                    if (ld2 != null) {
                        str3 = ld2.Lxb() + ":" + ld2.LD();
                        if (!z && (ld2.Lxb() <= 300 || ld2.Lxb() >= 400)) {
                            lk.JXs.put(str, ld);
                        }
                    }
                    str2 = str3;
                    z2 = false;
                } else {
                    str2 = null;
                    z2 = true;
                }
                lk.LD(z2, str2, nJ.lk(ld.LD.lJ()), ld, str, z);
                if (ld2 == null || ld2.Lxb() != 200 || lk.JXs.size() <= 0) {
                    return;
                }
                lk.LD();
            }

            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                tD tDVar;
                LD ld2 = ld;
                if (ld2 != null && (tDVar = ld2.LD) != null) {
                    lk.LD(false, iOException != null ? iOException.getMessage() : null, nJ.lk(tDVar.lJ()), ld, str, z);
                }
                if (z || ld == null) {
                    return;
                }
                lk.JXs.put(str, ld);
            }
        });
    }

    public static JSONArray Lxb(List<lk> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).lk());
        }
        return jSONArray;
    }

    public static List<lk> Lxb(JSONArray jSONArray) {
        return Lxb(jSONArray, false);
    }

    public static List<lk> Lxb(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new Lxb(strOptString).Lxb(z).Lxb());
                }
            }
        }
        return arrayList;
    }
}
