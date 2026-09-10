package com.p004ironsource;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0002\b&\u0018\u00002\u00020\u0001:\u0001\bB)\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u00108\u001a\u000204\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\bM\u0010NJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H$J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0004J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\b\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0004R\u001a\u0010\u001c\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u0016\u0010)R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010,\"\u0004\b\b\u0010-R\u001a\u00102\u001a\u00020.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b0\u00101R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010404038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010C8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b6\u0010DR\u0014\u0010G\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u0010FR\u0014\u0010J\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010I¨\u0006O"}, d2 = {"Lcom/ironsource/n1;", "", "com/ironsource/n1$b", "c", "()Lcom/ironsource/n1$b;", "", "l", "Lcom/ironsource/c0;", "a", "Lcom/ironsource/k2;", "loadListener", "Lcom/ironsource/i0;", "adInstancePresenter", "Lcom/ironsource/w1;", "displayListener", "", "isPublisherDestroy", "", "errorCode", "", "errorReason", "Lcom/ironsource/p1;", "b", PglCryptUtils.KEY_MESSAGE, "Lcom/ironsource/u1;", "Lcom/ironsource/u1;", "e", "()Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/te;", "Lcom/ironsource/te;", "taskScheduler", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", f.j, "()Lcom/ironsource/u2;", "adUnitTools", "d", "Lcom/ironsource/k2;", "j", "()Lcom/ironsource/k2;", "(Lcom/ironsource/k2;)V", "Lcom/ironsource/w1;", i.f37957c, "()Lcom/ironsource/w1;", "(Lcom/ironsource/w1;)V", "Lcom/ironsource/fx;", "Lcom/ironsource/fx;", "k", "()Lcom/ironsource/fx;", d.f25770h, "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/i2;", "kotlin.jvm.PlatformType", g.f40227p, "Ljava/lang/ref/WeakReference;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/ib;", h.f36614b, "Lcom/ironsource/ib;", "loadDuration", "Lcom/ironsource/zu$a;", "Lcom/ironsource/zu$a;", "expirationScheduledTask", "Lcom/ironsource/bc;", "Lcom/ironsource/bc;", "eventsWrapper", "Lcom/ironsource/mediationsdk/model/Placement;", "()Lcom/ironsource/mediationsdk/model/Placement;", "currentPlacement", "()Ljava/lang/String;", "currentPlacementName", "Lcom/ironsource/h1;", "()Lcom/ironsource/h1;", "adReadyStatus", "Lcom/ironsource/m1;", "adTools", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/u1;Lcom/ironsource/i2;Lcom/ironsource/te;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final te taskScheduler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u2 adUnitTools;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private k2 loadListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private w1 displayListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final fx waterfall;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final WeakReference<i2> listener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ib loadDuration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private zu.a expirationScheduledTask;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final bc eventsWrapper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0094\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ironsource/n1$a;", "Lcom/ironsource/d0;", "Lcom/ironsource/z;", m5.f25675p, "", "b", "a", "<init>", "(Lcom/ironsource/n1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public class a implements InterfaceC3350d0 {
        public a() {
        }

        @Override // com.p004ironsource.InterfaceC3350d0
        public void a(AbstractC3389z instance) {
            Intrinsics.f(instance, "instance");
            n1.this.eventsWrapper.getAdInteraction().a(n1.this.h());
            i2 i2Var = (i2) n1.this.listener.get();
            if (i2Var != null) {
                i2Var.h();
            }
        }

        @Override // com.p004ironsource.InterfaceC3350d0
        public void b(AbstractC3389z instance) {
            Intrinsics.f(instance, "instance");
            IronLog.INTERNAL.verbose(n1.this.a(instance.getInstanceSignature()));
            n1.this.getWaterfall().b(instance);
            n1.this.eventsWrapper.getAdInteraction().g(n1.this.h());
            n1.this.getAdUnitTools().m().b(n1.this.getAdUnitData().getAdProperties().getAdFormat());
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ironsource/n1$b", "Lcom/ironsource/mx;", "Lcom/ironsource/z;", m5.f25675p, "", "b", "", "errorCode", "", "errorReason", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements mx {
        public b() {
        }

        @Override // com.p004ironsource.mx
        public void a(int errorCode, String errorReason) {
            Intrinsics.f(errorReason, "errorReason");
            n1.this.a(errorCode, errorReason);
        }

        @Override // com.p004ironsource.mx
        public void b(AbstractC3389z instance) {
            Intrinsics.f(instance, "instance");
            n1.this.eventsWrapper.getLoad().a(ib.a(n1.this.loadDuration), n1.this.getAdUnitData().getIsPublisherLoad());
            k2 loadListener = n1.this.getLoadListener();
            if (loadListener != null) {
                loadListener.c(new r1(n1.this, instance.e()));
            }
            n1.this.l();
        }

        @Override // com.p004ironsource.mx
        public void a(AbstractC3389z instance) {
            Intrinsics.f(instance, "instance");
            n1.this.getAdUnitTools().getEventSender().getAdInteraction().e(n1.this.h());
            k2 loadListener = n1.this.getLoadListener();
            if (loadListener != null) {
                loadListener.b(new r1(n1.this, instance.e()));
            }
            n1.this.l();
        }
    }

    public n1(m1 adTools, u1 adUnitData, i2 listener, te taskScheduler) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(listener, "listener");
        Intrinsics.f(taskScheduler, "taskScheduler");
        this.adUnitData = adUnitData;
        this.taskScheduler = taskScheduler;
        u2 u2Var = new u2(adTools, adUnitData, c2.b.MEDIATION);
        this.adUnitTools = u2Var;
        this.waterfall = new fx(u2Var, adUnitData, c());
        this.listener = new WeakReference<>(listener);
        this.eventsWrapper = u2Var.getEventSender();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.getAdProperties().getAdFormat() + ", adUnitId = " + adUnitData.getAdProperties().getAdUnitId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        IronLog.INTERNAL.verbose(a("starting expiration scheduled task"));
        zu.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.adUnitTools.b(this.adUnitData.getAdProperties().e());
        te teVar = this.taskScheduler;
        D d = new D(this, 6);
        Duration.Companion companion = Duration.f44719Y;
        this.expirationScheduledTask = teVar.a(d, DurationKt.h(jB, DurationUnit.MILLISECONDS));
    }

    public abstract InterfaceC3348c0 a();

    public p1 b() {
        return new p1(this.adUnitData.getAdProperties());
    }

    public h1 d() {
        if (this.waterfall.d()) {
            return h1.b.f25188a;
        }
        return new h1.a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u1 getAdUnitData() {
        return this.adUnitData;
    }

    public final Placement g() {
        return this.adUnitData.getAdProperties().getPlacement();
    }

    public final String h() {
        return this.adUnitData.l();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final w1 getDisplayListener() {
        return this.displayListener;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k2 getLoadListener() {
        return this.loadListener;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final fx getWaterfall() {
        return this.waterfall;
    }

    public /* synthetic */ n1(m1 m1Var, u1 u1Var, i2 i2Var, te teVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(m1Var, u1Var, i2Var, (i2 & 8) != 0 ? new te(Handler.a(m1Var.a())) : teVar);
    }

    private final b c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(n1 this$0) {
        Intrinsics.f(this$0, "this$0");
        k2 k2Var = this$0.loadListener;
        if (k2Var != null) {
            k2Var.a();
        }
    }

    public final String a(String message) {
        return m1.a(this.adUnitTools, message, (String) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final u2 getAdUnitTools() {
        return this.adUnitTools;
    }

    public final void a(int errorCode, String errorReason) {
        Intrinsics.f(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + errorCode + ", errorReason = " + errorReason));
        this.eventsWrapper.getLoad().a(ib.a(this.loadDuration), errorCode, errorReason, this.adUnitData.getIsPublisherLoad());
        k2 k2Var = this.loadListener;
        if (k2Var != null) {
            k2Var.a(new IronSourceError(errorCode, errorReason));
        }
    }

    public final void b(k2 k2Var) {
        this.loadListener = k2Var;
    }

    public final void a(InterfaceC3361i0 adInstancePresenter, w1 displayListener) {
        Intrinsics.f(adInstancePresenter, "adInstancePresenter");
        Intrinsics.f(displayListener, "displayListener");
        this.displayListener = displayListener;
        zu.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        this.waterfall.a(adInstancePresenter);
    }

    public void a(k2 loadListener) {
        Intrinsics.f(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(m1.a(this.adUnitTools, (String) null, (String) null, 3, (Object) null));
        this.adUnitTools.a(b());
        this.loadListener = loadListener;
        this.eventsWrapper.a(this.adUnitData.getIsPublisherLoad());
        this.loadDuration = new ib();
        this.waterfall.a(a());
    }

    public final void a(w1 w1Var) {
        this.displayListener = w1Var;
    }

    public final void a(boolean isPublisherDestroy) {
        IronLog.INTERNAL.verbose(m1.a(this.adUnitTools, (String) null, (String) null, 3, (Object) null));
        this.waterfall.a();
        if (isPublisherDestroy) {
            this.adUnitTools.getEventSender().getLoad().a(this.adUnitTools.f());
        }
    }
}
