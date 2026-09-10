package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.g3;
import com.startapp.sdk.internal.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements g3, v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f40467a;

    public /* synthetic */ j(BannerStandard bannerStandard) {
        this.f40467a = bannerStandard;
    }

    @Override // com.startapp.sdk.internal.g3
    public void a() {
        this.f40467a.handleCollapse();
    }

    @Override // com.startapp.sdk.internal.v1
    public boolean a(String str) {
        return this.f40467a.onMraidClickEvent(str);
    }
}
