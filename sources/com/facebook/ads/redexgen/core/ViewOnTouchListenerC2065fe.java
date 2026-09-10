package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2065fe implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1131Cz A00;

    public ViewOnTouchListenerC2065fe(TextureViewSurfaceTextureListenerC1131Cz textureViewSurfaceTextureListenerC1131Cz) {
        this.A00 = textureViewSurfaceTextureListenerC1131Cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A09 != null && motionEvent.getAction() == 1) {
            if (this.A00.A09.isShowing()) {
                this.A00.A09.hide();
            } else {
                this.A00.A09.show();
            }
        }
        return true;
    }
}
