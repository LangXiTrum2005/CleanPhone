package com.yoadx.ad.lib.admob.format.natived;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.p001lifecycle.arytenoidectomy;
import androidx.p001lifecycle.marial;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.If;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import complexometry.adultoid;
import igo.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import vinificator.beachfront;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$getNativeAd$1", f = "AdmobNativeImpl.kt", l = {243}, m = "invokeSuspend")
public final class AdmobNativeImpl$getNativeAd$1 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
    final /* synthetic */ String $adScene;
    final /* synthetic */ ViewGroup $adViewContainer;
    final /* synthetic */ Function1<NativeAd, Unit> $callback;
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ arytenoidectomy $lifecycleOwner;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdmobNativeImpl this$0;

    /* JADX INFO: compiled from: AdmobNativeImpl.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"com/yoadx/ad/lib/admob/format/natived/AdmobNativeImpl$getNativeAd$1$attabal", "Lvinificator/beachfront;", "", If.f, "()V", "dern", "marial", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal extends beachfront {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ String f23835beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ arytenoidectomy f23836competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ LoadedAdObject<NativeAd> f23837dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f23838impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f23839marial;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final /* synthetic */ Function1<NativeAd, Unit> f23840taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ AdmobNativeImpl f23841wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public attabal(LoadedAdObject<NativeAd> loadedAdObject, AdmobNativeImpl admobNativeImpl, FragmentActivity fragmentActivity, String str, arytenoidectomy arytenoidectomyVar, ViewGroup viewGroup, Function1<? super NativeAd, Unit> function1) {
            super("native", loadedAdObject);
            this.f23837dern = loadedAdObject;
            this.f23841wireman = admobNativeImpl;
            this.f23839marial = fragmentActivity;
            this.f23835beachfront = str;
            this.f23836competently = arytenoidectomyVar;
            this.f23838impromptu = viewGroup;
            this.f23840taiyuan = function1;
        }

        @Override // vinificator.beachfront, vinificator.attabal, complexometry.dern
        public void dern() {
            super.dern();
        }

        @Override // vinificator.beachfront, vinificator.attabal, complexometry.dern
        public void marial() {
            super.marial();
            dustman.attabal.f25384attabal.attabal(this.f23841wireman.TAG, "onAdImpression: UnidId: " + this.f23837dern.getAdUnitID() + " UnitName: " + this.f23837dern.getAdUnitName());
        }

        @Override // vinificator.attabal, complexometry.dern
        public void onAdClicked() {
            super.onAdClicked();
            if (this.f23841wireman.isClickRefresh) {
                this.f23841wireman.sealless(this.f23839marial, this.f23835beachfront, this.f23836competently, this.f23838impromptu, this.f23840taiyuan);
            }
        }
    }

    /* JADX INFO: compiled from: AdmobNativeImpl.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/yoadx/ad/lib/admob/format/natived/AdmobNativeImpl$getNativeAd$1$saneness", "Landroidx/lifecycle/marial;", "Landroidx/lifecycle/arytenoidectomy;", "owner", "", "onDestroy", "(Landroidx/lifecycle/arytenoidectomy;)V", "monoploid", "dovishness", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness implements marial {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f23842arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ NativeAd f23843kowloon;

        public saneness(NativeAd nativeAd, ViewGroup viewGroup) {
            this.f23843kowloon = nativeAd;
            this.f23842arytenoidectomy = viewGroup;
        }

        @Override // androidx.p001lifecycle.marial
        public void dovishness(arytenoidectomy owner) {
            Unit unit;
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.dovishness(owner);
            NativeAd nativeAd = this.f23843kowloon;
            try {
                Result.Companion companion = Result.INSTANCE;
                adultoid videoController = nativeAd.getMediaContent().getVideoController();
                if (videoController != null) {
                    videoController.pause();
                }
                adultoid videoController2 = nativeAd.getMediaContent().getVideoController();
                if (videoController2 != null) {
                    videoController2.mute(true);
                    unit = Unit.f29295attabal;
                } else {
                    unit = null;
                }
                Result.m3351constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }

        @Override // androidx.p001lifecycle.marial
        public void monoploid(arytenoidectomy owner) {
            Unit unit;
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.monoploid(owner);
            NativeAd nativeAd = this.f23843kowloon;
            try {
                Result.Companion companion = Result.INSTANCE;
                adultoid videoController = nativeAd.getMediaContent().getVideoController();
                if (videoController != null) {
                    videoController.play();
                }
                adultoid videoController2 = nativeAd.getMediaContent().getVideoController();
                if (videoController2 != null) {
                    videoController2.mute(false);
                    unit = Unit.f29295attabal;
                } else {
                    unit = null;
                }
                Result.m3351constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }

        @Override // androidx.p001lifecycle.marial
        public void onDestroy(arytenoidectomy owner) {
            Unit unit;
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onDestroy(owner);
            NativeAd nativeAd = this.f23843kowloon;
            ViewGroup viewGroup = this.f23842arytenoidectomy;
            try {
                Result.Companion companion = Result.INSTANCE;
                nativeAd.destroy();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    unit = Unit.f29295attabal;
                } else {
                    unit = null;
                }
                Result.m3351constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdmobNativeImpl$getNativeAd$1(AdmobNativeImpl admobNativeImpl, String str, arytenoidectomy arytenoidectomyVar, Function1<? super NativeAd, Unit> function1, FragmentActivity fragmentActivity, ViewGroup viewGroup, dern<? super AdmobNativeImpl$getNativeAd$1> dernVar) {
        super(2, dernVar);
        this.this$0 = admobNativeImpl;
        this.$adScene = str;
        this.$lifecycleOwner = arytenoidectomyVar;
        this.$callback = function1;
        this.$context = fragmentActivity;
        this.$adViewContainer = viewGroup;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        AdmobNativeImpl$getNativeAd$1 admobNativeImpl$getNativeAd$1 = new AdmobNativeImpl$getNativeAd$1(this.this$0, this.$adScene, this.$lifecycleOwner, this.$callback, this.$context, this.$adViewContainer, dernVar);
        admobNativeImpl$getNativeAd$1.L$0 = obj;
        return admobNativeImpl$getNativeAd$1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.L$0;
            AdmobNativeImpl admobNativeImpl = this.this$0;
            this.label = 1;
            obj = admobNativeImpl.polder(saranVar, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        LoadedAdObject loadedAdObject = (LoadedAdObject) obj;
        NativeAd nativeAd = (NativeAd) loadedAdObject.getLoadedAdObject();
        if (nativeAd == null) {
            return Unit.f29295attabal;
        }
        loadedAdObject.setAdShowTime(System.currentTimeMillis());
        loadedAdObject.setShowScenes(this.$adScene);
        nativeAd.setAdEventCallback(new attabal(loadedAdObject, this.this$0, this.$context, this.$adScene, this.$lifecycleOwner, this.$adViewContainer, this.$callback));
        this.$lifecycleOwner.getLifecycle().attabal(new saneness(nativeAd, this.$adViewContainer));
        this.$callback.invoke(nativeAd);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
        return ((AdmobNativeImpl$getNativeAd$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
