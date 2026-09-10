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
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class HD {
    private static final Object Lxb = new Object();
    private static final Map<Lxb, Object> LD = new ConcurrentHashMap();
    private static AtomicBoolean lk = new AtomicBoolean(false);
    private static volatile int ZU = -1;
    private static volatile long JXs = 0;
    private static volatile int lc = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private static VVE ebl = null;
    private static final AtomicBoolean OY = new AtomicBoolean(false);

    public static class LD extends BroadcastReceiver {
        private LD() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (HD.LD != null && HD.LD.size() > 0) {
                z = true;
            }
            HD.LD(context, intent, z, booleanExtra);
        }
    }

    public interface Lxb {
        void Lxb(Context context, Intent intent, boolean z, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            ZU = 0;
        } else if (OY.compareAndSet(false, true)) {
            com.bytedance.sdk.component.OY.lc.LD(new com.bytedance.sdk.component.OY.OY("getNetworkType") { // from class: com.bytedance.sdk.component.utils.HD.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = HD.ZU = z2 ? 0 : HD.LD(context);
                    HD.OY.set(false);
                    if (z) {
                        HD.LD(context, intent, HD.ZU, z2);
                    }
                }
            });
        }
    }

    private static int lk(Context context) {
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
                        VVE vve = ebl;
                        return (vve == null || !vve.Lxb(context, telephonyManager)) ? 5 : 6;
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
    public static void LD(Context context, Intent intent, int i, boolean z) {
        Map<Lxb, Object> map = LD;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Lxb lxb : map.keySet()) {
            if (lxb != null) {
                lxb.Lxb(context, intent, !z, i);
            }
        }
    }

    public static int Lxb(Context context, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (JXs + j <= jElapsedRealtime) {
            return LD(context);
        }
        if (ZU == -1) {
            return LD(context);
        }
        if (jElapsedRealtime - JXs >= lc) {
            LD(context, (Intent) null, false, false);
        }
        return ZU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int LD(Context context) {
        ZU = lk(context);
        JXs = SystemClock.elapsedRealtime();
        return ZU;
    }

    public static void Lxb(Lxb lxb, Context context) {
        if (lxb == null) {
            return;
        }
        if (!lk.get()) {
            try {
                context.registerReceiver(new LD(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                lk.set(true);
            } catch (Throwable unused) {
            }
        }
        LD.put(lxb, Lxb);
    }

    public static void Lxb(Lxb lxb) {
        if (lxb == null) {
            return;
        }
        LD.remove(lxb);
    }
}
