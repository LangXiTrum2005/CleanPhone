package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class n9 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w9 f41268a;

    public n9(w9 w9Var) {
        this.f41268a = w9Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        try {
            w9 w9Var = this.f41268a;
            m8 m8Var = w9Var.f41623b;
            m8Var.f41243a.post(new u9(w9Var));
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
