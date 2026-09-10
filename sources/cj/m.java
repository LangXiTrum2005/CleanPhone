package cj;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcj/m;", "Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;", "Lti/b;", "Lcj/e;", "<init>", "()V", "firebase_analytics_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class m implements FlutterFirebasePlugin, ti.b, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FirebaseAnalytics f6466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f6467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xi.f f6468c;

    public static Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, null);
            } else if (value instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof Map) {
                        Bundle bundleA = a((Map) obj);
                        if (bundleA != null) {
                            arrayList.add(bundleA);
                        }
                    } else if (obj != null) {
                        throw new IllegalArgumentException(l1.d.g("Unsupported value type: ", obj.getClass().getCanonicalName(), " in list at key ", str));
                    }
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException(defpackage.e.n("Unsupported value type: ", value.getClass().getCanonicalName()));
                }
                bundle.putParcelable(str, a((Map) value));
            }
        }
        return bundle;
    }

    public static void b(Task task, jk.b bVar) {
        String message;
        if (task.isSuccessful()) {
            bVar.invoke(new wj.h(task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        bVar.invoke(new wj.h(t9.e.c(new f("firebase_analytics", message))));
    }

    public static void c(Task task, jk.b bVar) {
        String message;
        if (task.isSuccessful()) {
            bVar.invoke(new wj.h(r.f53297a));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        bVar.invoke(new wj.h(t9.e.c(new f("firebase_analytics", message))));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(1, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        n.e(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(mb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(0, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        n.e(task, "getTask(...)");
        return task;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        Context context = binding.f50787a;
        n.e(context, "getApplicationContext(...)");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        n.e(firebaseAnalytics, "getInstance(...)");
        this.f6466a = firebaseAnalytics;
        this.f6467b = new p(fVar, "plugins.flutter.io/firebase_analytics");
        d.b(e.P8, fVar, this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
        this.f6468c = fVar;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        p pVar = this.f6467b;
        if (pVar != null) {
            pVar.b(null);
        }
        xi.f fVar = this.f6468c;
        if (fVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        d.b(e.P8, fVar, null);
        this.f6467b = null;
        this.f6468c = null;
    }
}
