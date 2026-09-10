package com.smartdigimkt.h0;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static n f35609c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f35610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.l0.b f35611b;

    private n() {
    }

    public static void a(Context context) {
        if (f35609c == null) {
            n nVar = new n();
            f35609c = nVar;
            nVar.f35610a = new k(context.getApplicationContext());
            f35609c.f35611b = new com.smartdigimkt.l0.b(c(), 3);
        }
    }

    public static com.smartdigimkt.l0.b b() {
        n nVar = f35609c;
        if (nVar != null) {
            com.smartdigimkt.l0.b bVar = nVar.f35611b;
            if (bVar != null) {
                return bVar;
            }
            nVar.f35611b = new com.smartdigimkt.l0.b(c(), 3);
            return f35609c.f35611b;
        }
        n nVar2 = new n();
        f35609c = nVar2;
        if (nVar2.f35611b == null) {
            nVar2.f35611b = new com.smartdigimkt.l0.b(c(), 3);
        }
        return f35609c.f35611b;
    }

    public static k c() {
        n nVar = f35609c;
        if (nVar != null) {
            k kVar = nVar.f35610a;
            if (kVar != null) {
                return kVar;
            }
            nVar.f35610a = new k(com.smartdigimkt.m6.b.p().k());
            return f35609c.f35610a;
        }
        n nVar2 = new n();
        f35609c = nVar2;
        if (nVar2.f35610a == null) {
            nVar2.f35610a = new k(com.smartdigimkt.m6.b.p().k());
        }
        return f35609c.f35610a;
    }

    public static void a(j jVar) {
        c().a(jVar);
    }

    public static void a() {
        com.smartdigimkt.l0.b bVar;
        n nVar = f35609c;
        if (nVar == null || (bVar = nVar.f35611b) == null) {
            return;
        }
        bVar.a();
        f35609c.f35611b = null;
    }
}
