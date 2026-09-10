package com.mbridge.msdk.newreward.function.command;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    private static volatile d c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.newreward.adapter.e> f1623a = new HashMap<>();
    private c b;

    private d() {
    }

    public static d b() {
        if (c == null) {
            synchronized (d.class) {
                try {
                    if (c == null) {
                        c = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public c a() {
        return this.b;
    }

    public void a(c cVar) {
        this.b = cVar;
    }

    public void a(com.mbridge.msdk.newreward.adapter.e eVar) {
        if (this.f1623a.get(eVar.A()) == null) {
            this.f1623a.put(eVar.A(), eVar);
        }
    }

    public void a(String str) {
        this.f1623a.remove(str);
    }

    public com.mbridge.msdk.newreward.adapter.e b(String str) {
        return this.f1623a.get(str);
    }
}
