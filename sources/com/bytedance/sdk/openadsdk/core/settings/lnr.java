package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.exu;
import com.bytedance.sdk.openadsdk.utils.hkc;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private static final ConcurrentHashMap<String, ud> qdl = new ConcurrentHashMap<>();

    public static void qdl(boolean z2) {
        File fileUd = ud();
        try {
            if (fileUd.exists()) {
                HashMap<String, ud> mapUd = ud(new JSONArray(new String(com.bytedance.sdk.component.utils.wd.mml(fileUd))));
                if (mapUd.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, ud> entry : mapUd.entrySet()) {
                    qdl.put(entry.getKey(), entry.getValue());
                }
                return;
            }
            String strUd = com.bytedance.sdk.openadsdk.multipro.ud.lnr() ? com.bytedance.sdk.openadsdk.multipro.mml.qdl.ud("tt_sdk_settings", "ad_slot_conf", null) : hkc.qdl("tt_sdk_settings", yt.qdl()).qdl("ad_slot_conf", (String) null);
            if (TextUtils.isEmpty(strUd)) {
                return;
            }
            HashMap<String, ud> mapUd2 = ud(new JSONArray(strUd));
            if (mapUd2.isEmpty()) {
                return;
            }
            ConcurrentHashMap<String, ud> concurrentHashMap = qdl;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(mapUd2);
        } catch (Exception unused) {
        }
    }

    private static HashMap<String, ud> ud(JSONArray jSONArray) {
        HashMap<String, ud> map = new HashMap<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                ud udVarQdl = qdl(jSONArray.getJSONObject(i2));
                if (udVarQdl != null) {
                    map.put(udVarQdl.qdl, udVarQdl);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    private static File ud() {
        return new File(yt.qdl().getFilesDir(), "tt_ads_conf_sr");
    }

    private static ud ud(String str) {
        return new ud(str, 1);
    }

    private static ud qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new ud(jSONObject);
    }

    public static ud qdl(String str) {
        ud udVar = qdl.get(str);
        return udVar == null ? ud(str) : udVar;
    }

    public static void qdl(JSONArray jSONArray) throws Throwable {
        if (jSONArray == null) {
            return;
        }
        File fileUd = ud();
        File file = new File(fileUd.getParent(), fileUd.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    fileWriter2.write(jSONArray.toString());
                    file.renameTo(fileUd);
                    hkc.qdl("tt_sdk_settings", yt.qdl()).qdl("ad_slot_conf");
                    if (file.exists()) {
                        file.delete();
                    }
                    exu.qdl(fileWriter2);
                } catch (Exception e2) {
                    e = e2;
                    fileWriter = fileWriter2;
                    Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
                    if (file.exists()) {
                        file.delete();
                    }
                    exu.qdl(fileWriter);
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (file.exists()) {
                        file.delete();
                    }
                    exu.qdl(fileWriter);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
            HashMap<String, ud> mapUd = ud(jSONArray);
            if (mapUd.isEmpty()) {
                return;
            }
            for (Map.Entry<String, ud> entry : mapUd.entrySet()) {
                qdl.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void qdl() {
        File fileUd = ud();
        if (fileUd.exists()) {
            fileUd.delete();
        }
    }
}
