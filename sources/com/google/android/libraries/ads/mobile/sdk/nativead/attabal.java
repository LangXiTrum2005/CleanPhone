package com.google.android.libraries.ads.mobile.sdk.nativead;

import acidy.impromptu;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.k92;
import ads_mobile_sdk.nn0;
import ads_mobile_sdk.p80;
import ads_mobile_sdk.yf2;
import ads_mobile_sdk.z51;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import complexometry.competently;
import complexometry.formularize;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.humidify;
import saneness.metairie;
import saneness.pitchy;
import saneness.spartacist;
import saneness.terni;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/attabal;", "", "attabal", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f19447attabal;

    /* JADX INFO: renamed from: com.google.android.libraries.ads.mobile.sdk.nativead.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/attabal$attabal;", "", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness;", "adRequest", "Lacidy/impromptu;", "adLoadCallback", "", "dern", "(Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness;Lacidy/impromptu;)V", "", "numberOfAds", "saneness", "(Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness;ILacidy/impromptu;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f19447attabal = new Companion();

        public static k92 attabal(saneness sanenessVar, int i) {
            terni.f37333attabal.getClass();
            return ((pitchy) ((pitchy) ((pitchy) ((pitchy) ((pitchy) new p80(((i60) ((terni) en0.c.getValue())).c).a((formularize) sanenessVar)).a((competently) sanenessVar)).a((dern) sanenessVar).a(sanenessVar).a(yf2.i)).b(false)).a(false)).a(i).a().b();
        }

        public final void dern(saneness adRequest, impromptu adLoadCallback) {
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
            saneness(adRequest, 1, adLoadCallback);
        }

        public final void saneness(saneness adRequest, int numberOfAds, impromptu adLoadCallback) {
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
            spartacist spartacistVarSaneness = humidify.saneness(adRequest.wireman(), adRequest.attabal(), adRequest.getCom.ironsource.X3.i.O java.lang.String(), Integer.valueOf(numberOfAds));
            if (spartacistVarSaneness instanceof nn0) {
                adLoadCallback.onAdFailedToLoad(new LoadAdError(LoadAdError.ErrorCode.INVALID_REQUEST, metairie.attabal((nn0) spartacistVarSaneness), null));
            } else {
                terni.f37333attabal.getClass();
                ((z51) ((i60) ((terni) en0.c.getValue())).p2.get()).a((Function1) new c(attabal(adRequest, numberOfAds), adLoadCallback, null));
            }
        }
    }
}
