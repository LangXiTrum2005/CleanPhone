package ads_mobile_sdk;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.evenfall;
import saneness.houselet;
import saneness.nestlike;
import saneness.thalli;

/* JADX INFO: loaded from: classes.dex */
public final class r22 implements nestlike {
    public final h1 a;
    public final amphitheatre b;
    public final ur c;
    public final saran d;
    public final ri2 e;
    public final Object f;
    public final houselet g;
    public boolean h;
    public boolean i;
    public monroe j;

    public r22(h1 adConfig, amphitheatre clock, ur commonConfiguration, saran backgroundScope, ri2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.a = adConfig;
        this.b = clock;
        this.c = commonConfiguration;
        this.d = backgroundScope;
        this.e = rootTraceCreator;
        this.f = new Object();
        houselet houseletVarO = u22.o();
        Intrinsics.checkNotNullExpressionValue(houseletVarO, "newBuilder(...)");
        this.g = houseletVarO;
    }

    public static final void a(r22 r22Var) {
        synchronized (r22Var.f) {
            if (r22Var.i) {
                return;
            }
            ri2 ri2Var = r22Var.e;
            no0 no0Var = no0.CUI_NAME_POST_CLICK_LIFECYCLE_MONITORING;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    r22Var.i = true;
                    j13.a().e().H = (u22) r22Var.g.a();
                    j13.a().a.b.b = r22Var.c.h;
                    Unit unit = Unit.f29295attabal;
                    interaction.saneness.attabal(v62VarA, null);
                } catch (Throwable th) {
                    try {
                        v62VarA.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        v62VarA.a(th);
                        if (th instanceof TimeoutCancellationException) {
                            throw new cp0(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new bn0(th);
                        }
                        if (!(th instanceof yn0)) {
                            throw new gn0(th);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            interaction.saneness.attabal(v62VarA, th2);
                            throw th3;
                        }
                    }
                }
            }
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                r22Var.i = true;
                j13.a().e().H = (u22) r22Var.g.a();
                j13.a().a.b.b = r22Var.c.h;
                Unit unit2 = Unit.f29295attabal;
                interaction.saneness.attabal(w03VarA, null);
            } catch (Throwable th4) {
                try {
                    w03VarA.b(th4);
                    if (th4 instanceof evenfall) {
                        throw th4;
                    }
                    w03VarA.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new cp0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new bn0(th4);
                    }
                    if (!(th4 instanceof yn0)) {
                        throw new gn0(th4);
                    }
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(w03VarA, th5);
                        throw th6;
                    }
                }
            }
        }
    }

    @Override // saneness.nestlike
    public final void b() {
        a(vb.ON_START);
    }

    @Override // saneness.nestlike
    public final void c() {
        a(vb.ON_USER_LEAVE_HINT);
    }

    @Override // saneness.nestlike
    public final void d() {
        a(vb.ON_RESTART);
    }

    @Override // saneness.nestlike
    public final void e() {
        a(vb.ON_CREATE);
    }

    public final void f() {
        synchronized (this.f) {
            if (p002kotlin.time.saneness.formularize(this.a.y0, p002kotlin.time.saneness.INSTANCE.dern()) > 0 && !this.h && !this.i) {
                houselet houseletVar = this.g;
                this.b.getClass();
                houseletVar.attabal(System.currentTimeMillis());
                this.h = true;
                saran saranVar = this.d;
                q22 block = new q22(this, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                this.j = cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                Unit unit = Unit.f29295attabal;
            }
        }
    }

    @Override // saneness.nestlike
    public final void onDestroy() {
        a(vb.ON_DESTROY);
    }

    @Override // saneness.nestlike
    public final void onPause() {
        a(vb.ON_PAUSE);
    }

    @Override // saneness.nestlike
    public final void onResume() {
        a(vb.ON_RESUME);
    }

    public final void a(vb value) {
        synchronized (this.f) {
            try {
                if (!this.i && this.h) {
                    houselet houseletVar = this.g;
                    thalli builder = wb.o();
                    Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    builder.dern(value);
                    this.b.getClass();
                    builder.attabal(System.currentTimeMillis());
                    xm0 xm0VarA = builder.a();
                    Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
                    houseletVar.dern((wb) xm0VarA);
                    if (value == vb.ON_DESTROY) {
                        monroe monroeVar = this.j;
                        if (monroeVar != null) {
                            monroe.attabal.attabal(monroeVar, null, 1, null);
                        }
                        saran saranVar = this.d;
                        p22 block = new p22(this, null);
                        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                        Intrinsics.checkNotNullParameter(saranVar, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(block, "block");
                        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                    }
                    Unit unit = Unit.f29295attabal;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // saneness.nestlike
    public final void a() {
        a(vb.ON_STOP);
    }
}
