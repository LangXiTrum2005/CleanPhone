package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.applovin.impl.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0943j0 extends AppLovinWebViewBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f10980b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f10981a;

    public AbstractC0943j0(Context context) {
        super(context);
        this.f10981a = new AtomicReference();
        if (f10980b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f10980b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f10980b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f10981a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f10981a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f10981a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10981a.set(MotionEvent.obtain(motionEvent));
        if (f10980b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
