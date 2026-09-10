package com.inmobi.media;

import A.RunnableC0895i;
import com.inmobi.commons.core.configs.Config;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f23027a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f23028b = LazyKt.b(L2.f22937a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f23029c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f23030e = new ConcurrentHashMap();
    public static final Lazy f = LazyKt.b(K2.f22915a);

    static {
        Uc.f().a(new int[]{2, 1}, H2.f22854a);
        Uc.a(new RunnableC0895i(7));
    }

    @JvmStatic
    public static final Config a(String str, String str2, N2 n2) {
        return M2.a(str, str2, n2);
    }

    public static final /* synthetic */ String b() {
        return "ConfigBootstrapHandler";
    }

    public static final /* synthetic */ String f() {
        return "O2";
    }

    @JvmStatic
    public static final void g() {
        M2.a();
    }

    @JvmStatic
    public static final void h() {
        if (f23029c.getAndSet(false)) {
            Intrinsics.e(f(), "access$getTAG$cp(...)");
            ((I2) f23028b.getX()).sendEmptyMessage(5);
        }
    }

    public static final void a() {
        M2.a();
    }
}
