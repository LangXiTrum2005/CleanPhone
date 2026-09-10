package com.iab.omid.library.chartboost.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f21845c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.chartboost.adsession.a> f21846a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.chartboost.adsession.a> f21847b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f21845c;
    }

    public Collection<com.iab.omid.library.chartboost.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f21847b);
    }

    public Collection<com.iab.omid.library.chartboost.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21846a);
    }

    public boolean d() {
        return this.f21847b.size() > 0;
    }

    public void a(com.iab.omid.library.chartboost.adsession.a aVar) {
        this.f21846a.add(aVar);
    }

    public void b(com.iab.omid.library.chartboost.adsession.a aVar) {
        boolean zD = d();
        this.f21846a.remove(aVar);
        this.f21847b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.chartboost.adsession.a aVar) {
        boolean zD = d();
        this.f21847b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
