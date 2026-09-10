package ads_mobile_sdk;

import complexometry.adultoid;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wz2 implements adultoid.attabal {
    public final hj1 a;
    public final saran b;

    public wz2(hj1 nativeAdAssets, saran uiScope) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = nativeAdAssets;
        this.b = uiScope;
    }

    @Override // complexometry.adultoid.attabal
    public final void onVideoEnd() {
        adultoid.attabal videoLifecycleCallbacks;
        adultoid adultoidVar = this.a.m;
        if (adultoidVar == null || (videoLifecycleCallbacks = adultoidVar.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        saran saranVar = this.b;
        pz2 block = new pz2(videoLifecycleCallbacks, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // complexometry.adultoid.attabal
    public final void onVideoMute(boolean z) {
        adultoid.attabal videoLifecycleCallbacks;
        adultoid adultoidVar = this.a.m;
        if (adultoidVar == null || (videoLifecycleCallbacks = adultoidVar.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        saran saranVar = this.b;
        rz2 block = new rz2(videoLifecycleCallbacks, null, z);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // complexometry.adultoid.attabal
    public final void onVideoPause() {
        adultoid.attabal videoLifecycleCallbacks;
        adultoid adultoidVar = this.a.m;
        if (adultoidVar == null || (videoLifecycleCallbacks = adultoidVar.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        saran saranVar = this.b;
        tz2 block = new tz2(videoLifecycleCallbacks, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // complexometry.adultoid.attabal
    public final void onVideoPlay() {
        adultoid.attabal videoLifecycleCallbacks;
        adultoid adultoidVar = this.a.m;
        if (adultoidVar == null || (videoLifecycleCallbacks = adultoidVar.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        saran saranVar = this.b;
        vz2 block = new vz2(videoLifecycleCallbacks, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // complexometry.adultoid.attabal
    public final void onVideoStart() {
    }
}
