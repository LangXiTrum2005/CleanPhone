package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.b5.c;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class MraidMediaView extends BaseMediaATView {
    private MraidContainerView p0;
    private b q0;
    boolean r0;
    boolean s0;
    boolean t0;
    d u0;

    public class a implements MraidContainerView.e {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a(String str) {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void open(String str) {
            if (MraidMediaView.this.q0 != null) {
                MraidMediaView.this.q0.a(str);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a() {
            MraidMediaView mraidMediaView = MraidMediaView.this;
            mraidMediaView.r0 = true;
            mraidMediaView.d();
            if (MraidMediaView.this.q0 != null) {
                MraidMediaView.this.q0.a();
            }
        }
    }

    public interface b {
        void a();

        void a(String str);
    }

    public MraidMediaView(Context context) {
        this(context, null, null, null, null);
    }

    private void e() {
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.e0, this.g0, this.u0, new a());
        this.p0 = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = this.l0;
        if (frameLayout == null || this.p0 == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.l0.addView(this.p0, new ViewGroup.LayoutParams(-1, -1));
        View viewInflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_include_4_element_with_feedback", "layout"), (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.l0.addView(viewInflate, layoutParams);
        com.smartdigimkt.a6.a aVar = new com.smartdigimkt.a6.a(this.e0, this.g0);
        this.o0 = aVar;
        aVar.a(this);
    }

    public synchronized void d() {
        if (this.r0 && this.s0 && !this.t0) {
            this.t0 = true;
            com.smartdigimkt.i7.d.a(this.g0, this.e0);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseMediaATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.p0;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    public void fireAudioVolumeChange(boolean z2) {
        MraidContainerView mraidContainerView = this.p0;
        if (mraidContainerView != null) {
            mraidContainerView.fireAudioVolumeChange(z2);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseMediaATView
    public void init(int i2, int i3, int i4) {
        super.init(i2, i3, i4);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0 = true;
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0 = false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        MraidContainerView mraidContainerView = this.p0;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z2);
        }
    }

    public void setMraidWebViewListener(b bVar) {
        this.q0 = bVar;
    }

    public MraidMediaView(Context context, f fVar, com.smartdigimkt.v6.a aVar, c.AbstractC0445c abstractC0445c, d dVar) {
        super(context, fVar, aVar, abstractC0445c);
        this.u0 = dVar;
    }

    private void a(String str) {
        Log.d("MraidMediaView", str);
    }
}
