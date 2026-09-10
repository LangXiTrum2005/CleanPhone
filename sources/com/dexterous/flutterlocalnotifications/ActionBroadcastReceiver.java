package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Keep;
import b0.l0;
import ea.f2;
import g9.k;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f2 f10540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ni.c f10541c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f7.a f10542a;

    @Keep
    public ActionBroadcastReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            f7.a aVar = this.f10542a;
            if (aVar == null) {
                aVar = new f7.a(context, 0);
            }
            this.f10542a = aVar;
            Map<String, Object> mapExtractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int iIntValue = ((Integer) mapExtractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = mapExtractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    new l0(context).a(iIntValue, (String) obj);
                } else {
                    new l0(context).a(iIntValue, null);
                }
            }
            if (f10540b == null) {
                f10540b = new f2(7);
            }
            f2 f2Var = f10540b;
            xi.g gVar = (xi.g) f2Var.f39410c;
            if (gVar != null) {
                gVar.b(mapExtractNotificationResponseMap);
            } else {
                ((ArrayList) f2Var.f39409b).add(mapExtractNotificationResponseMap);
            }
            if (f10541c != null) {
                Log.e("ActionBroadcastReceiver", "Engine is already initialised");
                return;
            }
            ri.d dVar = (ri.d) v9.e.F().f52503b;
            dVar.d(context);
            dVar.a(context, null);
            f10541c = new ni.c(context);
            FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f10542a.f40681b.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
            if (flutterCallbackInformationLookupCallbackInformation == null) {
                Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
                return;
            }
            n.j jVar = f10541c.f46739c;
            new qd.i((na.g) jVar.f46324f, "dexterous.com/flutter/local_notifications/actions").A(f10540b);
            jVar.c(new k(context.getAssets(), (String) dVar.f49603d.f5778c, flutterCallbackInformationLookupCallbackInformation, 26));
        }
    }
}
