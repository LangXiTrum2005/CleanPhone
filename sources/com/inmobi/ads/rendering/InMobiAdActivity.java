package com.inmobi.ads.rendering;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.applovin.shadow.okio.Utf8;
import com.google.android.material.motion.a;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.A5;
import com.inmobi.media.AbstractC3037gc;
import com.inmobi.media.B2;
import com.inmobi.media.C2963c4;
import com.inmobi.media.C3045h4;
import com.inmobi.media.C3078j5;
import com.inmobi.media.C3110l5;
import com.inmobi.media.C3142n5;
import com.inmobi.media.C3210ra;
import com.inmobi.media.C3315y3;
import com.inmobi.media.Df;
import com.inmobi.media.Gb;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;
import com.inmobi.media.InterfaceC3279w;
import com.inmobi.media.InterfaceC3295x;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.L3;
import com.inmobi.media.P;
import com.inmobi.media.U3;
import com.inmobi.media.Y3;
import com.p004ironsource.d9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/m5", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMobiAdActivity extends Activity {
    public static final SparseArray k = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static GestureDetectorOnGestureListenerC3005ec f22657l;
    public static AbstractC3037gc m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3110l5 f22658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3078j5 f22659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3005ec f22660c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22661e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3333z5 f22662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Df f22663i;
    public OnBackInvokedCallback j;

    public static final void a(InMobiAdActivity this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.a();
    }

    public static final boolean b(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C2963c4 c2963c4;
        Intrinsics.f(this$0, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this$0.f22660c;
        if (gestureDetectorOnGestureListenerC3005ec != null && (c2963c4 = gestureDetectorOnGestureListenerC3005ec.z0) != null) {
            C2963c4.a(c2963c4, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this$0.f22660c;
        if (gestureDetectorOnGestureListenerC3005ec2 != null) {
            gestureDetectorOnGestureListenerC3005ec2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C2963c4 c2963c4;
        Intrinsics.f(this$0, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this$0.f22660c;
        if (gestureDetectorOnGestureListenerC3005ec == null || !gestureDetectorOnGestureListenerC3005ec.canGoBack()) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this$0.f22660c;
            if (gestureDetectorOnGestureListenerC3005ec2 != null && (c2963c4 = gestureDetectorOnGestureListenerC3005ec2.z0) != null) {
                C2963c4.a(c2963c4, 5, true, null, 12);
            }
            this$0.f22661e = true;
            this$0.finish();
        } else {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec3 = this$0.f22660c;
            if (gestureDetectorOnGestureListenerC3005ec3 != null) {
                gestureDetectorOnGestureListenerC3005ec3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        Intrinsics.f(this$0, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this$0.f22660c;
        if (gestureDetectorOnGestureListenerC3005ec2 != null && gestureDetectorOnGestureListenerC3005ec2.canGoForward() && (gestureDetectorOnGestureListenerC3005ec = this$0.f22660c) != null) {
            gestureDetectorOnGestureListenerC3005ec.goForward();
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.f(newConfig, "newConfig");
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        C3110l5 c3110l5 = this.f22658a;
        if (c3110l5 != null) {
            c3110l5.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x016b A[PHI: r12
  0x016b: PHI (r12v4 com.inmobi.commons.core.configs.AdConfig) = (r12v3 com.inmobi.commons.core.configs.AdConfig), (r12v10 com.inmobi.commons.core.configs.AdConfig) binds: [B:56:0x0151, B:58:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x011e, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [android.app.Activity, android.content.Context, com.inmobi.ads.rendering.InMobiAdActivity] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.inmobi.media.gc] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C3078j5 c3078j5;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        C2963c4 c2963c4;
        InterfaceC3279w fullScreenEventsListener;
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", "onDestroy");
        }
        int i2 = this.d;
        if (100 == i2) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = f22657l;
            if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
                gestureDetectorOnGestureListenerC3005ec2.a(Gb.a("IN_CUSTOM_BROWSER", "onClose"));
            }
        } else if (102 == i2 && (c3078j5 = this.f22659b) != null && c3078j5.f23718e != null) {
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            c3078j5.a(Gb.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.f22661e) {
            int i3 = this.d;
            if (100 == i3) {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec3 = this.f22660c;
                if (gestureDetectorOnGestureListenerC3005ec3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3005ec3.getFullScreenEventsListener()) != null) {
                    try {
                        fullScreenEventsListener.b(this.f22660c);
                        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec4 = this.f22660c;
                        Intrinsics.c(gestureDetectorOnGestureListenerC3005ec4);
                        gestureDetectorOnGestureListenerC3005ec4.b();
                        C3110l5 c3110l5 = this.f22658a;
                        if (c3110l5 == null) {
                            Intrinsics.m("orientationHandler");
                            throw null;
                        }
                        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec5 = this.f22660c;
                        Intrinsics.c(gestureDetectorOnGestureListenerC3005ec5);
                        c3110l5.f23766b.remove(gestureDetectorOnGestureListenerC3005ec5);
                        c3110l5.a();
                        this.f22660c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i3) {
                C3078j5 c3078j6 = this.f22659b;
                if (c3078j6 != null) {
                    C3110l5 c3110l6 = this.f22658a;
                    if (c3110l6 == null) {
                        Intrinsics.m("orientationHandler");
                        throw null;
                    }
                    c3110l6.f23766b.remove(c3078j6);
                    c3110l6.a();
                    P p2 = c3078j6.f23717c;
                    if (p2 != null) {
                        p2.b();
                    }
                    RelativeLayout relativeLayout = c3078j6.d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    Y3 y3 = c3078j6.f23718e;
                    if (y3 != null) {
                        C3045h4 c3045h4 = y3.f23365c;
                        if (c3045h4 != null) {
                            c3045h4.destroy();
                        }
                        y3.f23365c = null;
                        y3.d = null;
                        y3.f23366e = null;
                        Df df = y3.g;
                        if (df != null) {
                            df.a();
                        }
                        y3.removeAllViews();
                    }
                    c3078j6.f23715a.clear();
                    c3078j6.f23716b = null;
                    c3078j6.f23717c = null;
                    c3078j6.d = null;
                    c3078j6.f23718e = null;
                }
                this.f22659b = null;
            }
        } else {
            int i4 = this.d;
            if (100 != i4 && 102 == i4) {
                C3078j5 c3078j7 = this.f22659b;
                if (c3078j7 != null) {
                    C3110l5 c3110l7 = this.f22658a;
                    if (c3110l7 == null) {
                        Intrinsics.m("orientationHandler");
                        throw null;
                    }
                    c3110l7.f23766b.remove(c3078j7);
                    c3110l7.a();
                    P p3 = c3078j7.f23717c;
                    if (p3 != null) {
                        p3.b();
                    }
                    RelativeLayout relativeLayout2 = c3078j7.d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    Y3 y4 = c3078j7.f23718e;
                    if (y4 != null) {
                        C3045h4 c3045h5 = y4.f23365c;
                        if (c3045h5 != null) {
                            c3045h5.destroy();
                        }
                        y4.f23365c = null;
                        y4.d = null;
                        y4.f23366e = null;
                        Df df2 = y4.g;
                        if (df2 != null) {
                            df2.a();
                        }
                        y4.removeAllViews();
                    }
                    c3078j7.f23715a.clear();
                    c3078j7.f23716b = null;
                    c3078j7.f23717c = null;
                    c3078j7.d = null;
                    c3078j7.f23718e = null;
                }
                this.f22659b = null;
            }
            if (100 == this.d && (gestureDetectorOnGestureListenerC3005ec = this.f22660c) != null && (c2963c4 = gestureDetectorOnGestureListenerC3005ec.z0) != null) {
                C2963c4.a(c2963c4, 9, true, null, 12);
            }
        }
        Df df3 = this.f22663i;
        if (df3 != null) {
            df3.a();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        C3078j5 c3078j5;
        C3110l5 c3110l5;
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", "multiWindow mode - " + z2);
        }
        super.onMultiWindowModeChanged(z2);
        if (z2 || (c3078j5 = this.f22659b) == null) {
            return;
        }
        InterfaceC3295x interfaceC3295x = c3078j5.f23716b;
        C3210ra orientationProperties = (interfaceC3295x == null || !(interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec)) ? null : ((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).getOrientationProperties();
        if (orientationProperties == null || (c3110l5 = this.f22658a) == null) {
            return;
        }
        c3110l5.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.f(intent, "intent");
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f = false;
        this.f22660c = null;
        setIntent(intent);
        C3078j5 c3078j5 = this.f22659b;
        if (c3078j5 != null) {
            SparseArray adContainers = k;
            Intrinsics.f(adContainers, "adContainers");
            c3078j5.a(intent, adContainers);
            P p2 = c3078j5.f23717c;
            if (p2 != null) {
                p2.g();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        C3078j5 c3078j5;
        super.onPause();
        int i2 = this.d;
        if (100 == i2) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = f22657l;
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
                gestureDetectorOnGestureListenerC3005ec.a(Gb.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i2 || (c3078j5 = this.f22659b) == null || c3078j5.f23718e == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
        c3078j5.a(Gb.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        P p2;
        InterfaceC3279w fullScreenEventsListener;
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", d9.h.u0);
        }
        super.onResume();
        if (this.f22661e) {
            return;
        }
        int i2 = this.d;
        if (100 == i2) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f22660c;
            if (gestureDetectorOnGestureListenerC3005ec != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3005ec.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f) {
                        this.f = true;
                        fullScreenEventsListener.a(this.f22660c);
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = f22657l;
            if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
                gestureDetectorOnGestureListenerC3005ec2.a(Gb.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i2) {
            C3078j5 c3078j5 = this.f22659b;
            if (c3078j5 != null && (p2 = c3078j5.f23717c) != null) {
                p2.c();
            }
            C3078j5 c3078j6 = this.f22659b;
            if (c3078j6 == null || c3078j6.f23718e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            c3078j6.a(Gb.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C3078j5 c3078j5;
        Window window;
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        L3 l3 = L3.f22938a;
        if (l3.B()) {
            if (this.j == null) {
                this.j = new a(this, 1);
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.m("backInvokedCallback");
                throw null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.f22661e || 102 != this.d || (c3078j5 = this.f22659b) == null) {
            return;
        }
        P p2 = c3078j5.f23717c;
        if (p2 != null) {
            p2.g();
        }
        InterfaceC3295x interfaceC3295x = c3078j5.f23716b;
        if (interfaceC3295x != null) {
            if ((!(interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec) ? false : ((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).S0) && !l3.z() && l3.F()) {
                Object obj = c3078j5.f23715a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        C3078j5 c3078j5;
        P p2;
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        if (L3.f22938a.B() && this.j != null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.m("backInvokedCallback");
                throw null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.f22661e || (c3078j5 = this.f22659b) == null || (p2 = c3078j5.f23717c) == null) {
            return;
        }
        p2.d();
    }

    public final void a(RelativeLayout relativeLayout) {
        float f = U3.d().f23294c;
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (48 * f));
        linearLayout.setOrientation(0);
        linearLayout.setId(Utf8.REPLACEMENT_CODE_POINT);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        relativeLayout.setBackgroundColor(-7829368);
        layoutParams.addRule(12);
        if (B2.a(this)) {
            Df df = this.f22663i;
            if (df != null) {
                df.a();
            }
            this.f22663i = new Df(this, new C3142n5(layoutParams), this.f22662h);
        }
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 25.0f;
        C3315y3 c3315y3 = new C3315y3(this, (byte) 2, this.f22662h);
        final int i2 = 0;
        c3315y3.setOnTouchListener(new View.OnTouchListener(this) { // from class: z.a

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f48883Y;

            {
                this.f48883Y = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i2) {
                    case 0:
                        return InMobiAdActivity.a(this.f48883Y, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f48883Y, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f48883Y, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f48883Y, view, motionEvent);
                }
            }
        });
        linearLayout.addView(c3315y3, layoutParams2);
        C3315y3 c3315y4 = new C3315y3(this, (byte) 3, this.f22662h);
        final int i3 = 1;
        c3315y4.setOnTouchListener(new View.OnTouchListener(this) { // from class: z.a

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f48883Y;

            {
                this.f48883Y = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i3) {
                    case 0:
                        return InMobiAdActivity.a(this.f48883Y, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f48883Y, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f48883Y, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f48883Y, view, motionEvent);
                }
            }
        });
        linearLayout.addView(c3315y4, layoutParams2);
        C3315y3 c3315y5 = new C3315y3(this, (byte) 4, this.f22662h);
        final int i4 = 2;
        c3315y5.setOnTouchListener(new View.OnTouchListener(this) { // from class: z.a

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f48883Y;

            {
                this.f48883Y = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i4) {
                    case 0:
                        return InMobiAdActivity.a(this.f48883Y, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f48883Y, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f48883Y, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f48883Y, view, motionEvent);
                }
            }
        });
        linearLayout.addView(c3315y5, layoutParams2);
        C3315y3 c3315y6 = new C3315y3(this, (byte) 6, this.f22662h);
        final int i5 = 3;
        c3315y6.setOnTouchListener(new View.OnTouchListener(this) { // from class: z.a

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ InMobiAdActivity f48883Y;

            {
                this.f48883Y = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i5) {
                    case 0:
                        return InMobiAdActivity.a(this.f48883Y, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(this.f48883Y, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(this.f48883Y, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(this.f48883Y, view, motionEvent);
                }
            }
        });
        linearLayout.addView(c3315y6, layoutParams2);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration newConfig) {
        Intrinsics.f(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z2, newConfig);
        onMultiWindowModeChanged(z2);
    }

    public static final boolean a(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C2963c4 c2963c4;
        Intrinsics.f(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this$0.f22660c;
            if (gestureDetectorOnGestureListenerC3005ec != null && (c2963c4 = gestureDetectorOnGestureListenerC3005ec.z0) != null) {
                C2963c4.a(c2963c4, 5, true, null, 12);
            }
            this$0.f22661e = true;
            this$0.finish();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public final void a() {
        C2963c4 c2963c4;
        P p2;
        InterfaceC3333z5 interfaceC3333z5 = this.f22662h;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("InMobiAdActivity", "onBackPressed");
        }
        int i2 = this.d;
        if (i2 == 102) {
            InterfaceC3333z5 interfaceC3333z6 = this.f22662h;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("InMobiAdActivity", "back pressed on ad");
            }
            C3078j5 c3078j5 = this.f22659b;
            if (c3078j5 == null || (p2 = c3078j5.f23717c) == null) {
                return;
            }
            p2.a();
            return;
        }
        if (i2 == 100) {
            InterfaceC3333z5 interfaceC3333z7 = this.f22662h;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).c("InMobiAdActivity", "back pressed in browser");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f22660c;
            if (gestureDetectorOnGestureListenerC3005ec != null && (c2963c4 = gestureDetectorOnGestureListenerC3005ec.z0) != null) {
                C2963c4.a(c2963c4, 7, true, null, 12);
            }
            this.f22661e = true;
            finish();
        }
    }
}
