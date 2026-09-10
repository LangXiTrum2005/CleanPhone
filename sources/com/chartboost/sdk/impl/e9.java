package com.chartboost.sdk.impl;

import android.app.Activity;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e9 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9 f13792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye f13793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf f13794c;
    public final f6 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13795e;

    public e9(c9 view, ye rendererActivityBridge, qf sdkConfiguration, f6 displayMeasurement) {
        Intrinsics.f(view, "view");
        Intrinsics.f(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.f(sdkConfiguration, "sdkConfiguration");
        Intrinsics.f(displayMeasurement, "displayMeasurement");
        this.f13792a = view;
        this.f13793b = rendererActivityBridge;
        this.f13794c = sdkConfiguration;
        this.d = displayMeasurement;
        this.f13795e = -1;
    }

    @Override // com.chartboost.sdk.impl.b
    public void a(int i2, boolean z2) {
        int i3;
        try {
            CBImpressionActivity activity = this.f13792a.getActivity();
            if (qd.a((Activity) activity)) {
                return;
            }
            i();
            if (i2 != 0) {
                i3 = 1;
                if (i2 != 1) {
                    i3 = z2 ? -1 : activity.getResources().getConfiguration().orientation;
                }
            } else {
                i3 = 0;
            }
            activity.setRequestedOrientation(i3);
        } catch (Exception e2) {
            za.b("applyOrientationProperties: ", e2);
        }
    }

    public void b() {
        try {
            this.f13793b.e();
        } catch (Exception e2) {
            za.a("Cannot perform onStop", e2);
        }
    }

    public void c() {
        this.f13793b.a(this, this.f13792a.getActivity());
        this.f13792a.setFullscreen();
        i();
    }

    public void d() {
        try {
            this.f13793b.c();
        } catch (Exception e2) {
            za.a("Cannot perform onStop", e2);
        }
    }

    public void e() {
        try {
            this.f13793b.b();
        } catch (Exception e2) {
            za.a("Cannot perform onPause", e2);
        }
        try {
            qd.a(this.f13792a.getActivity(), this.f13794c);
        } catch (Exception e3) {
            za.a("Cannot lock the orientation in activity", e3);
        }
    }

    public void f() {
        try {
            this.f13793b.a(this, this.f13792a.getActivity());
        } catch (Exception e2) {
            za.a("Cannot setActivityRendererInterface", e2);
        }
        try {
            this.f13793b.onResume();
        } catch (Exception e3) {
            za.a("Cannot perform onResume", e3);
        }
        this.f13792a.setFullscreen();
        try {
            qd.a(this.f13792a.getActivity(), this.f13794c, this.d);
        } catch (Exception e4) {
            za.a("Cannot lock the orientation in activity", e4);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void finishActivity() {
        this.f13792a.finishActivity();
    }

    public void g() {
        try {
            this.f13793b.onStart();
        } catch (Exception e2) {
            za.a("Cannot perform onResume", e2);
        }
    }

    public void h() {
        try {
            if (this.f13792a.isActivityHardwareAccelerated()) {
                return;
            }
            za.b("The activity passed down is not hardware accelerated, so Chartboost cannot show ads", (Throwable) null, 2, (Object) null);
            this.f13793b.a(CBError.Impression.HARDWARE_ACCELERATION_DISABLED);
            this.f13792a.finishActivity();
        } catch (Exception e2) {
            za.b("onAttachedToWindow", e2);
        }
    }

    public final void i() {
        try {
            this.f13795e = this.f13792a.getActivity().getRequestedOrientation();
        } catch (Exception e2) {
            za.b("saveOriginalOrientation: ", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void a(ij viewBase) {
        Intrinsics.f(viewBase, "viewBase");
        this.f13792a.attachViewToActivity(viewBase);
    }

    @Override // com.chartboost.sdk.impl.b
    public void a() {
        try {
            CBImpressionActivity activity = this.f13792a.getActivity();
            if (qd.a((Activity) activity)) {
                return;
            }
            int requestedOrientation = activity.getRequestedOrientation();
            int i2 = this.f13795e;
            if (requestedOrientation != i2) {
                za.b("restoreOriginalOrientation: " + i2, (Throwable) null, 2, (Object) null);
                activity.setRequestedOrientation(this.f13795e);
            }
        } catch (Exception e2) {
            za.b("restoreOriginalOrientation: ", e2);
        }
    }
}
