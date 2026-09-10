package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends AppLovinWebViewBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f8336b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f8337a;

    public l0(Context context) {
        super(context);
        this.f8337a = new AtomicReference();
        if (f8336b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f8336b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f8336b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f8337a.get() != null;
    }

    @Nullable
    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f8337a.getAndSet(null);
    }

    @Nullable
    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f8337a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f8337a.set(MotionEvent.obtain(motionEvent));
        if (f8336b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
