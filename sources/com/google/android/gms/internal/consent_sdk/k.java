package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.ump.ConsentForm;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f23064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f23065b;

    public k(m mVar, Activity activity) {
        Objects.requireNonNull(mVar);
        this.f23065b = mVar;
        this.f23064a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m mVar = this.f23065b;
        Dialog dialog = mVar.f23082g;
        AtomicReference atomicReference = mVar.l;
        if (dialog == null || !mVar.f23087m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        u uVar = mVar.f23077b;
        if (uVar != null) {
            uVar.f23210a = activity;
        }
        k kVar = (k) atomicReference.getAndSet(null);
        if (kVar != null) {
            kVar.f23065b.f23076a.unregisterActivityLifecycleCallbacks(kVar);
            k kVar2 = new k(mVar, activity);
            mVar.f23076a.registerActivityLifecycleCallbacks(kVar2);
            atomicReference.set(kVar2);
        }
        Dialog dialog2 = mVar.f23082g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f23064a) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        m mVar = this.f23065b;
        if (zIsChangingConfigurations && mVar.f23087m && (dialog = mVar.f23082g) != null) {
            dialog.dismiss();
            return;
        }
        p1 p1Var = new p1(3, "Activity is destroyed.");
        Dialog dialog2 = mVar.f23082g;
        if (dialog2 != null) {
            dialog2.dismiss();
            mVar.f23082g = null;
        }
        mVar.f23077b.f23210a = null;
        k kVar = (k) mVar.l.getAndSet(null);
        if (kVar != null) {
            kVar.f23065b.f23076a.unregisterActivityLifecycleCallbacks(kVar);
        }
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) mVar.f23086k.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        mVar.c(p1Var);
        onConsentFormDismissedListener.onConsentFormDismissed(p1Var.d());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
