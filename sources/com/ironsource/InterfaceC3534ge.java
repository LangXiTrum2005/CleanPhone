package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3534ge {
    static /* synthetic */ void a(InterfaceC3534ge interfaceC3534ge, C3462ce c3462ce, C3439b9 c3439b9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInitFailed");
        }
        if ((i & 2) != 0) {
            c3439b9 = null;
        }
        interfaceC3534ge.a(c3462ce, c3439b9);
    }

    void a(C3426ae c3426ae);

    void a(C3462ce c3462ce, C3439b9 c3439b9);
}
