package ads_mobile_sdk;

import android.os.SystemClock;
import com.ironsource.X3;
import formularization.beachfront;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import org.objectweb.asm.Opcodes;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.inrooted;

/* JADX INFO: loaded from: classes.dex */
public final class k22 {
    public final saran a;
    public final amphitheatre b;
    public final jk0 c;
    public final g62 d;
    public final ri2 e;
    public final formularization.attabal f;
    public long g;
    public inrooted h;
    public monroe i;

    public k22(saran backgroundScope, amphitheatre clock, jk0 flags, g62 prewarmManagerProvider, ri2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(prewarmManagerProvider, "prewarmManagerProvider");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.a = backgroundScope;
        this.b = clock;
        this.c = flags;
        this.d = prewarmManagerProvider;
        this.e = rootTraceCreator;
        this.f = beachfront.saneness(false, 1, null);
        this.g = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(k22 k22Var, wretchedly.dern dernVar) {
        h22 h22Var;
        formularization.attabal attabalVar;
        k22Var.getClass();
        if (dernVar instanceof h22) {
            h22Var = (h22) dernVar;
            int i = h22Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                h22Var.e = i - Integer.MIN_VALUE;
            } else {
                h22Var = new h22(k22Var, dernVar);
            }
        } else {
            h22Var = new h22(k22Var, dernVar);
        }
        Object obj = h22Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = h22Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = k22Var.f;
            h22Var.a = k22Var;
            h22Var.b = attabalVar;
            h22Var.e = 1;
            if (attabalVar.attabal(null, h22Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = h22Var.b;
            k22 k22Var2 = h22Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            k22Var = k22Var2;
        }
        try {
            k22Var.b.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - k22Var.g;
            jk0 jk0Var = k22Var.c;
            jk0Var.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jMolybdenite = p002kotlin.time.dern.molybdenite(Opcodes.GETFIELD, DurationUnit.SECONDS);
            Intrinsics.checkNotNullParameter("gads:play_prewarm_manager_connection_duration", X3.i.W);
            if (jElapsedRealtime > p002kotlin.time.saneness.adultoid(((p002kotlin.time.saneness) jk0Var.a("gads:play_prewarm_manager_connection_duration", p002kotlin.time.saneness.cutely(jMolybdenite), zk.l)).getRawValue())) {
                inrooted inrootedVar = k22Var.h;
                if (inrootedVar != null) {
                    k62 k62Var = ((f62) inrootedVar).a;
                    if (k62Var.a != null) {
                        k62.c.a("detach", new Object[0]);
                        qm2 qm2Var = k62Var.a;
                        qm2Var.getClass();
                        qm2Var.b(new lm2(qm2Var));
                    }
                }
                k22Var.h = null;
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
