package com.facebook.internal;

import android.content.Intent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/AppCall;", "", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class AppCall {
    public static AppCall d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16251e = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Intent f16252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f16254c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/AppCall$Companion;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public final synchronized boolean a(AppCall appCall) {
            AppCall appCall2;
            try {
                if (CrashShieldHandler.b(AppCall.class)) {
                    appCall2 = null;
                } else {
                    try {
                        appCall2 = AppCall.d;
                    } catch (Throwable th) {
                        CrashShieldHandler.a(AppCall.class, th);
                        appCall2 = null;
                    }
                }
                if (!CrashShieldHandler.b(AppCall.class)) {
                    try {
                        AppCall.d = appCall;
                    } catch (Throwable th2) {
                        CrashShieldHandler.a(AppCall.class, th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return appCall2 != null;
        }
    }

    public AppCall(int i2, int i3) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.e(uuidRandomUUID, "UUID.randomUUID()");
        this.f16253b = i2;
        this.f16254c = uuidRandomUUID;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x003d A[Catch: all -> 0x0042, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:9:0x000e, B:10:0x0010, B:26:0x0038, B:30:0x003d, B:34:0x0041, B:11:0x0011, B:20:0x0024, B:22:0x002e, B:25:0x0035, B:17:0x001e), top: B:42:0x000e, outer: #1, inners: #2 }] */
    public static final synchronized AppCall a(UUID uuid, int i2) {
        AppCall appCall;
        AppCall appCall2 = null;
        if (CrashShieldHandler.b(AppCall.class)) {
            return null;
        }
        try {
            Companion companion = f16251e;
            synchronized (companion) {
                try {
                    if (CrashShieldHandler.b(AppCall.class)) {
                        appCall = null;
                        if (appCall == null && Intrinsics.a(appCall.b(), uuid) && appCall.c() == i2) {
                            companion.a(null);
                            appCall2 = appCall;
                        }
                    } else {
                        try {
                            appCall = d;
                        } catch (Throwable th) {
                            CrashShieldHandler.a(AppCall.class, th);
                            appCall = null;
                        }
                        if (appCall == null) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
            return appCall2;
        } catch (Throwable th3) {
            CrashShieldHandler.a(AppCall.class, th3);
            return null;
        }
    }

    public final UUID b() {
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            return this.f16254c;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return null;
        }
    }

    public final int c() {
        if (CrashShieldHandler.b(this)) {
            return 0;
        }
        try {
            return this.f16253b;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return 0;
        }
    }

    public final void d() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            f16251e.a(this);
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void e(Intent intent) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            this.f16252a = intent;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
