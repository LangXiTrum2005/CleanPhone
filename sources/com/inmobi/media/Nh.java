package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.inmobi.media.Nh;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Nh extends Kh {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        super(gestureDetectorOnGestureListenerC2829ci);
        this.b = gestureDetectorOnGestureListenerC2829ci;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.b.u.get() != null) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.b;
            gestureDetectorOnGestureListenerC2829ci.R = view;
            gestureDetectorOnGestureListenerC2829ci.S = callback;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: adsuki.rajahship
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return Nh.a(view2, motionEvent);
                    }
                });
            }
            Activity activity = (Activity) this.b.u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.b.R;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.b.R, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.b.R;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.b;
            View view4 = gestureDetectorOnGestureListenerC2829ci2.R;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: adsuki.tout
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i, KeyEvent keyEvent) {
                    return Nh.a(gestureDetectorOnGestureListenerC2829ci2, this, view5, i, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.b;
        if (gestureDetectorOnGestureListenerC2829ci.R == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC2829ci.S;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.b;
        gestureDetectorOnGestureListenerC2829ci2.S = null;
        View view = gestureDetectorOnGestureListenerC2829ci2.R;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.b.R;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.b.R);
            }
            this.b.R = null;
        }
    }

    public static final boolean a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, Nh nh, View view, int i, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC3072m9 interfaceC3072m9 = gestureDetectorOnGestureListenerC2829ci.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).a(str, "Back pressed when HTML5 video is playing.");
        }
        nh.a();
        return true;
    }
}
