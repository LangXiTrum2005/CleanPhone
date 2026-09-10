package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.mrf;
import com.bytedance.sdk.openadsdk.utils.bjy;

/* JADX INFO: loaded from: classes3.dex */
public class TTAdActivity extends TTBaseActivity {
    private int lnr = -1;
    private ud qdl;
    private boolean ud;

    private void lnr() {
        ud udVar = this.qdl;
        if (udVar == null) {
            super.onBackPressed();
        } else {
            udVar.jpc();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z2 = false;
        if (bundle != null) {
            this.tvp = bundle.getString("single_process_listener_key");
            z2 = bundle.getBoolean("enable_new_arch", false);
        } else {
            this.tvp = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
                z2 = true;
            }
        }
        this.ud = z2;
        aaj.qdl("BVA", "onCreate: isEnableNewArch = " + this.ud + ",listenerKey=" + this.tvp);
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVarQdl = qdl(this.tvp);
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVarUd = ud(this.tvp);
        ljh ljhVarQdl = com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.exu.mml.ud) null);
        if (ljhVarQdl == null) {
            finish();
            return;
        }
        ud udVar = new ud(this, ljhVarQdl, this.ud);
        this.qdl = udVar;
        udVar.qdl(this, bundle, qdlVarQdl, udVarUd);
        com.bytedance.sdk.openadsdk.utils.ud.qdl(ljhVarQdl);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.mzz(this);
        }
        if (!this.ud) {
            koa.qdl().qdl((com.bytedance.sdk.openadsdk.qdl.mzz.qdl) null);
            koa.qdl().qdl((com.bytedance.sdk.openadsdk.qdl.lnr.ud) null);
        } else if (!TextUtils.isEmpty(this.tvp)) {
            koa.qdl().qdl(this.tvp, isFinishing(), isChangingConfigurations());
        }
        bjy.qdl();
        mrf.qdl().qdl(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.lnr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.ud(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.tvp)) {
            bundle.putString("single_process_listener_key", this.tvp);
        }
        bundle.putBoolean("enable_new_arch", this.ud);
        ud udVar = this.qdl;
        if (udVar != null) {
            int iQdl = koa.qdl().qdl(udVar.qdl());
            this.lnr = iQdl;
            this.qdl.qdl(this, bundle, iQdl);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.lnr >= 0) {
            koa.qdl().lnr(this.lnr);
            this.lnr = -1;
        }
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.mml(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean qdl() {
        return true;
    }

    public com.bytedance.sdk.openadsdk.qdl.lnr.ud ud(String str) {
        if (!this.ud) {
            return koa.qdl().lnr();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.qdl.lnr.ud) koa.qdl().qdl(str, com.bytedance.sdk.openadsdk.qdl.lnr.ud.class);
    }

    public com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdl(String str) {
        if (!this.ud) {
            return koa.qdl().ud();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.qdl.mzz.qdl) koa.qdl().qdl(str, com.bytedance.sdk.openadsdk.qdl.mzz.qdl.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ud() {
        lnr();
    }
}
