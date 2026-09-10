package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class V5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C6 f23297a;

    public static final C6 a() {
        C6 c6A;
        if (f23297a == null) {
            Context contextD = Uc.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                c6A = B6.a(contextD, "CrashSession-store");
            } else {
                c6A = null;
            }
            f23297a = c6A;
        }
        return f23297a;
    }

    public static final long a(AbstractC3188q3 crashType) {
        Intrinsics.f(crashType, "crashType");
        C6 c6A = a();
        if (c6A == null) {
            return 0L;
        }
        String key = crashType.f23913b;
        Intrinsics.f(key, "key");
        return c6A.f22735a.getLong(key, 0L);
    }
}
