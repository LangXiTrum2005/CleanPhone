package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3489e5<T> extends Jc {
    void b(C3824x8 c3824x8);

    String c();

    V5 d();

    Function1<Result<? extends T>, Unit> i();

    default boolean j() {
        return k().exists();
    }

    C3824x8 k();

    InterfaceC3823x7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C3631m4.d().a(e);
            Function1<Result<? extends T>, Unit> function1I = i();
            Result.Companion companion = Result.INSTANCE;
            function1I.invoke(Result.m3350boximpl(Result.m3351constructorimpl(p002kotlin.dern.attabal(e))));
        }
    }
}
