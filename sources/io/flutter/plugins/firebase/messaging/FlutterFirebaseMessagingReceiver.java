package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ironsource.ph;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import zc.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f43402a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f43403b = Executors.newSingleThreadExecutor();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (a.a.f3311a == null) {
            Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            Log.d("FLTFireContextHolder", "received application context.");
            a.a.f3311a = applicationContext;
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        t tVar = new t(intent.getExtras());
        if (tVar.m() != null) {
            f43402a.put(tVar.h(), tVar);
        }
        f43403b.execute(new ph(tVar, context, goAsync(), 26));
    }
}
