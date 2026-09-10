package hj;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhj/f;", "Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;", "Lti/b;", "Lhj/d;", "<init>", "()V", "firebase_performance_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class f implements FlutterFirebasePlugin, ti.b, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f42368a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f42369b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f42370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f42371d;

    public static void a(jk.b bVar, Exception exc) {
        bVar.invoke(new wj.h(t9.e.c(new e(exc.getMessage()))));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new cj.g(7, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        n.e(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(mb.g firebaseApp) {
        n.f(firebaseApp, "firebaseApp");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new cj.g(8, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        n.e(task, "getTask(...)");
        return task;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_performance", this);
        c.b(d.f42365m9, fVar, this);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        c.b(d.f42365m9, fVar, null);
    }
}
