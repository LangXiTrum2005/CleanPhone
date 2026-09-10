package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.l1;
import com.startapp.sdk.internal.o1;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements BannerCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f40426b;

    public b(c cVar) {
        this.f40426b = cVar;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        BannerStandard mrec;
        if (this.f40425a) {
            throw new IllegalStateException();
        }
        int i2 = o1.f41290a[this.f40426b.f40469b.ordinal()];
        if (i2 == 1) {
            c cVar = this.f40426b;
            mrec = new Mrec(context, false, cVar.f40470c, cVar.d);
        } else if (i2 != 2) {
            c cVar2 = this.f40426b;
            mrec = new Banner(context, false, cVar2.f40470c, cVar2.d);
        } else {
            c cVar3 = this.f40426b;
            mrec = new Cover(context, false, cVar3.f40470c, cVar3.d);
        }
        mrec.setBannerListener(bannerListener);
        mrec.addOnAttachStateChangeListener(new l1(this, mrec));
        this.f40425a = true;
        return mrec;
    }
}
