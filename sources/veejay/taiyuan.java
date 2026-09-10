package veejay;

import android.app.Activity;
import ballistician.PreloadInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.ironsource.If;
import com.ironsource.Ua;
import com.yoadx.ad.lib.bean.AdState;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import com.yoadx.ad.lib.core.YoadAdSdk;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdmobInterstitialImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ/\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lveejay/taiyuan;", "Lsabbathbreaker/saneness;", "<init>", "()V", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "adUnitConfig", "", "adReqScenes", "Lartsy/attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "impassible", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;Ljava/lang/String;Lartsy/attabal;)V", "", "cuirassed", "()Z", "cord", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "Lgargoyle/attabal;", "molybdenite", "()Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "supplicat", "Landroid/app/Activity;", "context", "adScenes", "Lartsy/saneness;", "gintrap", "(Landroid/app/Activity;Ljava/lang/String;Lartsy/saneness;)V", "apical", "competently", "Ljava/lang/String;", "TAG", "impromptu", "Z", "enableAutoPreload", "taiyuan", "enableAutoOrderLoad", "Lballistician/saneness;", "cutely", "Lpatroclinal/taiyuan;", "kattegat", "()Lballistician/saneness;", "preloadInfoMap", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class taiyuan extends sabbathbreaker.saneness {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final String TAG = "Yoadx_ad_interstitial";

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan preloadInfoMap = p002kotlin.saneness.saneness(new Function0() { // from class: veejay.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return taiyuan.merc();
        }
    });

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean enableAutoPreload;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public boolean enableAutoOrderLoad;

    /* JADX INFO: compiled from: AdmobInterstitialImpl.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"veejay/taiyuan$attabal", "Lvinificator/marial;", "", "dern", "()V", "Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;", "fullScreenContentError", "competently", "(Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;)V", "wireman", If.f, "Lcomplexometry/taiyuan;", "value", "attabal", "(Lcomplexometry/taiyuan;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal extends vinificator.marial {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ artsy.saneness<gargoyle.attabal> f39323beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ LoadedAdObject<gargoyle.attabal> f39324dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ String f39325marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ taiyuan f39326wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(LoadedAdObject<gargoyle.attabal> loadedAdObject, taiyuan taiyuanVar, String str, artsy.saneness<gargoyle.attabal> sanenessVar) {
            super("interstitial", loadedAdObject);
            this.f39324dern = loadedAdObject;
            this.f39326wireman = taiyuanVar;
            this.f39325marial = str;
            this.f39323beachfront = sanenessVar;
        }

        public static final Unit arytenoidectomy(artsy.saneness sanenessVar) {
            if (sanenessVar != null) {
                sanenessVar.dern();
            }
            return Unit.f29295attabal;
        }

        public static final Unit kowloon(artsy.saneness sanenessVar) {
            if (sanenessVar != null) {
                sanenessVar.saneness();
            }
            return Unit.f29295attabal;
        }

        public static final Unit molybdenite(artsy.saneness sanenessVar, LoadedAdObject loadedAdObject) {
            if (sanenessVar != null) {
                sanenessVar.wireman(loadedAdObject);
            }
            return Unit.f29295attabal;
        }

        public static final Unit monoploid(artsy.saneness sanenessVar) {
            if (sanenessVar != null) {
                sanenessVar.marial();
            }
            return Unit.f29295attabal;
        }

        public static final Unit polloi(artsy.saneness sanenessVar, complexometry.taiyuan taiyuanVar) {
            if (sanenessVar != null) {
                sanenessVar.attabal(taiyuanVar);
            }
            return Unit.f29295attabal;
        }

        @Override // vinificator.marial, vinificator.attabal, complexometry.dern
        public void attabal(final complexometry.taiyuan value) {
            Intrinsics.checkNotNullParameter(value, "value");
            super.attabal(value);
            final artsy.saneness<gargoyle.attabal> sanenessVar = this.f39323beachfront;
            kotlin.Function0.wireman(new Function0() { // from class: veejay.competently
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return taiyuan.attabal.polloi(sanenessVar, value);
                }
            });
            dustman.attabal.f25384attabal.attabal(this.f39326wireman.TAG, "onAdPaid, adScenes: " + this.f39325marial + ", UnitId: " + this.f39324dern.getAdUnitID() + ", UnitName: " + this.f39324dern.getAdUnitName());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void competently(FullScreenContentError fullScreenContentError) {
            Intrinsics.checkNotNullParameter(fullScreenContentError, "fullScreenContentError");
            super.competently(fullScreenContentError);
            final artsy.saneness<gargoyle.attabal> sanenessVar = this.f39323beachfront;
            kotlin.Function0.wireman(new Function0() { // from class: veejay.beachfront
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return taiyuan.attabal.monoploid(sanenessVar);
                }
            });
            com.yoadx.ad.lib.core.marial.f23882attabal.saneness(false);
            dustman.attabal.f25384attabal.attabal(this.f39326wireman.TAG, "onAdFailedToShowFullScreenContent, adScenes: " + this.f39325marial + ", UnitId: " + this.f39324dern.getAdUnitID() + ", UnitName: " + this.f39324dern.getAdUnitName() + ", msg: " + fullScreenContentError.getMessage());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void dern() {
            super.dern();
            final artsy.saneness<gargoyle.attabal> sanenessVar = this.f39323beachfront;
            final LoadedAdObject<gargoyle.attabal> loadedAdObject = this.f39324dern;
            kotlin.Function0.wireman(new Function0() { // from class: veejay.impromptu
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return taiyuan.attabal.molybdenite(sanenessVar, loadedAdObject);
                }
            });
            this.f39326wireman.graveside(System.currentTimeMillis());
            com.yoadx.ad.lib.core.marial.f23882attabal.saneness(true);
            dustman.attabal.f25384attabal.attabal(this.f39326wireman.TAG, "onAdShowedFullScreenContent, adScenes: " + this.f39325marial + ", UnitId: " + this.f39324dern.getAdUnitID() + ", UnitName: " + this.f39324dern.getAdUnitName());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void onAdClicked() {
            super.onAdClicked();
            final artsy.saneness<gargoyle.attabal> sanenessVar = this.f39323beachfront;
            kotlin.Function0.wireman(new Function0() { // from class: veejay.marial
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return taiyuan.attabal.kowloon(sanenessVar);
                }
            });
            dustman.attabal.f25384attabal.attabal(this.f39326wireman.TAG, "onAdClicked, adScenes: " + this.f39325marial + ", UnitId: " + this.f39324dern.getAdUnitID() + ", UnitName: " + this.f39324dern.getAdUnitName());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void wireman() {
            super.wireman();
            final artsy.saneness<gargoyle.attabal> sanenessVar = this.f39323beachfront;
            kotlin.Function0.wireman(new Function0() { // from class: veejay.wireman
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return taiyuan.attabal.arytenoidectomy(sanenessVar);
                }
            });
            com.yoadx.ad.lib.core.marial.f23882attabal.saneness(false);
            if (!this.f39326wireman.enableAutoPreload) {
                this.f39326wireman.triweekly(this.f39325marial + "_close", null);
            }
            dustman.attabal.f25384attabal.attabal(this.f39326wireman.TAG, "onAdDismissedFullScreenContent, adScenes: " + this.f39325marial + ", UnitId: " + this.f39324dern.getAdUnitID() + ", UnitName: " + this.f39324dern.getAdUnitName());
        }
    }

    public static final ballistician.saneness merc() {
        return new ballistician.saneness();
    }

    public static final Unit restrictive(taiyuan taiyuanVar, LoadedAdObject loadedAdObject) {
        if (loadedAdObject != null) {
            taiyuanVar.beachfront(loadedAdObject);
        }
        return Unit.f29295attabal;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public boolean apical() {
        Object next;
        gargoyle.dern.Companion attabalVar;
        String adUnitID;
        if (!this.enableAutoPreload) {
            return super.apical();
        }
        Iterator<T> it = impromptu().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            attabalVar = gargoyle.dern.INSTANCE;
            adUnitID = ((AdUnitConfig) next).getAdUnitID();
            Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
        } while (!attabalVar.attabal(adUnitID));
        return ((AdUnitConfig) next) != null;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public boolean cord() {
        return true;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public boolean cuirassed() {
        return true;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public void gintrap(Activity context, String adScenes, artsy.saneness<gargoyle.attabal> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        if (!YoadAdSdk.f23874attabal.competently()) {
            dustman.attabal.f25384attabal.attabal(this.TAG, "showAd fail, YoadAdSdk no enabled");
            return;
        }
        dustman.attabal attabalVar = dustman.attabal.f25384attabal;
        attabalVar.attabal(this.TAG, "showAd, adScenes: " + adScenes);
        tower.attabal attabalVar2 = tower.attabal.f38900attabal;
        attabalVar2.formularize(adScenes, new AdUnitReportInfo("interstitial", "", "", "", "", null, 32, null));
        if (System.currentTimeMillis() - getLasShowTime() <= 5000) {
            attabalVar.saneness(this.TAG, "showLimit, adScenes: " + adScenes);
            attabalVar2.cutely(adScenes, new AdUnitReportInfo("interstitial", "", "", "", "", null, 32, null));
            if (listener != null) {
                listener.marial();
                return;
            }
            return;
        }
        LoadedAdObject<gargoyle.attabal> loadedAdObjectMolybdenite = molybdenite();
        gargoyle.attabal loadedAdObject = loadedAdObjectMolybdenite != null ? loadedAdObjectMolybdenite.getLoadedAdObject() : null;
        if (loadedAdObject != null) {
            loadedAdObjectMolybdenite.setAdShowTime(System.currentTimeMillis());
            loadedAdObjectMolybdenite.setShowScenes(adScenes);
            loadedAdObject.setAdEventCallback(new attabal(loadedAdObjectMolybdenite, this, adScenes, listener));
            loadedAdObject.show(context);
            return;
        }
        attabalVar2.apical(adScenes, new AdUnitReportInfo("interstitial", "", "", "", "", null, 32, null));
        if (listener != null) {
            listener.marial();
        }
        attabalVar.attabal(this.TAG, "showAd no cache, adScenes: " + adScenes);
        if (this.enableAutoPreload) {
            return;
        }
        triweekly(adScenes + "_no_cache", null);
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public void impassible(AdUnitConfig adUnitConfig, String adReqScenes, artsy.attabal listener) {
        Intrinsics.checkNotNullParameter(adUnitConfig, "adUnitConfig");
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
        super.impassible(adUnitConfig, adReqScenes, listener);
        dustman.attabal attabalVar = dustman.attabal.f25384attabal;
        attabalVar.attabal(this.TAG, "loadAd, state: " + adUnitConfig.getAdLastReqState() + ", reqTime: " + adUnitConfig.getAdLastReqTime() + ", UnitId: " + adUnitConfig.getAdUnitID() + ", UnitName: " + adUnitConfig.getAdUnitName() + ", adReqScenes: " + adReqScenes + " ");
        if (this.enableAutoPreload) {
            attabalVar.saneness(this.TAG, "loadAd fail, because enabled AutoPreload");
            return;
        }
        if (this.enableAutoOrderLoad) {
            attabalVar.saneness(this.TAG, "loadAd fail, because enabled AutoOrderLoad");
            return;
        }
        if (System.currentTimeMillis() - adUnitConfig.getAdLastReqTime() < Ua.C) {
            attabalVar.saneness(this.TAG, "loadAd limit, minRequestInterval, " + (System.currentTimeMillis() - adUnitConfig.getAdLastReqTime()) + " UnitId: " + adUnitConfig.getAdUnitID() + ", UnitName: " + adUnitConfig.getAdUnitName() + ", adReqScenes: " + adReqScenes + " ");
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
                new formularize(adUnitConfig, adReqScenes, listener).taiyuan(new Function1() { // from class: veejay.dern
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return taiyuan.restrictive(this.f39312kowloon, (LoadedAdObject) obj);
                    }
                });
                return;
            }
        }
        attabalVar.saneness(this.TAG, "loadAd limit, loading, UnitId: " + adUnitConfig.getAdUnitID() + ", UnitName: " + adUnitConfig.getAdUnitName() + ", adReqScenes: " + adReqScenes + " ");
    }

    public final ballistician.saneness kattegat() {
        return (ballistician.saneness) this.preloadInfoMap.getValue();
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public LoadedAdObject<gargoyle.attabal> molybdenite() {
        String adScenes;
        String adId;
        if (!this.enableAutoPreload) {
            return super.molybdenite();
        }
        Iterator<AdUnitConfig> it = impromptu().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        gargoyle.attabal attabalVarSaneness = null;
        while (it.hasNext()) {
            AdUnitConfig next = it.next();
            gargoyle.dern.Companion attabalVar = gargoyle.dern.INSTANCE;
            String adUnitID = next.getAdUnitID();
            Intrinsics.checkNotNullExpressionValue(adUnitID, "getAdUnitID(...)");
            if (attabalVar.attabal(adUnitID)) {
                String adUnitID2 = next.getAdUnitID();
                Intrinsics.checkNotNullExpressionValue(adUnitID2, "getAdUnitID(...)");
                attabalVarSaneness = attabalVar.saneness(adUnitID2);
            }
            gargoyle.attabal attabalVar2 = attabalVarSaneness;
            if (attabalVar2 != null) {
                ballistician.saneness sanenessVarKattegat = kattegat();
                String adUnitID3 = next.getAdUnitID();
                Intrinsics.checkNotNullExpressionValue(adUnitID3, "getAdUnitID(...)");
                PreloadInfo preloadInfoAttabal = sanenessVarKattegat.attabal(adUnitID3);
                return new LoadedAdObject<>(attabalVar2, next.getAdUnitID(), next.getAdUnitName(), next.getWeight(), (preloadInfoAttabal == null || (adId = preloadInfoAttabal.getAdId()) == null) ? "" : adId, (preloadInfoAttabal == null || (adScenes = preloadInfoAttabal.getAdScenes()) == null) ? "" : adScenes);
            }
            attabalVarSaneness = attabalVar2;
        }
        return null;
    }

    public final boolean supplicat() {
        return System.currentTimeMillis() - getLasShowTime() > 5000;
    }
}
