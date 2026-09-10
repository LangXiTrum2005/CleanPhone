package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.lnr;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IPMiBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPMiBroadcastReceiver qdl;
    private qdl lnr;
    private int mml = 0;
    private final LruCache<String, ljh> ud;

    private IPMiBroadcastReceiver() {
        int i2 = 10;
        int iQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("ip_data_config", "ip_ad_cache_count", 10);
        if (iQdl > 0 && iQdl <= 200) {
            i2 = iQdl;
        }
        this.ud = new LruCache<>(i2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            fco.lnr(new jpc("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    final int i2;
                    final int i3;
                    final int i4;
                    try {
                        int intExtra = 0;
                        final int intExtra2 = intent.getIntExtra("errorCode", 0);
                        if (intExtra2 < 0) {
                            int intExtra3 = intent.getIntExtra("reason", 0);
                            if (intExtra2 == -4 && intExtra3 == -1) {
                                return;
                            } else {
                                i2 = intExtra3;
                            }
                        } else {
                            i2 = 0;
                        }
                        if (intExtra2 == 5) {
                            int intExtra4 = intent.getIntExtra("status", 0);
                            if (intExtra4 == -2) {
                                try {
                                    intExtra = intent.getIntExtra("progress", 0);
                                } catch (Throwable unused) {
                                    IPMiBroadcastReceiver.this.mml = 1;
                                }
                                if (intExtra < 100) {
                                    return;
                                }
                            }
                            i3 = intExtra4;
                            i4 = intExtra;
                        } else {
                            i3 = 0;
                            i4 = 0;
                        }
                        String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                        qdl qdlVar = IPMiBroadcastReceiver.this.lnr;
                        if (intExtra2 > 0 && qdlVar != null) {
                            qdlVar.qdl(stringExtra, intExtra2);
                        }
                        final ljh ljhVarQdl = IPMiBroadcastReceiver.this.qdl(stringExtra);
                        if (ljhVarQdl != null) {
                            lnr.qdl(System.currentTimeMillis(), ljhVarQdl, gy.qdl(ljhVarQdl), "ip_listener_log", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                                public JSONObject qdl() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", intExtra2);
                                        ljh ljhVar = ljhVarQdl;
                                        if (ljhVar != null) {
                                            jSONObject.put("ip_is_w2a", ljhVar.rdp());
                                        }
                                        int i5 = intExtra2;
                                        if (i5 > 0) {
                                            if (i5 == 5) {
                                                jSONObject.put("ip_status", i3);
                                                jSONObject.put("ip_exec_type", IPMiBroadcastReceiver.this.mml);
                                            }
                                            if (i3 == -2) {
                                                jSONObject.put("ip_progress", i4);
                                            }
                                        }
                                        if (intExtra2 < 0) {
                                            jSONObject.put("ip_reason", i2);
                                        }
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        aaj.lnr("IPMiBroadcastReceiver", th.getMessage());
                                        return null;
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        aaj.lnr("IPMiBroadcastReceiver", th.getMessage());
                    }
                }
            });
        }
    }

    public void qdl(String str, ljh ljhVar) {
        if (TextUtils.isEmpty(str) || ljhVar == null || this.ud.get(str) != null) {
            return;
        }
        this.ud.put(str, ljhVar);
    }

    public ljh qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ud.get(str);
    }

    public void qdl(qdl qdlVar) {
        this.lnr = qdlVar;
    }

    public void qdl() {
        this.lnr = null;
    }

    public static IPMiBroadcastReceiver qdl(Context context) {
        if (com.bytedance.sdk.openadsdk.jyq.qdl.qdl("ip_data_config", "ip_link_listener", 0) == 0) {
            return null;
        }
        if (qdl == null) {
            synchronized (IPMiBroadcastReceiver.class) {
                try {
                    if (qdl == null) {
                        qdl = new IPMiBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        if (Build.VERSION.SDK_INT >= 34 && gy.mo(context) >= 34) {
                            context.registerReceiver(qdl, intentFilter, 2);
                        } else {
                            context.registerReceiver(qdl, intentFilter);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public static void qdl(final Context context, ljh ljhVar) {
        koa koaVarGjm;
        if (qdl == null && ljhVar != null && (koaVarGjm = ljhVar.gjm()) != null && koaVarGjm.wd()) {
            rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPMiBroadcastReceiver.qdl(yt.qdl(context));
                    } catch (Throwable th) {
                        aaj.lnr("IPMiBroadcastReceiver", th.getMessage());
                    }
                }
            });
        }
    }
}
