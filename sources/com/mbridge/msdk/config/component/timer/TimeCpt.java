package com.mbridge.msdk.config.component.timer;

import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, Object> f29086h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f29087i = new HashMap();
    String j;
    int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f29088l;
    String m;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29089a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29090b;

        public a(boolean z2) {
            this.f29090b = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            int i2 = this.f29089a;
            this.f29089a = i2 + 1;
            map.put("triggered_count", Integer.valueOf(i2));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", map));
            if (this.f29090b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f29086h.get(timeCpt2.j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("name");
                if (obj2 instanceof String) {
                    return this.j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get("name");
        if (obj != null) {
            this.j = String.valueOf(obj);
        }
        Object obj2 = map.get("duration");
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.k = Integer.parseInt(strValueOf);
            }
        }
        Object obj3 = map.get("repeat");
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f29088l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get("action");
        if (obj4 != null) {
            this.m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        byte b2 = 0;
        super.d();
        if (this.f29086h.containsKey(this.j)) {
            handler = (Handler) this.f29086h.get(this.j);
        } else {
            handler = new Handler();
            this.f29086h.put(this.j, handler);
        }
        if (this.f29087i.containsKey(this.j)) {
            aVar = (Runnable) this.f29087i.get(this.j);
        } else {
            aVar = new a(this.f29088l == 1);
            this.f29087i.put(this.j, aVar);
        }
        if (handler == null || aVar == null) {
            return;
        }
        String str = this.m;
        str.getClass();
        switch (str.hashCode()) {
            case -934426579:
                if (!str.equals("resume")) {
                    b2 = -1;
                }
                break;
            case 3540994:
                b2 = !str.equals("stop") ? (byte) -1 : (byte) 1;
                break;
            case 106440182:
                b2 = !str.equals("pause") ? (byte) -1 : (byte) 2;
                break;
            case 109757538:
                b2 = !str.equals("start") ? (byte) -1 : (byte) 3;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 3:
                handler.postDelayed(aVar, this.k);
                break;
            case 1:
                handler.removeCallbacks(aVar);
                this.f29086h.remove(this.j);
                break;
            case 2:
                handler.removeCallbacks(aVar);
                break;
        }
    }
}
