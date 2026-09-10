package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f12875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f12877c;
    private d d;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public i(List<h> list, int i2, e eVar, d dVar) {
        this.f12877c = list;
        this.f12876b = i2;
        this.f12875a = eVar;
        this.d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f12861a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.d;
        if (dVar != null) {
            dVar.f12863c = obj;
            dVar.e();
        }
        if (this.f12876b >= this.f12877c.size()) {
            return obj;
        }
        h hVar = this.f12877c.get(this.f12876b);
        Class<? extends d> cls = hVar.f12869a;
        d dVar2 = (d) this.f12875a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f12877c, this.f12876b + 1, this.f12875a, dVar2);
        dVar2.a(iVar, this.d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e2) {
            dVar2.c(e2.getCause());
            throw e2;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f12863c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f12862b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
