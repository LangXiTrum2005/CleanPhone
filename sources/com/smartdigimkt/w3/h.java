package com.smartdigimkt.w3;

import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public interface h extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f39283a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f39284b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f39285c = 3;

    @Deprecated
    public static final int d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f39286e = 0;

    @Deprecated
    public static final int f = 1;

    @Deprecated
    public static final int g = 2;

    @Deprecated
    public interface a extends w.c {
    }

    @Deprecated
    public interface b extends x.b {
    }

    @Deprecated
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x.b f39287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f39289c;

        @Deprecated
        public c(x.b bVar, int i2, Object obj) {
            this.f39287a = bVar;
            this.f39288b = i2;
            this.f39289c = obj;
        }
    }

    x a(x.b bVar);

    void a(com.smartdigimkt.j4.s sVar);

    void a(com.smartdigimkt.j4.s sVar, boolean z2, boolean z3);

    void a(c0 c0Var);

    @Deprecated
    void a(c... cVarArr);

    @Deprecated
    void b(c... cVarArr);

    Looper n();
}
