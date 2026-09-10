package com.startapp.sdk.internal;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerListener;

/* JADX INFO: loaded from: classes6.dex */
public final class n1 implements BannerCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f41262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.d f41263c;

    public n1(com.startapp.sdk.ads.banner.d dVar, View view) {
        this.f41263c = dVar;
        this.f41262b = view;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        if (this.f41261a) {
            throw new IllegalStateException();
        }
        com.startapp.sdk.ads.banner.d dVar = this.f41263c;
        dVar.f40471a = bannerListener;
        View view = this.f41262b;
        dVar.f40472b = view;
        view.addOnAttachStateChangeListener(new m1(this));
        this.f41261a = true;
        return this.f41262b;
    }
}
