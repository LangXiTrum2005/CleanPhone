package com.bytedance.sdk.openadsdk.nr;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.mj;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.ironsource.mediationsdk.metadata.a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static volatile HandlerThread ik = mj.ri("pag__bus_monitor", 0);
    private static volatile Handler ka;
    private static Boolean lr;
    private static volatile ri ri;

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler fi() {
        if (ik == null || !ik.isAlive()) {
            synchronized (vr.class) {
                try {
                    if (ik == null || !ik.isAlive()) {
                        ik = mj.ri("pag_init_handle", -1);
                        ka = new Handler(ik.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (ka == null) {
            synchronized (vr.class) {
                try {
                    if (ka == null) {
                        ka = new Handler(ik.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ka;
    }

    public static void lr(ka kaVar) {
        ri().ri(new fi(kaVar, 0, 1, 0));
    }

    public static void ik(ka kaVar) {
        ri().ri(new fi(kaVar, 0, 0, 1));
    }

    public static void lr() {
        ri().ri(true);
    }

    public static ri ri() {
        if (ri == null) {
            synchronized (ik.class) {
                try {
                    if (ri == null) {
                        ri = ri.ri(new lr() { // from class: com.bytedance.sdk.openadsdk.nr.ik.1
                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public Context getContext() {
                                return nr.ri();
                            }

                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public Handler getHandler() {
                                return ik.fi();
                            }

                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public int getOnceLogCount() {
                                int iRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("bus_monitor_config", "once_count", 10);
                                if (iRi > 100 || iRi < 5) {
                                    return 10;
                                }
                                return iRi;
                            }

                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public int getOnceLogInterval() {
                                int iRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("bus_monitor_config", "once_interval", 10000);
                                if (iRi < 10000) {
                                    return 10000;
                                }
                                return iRi;
                            }

                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public HandlerThread getSafeHandlerThread(String str, int i) {
                                return mj.ri(str, i);
                            }

                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public int getUploadIntervalTime() {
                                int iRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("bus_monitor_config", "interval", 86400000);
                                if (iRi < 3600000) {
                                    return 86400000;
                                }
                                return iRi;
                            }

                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public boolean isMonitorOpen() {
                                if (ik.lr != null) {
                                    return ik.lr.booleanValue();
                                }
                                Boolean unused = ik.lr = Boolean.valueOf(com.bytedance.sdk.openadsdk.wjv.fi.ri("bus_monitor_config", a.j, 1) == 1);
                                return ik.lr.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.nr.lr
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.nr.lr.ri> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.nr.lr.ri riVar : list) {
                                    com.bytedance.sdk.openadsdk.slm.ka.ri("bus_monitor", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.nr.ik.1.1
                                        @Override // com.bytedance.sdk.openadsdk.slm.lr
                                        public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", riVar.lr());
                                                jSONObject.put("scene", riVar.ik());
                                                jSONObject.put("start_count", riVar.ka());
                                                jSONObject.put("success_count", riVar.fi());
                                                jSONObject.put("fail_count", riVar.di());
                                                jSONObject.put("rit", riVar.xha());
                                                jSONObject.put("tag", riVar.mj());
                                                jSONObject.put("label", riVar.jbs());
                                                jSONObject.put("mediation", riVar.sf());
                                                jSONObject.put("is_init", riVar.co());
                                                jSONObject.put("extra", riVar.aw());
                                                jSONObject.put("date_device", riVar.qt());
                                                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("bus_monitor").lr(jSONObject.toString());
                                            } catch (Exception e) {
                                                ac.ri("BusMonitorUtils", "onMonitorUpload: ", e);
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
        return ri;
    }

    public static void ri(ka kaVar) {
        ri().ri(new fi(kaVar, 1, 0, 0));
    }
}
