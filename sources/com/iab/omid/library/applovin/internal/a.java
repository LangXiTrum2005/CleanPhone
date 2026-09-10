package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f25098f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f25099a = new com.iab.omid.library.applovin.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f25100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f25102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25103e;

    private a(d dVar) {
        this.f25102d = dVar;
    }

    public static a a() {
        return f25098f;
    }

    private void c() {
        if (!this.f25101c || this.f25100b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f25100b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f25099a.a();
        Date date = this.f25100b;
        if (date == null || dateA.after(date)) {
            this.f25100b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f25101c) {
            return;
        }
        this.f25102d.a(context);
        this.f25102d.a(this);
        this.f25102d.e();
        this.f25103e = this.f25102d.c();
        this.f25101c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f25103e && z10) {
            d();
        }
        this.f25103e = z10;
    }
}
