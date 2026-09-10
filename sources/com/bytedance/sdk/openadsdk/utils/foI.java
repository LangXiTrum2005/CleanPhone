package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class foI {
    private static String LD = null;
    private static String Lxb = null;
    private static volatile boolean ZU = true;
    private static String lk;

    public static class Lxb extends com.bytedance.sdk.component.OY.OY {
        public static AtomicBoolean Lxb = new AtomicBoolean(false);
        private static final AtomicLong LD = new AtomicLong(0);

        public Lxb(String str, int i) {
            super(str, i);
        }

        public static void Lxb() {
            if (Lxb.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = LD;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            hg.LD((com.bytedance.sdk.component.OY.OY) new Lxb("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            Lxb.set(true);
            foI.JXs();
            Lxb.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void JXs() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.kqm.Lxb() == null) {
            return;
        }
        ZU = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    ZU = false;
                }
                com.bytedance.sdk.component.utils.sLN.Lxb("MCC", ZU ? "Have SIM card" : "No SIM card");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("SimUtils", th.getMessage());
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
                Lxb = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                LD = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            lk = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String LD() {
        try {
            Lxb.Lxb();
            if (!ZU) {
                StringBuilder sb = new StringBuilder("getMCC");
                sb.append(ZU ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.sLN.Lxb("MCC", sb.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getResources().getConfiguration();
            int i = configuration.mcc;
            String strValueOf = i != 0 ? String.valueOf(i) : LD;
            com.bytedance.sdk.component.utils.sLN.Lxb("MCC", "config=" + configuration.mcc + ",sMCC=" + LD);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String Lxb() {
        Lxb.Lxb();
        return Lxb;
    }

    public static String lk() {
        Lxb.Lxb();
        return lk;
    }
}
