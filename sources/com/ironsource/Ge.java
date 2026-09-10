package com.ironsource;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Ge {
    static /* synthetic */ void a(Ge ge2, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ge2.a(runnable, j10);
    }

    Ve a(Context context, String str);

    InterfaceC0674y7 a();

    String a(Context context);

    void a(long j10, Ve.a aVar);

    void a(De de2);

    void a(F1 f10);

    void a(Runnable runnable);

    void a(Runnable runnable, long j10);

    void a(String str, String str2);

    void b();

    void b(Runnable runnable);

    boolean b(Context context);

    C0265ba c();

    String c(Context context);

    void c(Runnable runnable);

    void d(Runnable runnable);

    boolean d();

    void e();

    void f();

    U9 g();
}
