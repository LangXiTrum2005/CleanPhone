package com.p004ironsource;

import A.RunnableC0916x;
import A.t0;
import android.app.Activity;
import com.applovin.impl.H0;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.a;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0003\b\u001a\u0005BQ\u0012\u0006\u0010+\u001a\u00020'\u0012\u0006\u0010/\u001a\u00020\r\u0012\u0006\u00104\u001a\u000200\u0012\u0006\u0010:\u001a\u000205\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010C\u001a\u00020>\u0012\b\b\u0002\u0010H\u001a\u00020D\u0012\u0006\u0010M\u001a\u00020I\u0012\u0006\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\b\u0010 J#\u0010\b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\b\u0010#J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\b\u0010$J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\rH\u0000¢\u0006\u0004\b\b\u0010&R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010/\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010.R\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010<R\u001a\u0010C\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010H\u001a\u00020D8\u0006¢\u0006\f\n\u0004\b8\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010M\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bA\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010P\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010N\u001a\u0004\b6\u0010OR$\u0010V\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010R\u001a\u0004\bS\u0010T\"\u0004\b\b\u0010UR\u001a\u0010Z\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010X\u001a\u0004\b?\u0010YR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010]¨\u0006c"}, d2 = {"Lcom/ironsource/hm;", "Lcom/ironsource/gd;", "", "q", "Lcom/ironsource/ed;", "c", "Lcom/ironsource/pd;", "state", "a", "(Lcom/ironsource/pd;)V", "o", "Landroid/app/Activity;", "activity", "", "placementName", "", dc.q, "p", "Lcom/ironsource/hd$a;", "status", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", sv.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", sv.f27214b, "b", sv.g, sv.f, "onAdInfoChanged", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "reward", "(Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "", "duration", "(Lcom/unity3d/mediation/LevelPlayAdError;J)V", "(Lcom/unity3d/mediation/LevelPlayAdError;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", PglCryptUtils.KEY_MESSAGE, "(Ljava/lang/String;)V", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "e", "()Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "Ljava/lang/String;", i.f37957c, "()Ljava/lang/String;", "adUnitId", "Lcom/ironsource/hm$b;", "Lcom/ironsource/hm$b;", "j", "()Lcom/ironsource/hm$b;", com.smartdigimkt.q0.b.i0, "Lcom/ironsource/m1;", "d", "Lcom/ironsource/m1;", g.f40227p, "()Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/fd;", "Lcom/ironsource/fd;", "fullscreenAdControllerFactory", "Lcom/ironsource/v1;", f.j, "Lcom/ironsource/v1;", h.f36614b, "()Lcom/ironsource/v1;", "adUnitDataFactory", "Lcom/ironsource/fg;", "Lcom/ironsource/fg;", "m", "()Lcom/ironsource/fg;", "mediationServicesProvider", "Lcom/ironsource/s9;", "Lcom/ironsource/s9;", "k", "()Lcom/ironsource/s9;", "currentTimeProvider", "Lkotlin/Lazy;", "()Lcom/ironsource/ed;", "adController", "Lcom/ironsource/im;", "Lcom/ironsource/im;", "l", "()Lcom/ironsource/im;", "(Lcom/ironsource/im;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/UUID;", "Ljava/util/UUID;", "()Ljava/util/UUID;", com.ironsource.sdk.controller.f.b.AD_ID, "Lcom/ironsource/pd;", "Lcom/ironsource/ib;", "Lcom/ironsource/ib;", "loadDuration", "Lcom/ironsource/tf;", "idFactory", "<init>", "(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;Lcom/ironsource/hm$b;Lcom/ironsource/m1;Lcom/ironsource/fd;Lcom/ironsource/v1;Lcom/ironsource/fg;Lcom/ironsource/s9;Lcom/ironsource/tf;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class hm implements gd {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String o = "Fullscreen Ad Internal";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LevelPlay.AdFormat adFormat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fd fullscreenAdControllerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final v1 adUnitDataFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final fg mediationServicesProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy adController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private im listener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final UUID adId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private pd state;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private ib loadDuration;

    /* JADX INFO: renamed from: com.ironsource.hm$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ironsource/hm$a;", "", "", "placementName", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final boolean a(String placementName, LevelPlay.AdFormat adFormat) {
            Intrinsics.f(placementName, "placementName");
            Intrinsics.f(adFormat, "adFormat");
            m1 m1VarA = m1.a.a(a.a(adFormat), c2.b.MEDIATION);
            if (!m1VarA.g()) {
                m1VarA.getEventSender().getAdInteraction().a(placementName, "SDK is not initialized", false);
                return false;
            }
            n8 n8VarA = on.INSTANCE.d().y().a(placementName, adFormat);
            boolean zD = n8VarA.d();
            m1VarA.getEventSender().getAdInteraction().a(placementName, n8VarA.e(), zD);
            return zD;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/hm$b;", "", "", "getBidFloor", "()Ljava/lang/Double;", "bidFloor", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        Double getBidFloor();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\r\u0010\u001e¨\u0006\""}, d2 = {"Lcom/ironsource/hm$c;", "", "Lcom/ironsource/m1;", "a", "Lcom/ironsource/m1;", "b", "()Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/fd;", "Lcom/ironsource/fd;", "()Lcom/ironsource/fd;", "adControllerFactory", "Lcom/ironsource/fg;", "c", "Lcom/ironsource/fg;", f.j, "()Lcom/ironsource/fg;", IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/s9;", "d", "Lcom/ironsource/s9;", "()Lcom/ironsource/s9;", "currentTimeProvider", "Lcom/ironsource/tf;", "e", "Lcom/ironsource/tf;", "()Lcom/ironsource/tf;", "idFactory", "Lcom/ironsource/hm$b;", "Lcom/ironsource/hm$b;", "()Lcom/ironsource/hm$b;", com.smartdigimkt.q0.b.i0, "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/fd;Lcom/ironsource/fg;Lcom/ironsource/s9;Lcom/ironsource/tf;Lcom/ironsource/hm$b;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m1 adTools;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final fd adControllerFactory;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final fg provider;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final s9 currentTimeProvider;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final tf idFactory;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final b config;

        public c(m1 adTools, fd adControllerFactory, fg provider, s9 currentTimeProvider, tf idFactory, b config) {
            Intrinsics.f(adTools, "adTools");
            Intrinsics.f(adControllerFactory, "adControllerFactory");
            Intrinsics.f(provider, "provider");
            Intrinsics.f(currentTimeProvider, "currentTimeProvider");
            Intrinsics.f(idFactory, "idFactory");
            Intrinsics.f(config, "config");
            this.adTools = adTools;
            this.adControllerFactory = adControllerFactory;
            this.provider = provider;
            this.currentTimeProvider = currentTimeProvider;
            this.idFactory = idFactory;
            this.config = config;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fd getAdControllerFactory() {
            return this.adControllerFactory;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m1 getAdTools() {
            return this.adTools;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final s9 getCurrentTimeProvider() {
            return this.currentTimeProvider;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final tf getIdFactory() {
            return this.idFactory;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final fg getProvider() {
            return this.provider;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ed;", "a", "()Lcom/ironsource/ed;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function0<ed> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ed invoke() {
            return hm.this.c();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/ironsource/hm$e", "Lcom/ironsource/rd;", "", "isPublisherLoad", "Lcom/ironsource/td;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/qd;", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements rd {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1 f25268b;

        public e(e1 e1Var) {
            this.f25268b = e1Var;
        }

        @Override // com.p004ironsource.rd
        public qd a(boolean isPublisherLoad, td listener) {
            Intrinsics.f(listener, "listener");
            u1 u1VarA = hm.this.getAdUnitDataFactory().a(isPublisherLoad, this.f25268b);
            return new qd(on.INSTANCE.c(), new u2(hm.this.getAdTools(), u1VarA, c2.b.MEDIATION), u1VarA, listener, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        }
    }

    public hm(LevelPlay.AdFormat adFormat, String adUnitId, b config, m1 adTools, fd fullscreenAdControllerFactory, v1 adUnitDataFactory, fg mediationServicesProvider, s9 currentTimeProvider, tf idFactory) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adUnitId, "adUnitId");
        Intrinsics.f(config, "config");
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.f(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.f(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        Intrinsics.f(idFactory, "idFactory");
        this.adFormat = adFormat;
        this.adUnitId = adUnitId;
        this.config = config;
        this.adTools = adTools;
        this.fullscreenAdControllerFactory = fullscreenAdControllerFactory;
        this.adUnitDataFactory = adUnitDataFactory;
        this.mediationServicesProvider = mediationServicesProvider;
        this.currentTimeProvider = currentTimeProvider;
        this.adController = LazyKt.b(new d());
        UUID uuidA = idFactory.a();
        this.adId = uuidA;
        this.state = new hd(this, null, 2, 0 == true ? 1 : 0);
        adTools.getEventSender().a(new C3372n(a.a(adFormat), uuidA, adUnitId));
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed c() {
        Placement placement = null;
        e1 e1Var = new e1(a.a(this.adFormat), this.adId, this.adUnitId, placement, this.mediationServicesProvider.o().getTestSuiteLoadAdConfigInternal(), this.config.getBidFloor(), 8, null);
        e eVar = new e(e1Var);
        bc eventSender = this.adTools.getEventSender();
        m1 m1Var = this.adTools;
        eventSender.a(new a2(m1Var, e1Var, m1Var.b(this.adFormat, this.adUnitId).b().getDescription()));
        return this.fullscreenAdControllerFactory.a(this, this.adTools, e1Var, eVar);
    }

    public final ed d() {
        return (ed) this.adController.getX();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LevelPlay.AdFormat getAdFormat() {
        return this.adFormat;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final UUID getAdId() {
        return this.adId;
    }

    @Override // com.p004ironsource.gd
    public void onAdClicked() {
        this.adTools.d(new M(this, 0));
    }

    @Override // com.p004ironsource.gd
    public void onAdClosed() {
        this.adTools.d(new M(this, 4));
    }

    @Override // com.p004ironsource.gd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.d(new N(this, adInfo, 0));
    }

    @Override // com.p004ironsource.gd
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adTools.d(new L(this, error, 3));
    }

    @Override // com.p004ironsource.gd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adTools.d(new N(this, adInfo, 1));
    }

    public /* synthetic */ hm(LevelPlay.AdFormat adFormat, String str, b bVar, m1 m1Var, fd fdVar, v1 v1Var, fg fgVar, s9 s9Var, tf tfVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, m1Var, fdVar, v1Var, (i2 & 64) != 0 ? on.INSTANCE.d() : fgVar, s9Var, tfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hm this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.state.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(hm this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.state.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(hm this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.state.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(hm this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.state.a();
    }

    private final void q() {
        Double bidFloor = this.config.getBidFloor();
        if (bidFloor != null) {
            this.adTools.getEventSender().getOperational().a(bidFloor.doubleValue());
        }
    }

    @Override // com.p004ironsource.gd
    public void a() {
        this.adTools.d(new M(this, 3));
    }

    @Override // com.p004ironsource.gd
    public void b() {
        this.adTools.d(new M(this, 1));
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m1 getAdTools() {
        return this.adTools;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final v1 getAdUnitDataFactory() {
        return this.adUnitDataFactory;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final s9 getCurrentTimeProvider() {
        return this.currentTimeProvider;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final im getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final fg getMediationServicesProvider() {
        return this.mediationServicesProvider;
    }

    public final boolean n() {
        h1 h1VarD = this.state.d();
        this.adTools.getEventSender().getLoad().a(Boolean.valueOf(h1VarD.getIsReady()), h1VarD instanceof h1.a ? ((h1.a) h1VarD).c() : null);
        return h1VarD.getIsReady();
    }

    public final void o() {
        this.loadDuration = new ib();
        this.adTools.d(new M(this, 2));
    }

    public final void p() {
        a(new md(this, this.currentTimeProvider));
        d().o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, hm this$0, String str) {
        Intrinsics.f(activity, "$activity");
        Intrinsics.f(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.adTools.getEventSender().getTroubleshoot().d();
        this$0.state.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hm this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.adTools.getEventSender().getOperational().a();
        this$0.state.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hm this$0, LevelPlayAdError error) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(error, "$error");
        this$0.state.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hm this$0, LevelPlayAdError error) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(error, "$error");
        this$0.state.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hm this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInfo, "$adInfo");
        this$0.state.onAdLoaded(adInfo);
    }

    public final void a(Activity activity, String placementName) {
        Intrinsics.f(activity, "activity");
        this.adTools.d(new H0(activity, this, placementName, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hm this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInfo, "$adInfo");
        this$0.state.onAdInfoChanged(adInfo);
    }

    public final void a(hd.a status) {
        Intrinsics.f(status, "status");
        this.state = new hd(this, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm this$0, long j) {
        Intrinsics.f(this$0, "this$0");
        this$0.adTools.getEventSender().getOperational().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm this$0, long j, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        Intrinsics.f(this$0, "this$0");
        xp xpVarF = this$0.adTools.getEventSender().getOperational();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        xpVarF.a(j, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm this$0, LevelPlayAdError error) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(error, "$error");
        this$0.adTools.getEventSender().getTroubleshoot().a(error);
    }

    public static /* synthetic */ void a(hm hmVar, LevelPlayAdError levelPlayAdError, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        hmVar.a(levelPlayAdError, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(error, "$error");
        Intrinsics.f(adInfo, "$adInfo");
        im imVar = this$0.listener;
        if (imVar != null) {
            imVar.onAdDisplayFailed(error, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInfo, "$adInfo");
        im imVar = this$0.listener;
        if (imVar != null) {
            imVar.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hm this$0, LevelPlayReward reward) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(reward, "$reward");
        im imVar = this$0.listener;
        if (imVar != null) {
            imVar.onAdRewarded(reward, this$0.state.getAdInfo());
        }
    }

    public final void a(im imVar) {
        this.listener = imVar;
    }

    public final void a(pd state) {
        Intrinsics.f(state, "state");
        this.state = state;
    }

    @Override // com.p004ironsource.gd
    public void a(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adTools.d(new L(this, error, 2));
    }

    public final void a(LevelPlayAdError error, long duration) {
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "onAdLoadFailed error: " + error, (String) null, 2, (Object) null));
        this.adTools.d(new t0(this, duration, error));
        this.adTools.e(new L(this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, hm this$0) {
        im imVar;
        Intrinsics.f(this$0, "this$0");
        if (levelPlayAdError == null || (imVar = this$0.listener) == null) {
            return;
        }
        imVar.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.f(error, "error");
        Intrinsics.f(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.adTools.d(new L(this, error, 0));
        this.adTools.e(new H0(this, error, adInfo, 17));
    }

    public final void a(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.adTools.d(new RunnableC0916x(this, ib.a(this.loadDuration), 3));
        this.adTools.e(new N(this, adInfo, 2));
    }

    @Override // com.p004ironsource.gd
    public void a(LevelPlayReward reward) {
        Intrinsics.f(reward, "reward");
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "onAdRewarded adInfo: " + this.state.getAdInfo() + " reward: " + reward, (String) null, 2, (Object) null));
        this.adTools.e(new G0(11, this, reward));
    }

    public final void a(String message) {
        Intrinsics.f(message, "message");
        this.adTools.getEventSender().getTroubleshoot().f("Fullscreen Ad Internal - ".concat(message));
    }
}
