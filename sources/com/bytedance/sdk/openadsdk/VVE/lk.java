package com.bytedance.sdk.openadsdk.VVE;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.umeng.analytics.pro.bc;
import com.umeng.ccg.a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static Boolean LD;
    private static volatile Lxb Lxb;
    private static volatile Handler ZU;
    private static volatile HandlerThread lk;

    static {
        HandlerThread handlerThread = new HandlerThread("pag__bus_monitor", 0);
        lk = handlerThread;
        handlerThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler JXs() {
        if (lk == null || !lk.isAlive()) {
            synchronized (STP.class) {
                try {
                    if (lk == null || !lk.isAlive()) {
                        HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                        lk = handlerThread;
                        handlerThread.start();
                        ZU = new Handler(lk.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (ZU == null) {
            synchronized (STP.class) {
                try {
                    if (ZU == null) {
                        ZU = new Handler(lk.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ZU;
    }

    public static void LD(ZU zu) {
        Lxb().Lxb(new JXs(zu, 0, 1, 0));
    }

    public static void LD() {
        Lxb().Lxb(true);
    }

    public static Lxb Lxb() {
        if (Lxb == null) {
            synchronized (lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = Lxb.Lxb(new LD() { // from class: com.bytedance.sdk.openadsdk.VVE.lk.1
                            @Override // com.bytedance.sdk.openadsdk.VVE.LD
                            public Context getContext() {
                                return kqm.Lxb();
                            }

                            @Override // com.bytedance.sdk.openadsdk.VVE.LD
                            public Handler getHandler() {
                                return lk.JXs();
                            }

                            @Override // com.bytedance.sdk.openadsdk.VVE.LD
                            public int getOnceLogCount() {
                                int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("bus_monitor_config", "once_count", 10);
                                if (iLxb > 100 || iLxb < 5) {
                                    return 10;
                                }
                                return iLxb;
                            }

                            @Override // com.bytedance.sdk.openadsdk.VVE.LD
                            public int getOnceLogInterval() {
                                int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("bus_monitor_config", "once_interval", 10000);
                                if (iLxb < 10000) {
                                    return 10000;
                                }
                                return iLxb;
                            }

                            @Override // com.bytedance.sdk.openadsdk.VVE.LD
                            public int getUploadIntervalTime() {
                                int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("bus_monitor_config", bc.ba, 43200000);
                                if (iLxb < 3600000) {
                                    return 86400000;
                                }
                                return iLxb;
                            }

                            @Override // com.bytedance.sdk.openadsdk.VVE.LD
                            public boolean isMonitorOpen() {
                                if (lk.LD != null) {
                                    return lk.LD.booleanValue();
                                }
                                Boolean unused = lk.LD = Boolean.valueOf(com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("bus_monitor_config", "enable", 0) == 1);
                                return lk.LD.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.VVE.LD
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.VVE.LD.Lxb> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxb : list) {
                                    com.bytedance.sdk.openadsdk.STP.lk.Lxb();
                                    com.bytedance.sdk.openadsdk.STP.lk.Lxb("bus_monitor", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.VVE.lk.1.1
                                        @Override // com.bytedance.sdk.openadsdk.STP.LD
                                        public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", lxb.LD());
                                                jSONObject.put(a.j, lxb.lk());
                                                jSONObject.put("start_count", lxb.ZU());
                                                jSONObject.put("success_count", lxb.JXs());
                                                jSONObject.put("fail_count", lxb.lc());
                                                jSONObject.put("rit", lxb.ebl());
                                                jSONObject.put("tag", lxb.OY());
                                                jSONObject.put("label", lxb.QAg());
                                                jSONObject.put("mediation", lxb.JVA());
                                                jSONObject.put("is_init", lxb.sLN());
                                                jSONObject.put("extra", lxb.NXR());
                                                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("bus_monitor").LD(jSONObject.toString());
                                            } catch (Exception e) {
                                                sLN.Lxb("BusMonitorUtils", "onMonitorUpload: ", e);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public static void lk(ZU zu) {
        Lxb().Lxb(new JXs(zu, 0, 0, 1));
    }

    public static void Lxb(ZU zu) {
        Lxb().Lxb(new JXs(zu, 1, 0, 0));
    }
}
