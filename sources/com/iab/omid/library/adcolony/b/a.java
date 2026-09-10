package com.iab.omid.library.adcolony.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f21459a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.adcolony.adsession.a> f21460b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.adcolony.adsession.a> f21461c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f21459a;
    }

    public Collection<com.iab.omid.library.adcolony.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21460b);
    }

    public Collection<com.iab.omid.library.adcolony.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f21461c);
    }

    public boolean d() {
        return this.f21461c.size() > 0;
    }

    public void a(com.iab.omid.library.adcolony.adsession.a aVar) {
        this.f21460b.add(aVar);
    }

    public void b(com.iab.omid.library.adcolony.adsession.a aVar) {
        boolean zD = d();
        this.f21461c.add(aVar);
        if (zD) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.adcolony.adsession.a aVar) {
        boolean zD = d();
        this.f21460b.remove(aVar);
        this.f21461c.remove(aVar);
        if (!zD || d()) {
            return;
        }
        f.a().c();
    }
}
