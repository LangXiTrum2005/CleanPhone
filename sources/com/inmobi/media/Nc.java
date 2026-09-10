package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f23017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f23018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f23019c;
    public static final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lazy f23020e;
    public static final Lazy f;
    public static final Lazy g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.X;
        f23017a = LazyKt.a(lazyThreadSafetyMode, Gc.f22849a);
        f23018b = LazyKt.a(lazyThreadSafetyMode, Hc.f22865a);
        f23019c = LazyKt.a(lazyThreadSafetyMode, Ic.f22892a);
        d = LazyKt.a(lazyThreadSafetyMode, Jc.f22907a);
        f23020e = LazyKt.a(lazyThreadSafetyMode, Kc.f22931a);
        f = LazyKt.a(lazyThreadSafetyMode, Mc.f22986a);
        g = LazyKt.a(lazyThreadSafetyMode, Lc.f22953a);
    }

    public static C3122m1 a() {
        return (C3122m1) f23018b.getX();
    }

    public static C3123m2 b() {
        return (C3123m2) f23019c.getX();
    }

    public static R5 c() {
        return (R5) f23020e.getX();
    }

    public static Z6 d() {
        return (Z6) g.getX();
    }

    public static Vd e() {
        return (Vd) f.getX();
    }
}
