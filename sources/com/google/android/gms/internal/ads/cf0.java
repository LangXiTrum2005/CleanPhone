package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzr;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh0 f13150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ng0 f13151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bf0 f13152c = null;

    public cf0(eh0 eh0Var, ng0 ng0Var) {
        this.f13150a = eh0Var;
        this.f13151b = ng0Var;
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        b30 b30VarA = this.f13150a.a(zzr.zzb(), null, null);
        b30VarA.zzE().setVisibility(4);
        b30VarA.zzE().setContentDescription("policy_validator");
        b30VarA.D("/sendMessageToSdk", new eq(this, 8));
        b30VarA.D("/hideValidatorOverlay", new af0(this, windowManager, frameLayout));
        b30VarA.D("/open", new vq(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(b30VarA);
        af0 af0Var = new af0(this, frameLayout, windowManager);
        ng0 ng0Var = this.f13151b;
        ng0Var.b("/loadNativeAdPolicyViolations", new sd0(ng0Var, weakReference, "/loadNativeAdPolicyViolations", af0Var));
        ng0Var.b("/showValidatorOverlay", new sd0(ng0Var, new WeakReference(b30VarA), "/showValidatorOverlay", iq.f15822g));
        return b30VarA.zzE();
    }
}
