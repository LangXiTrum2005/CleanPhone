package com.iab.omid.library.bigosg.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f21650a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f21651b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f21652c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f21650a;
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21651b);
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f21652c);
    }

    public boolean d() {
        return this.f21652c.size() > 0;
    }

    public void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        this.f21651b.add(aVar);
    }

    public void b(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f21652c.add(aVar);
        if (zD) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f21651b.remove(aVar);
        this.f21652c.remove(aVar);
        if (!zD || d()) {
            return;
        }
        f.a().c();
    }
}
