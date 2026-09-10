package com.iab.omid.library.startio.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f22246c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.startio.adsession.a> f22247a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.startio.adsession.a> f22248b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f22246c;
    }

    public Collection<com.iab.omid.library.startio.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f22248b);
    }

    public Collection<com.iab.omid.library.startio.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f22247a);
    }

    public boolean d() {
        return this.f22248b.size() > 0;
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar) {
        this.f22247a.add(aVar);
    }

    public void b(com.iab.omid.library.startio.adsession.a aVar) {
        boolean zD = d();
        this.f22247a.remove(aVar);
        this.f22248b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.startio.adsession.a aVar) {
        boolean zD = d();
        this.f22248b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
