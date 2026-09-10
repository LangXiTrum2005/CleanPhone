package com.yoadx.ad.lib.admob.format.natived;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.p001lifecycle.arytenoidectomy;
import androidx.p001lifecycle.monoploid;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import com.yoadx.ad.lib.core.YoadAdSdk;
import com.yoadx.ad.lib.utils.wireman;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0003J)\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!JG\u0010*\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100(¢\u0006\u0004\b*\u0010+J.\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/yoadx/ad/lib/admob/format/natived/AdmobNativeImpl;", "Lneanderthalian/saneness;", "<init>", "()V", "", "cuirassed", "()Z", "cord", "Lkotlinx/coroutines/saran;", "lifecycleScope", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "polder", "(Lkotlinx/coroutines/saran;Lwretchedly/dern;)Ljava/lang/Object;", "", "adScenes", "", "preprohormone", "(Ljava/lang/String;)V", "rotuma", "merc", "restrictive", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "adUnitConfig", "adReqScenes", "Lartsy/attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "impassible", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;Ljava/lang/String;Lartsy/attabal;)V", "Landroid/app/Activity;", "context", "Lartsy/saneness;", "gintrap", "(Landroid/app/Activity;Ljava/lang/String;Lartsy/saneness;)V", "Landroidx/fragment/app/FragmentActivity;", "adScene", "Landroidx/lifecycle/arytenoidectomy;", "lifecycleOwner", "Landroid/view/ViewGroup;", "adViewContainer", "Lkotlin/Function1;", "callback", "sealless", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Landroidx/lifecycle/arytenoidectomy;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "isSpeedUp", "produceNow", "Lcom/yoadx/ad/lib/bean/AdState;", "kattegat", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;ZZLwretchedly/dern;)Ljava/lang/Object;", "competently", "Ljava/lang/String;", "TAG", "impromptu", "Z", "isClickRefresh", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AdmobNativeImpl extends neanderthalian.saneness {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final String TAG = "Yoadx_ad_native";

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean isClickRefresh = true;

    public static /* synthetic */ Object supplicat(AdmobNativeImpl admobNativeImpl, AdUnitConfig adUnitConfig, boolean z, boolean z2, dern dernVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: produce");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return admobNativeImpl.kattegat(adUnitConfig, z, z2, dernVar);
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
    public void gintrap(Activity context, String adScenes, artsy.saneness<NativeAd> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        throw new IllegalStateException("No support showAd function");
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public void impassible(AdUnitConfig adUnitConfig, String adReqScenes, artsy.attabal listener) {
        Intrinsics.checkNotNullParameter(adUnitConfig, "adUnitConfig");
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
        throw new IllegalStateException("No support loadAd function");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[PHI: r2 r3 r5
  0x0050: PHI (r2v6 boolean) = (r2v3 boolean), (r2v11 boolean) binds: [B:52:0x0106, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r3v5 com.yoadx.ad.lib.bean.AdUnitConfig) = (r3v3 com.yoadx.ad.lib.bean.AdUnitConfig), (r3v11 com.yoadx.ad.lib.bean.AdUnitConfig) binds: [B:52:0x0106, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r5v9 com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl) = 
  (r5v7 com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl)
  (r5v13 com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl)
 binds: [B:52:0x0106, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        if (r0 == r4) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object kattegat(com.yoadx.ad.lib.bean.AdUnitConfig r17, boolean r18, boolean r19, wretchedly.dern<? super com.yoadx.ad.lib.bean.AdState> r20) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl.kattegat(com.yoadx.ad.lib.bean.AdUnitConfig, boolean, boolean, wretchedly.dern):java.lang.Object");
    }

    public final void merc() {
        cutely.wireman(wireman.f23898attabal.dern(), premeiotic.saneness(), null, new AdmobNativeImpl$produceOne$1(this, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object polder(saran saranVar, dern<? super LoadedAdObject<NativeAd>> dernVar) {
        AdmobNativeImpl$take$1 admobNativeImpl$take$1;
        if (dernVar instanceof AdmobNativeImpl$take$1) {
            admobNativeImpl$take$1 = (AdmobNativeImpl$take$1) dernVar;
            int i = admobNativeImpl$take$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                admobNativeImpl$take$1.label = i - Integer.MIN_VALUE;
            } else {
                admobNativeImpl$take$1 = new AdmobNativeImpl$take$1(this, dernVar);
            }
        } else {
            admobNativeImpl$take$1 = new AdmobNativeImpl$take$1(this, dernVar);
        }
        Object objStratoscope = admobNativeImpl$take$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = admobNativeImpl$take$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objStratoscope);
            LoadedAdObject<NativeAd> loadedAdObjectMolybdenite = molybdenite();
            if (loadedAdObjectMolybdenite != null) {
                return loadedAdObjectMolybdenite;
            }
            cutely.wireman(saranVar, null, null, new AdmobNativeImpl$take$2(this, null), 3, null);
            admobNativeImpl$take$1.label = 1;
            objStratoscope = stratoscope(admobNativeImpl$take$1);
            if (objStratoscope == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objStratoscope);
        }
        return (LoadedAdObject) objStratoscope;
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public void preprohormone(String adScenes) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        super.preprohormone(adScenes);
        rotuma(adScenes);
    }

    public final void restrictive() {
        cutely.wireman(wireman.f23898attabal.dern(), premeiotic.saneness(), null, new AdmobNativeImpl$produceNow$1(this, null), 2, null);
    }

    @Override // com.yoadx.ad.lib.core.AdBaseManager
    public void rotuma(String adScenes) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        super.rotuma(adScenes);
        dustman.attabal attabalVar = dustman.attabal.f25384attabal;
        attabalVar.attabal(this.TAG, "startAutoOrderLoad");
        YoadAdSdk yoadAdSdk = YoadAdSdk.f23874attabal;
        if (!yoadAdSdk.competently()) {
            attabalVar.attabal(this.TAG, "startAutoOrderLoad fail, YoadAdSdk ad no available");
        } else if (yoadAdSdk.kowloon()) {
            cutely.wireman(wireman.f23898attabal.dern(), premeiotic.saneness(), null, new AdmobNativeImpl$startAutoOrderLoad$1(this, null), 2, null);
        } else {
            attabalVar.attabal(this.TAG, "startAutoOrderLoad fail, YoadAdSdk no ready");
        }
    }

    public final void sealless(FragmentActivity context, String adScene, arytenoidectomy lifecycleOwner, ViewGroup adViewContainer, Function1<? super NativeAd, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adScene, "adScene");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (YoadAdSdk.f23874attabal.competently()) {
            tower.attabal.f38900attabal.formularize(adScene, new AdUnitReportInfo("native", "", "", "", "", null, 32, null));
            cutely.wireman(monoploid.attabal(lifecycleOwner), null, null, new AdmobNativeImpl$getNativeAd$1(this, adScene, lifecycleOwner, callback, context, adViewContainer, null), 3, null);
        } else {
            if (adViewContainer != null) {
                adViewContainer.setVisibility(8);
            }
            dustman.attabal.f25384attabal.attabal(this.TAG, "getNativeAd fail, YoadAdSdk ad no available");
        }
    }
}
