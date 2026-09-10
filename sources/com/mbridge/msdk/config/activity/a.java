package com.mbridge.msdk.config.activity;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31783a = "ActivityPresenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.lifecycle.a f31784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f31785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31786d;

    public a(MBRewardVideoActivity mBRewardVideoActivity, ViewGroup viewGroup) {
        this.f31785c = viewGroup;
        a(mBRewardVideoActivity);
        if (mBRewardVideoActivity != null && mBRewardVideoActivity.getIntent() != null) {
            this.f31784b = (com.mbridge.msdk.config.activity.lifecycle.a) mBRewardVideoActivity.getIntent().getSerializableExtra("lifecycleCallbackByActivity");
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("156", 1);
            this.f31786d = intExtra;
            mBRewardVideoActivity.setRequestedOrientation(intExtra);
        }
        a("onCreate");
    }

    public void a(String str) {
        if (this.f31784b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                this.f31784b.f();
                break;
            case "onPause":
                this.f31784b.e();
                break;
            case "onStart":
                this.f31784b.onStart();
                break;
            case "onBackPressed":
                this.f31784b.c();
                break;
            case "onStop":
                this.f31784b.a();
                break;
            case "onCreate":
                this.f31784b.a(this.f31785c);
                break;
            case "onResume":
                this.f31784b.b();
                break;
        }
        q0.b("ActivityPresenter", "life ".concat(str));
    }

    private void a(MBRewardVideoActivity mBRewardVideoActivity) {
        int iA;
        int iA2;
        int iA3;
        if (mBRewardVideoActivity == null || mBRewardVideoActivity.isFinishing() || mBRewardVideoActivity.getIntent() == null) {
            return;
        }
        Intent intent = mBRewardVideoActivity.getIntent();
        if (intent.getIntExtra("154", 0) != 1) {
            return;
        }
        try {
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("157", 0);
            int intExtra2 = mBRewardVideoActivity.getIntent().getIntExtra("158", 0);
            int iG = v0.g(mBRewardVideoActivity);
            int iF = v0.f(mBRewardVideoActivity);
            if (intent.getIntExtra("155", 0) == 0 && (iA3 = c.a((Context) mBRewardVideoActivity)) > 0) {
                iF -= iA3;
            }
            if (intExtra <= 0 || intExtra2 <= 0) {
                iA = iG;
                iA2 = iF;
            } else {
                iA = v0.a(mBRewardVideoActivity, intExtra);
                iA2 = v0.a(mBRewardVideoActivity, intExtra2);
            }
            int iMin = Math.min(iA, iG);
            int iMin2 = Math.min(iA2, iF);
            ViewGroup.LayoutParams layoutParams = this.f31785c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iMin, iMin2);
            } else {
                layoutParams.width = iMin;
                layoutParams.height = iMin2;
            }
            this.f31785c.setLayoutParams(layoutParams);
            this.f31785c.setX((iG - iMin) / 2.0f);
            this.f31785c.setY((iF - iMin2) / 2.0f);
        } catch (Exception e10) {
            q0.b("ActivityPresenter", e10.getMessage());
        }
    }
}
