package com.kochava.tracker.profile.internal;

import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadApi;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileSession extends a implements ProfileSessionApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayloadApi f28309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28310c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28311e;
    public long f;
    public int g;

    public final synchronized void a() {
        try {
            JsonObjectApi jsonObjectApiC = this.f28312a.c("session.pause_payload", false);
            this.f28309b = jsonObjectApiC != null ? Payload.i(jsonObjectApiC) : null;
            this.f28310c = this.f28312a.d("window_count", 0L).longValue();
            this.d = this.f28312a.d("session.window_start_time_millis", 0L).longValue();
            this.f28311e = this.f28312a.a("session.window_pause_sent", Boolean.FALSE).booleanValue();
            this.f = this.f28312a.d("session.window_uptime_millis", 0L).longValue();
            this.g = this.f28312a.b("session.window_state_active_count").intValue();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized PayloadApi b() {
        return this.f28309b;
    }

    public final synchronized long c() {
        return this.f28310c;
    }

    public final synchronized long d() {
        return this.d;
    }

    public final synchronized int e() {
        return this.g;
    }

    public final synchronized long f() {
        return this.f;
    }

    public final synchronized void g(PayloadApi payloadApi) {
        try {
            this.f28309b = payloadApi;
            if (payloadApi != null) {
                this.f28312a.i("session.pause_payload", payloadApi.toJson());
            } else {
                this.f28312a.f("session.pause_payload");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(long j) {
        this.f28310c = j;
        this.f28312a.j("window_count", j);
    }

    public final synchronized void i(boolean z2) {
        this.f28311e = z2;
        this.f28312a.g("session.window_pause_sent", z2);
    }

    public final synchronized void j(long j) {
        this.d = j;
        this.f28312a.j("session.window_start_time_millis", j);
    }

    public final synchronized void k(int i2) {
        this.g = i2;
        this.f28312a.h("session.window_state_active_count", i2);
    }

    public final synchronized void l(long j) {
        this.f = j;
        this.f28312a.j("session.window_uptime_millis", j);
    }
}
