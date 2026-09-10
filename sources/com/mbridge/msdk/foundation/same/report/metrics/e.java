package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f34006a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f34006a.put(str, (String) obj);
            } else {
                this.f34006a.put(str, obj + "");
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f34006a.get(str);
    }

    public void c(String str) {
        if (this.f34006a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f34006a.remove(str);
    }

    public boolean a(String str) {
        return this.f34006a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f34006a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f34006a) == null || (map2 = this.f34006a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f34006a.putAll(map);
    }
}
