package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.qd;
import com.bytedance.sdk.openadsdk.ka.qt;
import com.bytedance.sdk.openadsdk.utils.vr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class TTAdActivity extends TTBaseActivity {
    private int ik = -1;
    private final AtomicBoolean ka = new AtomicBoolean(false);
    private boolean lr;
    private lr ri;

    private void fi() {
        lr lrVar = this.ri;
        if (lrVar == null) {
            super.onBackPressed();
        } else {
            lrVar.jbs();
        }
    }

    private void ik() {
        if (this.ka.compareAndSet(false, true)) {
            lr lrVar = this.ri;
            if (lrVar != null) {
                lrVar.fi(this);
            }
            ka();
        }
    }

    private void ka() {
        if (!this.lr) {
            dw.ri().ri((com.bytedance.sdk.openadsdk.ri.fi.ri) null);
            dw.ri().ri((com.bytedance.sdk.openadsdk.ri.ik.lr) null);
        } else if (!TextUtils.isEmpty(this.qt)) {
            dw.ri().ri(this.qt, isFinishing(), isChangingConfigurations());
        }
        vr.ri();
        qd.ri().ri(String.valueOf(hashCode()));
    }

    public com.bytedance.sdk.openadsdk.ri.ik.lr lr(String str) {
        if (!this.lr) {
            return dw.ri().ik();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.ri.ik.lr) dw.ri().ri(str, com.bytedance.sdk.openadsdk.ri.ik.lr.class);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lr lrVar = this.ri;
        if (lrVar != null) {
            lrVar.ri((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        fi();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x0053, B:14:0x0061, B:16:0x0067, B:19:0x006f, B:21:0x0076, B:22:0x007d), top: B:26:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        long longExtra;
        com.bytedance.sdk.openadsdk.ri.fi.ri riVarRi;
        com.bytedance.sdk.openadsdk.ri.ik.lr lrVarLr;
        wjv wjvVarRi;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (bundle == null) {
            if (intent != null) {
                this.qt = intent.getStringExtra("single_process_listener_key");
                this.lr = intent.getBooleanExtra("enable_new_arch", false);
                longExtra = intent.getLongExtra("start_show_time", SystemClock.elapsedRealtime());
            }
            riVarRi = ri(this.qt);
            lrVarLr = lr(this.qt);
            wjvVarRi = com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.bgr.ka.lr) null);
            if (wjvVarRi == null) {
                finish();
                return;
            }
            try {
                wjvVarRi.ri(longExtra);
                this.ri = new lr(this, wjvVarRi, this.lr);
                if (bundle != null && wjvVarRi.jc()) {
                    this.ri.nr();
                }
                this.ri.ri(this, bundle, riVarRi, lrVarLr);
                if (bundle != null) {
                    qt.ri(wjvVarRi, "activity_recreate", wjvVarRi.fi(), "activity_recreate", null);
                }
                com.bytedance.sdk.openadsdk.utils.lr.ri(wjvVarRi);
            } catch (Throwable th) {
                ac.ri("BVA", "onCreate: ", th);
                qt.ri(wjvVarRi, "show_ad_fail", wjvVarRi.fi(), "init_view_crash");
                finish();
                return;
            }
        }
        this.qt = bundle.getString("single_process_listener_key");
        this.lr = bundle.getBoolean("enable_new_arch", false);
        longExtra = 0;
        riVarRi = ri(this.qt);
        lrVarLr = lr(this.qt);
        wjvVarRi = com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.bgr.ka.lr) null);
        if (wjvVarRi == null) {
            finish();
            return;
        }
        wjvVarRi.ri(longExtra);
        this.ri = new lr(this, wjvVarRi, this.lr);
        if (bundle != null) {
            this.ri.nr();
        }
        this.ri.ri(this, bundle, riVarRi, lrVarLr);
        if (bundle != null) {
            qt.ri(wjvVarRi, "activity_recreate", wjvVarRi.fi(), "activity_recreate", null);
        }
        com.bytedance.sdk.openadsdk.utils.lr.ri(wjvVarRi);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ik();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        lr lrVar = this.ri;
        if (lrVar != null) {
            lrVar.ik(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        lr lrVar = this.ri;
        if (lrVar != null) {
            lrVar.lr(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.qt)) {
            bundle.putString("single_process_listener_key", this.qt);
        }
        bundle.putBoolean("enable_new_arch", this.lr);
        lr lrVar = this.ri;
        if (lrVar != null) {
            int iRi = dw.ri().ri(lrVar.ri());
            this.ik = iRi;
            this.ri.ri(this, bundle, iRi);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.ik >= 0) {
            dw.ri().ik(this.ik);
            this.ik = -1;
        }
        lr lrVar = this.ri;
        if (lrVar != null) {
            lrVar.ri(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        lr lrVar = this.ri;
        if (lrVar != null) {
            lrVar.ka(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        lr lrVar = this.ri;
        if (lrVar != null) {
            lrVar.ri(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean ri() {
        return true;
    }

    public com.bytedance.sdk.openadsdk.ri.fi.ri ri(String str) {
        if (!this.lr) {
            return dw.ri().lr();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.ri.fi.ri) dw.ri().ri(str, com.bytedance.sdk.openadsdk.ri.fi.ri.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void lr() {
        fi();
    }
}
