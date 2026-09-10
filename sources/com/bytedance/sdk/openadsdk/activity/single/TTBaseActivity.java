package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.utils.ay;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class TTBaseActivity extends Activity {
    protected boolean jbs = false;
    protected String qt;
    private OnBackInvokedCallback ri;

    public static class ri implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> ri;

        public ri(TTBaseActivity tTBaseActivity) {
            this.ri = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.ri.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.lr();
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

    public void ik(boolean z) {
        this.jbs = z;
    }

    public void lr() {
        onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ri() && ay.ri()) {
            this.ri = new ri(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.ri);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!ay.ri() || this.ri == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.ri);
        this.ri = null;
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
        } catch (IllegalArgumentException e) {
            ac.ri("TTBaseActivity", "super.onResume() run fail", e);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e2) {
                ac.ri("TTBaseActivity", "onResume set mCalled fail", e2);
            }
        }
    }

    public boolean ri() {
        return false;
    }
}
