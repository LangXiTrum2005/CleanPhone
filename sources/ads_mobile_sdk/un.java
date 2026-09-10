package ads_mobile_sdk;

import android.os.SystemClock;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import formularization.beachfront;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.evenfall;
import saneness.godward;
import saneness.juju;
import saneness.portwide;
import saneness.unrenewable;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public abstract class un extends godward implements portwide {
    public final amphitheatre c;
    public final saran d;
    public final ri2 e;
    public final jk0 f;
    public final x g;
    public final formularization.attabal h;
    public nn i;
    public on j;
    public monroe k;

    public un(amphitheatre clock, saran backgroundScope, ri2 rootTraceCreator, jk0 flags, x activityTracker) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.c = clock;
        this.d = backgroundScope;
        this.e = rootTraceCreator;
        this.f = flags;
        this.g = activityTracker;
        this.h = beachfront.saneness(false, 1, null);
    }

    @Override // saneness.portwide
    public final Object a(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    public final on b() {
        saran saranVar = this.d;
        pn block = new pn(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new on(cutely.saneness(saranVar, context, null, new w13(block, null), 2, null), this.c, p002kotlin.time.saneness.INSTANCE.attabal());
    }

    public final wn c() {
        jk0 flags = this.f;
        to0 signalId = a();
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(signalId, "signalId");
        flags.getClass();
        JsonObject defaultValue = jk0.C;
        Intrinsics.checkNotNullParameter("gads:caching_signal_source_ttls_ms", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        qk qkVar = zk.i;
        JsonObject jsonObject = (JsonObject) flags.a("gads:caching_signal_source_ttls_ms", defaultValue, qkVar);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        long jSaneness = volunteer.saneness(jsonObject, defaultValue, signalId, ((p002kotlin.time.saneness) flags.a("gads:default_signal_ttl", juju.attabal(30, DurationUnit.SECONDS, "gads:default_signal_ttl", X3.i.W), zk.j)).getRawValue());
        JsonObject defaultValue2 = jk0.z;
        Intrinsics.checkNotNullParameter("gads:caching_signal_source_automatic_refreshes", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue2, "defaultValue");
        boolean zDern = volunteer.dern((JsonObject) flags.a("gads:caching_signal_source_automatic_refreshes", defaultValue2, qkVar), defaultValue2, signalId);
        JsonObject defaultValue3 = jk0.B;
        Intrinsics.checkNotNullParameter("gads:caching_signal_source_refresh_buffers_ms", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue3, "defaultValue");
        long jSaneness2 = volunteer.saneness((JsonObject) flags.a("gads:caching_signal_source_refresh_buffers_ms", defaultValue3, qkVar), defaultValue3, signalId, p002kotlin.time.dern.molybdenite(0, DurationUnit.MILLISECONDS));
        JsonObject defaultValue4 = jk0.A;
        Intrinsics.checkNotNullParameter("gads:caching_signal_source_stale_results_enabled", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue4, "defaultValue");
        boolean zDern2 = volunteer.dern((JsonObject) flags.a("gads:caching_signal_source_stale_results_enabled", defaultValue4, qkVar), defaultValue4, signalId);
        JsonObject defaultValue5 = jk0.D;
        Intrinsics.checkNotNullParameter("gads:caching_signal_source_initialization_enabled", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue5, "defaultValue");
        boolean zDern3 = volunteer.dern((JsonObject) flags.a("gads:caching_signal_source_initialization_enabled", defaultValue5, qkVar), defaultValue5, signalId);
        JsonObject defaultValue6 = jk0.E;
        Intrinsics.checkNotNullParameter("gads:caching_signal_source_background_refresh_enabled", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue6, "defaultValue");
        return new wn(jSaneness, zDern, jSaneness2, zDern2, zDern3, volunteer.dern((JsonObject) flags.a("gads:caching_signal_source_background_refresh_enabled", defaultValue6, qkVar), defaultValue6, signalId));
    }

    public final void d() {
        long jMerc;
        if ((!this.g.c() || c().f) && c().b && this.k == null) {
            nn nnVar = this.i;
            if (nnVar != null) {
                long j = nnVar.b;
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                this.c.getClass();
                jMerc = p002kotlin.time.saneness.merc(j, p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS));
            } else {
                jMerc = c().a;
            }
            this.k = cutely.wireman(this.d, null, null, new sn(p002kotlin.time.saneness.merc(jMerc, c().c), this, null), 3, null);
        }
    }

    @Override // ads_mobile_sdk.ox0
    public Object e(wretchedly.dern dernVar) {
        return c(this, dernVar);
    }

    public Object f(wretchedly.dern dernVar) {
        return b(this, dernVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4711. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object a(ads_mobile_sdk.un r13, wretchedly.dern r14) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.un.a(ads_mobile_sdk.un, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(un unVar, wretchedly.dern dernVar) {
        rn rnVar;
        formularization.attabal attabalVar;
        mo0 mo0Var;
        if (dernVar instanceof rn) {
            rnVar = (rn) dernVar;
            int i = rnVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnVar.e = i - Integer.MIN_VALUE;
            } else {
                rnVar = new rn(unVar, dernVar);
            }
        } else {
            rnVar = new rn(unVar, dernVar);
        }
        Object obj = rnVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = rnVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = unVar.h;
            rnVar.a = unVar;
            rnVar.b = attabalVar;
            rnVar.e = 1;
            if (attabalVar.attabal(null, rnVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = rnVar.b;
            un unVar2 = rnVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            unVar = unVar2;
        }
        try {
            unVar.d();
            nn nnVar = unVar.i;
            if (nnVar == null || (nnVar.a() && !unVar.c().d)) {
                on onVar = unVar.j;
                if (onVar == null || onVar.a()) {
                    unVar.j = unVar.b();
                }
                attabalVar.wireman(null);
                return null;
            }
            no0 no0Var = no0.CUI_NAME_SIGNAL;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                if (nnVar.a()) {
                    mo0Var = mo0.STALE;
                } else {
                    mo0Var = mo0.CACHED;
                }
                o12 o12VarE = j13.a().e();
                to0 to0VarA = unVar.a();
                unrenewable builder = wo2.o();
                Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.attabal(unVar.c().b);
                builder.dern(unVar.c().d);
                xm0 xm0VarA = builder.a();
                Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
                o12VarE.t = new wq2(to0VarA, mo0Var, (wo2) xm0VarA);
                Object obj2 = nnVar.c;
                if (obj2 instanceof nn0) {
                    y13.a((nn0) obj2, false);
                }
                interaction.saneness.attabal(w03VarA, null);
                attabalVar.wireman(null);
                return obj2;
            } catch (Throwable th) {
                try {
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        w03VarA.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(w03VarA, th2);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            attabalVar.wireman(null);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(un unVar, wretchedly.dern dernVar) {
        tn tnVar;
        if (dernVar instanceof tn) {
            tnVar = (tn) dernVar;
            int i = tnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnVar.c = i - Integer.MIN_VALUE;
            } else {
                tnVar = new tn(unVar, dernVar);
            }
        } else {
            tnVar = new tn(unVar, dernVar);
        }
        Object obj = tnVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tnVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (unVar.c().e) {
                tnVar.c = 1;
                if (unVar.f(tnVar) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return new tn0(Unit.f29295attabal);
    }
}
