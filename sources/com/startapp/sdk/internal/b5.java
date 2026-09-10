package com.startapp.sdk.internal;

import android.content.Context;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes6.dex */
public final class b5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40828a;

    public b5(Context context) {
        this.f40828a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(PreferenceManager.getDefaultSharedPreferences(this.f40828a));
    }
}
