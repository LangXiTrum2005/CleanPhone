package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class InterstitialActivity extends ControllerActivity {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f30243s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f30243s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f30243s, X3.i.t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f30243s, X3.i.f27817u0);
    }
}
