package couple;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.If;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: AdNativeHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\b2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\r\"\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcouple/beachfront;", "", "<init>", "()V", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "ad", "", "adScene", "Lacidy/dern;", "adEventCallback", "", "dern", "(Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;Ljava/lang/String;Lacidy/dern;)V", "", "adEventCallbacks", "saneness", "([Lacidy/dern;)Lacidy/dern;", "Lcom/yoadx/ad/lib/admob/format/natived/attabal;", "Lpatroclinal/taiyuan;", "marial", "()Lcom/yoadx/ad/lib/admob/format/natived/attabal;", "manager", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f24107attabal = new beachfront();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final taiyuan manager = p002kotlin.saneness.saneness(new Function0() { // from class: couple.marial
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return beachfront.beachfront();
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f24108dern = 8;

    /* JADX INFO: compiled from: AdNativeHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, d2 = {"couple/beachfront$attabal", "Lacidy/dern;", "", If.f, "()V", "wireman", "Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;", "fullScreenContentError", "competently", "(Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;)V", "marial", "Lcomplexometry/taiyuan;", "value", "attabal", "(Lcomplexometry/taiyuan;)V", "dern", "beachfront", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements acidy.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ List<acidy.dern> f24110attabal;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(List<? extends acidy.dern> list) {
            this.f24110attabal = list;
        }

        @Override // complexometry.dern
        public void attabal(complexometry.taiyuan value) {
            Intrinsics.checkNotNullParameter(value, "value");
            super.attabal(value);
            Iterator<T> it = this.f24110attabal.iterator();
            while (it.hasNext()) {
                ((acidy.dern) it.next()).attabal(value);
            }
        }

        @Override // acidy.dern
        public void beachfront() {
            super.beachfront();
            Iterator<T> it = this.f24110attabal.iterator();
            while (it.hasNext()) {
                ((acidy.dern) it.next()).beachfront();
            }
        }

        @Override // complexometry.dern
        public void competently(FullScreenContentError fullScreenContentError) {
            Intrinsics.checkNotNullParameter(fullScreenContentError, "fullScreenContentError");
            super.competently(fullScreenContentError);
            Iterator<T> it = this.f24110attabal.iterator();
            while (it.hasNext()) {
                ((acidy.dern) it.next()).competently(fullScreenContentError);
            }
        }

        @Override // complexometry.dern
        public void dern() {
            super.dern();
            Iterator<T> it = this.f24110attabal.iterator();
            while (it.hasNext()) {
                ((acidy.dern) it.next()).dern();
            }
        }

        @Override // complexometry.dern
        public void marial() {
            super.marial();
            Iterator<T> it = this.f24110attabal.iterator();
            while (it.hasNext()) {
                ((acidy.dern) it.next()).marial();
            }
        }

        @Override // complexometry.dern
        public void onAdClicked() {
            super.onAdClicked();
            Iterator<T> it = this.f24110attabal.iterator();
            while (it.hasNext()) {
                ((acidy.dern) it.next()).onAdClicked();
            }
        }

        @Override // complexometry.dern
        public void wireman() {
            super.wireman();
            Iterator<T> it = this.f24110attabal.iterator();
            while (it.hasNext()) {
                ((acidy.dern) it.next()).wireman();
            }
        }
    }

    /* JADX INFO: compiled from: AdNativeHandler.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"couple/beachfront$saneness", "Lacidy/dern;", "", If.f, "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements acidy.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f24111attabal;

        public saneness(String str) {
            this.f24111attabal = str;
        }

        @Override // complexometry.dern
        public /* bridge */ void attabal(complexometry.taiyuan taiyuanVar) {
            super.attabal(taiyuanVar);
        }

        @Override // acidy.dern
        public /* bridge */ void beachfront() {
            super.beachfront();
        }

        @Override // complexometry.dern
        public /* bridge */ void competently(FullScreenContentError fullScreenContentError) {
            super.competently(fullScreenContentError);
        }

        @Override // complexometry.dern
        public /* bridge */ void dern() {
            super.dern();
        }

        @Override // complexometry.dern
        public /* bridge */ void marial() {
            super.marial();
        }

        @Override // complexometry.dern
        public void onAdClicked() {
            super.onAdClicked();
            isoparametric.attabal.f29004attabal.saneness(this.f24111attabal);
        }

        @Override // complexometry.dern
        public /* bridge */ void wireman() {
            super.wireman();
        }
    }

    public static final com.yoadx.ad.lib.admob.format.natived.attabal beachfront() {
        return new com.yoadx.ad.lib.admob.format.natived.attabal();
    }

    public static /* synthetic */ void wireman(beachfront beachfrontVar, NativeAd nativeAd, String str, acidy.dern dernVar, int i, Object obj) {
        if ((i & 4) != 0) {
            dernVar = null;
        }
        beachfrontVar.dern(nativeAd, str, dernVar);
    }

    public final void dern(NativeAd ad, String adScene, acidy.dern adEventCallback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(adScene, "adScene");
        ad.setAdEventCallback(saneness(ad.getAdEventCallback(), new saneness(adScene), adEventCallback));
    }

    public final com.yoadx.ad.lib.admob.format.natived.attabal marial() {
        return (com.yoadx.ad.lib.admob.format.natived.attabal) manager.getValue();
    }

    public final acidy.dern saneness(acidy.dern... adEventCallbacks) {
        return new attabal(polloi.saran(adEventCallbacks));
    }
}
