package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lm4/b;", "Landroidx/lifecycle/v;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ProcessLifecycleInitializer implements m4.b {
    @Override // m4.b
    public final Object create(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        m4.a aVarC = m4.a.c(context);
        kotlin.jvm.internal.n.e(aVarC, "getInstance(context)");
        if (!aVarC.f45867b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!s.f4589a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.n.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        k0 k0Var = k0.f4555h;
        k0Var.getClass();
        k0Var.f4560e = new Handler();
        k0Var.f4561f.e(m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new j0(k0Var));
        return k0Var;
    }

    @Override // m4.b
    public final List dependencies() {
        return xj.v.f53866a;
    }
}
