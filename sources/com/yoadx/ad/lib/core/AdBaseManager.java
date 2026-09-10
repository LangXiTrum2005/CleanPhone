package com.yoadx.ad.lib.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.gintrap;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdBaseManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!H&¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'H\u0016¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0086@¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u0010\u000eR\u0014\u00101\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u00100R-\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0\u0007028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R!\u0010<\u001a\b\u0012\u0004\u0012\u00020\b088FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001b\u0010L\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/yoadx/ad/lib/core/AdBaseManager;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/yoadx/ad/lib/core/beachfront;", "<init>", "()V", "", "adultoid", "", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "configList", "attabal", "(Ljava/util/List;)V", "", "cuirassed", "()Z", "", "adScenes", "preprohormone", "(Ljava/lang/String;)V", "cord", "rotuma", "adReqScenes", "Lartsy/attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "triweekly", "(Ljava/lang/String;Lartsy/attabal;)V", "adUnitConfig", "impassible", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;Ljava/lang/String;Lartsy/attabal;)V", "Landroid/app/Activity;", "context", "dovishness", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lartsy/saneness;", "gintrap", "(Landroid/app/Activity;Ljava/lang/String;Lartsy/saneness;)V", "adUnitId", "formularize", "(Ljava/lang/String;)Z", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "loadedAdObject", "beachfront", "(Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "molybdenite", "()Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "stratoscope", "(Lwretchedly/dern;)Ljava/lang/Object;", "apical", "Ljava/lang/String;", "TAG", "Lkotlinx/coroutines/flow/formularize;", "saneness", "Lpatroclinal/taiyuan;", "taiyuan", "()Lkotlinx/coroutines/flow/formularize;", "mCacheAdListFlow", "Ljava/util/concurrent/CopyOnWriteArrayList;", "dern", "impromptu", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "mAdUnitConfigs", "Laftermost/attabal;", "wireman", "Laftermost/attabal;", "limited", "", "marial", "J", "competently", "()J", "graveside", "(J)V", "lasShowTime", "Landroid/os/Handler;", "cutely", "()Landroid/os/Handler;", "mHandler", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AdBaseManager<T> implements beachfront<T> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public long lasShowTime;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String TAG = "Yoadx_ad";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan mCacheAdListFlow = p002kotlin.saneness.saneness(new Function0() { // from class: com.yoadx.ad.lib.core.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdBaseManager.monoploid();
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan mAdUnitConfigs = p002kotlin.saneness.saneness(new Function0() { // from class: com.yoadx.ad.lib.core.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdBaseManager.arytenoidectomy();
        }
    });

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final aftermost.attabal limited = new aftermost.attabal();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan mHandler = p002kotlin.saneness.saneness(new Function0() { // from class: com.yoadx.ad.lib.core.dern
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdBaseManager.polloi();
        }
    });

    public AdBaseManager() {
        adultoid();
    }

    public static final CopyOnWriteArrayList arytenoidectomy() {
        return new CopyOnWriteArrayList();
    }

    public static final void kowloon(AdBaseManager adBaseManager, AdUnitConfig adUnitConfig, String str, artsy.attabal attabalVar) {
        Intrinsics.beachfront(adUnitConfig);
        adBaseManager.impassible(adUnitConfig, str, attabalVar);
    }

    public static final formularize monoploid() {
        return gintrap.attabal(adultoid.formularize());
    }

    public static final Handler polloi() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void adultoid();

    public boolean apical() {
        T next;
        Iterator<T> it = taiyuan().getValue().iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
        } while (!((LoadedAdObject) next).adAvailable());
        return next != null;
    }

    @Override // com.yoadx.ad.lib.core.beachfront
    public void attabal(List<? extends AdUnitConfig> configList) {
        Intrinsics.checkNotNullParameter(configList, "configList");
        impromptu().clear();
        impromptu().addAll(CollectionsKt.vesuvio(CollectionsKt.basify(configList)));
    }

    public final void beachfront(LoadedAdObject<T> loadedAdObject) {
        List<LoadedAdObject<T>> value;
        List<LoadedAdObject<T>> listClaque;
        Intrinsics.checkNotNullParameter(loadedAdObject, "loadedAdObject");
        formularize<List<LoadedAdObject<T>>> formularizeVarTaiyuan = taiyuan();
        do {
            value = formularizeVarTaiyuan.getValue();
            listClaque = CollectionsKt.claque(value, loadedAdObject);
            Collections.sort(listClaque);
        } while (!formularizeVarTaiyuan.wireman(value, listClaque));
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final long getLasShowTime() {
        return this.lasShowTime;
    }

    public abstract boolean cord();

    public abstract boolean cuirassed();

    public final Handler cutely() {
        return (Handler) this.mHandler.getValue();
    }

    public void dovishness(Activity context, String adScenes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        if (YoadAdSdk.f23874attabal.competently()) {
            gintrap(context, adScenes, null);
        } else {
            dustman.attabal.f25384attabal.attabal(this.TAG, "showAd fail, YoadAdSdk no enabled");
        }
    }

    public final boolean formularize(String adUnitId) {
        Object obj;
        Object next;
        List<LoadedAdObject<T>> value;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Iterator<T> it = taiyuan().getValue().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.wireman(((LoadedAdObject) next).getAdUnitID(), adUnitId));
        if (next == null || ((LoadedAdObject) next).adAvailable()) {
            obj = next;
        } else {
            formularize<List<LoadedAdObject<T>>> formularizeVarTaiyuan = taiyuan();
            do {
                value = formularizeVarTaiyuan.getValue();
            } while (!formularizeVarTaiyuan.wireman(value, CollectionsKt.monroe(value, next)));
        }
        return obj != null;
    }

    public abstract void gintrap(Activity context, String adScenes, artsy.saneness<T> listener);

    public final void graveside(long j) {
        this.lasShowTime = j;
    }

    public void impassible(AdUnitConfig adUnitConfig, String adReqScenes, artsy.attabal listener) {
        Intrinsics.checkNotNullParameter(adUnitConfig, "adUnitConfig");
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
    }

    public final CopyOnWriteArrayList<AdUnitConfig> impromptu() {
        return (CopyOnWriteArrayList) this.mAdUnitConfigs.getValue();
    }

    public LoadedAdObject<T> molybdenite() {
        T value;
        List arrayList;
        Object objLotta;
        if (taiyuan().getValue().isEmpty()) {
            return null;
        }
        formularize<List<LoadedAdObject<T>>> formularizeVarTaiyuan = taiyuan();
        do {
            value = formularizeVarTaiyuan.getValue();
            arrayList = new ArrayList();
            for (T t : (List) value) {
                if (((LoadedAdObject) t).adAvailable()) {
                    arrayList.add(t);
                }
            }
            objLotta = CollectionsKt.lotta(arrayList, 0);
            if (objLotta != null) {
                arrayList = CollectionsKt.monroe(arrayList, objLotta);
            }
        } while (!formularizeVarTaiyuan.wireman(value, arrayList));
        return (LoadedAdObject) objLotta;
    }

    public void preprohormone(String adScenes) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        if (!cuirassed()) {
            throw new IllegalStateException("No support AutoPreload");
        }
    }

    public void rotuma(String adScenes) {
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        if (!cord()) {
            throw new IllegalStateException("No support AutoOrderLoad");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object stratoscope(wretchedly.dern<? super LoadedAdObject<T>> dernVar) {
        AdBaseManager$suspendPollAd$1 adBaseManager$suspendPollAd$1;
        AdBaseManager<T> adBaseManager;
        List<LoadedAdObject<T>> value;
        if (dernVar instanceof AdBaseManager$suspendPollAd$1) {
            adBaseManager$suspendPollAd$1 = (AdBaseManager$suspendPollAd$1) dernVar;
            int i = adBaseManager$suspendPollAd$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adBaseManager$suspendPollAd$1.label = i - Integer.MIN_VALUE;
            } else {
                adBaseManager$suspendPollAd$1 = new AdBaseManager$suspendPollAd$1(this, dernVar);
            }
        } else {
            adBaseManager$suspendPollAd$1 = new AdBaseManager$suspendPollAd$1(this, dernVar);
        }
        Object objMolybdenite = adBaseManager$suspendPollAd$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = adBaseManager$suspendPollAd$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objMolybdenite);
            final formularize<List<LoadedAdObject<T>>> formularizeVarTaiyuan = taiyuan();
            kotlinx.coroutines.flow.dern<List<? extends LoadedAdObject<T>>> dernVar2 = new kotlinx.coroutines.flow.dern<List<? extends LoadedAdObject<T>>>() { // from class: com.yoadx.ad.lib.core.AdBaseManager$suspendPollAd$$inlined$filter$1

                /* JADX INFO: renamed from: com.yoadx.ad.lib.core.AdBaseManager$suspendPollAd$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.wireman {

                    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                    public final /* synthetic */ kotlinx.coroutines.flow.wireman f23873kowloon;

                    /* JADX INFO: renamed from: com.yoadx.ad.lib.core.AdBaseManager$suspendPollAd$$inlined$filter$1$2$1, reason: invalid class name */
                    @igo.wireman(c = "com.yoadx.ad.lib.core.AdBaseManager$suspendPollAd$$inlined$filter$1$2", f = "AdBaseManager.kt", l = {50}, m = "emit")
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(wretchedly.dern dernVar) {
                            super(dernVar);
                        }

                        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.wireman wiremanVar) {
                        this.f23873kowloon = wiremanVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.wireman
                    public final Object emit(Object obj, wretchedly.dern dernVar) {
                        AnonymousClass1 anonymousClass1;
                        if (dernVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dernVar;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(dernVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(dernVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            p002kotlin.dern.saneness(obj2);
                            kotlinx.coroutines.flow.wireman wiremanVar = this.f23873kowloon;
                            if (!((List) obj).isEmpty()) {
                                anonymousClass1.label = 1;
                                if (wiremanVar.emit(obj, anonymousClass1) == objBeachfront) {
                                    return objBeachfront;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p002kotlin.dern.saneness(obj2);
                        }
                        return Unit.f29295attabal;
                    }
                }

                @Override // kotlinx.coroutines.flow.dern
                public Object collect(kotlinx.coroutines.flow.wireman wiremanVar, wretchedly.dern dernVar3) {
                    Object objCollect = formularizeVarTaiyuan.collect(new AnonymousClass2(wiremanVar), dernVar3);
                    return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
                }
            };
            adBaseManager$suspendPollAd$1.L$0 = this;
            adBaseManager$suspendPollAd$1.label = 1;
            objMolybdenite = kotlinx.coroutines.flow.marial.molybdenite(dernVar2, adBaseManager$suspendPollAd$1);
            if (objMolybdenite == objBeachfront) {
                return objBeachfront;
            }
            adBaseManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adBaseManager = (AdBaseManager) adBaseManager$suspendPollAd$1.L$0;
            p002kotlin.dern.saneness(objMolybdenite);
        }
        LoadedAdObject loadedAdObject = (LoadedAdObject) CollectionsKt.lerp((List) objMolybdenite);
        formularize<List<LoadedAdObject<T>>> formularizeVarTaiyuan2 = adBaseManager.taiyuan();
        do {
            value = formularizeVarTaiyuan2.getValue();
        } while (!formularizeVarTaiyuan2.wireman(value, CollectionsKt.monroe(value, loadedAdObject)));
        return loadedAdObject;
    }

    public final formularize<List<LoadedAdObject<T>>> taiyuan() {
        return (formularize) this.mCacheAdListFlow.getValue();
    }

    public void triweekly(final String adReqScenes, final artsy.attabal listener) {
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
        YoadAdSdk yoadAdSdk = YoadAdSdk.f23874attabal;
        if (!yoadAdSdk.competently()) {
            dustman.attabal.f25384attabal.attabal(this.TAG, "loadAd fail, YoadAdSdk no enabled");
            return;
        }
        if (!yoadAdSdk.kowloon()) {
            dustman.attabal.f25384attabal.attabal(this.TAG, "loadAd fail, YoadAdSdk no ready");
            return;
        }
        for (final AdUnitConfig adUnitConfig : impromptu()) {
            if (adUnitConfig.getLoadDelaySec() <= 0) {
                Intrinsics.beachfront(adUnitConfig);
                impassible(adUnitConfig, adReqScenes, listener);
            } else {
                cutely().postDelayed(new Runnable(adUnitConfig, adReqScenes, listener) { // from class: com.yoadx.ad.lib.core.wireman

                    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
                    public final /* synthetic */ AdUnitConfig f23887arytenoidectomy;

                    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
                    public final /* synthetic */ String f23889monoploid;

                    @Override // java.lang.Runnable
                    public final void run() {
                        AdBaseManager.kowloon(this.f23888kowloon, this.f23887arytenoidectomy, this.f23889monoploid, null);
                    }
                }, ((long) adUnitConfig.getLoadDelaySec()) * 1000);
            }
        }
    }
}
