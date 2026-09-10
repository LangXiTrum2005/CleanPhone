package com.applovin.impl.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c implements h.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9395b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9396c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9397d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9398e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f9399f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f9400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9401h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(List list);
    }

    public c(l lVar) {
        HashSet hashSet = new HashSet();
        this.f9400g = hashSet;
        this.f9401h = false;
        this.f9394a = lVar;
        hashSet.add(h.c.LOADING);
        hashSet.add(h.c.LOAD);
        hashSet.add(h.c.SHOW);
        hashSet.add(h.c.CLICK);
        hashSet.add(h.c.SHOW_ERROR);
        hashSet.add(h.c.DESTROY);
    }

    private boolean c() {
        return this.f9399f.isEmpty() && this.f9397d.isEmpty();
    }

    private void d() {
        List listA = a();
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(listA);
        }
    }

    public List a() {
        ArrayList arrayList;
        synchronized (this.f9396c) {
            try {
                arrayList = new ArrayList(this.f9395b.size());
                Iterator it = this.f9395b.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((h.b) it.next()).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void b(Object obj) {
        synchronized (this.f9398e) {
            try {
                this.f9399f.remove(obj);
                if (this.f9401h && c()) {
                    this.f9394a.m().a(this);
                    this.f9401h = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.sdk.h.d
    public void a(h.b bVar) {
        b(bVar);
        d();
    }

    public void b(a aVar) {
        synchronized (this.f9398e) {
            try {
                this.f9397d.remove(aVar);
                if (this.f9401h && c()) {
                    this.f9394a.m().a(this);
                    this.f9401h = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(Object obj) {
        synchronized (this.f9398e) {
            try {
                this.f9399f.add(obj);
                if (!this.f9401h) {
                    this.f9394a.m().a(this, this.f9400g);
                    this.f9401h = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List b() {
        ArrayList arrayList;
        synchronized (this.f9398e) {
            arrayList = new ArrayList(this.f9397d);
        }
        return arrayList;
    }

    public void a(a aVar) {
        synchronized (this.f9398e) {
            if (aVar != null) {
                try {
                    if (!this.f9397d.contains(aVar)) {
                        this.f9397d.add(aVar);
                        if (!this.f9401h) {
                            this.f9394a.m().a(this, this.f9400g);
                            this.f9401h = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void b(h.b bVar) {
        synchronized (this.f9396c) {
            try {
                if (bVar == null) {
                    return;
                }
                String strB = bVar.b();
                if (bVar.c() == h.c.DESTROY) {
                    this.f9395b.remove(strB);
                } else {
                    if (this.f9395b.containsKey(strB)) {
                        return;
                    }
                    this.f9395b.put(strB, bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
