package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.i0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class SoundImageView extends ComponentImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32604c;

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32604c = true;
        setSoundStatus(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        boolean z10 = this.f32604c;
        setSoundStatus(!z10);
        HashMap map = new HashMap();
        map.put("soundStatus", !z10 ? "0" : "1");
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), map);
    }

    public boolean getStatus() {
        return this.f32604c;
    }

    public void setSoundStatus(boolean z10) {
        this.f32604c = z10;
        if (z10) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView
    public void setViewClickListener() {
        setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 2));
    }
}
