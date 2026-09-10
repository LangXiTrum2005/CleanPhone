package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f25366f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.mmadbridge.utils.f f25367a = new com.iab.omid.library.mmadbridge.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f25368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f25370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25371e;

    private a(d dVar) {
        this.f25370d = dVar;
    }

    public static a a() {
        return f25366f;
    }

    private void c() {
        if (!this.f25369c || this.f25368b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f25368b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f25367a.a();
        Date date = this.f25368b;
        if (date == null || dateA.after(date)) {
            this.f25368b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f25369c) {
            return;
        }
        this.f25370d.a(context);
        this.f25370d.a(this);
        this.f25370d.e();
        this.f25371e = this.f25370d.c();
        this.f25369c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (!this.f25371e && z10) {
            d();
        }
        this.f25371e = z10;
    }
}
