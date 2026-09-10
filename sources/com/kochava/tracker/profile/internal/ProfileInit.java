package com.kochava.tracker.profile.internal;

import com.kochava.core.storage.prefs.internal.StoragePrefs;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.init.internal.InitResponseApi;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileInit extends a implements ProfileInitApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28285c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InitResponse f28286e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28287h;

    public ProfileInit(StoragePrefs storagePrefs, long j) {
        super(storagePrefs);
        this.f28285c = false;
        this.d = 0L;
        this.f28286e = new InitResponse();
        this.f = 0;
        this.g = 0;
        this.f28287h = false;
        this.f28284b = j;
    }

    public final synchronized void a() {
        StoragePrefs storagePrefs = this.f28312a;
        Boolean bool = Boolean.FALSE;
        this.f28285c = storagePrefs.a("init.ready", bool).booleanValue();
        this.f28312a.d("init.sent_time_millis", 0L).getClass();
        this.d = this.f28312a.d("init.received_time_millis", 0L).longValue();
        this.f28286e = InitResponse.a(this.f28312a.c("init.response", true));
        this.f = this.f28312a.b("init.rotation_url_date").intValue();
        this.g = this.f28312a.b("init.rotation_url_index").intValue();
        this.f28287h = this.f28312a.a("init.rotation_url_rotated", bool).booleanValue();
    }

    public final synchronized InitResponseApi b() {
        return this.f28286e;
    }

    public final synchronized boolean c() {
        return this.f28285c;
    }

    public final synchronized boolean d() {
        return this.d >= this.f28284b;
    }

    public final synchronized void e() {
        this.f28285c = true;
        this.f28312a.g("init.ready", true);
    }

    public final synchronized void f(long j) {
        this.d = j;
        this.f28312a.j("init.received_time_millis", j);
    }

    public final synchronized void g(InitResponse initResponse) {
        this.f28286e = initResponse;
        this.f28312a.i("init.response", initResponse.b());
    }

    public final synchronized void h(int i2) {
        this.f = i2;
        this.f28312a.h("init.rotation_url_date", i2);
    }

    public final synchronized void i(int i2) {
        this.g = i2;
        this.f28312a.h("init.rotation_url_index", i2);
    }

    public final synchronized void j(boolean z2) {
        this.f28287h = z2;
        this.f28312a.g("init.rotation_url_rotated", z2);
    }

    public final synchronized void k(long j) {
        this.f28312a.j("init.sent_time_millis", j);
    }
}
