package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f22882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f22883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f22884c;

    static {
        Lazy lazyB = LazyKt.b(H5.f22859a);
        f22882a = lazyB;
        f22884c = "I5";
        C6 c6 = (C6) lazyB.getX();
        f22883b = c6 != null ? c6.f22735a.getString("cip", null) : null;
    }

    public static void a() {
        f22883b = null;
        C6 c6 = (C6) f22882a.getX();
        if (c6 != null) {
            c6.a("cip");
        }
        Intrinsics.c(f22884c);
    }
}
