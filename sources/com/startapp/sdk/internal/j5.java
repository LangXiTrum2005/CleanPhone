package com.startapp.sdk.internal;

import android.content.Context;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class j5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41134b;

    public j5(com.startapp.sdk.components.a aVar, Context context) {
        this.f41134b = aVar;
        this.f41133a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new c6(Collections.singletonMap("gam", new q7(this.f41133a, this.f41134b.C)));
    }
}
