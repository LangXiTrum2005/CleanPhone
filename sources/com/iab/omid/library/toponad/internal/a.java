package com.iab.omid.library.toponad.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.toponad.utils.f f22338a = new com.iab.omid.library.toponad.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f22339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22340c;
    private d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22341e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.f22340c || this.f22339b == null) {
            return;
        }
        Iterator<com.iab.omid.library.toponad.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f22339b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f22338a.a();
        Date date = this.f22339b;
        if (date == null || dateA.after(date)) {
            this.f22339b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f22340c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.f22341e = this.d.c();
        this.f22340c = true;
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z2) {
        if (!this.f22341e && z2) {
            d();
        }
        this.f22341e = z2;
    }
}
