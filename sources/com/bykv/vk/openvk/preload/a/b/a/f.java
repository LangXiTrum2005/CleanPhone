package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f234a;
    private boolean b = false;

    public f(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f234a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Type typeB = aVar.b();
        if (!Map.class.isAssignableFrom(aVar.a())) {
            return null;
        }
        Type[] typeArrB = com.bykv.vk.openvk.preload.a.b.a.b(typeB, com.bykv.vk.openvk.preload.a.b.a.b(typeB));
        Type type = typeArrB[0];
        return new a(dVar, typeArrB[0], (type == Boolean.TYPE || type == Boolean.class) ? m.c : dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type)), typeArrB[1], dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(typeArrB[1])), this.f234a.a(aVar));
    }

    public final class a<K, V> extends q<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q<K> f235a;
        private final q<V> b;
        private final com.bykv.vk.openvk.preload.a.b.h<? extends Map<K, V>> c;

        public a(com.bykv.vk.openvk.preload.a.d dVar, Type type, q<K> qVar, Type type2, q<V> qVar2, com.bykv.vk.openvk.preload.a.b.h<? extends Map<K, V>> hVar) {
            this.f235a = new l(dVar, qVar, type);
            this.b = new l(dVar, qVar2, type2);
            this.c = hVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                cVar.h();
                return;
            }
            cVar.f();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                cVar.a(String.valueOf(entry.getKey()));
                this.b.a(cVar, entry.getValue());
            }
            cVar.g();
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            com.bykv.vk.openvk.preload.a.d.b bVarF = aVar.f();
            if (bVarF == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            Map<K, V> mapA = this.c.a();
            if (bVarF == com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K kA = this.f235a.a(aVar);
                    if (mapA.put(kA, this.b.a(aVar)) == null) {
                        aVar.b();
                    } else {
                        throw new o("duplicate key: ".concat(String.valueOf(kA)));
                    }
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    com.bykv.vk.openvk.preload.a.b.e.f276a.a(aVar);
                    K kA2 = this.f235a.a(aVar);
                    if (mapA.put(kA2, this.b.a(aVar)) != null) {
                        throw new o("duplicate key: ".concat(String.valueOf(kA2)));
                    }
                }
                aVar.d();
            }
            return mapA;
        }
    }
}
