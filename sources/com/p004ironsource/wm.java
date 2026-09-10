package com.p004ironsource;

import android.content.Context;
import com.applovin.impl.H0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.p;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J2\u0010\u0005\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0002J*\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u0005\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\"\u0010\u0005\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\"\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010\u0005\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0014\u0010(\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010'¨\u0006+"}, d2 = {"Lcom/ironsource/wm;", "", "Lcom/unity3d/mediation/segment/LevelPlaySegment;", a4.f24258i, "Lcom/ironsource/mediationsdk/IronSourceSegment;", "a", "Landroid/content/Context;", "context", "Lcom/unity3d/mediation/LevelPlayInitRequest;", "initRequest", "Lcom/unity3d/mediation/LevelPlayInitListener;", "initializationListener", "", "c", "Lcom/ironsource/ns;", "sdkConfig", "Lcom/ironsource/ib;", "initDuration", "", "delay", "Lkotlin/Function0;", "successCallback", "Lcom/ironsource/fm;", "levelPlayConfig", "delayTimeAfterInitProcessInMS", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "", "Lcom/ironsource/ps;", "error", "b", "Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "key", "value", "Lcom/ironsource/xm;", "Lcom/ironsource/xm;", "tools", "Z", "ENABLE_STANDALONE_INIT", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wm f27608a = new wm();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final xm tools = new xm();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean ENABLE_STANDALONE_INIT = false;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/wm$a", "Lcom/ironsource/ts;", "Lcom/ironsource/ns;", "sdkConfig", "", "a", "Lcom/ironsource/ps;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f27611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f27612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ib f27613c;
        final /* synthetic */ LevelPlayInitListener d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
            this.f27611a = levelPlayInitRequest;
            this.f27612b = context;
            this.f27613c = ibVar;
            this.d = levelPlayInitListener;
        }

        @Override // com.p004ironsource.ts
        public void a(ns sdkConfig) {
            Intrinsics.f(sdkConfig, "sdkConfig");
            wm.tools.a(new K0(this.f27611a, sdkConfig, this.f27612b, this.f27613c, this.d, 0));
        }

        @Override // com.p004ironsource.ts
        public void a(ps error) {
            Intrinsics.f(error, "error");
            wm.tools.a(new J0(this.d, this.f27613c, error, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, ib initDuration, ps error) throws JSONException {
            Intrinsics.f(initDuration, "$initDuration");
            Intrinsics.f(error, "$error");
            wm.f27608a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, ns sdkConfig, Context context, ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            Intrinsics.f(initRequest, "$initRequest");
            Intrinsics.f(sdkConfig, "$sdkConfig");
            Intrinsics.f(context, "$context");
            Intrinsics.f(initDuration, "$initDuration");
            wm.f27608a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/wm$b", "Lcom/ironsource/ts;", "Lcom/ironsource/ns;", "sdkConfig", "", "a", "Lcom/ironsource/ps;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f27614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f27615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ib f27616c;
        final /* synthetic */ LevelPlayInitListener d;

        public b(LevelPlayInitRequest levelPlayInitRequest, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
            this.f27614a = levelPlayInitRequest;
            this.f27615b = context;
            this.f27616c = ibVar;
            this.d = levelPlayInitListener;
        }

        @Override // com.p004ironsource.ts
        public void a(ns sdkConfig) {
            Intrinsics.f(sdkConfig, "sdkConfig");
            wm.tools.a(new K0(this.f27614a, sdkConfig, this.f27615b, this.f27616c, this.d, 1));
        }

        @Override // com.p004ironsource.ts
        public void a(ps error) {
            Intrinsics.f(error, "error");
            wm.tools.a(new J0(this.d, this.f27616c, error, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, ib initDuration, ps error) throws JSONException {
            Intrinsics.f(initDuration, "$initDuration");
            Intrinsics.f(error, "$error");
            wm.f27608a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, ns sdkConfig, Context context, ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            Intrinsics.f(initRequest, "$initRequest");
            Intrinsics.f(sdkConfig, "$sdkConfig");
            Intrinsics.f(context, "$context");
            Intrinsics.f(initDuration, "$initDuration");
            wm.f27608a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fm f27617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ib f27618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27619c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fm fmVar, ib ibVar, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f27617a = fmVar;
            this.f27618b = ibVar;
            this.f27619c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() throws JSONException {
            wm.f27608a.a(this.f27617a, this.f27618b, this.f27619c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws JSONException {
            a();
            return Unit.f43263a;
        }
    }

    private wm() {
    }

    private final void c(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener initializationListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + initRequest.getAppKey() + ", userId: " + initRequest.getUserId() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        ib ibVar = new ib();
        xm xmVar = tools;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) initRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        vs vsVar = new vs(initRequest.getAppKey(), initRequest.getUserId(), ArraysKt.N(xmVar.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length))));
        vsVar.e().isEmpty();
        ct.f24585a.a(context, vsVar, new a(initRequest, context, ibVar, initializationListener));
    }

    private final void a(long delay, Function0<Unit> successCallback) {
        if (on.INSTANCE.d().t().getIsSDKInitialized() || delay <= 0) {
            successCallback.invoke();
        } else {
            tools.a(successCallback, delay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.f(context, "$context");
        Intrinsics.f(initRequest, "$initRequest");
        f27608a.c(context, initRequest, levelPlayInitListener);
    }

    public final void a(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener initializationListener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(initRequest, "initRequest");
        tools.d(new H0(context, initRequest, initializationListener, 22));
    }

    public final void b(LevelPlayImpressionDataListener listener) {
        Intrinsics.f(listener, "listener");
        p.j().a(new jm(listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(fm levelPlayConfig, ib initDuration, long delayTimeAfterInitProcessInMS, LevelPlayInitListener initializationListener) throws JSONException {
        on.INSTANCE.a().E().d();
        long jA = ib.a(initDuration);
        xm xmVar = tools;
        xmVar.a(jA, levelPlayConfig.f(), delayTimeAfterInitProcessInMS);
        xmVar.e(new H0(2, initializationListener, levelPlayConfig));
    }

    public final void b(LevelPlaySegment segment) {
        Intrinsics.f(segment, "segment");
        p.j().a(a(segment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ps error, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.f(error, "$error");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(error));
        }
    }

    public static /* synthetic */ void a(wm wmVar, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            levelPlayInitListener = null;
        }
        wmVar.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, fm levelPlayConfig) {
        Intrinsics.f(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitListener initializationListener, ib initDuration, ps error) throws JSONException {
        long jA = ib.a(initDuration);
        xm xmVar = tools;
        xmVar.a(error, jA);
        xmVar.e(new H0(1, error, initializationListener));
    }

    private final void a(LevelPlayInitRequest initRequest, fm levelPlayConfig) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(initRequest, adFormat) && levelPlayConfig.d().c().getRewardedVideoConfigurations() != null) {
            vr.Companion aVar = vr.INSTANCE;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            vr vrVarA = aVar.a(new e1(ad_unit, tf.f27296a.a(), "", null, null, null, 56, null), levelPlayConfig, true);
            List<bp> listC = levelPlayConfig.c(adFormat);
            c2.b bVar = c2.b.MEDIATION;
            new zq(new u2(new m1(ad_unit, bVar), vrVarA, bVar), adFormat, listC, vrVarA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(initRequest, adFormat2) && levelPlayConfig.d().c().getInterstitialConfigurations() != null) {
            sj.Companion aVar2 = sj.INSTANCE;
            IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
            sj sjVarA = aVar2.a(new e1(ad_unit2, tf.f27296a.a(), "", null, null, null, 56, null), levelPlayConfig, true);
            List<bp> listC2 = levelPlayConfig.c(adFormat2);
            c2.b bVar2 = c2.b.MEDIATION;
            new zq(new u2(new m1(ad_unit2, bVar2), sjVarA, bVar2), adFormat2, listC2, sjVarA).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(initRequest, adFormat3) || levelPlayConfig.d().c().getBannerConfigurations() == null) {
            return;
        }
        m6 m6VarA = m6.INSTANCE.a(new j6(), levelPlayConfig, true);
        List<bp> listC3 = levelPlayConfig.c(adFormat3);
        IronSource.AD_UNIT ad_unit3 = IronSource.AD_UNIT.BANNER;
        c2.b bVar3 = c2.b.MEDIATION;
        new zq(new u2(new m1(ad_unit3, bVar3), m6VarA, bVar3), adFormat3, listC3, m6VarA).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest initRequest, ns sdkConfig, Context context, ib initDuration, LevelPlayInitListener initializationListener) {
        on.Companion bVar = on.INSTANCE;
        ei.a aVarE = bVar.a().E();
        fm fmVar = new fm(sdkConfig);
        if (fmVar.k()) {
            tools.a(context);
        }
        hg.a aVarA = bVar.a().a();
        xm xmVar = tools;
        fmVar.b(xmVar).a(aVarA);
        fmVar.a(xmVar).a(bVar.a().w());
        fmVar.c(xmVar).a(bVar.a().B());
        wm wmVar = f27608a;
        wmVar.a(initRequest, fmVar);
        long jB = bVar.d().d().b();
        wmVar.a(jB, new c(fmVar, initDuration, jB, initializationListener));
        aVarE.a(fmVar);
        if (sdkConfig.a().getShouldRegisterTrigger()) {
            new gr(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    public final void a(LevelPlayImpressionDataListener listener) {
        Intrinsics.f(listener, "listener");
        p.j().b(new jm(listener));
    }

    public final void a(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        p.j().a(key, arrayList);
    }

    private final boolean a(LevelPlayInitRequest initRequest, LevelPlay.AdFormat adFormat) {
        return !initRequest.getLegacyAdFormats().contains(adFormat);
    }

    private final IronSourceSegment a(LevelPlaySegment segment) {
        IronSourceSegment ironSourceSegment = new IronSourceSegment();
        ironSourceSegment.setLevel(segment.getCom.applovin.sdk.AppLovinEventTypes.USER_COMPLETED_LEVEL java.lang.String());
        ironSourceSegment.setIAPTotal(segment.getIapTotal());
        ironSourceSegment.setIsPaying(segment.isPaying());
        ironSourceSegment.setUserCreationDate(segment.getUserCreationDate());
        ironSourceSegment.setSegmentName(segment.getSegmentName());
        Iterator<T> it = segment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ironSourceSegment.setCustom((String) pair.X, (String) pair.f43249Y);
        }
        return ironSourceSegment;
    }
}
