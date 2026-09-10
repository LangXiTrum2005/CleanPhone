package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kv extends md0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16533k;
    public final Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b30 f16534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Activity f16535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t0 f16536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f16537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f16538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b21 f16539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PopupWindow f16540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f16541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ViewGroup f16542u;

    static {
        String[] strArr = {X3.e.f27730c, X3.e.f27729b, "top-center", TtmlNode.CENTER, X3.e.f27732e, X3.e.f27731d, "bottom-center"};
        x.f fVar = new x.f(7);
        Collections.addAll(fVar, strArr);
        Collections.unmodifiableSet(fVar);
    }

    public kv(b30 b30Var, b21 b21Var) {
        super(10, b30Var, "resize");
        this.f16526d = X3.e.f27729b;
        this.f16527e = true;
        this.f16528f = 0;
        this.f16529g = 0;
        this.f16530h = -1;
        this.f16531i = 0;
        this.f16532j = 0;
        this.f16533k = -1;
        this.l = new Object();
        this.f16534m = b30Var;
        this.f16535n = b30Var.zzj();
        this.f16539r = b21Var;
    }

    public final void m(boolean z10) {
        synchronized (this.l) {
            try {
                if (this.f16540s != null) {
                    if (!((Boolean) zzba.zzc().a(am.f12395vc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        n(z10);
                    } else {
                        l00.f16613f.a(new com.adjust.sdk.f0(1, this, z10));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(boolean z10) {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12409wc)).booleanValue();
        b30 b30Var = this.f16534m;
        if (zBooleanValue) {
            this.f16541t.removeView((View) b30Var);
            this.f16540s.dismiss();
        } else {
            this.f16540s.dismiss();
            this.f16541t.removeView((View) b30Var);
        }
        if (((Boolean) zzba.zzc().a(am.xc)).booleanValue()) {
            View view = (View) b30Var;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f16542u;
        if (viewGroup != null) {
            viewGroup.removeView(this.f16537p);
            if (((Boolean) zzba.zzc().a(am.f12442yc)).booleanValue()) {
                try {
                    this.f16542u.addView((View) b30Var);
                    b30Var.F(this.f16536o);
                } catch (IllegalStateException e10) {
                    int i10 = zze.zza;
                    zzo.zzg("Unable to add webview back to view hierarchy.", e10);
                    zzt.zzh().d("MraidCallResizeHandler.collapseInternal", e10);
                }
            } else {
                this.f16542u.addView((View) b30Var);
                b30Var.F(this.f16536o);
            }
        }
        if (z10) {
            k(BuildConfig.FLAVOR);
            b21 b21Var = this.f16539r;
            if (b21Var != null) {
                ((dh0) b21Var.f12616b).f13525c.S0(jq.f16144o);
            }
        }
        this.f16540s = null;
        this.f16541t = null;
        this.f16542u = null;
        this.f16538q = null;
    }
}
