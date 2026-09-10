package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3762te {
    static /* synthetic */ void a(InterfaceC3762te interfaceC3762te, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC3762te.a(runnable, j);
    }

    Ie a(Context context, String str);

    InterfaceC3806w7 a();

    String a(Context context);

    void a(long j, Ie.a aVar);

    void a(F1 f1);

    void a(Xd xd);

    void a(Xd xd, long j);

    void a(C3462ce c3462ce, String str, String str2);

    void a(EnumC3712qe enumC3712qe);

    void a(Runnable runnable);

    void a(Runnable runnable, long j);

    void a(String str, String str2);

    void b();

    void b(Runnable runnable);

    boolean b(Context context);

    Y9 c();

    String c(Context context);

    void c(Runnable runnable);

    void d(Runnable runnable);

    boolean d();

    void e();

    void e(Runnable runnable);

    void f();

    R9 g();

    static /* synthetic */ void a(InterfaceC3762te interfaceC3762te, Xd xd, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC3762te.a(xd, j);
    }
}
