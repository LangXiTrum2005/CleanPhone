package com.mbridge.msdk.newreward.player;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.player.presenter.ActivityPresenter;

/* JADX INFO: loaded from: classes2.dex */
public class BaseActivity extends Activity {
    private final String TAG = "BaseActivity";
    ActivityPresenter activityPresenter;

    private void hideNavigationBar() {
        try {
            getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            o0.b("BaseActivity", th.getMessage());
        }
    }

    private void setActivityFull() {
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            hideNavigationBar();
            c1.a(getWindow());
        } catch (Exception e) {
            o0.b("BaseActivity", e.getMessage());
        }
    }

    private void updateScreenSize(boolean z) {
        if (z) {
            int i = getResources().getDisplayMetrics().widthPixels;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onBackPressed");
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setActivityFull();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onDestroy");
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onPause");
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onResume");
        c.n().a(this);
        hideNavigationBar();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onStart");
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onStop");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        hideNavigationBar();
        updateScreenSize(z);
    }
}
