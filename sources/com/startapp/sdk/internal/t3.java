package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class t3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41502a;

    public t3(Context context) {
        this.f41502a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new r0(new vf(this.f41502a.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0)));
    }
}
