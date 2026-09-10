package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class a4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40788a;

    public a4(Context context) {
        this.f40788a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f40788a;
        return new bh(context, new vf(context.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0)), new z3());
    }
}
