package com.p004ironsource.sdk.controller;

import android.os.Bundle;
import com.p004ironsource.d9;
import com.p004ironsource.sdk.utils.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class InterstitialActivity extends ControllerActivity {
    private static final String r = "InterstitialActivity";

    @Override // com.p004ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(r, "onCreate");
    }

    @Override // com.p004ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(r, d9.h.t0);
    }

    @Override // com.p004ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(r, d9.h.u0);
    }
}
