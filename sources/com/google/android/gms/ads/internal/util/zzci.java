package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.s00;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f11119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f11120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f11124f;

    public zzci(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f11120b = activity;
        this.f11119a = view;
        this.f11124f = onGlobalLayoutListener;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f11121c) {
            return;
        }
        Activity activity = this.f11120b;
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f11124f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        com.google.android.gms.ads.internal.zzt.zzC();
        s00 s00Var = new s00(this.f11119a, onGlobalLayoutListener);
        View view = (View) ((WeakReference) s00Var.f17550a).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            s00Var.X0(viewTreeObserver2);
        }
        this.f11121c = true;
    }

    public final void zza(Activity activity) {
        this.f11120b = activity;
    }

    public final void zzb() {
        this.f11123e = true;
        if (this.f11122d) {
            a();
        }
    }

    public final void zzc() {
        View decorView;
        this.f11123e = false;
        Activity activity = this.f11120b;
        if (activity != null && this.f11121c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f11124f);
            }
            this.f11121c = false;
        }
    }

    public final void zzd() {
        this.f11122d = true;
        if (this.f11123e) {
            a();
        }
    }

    public final void zze() {
        View decorView;
        this.f11122d = false;
        Activity activity = this.f11120b;
        if (activity != null && this.f11121c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f11124f);
            }
            this.f11121c = false;
        }
    }
}
