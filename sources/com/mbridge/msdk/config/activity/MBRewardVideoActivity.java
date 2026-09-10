package com.mbridge.msdk.config.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBRewardVideoActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewGroup f31782b;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.activity.BaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(i0.a(getApplicationContext(), "mbridge_activity", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        this.f31782b = viewGroup;
        setContentView(viewGroup);
        this.f31781a = new a(this, this.f31782b);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
