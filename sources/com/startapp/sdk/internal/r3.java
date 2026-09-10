package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class r3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41422a;

    public r3(Context context) {
        this.f41422a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new ia(new vf(this.f41422a.getSharedPreferences("StartApp-54ff24db2aee60b9", 0)));
    }
}
