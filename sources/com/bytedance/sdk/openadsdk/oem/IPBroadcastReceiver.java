package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.mj.lr.ik;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.model.zf;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPBroadcastReceiver ri;
    private ri ik;
    private int ka = 0;
    private final LruCache<String, wjv> lr;

    private IPBroadcastReceiver() {
        int i = 10;
        int iRi = fi.ri("ip_data_config", "ip_ad_cache_count", 10);
        if (iRi > 0 && iRi <= 200) {
            i = iRi;
        }
        this.lr = new LruCache<>(i);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            ri(intent);
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            lr(intent);
        }
    }

    private void lr(final Intent intent) {
        if (intent == null) {
            return;
        }
        dzy.lr(new ik("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int intExtra = intent.getIntExtra("event_type", 0);
                    final String stringExtra = intent.getStringExtra("event_track");
                    if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                        final String stringExtra2 = intent.getStringExtra("event_id");
                        final String stringExtra3 = intent.getStringExtra("app_package_name");
                        final String stringExtra4 = intent.getStringExtra("market_version");
                        final String stringExtra5 = intent.getStringExtra("caller");
                        final int iRi = lr.ri(intExtra);
                        final int iLr = lr.lr(intExtra);
                        String.format("eventId: %s, eventType: %s, eventTrack: %s, appPackage: %s, marketVersion: %s, caller: %s, errorCode: %s, status: %s", stringExtra2, Integer.valueOf(intExtra), stringExtra, stringExtra3, stringExtra4, stringExtra5, Integer.valueOf(iRi), Integer.valueOf(iLr));
                        ri riVar = IPBroadcastReceiver.this.ik;
                        if (iRi > 0 && riVar != null) {
                            riVar.ri(stringExtra3, iRi);
                        }
                        final wjv wjvVarRi = IPBroadcastReceiver.this.ri(stringExtra3);
                        if (wjvVarRi != null) {
                            com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVarRi, ig.ri(wjvVarRi), "ip_listener_log", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                                public JSONObject ri() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", iRi);
                                        jSONObject.put("ip_market_version", stringExtra4);
                                        jSONObject.put("ip_app_pkg", stringExtra3);
                                        jSONObject.put("ip_caller_pkg", stringExtra5);
                                        jSONObject.put("ip_event_id", stringExtra2);
                                        jSONObject.put("ip_event_track", stringExtra);
                                        jSONObject.put("ip_status", iLr);
                                        jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.ka);
                                        wjv wjvVar = wjvVarRi;
                                        if (wjvVar != null) {
                                            jSONObject.put("ip_is_w2a", wjvVar.nr());
                                            if (wjvVarRi.xz() != null) {
                                                jSONObject.put("ip_oem_type", wjvVarRi.xz().di());
                                                return jSONObject;
                                            }
                                        }
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        ac.ri("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    ac.ri("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                    IPBroadcastReceiver.this.ka = 2;
                }
            }
        });
    }

    public static void lr(final Context context, final wjv wjvVar) {
        zf zfVarXz;
        if (ri != null || wjvVar == null || (zfVarXz = wjvVar.xz()) == null) {
            return;
        }
        if (zfVarXz.xha() || zfVarXz.mj()) {
            vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPBroadcastReceiver.ri(nr.ri(context), wjvVar);
                    } catch (Throwable th) {
                        ac.ri("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th);
                    }
                }
            });
        }
    }

    public void ri(String str, wjv wjvVar) {
        if (TextUtils.isEmpty(str) || wjvVar == null || this.lr.get(str) != null) {
            return;
        }
        this.lr.put(str, wjvVar);
    }

    public wjv ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.lr.get(str);
    }

    public void ri(ri riVar) {
        this.ik = riVar;
    }

    public void ri() {
        this.ik = null;
    }

    private void ri(final Intent intent) {
        if (intent == null) {
            return;
        }
        dzy.lr(new ik("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                final int i;
                final int i2;
                final int i3;
                try {
                    int intExtra = 0;
                    final int intExtra2 = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                    if (intExtra2 < 0) {
                        int intExtra3 = intent.getIntExtra("reason", 0);
                        if (intExtra2 == -4 && intExtra3 == -1) {
                            return;
                        } else {
                            i = intExtra3;
                        }
                    } else {
                        i = 0;
                    }
                    if (intExtra2 == 5) {
                        int intExtra4 = intent.getIntExtra("status", 0);
                        if (intExtra4 == -2) {
                            try {
                                intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_PROGRESS, 0);
                            } catch (Throwable unused) {
                                IPBroadcastReceiver.this.ka = 1;
                            }
                            if (intExtra < 100) {
                                return;
                            }
                        }
                        i2 = intExtra4;
                        i3 = intExtra;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                    ri riVar = IPBroadcastReceiver.this.ik;
                    if (intExtra2 > 0 && riVar != null) {
                        riVar.ri(stringExtra, intExtra2);
                    }
                    final wjv wjvVarRi = IPBroadcastReceiver.this.ri(stringExtra);
                    if (wjvVarRi != null) {
                        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVarRi, ig.ri(wjvVarRi), "ip_listener_log", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                            public JSONObject ri() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("ip_error_code", intExtra2);
                                    wjv wjvVar = wjvVarRi;
                                    if (wjvVar != null) {
                                        jSONObject.put("ip_is_w2a", wjvVar.nr());
                                    }
                                    int i4 = intExtra2;
                                    if (i4 > 0) {
                                        if (i4 == 5) {
                                            jSONObject.put("ip_status", i2);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.ka);
                                        }
                                        if (i2 == -2) {
                                            jSONObject.put("ip_progress", i3);
                                        }
                                    }
                                    if (intExtra2 < 0) {
                                        jSONObject.put("ip_reason", i);
                                    }
                                    return jSONObject;
                                } catch (Throwable th) {
                                    ac.ri("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    ac.ri("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                }
            }
        });
    }

    public static IPBroadcastReceiver ri(Context context, wjv wjvVar) {
        zf zfVarXz;
        if (fi.ri("ip_data_config", "ip_link_listener", 0) == 0 || wjvVar == null || (zfVarXz = wjvVar.xz()) == null) {
            return null;
        }
        if (ri == null) {
            synchronized (IPBroadcastReceiver.class) {
                try {
                    if (ri == null) {
                        ri = new IPBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter();
                        if (zfVarXz.xha()) {
                            intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        } else if (zfVarXz.mj()) {
                            intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                        }
                        if (Build.VERSION.SDK_INT >= 34 && ig.di(context) >= 34) {
                            context.registerReceiver(ri, intentFilter, 2);
                        } else {
                            context.registerReceiver(ri, intentFilter);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }
}
