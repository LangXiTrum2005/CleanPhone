package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import complexometry.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class id1 implements acidy.saneness {
    public final InternalNativeAd a;
    public Drawable b;
    public final float c;
    public final float d;
    public final float e;
    public final adultoid f;
    public final boolean g;

    public id1(InternalNativeAd internalNativeAd) {
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.a = internalNativeAd;
        this.b = a().getF19432beachfront().e();
        this.c = a().getF19432beachfront().a();
        this.d = a().getF19432beachfront().c();
        this.e = a().getF19432beachfront().b();
        this.f = a().getF19432beachfront().f();
        this.g = a().getF19432beachfront().d();
    }

    @Override // acidy.saneness
    public final InternalNativeAd a() {
        return this.a;
    }

    @Override // acidy.saneness
    public final adultoid getVideoController() {
        return this.f;
    }
}
