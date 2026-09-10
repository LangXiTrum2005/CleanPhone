package com.startapp.sdk.internal;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class t5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41505b;

    public t5(com.startapp.sdk.components.a aVar, Context context) {
        this.f41505b = aVar;
        this.f41504a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new cd(this.f41505b.D, new File(this.f41504a.getFilesDir(), "StartApp-68962b1486d766d9"), new s5());
    }
}
