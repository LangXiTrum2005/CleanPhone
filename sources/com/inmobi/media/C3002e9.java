package com.inmobi.media;

import A.ViewOnClickListenerC0885d;
import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3002e9 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2934a9 f23559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerC2985d9 f23560c;
    public C3114l9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23561e;
    public final C3315y3 f;
    public final C3315y3 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProgressBar f23562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RelativeLayout f23563i;
    public boolean j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View.OnClickListener f23564l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3002e9(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        this.f23558a = "e9";
        this.k = U3.d().f23294c;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f23563i = relativeLayout;
        this.f = new C3315y3(context, (byte) 9, null);
        this.g = new C3315y3(context, (byte) 10, null);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        this.f23562h = progressBar;
        progressBar.setScaleY(0.8f);
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setPadding(0, 0, 0, 0);
        a();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        float f = U3.d().f23294c;
        layoutParams.setMargins(0, (int) ((-6) * f), 0, (int) ((-8) * f));
        Drawable progressDrawable = progressBar.getProgressDrawable();
        LayerDrawable layerDrawable = progressDrawable instanceof LayerDrawable ? (LayerDrawable) progressDrawable : null;
        if (layerDrawable != null) {
            Drawable drawable = layerDrawable.getDrawable(0);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
            layerDrawable.getDrawable(2).setColorFilter(new PorterDuffColorFilter(-327674, mode));
        }
        relativeLayout.addView(progressBar, layoutParams);
        this.f23560c = new HandlerC2985d9(this);
        this.f23564l = new ViewOnClickListenerC0885d(this, 1);
    }

    public final void a() {
        int i2 = (int) (30 * this.k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f23563i.addView(this.f, layoutParams);
        this.f.setOnClickListener(this.f23564l);
    }

    public final void b() {
        int i2 = (int) (30 * this.k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f23563i.addView(this.g, layoutParams);
        this.g.setOnClickListener(this.f23564l);
    }

    public final void c() {
        if (this.f23561e) {
            try {
                HandlerC2985d9 handlerC2985d9 = this.f23560c;
                if (handlerC2985d9 != null) {
                    handlerC2985d9.removeMessages(2);
                }
                setVisibility(8);
            } catch (IllegalArgumentException e2) {
                String TAG = this.f23558a;
                Intrinsics.e(TAG, "TAG");
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
            }
            this.f23561e = false;
        }
    }

    public final void d() {
        if (!this.f23561e) {
            C3114l9 c3114l9 = this.d;
            if (c3114l9 != null) {
                int currentPosition = c3114l9.getCurrentPosition();
                int duration = c3114l9.getDuration();
                if (duration != 0) {
                    this.f23562h.setProgress((currentPosition * 100) / duration);
                }
            }
            this.f23561e = true;
            C3114l9 c3114l10 = this.d;
            Object tag = c3114l10 != null ? c3114l10.getTag() : null;
            C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
            if (c2968c9 != null) {
                this.f.setVisibility(c2968c9.f23488A ? 0 : 4);
                this.f23562h.setVisibility(c2968c9.C ? 0 : 4);
            }
            setVisibility(0);
        }
        HandlerC2985d9 handlerC2985d9 = this.f23560c;
        if (handlerC2985d9 != null) {
            handlerC2985d9.sendEmptyMessage(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        C3114l9 c3114l9;
        C3114l9 c3114l10;
        Intrinsics.f(event, "event");
        int keyCode = event.getKeyCode();
        boolean z2 = event.getRepeatCount() == 0 && event.getAction() == 0;
        if (keyCode != 24 && keyCode != 25 && keyCode != 27) {
            if (keyCode != 62 && keyCode != 79) {
                if (keyCode != 164) {
                    if (keyCode != 85) {
                        if (keyCode != 86) {
                            if (keyCode == 126) {
                                if (z2 && (c3114l10 = this.d) != null && !c3114l10.isPlaying()) {
                                    C3114l9 c3114l11 = this.d;
                                    if (c3114l11 != null) {
                                        c3114l11.start();
                                    }
                                    d();
                                }
                                return true;
                            }
                            if (keyCode != 127) {
                                d();
                                return super.dispatchKeyEvent(event);
                            }
                        }
                        if (z2 && (c3114l9 = this.d) != null && c3114l9.isPlaying()) {
                            C3114l9 c3114l12 = this.d;
                            if (c3114l12 != null) {
                                c3114l12.pause();
                            }
                            d();
                        }
                        return true;
                    }
                }
            }
            if (z2) {
                C3114l9 c3114l13 = this.d;
                if (c3114l13 != null) {
                    if (c3114l13.isPlaying()) {
                        c3114l13.pause();
                    } else {
                        c3114l13.start();
                    }
                }
                d();
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public final Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        ProgressBar progressBar = this.f23562h;
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        return MapsKt.g(new Pair(progressBar, friendlyObstructionPurpose), new Pair(this.f, friendlyObstructionPurpose), new Pair(this.g, friendlyObstructionPurpose));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.f(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(C3002e9.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.f(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(C3002e9.class.getName());
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent ev) {
        Intrinsics.f(ev, "ev");
        C3114l9 c3114l9 = this.d;
        if (c3114l9 == null || !c3114l9.a()) {
            return false;
        }
        if (this.f23561e) {
            c();
            return false;
        }
        d();
        return false;
    }

    public final void setMediaPlayer(C3114l9 videoView) {
        Intrinsics.f(videoView, "videoView");
        this.d = videoView;
        Object tag = videoView.getTag();
        C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
        if (c2968c9 == null || !c2968c9.f23488A || c2968c9.c()) {
            return;
        }
        this.j = true;
        this.f23563i.removeView(this.g);
        this.f23563i.removeView(this.f);
        b();
    }

    public final void setVideoAd(C2934a9 c2934a9) {
        this.f23559b = c2934a9;
    }

    public static final void a(C3002e9 this$0, View view) {
        C2934a9 c2934a9;
        C2934a9 c2934a10;
        Intrinsics.f(this$0, "this$0");
        C3114l9 c3114l9 = this$0.d;
        if (c3114l9 != null) {
            Object tag = c3114l9.getTag();
            C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
            if (this$0.j) {
                C3114l9 c3114l10 = this$0.d;
                if (c3114l10 != null) {
                    c3114l10.k();
                }
                this$0.j = false;
                this$0.f23563i.removeView(this$0.g);
                this$0.f23563i.removeView(this$0.f);
                this$0.a();
                if (c2968c9 == null || (c2934a10 = this$0.f23559b) == null) {
                    return;
                }
                try {
                    c2934a10.i(c2968c9);
                    c2968c9.f23492z = true;
                    return;
                } catch (Exception e2) {
                    String TAG = this$0.f23558a;
                    Intrinsics.e(TAG, "TAG");
                    S5 s5 = S5.f23167a;
                    S5.d.a(AbstractC3285w5.a(e2, "event"));
                    return;
                }
            }
            C3114l9 c3114l11 = this$0.d;
            if (c3114l11 != null) {
                c3114l11.c();
            }
            this$0.j = true;
            this$0.f23563i.removeView(this$0.f);
            this$0.f23563i.removeView(this$0.g);
            this$0.b();
            if (c2968c9 == null || (c2934a9 = this$0.f23559b) == null) {
                return;
            }
            try {
                c2934a9.e(c2968c9);
                c2968c9.f23492z = false;
            } catch (Exception e3) {
                String TAG2 = this$0.f23558a;
                Intrinsics.e(TAG2, "TAG");
                S5 s6 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e3, "event"));
            }
        }
    }
}
