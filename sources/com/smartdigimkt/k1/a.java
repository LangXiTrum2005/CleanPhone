package com.smartdigimkt.k1;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36139b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f36140a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f36141a = new a();

        private b() {
        }
    }

    public static a a() {
        return b.f36141a;
    }

    public void b(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String str = dVar.N1() + "_" + dVar.j() + "_" + dVar.i0();
            if (this.f36140a.containsKey(str)) {
                this.f36140a.remove(str);
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getMessage();
            }
        }
    }

    private a() {
        this.f36140a = new ConcurrentHashMap<>();
    }

    public void a(c cVar, com.smartdigimkt.x.d dVar) {
        if (dVar == null || cVar == null) {
            return;
        }
        try {
            String str = dVar.N1() + "_" + dVar.j() + "_" + dVar.i0();
            if (this.f36140a.containsKey(str)) {
                this.f36140a.remove(str);
            }
            this.f36140a.put(str, cVar);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getMessage();
            }
        }
    }

    public c a(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            String str = dVar.N1() + "_" + dVar.j() + "_" + dVar.i0();
            if (this.f36140a.containsKey(str)) {
                return this.f36140a.get(str);
            }
            c cVar = new c(dVar, dVar.i0(), dVar.N1());
            this.f36140a.put(str, cVar);
            return cVar;
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getMessage();
            }
            return null;
        }
    }
}
