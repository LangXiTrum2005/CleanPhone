package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.nE;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static final ConcurrentHashMap<String, LD> Lxb = new ConcurrentHashMap<>();

    @NonNull
    private static HashMap<String, LD> LD(JSONArray jSONArray) {
        HashMap<String, LD> map = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                LD ldLxb = Lxb(jSONArray.getJSONObject(i));
                if (ldLxb != null) {
                    map.put(ldLxb.Lxb, ldLxb);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @WorkerThread
    public static void Lxb(boolean z) {
        File fileLD = LD();
        if (!fileLD.exists()) {
            String strLD = com.bytedance.sdk.openadsdk.multipro.LD.lk() ? com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_settings", "ad_slot_conf", null) : nE.Lxb("tt_sdk_settings", kqm.Lxb()).Lxb("ad_slot_conf", (String) null);
            if (TextUtils.isEmpty(strLD)) {
                return;
            }
            try {
                HashMap<String, LD> mapLD = LD(new JSONArray(strLD));
                if (mapLD.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, LD> concurrentHashMap = Lxb;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(mapLD);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap<String, LD> mapLD2 = LD(new JSONArray(new String(com.bytedance.sdk.component.utils.lc.ZU(fileLD))));
            if (mapLD2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, LD> entry : mapLD2.entrySet()) {
                String key = entry.getKey();
                LD value = entry.getValue();
                if (!value.nJ || z) {
                    Lxb.put(key, value);
                } else {
                    LD ld = Lxb.get(key);
                    if (ld != null) {
                        ld.JJ = value.NDz;
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    @NonNull
    private static File LD() {
        return new File(kqm.Lxb().getFilesDir(), "tt_ads_conf");
    }

    private static LD LD(String str) {
        return new LD(str, 1);
    }

    private static LD Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new LD(jSONObject);
    }

    @NonNull
    public static LD Lxb(String str) {
        LD ld = Lxb.get(str);
        return ld == null ? LD(str) : ld;
    }

    @WorkerThread
    public static void Lxb(JSONArray jSONArray) throws Throwable {
        if (jSONArray == null) {
            return;
        }
        File fileLD = LD();
        File file = new File(fileLD.getParent(), fileLD.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(jSONArray.toString());
                file.renameTo(fileLD);
                nE.Lxb("tt_sdk_settings", kqm.Lxb()).Lxb("ad_slot_conf");
                if (file.exists()) {
                    file.delete();
                }
                com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileWriter2);
            } catch (Exception unused) {
                fileWriter = fileWriter2;
                if (file.exists()) {
                    file.delete();
                }
                com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileWriter);
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                if (file.exists()) {
                    file.delete();
                }
                com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileWriter);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        HashMap<String, LD> mapLD = LD(jSONArray);
        if (mapLD.isEmpty()) {
            return;
        }
        for (Map.Entry<String, LD> entry : mapLD.entrySet()) {
            String key = entry.getKey();
            LD value = entry.getValue();
            if (value.nJ) {
                LD ld = Lxb.get(key);
                if (ld != null) {
                    ld.JJ = value.NDz;
                }
            } else {
                Lxb.put(key, value);
            }
        }
    }

    public static void Lxb() {
        File fileLD = LD();
        if (fileLD.exists()) {
            fileLD.delete();
        }
    }
}
