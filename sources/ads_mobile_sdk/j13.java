package ads_mobile_sdk;

import android.os.SystemClock;
import java.util.List;
import java.util.WeakHashMap;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.asosan;
import saneness.kabul;

/* JADX INFO: loaded from: classes.dex */
public abstract class j13 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final kabul b = new kabul();

    public static w03 a(no0 cuiName, List tags, boolean z) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        w03 w03Var = b().a;
        w03 w03VarA = w03Var != null ? w03Var.a(cuiName, tags, z) : b(cuiName, tags, z);
        a(b(), w03VarA);
        return w03VarA;
    }

    public static rf1 b(no0 no0Var, List list, boolean z) {
        x03.a("Attempted to start a trace " + no0Var.name() + " without a parent. Did you forget to start a root trace or propagate an existing one?");
        return asosan.attabal(no0Var, list, z);
    }

    public static w03 c() {
        return b().a;
    }

    public static i13 b() {
        kabul kabulVar = b;
        Object i13Var = kabulVar.get();
        if (i13Var == null) {
            i13Var = new i13(null, SystemClock.currentThreadTimeMillis(), null);
            Thread threadCurrentThread = Thread.currentThread();
            WeakHashMap weakHashMap = a;
            synchronized (weakHashMap) {
            }
            kabulVar.set(i13Var);
        }
        return (i13) i13Var;
    }

    public static void a(w03 expectedTrace) {
        o12 o12VarE;
        no0 no0Var;
        Intrinsics.checkNotNullParameter(expectedTrace, "expectedTrace");
        i13 i13VarB = b();
        w03 w03VarA = i13VarB.a();
        if (w03VarA == null) {
            x03.a("Tried to end trace " + expectedTrace.e().c.name() + " (" + expectedTrace.c() + "), but there was no active trace. If this is a test, did you forget to add a TraceThreadContextElement to your CoroutineScope?");
        }
        if (expectedTrace != w03VarA) {
            x03.a("Tried to end trace " + expectedTrace.e().c.name() + " (" + expectedTrace.c() + "), but that trace is not the current trace. The current trace is " + ((w03VarA == null || (o12VarE = w03VarA.e()) == null || (no0Var = o12VarE.c) == null) ? null : no0Var.name()) + " (" + (w03VarA != null ? Integer.valueOf(w03VarA.c()) : null) + ").");
        }
        a(i13VarB, w03VarA != null ? w03VarA.d() : null);
        expectedTrace.a();
    }

    public static w03 a(i13 i13Var, w03 w03Var) {
        w03 w03Var2 = i13Var.a;
        if (w03Var2 == w03Var) {
            return w03Var;
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (w03Var2 != null) {
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            w03Var2.e.addAndGet(p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.graveside(jCurrentThreadTimeMillis - i13Var.b, DurationUnit.MILLISECONDS)));
        }
        i13Var.b = jCurrentThreadTimeMillis;
        i13Var.a = w03Var;
        h13 h13Var = i13Var.c;
        if (h13Var == null) {
            return w03Var2;
        }
        h13Var.a = w03Var;
        return w03Var2;
    }

    public static w03 a() {
        w03 w03Var = b().a;
        if (w03Var != null) {
            return w03Var;
        }
        rf1 rf1VarB = b(no0.CUI_NAME_UNKNOWN, adultoid.formularize(), true);
        a(b(), rf1VarB);
        return rf1VarB;
    }
}
