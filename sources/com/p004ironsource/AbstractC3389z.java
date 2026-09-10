package com.p004ironsource;

import A.RunnableC0914v;
import com.applovin.impl.sdk.y;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Ç\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u00108\u001a\u000204\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010(\u001a\u00020@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001a\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u000f\u0010\u0006\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0004J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010&\u001a\u00020 J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'J\b\u0010)\u001a\u00020\u0007H\u0016J\u000f\u0010*\u001a\u00020\u0007H\u0010¢\u0006\u0004\b*\u0010+J\b\u0010,\u001a\u00020\u0007H$J\u0014\u0010\u0006\u001a\u00020\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0012H\u0004J\b\u0010.\u001a\u00020\u0007H\u0016J \u0010/\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\u001a\u00103\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010=R$\u0010(\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010@0@0?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010DR!\u0010I\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010V\u001a\u00020 2\u0006\u0010Q\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR$\u0010Y\u001a\u00020 2\u0006\u0010Q\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR$\u0010\\\u001a\u00020 2\u0006\u0010Q\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR$\u0010_\u001a\u00020 2\u0006\u0010Q\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010S\u001a\u0004\b^\u0010UR\u001a\u0010c\u001a\u00020`8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010a\u001a\u0004\bR\u0010bR\u0017\u0010h\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bN\u0010gR\u0019\u0010j\u001a\u0004\u0018\u00010d8\u0006¢\u0006\f\n\u0004\bi\u0010f\u001a\u0004\b]\u0010gR\u0017\u0010m\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bk\u0010S\u001a\u0004\bl\u0010UR\u0017\u0010q\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bi\u0010pR\u0017\u0010u\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bn\u0010tR\u0017\u0010w\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bv\u0010o\u001a\u0004\bk\u0010pR\u0017\u0010{\u001a\u00020x8\u0006¢\u0006\f\n\u0004\bl\u0010y\u001a\u0004\bB\u0010zR\u0017\u0010|\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b^\u0010s\u001a\u0004\bv\u0010tR\u0017\u0010\u001d\u001a\u00020}8\u0006¢\u0006\f\n\u0004\bX\u0010~\u001a\u0004\br\u0010\u007fR\u0015\u0010\u0080\u0001\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010tR\u0015\u0010\u0081\u0001\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010pR\u0019\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u00018DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bW\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/ironsource/z;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NetworkInitializationListener;", "Lcom/ironsource/a0;", "instanceData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "a", "", "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "A", "com/ironsource/z$a", "()Lcom/ironsource/z$a;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "E", "", "errorCode", "", "errorMessage", "C", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdapterErrorType;", "adapterErrorType", "D", "B", "errorType", "", "duration", "Lcom/ironsource/o1$a;", "performance", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "e", "", "y", "Lcom/ironsource/i0;", "adInstancePresenter", "Ljava/lang/Runnable;", "callback", "status", "Lcom/ironsource/e0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "c", "()V", "z", PglCryptUtils.KEY_MESSAGE, "onAdLoadSuccess", sv.f27214b, sv.f27215c, sv.f, "onInitSuccess", "onInitFailed", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", f.j, "()Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/a0;", "m", "()Lcom/ironsource/a0;", "Lcom/ironsource/g0;", "Lcom/ironsource/g0;", "adInstancePayload", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/d0;", "kotlin.jvm.PlatformType", "d", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/e0;", "loadListener", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", g.f40227p, "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", ne.E1, "Lcom/ironsource/ib;", "Lcom/ironsource/ib;", "loadDuration", "Lcom/ironsource/ks;", h.f36614b, "Lcom/ironsource/ks;", "timeoutRunnable", "<set-?>", i.f37957c, "Z", "w", "()Z", "isInstanceLoading", "j", "v", "isInstanceLoaded", "k", "x", "isInstanceOpened", "l", "u", "isInstanceFailed", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "currentAdData", "Lcom/ironsource/m5;", dc.q, "Lcom/ironsource/m5;", "()Lcom/ironsource/m5;", "auctionResponseItem", "o", "genericNotifications", "p", "t", "isBidder", "q", "Ljava/lang/String;", "()Ljava/lang/String;", "instanceName", "r", "I", "()I", "instanceType", "s", "instanceSignature", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "sessionDepth", "Lcom/ironsource/h0;", "Lcom/ironsource/h0;", "()Lcom/ironsource/h0;", "instanceLoadTimeoutInSeconds", "currentPlacementName", "Lcom/ironsource/mediationsdk/model/Placement;", "()Lcom/ironsource/mediationsdk/model/Placement;", "currentPlacement", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/a0;Lcom/ironsource/g0;Lcom/ironsource/d0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class AbstractC3389z implements AdapterAdListener, NetworkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C3344a0 instanceData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C3357g0 adInstancePayload;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private WeakReference<InterfaceC3350d0> listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3352e0 loadListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final BaseAdAdapter<?, ?> adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ib loadDuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ks timeoutRunnable;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isInstanceLoading;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isInstanceLoaded;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isInstanceOpened;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isInstanceFailed;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AdData currentAdData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final m5 auctionResponseItem;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final m5 genericNotifications;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isBidder;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final String instanceName;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int instanceType;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String instanceSignature;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int sessionDepth;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final C3359h0 performance;

    /* JADX INFO: renamed from: com.ironsource.z$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/z$a", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ks {
        public a() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            long jA = ib.a(AbstractC3389z.this.loadDuration);
            IronLog ironLog = IronLog.INTERNAL;
            AbstractC3389z abstractC3389z = AbstractC3389z.this;
            StringBuilder sbV = android.support.v4.media.a.v(jA, "Load duration = ", ", isBidder = ");
            sbV.append(AbstractC3389z.this.getIsBidder());
            ironLog.verbose(abstractC3389z.a(sbV.toString()));
            AbstractC3389z.this.isInstanceFailed = true;
            AbstractC3389z.this.getAdTools().getEventSender().getLoad().a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
            AbstractC3389z.this.getAdTools().getEventSender().getLoad().a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
            AbstractC3389z abstractC3389z2 = AbstractC3389z.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.e(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            abstractC3389z2.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public AbstractC3389z(u2 adTools, C3344a0 instanceData, C3357g0 adInstancePayload, InterfaceC3350d0 listener) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(instanceData, "instanceData");
        Intrinsics.f(adInstancePayload, "adInstancePayload");
        Intrinsics.f(listener, "listener");
        this.adTools = adTools;
        this.instanceData = instanceData;
        this.adInstancePayload = adInstancePayload;
        this.listener = new WeakReference<>(listener);
        this.currentAdData = instanceData.getAdData();
        this.auctionResponseItem = instanceData.n();
        this.genericNotifications = instanceData.getGenericNotifications();
        this.isBidder = instanceData.j().j();
        this.instanceName = instanceData.getInstanceName();
        this.instanceType = instanceData.getInstanceType();
        this.instanceSignature = instanceData.getSignature();
        this.adFormat = instanceData.getAdFormat();
        this.sessionDepth = instanceData.v();
        this.performance = instanceData.getPerformance();
        BaseAdAdapter<?, ?> baseAdAdapterA = a(instanceData);
        this.adapter = baseAdAdapterA;
        adTools.getEventSender().a(new C3346b0(adTools, instanceData, baseAdAdapterA));
        adTools.getEventSender().a(new t4(instanceData.k()));
    }

    private final void A() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            F();
            z();
        } catch (Throwable th) {
            String strO = androidx.datastore.preferences.protobuf.a.o(th, com.google.firebase.crashlytics.internal.model.a.p("unexpected error while calling adapter.loadAd() - ", th));
            IronLog.INTERNAL.error(a(strO));
            this.adTools.getEventSender().getTroubleshoot().g(strO);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, strO);
        }
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.adTools.getEventSender().getAdInteraction().a(k());
        InterfaceC3350d0 interfaceC3350d0 = this.listener.get();
        if (interfaceC3350d0 != null) {
            interfaceC3350d0.a(this);
        }
    }

    private final void C() {
        lw lwVarH;
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        G();
        if (this.isInstanceFailed) {
            c();
            lwVarH = this.adTools.getEventSender().getTroubleshoot();
            str = "instance load success after it was already failed";
        } else {
            if (!this.isInstanceLoaded) {
                this.isInstanceLoaded = true;
                long jA = ib.a(this.loadDuration);
                ironLog.verbose(a("Load duration = " + jA));
                this.adTools.getEventSender().getLoad().a(jA, false);
                a(o1.a.LoadedSuccessfully);
                InterfaceC3352e0 interfaceC3352e0 = this.loadListener;
                if (interfaceC3352e0 != null) {
                    interfaceC3352e0.a(this);
                    return;
                } else {
                    Intrinsics.m("loadListener");
                    throw null;
                }
            }
            lwVarH = this.adTools.getEventSender().getTroubleshoot();
            str = "instance load success after it was already loaded";
        }
        lwVarH.f(str);
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.isInstanceOpened) {
            this.adTools.getEventSender().getTroubleshoot().f("instance opened after it was already opened");
            return;
        }
        this.isInstanceOpened = true;
        this.adTools.getEventSender().getAdInteraction().g(k());
        a(o1.a.ShowedSuccessfully);
        InterfaceC3350d0 interfaceC3350d0 = this.listener.get();
        if (interfaceC3350d0 != null) {
            interfaceC3350d0.b(this);
        }
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        G();
        if (this.isInstanceFailed) {
            return;
        }
        A();
    }

    private final void F() {
        G();
        a aVarA = a();
        this.timeoutRunnable = aVarA;
        if (aVarA != null) {
            this.adTools.a((ks) aVarA, TimeUnit.SECONDS.toMillis(n()));
        }
    }

    private final void G() {
        ks ksVar = this.timeoutRunnable;
        if (ksVar != null) {
            this.adTools.b(ksVar);
            this.timeoutRunnable = null;
        }
    }

    private final int n() {
        Integer numF = this.instanceData.n().f();
        return (numF == null || numF.intValue() <= 0) ? this.instanceData.i().getInstanceLoadTimeout() : numF.intValue();
    }

    public abstract void a(InterfaceC3361i0 adInstancePresenter);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        G();
        this.adTools.getEventSender().getLoad().a(this.sessionDepth);
    }

    public void c() {
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final IronSource.AD_UNIT getAdFormat() {
        return this.adFormat;
    }

    public LevelPlayAdInfo e() {
        String string = this.instanceData.i().getAdProperties().getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = this.instanceData.i().getAdProperties().getAdUnitId();
        String string2 = this.instanceData.getAdFormat().toString();
        Intrinsics.e(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, this.instanceData.n().a(k()), this.instanceData.n().d(), null, null, 96, null);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final m5 getGenericNotifications() {
        return this.genericNotifications;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C3344a0 getInstanceData() {
        return this.instanceData;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getInstanceName() {
        return this.instanceName;
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new R0(this, 0));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int errorCode, String errorMessage) {
        Intrinsics.f(adapterErrorType, "adapterErrorType");
        Intrinsics.f(errorMessage, "errorMessage");
        a(new y(this, adapterErrorType, errorCode, errorMessage));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        a(new R0(this, 1));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        a(new R0(this, 2));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int errorCode, String errorMessage) {
        a(new RunnableC0914v(this, errorCode, errorMessage, 6));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new R0(this, 3));
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getInstanceSignature() {
        return this.instanceSignature;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getInstanceType() {
        return this.instanceType;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final C3359h0 getPerformance() {
        return this.performance;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getSessionDepth() {
        return this.sessionDepth;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsBidder() {
        return this.isBidder;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsInstanceFailed() {
        return this.isInstanceFailed;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsInstanceLoaded() {
        return this.isInstanceLoaded;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsInstanceLoading() {
        return this.isInstanceLoading;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsInstanceOpened() {
        return this.isInstanceOpened;
    }

    public boolean y() {
        return this.isInstanceLoaded;
    }

    public abstract void z();

    private final BaseAdAdapter<?, ?> a(C3344a0 instanceData) {
        return instanceData.i().getAuctionSettings().q() ? this.adInstancePayload.b() : this.adTools.a(instanceData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC3389z this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC3389z this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC3389z this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC3389z this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.E();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final u2 getAdTools() {
        return this.adTools;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.adapter;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final m5 getAuctionResponseItem() {
        return this.auctionResponseItem;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AdData getCurrentAdData() {
        return this.currentAdData;
    }

    public final Placement j() {
        return this.instanceData.i().getAdProperties().getPlacement();
    }

    public final String k() {
        return this.instanceData.i().l();
    }

    private final a a() {
        return new a();
    }

    public static /* synthetic */ String a(AbstractC3389z abstractC3389z, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return abstractC3389z.a(str);
    }

    public final String a(String message) {
        return this.adTools.a(message, this.instanceSignature);
    }

    private final void a(int errorCode, String errorMessage) {
        IronLog.INTERNAL.verbose(a("error = " + errorCode + ", " + errorMessage));
        G();
        this.isInstanceFailed = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, errorCode, errorMessage, ib.a(this.loadDuration));
        a(new IronSourceError(errorCode, errorMessage));
    }

    public final void a(InterfaceC3352e0 listener) {
        Intrinsics.f(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.loadListener = listener;
        this.isInstanceLoading = true;
        try {
            this.adTools.getEventSender().getLoad().a(false);
            this.loadDuration = new ib();
            F();
            BaseAdAdapter<?, ?> baseAdAdapter = this.adapter;
            Intrinsics.c(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.instanceData.getAdData(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.instanceSignature;
            ironLog.error(a(str));
            a(y1.c(this.instanceData.getAdFormat()), str);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("loadAd - exception = ", th);
            sbP.append(th.getLocalizedMessage());
            String string = sbP.toString();
            IronLog.INTERNAL.error(a(string));
            this.adTools.getEventSender().getTroubleshoot().g(string);
            a(y1.c(this.instanceData.getAdFormat()), string);
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int errorCode, String errorMessage) {
        long jA = ib.a(this.loadDuration);
        IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + errorCode + ", " + errorMessage));
        G();
        if (this.isInstanceFailed) {
            c();
            this.adTools.getEventSender().getTroubleshoot().f("instance load failed after it was already failed");
        } else {
            if (this.isInstanceLoaded) {
                this.adTools.getEventSender().getTroubleshoot().f("instance load failed after it was already loaded");
                return;
            }
            this.isInstanceFailed = true;
            c();
            a(adapterErrorType, errorCode, errorMessage, jA);
            a(new IronSourceError(errorCode, errorMessage));
        }
    }

    private final void a(AdapterErrorType errorType, int errorCode, String errorMessage, long duration) {
        if (errorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.adTools.getEventSender().getLoad().a(duration, errorCode);
        } else {
            this.adTools.getEventSender().getLoad().a(duration, errorCode, errorMessage, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError error) {
        a(o1.a.FailedToLoad);
        InterfaceC3352e0 interfaceC3352e0 = this.loadListener;
        if (interfaceC3352e0 != null) {
            interfaceC3352e0.a(error, this);
        } else {
            Intrinsics.m("loadListener");
            throw null;
        }
    }

    public final void a(o1.a performance) {
        Intrinsics.f(performance, "performance");
        this.instanceData.a(performance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC3389z this$0, int i2, String str) {
        Intrinsics.f(this$0, "this$0");
        this$0.a(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC3389z this$0, AdapterErrorType adapterErrorType, int i2, String errorMessage) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adapterErrorType, "$adapterErrorType");
        Intrinsics.f(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i2, errorMessage);
    }

    public final void a(Runnable callback) {
        Intrinsics.f(callback, "callback");
        this.adTools.a(callback);
    }

    public final void a(boolean status) {
        this.adTools.getEventSender().getAdInteraction().a(status);
    }
}
