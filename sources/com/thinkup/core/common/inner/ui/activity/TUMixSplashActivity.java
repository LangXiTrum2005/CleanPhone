package com.thinkup.core.common.inner.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.thinkup.core.basead.m.o;
import com.thinkup.core.common.inner.ui.BaseATActivity;
import com.thinkup.core.common.n.o0n;

/* JADX INFO: loaded from: classes6.dex */
public class TUMixSplashActivity extends BaseATActivity {
    private String n0;
    private FrameLayout no;

    public static void m(Activity activity, o oVar) {
        if (oVar == null) {
            return;
        }
        Context contextOn = o0n.m().on();
        if (activity == null || activity.isFinishing()) {
            Log.i("thinkup_BaseATActivity", "Activity is null");
        } else {
            contextOn = activity;
        }
        Intent intent = new Intent(contextOn, (Class<?>) TUMixSplashActivity.class);
        intent.putExtra("extra_event_id", oVar.o0);
        if (!(contextOn instanceof Activity)) {
            intent.addFlags(268435456);
        }
        contextOn.startActivity(intent);
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseATActivity
    public final void o(Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(this);
        this.no = frameLayout;
        setContentView(frameLayout);
        try {
            this.n0 = getIntent().getStringExtra("extra_event_id");
            com.thinkup.core.common.mn.om.o.o.InterfaceC0665o interfaceC0665oN = com.thinkup.core.common.inner.mixad.o.o().n(this.n0);
            if (interfaceC0665oN != null) {
                interfaceC0665oN.o(this, this.no);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseATActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    private void o() {
        this.n0 = getIntent().getStringExtra("extra_event_id");
    }

    private void m() {
        com.thinkup.core.common.mn.om.o.o.InterfaceC0665o interfaceC0665oN = com.thinkup.core.common.inner.mixad.o.o().n(this.n0);
        if (interfaceC0665oN != null) {
            interfaceC0665oN.o(this, this.no);
        }
    }
}
