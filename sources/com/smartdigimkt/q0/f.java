package com.smartdigimkt.q0;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f37842a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f37842a.put(str, (String) obj);
            } else {
                this.f37842a.put(str, obj + "");
            }
        } catch (Exception unused) {
        }
    }

    public Object b(String str) {
        return this.f37842a.get(str);
    }

    public void c(String str) {
        if (this.f37842a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f37842a.remove(str);
    }

    public boolean a(String str) {
        return this.f37842a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f37842a;
    }

    public void a(f fVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (fVar == null || (map = fVar.f37842a) == null || (map2 = this.f37842a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f37842a.putAll(map);
    }
}
