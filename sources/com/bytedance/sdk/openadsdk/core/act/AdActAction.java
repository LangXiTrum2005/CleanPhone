package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.nBu;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AdActAction {
    private Long IeN;
    private String JXs;
    private Context LD;
    private ActServiceConnection OY;
    private BindCustomTabsServiceCallback VVE;
    private String ZU;
    private CustomTabsSession ebl;
    private tD lk;
    private CustomTabsClient lc = null;
    private boolean QAg = false;
    private boolean nBu = false;
    private boolean JVA = false;
    private boolean sLN = false;
    private boolean NXR = false;
    private long STP = 0;
    private LD kqm = new LD() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1
        @Override // com.bytedance.sdk.openadsdk.core.act.LD
        public void Lxb(final CustomTabsClient customTabsClient) {
            if (hg.JXs()) {
                AdActAction.this.Lxb(customTabsClient);
            } else {
                hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdActAction.this.Lxb(customTabsClient);
                    }
                });
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.act.LD
        public void Lxb() {
            AdActAction.this.lc = null;
            AdActAction.this.OY = null;
            AdActAction.this.ebl = null;
        }
    };
    public EngagementSignalsCallback Lxb = new PAGEngagementSignalsCallback();
    private CustomTabsCallback brP = new PAGCustomTabsCallback();

    public interface BindCustomTabsServiceCallback {
        void onBindFail(int i, String str);

        void onBindSuccess(CustomTabsSession customTabsSession);
    }

    public class PAGCustomTabsCallback extends CustomTabsCallback {
        public PAGCustomTabsCallback() {
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, @Nullable Bundle bundle) {
            if (i == 1) {
                AdActAction.this.IeN = Long.valueOf(SystemClock.elapsedRealtime());
                if (AdActAction.this.sLN || AdActAction.this.lk == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    AdActAction.this.Lxb("load_start", jSONObject, 0L);
                    AdActAction.this.sLN = true;
                    return;
                } catch (Throwable th) {
                    sLN.Lxb("AdActAction", th.getMessage());
                    return;
                }
            }
            if (i == 2) {
                if (AdActAction.this.nBu || AdActAction.this.IeN == null || AdActAction.this.lk == null) {
                    return;
                }
                long jLongValue = AdActAction.this.IeN.longValue() - SystemClock.elapsedRealtime();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("first_page", true);
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.put("url", AdActAction.this.JXs);
                    jSONObject2.put("preload_h5_type", AdActAction.this.lk.XM());
                    AdActAction.this.Lxb("load_finish", jSONObject2, jLongValue);
                    AdActAction.this.nBu = true;
                    return;
                } catch (Throwable th2) {
                    sLN.Lxb("AdActAction", th2.getMessage());
                    return;
                }
            }
            if (i != 3) {
                if (i != 6) {
                    return;
                }
                AdActAction.this.Lxb();
                if (AdActAction.this.NXR || AdActAction.this.lk == null || AdActAction.this.JVA || AdActAction.this.nBu || AdActAction.this.IeN == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(AdActAction.this.lk, nJ.Lxb(AdActAction.this.lk), SystemClock.elapsedRealtime() - AdActAction.this.IeN.longValue(), 0, 1);
                return;
            }
            if (AdActAction.this.JVA || AdActAction.this.lk == null) {
                return;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("render_type", "h5");
                jSONObject3.putOpt("render_type_2", 0);
                jSONObject3.put("url", AdActAction.this.JXs);
                jSONObject3.put("preload_h5_type", AdActAction.this.lk.XM());
                AdActAction.this.Lxb("load_fail", jSONObject3, 0L);
                AdActAction.this.JVA = true;
            } catch (Throwable th3) {
                sLN.Lxb("AdActAction", th3.getMessage());
            }
        }
    }

    public class PAGEngagementSignalsCallback implements EngagementSignalsCallback {
        public PAGEngagementSignalsCallback() {
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int i, @NonNull Bundle bundle) {
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onSessionEnded(boolean z, @NonNull Bundle bundle) {
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z, @NonNull Bundle bundle) {
            AdActAction.this.STP = System.currentTimeMillis();
            if (AdActAction.this.lk == null || AdActAction.this.QAg) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", AdActAction.this.JXs);
                jSONObject.put("down_time", AdActAction.this.STP);
                long jCurrentTimeMillis = System.currentTimeMillis();
                jSONObject.put("up_time", jCurrentTimeMillis);
                com.bytedance.sdk.openadsdk.ZU.lk.LD(AdActAction.this.lk, nJ.Lxb(AdActAction.this.lk), "in_web_click", jSONObject, jCurrentTimeMillis - AdActAction.this.STP);
            } catch (Throwable th) {
                sLN.Lxb("AdActAction", th.getMessage());
            }
            if (!TextUtils.isEmpty(tD.Lxb(AdActAction.this.LD, AdActAction.this.lk))) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, AdActAction.this.lk, new nBu.Lxb().LD(AdActAction.this.STP).Lxb(System.currentTimeMillis()).LD(QAg.LD().Lxb() ? 1 : 2).lk(le.ebl(AdActAction.this.LD)).Lxb(le.JXs(AdActAction.this.LD)).LD(le.lc(AdActAction.this.LD)).Lxb(), nJ.Lxb(AdActAction.this.lk), true, (Map<String, Object>) new HashMap(), 2);
            }
            AdActAction.this.QAg = true;
        }
    }

    public AdActAction(Context context, tD tDVar, String str, String str2) {
        this.LD = context;
        this.lk = tDVar;
        this.ZU = str;
        this.JXs = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(CustomTabsClient customTabsClient) {
        this.lc = customTabsClient;
        this.ebl = customTabsClient.newSession(this.brP);
        com.bytedance.sdk.openadsdk.STP.Lxb.LD ldLxb = Lxb(9);
        try {
            CustomTabsSession customTabsSession = this.ebl;
            Bundle bundle = Bundle.EMPTY;
            if (customTabsSession.isEngagementSignalsApiAvailable(bundle)) {
                boolean engagementSignalsCallback = this.ebl.setEngagementSignalsCallback(this.Lxb, bundle);
                ldLxb.lk(1);
                Lxb.Lxb(1);
                if (engagementSignalsCallback) {
                    ldLxb.ZU(1);
                    Lxb.LD(1);
                } else {
                    Lxb.LD(0);
                }
            } else {
                ldLxb.lk(0);
                Lxb.Lxb(0);
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ldLxb);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback = this.VVE;
            if (bindCustomTabsServiceCallback != null) {
                bindCustomTabsServiceCallback.onBindSuccess(this.ebl);
            }
        } catch (Throwable th) {
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.VVE;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(11, th.getMessage());
            }
        }
    }

    public void Lxb(BindCustomTabsServiceCallback bindCustomTabsServiceCallback) {
        this.VVE = bindCustomTabsServiceCallback;
        if (this.LD == null || this.lk == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(8));
            String strLxb = Lxb.Lxb(this.LD);
            if (strLxb == null) {
                return;
            }
            ActServiceConnection actServiceConnection = new ActServiceConnection(this.kqm);
            this.OY = actServiceConnection;
            CustomTabsClient.bindCustomTabsService(this.LD, strLxb, actServiceConnection);
        } catch (Throwable th) {
            String message = th.getMessage();
            sLN.Lxb("AdActAction", message);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.VVE;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(10, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb() {
        try {
            ActServiceConnection actServiceConnection = this.OY;
            if (actServiceConnection == null) {
                return;
            }
            this.LD.unbindService(actServiceConnection);
            this.lc = null;
            this.ebl = null;
            this.OY = null;
        } catch (Throwable th) {
            sLN.Lxb("AdActAction", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str, final JSONObject jSONObject, final long j) {
        if (this.lk == null || TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        tD tDVar = this.lk;
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(jCurrentTimeMillis, tDVar, nJ.Lxb(tDVar), str, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.2
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                JSONObject jSONObject2;
                Throwable th;
                try {
                    jSONObject.put("is_playable", eK.LD(AdActAction.this.lk) ? 1 : 0);
                    jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(AdActAction.this.lk) ? 1 : 0);
                    jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        long j2 = j;
                        if (j2 > 0) {
                            jSONObject2.put("duration", j2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sLN.Lxb("AdActAction", th.getMessage());
                    }
                } catch (Throwable th3) {
                    jSONObject2 = null;
                    th = th3;
                }
                return jSONObject2;
            }
        });
    }

    private com.bytedance.sdk.openadsdk.STP.Lxb.LD Lxb(int i) {
        com.bytedance.sdk.openadsdk.STP.Lxb.LD ld = new com.bytedance.sdk.openadsdk.STP.Lxb.LD();
        ld.Lxb(this.ZU);
        ld.Lxb(this.lk);
        ld.LD(nJ.Lxb(this.lk));
        ld.Lxb(i);
        ld.Lxb(false);
        ld.LD(8);
        return ld;
    }
}
