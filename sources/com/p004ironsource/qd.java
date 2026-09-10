package com.p004ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000b\u001aBq\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010/\u001a\u00020*\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\f\u0012(\b\u0002\u00104\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u000100j\u0004\u0018\u0001`1\u0012\b\b\u0002\u00107\u001a\u000205\u0012\b\b\u0002\u0010:\u001a\u000208¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0002J\u0012\u0010\u000b\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000b\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010/\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b\u000b\u0010.R4\u00104\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u000100j\u0004\u0018\u0001`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010JR\u0014\u0010N\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010MR\u0013\u0010Q\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\b2\u0010P¨\u0006U"}, d2 = {"Lcom/ironsource/qd;", "Lcom/ironsource/jd;", "Lcom/ironsource/tm;", "", f.j, "Lcom/ironsource/a0;", "data", "Lcom/ironsource/g0;", "adInstancePayload", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/id;", "a", "Lcom/ironsource/gx;", "factory", "Lcom/ironsource/fx;", "Lcom/ironsource/mx;", g.f40227p, h.f36614b, "Lcom/ironsource/qd$b;", "loadListener", "Landroid/app/Activity;", "activity", "Lcom/ironsource/qd$a;", "displayListener", "Lcom/ironsource/z;", m5.f25675p, "b", "fullscreenInstance", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "reward", "Lcom/ironsource/on;", "Lcom/ironsource/on;", "mediationServices", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", "adUnitTools", "Lcom/ironsource/u1;", "c", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/td;", "d", "Lcom/ironsource/td;", "()Lcom/ironsource/td;", "(Lcom/ironsource/td;)V", "fullscreenListener", "Lkotlin/Function3;", "Lcom/unity3d/mediation/internal/ads/controllers/adunits/FullscreenAdInstanceFactory;", "e", "Lkotlin/jvm/functions/Function3;", "fullscreenAdInstanceFactory", "Lcom/ironsource/zu;", "Lcom/ironsource/zu;", "taskScheduler", "Lcom/ironsource/s9;", "Lcom/ironsource/s9;", "currentTimeProvider", "Lcom/ironsource/qd$b;", i.f37957c, "Lcom/ironsource/qd$a;", "j", "Lcom/ironsource/fx;", com.p004ironsource.mediationsdk.d.f25770h, "Lcom/ironsource/zu$a;", "k", "Lcom/ironsource/zu$a;", "expirationScheduledTask", "", "l", "Ljava/lang/Long;", d9.h.y0, "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "()Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "", "()Ljava/lang/String;", "currentPlacementName", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "()Lcom/unity3d/mediation/LevelPlayAdInfo;", "loadedAdInfo", "waterfallFactory", "<init>", "(Lcom/ironsource/on;Lcom/ironsource/u2;Lcom/ironsource/u1;Lcom/ironsource/td;Lcom/ironsource/gx;Lkotlin/jvm/functions/Function3;Lcom/ironsource/zu;Lcom/ironsource/s9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qd implements jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final on mediationServices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 adUnitTools;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private td fullscreenListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function3<C3344a0, C3357g0, jd, id> fullscreenAdInstanceFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final zu taskScheduler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b loadListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private a displayListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final fx waterfall;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private zu.a expirationScheduledTask;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Long loadStartTime;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/qd$a;", "", "Lcom/ironsource/qd;", "adUnit", "", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(qd adUnit, IronSourceError error);

        void b(qd adUnit);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/qd$b;", "", "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(qd adUnit);

        void a(qd adUnit, LevelPlayAdInfo adInfo);

        void b(qd adUnit, IronSourceError error);

        void b(qd adUnit, LevelPlayAdInfo adInfo);
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ironsource/qd$c", "Lcom/ironsource/mx;", "Lcom/ironsource/z;", m5.f25675p, "", "b", "", "errorCode", "", "errorReason", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements mx {
        public c() {
        }

        @Override // com.p004ironsource.mx
        public void a(int errorCode, String errorReason) {
            Long lValueOf;
            Intrinsics.f(errorReason, "errorReason");
            Long l2 = qd.this.loadStartTime;
            if (l2 != null) {
                lValueOf = Long.valueOf(qd.this.currentTimeProvider.a() - l2.longValue());
            } else {
                lValueOf = null;
            }
            qd.this.adUnitTools.getEventSender().getLoad().a(lValueOf != null ? lValueOf.longValue() : 0L, errorCode, errorReason, qd.this.adUnitData.getIsPublisherLoad());
            b bVar = qd.this.loadListener;
            if (bVar != null) {
                bVar.b(qd.this, new IronSourceError(errorCode, errorReason));
            }
        }

        @Override // com.p004ironsource.mx
        public void b(AbstractC3389z instance) {
            Long lValueOf;
            Intrinsics.f(instance, "instance");
            Long l2 = qd.this.loadStartTime;
            if (l2 != null) {
                lValueOf = Long.valueOf(qd.this.currentTimeProvider.a() - l2.longValue());
            } else {
                lValueOf = null;
            }
            qd.this.adUnitTools.getEventSender().getLoad().a(lValueOf != null ? lValueOf.longValue() : 0L, qd.this.adUnitData.getIsPublisherLoad());
            qd.this.g();
            b bVar = qd.this.loadListener;
            if (bVar != null) {
                bVar.b(qd.this, instance.e());
            }
        }

        @Override // com.p004ironsource.mx
        public void a(AbstractC3389z instance) {
            Intrinsics.f(instance, "instance");
            qd.this.adUnitTools.getEventSender().getAdInteraction().e(qd.this.c());
            qd.this.g();
            b bVar = qd.this.loadListener;
            if (bVar != null) {
                bVar.a(qd.this, instance.e());
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function3<C3344a0, C3357g0, jd, id> {
        public d(Object obj) {
            super(3, obj, qd.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id invoke(C3344a0 p0, C3357g0 p1, jd p2) {
            Intrinsics.f(p0, "p0");
            Intrinsics.f(p1, "p1");
            Intrinsics.f(p2, "p2");
            return ((qd) this.receiver).a(p0, p1, p2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qd(on mediationServices, u2 adUnitTools, u1 adUnitData, td fullscreenListener, gx gxVar, Function3<? super C3344a0, ? super C3357g0, ? super jd, id> function3, zu taskScheduler, s9 currentTimeProvider) {
        Intrinsics.f(mediationServices, "mediationServices");
        Intrinsics.f(adUnitTools, "adUnitTools");
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(fullscreenListener, "fullscreenListener");
        Intrinsics.f(taskScheduler, "taskScheduler");
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        this.mediationServices = mediationServices;
        this.adUnitTools = adUnitTools;
        this.adUnitData = adUnitData;
        this.fullscreenListener = fullscreenListener;
        this.fullscreenAdInstanceFactory = function3;
        this.taskScheduler = taskScheduler;
        this.currentTimeProvider = currentTimeProvider;
        this.waterfall = a(gxVar);
    }

    private final fx a(gx factory) {
        mx mxVarA = a();
        return factory != null ? factory.a(mxVarA) : new fx(this.adUnitTools, this.adUnitData, mxVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.adUnitData.l();
    }

    private final tm<Unit> f() {
        if (!this.waterfall.d()) {
            return new tm.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.mediationServices.y().a(c(), b()).d()) {
            return new tm.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, android.support.v4.media.a.r(new StringBuilder("placement "), c(), " is capped")));
        }
        if (!this.mediationServices.u().a(this.adUnitData.getAdProperties().getAdUnitId()).d()) {
            return new tm.b(Unit.f43263a);
        }
        return new tm.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.adUnitData.getAdProperties().getAdUnitId() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        zu.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.adUnitTools.b(b());
        zu zuVar = this.taskScheduler;
        D d2 = new D(this, 8);
        Duration.Companion companion = Duration.f44719Y;
        this.expirationScheduledTask = zuVar.a(d2, DurationKt.h(jB, DurationUnit.MILLISECONDS));
    }

    private final void h() {
        String strC = c();
        if (strC.length() > 0) {
            this.mediationServices.a().b(strC, b());
            n8 n8VarA = this.mediationServices.y().a(strC, b());
            if (n8VarA.d()) {
                this.adUnitTools.getEventSender().getAdInteraction().b(strC, n8VarA.e());
            }
        }
    }

    public /* synthetic */ qd(on onVar, u2 u2Var, u1 u1Var, td tdVar, gx gxVar, Function3 function3, zu zuVar, s9 s9Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(onVar, u2Var, u1Var, tdVar, (i2 & 16) != 0 ? null : gxVar, (i2 & 32) != 0 ? null : function3, (i2 & 64) != 0 ? new te(Handler.a(u2Var.a())) : zuVar, (i2 & 128) != 0 ? new s9.a() : s9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final id a(C3344a0 data, C3357g0 adInstancePayload, jd listener) {
        return new id(new u2(this.adUnitTools, c2.b.PROVIDER), data, adInstancePayload, listener);
    }

    private final LevelPlay.AdFormat b() {
        return this.adUnitData.getAdProperties().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(qd this$0) {
        Intrinsics.f(this$0, "this$0");
        b bVar = this$0.loadListener;
        if (bVar != null) {
            bVar.a(this$0);
        }
        this$0.waterfall.b();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final td getFullscreenListener() {
        return this.fullscreenListener;
    }

    public final LevelPlayAdInfo e() {
        AbstractC3389z abstractC3389zC = this.waterfall.c();
        if (abstractC3389zC != null) {
            return abstractC3389zC.e();
        }
        return null;
    }

    @Override // com.p004ironsource.jd
    public void b(id fullscreenInstance) {
        Intrinsics.f(fullscreenInstance, "fullscreenInstance");
        this.adUnitTools.getEventSender().getAdInteraction().b(c());
        this.fullscreenListener.onClosed();
    }

    private final mx a() {
        return new c();
    }

    @Override // com.p004ironsource.InterfaceC3350d0
    public void b(AbstractC3389z instance) {
        Intrinsics.f(instance, "instance");
        this.waterfall.b(instance);
        this.adUnitTools.getEventSender().getAdInteraction().g(c());
        this.mediationServices.e().b(com.unity3d.mediation.a.a(b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3389z a(qd this$0, C3344a0 instanceData, C3357g0 adInstancePayload) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(instanceData, "instanceData");
        Intrinsics.f(adInstancePayload, "adInstancePayload");
        Function3 dVar = this$0.fullscreenAdInstanceFactory;
        if (dVar == null) {
            dVar = new d(this$0);
        }
        return (AbstractC3389z) dVar.invoke(instanceData, adInstancePayload, this$0);
    }

    public final void a(Activity activity, a displayListener) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m1.a(this.adUnitTools, (String) null, (String) null, 3, (Object) null));
        this.displayListener = displayListener;
        this.adUnitTools.getEventSender().getAdInteraction().a(activity, c());
        tm<Unit> tmVarF = f();
        if (tmVarF instanceof tm.a) {
            IronSourceError ironSourceErrorB = ((tm.a) tmVarF).b();
            ironLog.verbose(m1.a(this.adUnitTools, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.adUnitTools.getEventSender().getAdInteraction().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), "");
            displayListener.a(this, ironSourceErrorB);
            return;
        }
        zu.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        this.waterfall.a(new kd(activity));
    }

    @Override // com.p004ironsource.jd
    public void a(id fullscreenInstance) {
        Intrinsics.f(fullscreenInstance, "fullscreenInstance");
        this.adUnitTools.getEventSender().getAdInteraction().l(c());
        a aVar = this.displayListener;
        if (aVar != null) {
            aVar.b(this);
        }
        h();
        this.mediationServices.w().b(this.adUnitData.getAdProperties().getAdUnitId());
    }

    @Override // com.p004ironsource.jd
    public void a(id fullscreenInstance, IronSourceError error) {
        Intrinsics.f(fullscreenInstance, "fullscreenInstance");
        Intrinsics.f(error, "error");
        IronLog.INTERNAL.verbose(m1.a(this.adUnitTools, error.toString(), (String) null, 2, (Object) null));
        this.adUnitTools.getEventSender().getAdInteraction().a(c(), error.getErrorCode(), error.getErrorMessage(), "");
        a aVar = this.displayListener;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    @Override // com.p004ironsource.jd
    public void a(id fullscreenInstance, LevelPlayReward reward) {
        Intrinsics.f(fullscreenInstance, "fullscreenInstance");
        Intrinsics.f(reward, "reward");
        IronLog.INTERNAL.verbose(m1.a(this.adUnitTools, fullscreenInstance.getInstanceSignature(), (String) null, 2, (Object) null));
        this.fullscreenListener.a(reward);
    }

    public final void a(b loadListener) {
        Intrinsics.f(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(m1.a(this.adUnitTools, (String) null, (String) null, 3, (Object) null));
        this.loadListener = loadListener;
        this.loadStartTime = Long.valueOf(this.currentTimeProvider.a());
        this.adUnitTools.a(new p1(this.adUnitData.getAdProperties()));
        O o = new O(this, 3);
        this.adUnitTools.getEventSender().getLoad().a(this.adUnitData.getIsPublisherLoad());
        this.waterfall.a(o);
    }

    public final void a(td tdVar) {
        Intrinsics.f(tdVar, "<set-?>");
        this.fullscreenListener = tdVar;
    }

    @Override // com.p004ironsource.InterfaceC3350d0
    public void a(AbstractC3389z instance) {
        Intrinsics.f(instance, "instance");
        this.adUnitTools.getEventSender().getAdInteraction().a(c());
        this.fullscreenListener.h();
    }
}
