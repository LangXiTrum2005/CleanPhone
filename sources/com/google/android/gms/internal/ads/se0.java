package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f19938k = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f19939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou0 f19940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le0 f19941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final je0 f19942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ze0 f19943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cf0 f19944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f19945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f19946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final eo f19947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ge0 f19948j;

    public se0(zzj zzjVar, ou0 ou0Var, le0 le0Var, je0 je0Var, ze0 ze0Var, cf0 cf0Var, Executor executor, k00 k00Var, ge0 ge0Var) {
        this.f19939a = zzjVar;
        this.f19940b = ou0Var;
        this.f19947i = ou0Var.f18369j;
        this.f19941c = le0Var;
        this.f19942d = je0Var;
        this.f19943e = ze0Var;
        this.f19944f = cf0Var;
        this.f19945g = executor;
        this.f19946h = k00Var;
        this.f19948j = ge0Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(df0 df0Var) {
        if (df0Var == null) {
            return;
        }
        Context context = df0Var.w1().getContext();
        if (zzbs.zzi(context, this.f19941c.f16874a)) {
            if (!(context instanceof Activity)) {
                int i10 = zze.zza;
                zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            cf0 cf0Var = this.f19944f;
            if (cf0Var == null || df0Var.v1() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(cf0Var.a(df0Var.v1(), windowManager), zzbs.zzk());
            } catch (k30 e10) {
                zze.zzb("web view can not be obtained", e10);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z10) {
        View view;
        View view2;
        if (z10) {
            je0 je0Var = this.f19942d;
            synchronized (je0Var) {
                view2 = je0Var.f16063o;
            }
        } else {
            je0 je0Var2 = this.f19942d;
            synchronized (je0Var2) {
                view = je0Var2.f16064p;
            }
            view2 = view;
        }
        if (view2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view2.getParent() instanceof ViewGroup) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        viewGroup.addView(view2, ((Boolean) zzba.zzc().a(am.S4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
