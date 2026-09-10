package com.thinkup.core.activity;

import android.app.Activity;
import android.os.Bundle;
import com.thinkup.core.activity.component.PrivacyPolicyView;
import com.thinkup.core.api.TUGDPRAuthCallback;
import com.thinkup.core.common.mo;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class TUGdprAuthActivity extends Activity {
    public static TUGDPRAuthCallback mCallback;
    PrivacyPolicyView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f41796n = false;
    String o;

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f41796n) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo.o();
        this.o = mo.on();
        if (getResources().getConfiguration().orientation == 2) {
            o00.o((Activity) this, 6);
        } else {
            o00.o((Activity) this, 7);
        }
        try {
            PrivacyPolicyView privacyPolicyView = new PrivacyPolicyView(this);
            this.m = privacyPolicyView;
            privacyPolicyView.setResultCallbackListener(new PrivacyPolicyView.o() { // from class: com.thinkup.core.activity.TUGdprAuthActivity.1
                @Override // com.thinkup.core.activity.component.PrivacyPolicyView.o
                public final void onLevelSelect(int i2) {
                    TUGDPRAuthCallback tUGDPRAuthCallback = TUGdprAuthActivity.mCallback;
                    if (tUGDPRAuthCallback != null) {
                        tUGDPRAuthCallback.onAuthResult(i2);
                        TUGdprAuthActivity.mCallback = null;
                    }
                    TUGdprAuthActivity.this.finish();
                }

                @Override // com.thinkup.core.activity.component.PrivacyPolicyView.o
                public final void onPageLoadFail() {
                    TUGdprAuthActivity.this.f41796n = true;
                    TUGDPRAuthCallback tUGDPRAuthCallback = TUGdprAuthActivity.mCallback;
                    if (tUGDPRAuthCallback != null) {
                        tUGDPRAuthCallback.onPageLoadFail();
                    }
                }

                @Override // com.thinkup.core.activity.component.PrivacyPolicyView.o
                public final void onPageLoadSuccess() {
                    TUGdprAuthActivity.this.f41796n = false;
                }
            });
            setContentView(this.m);
            this.m.loadPolicyUrl(this.o);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        PrivacyPolicyView privacyPolicyView = this.m;
        if (privacyPolicyView != null) {
            privacyPolicyView.destory();
        }
        mCallback = null;
        super.onDestroy();
    }
}
