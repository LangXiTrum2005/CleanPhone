package com.smartdigimkt.b1;

import android.content.Context;
import android.os.Handler;
import com.smartdigimkt.a1.d;
import com.smartdigimkt.z0.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    private static final String g = "a";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f33846h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33847a = com.smartdigimkt.m6.b.p().k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.c1.a f33848b = new com.smartdigimkt.c1.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, e> f33849c = new ConcurrentHashMap();
    private Map<String, Boolean> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Handler> f33850e = new ConcurrentHashMap();
    private Map<String, Integer> f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.smartdigimkt.b1.a$a, reason: collision with other inner class name */
    public class C0440a implements d {
        public C0440a() {
        }

        @Override // com.smartdigimkt.a1.d
        public void a(String str) {
            synchronized (a.a()) {
                a.this.d.put(str, Boolean.FALSE);
            }
        }
    }

    private a() {
    }

    public void b(String str) {
        if (this.f33850e.containsKey(str)) {
            Handler handler = this.f33850e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f33850e.remove(str);
        }
    }

    public static a a() {
        if (f33846h == null) {
            synchronized (a.class) {
                try {
                    if (f33846h == null) {
                        f33846h = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33846h;
    }

    public void b() {
        Map<String, e> map = this.f33849c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f33850e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f33850e.clear();
        }
        Map<String, Integer> map4 = this.f;
        if (map4 != null) {
            map4.clear();
        }
    }

    public void a(String str, String str2, com.smartdigimkt.x.e eVar, com.smartdigimkt.a1.b bVar) {
        Boolean bool;
        synchronized (a()) {
            try {
                if (this.f33847a == null) {
                    com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.y);
                    cVar.g(str);
                    cVar.k(str2);
                    this.f33848b.a(bVar, cVar);
                    return;
                }
                if (eVar != null && bVar != null) {
                    Map<String, Boolean> map = this.d;
                    if (map != null && map.containsKey(str2) && (bool = this.d.get(str2)) != null && bool.booleanValue()) {
                        com.smartdigimkt.y.c cVar2 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f40001p, "Current unit is loading!");
                        cVar2.g(str);
                        cVar2.k(str2);
                        this.f33848b.a(bVar, cVar2);
                        return;
                    }
                    this.d.put(str2, Boolean.TRUE);
                    new b(this.f33847a, a(str2), bVar, this.f33848b).a(str2, eVar, new C0440a());
                    return;
                }
                com.smartdigimkt.y.c cVar3 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f39991b);
                cVar3.g(str);
                cVar3.k(str2);
                this.f33848b.a(bVar, cVar3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e a(String str) {
        if (this.f33849c.containsKey(str)) {
            return this.f33849c.get(str);
        }
        com.smartdigimkt.n1.c cVarE = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), str);
        if (cVarE == null) {
            cVarE = com.smartdigimkt.n1.c.a(str);
        }
        e eVar = new e(str, "", 0, cVarE.A());
        this.f33849c.put(str, eVar);
        return eVar;
    }

    public void a(int i2, String str, String str2, com.smartdigimkt.z0.d dVar, com.smartdigimkt.a1.b bVar) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        int iIntValue = this.f.containsKey(str2) ? this.f.get(str2).intValue() : 0;
        if (i2 == 1) {
            if (this.f33850e.containsKey(str2) && (handler = this.f33850e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f.put(str2, Integer.valueOf(i2));
            return;
        }
        if (i2 == 2) {
            if (iIntValue == 1) {
                if (this.f33850e.containsKey(str2) && (handler2 = this.f33850e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f.put(str2, Integer.valueOf(i2));
                return;
            }
            return;
        }
        if (i2 == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f.put(str2, 1);
                return;
            }
            return;
        }
        if (i2 != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f.put(str2, 0);
            return;
        }
        if (this.f33850e.containsKey(str2) && (handler3 = this.f33850e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f.put(str2, Integer.valueOf(i2));
    }
}
