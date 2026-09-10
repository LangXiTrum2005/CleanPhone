package asbestiform;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.ironsource.If;
import com.ironsource.Ua;
import com.yoadx.ad.lib.bean.AdState;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import com.yoadx.ad.lib.core.YoadAdSdk;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdmobAppOenImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J/\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lasbestiform/competently;", "Lrobbia/saneness;", "<init>", "()V", "", "cuirassed", "()Z", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "adUnitConfig", "", "adReqScenes", "Lartsy/attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "impassible", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;Ljava/lang/String;Lartsy/attabal;)V", "cord", "Landroid/app/Activity;", "context", "adScenes", "Lartsy/saneness;", "Lextensimeter/attabal;", "gintrap", "(Landroid/app/Activity;Ljava/lang/String;Lartsy/saneness;)V", "competently", "Ljava/lang/String;", "TAG", "impromptu", "Z", "enableAutoOrderLoad", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class competently extends robbia.saneness {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final String TAG = "Yoadx_ad_appopen";

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean enableAutoOrderLoad;

    /* JADX INFO: compiled from: AdmobAppOenImpl.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"asbestiform/competently$attabal", "Lvinificator/wireman;", "", "dern", "()V", "Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;", "fullScreenContentError", "competently", "(Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;)V", "wireman", If.f, "Lcomplexometry/taiyuan;", "value", "attabal", "(Lcomplexometry/taiyuan;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal extends vinificator.wireman {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ artsy.saneness<extensimeter.attabal> f14440beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ LoadedAdObject<extensimeter.attabal> f14441dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ String f14442marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ competently f14443wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(LoadedAdObject<extensimeter.attabal> loadedAdObject, competently competentlyVar, String str, artsy.saneness<extensimeter.attabal> sanenessVar) {
            super("app_open", loadedAdObject);
            this.f14441dern = loadedAdObject;
            this.f14443wireman = competentlyVar;
            this.f14442marial = str;
            this.f14440beachfront = sanenessVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit arytenoidectomy(artsy.saneness sanenessVar) {
            if (sanenessVar != null) {
                sanenessVar.dern();
            }
            return Unit.f29295attabal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit kowloon(artsy.saneness sanenessVar) {
            if (sanenessVar != null) {
                sanenessVar.saneness();
            }
            return Unit.f29295attabal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit molybdenite(artsy.saneness sanenessVar, LoadedAdObject loadedAdObject) {
            if (sanenessVar != null) {
                sanenessVar.wireman(loadedAdObject);
            }
            return Unit.f29295attabal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit monoploid(artsy.saneness sanenessVar) {
            if (sanenessVar != null) {
                sanenessVar.marial();
            }
            return Unit.f29295attabal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit polloi(artsy.saneness sanenessVar, complexometry.taiyuan taiyuanVar) {
            if (sanenessVar != null) {
                sanenessVar.attabal(taiyuanVar);
            }
            return Unit.f29295attabal;
        }

        @Override // vinificator.attabal, complexometry.dern
        public void attabal(final complexometry.taiyuan value) {
            Intrinsics.checkNotNullParameter(value, "value");
            super.attabal(value);
            final artsy.saneness<extensimeter.attabal> sanenessVar = this.f14440beachfront;
            Function0.wireman(new p002kotlin.jvm.functions.Function0() { // from class: asbestiform.beachfront
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return competently.attabal.polloi(sanenessVar, value);
                }
            });
            dustman.attabal.f25384attabal.attabal(this.f14443wireman.TAG, "onAdPaid, adScenes: " + this.f14442marial + ", UnitId: " + this.f14441dern.getAdUnitID() + ", UnitName: " + this.f14441dern.getAdUnitName());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void competently(FullScreenContentError fullScreenContentError) {
            Intrinsics.checkNotNullParameter(fullScreenContentError, "fullScreenContentError");
            super.competently(fullScreenContentError);
            final artsy.saneness<extensimeter.attabal> sanenessVar = this.f14440beachfront;
            Function0.wireman(new p002kotlin.jvm.functions.Function0() { // from class: asbestiform.dern
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return competently.attabal.monoploid(sanenessVar);
                }
            });
            com.yoadx.ad.lib.core.marial.f23882attabal.dern(false);
            dustman.attabal.f25384attabal.attabal(this.f14443wireman.TAG, "onAdFailedToShowFullScreenContent, adScenes: " + this.f14442marial + ", UnitId: " + this.f14441dern.getAdUnitID() + ", UnitName: " + this.f14441dern.getAdUnitName() + ", msg: " + fullScreenContentError.getMessage());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void dern() {
            super.dern();
            final artsy.saneness<extensimeter.attabal> sanenessVar = this.f14440beachfront;
            final LoadedAdObject<extensimeter.attabal> loadedAdObject = this.f14441dern;
            Function0.wireman(new p002kotlin.jvm.functions.Function0() { // from class: asbestiform.marial
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return competently.attabal.molybdenite(sanenessVar, loadedAdObject);
                }
            });
            com.yoadx.ad.lib.core.marial.f23882attabal.dern(true);
            dustman.attabal.f25384attabal.attabal(this.f14443wireman.TAG, "onAdShowedFullScreenContent, adScenes: " + this.f14442marial + ", UnitId: " + this.f14441dern.getAdUnitID() + ", UnitName: " + this.f14441dern.getAdUnitName());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void onAdClicked() {
            super.onAdClicked();
            final artsy.saneness<extensimeter.attabal> sanenessVar = this.f14440beachfront;
            Function0.wireman(new p002kotlin.jvm.functions.Function0() { // from class: asbestiform.saneness
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return competently.attabal.kowloon(sanenessVar);
                }
            });
            dustman.attabal.f25384attabal.attabal(this.f14443wireman.TAG, "onAdClicked, adScenes: " + this.f14442marial + ", UnitId: " + this.f14441dern.getAdUnitID() + ", UnitName: " + this.f14441dern.getAdUnitName());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void wireman() {
            super.wireman();
            final artsy.saneness<extensimeter.attabal> sanenessVar = this.f14440beachfront;
            Function0.wireman(new p002kotlin.jvm.functions.Function0() { // from class: asbestiform.wireman
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return competently.attabal.arytenoidectomy(sanenessVar);
                }
            });
            com.yoadx.ad.lib.core.marial.f23882attabal.dern(false);
            this.f14443wireman.triweekly(this.f14442marial + "_close", null);
            dustman.attabal.f25384attabal.attabal(this.f14443wireman.TAG, "onAdDismissedFullScreenContent, adScenes: " + this.f14442marial + ", UnitId: " + this.f14441dern.getAdUnitID() + ", UnitName: " + this.f14441dern.getAdUnitName());
        }
    }

    public static final Unit yemenite(competently competentlyVar, LoadedAdObject loadedAdObject) {
        if (loadedAdObject != null) {
            competentlyVar.beachfront(loadedAdObject);
        }
        return Unit.f29295attabal;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public boolean cord() {
        return true;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public boolean cuirassed() {
        return false;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public void gintrap(Activity context, String adScenes, artsy.saneness<extensimeter.attabal> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        if (!YoadAdSdk.f23874attabal.competently()) {
            dustman.attabal.f25384attabal.attabal(this.TAG, "showAd fail, YoadAdSdk no enabled");
            return;
        }
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        attabalVar.formularize(adScenes, new AdUnitReportInfo("app_open", "", "", "", "", ""));
        if (System.currentTimeMillis() - getLasShowTime() <= 5000) {
            dustman.attabal.f25384attabal.saneness(this.TAG, "showLimit, adScenes: " + adScenes);
            attabalVar.cutely(adScenes, new AdUnitReportInfo("app_open", "", "", "", "", null, 32, null));
            if (listener != null) {
                listener.marial();
                return;
            }
            return;
        }
        LoadedAdObject<extensimeter.attabal> loadedAdObjectMolybdenite = molybdenite();
        extensimeter.attabal loadedAdObject = loadedAdObjectMolybdenite != null ? loadedAdObjectMolybdenite.getLoadedAdObject() : null;
        dustman.attabal attabalVar2 = dustman.attabal.f25384attabal;
        attabalVar2.attabal(this.TAG, "showAd, adScenes: " + adScenes);
        if (loadedAdObject != null) {
            loadedAdObjectMolybdenite.setAdShowTime(System.currentTimeMillis());
            loadedAdObjectMolybdenite.setShowScenes(adScenes);
            loadedAdObject.setAdEventCallback(new attabal(loadedAdObjectMolybdenite, this, adScenes, listener));
            loadedAdObject.show(context);
            return;
        }
        attabalVar.apical(adScenes, new AdUnitReportInfo("app_open", "", "", "", "", null, 32, null));
        attabalVar2.attabal(this.TAG, "showAd no cache, adScenes: " + adScenes);
        if (listener != null) {
            listener.marial();
        }
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public void impassible(AdUnitConfig adUnitConfig, String adReqScenes, artsy.attabal listener) {
        Intrinsics.checkNotNullParameter(adUnitConfig, "adUnitConfig");
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
        super.impassible(adUnitConfig, adReqScenes, listener);
        dustman.attabal attabalVar = dustman.attabal.f25384attabal;
        attabalVar.attabal(this.TAG, "loadAd, UnitId: " + adUnitConfig.getAdUnitID() + ", UnitName: " + adUnitConfig.getAdUnitName() + ", adReqScenes: " + adReqScenes + " ");
        if (!YoadAdSdk.f23874attabal.competently()) {
            attabalVar.attabal(this.TAG, "loadAd fail, YoadAdSdk no enabled");
            return;
        }
        if (this.enableAutoOrderLoad) {
            attabalVar.saneness(this.TAG, "loadAd fail, because enabled AutoOrderLoad");
            return;
        }
        if (System.currentTimeMillis() - adUnitConfig.getAdLastReqTime() < Ua.C) {
            attabalVar.saneness(this.TAG, "loadAd limit, minRequestInterval, UnitId: " + adUnitConfig.getAdUnitID() + " , 3000, UnitName: " + adUnitConfig.getAdUnitName() + ", adReqScenes: " + adReqScenes + " ");
            return;
        }
        if (adUnitConfig.getMinColdNoFillSec() > 0 && adUnitConfig.getAdLastReqState() == AdState.NO_FILL && System.currentTimeMillis() - adUnitConfig.getNoFillTime() < adUnitConfig.getMinColdNoFillSec() * 1000) {
            attabalVar.saneness(this.TAG, "loadAd limit, noFillRequestInterval, UnitId: " + adUnitConfig.getAdUnitID() + ", UnitName: " + adUnitConfig.getAdUnitName() + ", adReqScenes: " + adReqScenes + " ");
            return;
        }
        if (adUnitConfig.getAdLastReqState() != AdState.LOADING || System.currentTimeMillis() - adUnitConfig.getAdLastReqTime() >= Ua.s) {
            String adUnitID = adUnitConfig.getAdUnitID();
            Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
            if (formularize(adUnitID)) {
                attabalVar.saneness(this.TAG, "loadAd fail, UnitId has loaded");
                return;
            } else {
                new cutely(adUnitConfig, adReqScenes, listener).taiyuan(new Function1() { // from class: asbestiform.attabal
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return competently.yemenite(this.f14435kowloon, (LoadedAdObject) obj);
                    }
                });
                return;
            }
        }
        attabalVar.saneness(this.TAG, "loadAd limit, loading, UnitId: " + adUnitConfig.getAdUnitID() + ", UnitName: " + adUnitConfig.getAdUnitName() + ", adReqScenes: " + adReqScenes + " ");
    }
}
