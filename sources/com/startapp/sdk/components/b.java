package com.startapp.sdk.components;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.k7;
import com.startapp.sdk.internal.v3;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40746a;

    public /* synthetic */ b(int i2) {
        this.f40746a = i2;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        switch (this.f40746a) {
            case 0:
                return MetaData.E().t();
            case 1:
                return a.c();
            case 2:
                return a.a();
            case 3:
                return a.b();
            default:
                return v3.c();
        }
    }
}
