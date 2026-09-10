package com.bumptech.glide;

import e6.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k6.r;
import k6.s;
import k6.t;
import k6.u;
import k6.w;
import l7.a0;
import oa.k0;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f10481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m5.k f10482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f10483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.i f10484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f10485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h2.d f10486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v6.c f10487h = new v6.c(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v6.b f10488i = new v6.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v9.e f10489j;

    public h() {
        v9.e eVar = new v9.e(new l0.c(20), new rc.d(5), new fd.b(6), 2);
        this.f10489j = eVar;
        this.f10480a = new u(eVar);
        this.f10481b = new x(14);
        this.f10482c = new m5.k(24);
        this.f10483d = new k0(19);
        this.f10484e = new com.bumptech.glide.load.data.i();
        this.f10485f = new a0();
        this.f10486g = new h2.d(2, false);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        m5.k kVar = this.f10482c;
        synchronized (kVar) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) kVar.f45902b);
                ((ArrayList) kVar.f45902b).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) kVar.f45902b).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) kVar.f45902b).add(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Class cls, e6.b bVar) {
        x xVar = this.f10481b;
        synchronized (xVar) {
            ((ArrayList) xVar.f49096b).add(new v6.a(cls, bVar));
        }
    }

    public final void b(Class cls, l lVar) {
        k0 k0Var = this.f10483d;
        synchronized (k0Var) {
            ((ArrayList) k0Var.f47269b).add(new v6.e(cls, lVar));
        }
    }

    public final void c(Class cls, Class cls2, s sVar) {
        u uVar = this.f10480a;
        synchronized (uVar) {
            k6.x xVar = uVar.f44373a;
            synchronized (xVar) {
                try {
                    w wVar = new w(cls, cls2, sVar);
                    ArrayList arrayList = xVar.f44387a;
                    arrayList.add(arrayList.size(), wVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ((HashMap) uVar.f44374b.f46523b).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, e6.k kVar) {
        m5.k kVar2 = this.f10482c;
        synchronized (kVar2) {
            kVar2.v(str).add(new v6.d(cls, cls2, kVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        h2.d dVar = this.f10486g;
        synchronized (dVar) {
            arrayList = dVar.f42079a;
        }
        if (arrayList.isEmpty()) {
            throw new g("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        u uVar = this.f10480a;
        uVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (uVar) {
            t tVar = (t) ((HashMap) uVar.f44374b.f46523b).get(cls);
            listUnmodifiableList = tVar == null ? null : tVar.f44372a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(uVar.f44373a.a(cls));
                if (((t) ((HashMap) uVar.f44374b.f46523b).put(cls, new t(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new g("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = (r) listUnmodifiableList.get(i10);
            if (rVar.a(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(rVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new g("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.g g(Object obj) {
        com.bumptech.glide.load.data.g gVarB;
        com.bumptech.glide.load.data.i iVar = this.f10484e;
        synchronized (iVar) {
            try {
                a7.h.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) iVar.f10527b).get(obj.getClass());
                if (fVar == null) {
                    for (com.bumptech.glide.load.data.f fVar2 : ((HashMap) iVar.f10527b).values()) {
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.i.f10525c;
                }
                gVarB = fVar.b(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVarB;
    }

    public final void h(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.f10484e;
        synchronized (iVar) {
            ((HashMap) iVar.f10527b).put(fVar.a(), fVar);
        }
    }

    public final void i(Class cls, Class cls2, s6.a aVar) {
        a0 a0Var = this.f10485f;
        synchronized (a0Var) {
            a0Var.f45082a.add(new s6.b(cls, cls2, aVar));
        }
    }
}
