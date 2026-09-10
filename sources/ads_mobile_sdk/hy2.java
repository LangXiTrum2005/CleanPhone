package ads_mobile_sdk;

import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.ballistician;
import saneness.igo;
import saneness.vinyl;
import saneness.weimar;

/* JADX INFO: loaded from: classes.dex */
public final class hy2 implements igo {
    public final saran a;
    public final h1 b;
    public final e2 c;
    public final vinyl d;
    public final ballistician e;
    public final Optional f;
    public volatile monroe g;

    public hy2(saran backgroundScope, h1 adConfiguration, e2 adEventEmitter, vinyl rewardedEventEmitter, ballistician thirdPartyVideoEventEmitter, Optional nativeAdMapper) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(rewardedEventEmitter, "rewardedEventEmitter");
        Intrinsics.checkNotNullParameter(thirdPartyVideoEventEmitter, "thirdPartyVideoEventEmitter");
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        this.a = backgroundScope;
        this.b = adConfiguration;
        this.c = adEventEmitter;
        this.d = rewardedEventEmitter;
        this.e = thirdPartyVideoEventEmitter;
        this.f = nativeAdMapper;
    }

    public final void a() {
        if (this.f.isPresent()) {
            if (((weimar) this.f.get()).b() && this.b.n0 == g1.THIRD_PARTY_SDK_CALLBACK) {
                saran saranVar = this.a;
                ux2 block = new ux2(this, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            }
        } else if (this.b.n0 != g1.ON_AD_SHOW || this.g != null) {
            saran saranVar2 = this.a;
            vx2 block2 = new vx2(this, null);
            EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar2, "<this>");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(block2, "block");
            cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
        }
        monroe monroeVar = this.g;
        if (monroeVar != null) {
            monroe.attabal.attabal(monroeVar, null, 1, null);
        }
    }
}
