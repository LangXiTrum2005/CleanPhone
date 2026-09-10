package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6 f23177a;

    public Sa(Context context, String sharePrefFile) {
        Intrinsics.f(context, "context");
        Intrinsics.f(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        this.f23177a = B6.a(context, sharePrefFile);
    }

    public final void a(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        C6.a(this.f23177a, key, value, false, 4, (Object) null);
    }

    public final void b(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        C6.a(this.f23177a, key, value, false, 4, (Object) null);
        a(System.currentTimeMillis() / ((long) 1000));
    }

    public final boolean c(String key) {
        Intrinsics.f(key, "key");
        return this.f23177a.a(key);
    }

    public final void a(String key, boolean z2) {
        Intrinsics.f(key, "key");
        C6.a(this.f23177a, key, z2, false, 4, (Object) null);
    }

    public final String a(String key) {
        Intrinsics.f(key, "key");
        C6 c6 = this.f23177a;
        c6.getClass();
        return c6.f22735a.getString(key, null);
    }

    public final long b() {
        C6 c6 = this.f23177a;
        c6.getClass();
        return c6.f22735a.getLong("last_ts", 0L);
    }

    public final void a(long j) {
        C6.a(this.f23177a, "last_ts", j, false, 4, (Object) null);
    }

    public final boolean b(String key) {
        Intrinsics.f(key, "key");
        C6 c6 = this.f23177a;
        c6.getClass();
        return c6.f22735a.contains(key);
    }

    public final void a() {
        this.f23177a.b();
    }
}
