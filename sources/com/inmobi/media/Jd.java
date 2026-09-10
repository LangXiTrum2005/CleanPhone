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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f22908a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Id f22909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f22910c;

    public static void a() {
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        L3 l3 = L3.f22938a;
        if (l3.H()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (l3.x()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f22908a.clear();
    }

    public static void b() {
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        L3 l3 = L3.f22938a;
        if (l3.H()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (l3.x()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context contextD = Uc.d();
        if (contextD != null) {
            if (L3.f22938a.x() && "SYSTEM_CONNECTIVITY_CHANGE".equals(str) && f22909b != null) {
                Object systemService = contextD.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Id id = f22909b;
                    Intrinsics.c(id);
                    connectivityManager.unregisterNetworkCallback(id);
                    f22909b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f22908a;
            if (concurrentHashMap.get(str) != null) {
                contextD.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a(String str) {
        Context contextD = Uc.d();
        if (contextD != null) {
            if (L3.f22938a.x() && "SYSTEM_CONNECTIVITY_CHANGE".equals(str)) {
                Object systemService = contextD.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Id id = new Id();
                    f22909b = id;
                    connectivityManager.registerDefaultNetworkCallback(id);
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f22908a;
            if (concurrentHashMap.get(str) == null) {
                Hd hd = new Hd();
                concurrentHashMap.put(str, hd);
                B2.a(contextD, hd, new IntentFilter(str));
            }
        }
    }

    public static final void a(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        try {
            intent.getAction();
            boolean zIsDeviceIdleMode = false;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != f22910c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            zIsDeviceIdleMode = true;
                        }
                        f22910c = zIsDeviceIdleMode;
                        Uc.f().b(new C2978d2(10, 4, f22910c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null && L3.f22938a.H()) {
                    zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                }
                if (zIsDeviceIdleMode == f22910c || !L3.f22938a.H()) {
                    return;
                }
                Uc.f().b(new C2978d2(11, 4, String.valueOf(zIsDeviceIdleMode)));
                return;
            }
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                Uc.f().b(new C2978d2(100, 6, (String) null));
                return;
            }
            if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
                Uc.f().b(new C2978d2(1, 6, (String) null));
                Iterator it = f22908a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                f22908a.clear();
                f22909b = null;
                return;
            }
            if ("android.intent.action.REBOOT".equals(intent.getAction())) {
                Uc.f().b(new C2978d2(2, 6, (String) null));
                Iterator it2 = f22908a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                f22908a.clear();
                f22909b = null;
                return;
            }
            Uc.f().b(new C2978d2(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
