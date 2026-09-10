package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Y3 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f23363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3045h4 f23365c;
    public InterfaceC2946b4 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Fe f23366e;
    public InterfaceC3333z5 f;
    public Df g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Activity activity) {
        super(activity);
        Intrinsics.f(activity, "activity");
        this.f23363a = activity;
        this.f23364b = -1;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.e(context, "getContext(...)");
        C3315y3 c3315y3 = new C3315y3(context, (byte) 4, this.f);
        c3315y3.setId(65503);
        c3315y3.setOnTouchListener(new A.S(this, 0));
        linearLayout.addView(c3315y3, layoutParams);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.e(context, "getContext(...)");
        C3315y3 c3315y3 = new C3315y3(context, (byte) 2, this.f);
        c3315y3.setId(65516);
        c3315y3.setOnTouchListener(new A.S(this, 2));
        linearLayout.addView(c3315y3, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.e(context, "getContext(...)");
        C3315y3 c3315y3 = new C3315y3(context, (byte) 6, this.f);
        c3315y3.setId(1048283);
        c3315y3.setOnTouchListener(new A.S(this, 3));
        linearLayout.addView(c3315y3, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.e(context, "getContext(...)");
        C3315y3 c3315y3 = new C3315y3(context, (byte) 3, this.f);
        c3315y3.setId(65502);
        c3315y3.setOnTouchListener(new A.S(this, 1));
        linearLayout.addView(c3315y3, layoutParams);
    }

    public final Fe getUserLeftApplicationListener() {
        return this.f23366e;
    }

    public final void setEmbeddedBrowserUpdateListener(InterfaceC2946b4 browserUpdateListener) {
        Intrinsics.f(browserUpdateListener, "browserUpdateListener");
        this.d = browserUpdateListener;
    }

    public final void setLogger(InterfaceC3333z5 logger) {
        Intrinsics.f(logger, "logger");
        this.f = logger;
    }

    public final void setUserLeftApplicationListener(Fe fe) {
        this.f23366e = fe;
    }

    public static final boolean a(Y3 this$0, View view, MotionEvent motionEvent) {
        Intrinsics.f(this$0, "this$0");
        C3045h4 c3045h4 = this$0.f23365c;
        if (c3045h4 == null) {
            InterfaceC2946b4 interfaceC2946b4 = this$0.d;
            if (interfaceC2946b4 != null) {
                C3078j5.a(((C3062i5) interfaceC2946b4).f23690a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c3045h4.canGoBack()) {
                c3045h4.goBack();
            } else {
                InterfaceC2946b4 interfaceC2946b5 = this$0.d;
                if (interfaceC2946b5 != null) {
                    C3078j5.a(((C3062i5) interfaceC2946b5).f23690a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean b(Y3 this$0, View view, MotionEvent motionEvent) {
        C2963c4 c2963c4;
        Intrinsics.f(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C3045h4 c3045h4 = this$0.f23365c;
            if (c3045h4 != null && (c2963c4 = c3045h4.f23652h) != null) {
                C2963c4.a(c2963c4, 5, true, null, 12);
            }
            InterfaceC2946b4 interfaceC2946b4 = this$0.d;
            if (interfaceC2946b4 != null) {
                C3078j5.a(((C3062i5) interfaceC2946b4).f23690a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(Y3 this$0, View view, MotionEvent motionEvent) {
        Intrinsics.f(this$0, "this$0");
        C3045h4 c3045h4 = this$0.f23365c;
        if (c3045h4 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c3045h4.canGoForward()) {
                c3045h4.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(Y3 this$0, View view, MotionEvent motionEvent) {
        C2963c4 c2963c4;
        Intrinsics.f(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C3045h4 c3045h4 = this$0.f23365c;
            if (c3045h4 != null && (c2963c4 = c3045h4.f23652h) != null) {
                C2963c4.a(c2963c4, 6, true, null, 12);
            }
            C3045h4 c3045h5 = this$0.f23365c;
            if (c3045h5 != null) {
                c3045h5.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
