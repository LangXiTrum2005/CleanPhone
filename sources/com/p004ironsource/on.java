package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001\nB\u000b\b\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020/H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00104\u001a\u000203H\u0016J\b\u00106\u001a\u000205H\u0016J\b\u00108\u001a\u000207H\u0016J\b\u0010:\u001a\u000209H\u0016J\b\u0010<\u001a\u00020;H\u0016J\b\u0010>\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020?H\u0016J\b\u0010B\u001a\u00020AH\u0016J\b\u0010D\u001a\u00020CH\u0016R\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010M\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010F\u001a\u0004\bO\u0010PR\u001b\u0010U\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bW\u0010XR\u001b\u0010]\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\b[\u0010\\R\u001b\u0010a\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010F\u001a\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\bc\u0010dR\u001b\u0010i\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bg\u0010hR\u001b\u0010m\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bo\u0010pR\u001b\u0010u\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010F\u001a\u0004\bs\u0010tR\u001b\u0010y\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bw\u0010xR\u001b\u0010}\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010F\u001a\u0004\b{\u0010|R\u001d\u0010\u0081\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\bB\u0010F\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u0085\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b \u0010F\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u0089\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b<\u0010F\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u008c\u0001\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u0010\u0010F\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/ironsource/on;", "Lcom/ironsource/fg;", "Lcom/ironsource/eg;", "Lcom/ironsource/ii;", "k", "Lcom/ironsource/ii$a;", "e", "Lcom/ironsource/vf;", com.smartdigimkt.h5.f.j, "Lcom/ironsource/vf$a;", "b", "Lcom/ironsource/hi;", "j", "Lcom/ironsource/hi$a;", com.smartdigimkt.q8.i.f37957c, "Lcom/ironsource/gf;", "r", "Lcom/ironsource/gf$a;", "D", "Lcom/ironsource/jg;", "C", "Lcom/ironsource/jg$a;", "m", "Lcom/ironsource/hg;", "y", "Lcom/ironsource/hg$a;", "a", "Lcom/ironsource/nf;", "u", "Lcom/ironsource/nf$a;", "w", "Lcom/ironsource/mg;", "p", "Lcom/ironsource/mg$a;", "B", "Lcom/ironsource/kh;", "A", "Lcom/ironsource/u3;", "z", "Lcom/ironsource/kh$a;", dc.q, "Lcom/ironsource/ji;", "l", "Lcom/ironsource/o0;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Lcom/ironsource/ji$a;", com.smartdigimkt.y4.g.f40227p, "Lcom/ironsource/o0$a;", "F", "Lcom/ironsource/ei;", "t", "Lcom/ironsource/ei$a;", "E", "Lcom/ironsource/cg;", "c", "Lcom/ironsource/jf;", "v", "Lcom/ironsource/fi;", com.smartdigimkt.m3.h.f36614b, "Lcom/ironsource/fi$a;", "q", "Lcom/ironsource/xf;", "d", "Lcom/ironsource/xf$a;", "x", "Lcom/ironsource/ni;", "o", "Lcom/ironsource/ni$a;", "s", "Lcom/ironsource/wt;", "Lkotlin/Lazy;", "Z", "()Lcom/ironsource/wt;", "sessionDepthManager", "Lcom/ironsource/ab;", "N", "()Lcom/ironsource/ab;", "deviceInfoService", "Lcom/ironsource/vt;", "Y", "()Lcom/ironsource/vt;", "sessionCappingService", "Lcom/ironsource/r;", "I", "()Lcom/ironsource/r;", "adFormatCappingService", "Lcom/ironsource/qq;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Lcom/ironsource/qq;", "placementCappingServiceLegacy", "Lcom/ironsource/l8;", "K", "()Lcom/ironsource/l8;", "adUnitCappingService", "Lcom/ironsource/oq;", "S", "()Lcom/ironsource/oq;", "placementCappingService", "Lcom/ironsource/kr;", "V", "()Lcom/ironsource/kr;", "rewardService", "Lcom/ironsource/zt;", "a0", "()Lcom/ironsource/zt;", "sessionHistoryService", "Lcom/ironsource/q0;", "J", "()Lcom/ironsource/q0;", "adInternalInfoService", "Lcom/ironsource/lh;", "R", "()Lcom/ironsource/lh;", "ironSourceNetworkConfigurationsManager", "Lcom/ironsource/os;", "W", "()Lcom/ironsource/os;", "sdkConfigService", "Lcom/ironsource/tc;", "Q", "()Lcom/ironsource/tc;", "featureAvailabilityService", "Lcom/ironsource/l4;", "M", "()Lcom/ironsource/l4;", "applicationLifecycleService", "Lcom/ironsource/gt;", "X", "()Lcom/ironsource/gt;", "sdkSessionInfoService", "Lcom/ironsource/pb;", "P", "()Lcom/ironsource/pb;", "epService", "Lcom/ironsource/kv;", "b0", "()Lcom/ironsource/kv;", "testSuiteLoadConfigService", "L", "()Lcom/ironsource/u3;", "appEventManager", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class on implements fg, eg {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<on> t = LazyKt.b(a.f26391a);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy sessionDepthManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy deviceInfoService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy sessionCappingService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy adFormatCappingService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy placementCappingServiceLegacy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy adUnitCappingService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy placementCappingService;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy rewardService;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy sessionHistoryService;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy adInternalInfoService;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy ironSourceNetworkConfigurationsManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy sdkConfigService;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy featureAvailabilityService;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy applicationLifecycleService;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Lazy sdkSessionInfoService;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy epService;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Lazy testSuiteLoadConfigService;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Lazy appEventManager;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/on;", "a", "()Lcom/ironsource/on;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<on> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26391a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final on invoke() {
            return new on(null);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.on$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\fR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0012\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/on$b;", "", "Lcom/ironsource/on;", "instance$delegate", "Lkotlin/Lazy;", "c", "()Lcom/ironsource/on;", m5.f25675p, "Lcom/ironsource/fg;", "d", "()Lcom/ironsource/fg;", "getProvider$annotations", "()V", IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/eg;", "a", "()Lcom/ironsource/eg;", "getEditor$annotations", "editor", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void b() {
        }

        @JvmStatic
        public static /* synthetic */ void e() {
        }

        public final eg a() {
            return c();
        }

        public final on c() {
            return (on) on.t.getX();
        }

        public final fg d() {
            return c();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/r;", "a", "()Lcom/ironsource/r;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<com.p004ironsource.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26392a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.p004ironsource.r invoke() {
            return new com.p004ironsource.r();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/q0;", "a", "()Lcom/ironsource/q0;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function0<C3379q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26393a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3379q0 invoke() {
            return new C3379q0(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/l8;", "a", "()Lcom/ironsource/l8;"}, k = 3, mv = {1, 8, 0})
    public static final class e extends Lambda implements Function0<l8> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26394a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l8 invoke() {
            return new l8(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/u3;", "a", "()Lcom/ironsource/u3;"}, k = 3, mv = {1, 8, 0})
    public static final class f extends Lambda implements Function0<u3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f26395a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u3 invoke() {
            return new u3();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/l4;", "a", "()Lcom/ironsource/l4;"}, k = 3, mv = {1, 8, 0})
    public static final class g extends Lambda implements Function0<l4> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l4 invoke() {
            return new l4(on.this.Q());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ab;", "a", "()Lcom/ironsource/ab;"}, k = 3, mv = {1, 8, 0})
    public static final class h extends Lambda implements Function0<ab> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f26397a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ab invoke() {
            return new ab();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/pb;", "a", "()Lcom/ironsource/pb;"}, k = 3, mv = {1, 8, 0})
    public static final class i extends Lambda implements Function0<pb> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f26398a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pb invoke() {
            return new pb();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/tc;", "a", "()Lcom/ironsource/tc;"}, k = 3, mv = {1, 8, 0})
    public static final class j extends Lambda implements Function0<tc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f26399a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tc invoke() {
            return new tc();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/lh;", "a", "()Lcom/ironsource/lh;"}, k = 3, mv = {1, 8, 0})
    public static final class k extends Lambda implements Function0<lh> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f26400a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lh invoke() {
            return new lh();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/oq;", "a", "()Lcom/ironsource/oq;"}, k = 3, mv = {1, 8, 0})
    public static final class l extends Lambda implements Function0<oq> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f26401a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final oq invoke() {
            return new oq(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/qq;", "a", "()Lcom/ironsource/qq;"}, k = 3, mv = {1, 8, 0})
    public static final class m extends Lambda implements Function0<qq> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f26402a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qq invoke() {
            return new qq();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/kr;", "a", "()Lcom/ironsource/kr;"}, k = 3, mv = {1, 8, 0})
    public static final class n extends Lambda implements Function0<kr> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f26403a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kr invoke() {
            return new kr();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/os;", "a", "()Lcom/ironsource/os;"}, k = 3, mv = {1, 8, 0})
    public static final class o extends Lambda implements Function0<os> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f26404a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final os invoke() {
            return new os();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/gt;", "a", "()Lcom/ironsource/gt;"}, k = 3, mv = {1, 8, 0})
    public static final class p extends Lambda implements Function0<gt> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f26405a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gt invoke() {
            s9 s9Var = null;
            return new gt(new jt(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, s9Var, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/vt;", "a", "()Lcom/ironsource/vt;"}, k = 3, mv = {1, 8, 0})
    public static final class q extends Lambda implements Function0<vt> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f26406a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vt invoke() {
            return new vt();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/wt;", "a", "()Lcom/ironsource/wt;"}, k = 3, mv = {1, 8, 0})
    public static final class r extends Lambda implements Function0<wt> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f26407a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wt invoke() {
            return new wt();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/zt;", "a", "()Lcom/ironsource/zt;"}, k = 3, mv = {1, 8, 0})
    public static final class s extends Lambda implements Function0<zt> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f26408a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zt invoke() {
            return new zt();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/kv;", "a", "()Lcom/ironsource/kv;"}, k = 3, mv = {1, 8, 0})
    public static final class t extends Lambda implements Function0<kv> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f26409a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kv invoke() {
            return new kv();
        }
    }

    private on() {
        this.sessionDepthManager = LazyKt.b(r.f26407a);
        this.deviceInfoService = LazyKt.b(h.f26397a);
        this.sessionCappingService = LazyKt.b(q.f26406a);
        this.adFormatCappingService = LazyKt.b(c.f26392a);
        this.placementCappingServiceLegacy = LazyKt.b(m.f26402a);
        this.adUnitCappingService = LazyKt.b(e.f26394a);
        this.placementCappingService = LazyKt.b(l.f26401a);
        this.rewardService = LazyKt.b(n.f26403a);
        this.sessionHistoryService = LazyKt.b(s.f26408a);
        this.adInternalInfoService = LazyKt.b(d.f26393a);
        this.ironSourceNetworkConfigurationsManager = LazyKt.b(k.f26400a);
        this.sdkConfigService = LazyKt.b(o.f26404a);
        this.featureAvailabilityService = LazyKt.b(j.f26399a);
        this.applicationLifecycleService = LazyKt.b(new g());
        this.sdkSessionInfoService = LazyKt.b(p.f26405a);
        this.epService = LazyKt.b(i.f26398a);
        this.testSuiteLoadConfigService = LazyKt.b(t.f26409a);
        this.appEventManager = LazyKt.b(f.f26395a);
    }

    private final com.p004ironsource.r I() {
        return (com.p004ironsource.r) this.adFormatCappingService.getX();
    }

    private final C3379q0 J() {
        return (C3379q0) this.adInternalInfoService.getX();
    }

    private final l8 K() {
        return (l8) this.adUnitCappingService.getX();
    }

    private final u3 L() {
        return (u3) this.appEventManager.getX();
    }

    private final l4 M() {
        return (l4) this.applicationLifecycleService.getX();
    }

    private final ab N() {
        return (ab) this.deviceInfoService.getX();
    }

    public static final eg O() {
        return INSTANCE.a();
    }

    private final pb P() {
        return (pb) this.epService.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tc Q() {
        return (tc) this.featureAvailabilityService.getX();
    }

    private final lh R() {
        return (lh) this.ironSourceNetworkConfigurationsManager.getX();
    }

    private final oq S() {
        return (oq) this.placementCappingService.getX();
    }

    private final qq T() {
        return (qq) this.placementCappingServiceLegacy.getX();
    }

    public static final fg U() {
        return INSTANCE.d();
    }

    private final kr V() {
        return (kr) this.rewardService.getX();
    }

    private final os W() {
        return (os) this.sdkConfigService.getX();
    }

    private final gt X() {
        return (gt) this.sdkSessionInfoService.getX();
    }

    private final vt Y() {
        return (vt) this.sessionCappingService.getX();
    }

    private final wt Z() {
        return (wt) this.sessionDepthManager.getX();
    }

    private final zt a0() {
        return (zt) this.sessionHistoryService.getX();
    }

    private final kv b0() {
        return (kv) this.testSuiteLoadConfigService.getX();
    }

    @Override // com.p004ironsource.fg
    public kh A() {
        return R();
    }

    @Override // com.p004ironsource.eg
    public mg.a B() {
        return V();
    }

    @Override // com.p004ironsource.fg
    public jg C() {
        return T();
    }

    @Override // com.p004ironsource.eg
    public gf.a D() {
        return I();
    }

    @Override // com.p004ironsource.eg
    public ei.a E() {
        return W();
    }

    @Override // com.p004ironsource.eg
    public InterfaceC3375o0.a F() {
        return J();
    }

    @Override // com.p004ironsource.fg
    public InterfaceC3375o0 G() {
        return J();
    }

    @Override // com.p004ironsource.eg
    public hg.a a() {
        return S();
    }

    @Override // com.p004ironsource.eg
    public vf.a b() {
        return N();
    }

    @Override // com.p004ironsource.fg
    public cg c() {
        return Q();
    }

    @Override // com.p004ironsource.fg
    public xf d() {
        return P();
    }

    @Override // com.p004ironsource.eg
    public ii.a e() {
        return Z();
    }

    @Override // com.p004ironsource.fg
    public vf f() {
        return N();
    }

    @Override // com.p004ironsource.eg
    public ji.a g() {
        return a0();
    }

    @Override // com.p004ironsource.fg
    public fi h() {
        return X();
    }

    @Override // com.p004ironsource.eg
    public hi.a i() {
        return Y();
    }

    @Override // com.p004ironsource.fg
    public hi j() {
        return Y();
    }

    @Override // com.p004ironsource.fg
    public ii k() {
        return Z();
    }

    @Override // com.p004ironsource.fg
    public ji l() {
        return a0();
    }

    @Override // com.p004ironsource.eg
    public jg.a m() {
        return T();
    }

    @Override // com.p004ironsource.eg
    public kh.a n() {
        return R();
    }

    @Override // com.p004ironsource.fg
    public ni o() {
        return b0();
    }

    @Override // com.p004ironsource.fg
    public mg p() {
        return V();
    }

    @Override // com.p004ironsource.eg
    public fi.a q() {
        return X();
    }

    @Override // com.p004ironsource.fg
    public gf r() {
        return I();
    }

    @Override // com.p004ironsource.eg
    public ni.a s() {
        return b0();
    }

    @Override // com.p004ironsource.fg
    public ei t() {
        return W();
    }

    @Override // com.p004ironsource.fg
    public nf u() {
        return K();
    }

    @Override // com.p004ironsource.fg
    public jf v() {
        return M();
    }

    @Override // com.p004ironsource.eg
    public nf.a w() {
        return K();
    }

    @Override // com.p004ironsource.eg
    public xf.a x() {
        return P();
    }

    @Override // com.p004ironsource.fg
    public hg y() {
        return S();
    }

    @Override // com.p004ironsource.fg
    public u3 z() {
        return L();
    }

    public /* synthetic */ on(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
