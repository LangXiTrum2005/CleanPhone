package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class su {
    private static final Object ri = new Object();
    private static final Map<ri, Object> lr = new ConcurrentHashMap();
    private static final AtomicInteger ik = new AtomicInteger();
    private static AtomicBoolean ka = new AtomicBoolean(false);
    private static volatile int fi = -1;
    private static volatile long di = 0;
    private static volatile int xha = 60000;
    private static tan mj = null;
    private static final AtomicBoolean jbs = new AtomicBoolean(false);

    public static class lr extends BroadcastReceiver {
        private lr() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                su.lr(context, intent, su.ik.get() > 0, false);
            } catch (Throwable unused) {
            }
        }
    }

    public interface ri {
        void ri(Context context, Intent intent, boolean z, int i);
    }

    private static int ik(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        tan tanVar = mj;
                        return (tanVar == null || !tanVar.ri(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            fi = 0;
        } else if (jbs.compareAndSet(false, true)) {
            com.bytedance.sdk.component.mj.ri.ri(new Runnable() { // from class: com.bytedance.sdk.component.utils.su.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = su.fi = z2 ? 0 : su.lr(context);
                    su.jbs.set(false);
                    boolean z3 = su.fi == 0;
                    boolean z4 = z;
                    if ((z4 || !z3) && z4) {
                        su.lr(context, intent, su.fi, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(Context context, Intent intent, int i, boolean z) {
        Map<ri, Object> map = lr;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (ri riVar : map.keySet()) {
            if (riVar != null) {
                try {
                    riVar.ri(context, intent, !z, i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int ri(Context context, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (di + j <= jElapsedRealtime) {
            return lr(context);
        }
        if (fi == -1) {
            return lr(context);
        }
        if (jElapsedRealtime - di >= xha) {
            lr(context, (Intent) null, false, false);
        }
        return fi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lr(Context context) {
        fi = ik(context);
        di = SystemClock.elapsedRealtime();
        return fi;
    }

    public static void ri(ri riVar, Context context) {
        if (riVar == null) {
            return;
        }
        if (!ka.get()) {
            try {
                context.registerReceiver(new lr(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                ka.set(true);
            } catch (Throwable unused) {
            }
        }
        Map<ri, Object> map = lr;
        map.put(riVar, ri);
        ik.set(map.size());
    }

    public static void ri(ri riVar) {
        if (riVar == null) {
            return;
        }
        Map<ri, Object> map = lr;
        map.remove(riVar);
        ik.set(map.size());
    }
}
