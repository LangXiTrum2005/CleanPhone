package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.SurfaceView;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.internal.Networking.okhttp.OkHttpNetworkClient;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements m1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Lazy f14621A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Lazy f14622B;
    public final Lazy C;
    public final Lazy D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Lazy f14623E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Lazy f14624F;
    public final Lazy G;
    public final Lazy H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Lazy f14625I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Lazy f14626J;
    public final Lazy K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f14627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f14629c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f14630e;
    public final Lazy f;
    public final Lazy g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f14631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f14632i;
    public final Lazy j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f14633l;
    public final Lazy m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f14634n;
    public final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f14635p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Lazy f14636u;
    public final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f14637w;
    public final Lazy x;
    public final Lazy y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Lazy f14638z;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14639a;

        static {
            int[] iArr = new int[xi.b.values().length];
            try {
                iArr[xi.b.MEDIA_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xi.b.EXO_PLAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14639a = iArr;
        }
    }

    public static final class a0 extends Lambda implements Function0 {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uf invoke() {
            return new uf(o1.this.f14627a.i());
        }
    }

    public static final class b extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function5 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f14642b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o1 o1Var) {
                super(5);
                this.f14642b = o1Var;
            }

            @Override // kotlin.jvm.functions.Function5
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y0 invoke(Context cxt, SurfaceView s, c1 c1Var, lh h2, a8 a8Var) {
                Intrinsics.f(cxt, "cxt");
                Intrinsics.f(s, "s");
                Intrinsics.f(h2, "h");
                Intrinsics.f(a8Var, "<anonymous parameter 4>");
                return new y0(cxt, null, this.f14642b.A(), s, c1Var, h2, this.f14642b.K(), 2, null);
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function5 invoke() {
            return new a(o1.this);
        }
    }

    public static final class b0 extends Lambda implements Function0 {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jg invoke() {
            return new jg(o1.this.G(), o1.this.E(), null, 0L, 0, 28, null);
        }
    }

    public static final class c extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function5 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f14645b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o1 o1Var) {
                super(5);
                this.f14645b = o1Var;
            }

            @Override // kotlin.jvm.functions.Function5
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a1 invoke(Context context, SurfaceView s, c1 c1Var, lh h2, a8 fc) {
                Intrinsics.f(context, "<anonymous parameter 0>");
                Intrinsics.f(s, "s");
                Intrinsics.f(h2, "h");
                Intrinsics.f(fc, "fc");
                return new a1(null, s, c1Var, h2, this.f14645b.K(), this.f14645b.I(), null, fc, 65, null);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function5 invoke() {
            return new a(o1.this);
        }
    }

    public static final class c0 extends Lambda implements Function0 {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kg invoke() {
            return new kg(o1.this.f(), new db(), null, 4, null);
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            return new f1(o1.this.f14627a.getContext(), o1.this.f14627a.b());
        }
    }

    public static final class d0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d0 f14648b = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lg invoke() {
            return new lg();
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f14649b = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q3 invoke() {
            return new q3();
        }
    }

    public static final class e0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e0 f14650b = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ng invoke() {
            return new ng();
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y5 invoke() {
            return new y5(o1.this.f14627a.getContext(), o1.this.f14627a.j(), o1.this.f14627a.f());
        }
    }

    public static final class f0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f0 f14652b = new f0();

        public static final class a extends Lambda implements Function4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f14653b = new a();

            public a() {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final qi invoke(oi va, qi.b l2, CoroutineDispatcher d, a8 a8Var) {
                Intrinsics.f(va, "va");
                Intrinsics.f(l2, "l");
                Intrinsics.f(d, "d");
                return new qi(va, l2, 0.0f, null, a8Var, d, null, 76, null);
            }
        }

        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function4 invoke() {
            return a.f14653b;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d7 f14654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1 f14655c;
        public final /* synthetic */ vg d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(d7 d7Var, o1 o1Var, vg vgVar) {
            super(0);
            this.f14654b = d7Var;
            this.f14655c = o1Var;
            this.d = vgVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k6 invoke() {
            return new k6(this.f14654b.b(), this.f14655c.h(), this.f14655c.g(), this.f14655c.j(), this.f14655c.b(), this.f14655c.s(), this.d.a());
        }
    }

    public static final class g0 extends Lambda implements Function0 {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final si invoke() {
            xi xiVar = new xi(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
            return new si(xiVar.b(), xiVar.c(), xiVar.d(), xiVar.e(), xiVar.f(), xiVar.g(), xiVar.a(), o1.this.j());
        }
    }

    public static final class h extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f14658b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o1 o1Var) {
                super(0);
                this.f14658b = o1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(((qf) this.f14658b.b().get()).f14936E);
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f14659b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o1 o1Var) {
                super(0);
                this.f14659b = o1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(((qf) this.f14659b.b().get()).f14937F);
            }
        }

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o5 invoke() {
            Job jobB = SupervisorKt.b();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
            ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, defaultIoScheduler));
            e6 e6Var = new e6(f4.a(), defaultIoScheduler, null, 4, null);
            ad adVar = new ad(new OkHttpClient(), defaultIoScheduler);
            l5 l5Var = new l5(contextScopeA);
            return new o5(contextScopeA, e6Var, adVar, new m5(e6Var, l5Var, defaultIoScheduler), l5Var, defaultIoScheduler, new a(o1.this), 52428800L, new b(o1.this));
        }
    }

    public static final class h0 extends Lambda implements Function0 {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xi.b invoke() {
            xi.b bVarH;
            xi xiVarC;
            qf qfVar = (qf) o1.this.b().get();
            if (qfVar == null || (xiVarC = qfVar.c()) == null || (bVarH = xiVarC.h()) == null) {
                bVarH = xi.b.EXO_PLAYER;
            }
            za.a("Video player type: " + bVarH, (Throwable) null, 2, (Object) null);
            return bVarH;
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n6 invoke() {
            Object obj = o1.this.b().get();
            Intrinsics.e(obj, "get(...)");
            return new n6((qf) obj);
        }
    }

    public static final class i0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i0 f14662b = new i0();

        public static final class a extends Lambda implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f14663b = new a();

            public a() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final aj invoke(c1 c1Var, zi.b vp, lh lhVar) {
                Intrinsics.f(vp, "vp");
                Intrinsics.f(lhVar, "<anonymous parameter 2>");
                return new aj(c1Var, vp, null, 4, null);
            }
        }

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function3 invoke() {
            return a.f14663b;
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f14664b = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j7 invoke() {
            return new j7(null, 1, null);
        }
    }

    public static final class j0 extends Lambda implements Function0 {
        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ej invoke() {
            return new ej(o1.this.r(), o1.this.d(), null, null, 12, null);
        }
    }

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o7 invoke() {
            return new o7(o1.this.d());
        }
    }

    public static final class k0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d7 f14668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(d7 d7Var) {
            super(0);
            this.f14668c = d7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fj invoke() {
            return new fj(o1.this.g(), o1.this.r(), o1.this.j(), o1.this.h(), o1.this.H(), this.f14668c.b());
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a8 invoke() {
            return new a8(o1.this.f14627a.getContext(), o1.this.b());
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h8 invoke() {
            return new h8(o1.this.f14627a.getContext());
        }
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p2 invoke() {
            return new p2(o1.this.f14627a.getContext(), o1.this.f14627a.e(), o1.this.C(), o1.this.f14627a.a(), null, 16, null);
        }
    }

    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q8 invoke() {
            return new q8(o1.this.B(), o1.this.z(), null, 4, null);
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final la invoke() {
            PackageManager packageManager = o1.this.f14627a.getContext().getPackageManager();
            Intrinsics.e(packageManager, "getPackageManager(...)");
            return new la(packageManager, null, 2, null);
        }
    }

    public static final class q extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f14674b = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpNetworkClient invoke() {
            return new OkHttpNetworkClient(0L, 0L, 0L, 7, null);
        }
    }

    public static final class r extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f14675b = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vc invoke() {
            return new vc();
        }
    }

    public static final class s extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d7 f14676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1 f14677c;
        public final /* synthetic */ vg d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(d7 d7Var, o1 o1Var, vg vgVar) {
            super(0);
            this.f14676b = d7Var;
            this.f14677c = o1Var;
            this.d = vgVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z2 invoke() {
            return new z2(this.f14676b.b(), this.f14677c.D(), this.f14677c.j(), this.f14677c.s(), this.f14677c.f14627a.c(), this.f14676b.a(), this.d.a());
        }
    }

    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yc invoke() {
            return new yc(o1.this.f14627a.getContext());
        }
    }

    public static final class u extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vg f14680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(vg vgVar) {
            super(0);
            this.f14680c = vgVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zd invoke() {
            return new zd(o1.this.e(), o1.this.h(), o1.this.g(), o1.this.u(), o1.this.b(), this.f14680c.a(), o1.this.m(), o1.this.k());
        }
    }

    public static final class v extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ de f14681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(de deVar) {
            super(0);
            this.f14681b = deVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final be invoke() {
            return this.f14681b.a();
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a3 invoke() {
            return new a3(o1.this.f14627a.getContext());
        }
    }

    public static final class x extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x f14683b = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r5 invoke() {
            return new r5(null, 1, null);
        }
    }

    public static final class y extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ de f14685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(de deVar) {
            super(0);
            this.f14685c = deVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ff invoke() {
            return new ff(o1.this.f14627a.getContext(), o1.this.p(), o1.this.j(), o1.this.b(), o1.this.f14627a.i(), o1.this.s(), o1.this.t(), o1.this.k(), this.f14685c.a(), null, o1.this.n());
        }
    }

    public static final class z extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1 f14686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1 f14687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Function1 function1, o1 o1Var) {
            super(0);
            this.f14686b = function1;
            this.f14687c = o1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(this.f14686b.invoke(this.f14687c.f14627a));
        }
    }

    public o1(i1 androidComponent, d7 executorComponent, de privacyComponent, Function1 sdkConfigFactory, vg trackerComponent) {
        Intrinsics.f(androidComponent, "androidComponent");
        Intrinsics.f(executorComponent, "executorComponent");
        Intrinsics.f(privacyComponent, "privacyComponent");
        Intrinsics.f(sdkConfigFactory, "sdkConfigFactory");
        Intrinsics.f(trackerComponent, "trackerComponent");
        this.f14627a = androidComponent;
        this.f14628b = LazyKt.b(new u(trackerComponent));
        this.f14629c = LazyKt.b(q.f14674b);
        this.d = LazyKt.b(new v(privacyComponent));
        this.f14630e = LazyKt.b(new y(privacyComponent));
        this.f = LazyKt.b(new f());
        this.g = LazyKt.b(new i());
        this.f14631h = LazyKt.b(new h());
        this.f14632i = LazyKt.b(new s(executorComponent, this, trackerComponent));
        this.j = LazyKt.b(e0.f14650b);
        this.k = LazyKt.b(new a0());
        this.f14633l = LazyKt.b(new w());
        this.m = LazyKt.b(new n());
        this.f14634n = LazyKt.b(new l());
        this.o = LazyKt.b(new z(sdkConfigFactory, this));
        this.f14635p = LazyKt.b(r.f14675b);
        this.q = LazyKt.b(new g(executorComponent, this, trackerComponent));
        this.r = LazyKt.b(e.f14649b);
        this.s = LazyKt.b(d0.f14648b);
        this.t = LazyKt.b(j.f14664b);
        this.f14636u = LazyKt.b(new k());
        this.v = LazyKt.b(new p());
        this.f14637w = LazyKt.b(new h0());
        this.x = LazyKt.b(new k0(executorComponent));
        this.y = LazyKt.b(new j0());
        this.f14638z = LazyKt.b(new g0());
        this.f14621A = LazyKt.b(new c());
        this.f14622B = LazyKt.b(new b());
        this.C = LazyKt.b(i0.f14662b);
        this.D = LazyKt.b(f0.f14652b);
        this.f14623E = LazyKt.b(new o());
        this.f14624F = LazyKt.b(new m());
        this.G = LazyKt.b(new d());
        this.H = LazyKt.b(new t());
        this.f14625I = LazyKt.b(new c0());
        this.f14626J = LazyKt.b(new b0());
        this.K = LazyKt.b(x.f14683b);
    }

    public o7 A() {
        return (o7) this.f14636u.getX();
    }

    public final h8 B() {
        return (h8) this.f14624F.getX();
    }

    public final q8 C() {
        return (q8) this.f14623E.getX();
    }

    public final vc D() {
        return (vc) this.f14635p.getX();
    }

    public yc E() {
        return (yc) this.H.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ff u() {
        return (ff) this.f14630e.getX();
    }

    public kg G() {
        return (kg) this.f14625I.getX();
    }

    public lg H() {
        return (lg) this.s.getX();
    }

    public final Function4 I() {
        return (Function4) this.D.getX();
    }

    public final xi.b J() {
        return (xi.b) this.f14637w.getX();
    }

    public final Function3 K() {
        return (Function3) this.C.getX();
    }

    public final dj L() {
        return (dj) this.y.getX();
    }

    public final dj M() {
        return (dj) this.x.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public a8 h() {
        return (a8) this.f14634n.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public l6 i() {
        return (l6) this.f14631h.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public a3 j() {
        return (a3) this.f14633l.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public uf k() {
        return (uf) this.k.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public Function5 l() {
        int i2 = a.f14639a[J().ordinal()];
        if (i2 == 1) {
            return y();
        }
        if (i2 == 2) {
            return x();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.chartboost.sdk.impl.m1
    public EndpointRepository m() {
        return (EndpointRepository) this.g.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public y5 n() {
        return (y5) this.f.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public zd o() {
        return (zd) this.f14628b.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public p2 p() {
        return (p2) this.m.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public jg q() {
        return (jg) this.f14626J.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public si r() {
        return (si) this.f14638z.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public ng s() {
        return (ng) this.j.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public q3 t() {
        return (q3) this.r.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public la v() {
        return (la) this.v.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public dj w() {
        dj djVarM;
        int i2 = a.f14639a[J().ordinal()];
        if (i2 == 1) {
            djVarM = M();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            djVarM = L();
        }
        za.a("Video repository: " + djVarM, (Throwable) null, 2, (Object) null);
        return djVarM;
    }

    public final Function5 x() {
        return (Function5) this.f14622B.getX();
    }

    public final Function5 y() {
        return (Function5) this.f14621A.getX();
    }

    public final f1 z() {
        return (f1) this.G.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public be a() {
        return (be) this.d.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public AtomicReference b() {
        return (AtomicReference) this.o.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public we c() {
        return (we) this.K.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public h7 d() {
        return (h7) this.t.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public k6 e() {
        return (k6) this.q.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public tc f() {
        return (tc) this.f14629c.getX();
    }

    @Override // com.chartboost.sdk.impl.m1
    public z2 g() {
        return (z2) this.f14632i.getX();
    }

    public /* synthetic */ o1(i1 i1Var, d7 d7Var, de deVar, Function1 function1, vg vgVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i1Var, d7Var, deVar, (i2 & 8) != 0 ? n1.f14522a : function1, vgVar);
    }
}
