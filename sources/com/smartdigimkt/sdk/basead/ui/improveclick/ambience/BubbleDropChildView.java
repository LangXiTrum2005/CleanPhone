package com.smartdigimkt.sdk.basead.ui.improveclick.ambience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.smartdigimkt.sdk.basead.ui.animplayerview.redpacket.RedPacketView;

/* JADX INFO: loaded from: classes6.dex */
public class BubbleDropChildView extends RedPacketView {
    a u0;
    private boolean v0;

    public interface a {
        void a();
    }

    public BubbleDropChildView(Context context) {
        super(context);
    }

    private boolean a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (com.smartdigimkt.p5.a aVar : this.h0) {
            float f = aVar.f;
            if (f <= x && x <= f + aVar.e()) {
                float f2 = aVar.g;
                if (f2 <= y && y <= f2 + aVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void initSetting(a aVar) {
        this.e0 = 0.25d;
        this.f0 = 0.33000001311302185d;
        this.v0 = false;
        this.u0 = aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.v0 && (aVar = this.u0) != null) {
                    aVar.a();
                }
                this.v0 = false;
            }
        } else if (a(motionEvent)) {
            this.v0 = true;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public BubbleDropChildView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleDropChildView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
