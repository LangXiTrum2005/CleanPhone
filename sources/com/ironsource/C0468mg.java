package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.mg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0468mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f29766a;

    public C0468mg(F0 f10) {
        this.f29766a = f10;
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f29766a.a(C0.COLLECT_TOKENS_FAILED, map);
    }

    public void b(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f29766a.a(C0.COLLECT_TOKENS_COMPLETED, map);
    }

    public void b(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f29766a.a(C0.INSTANCE_COLLECT_TOKEN, map2);
    }

    public void a() {
        a(new HashMap());
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "timeout=" + j10);
        a(map);
    }

    public void b(Map<String, Object> map, long j10) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f29766a.a(C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }

    public void a(Map<String, Object> map) {
        this.f29766a.a(C0.COLLECT_TOKEN, map);
    }

    public void a(Map<String, Object> map, long j10) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f29766a.a(C0.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    public void a(Map<String, Object> map, long j10, String str) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f29766a.a(C0.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }
}
