package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
final class l<T> extends q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.d f245a;
    private final q<T> b;
    private final Type c;

    public l(com.bykv.vk.openvk.preload.a.d dVar, q<T> qVar, Type type) {
        this.f245a = dVar;
        this.b = qVar;
        this.c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        return this.b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
        q<T> qVarA = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            qVarA = this.f245a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (qVarA instanceof h.a) {
                q<T> qVar = this.b;
                if (!(qVar instanceof h.a)) {
                    qVarA = qVar;
                }
            }
        }
        qVarA.a(cVar, t);
    }
}
