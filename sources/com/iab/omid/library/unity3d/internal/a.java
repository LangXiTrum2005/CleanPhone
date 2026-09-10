package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f25500f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.unity3d.utils.f f25501a = new com.iab.omid.library.unity3d.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f25502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f25504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25505e;

    private a(d dVar) {
        this.f25504d = dVar;
    }

    public static a a() {
        return f25500f;
    }

    private void c() {
        if (!this.f25503c || this.f25502b == null) {
            return;
        }
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f25502b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f25501a.a();
        Date date = this.f25502b;
        if (date == null || dateA.after(date)) {
            this.f25502b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f25503c) {
            return;
        }
        this.f25504d.a(context);
        this.f25504d.a(this);
        this.f25504d.e();
        this.f25505e = this.f25504d.c();
        this.f25503c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (!this.f25505e && z10) {
            d();
        }
        this.f25505e = z10;
    }
}
