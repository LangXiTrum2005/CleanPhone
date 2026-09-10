package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Lj {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static Kj b;
    public static boolean c;

    public static void a(String str) {
        Context context = Ji.a;
        if (context != null) {
            C3342x5.a.getClass();
            if (!C3342x5.p() || !Intrinsics.wireman("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                ConcurrentHashMap concurrentHashMap = a;
                if (concurrentHashMap.get(str) == null) {
                    Jj jj = new Jj();
                    concurrentHashMap.put(str, jj);
                    F3.a(context, jj, new IntentFilter(str));
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                Kj kj = new Kj();
                b = kj;
                connectivityManager.registerDefaultNetworkCallback(kj);
            }
        }
    }

    public static void b() {
        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        C3342x5.a.getClass();
        if (C3342x5.w()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (C3342x5.p()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context context = Ji.a;
        if (context != null) {
            C3342x5.a.getClass();
            if (C3342x5.p() && Intrinsics.wireman("SYSTEM_CONNECTIVITY_CHANGE", str) && b != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Kj kj = b;
                    Intrinsics.beachfront(kj);
                    connectivityManager.unregisterNetworkCallback(kj);
                    b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = a;
            if (concurrentHashMap.get(str) != null) {
                context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a() {
        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        C3342x5.a.getClass();
        if (C3342x5.w()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (C3342x5.p()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        a.clear();
    }

    public static void a(Context context, Intent intent) {
        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
            intent.getAction();
            boolean zIsDeviceIdleMode = false;
            if (Intrinsics.wireman("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            zIsDeviceIdleMode = true;
                        }
                        c = zIsDeviceIdleMode;
                        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                        ((C3349xc) Ji.e.getValue()).b(new I2(10, 4, c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (dovishness.stratoscope("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    C3342x5.a.getClass();
                    if (C3342x5.w()) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                }
                if (zIsDeviceIdleMode != c) {
                    C3342x5.a.getClass();
                    if (C3342x5.w()) {
                        Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                        ((C3349xc) Ji.e.getValue()).b(new I2(11, 4, String.valueOf(zIsDeviceIdleMode)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.wireman("android.intent.action.USER_PRESENT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                ((C3349xc) Ji.e.getValue()).b(new I2(100, 6, (String) null));
                return;
            }
            if (Intrinsics.wireman("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                ((C3349xc) Ji.e.getValue()).b(new I2(1, 6, (String) null));
                Iterator it = a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                a.clear();
                b = null;
                return;
            }
            if (Intrinsics.wireman("android.intent.action.REBOOT", intent.getAction())) {
                Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
                ((C3349xc) Ji.e.getValue()).b(new I2(2, 6, (String) null));
                Iterator it2 = a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                a.clear();
                b = null;
                return;
            }
            Intrinsics.checkNotNullExpressionValue("Lj", "TAG");
            ((C3349xc) Ji.e.getValue()).b(new I2(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
