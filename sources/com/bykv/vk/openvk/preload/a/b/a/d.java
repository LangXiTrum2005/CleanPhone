package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.n;
import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f233a;

    public d(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f233a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        com.bykv.vk.openvk.preload.a.a.a aVar2 = (com.bykv.vk.openvk.preload.a.a.a) aVar.a().getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (q<T>) a(this.f233a, dVar, aVar, aVar2);
    }

    public static q<?> a(com.bykv.vk.openvk.preload.a.b.b bVar, com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, com.bykv.vk.openvk.preload.a.a.a aVar2) {
        q<?> kVar;
        Object objA = bVar.a(com.bykv.vk.openvk.preload.a.c.a.a((Class) aVar2.a())).a();
        if (objA instanceof q) {
            kVar = (q) objA;
        } else if (objA instanceof r) {
            kVar = ((r) objA).a(dVar, aVar);
        } else {
            boolean z = objA instanceof n;
            if (!z && !(objA instanceof com.bykv.vk.openvk.preload.a.g)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            kVar = new k<>(z ? (n) objA : null, objA instanceof com.bykv.vk.openvk.preload.a.g ? (com.bykv.vk.openvk.preload.a.g) objA : null, dVar, aVar);
        }
        return (kVar == null || !aVar2.b()) ? kVar : kVar.a();
    }
}
