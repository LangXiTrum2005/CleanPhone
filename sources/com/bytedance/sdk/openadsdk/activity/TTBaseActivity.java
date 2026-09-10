package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.utils.ljh;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class TTBaseActivity extends Activity {
    protected boolean jpc = false;
    private OnBackInvokedCallback qdl;
    protected String tvp;

    public static class qdl implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> qdl;

        public qdl(TTBaseActivity tTBaseActivity) {
            this.qdl = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.qdl.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.ud();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public void lnr(boolean z2) {
        this.jpc = z2;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (qdl() && ljh.qdl()) {
            this.qdl = new qdl(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.qdl);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!ljh.qdl() || this.qdl == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.qdl);
        this.qdl = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (IllegalArgumentException unused) {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT > 28) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e2) {
            aaj.qdl("TTBaseActivity", "super.onResume() run fail", e2);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e3) {
                aaj.qdl("TTBaseActivity", "onResume set mCalled fail", e3);
            }
        }
    }

    public boolean qdl() {
        return false;
    }

    public void ud() {
        onBackPressed();
    }
}
