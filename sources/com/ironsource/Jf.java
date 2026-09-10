package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.NoSuchElementException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Jf f26356a = new Jf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static jk.a f26357b = d.f26364a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final wj.d f26358c = r9.b.u(c.f26363a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final wj.d f26359d = r9.b.u(a.f26360a);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26360a = new a();

        /* JADX INFO: renamed from: com.ironsource.Jf$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0041a extends ak.a implements cn.y {
            public C0041a(cn.x xVar) {
                super(xVar);
            }

            @Override // cn.y
            public void handleException(ak.k kVar, Throwable th2) {
                IronLog.INTERNAL.error("CoroutineExceptionHandler caught: " + th2.getMessage());
            }
        }

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cn.a0 invoke() {
            jn.e eVar = cn.n0.f6748a;
            return cn.d0.b(jn.d.f44017b.plus(new C0041a(cn.x.f6783a)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.unity3d.mediation.internal.TempThreadManager$launchCoroutineTask$1", f = "TempThreadManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends ck.i implements jk.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f26362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, ak.f fVar) {
            super(2, fVar);
            this.f26362b = runnable;
        }

        @Override // jk.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cn.a0 a0Var, ak.f fVar) {
            return ((b) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
        }

        @Override // ck.a
        public final ak.f create(Object obj, ak.f fVar) {
            return new b(this.f26362b, fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.f26361a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            try {
                Jf.f26356a.a(this.f26362b, true).run();
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                IronLog.INTERNAL.error("Exception in TempThreadManager coroutine: " + th2.getMessage());
            }
            return wj.r.f53297a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26363a = new c();

        public c() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0448le invoke() {
            return new C0448le(16, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26364a = new d();

        public d() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            pk.c cVar = new pk.c(0, 9, 1);
            nk.d dVar = nk.e.f46785a;
            try {
                return Boolean.valueOf(a.a.B(cVar) == 0);
            } catch (IllegalArgumentException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }
    }

    private Jf() {
    }

    private final C0448le b() {
        return (C0448le) f26358c.getValue();
    }

    public final void a(jk.a aVar) {
        kotlin.jvm.internal.n.f(aVar, "<set-?>");
        f26357b = aVar;
    }

    public final void b(Runnable action) {
        kotlin.jvm.internal.n.f(action, "action");
        if (a(action)) {
            return;
        }
        b().execute(a(action, false));
    }

    public final jk.a c() {
        return f26357b;
    }

    private final cn.a0 a() {
        return (cn.a0) f26359d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable a(Runnable runnable, boolean z10) {
        return new com.applovin.impl.q9(1, runnable, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable action, boolean z10) {
        kotlin.jvm.internal.n.f(action, "$action");
        action.run();
        f26356a.a(z10);
    }

    private final boolean a(Runnable runnable) {
        if (!Kb.f26413u.d().h().F()) {
            return false;
        }
        try {
            cn.d0.w(a(), null, new b(runnable, null), 3);
            return true;
        } catch (Throwable th2) {
            try {
                If.a(th2);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
            }
            IronLog.INTERNAL.error("Failed to launch coroutine: " + th2.getMessage());
            return false;
        }
    }

    private final void a(boolean z10) {
        if (((Boolean) f26357b.invoke()).booleanValue()) {
            try {
                int iActiveCount = Thread.activeCount();
                Mb mb2 = new Mb.a.C0042a().get();
                String string = wj.c.f53275e.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("kotlinVersion=" + string + ";");
                if (z10) {
                    sb2.append("coroutineVersion=" + new C0420k4().a() + ";");
                }
                sb2.append("threadCount=" + iActiveCount + ";");
                sb2.append("javaHeapKb=" + mb2.d() + ";");
                sb2.append("nativeHeapKb=" + mb2.e() + ";");
                sb2.append("sharedOtherKb=" + mb2.f());
                String string2 = sb2.toString();
                kotlin.jvm.internal.n.e(string2, "StringBuilder().apply(builderAction).toString()");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, string2);
                If.a(EnumC0672y5.TROUBLESHOOTING_COROUTINE_USAGE_METRICS, jSONObject);
            } catch (Exception e10) {
                IronLog.INTERNAL.error("Failed to send usage metrics: " + e10.getMessage());
            }
        }
    }
}
