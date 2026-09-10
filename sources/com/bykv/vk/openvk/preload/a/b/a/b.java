package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f230a;

    public b(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f230a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Type typeB = aVar.b();
        Class<? super T> clsA = aVar.a();
        if (!Collection.class.isAssignableFrom(clsA)) {
            return null;
        }
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(typeB, (Class<?>) clsA);
        return new a(dVar, typeA, dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(typeA)), this.f230a.a(aVar));
    }

    public static final class a<E> extends q<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q<E> f231a;
        private final com.bykv.vk.openvk.preload.a.b.h<? extends Collection<E>> b;

        public a(com.bykv.vk.openvk.preload.a.d dVar, Type type, q<E> qVar, com.bykv.vk.openvk.preload.a.b.h<? extends Collection<E>> hVar) {
            this.f231a = new l(dVar, qVar, type);
            this.b = hVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.h();
                return;
            }
            cVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f231a.a(cVar, it.next());
            }
            cVar.e();
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            Collection<E> collectionA = this.b.a();
            aVar.a();
            while (aVar.e()) {
                collectionA.add(this.f231a.a(aVar));
            }
            aVar.b();
            return collectionA;
        }
    }
}
