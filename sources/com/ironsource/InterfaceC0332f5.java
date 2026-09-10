package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0332f5<T> extends Oc {
    void b(C0693z8 c0693z8);

    String c();

    Y5 d();

    jk.b i();

    default boolean j() {
        return k().exists();
    }

    C0693z8 k();

    InterfaceC0692z7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            i().invoke(new wj.h(t9.e.c(e10)));
        }
    }
}
