package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.n;
import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k<T> extends q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<T> f243a;
    private final com.bykv.vk.openvk.preload.a.g<T> b;
    private com.bykv.vk.openvk.preload.a.d c;
    private final com.bykv.vk.openvk.preload.a.c.a<T> d;
    private q<T> g;
    private final k<T>.a f = new a(this, 0);
    private final r e = null;

    public final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar, byte b) {
            this();
        }
    }

    public k(n<T> nVar, com.bykv.vk.openvk.preload.a.g<T> gVar, com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        this.f243a = nVar;
        this.b = gVar;
        this.c = dVar;
        this.d = aVar;
    }

    private q<T> b() {
        q<T> qVar = this.g;
        if (qVar != null) {
            return qVar;
        }
        q<T> qVarA = this.c.a((r) null, this.d);
        this.g = qVarA;
        return qVarA;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (this.b == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.falconx.a.a.a(aVar) instanceof com.bykv.vk.openvk.preload.a.j) {
            return null;
        }
        return this.b.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
        n<T> nVar = this.f243a;
        if (nVar == null) {
            b().a(cVar, t);
        } else if (t == null) {
            cVar.h();
        } else {
            com.bykv.vk.openvk.preload.falconx.a.a.a(nVar.a(), cVar);
        }
    }
}
