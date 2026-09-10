package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* JADX INFO: loaded from: classes6.dex */
public final class wg implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41637a;

    public wg(Context context) {
        this.f41637a = context;
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        MetaData.E().a(this);
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z2) {
        if (z2) {
            com.startapp.sdk.adsbase.g.d = null;
            com.startapp.sdk.adsbase.g.f40662e = null;
            com.startapp.sdk.adsbase.g.f(this.f41637a);
        }
        MetaData.E().a(this);
    }
}
