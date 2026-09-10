package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.a6.e;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseBannerATView extends BaseATView {
    protected com.smartdigimkt.f5.a C0;
    protected CloseImageView D0;
    private e E0;
    View F0;
    protected com.smartdigimkt.a6.a G0;
    public final String TAG;

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            BaseBannerATView.this.a(i2, i3);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseBannerATView.super.m();
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.smartdigimkt.f5.a aVar;
            if (motionEvent.getAction() != 0 || (aVar = BaseBannerATView.this.C0) == null) {
                return true;
            }
            aVar.onAdClosed();
            return true;
        }
    }

    public BaseBannerATView(Context context) {
        super(context);
        this.TAG = getClass().getSimpleName();
    }

    private boolean q() {
        if (this.F0 == null) {
            this.F0 = findViewById(h.a(getContext(), "myoffer_guide2click_container", "id"));
        }
        View view = this.F0;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public int getATViewType() {
        return 4;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public RelativeLayout.LayoutParams getSpecialNoteViewLayoutParams() {
        int measuredHeight = getMeasuredHeight() - h.a(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-2, -2, 14);
        layoutParamsF.setMargins(0, measuredHeight, 0, 0);
        return layoutParamsF;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void j() {
        com.smartdigimkt.f5.a aVar = this.C0;
        if (aVar != null) {
            aVar.onAdShow(new j());
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e eVar;
        return (q() || (eVar = this.E0) == null) ? super.onInterceptTouchEvent(motionEvent) : eVar.a(this, motionEvent);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e eVar;
        return (q() || (eVar = this.E0) == null) ? super.onTouchEvent(motionEvent) : eVar.b(this, motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z2) {
        super.onVisibilityAggregated(z2);
        if (z2) {
            a(110);
        } else {
            a(111);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (Build.VERSION.SDK_INT < 28) {
            if (z2) {
                a(110);
            } else {
                a(111);
            }
        }
    }

    public void r() {
        this.D0.setOnTouchListener(new c());
    }

    public void s() {
        a(this.f0.t.i0() < 0 ? 100 : this.f0.t.i0(), new b());
    }

    private void a(com.smartdigimkt.v6.a aVar, f fVar) {
        if (aVar != null) {
            if (fVar == null || !fVar.w0()) {
                g gVar = aVar.t;
                if (gVar != null && gVar.e()) {
                    e eVar = new e();
                    this.E0 = eVar;
                    eVar.a(true).a(new a());
                } else {
                    e eVar2 = this.E0;
                    if (eVar2 != null) {
                        eVar2.a(false);
                    }
                }
            }
        }
    }

    public BaseBannerATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar);
        this.TAG = getClass().getSimpleName();
        this.C0 = aVar2;
        a(aVar, fVar);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(j jVar) {
        com.smartdigimkt.f5.a aVar = this.C0;
        if (aVar != null) {
            aVar.onAdClick(jVar);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2, int i3) {
        super.a(i2, i3);
        a((com.smartdigimkt.l5.b) this.D0, true);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(boolean z2) {
        com.smartdigimkt.f5.a aVar = this.C0;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z2);
        }
    }
}
