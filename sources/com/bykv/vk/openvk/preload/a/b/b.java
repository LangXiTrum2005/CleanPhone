package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f12860a;

    public b(a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f12860a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f12860a.add(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f12860a) {
            if (aVar != null) {
                aVar.b(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f12860a) {
            if (aVar != null) {
                aVar.c(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f12860a) {
            if (aVar != null) {
                aVar.a(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th) {
        for (a aVar : this.f12860a) {
            if (aVar != null) {
                aVar.b(bVar, dVar, th);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th) {
        for (a aVar : this.f12860a) {
            if (aVar != null) {
                aVar.c(bVar, dVar, th);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th) {
        for (a aVar : this.f12860a) {
            if (aVar != null) {
                aVar.a(bVar, dVar, th);
            }
        }
    }
}
