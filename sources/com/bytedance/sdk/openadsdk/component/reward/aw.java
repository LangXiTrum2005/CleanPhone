package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ory;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import plench.attabal;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    protected boolean di;
    protected final AtomicBoolean fi = new AtomicBoolean(false);
    protected final String ik;
    protected boolean ka;
    protected final com.bytedance.sdk.openadsdk.core.model.ri lr;
    private final ri mj;
    protected final Context ri;
    protected boolean xha;

    public interface ri {
        Intent ri(Context context, wjv wjvVar, Activity activity);

        void ri(Intent intent, Activity activity, wjv wjvVar, boolean z);

        void ri(wjv wjvVar);

        void ri(boolean z);
    }

    public aw(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar, String str, ri riVar2) {
        this.ri = context == null ? com.bytedance.sdk.openadsdk.core.nr.ri() : context;
        this.lr = riVar;
        this.ik = str;
        this.ka = false;
        this.mj = riVar2;
    }

    private void ka() {
        List<wjv> listKa = this.lr.ka();
        if (listKa != null) {
            Iterator<wjv> it = listKa.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.lr(this.ri, it.next());
            }
        }
    }

    public boolean ik() {
        return this.ka;
    }

    public Map<String, Object> lr() {
        com.bytedance.sdk.openadsdk.core.model.ri riVar = this.lr;
        if (riVar == null || riVar.di() == null) {
            return null;
        }
        return this.lr.di().iyl();
    }

    public void ri() {
        if (this.fi.get()) {
            return;
        }
        this.ka = true;
    }

    public Object ri(String str) {
        com.bytedance.sdk.openadsdk.core.model.ri riVar = this.lr;
        if (riVar == null || riVar.di() == null || this.lr.di().iyl() == null) {
            return null;
        }
        try {
            return this.lr.di().iyl().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik(this.ik, th.getMessage());
            return null;
        }
    }

    public void ri(Double d) {
        if (this.di) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ri riVar = this.lr;
        if (riVar != null && riVar.di() != null) {
            ory.ri(this.lr.di(), d);
        }
        this.di = true;
    }

    public void ri(Double d, String str, String str2) {
        if (this.xha) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ri riVar = this.lr;
        if (riVar != null && riVar.di() != null) {
            ory.ri(this.lr.di(), d, str, str2);
        }
        this.xha = true;
    }

    public void ri(Activity activity) {
        wjv wjvVarDi;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.ri riVar = this.lr;
        if (riVar == null || !riVar.fi() || (wjvVarDi = this.lr.di()) == null) {
            return;
        }
        if (attabal.attabal()) {
            ka();
            if (!this.fi.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.ka.qt.ri(wjvVarDi, "show_ad_fail", this.ik, "repeat_play");
                return;
            }
            if (wjvVarDi.eu() == null && wjvVarDi.rbz().isEmpty()) {
                com.bytedance.sdk.openadsdk.ka.qt.ri(wjvVarDi, "show_ad_fail", this.ik, "video_or_image_empty");
                return;
            }
            com.bytedance.sdk.openadsdk.ka.qt.ri(wjvVarDi, "show_start", this.ik, (String) null);
            Context contextRi = activity == null ? this.ri : activity;
            if (contextRi == null) {
                contextRi = com.bytedance.sdk.openadsdk.core.nr.ri();
            }
            Intent intentRi = this.mj.ri(contextRi, wjvVarDi, activity);
            if (intentRi == null) {
                return;
            }
            intentRi.putExtra("start_show_time", SystemClock.elapsedRealtime());
            boolean zJbs = com.bytedance.sdk.openadsdk.wjv.fi.jbs();
            intentRi.putExtra("enable_new_arch", zJbs);
            this.mj.ri(intentRi, activity, wjvVarDi, zJbs);
            this.mj.ri(zJbs);
            ri(contextRi, intentRi, wjvVarDi, zJbs);
            this.mj.ri(wjvVarDi);
            return;
        }
        com.bytedance.sdk.openadsdk.ka.qt.ri(wjvVarDi, "show_ad_fail", this.ik, "not_called_on_main_thread");
        throw new IllegalStateException("Cannot be called in a child thread —— " + this.ik + ".show");
    }

    private void ri(Context context, Intent intent, final wjv wjvVar, boolean z) {
        final boolean z2 = com.bytedance.sdk.openadsdk.wjv.fi.ri("start_activity_async", 0) == 1;
        if (z2) {
            com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.1
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("start_activity");
                    riVar.ka(aw.this.ik);
                    return riVar;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.lr.ri(context, intent, new com.bytedance.sdk.component.utils.lr.InterfaceC0216lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.2
            @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
            public void ri() {
                if (z2) {
                    aw.this.ri(jElapsedRealtime);
                }
            }

            @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
            public void ri(Throwable th) {
                com.bytedance.sdk.openadsdk.ka.qt.ri(wjvVar, "show_ad_fail", aw.this.ik, "activity_start_fail");
                if (z2) {
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.2.1
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("start_activity");
                            riVar.ka(aw.this.ik);
                            return riVar;
                        }
                    });
                }
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(long j) {
        com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.3
            @Override // com.bytedance.sdk.openadsdk.nr.ka
            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                riVar.lr("start_activity");
                riVar.ka(aw.this.ik);
                return riVar;
            }
        });
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        com.bytedance.sdk.openadsdk.slm.ka.ri("start_activity_action", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("start_activity_action").lr(jSONObject.toString());
            }
        });
    }
}
