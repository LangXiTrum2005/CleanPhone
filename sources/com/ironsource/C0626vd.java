package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.vd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0626vd implements InterfaceC0644wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f30853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0608ud f30854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A7 f30855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f30856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<InterfaceC0572sd> f30857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30858f;

    /* JADX INFO: renamed from: com.ironsource.vd$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        None,
        Idle,
        Loading
    }

    /* JADX INFO: renamed from: com.ironsource.vd$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30863a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30863a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vd$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0572sd f30864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0626vd f30865b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0572sd interfaceC0572sd, C0626vd c0626vd) {
            super(1);
            this.f30864a = interfaceC0572sd;
            this.f30865b = c0626vd;
        }

        public final void a(boolean z10) {
            if (!z10) {
                IronLog.INTERNAL.verbose("adunit \"" + this.f30864a.b() + "\" failed to load, removing");
                this.f30865b.f30857e.remove(this.f30864a);
            }
            this.f30865b.d();
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return wj.r.f53297a;
        }
    }

    public C0626vd(LevelPlay.AdFormat adFormat, InterfaceC0608ud adUnitsFactory, A7 epService) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitsFactory, "adUnitsFactory");
        kotlin.jvm.internal.n.f(epService, "epService");
        this.f30853a = adFormat;
        this.f30854b = adUnitsFactory;
        this.f30855c = epService;
        this.f30856d = a.None;
        this.f30857e = new ArrayList();
        this.f30858f = b();
    }

    private final int c() {
        int i10 = b.f30863a[this.f30853a.ordinal()];
        if (i10 == 1) {
            return this.f30855c.K();
        }
        if (i10 != 2) {
            return 0;
        }
        return this.f30855c.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        InterfaceC0572sd interfaceC0572sdE = e();
        if (interfaceC0572sdE == null) {
            this.f30856d = a.Idle;
        } else {
            this.f30856d = a.Loading;
            interfaceC0572sdE.a(new c(interfaceC0572sdE, this));
        }
    }

    private final InterfaceC0572sd e() {
        Object next;
        if (!a()) {
            IronLog.INTERNAL.verbose(this.f30853a + " - reached capacity");
            return null;
        }
        Iterator<T> it = this.f30857e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC0572sd) next).a());
        InterfaceC0572sd interfaceC0572sd = (InterfaceC0572sd) next;
        if (interfaceC0572sd != null) {
            return interfaceC0572sd;
        }
        IronLog.INTERNAL.verbose(this.f30853a + " - preload done");
        return null;
    }

    private final int b() {
        int i10 = b.f30863a[this.f30853a.ordinal()];
        if (i10 == 1) {
            return this.f30855c.i();
        }
        if (i10 != 2) {
            return 0;
        }
        return this.f30855c.x();
    }

    @Override // com.ironsource.InterfaceC0644wd
    public void a(Va config) {
        kotlin.jvm.internal.n.f(config, "config");
        if (!this.f30855c.w()) {
            IronLog.INTERNAL.warning(this.f30853a + " - preload is disabled");
            return;
        }
        if (this.f30856d != a.None) {
            IronLog.INTERNAL.warning(this.f30853a + " - initializing service again");
            return;
        }
        int iC = c();
        if (iC >= 1) {
            IronLog.INTERNAL.verbose(String.valueOf(this.f30853a));
            this.f30856d = a.Idle;
            this.f30857e = xj.n.O0(this.f30854b.a(config.c(this.f30853a), iC, config));
            d();
            return;
        }
        IronLog.INTERNAL.warning(this.f30853a + " - invalid maxParallelLoad: " + iC);
    }

    private final InterfaceC0572sd b(String str) {
        Object next;
        Iterator<T> it = this.f30857e.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.n.a(((InterfaceC0572sd) next).b(), str)) {
                return (InterfaceC0572sd) next;
            }
        }
        next = null;
        return (InterfaceC0572sd) next;
    }

    public /* synthetic */ C0626vd(LevelPlay.AdFormat adFormat, InterfaceC0608ud interfaceC0608ud, A7 a8, int i10, kotlin.jvm.internal.g gVar) {
        this(adFormat, (i10 & 2) != 0 ? new C0590td(adFormat) : interfaceC0608ud, (i10 & 4) != 0 ? Kb.f26413u.d().h() : a8);
    }

    private final boolean a() {
        int i10;
        List<InterfaceC0572sd> list = this.f30857e;
        if ((list instanceof Collection) && list.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (!((InterfaceC0572sd) it.next()).a() && (i10 = i10 + 1) < 0) {
                    xj.o.U();
                    throw null;
                }
            }
        }
        return i10 < this.f30858f;
    }

    @Override // com.ironsource.InterfaceC0644wd
    public C0404j6 a(String adUnitId) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        IronLog.INTERNAL.verbose(this.f30853a + " - adunit: \"" + adUnitId + "\"");
        InterfaceC0572sd interfaceC0572sdB = b(adUnitId);
        if (interfaceC0572sdB != null) {
            return interfaceC0572sdB.c();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC0644wd
    public void a(String adUnitId, boolean z10) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.f30853a + " - adunit: \"" + adUnitId + "\", didUseInstance: " + z10);
        InterfaceC0572sd interfaceC0572sdB = b(adUnitId);
        if (interfaceC0572sdB == null) {
            ironLog.warning("adunit is null at \"" + adUnitId + "\"");
            return;
        }
        interfaceC0572sdB.a(z10);
        if (z10 && this.f30856d == a.Idle) {
            d();
        }
    }
}
