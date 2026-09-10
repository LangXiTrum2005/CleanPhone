package ej;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dj.k;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qd.i;
import t9.e;
import xi.f;
import xi.g;
import xi.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lej/d;", "Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;", "Lti/b;", "Lfj/d;", "Lxi/h;", "<init>", "()V", "firebase_crashlytics_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class d implements FlutterFirebasePlugin, ti.b, fj.d, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f40107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f40108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40109c;

    public static void a(jk.b bVar, Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "An unknown error occurred";
        }
        bVar.invoke(new wj.h(e.c(new fj.e(message))));
    }

    public static boolean b(mb.g gVar) {
        gVar.a();
        Context context = gVar.f45928a;
        n.e(context, "getApplicationContext(...)");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        n.e(sharedPreferences, "getSharedPreferences(...)");
        boolean z10 = true;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            return sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        gVar.a();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            n.e(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                z10 = bundle.getBoolean("firebase_crashlytics_collection_enabled");
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
        }
        vb.c.a().b(z10);
        return z10;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new cj.g(3, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        n.e(task, "getTask(...)");
        return task;
    }

    @Override // xi.h
    public final void g(g gVar) {
        this.f40108b = gVar;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(mb.g firebaseApp) {
        n.f(firebaseApp, "firebaseApp");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(firebaseApp, this, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        n.e(task, "getTask(...)");
        return task;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        String strB;
        n.f(binding, "binding");
        Context context = binding.f50787a;
        n.e(context, "getApplicationContext(...)");
        try {
            File file = new File(context.getApplicationInfo().nativeLibraryDir, "libapp.so");
            strB = file.exists() ? c.b(new a4.a(file, 22)) : c.a(context);
        } catch (Exception e10) {
            Log.d("FLTFirebaseCrashlytics", "Could not read ELF build ID from libapp.so", e10);
            strB = null;
        } catch (OutOfMemoryError e11) {
            Log.d("FLTFirebaseCrashlytics", "Could not read ELF build ID from libapp.so", e11);
            strB = null;
        }
        this.f40109c = strB;
        f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
        fj.c.b(fj.d.f40961h9, fVar, this);
        i iVar = new i(fVar, "plugins.flutter.io/firebase_crashlytics_test_stream");
        iVar.A(this);
        this.f40107a = iVar;
    }

    @Override // xi.h
    public final void onCancel() {
        this.f40108b = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        fj.c.b(fj.d.f40961h9, fVar, null);
        i iVar = this.f40107a;
        if (iVar != null) {
            iVar.A(null);
        }
        this.f40107a = null;
    }
}
