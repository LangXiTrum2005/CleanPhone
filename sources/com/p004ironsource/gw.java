package com.p004ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f25183a;

    public gw(c2 c2Var) {
        this.f25183a = c2Var;
    }

    public void a() {
        this.f25183a.a(z1.COLLECT_TOKEN, new HashMap());
    }

    public void b(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25183a.a(z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f25183a.a(z1.COLLECT_TOKENS_COMPLETED, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f25183a.a(z1.COLLECT_TOKENS_FAILED, map);
    }

    public void a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25183a.a(z1.INSTANCE_COLLECT_TOKEN, map2);
    }

    public void a(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25183a.a(z1.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    public void a(Map<String, Object> map, long j, String str) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25183a.a(z1.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }
}
