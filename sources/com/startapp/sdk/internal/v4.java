package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class v4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41559a;

    public v4(Context context) {
        this.f41559a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        ANRRemoteConfig aNRRemoteConfigI = MetaData.E().i();
        C3395f c3395f = new C3395f(aNRRemoteConfigI != null ? aNRRemoteConfigI.c() : 2000L, aNRRemoteConfigI != null && aNRRemoteConfigI.g());
        if (aNRRemoteConfigI != null && aNRRemoteConfigI.e()) {
            c3395f.f40946b = new x3(aNRRemoteConfigI);
            c3395f.f40945a = new com.startapp.sdk.adsbase.crashreport.a(this.f41559a, aNRRemoteConfigI.h(), aNRRemoteConfigI.a(), aNRRemoteConfigI.d());
            if (aNRRemoteConfigI.f()) {
                c3395f.d = new y3(this);
            }
            c3395f.start();
        }
        return c3395f;
    }
}
