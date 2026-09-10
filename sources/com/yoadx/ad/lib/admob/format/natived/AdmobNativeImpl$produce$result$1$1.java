package com.yoadx.ad.lib.admob.format.natived;

import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.yoadx.ad.lib.bean.AdState;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import igo.beachfront;
import igo.wireman;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.kowloon;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "Lcom/yoadx/ad/lib/bean/AdState;", "<anonymous>", "(Lkotlinx/coroutines/saran;)Lcom/yoadx/ad/lib/bean/AdState;"}, k = 3, mv = {2, 0, 0})
@wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$produce$result$1$1", f = "AdmobNativeImpl.kt", l = {Sdk$SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend")
public final class AdmobNativeImpl$produce$result$1$1 extends SuspendLambda implements Function2<saran, dern<? super AdState>, Object> {
    final /* synthetic */ AdUnitConfig $adUnitConfig;
    final /* synthetic */ AdmobNativeImpl $this_runCatching;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: compiled from: AdmobNativeImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class saneness implements Function1<LoadedAdObject<NativeAd>, Unit> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ impassible<AdState> f23845arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ AdmobNativeImpl f23846kowloon;

        /* JADX WARN: Multi-variable type inference failed */
        public saneness(AdmobNativeImpl admobNativeImpl, impassible<? super AdState> impassibleVar) {
            this.f23846kowloon = admobNativeImpl;
            this.f23845arytenoidectomy = impassibleVar;
        }

        public final void attabal(LoadedAdObject<NativeAd> loadedAdObject) {
            if (loadedAdObject != null) {
                this.f23846kowloon.beachfront(loadedAdObject);
            }
            if ((loadedAdObject != null ? loadedAdObject.getLoadedAdObject() : null) == null) {
                this.f23845arytenoidectomy.resumeWith(Result.m3351constructorimpl(null));
                return;
            }
            impassible<AdState> impassibleVar = this.f23845arytenoidectomy;
            Result.Companion companion = Result.INSTANCE;
            impassibleVar.resumeWith(Result.m3351constructorimpl(AdState.LOADED));
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LoadedAdObject<NativeAd> loadedAdObject) {
            attabal(loadedAdObject);
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdmobNativeImpl$produce$result$1$1(AdUnitConfig adUnitConfig, AdmobNativeImpl admobNativeImpl, dern<? super AdmobNativeImpl$produce$result$1$1> dernVar) {
        super(2, dernVar);
        this.$adUnitConfig = adUnitConfig;
        this.$this_runCatching = admobNativeImpl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        return new AdmobNativeImpl$produce$result$1$1(this.$adUnitConfig, this.$this_runCatching, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        AdUnitConfig adUnitConfig = this.$adUnitConfig;
        AdmobNativeImpl admobNativeImpl = this.$this_runCatching;
        this.L$0 = adUnitConfig;
        this.L$1 = admobNativeImpl;
        this.label = 1;
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(this), 1);
        kowloonVar.kattegat();
        kowloonVar.beachfront(attabal.f23844kowloon);
        new com.yoadx.ad.lib.admob.format.natived.saneness(adUnitConfig, "", null).taiyuan(new saneness(admobNativeImpl, kowloonVar));
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(this);
        }
        return objCuirassed == objBeachfront ? objBeachfront : objCuirassed;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, dern<? super AdState> dernVar) {
        return ((AdmobNativeImpl$produce$result$1$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX INFO: compiled from: AdmobNativeImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final attabal f23844kowloon = new attabal();

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            attabal(th);
            return Unit.f29295attabal;
        }

        public final void attabal(Throwable th) {
        }
    }
}
