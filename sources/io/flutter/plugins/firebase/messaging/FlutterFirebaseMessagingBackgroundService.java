package io.flutter.plugins.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g9.k;
import gj.o;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ni.c;
import ri.d;
import v9.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseMessagingBackgroundService extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f43400h = Collections.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static k f43401i;

    public static void d(Context context, Intent intent, boolean z10) {
        ComponentName componentName = new ComponentName(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        synchronized (a.f43404f) {
            o oVarB = a.b(context, componentName, true, IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, z10);
            oVarB.b(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED);
            try {
                oVarB.a(intent);
            } catch (IllegalStateException e10) {
                if (!z10) {
                    throw e10;
                }
                a.b(context, componentName, true, IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, false).a(intent);
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (f43401i == null) {
            f43401i = new k();
        }
        k kVar = f43401i;
        if (((AtomicBoolean) kVar.f41770b).get()) {
            return;
        }
        long j10 = a.a.f3311a.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
        if (j10 != 0) {
            if (((c) kVar.f41772d) != null) {
                Log.e("FLTFireBGExecutor", "Background isolate already started.");
                return;
            }
            d dVar = (d) e.F().f52503b;
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new gj.a(kVar, dVar, handler, j10));
        }
    }
}
