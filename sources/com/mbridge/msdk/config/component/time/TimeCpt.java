package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, Object> f32435h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f32436i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f32437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f32438k;
    int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f32439m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32440a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f32441b;

        public a(boolean z10) {
            this.f32441b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            String strC = c.c("triggered_count");
            int i10 = this.f32440a;
            this.f32440a = i10 + 1;
            map.put(strC, Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", (Map<String, Object>) map));
            if (this.f32441b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f32435h.get(timeCpt2.f32437j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f32438k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("110"));
                if (obj2 instanceof String) {
                    return this.f32437j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get(c.c("110"));
        if (obj != null) {
            this.f32437j = String.valueOf(obj);
        }
        Object obj2 = map.get(c.c("152"));
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f32438k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get(c.c("153"));
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get(c.c("100"));
        if (obj4 != null) {
            this.f32439m = String.valueOf(obj4);
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
        super.d();
        if (this.f32435h.containsKey(this.f32437j)) {
            handler = (Handler) this.f32435h.get(this.f32437j);
        } else {
            handler = new Handler();
            this.f32435h.put(this.f32437j, handler);
        }
        if (this.f32436i.containsKey(this.f32437j)) {
            aVar = (Runnable) this.f32436i.get(this.f32437j);
        } else {
            aVar = new a(this.l == 1);
            this.f32436i.put(this.f32437j, aVar);
        }
        if (handler != null && aVar != null) {
            if (c.c("310").equals(this.f32439m) || c.c("335").equals(this.f32439m)) {
                handler.postDelayed(aVar, this.f32438k);
            } else if (c.c("311").equals(this.f32439m)) {
                handler.removeCallbacks(aVar);
                this.f32435h.remove(this.f32437j);
            } else if (c.c("316").equals(this.f32439m)) {
                handler.removeCallbacks(aVar);
            }
        }
        a("919002", (HashMap<String, Object>) null);
    }
}
