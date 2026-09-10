package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public class GestureG2CV2View extends BaseG2CV2View {
    ImageView l0;
    ImageView m0;
    TextView n0;
    Animation o0;
    int p0;
    private boolean q0;
    RelativeLayout r0;
    private float s0;
    private float t0;
    private int u0;
    com.smartdigimkt.u5.a v0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GestureG2CV2View.this.getMeasuredWidth() < h.a(GestureG2CV2View.this.getContext(), 182.0f)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) GestureG2CV2View.this.m0.getLayoutParams();
                layoutParams.width = -1;
                GestureG2CV2View.this.m0.setLayoutParams(layoutParams);
            }
            GestureG2CV2View.this.m0.setVisibility(0);
        }
    }

    public class b implements com.smartdigimkt.u5.b {
        public b() {
        }

        @Override // com.smartdigimkt.u5.b
        public boolean a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                GestureG2CV2View.this.s0 = motionEvent.getX();
                return true;
            }
            if (action == 1) {
                if (GestureG2CV2View.this.t0 <= GestureG2CV2View.this.u0) {
                    return false;
                }
                c.a aVar = GestureG2CV2View.this.i0;
                if (aVar != null) {
                    aVar.a(11, 15);
                }
                return true;
            }
            if (action != 2) {
                return false;
            }
            GestureG2CV2View.b(GestureG2CV2View.this, Math.abs(motionEvent.getX() - GestureG2CV2View.this.s0));
            GestureG2CV2View.this.s0 = motionEvent.getX();
            return false;
        }
    }

    public GestureG2CV2View(Context context) {
        super(context);
        this.q0 = false;
    }

    private com.smartdigimkt.u5.a d() {
        for (ViewParent parent = getParent(); parent.getParent() != null; parent = parent.getParent()) {
            if (parent instanceof com.smartdigimkt.u5.a) {
                return (com.smartdigimkt.u5.a) parent;
            }
        }
        return null;
    }

    private void startAnim() {
        if (this.o0 == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -this.p0, 0.0f, 0.0f);
            this.o0 = translateAnimation;
            translateAnimation.setDuration(1000L);
            this.o0.setRepeatCount(-1);
            this.o0.setRepeatMode(2);
            this.l0.startAnimation(this.o0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.smartdigimkt.u5.a aVarD = d();
        this.v0 = aVarD;
        if (aVarD != null) {
            aVarD.setCallback(new b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.smartdigimkt.u5.a aVar = this.v0;
        if (aVar != null) {
            aVar.setCallback(null);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        Animation animation = this.o0;
        if (animation != null) {
            animation.cancel();
        }
    }

    public void setVerticalLandscape(boolean z2) {
        this.q0 = z2;
    }

    public static /* synthetic */ float b(GestureG2CV2View gestureG2CV2View, float f) {
        float f2 = gestureG2CV2View.t0 + f;
        gestureG2CV2View.t0 = f2;
        return f2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void c() {
        super.c();
        Animation animation = this.o0;
        if (animation != null) {
            animation.start();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_gesture", "layout"), this);
        this.u0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.l0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_slide_finger", "id"));
        this.m0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_white_line", "id"));
        this.n0 = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_slide_hint", "id"));
        this.r0 = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.p0 = h.a(getContext(), 36.0f);
        if (i2 == 1 || i2 == 3) {
            this.r0.setBackgroundResource(h.a(getContext(), "myoffer_g2c_gesture_bg", k.d));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(h.a(getContext(), 270.0f), h.a(getContext(), 100.0f));
            layoutParams.addRule(13);
            this.r0.setLayoutParams(layoutParams);
            this.m0.setVisibility(0);
        } else if (i2 == 2) {
            this.r0.setBackgroundColor(Color.parseColor("#80000000"));
            this.m0.setVisibility(0);
            if (this.q0) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.m0.getLayoutParams();
                layoutParams2.width = h.a(getContext(), 240.0f);
                this.m0.setLayoutParams(layoutParams2);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.l0.getLayoutParams();
            layoutParams3.height = h.a(getContext(), 24.0f);
            layoutParams3.width = h.a(getContext(), 24.0f);
            this.p0 = h.a(getContext(), 24.0f);
            this.l0.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.m0.getLayoutParams();
            layoutParams4.width = h.a(getContext(), 150.0f);
            layoutParams4.height = h.a(getContext(), 4.0f);
            layoutParams4.setMargins(layoutParams4.leftMargin, layoutParams4.topMargin, layoutParams4.rightMargin, h.a(getContext(), 8.0f));
            this.m0.setLayoutParams(layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.n0.getLayoutParams();
            layoutParams5.setMargins(h.a(getContext(), 8.0f), layoutParams5.topMargin, layoutParams5.rightMargin, layoutParams5.bottomMargin);
            this.n0.setTextSize(1, 10.0f);
            setBackgroundColor(Color.parseColor("#80000000"));
            post(new a());
        }
        startAnim();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        super.b();
        Animation animation = this.o0;
        if (animation != null) {
            animation.cancel();
        }
    }
}
