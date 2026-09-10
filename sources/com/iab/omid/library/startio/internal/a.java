package com.iab.omid.library.startio.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.startio.utils.f f22242a = new com.iab.omid.library.startio.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f22243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22244c;
    private d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22245e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.f22244c || this.f22243b == null) {
            return;
        }
        Iterator<com.iab.omid.library.startio.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f22243b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f22242a.a();
        Date date = this.f22243b;
        if (date == null || dateA.after(date)) {
            this.f22243b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f22244c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.f22245e = this.d.c();
        this.f22244c = true;
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z2) {
        if (!this.f22245e && z2) {
            d();
        }
        this.f22245e = z2;
    }
}
