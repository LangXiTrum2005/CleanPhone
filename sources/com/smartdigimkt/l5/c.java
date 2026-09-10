package com.smartdigimkt.l5;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f36359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f36360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36361c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.f36359a instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c.this.f36361c, c.this.f36361c);
                    layoutParams.addRule(13);
                    c.this.f36359a.addView(c.this.f36360b, layoutParams);
                } else if (c.this.f36359a instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c.this.f36361c, c.this.f36361c);
                    layoutParams2.gravity = 17;
                    c.this.f36359a.addView(c.this.f36360b, layoutParams2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f36360b.setAlpha(1.0f);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setRepeatCount(-1);
                c.this.f36360b.startAnimation(rotateAnimation);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.l5.c$c, reason: collision with other inner class name */
    public class RunnableC0529c implements Runnable {
        public RunnableC0529c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f36360b.clearAnimation();
                c.this.f36360b.setAlpha(0.0f);
                c.this.f36359a.removeView(c.this.f36360b);
            } catch (Throwable unused) {
            }
        }
    }

    public c(ViewGroup viewGroup) {
        this.f36359a = viewGroup;
        ImageView imageView = new ImageView(this.f36359a.getContext());
        this.f36360b = imageView;
        imageView.setId(h.a(this.f36359a.getContext(), "myoffer_loading_id", "id"));
        this.f36360b.setImageResource(h.a(this.f36359a.getContext(), "myoffer_loading", k.d));
        this.f36361c = (int) TypedValue.applyDimension(1, 50.0f, this.f36359a.getResources().getDisplayMetrics());
    }

    public void a(int i2) {
        this.f36361c = (int) TypedValue.applyDimension(1, i2, this.f36359a.getResources().getDisplayMetrics());
    }

    public void b() {
        if (this.f36360b != null) {
            this.f36359a.post(new RunnableC0529c());
        }
    }

    public void c() {
        a();
        this.f36360b.post(new b());
    }

    private void a() {
        ImageView imageView = this.f36360b;
        if (imageView != null) {
            this.f36359a.removeView(imageView);
        }
        this.f36359a.post(new a());
    }
}
