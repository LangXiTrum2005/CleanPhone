package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class a5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40789a;

    public a5(Context context) {
        this.f40789a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f40789a.getSharedPreferences("com.startapp.sdk", 0));
    }
}
