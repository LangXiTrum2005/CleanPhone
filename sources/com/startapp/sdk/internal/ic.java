package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* JADX INFO: loaded from: classes6.dex */
public final class ic implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc f41091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest$RequestReason f41092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41093c;

    public ic(lc lcVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z2) {
        this.f41091a = lcVar;
        this.f41092b = metaDataRequest$RequestReason;
        this.f41093c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41091a.a(this.f41092b, this.f41093c);
    }
}
