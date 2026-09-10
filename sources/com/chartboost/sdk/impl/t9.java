package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface t9 {

    public static final class a {
        public static CBError.Impression a(t9 t9Var, String error) {
            Intrinsics.f(error, "error");
            return CBError.Impression.INTERNAL;
        }
    }

    void A();

    String B();

    String C();

    void a(float f);

    void a(float f, float f2);

    void a(f3 f3Var);

    void a(mi miVar);

    void a(xd xdVar);

    void a(List list, Integer num);

    void a(boolean z2, String str);

    void b();

    void b(float f);

    void b(f3 f3Var);

    void c(f3 f3Var);

    void c(String str);

    CBError.Impression d(String str);

    void d(f3 f3Var);

    void e(String str);

    void f();

    String h();

    void i();

    String j();

    void k();

    void l();

    void q();

    String s();

    void t();

    void u();

    void v();

    String w();

    void z();
}
