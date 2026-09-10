package com.smartdigimkt.expressad.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes5.dex */
public class SoundImageView extends ImageView {
    private boolean e0;

    public SoundImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = true;
    }

    public boolean getStatus() {
        return this.e0;
    }

    public void setSoundStatus(boolean z2) {
        this.e0 = z2;
        if (z2) {
            setImageResource(k.a(getContext(), "sdm_reward_sound_open", k.d));
        } else {
            setImageResource(k.a(getContext(), "sdm_reward_sound_close", k.d));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.e0 = true;
    }
}
