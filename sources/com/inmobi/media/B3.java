package com.inmobi.media;

import A.ViewTreeObserverOnPreDrawListenerC0893h;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class B3 extends lf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC3333z5 f22714n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f22715p;
    public final WeakReference q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(ff visibilityChecker, Activity activity, InterfaceC3333z5 interfaceC3333z5) {
        super(visibilityChecker, (byte) 1, interfaceC3333z5);
        Intrinsics.f(visibilityChecker, "visibilityChecker");
        Intrinsics.f(activity, "activity");
        this.f22714n = interfaceC3333z5;
        this.o = "B3";
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.e(decorView, "getDecorView(...)");
        this.q = new WeakReference(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserverOnPreDrawListenerC0893h viewTreeObserverOnPreDrawListenerC0893h = new ViewTreeObserverOnPreDrawListenerC0893h(this, 0);
            this.f22715p = viewTreeObserverOnPreDrawListenerC0893h;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0893h);
        } else if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("B3", "Visibility Tracker was unable to track views because the  root view tree observer was not alive");
        }
    }

    public static final boolean a(B3 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.g();
        return true;
    }

    @Override // com.inmobi.media.lf
    public final void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.f22714n;
        if (interfaceC3333z5 != null) {
            String TAG = this.o;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "unregisterPreDrawListener");
        }
        View view = (View) this.q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f22715p);
            }
        }
        super.b();
    }

    @Override // com.inmobi.media.lf
    public final int c() {
        return 100;
    }

    @Override // com.inmobi.media.lf
    public final void d() {
    }

    @Override // com.inmobi.media.lf
    public final void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.f22714n;
        if (interfaceC3333z5 != null) {
            String TAG = this.o;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "pause");
        }
        if (this.f23796i.get()) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f22714n;
        if (interfaceC3333z6 != null) {
            String TAG2 = this.o;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).c(TAG2, "unregisterPreDrawListener");
        }
        View view = (View) this.q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f22715p);
            }
        }
        super.e();
    }

    @Override // com.inmobi.media.lf
    public final void f() {
        InterfaceC3333z5 interfaceC3333z5 = this.f22714n;
        if (interfaceC3333z5 != null) {
            String TAG = this.o;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "resume");
        }
        if (this.f23796i.get()) {
            View view = (View) this.q.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f22715p);
                } else {
                    InterfaceC3333z5 interfaceC3333z6 = this.f22714n;
                    if (interfaceC3333z6 != null) {
                        String TAG2 = this.o;
                        Intrinsics.e(TAG2, "TAG");
                        ((A5) interfaceC3333z6).b(TAG2, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
                    }
                }
            }
            super.f();
        }
    }
}
