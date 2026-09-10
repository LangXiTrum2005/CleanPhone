package com.smartdigimkt.sdk.basead.ui.specialnote;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.m3.n;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseSpecialNoteView extends LinearLayout {
    public static final long SEPECIAL_NOTE_INTERVAL_TIME = 500;
    final String e0;
    final long f0;
    final int g0;
    long h0;
    long i0;
    long j0;
    long k0;
    private View l0;
    g m0;
    Runnable n0;
    com.smartdigimkt.k7.c o0;
    com.smartdigimkt.k7.f.c p0;
    TextView q0;
    TextView r0;
    String s0;
    private int t0;
    private boolean u0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSpecialNoteView.this.d();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSpecialNoteView.this.release();
        }
    }

    public class d extends com.smartdigimkt.k7.a {
        public d() {
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public int getImpressionMinPercentageViewed() {
            return 50;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public void recordImpression(View view) {
            BaseSpecialNoteView.this.h();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseSpecialNoteView.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f38572a;

        public f(ValueAnimator valueAnimator) {
            this.f38572a = valueAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            BaseSpecialNoteView.this.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            BaseSpecialNoteView.this.setAlpha(((Float) this.f38572a.getAnimatedValue()).floatValue());
            BaseSpecialNoteView.this.setVisibility(0);
        }
    }

    public interface g {
        void a(int i2);
    }

    public BaseSpecialNoteView(Context context) {
        super(context);
        this.e0 = getClass().getSimpleName();
        this.f0 = 500L;
        this.g0 = 50;
        this.s0 = "";
        this.u0 = false;
    }

    private void c() {
        if (this.i0 > 0) {
            if (getVisibility() == 0) {
                setVisibility(4);
                return;
            }
            return;
        }
        long j = this.k0;
        if (j <= 0) {
            k();
            return;
        }
        this.q0.setText(Html.fromHtml(String.format(this.s0, Integer.valueOf(((int) (j / 1000)) + 1))));
        if (getVisibility() != 0) {
            this.u0 = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (getWindowVisibility() == 0) {
            if (b()) {
                long j = this.i0;
                if (j > 0) {
                    this.i0 = j - 500;
                } else {
                    long j2 = this.k0;
                    if (j2 > 0) {
                        this.k0 = j2 - 500;
                    }
                }
                c();
                h();
                return;
            }
        } else if (g()) {
            i();
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.m0 == null) {
            return;
        }
        postDelayed(this.n0, 500L);
    }

    private void i() {
        this.i0 = this.h0;
        this.k0 = this.j0;
        setVisibility(4);
        this.u0 = false;
    }

    private void j() {
        View view = this.l0;
        if (view == null) {
            return;
        }
        this.o0.a(view, new d());
    }

    private void k() {
        if (this.l0 == null) {
            return;
        }
        int i2 = this.t0;
        g gVar = this.m0;
        if (gVar != null) {
            gVar.a(i2);
        }
        release();
    }

    public void e() {
        this.s0 = getContext().getString(h.a(com.smartdigimkt.m6.b.p().k(), "myoffer_special_note_delay_click", k.f38992h));
    }

    public abstract void f();

    public abstract boolean g();

    public boolean hasBeenShow() {
        return this.u0;
    }

    public void initSetting(View view, int i2, g gVar, long j, long j2) {
        this.t0 = i2;
        e();
        f();
        setVisibility(4);
        this.o0 = n.b().a();
        this.p0 = n.b().c();
        this.l0 = view;
        this.m0 = gVar;
        this.h0 = j;
        this.j0 = j2;
        this.i0 = j;
        this.k0 = j2;
        this.n0 = new a();
        setOnClickListener(new b());
        TextView textView = this.r0;
        if (textView != null) {
            textView.setOnClickListener(new c());
        }
        TextView textView2 = this.q0;
        if (textView2 != null) {
            textView2.setText(Html.fromHtml(String.format(this.s0, Integer.valueOf(((int) (this.k0 / 1000)) + 1))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pause();
    }

    public void pause() {
        setVisibility(4);
        Runnable runnable = this.n0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        View view = this.l0;
        if (view != null) {
            this.o0.b(view);
        }
    }

    public void release() {
        if (this.m0 != null) {
            pause();
            this.m0 = null;
            this.l0 = null;
        }
    }

    public void reset(int i2, long j, long j2) {
        this.t0 = i2;
        this.h0 = j;
        this.j0 = j2;
        i();
    }

    public void resume() {
        if (b()) {
            c();
        }
        h();
    }

    private boolean b() {
        View view = this.l0;
        if (view != null && view.getParent() != null) {
            Object parent = this.l0.getParent();
            if (parent instanceof View) {
                return this.p0.a((View) parent, this.l0, 50, 0);
            }
        }
        return false;
    }

    public void a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new e());
        valueAnimatorOfFloat.addListener(new f(valueAnimatorOfFloat));
        valueAnimatorOfFloat.start();
    }

    public BaseSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = getClass().getSimpleName();
        this.f0 = 500L;
        this.g0 = 50;
        this.s0 = "";
        this.u0 = false;
    }
}
