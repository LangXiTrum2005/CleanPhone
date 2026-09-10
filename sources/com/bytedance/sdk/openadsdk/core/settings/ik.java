package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.aw;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static final ConcurrentHashMap<String, lr> ri = new ConcurrentHashMap<>();

    private static HashMap<String, lr> lr(JSONArray jSONArray) {
        HashMap<String, lr> map = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                lr lrVarRi = ri(jSONArray.getJSONObject(i));
                if (lrVarRi != null) {
                    map.put(lrVarRi.ri, lrVarRi);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static void ri(boolean z) {
        File fileLr = lr();
        if (fileLr.exists()) {
            try {
                HashMap<String, lr> mapLr = lr(new JSONArray(new String(com.bytedance.sdk.component.utils.xha.ka(fileLr))));
                if (mapLr.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, lr> entry : mapLr.entrySet()) {
                    ri.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    private static File lr() {
        return com.bytedance.sdk.component.utils.xha.ri(nr.ri(), nr.ri().getFilesDir(), "tt_ads_conf_sr");
    }

    private static lr lr(String str) {
        return new lr(str, 1);
    }

    private static lr ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new lr(jSONObject);
    }

    public static lr ri(String str) {
        lr lrVar = ri.get(str);
        return lrVar == null ? lr(str) : lrVar;
    }

    public static void ri(JSONArray jSONArray) throws Throwable {
        if (jSONArray == null) {
            return;
        }
        File fileLr = lr();
        File file = new File(fileLr.getParent(), fileLr.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(jSONArray.toString());
                file.renameTo(fileLr);
                if (file.exists()) {
                    file.delete();
                }
                aw.ri(fileWriter2);
            } catch (Exception unused) {
                fileWriter = fileWriter2;
                if (file.exists()) {
                    file.delete();
                }
                aw.ri(fileWriter);
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                if (file.exists()) {
                    file.delete();
                }
                aw.ri(fileWriter);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        HashMap<String, lr> mapLr = lr(jSONArray);
        if (mapLr.isEmpty()) {
            return;
        }
        for (Map.Entry<String, lr> entry : mapLr.entrySet()) {
            ri.put(entry.getKey(), entry.getValue());
        }
    }

    public static void ri() {
        File fileLr = lr();
        if (fileLr.exists()) {
            fileLr.delete();
        }
    }
}
