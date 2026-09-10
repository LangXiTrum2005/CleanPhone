package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class dw {
    private static String ik = null;
    private static volatile boolean ka = true;
    private static String lr;
    private static String ri;

    public static class ri extends com.bytedance.sdk.component.mj.lr.ik {
        public static AtomicBoolean ri = new AtomicBoolean(false);
        private static final AtomicLong lr = new AtomicLong(0);

        public ri(String str, int i) {
            super(str, i);
        }

        public static void ri() {
            if (ri.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = lr;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            dzy.ik((Runnable) new ri("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            ri.set(true);
            dw.fi();
            ri.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fi() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.nr.ri() == null) {
            return;
        }
        ka = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.nr.ri().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    ka = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                ri = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                lr = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            ik = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String ik() {
        ri.ri();
        return ik;
    }

    public static String lr() {
        try {
            ri.ri();
            if (!ka) {
                StringBuilder sb = new StringBuilder("getMCC");
                sb.append(ka ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.ac.ik("MCC", sb.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.nr.ri().getResources().getConfiguration();
            int i = configuration.mcc;
            String strValueOf = i != 0 ? String.valueOf(i) : lr;
            com.bytedance.sdk.component.utils.ac.ik("MCC", "config=" + configuration.mcc + ",sMCC=" + lr);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String ri() {
        ri.ri();
        return ri;
    }
}
