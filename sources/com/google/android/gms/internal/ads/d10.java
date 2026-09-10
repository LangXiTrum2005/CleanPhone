package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d10 extends FrameLayout implements x00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30 f13335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f13336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f13337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gm f13338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c10 f13339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z00 f13341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13345k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f13348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap f13349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f13350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13351r;

    public d10(Context context, b30 b30Var, int i10, boolean z10, gm gmVar, j10 j10Var, yh0 yh0Var) {
        z00 w00Var;
        z00 v20Var;
        super(context);
        this.f13335a = b30Var;
        this.f13338d = gmVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13336b = frameLayout;
        if (((Boolean) zzba.zzc().a(am.f12353t)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        k9.c0.h(b30Var.zzk());
        a10 a10Var = b30Var.zzk().zza;
        k10 k10Var = new k10(context, b30Var.zzs(), b30Var.zzm(), gmVar, b30Var.zzi());
        if (i10 == 3) {
            v20Var = new v20(context, k10Var);
        } else {
            if (i10 == 2) {
                b30Var.zzN().getClass();
                w00Var = new q10(context, k10Var, b30Var, z10, j10Var, yh0Var);
            } else {
                w00Var = new w00(context, b30Var, z10, b30Var.zzN().b(), new k10(context, b30Var.zzs(), b30Var.zzm(), gmVar, b30Var.zzi()), yh0Var);
            }
            v20Var = w00Var;
        }
        this.f13341g = v20Var;
        View view = new View(context);
        this.f13337c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(v20Var, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzba.zzc().a(am.f12430y0)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzba.zzc().a(am.f12385v0)).booleanValue()) {
            a();
        }
        this.f13350q = new ImageView(context);
        this.f13340f = ((Long) zzba.zzc().a(am.A0)).longValue();
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12414x0)).booleanValue();
        this.f13345k = zBooleanValue;
        gmVar.c("spinner_used", true != zBooleanValue ? "0" : "1");
        this.f13339e = new c10(this);
        v20Var.i(this);
    }

    public final void a() {
        z00 z00Var = this.f13341g;
        if (z00Var == null) {
            return;
        }
        TextView textView = new TextView(z00Var.getContext());
        Resources resourcesC = zzt.zzh().c();
        textView.setText(String.valueOf(resourcesC == null ? "AdMob - " : resourcesC.getString(R.string.watermark_label_prefix)).concat(z00Var.h()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f13336b;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        z00 z00Var = this.f13341g;
        if (z00Var == null) {
            return;
        }
        long jO = z00Var.o();
        if (this.l == jO || jO <= 0) {
            return;
        }
        float f10 = jO / 1000.0f;
        if (((Boolean) zzba.zzc().a(am.G2)).booleanValue()) {
            String strValueOf = String.valueOf(f10);
            String strValueOf2 = String.valueOf(z00Var.v());
            String strValueOf3 = String.valueOf(z00Var.u());
            String strValueOf4 = String.valueOf(z00Var.t());
            String strValueOf5 = String.valueOf(z00Var.w());
            ((p9.b) zzt.zzk()).getClass();
            c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f10));
        }
        this.l = jO;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        z00 z00Var = this.f13341g;
        Integer numX = z00Var != null ? z00Var.x() : null;
        if (numX != null) {
            map.put("playerId", numX.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f13335a.e("onVideoEvent", map);
    }

    public final void d() {
        b30 b30Var = this.f13335a;
        if (b30Var.zzj() == null || !this.f13343i || this.f13344j) {
            return;
        }
        b30Var.zzj().getWindow().clearFlags(128);
        this.f13343i = false;
    }

    public final void e() {
        z00 z00Var = this.f13341g;
        if (z00Var != null && this.f13346m == 0) {
            c("canplaythrough", IronSourceConstants.EVENTS_DURATION, String.valueOf(z00Var.n() / 1000.0f), "videoWidth", String.valueOf(z00Var.r()), "videoHeight", String.valueOf(z00Var.s()));
        }
    }

    public final void f() {
        if (((Boolean) zzba.zzc().a(am.I2)).booleanValue()) {
            c10 c10Var = this.f13339e;
            c10Var.f12989c = false;
            y01 y01Var = zzs.zza;
            y01Var.removeCallbacks(c10Var);
            y01Var.postDelayed(c10Var, 250L);
        }
        b30 b30Var = this.f13335a;
        if (b30Var.zzj() != null && !this.f13343i) {
            boolean z10 = (b30Var.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.f13344j = z10;
            if (!z10) {
                b30Var.zzj().getWindow().addFlags(128);
                this.f13343i = true;
            }
        }
        this.f13342h = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.f13339e.a();
            z00 z00Var = this.f13341g;
            if (z00Var != null) {
                l00.f16613f.execute(new d(z00Var, 19));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        d();
        this.f13342h = false;
    }

    public final void h() {
        if (((Boolean) zzba.zzc().a(am.I2)).booleanValue()) {
            this.f13339e.a();
        }
        c(X3.i.g0, new String[0]);
        d();
    }

    public final void i() {
        if (this.f13351r && this.f13349p != null) {
            ImageView imageView = this.f13350q;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f13349p);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f13336b;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f13339e.a();
        this.f13346m = this.l;
        zzs.zza.post(new b10(this, 1));
    }

    public final void j(int i10, int i11) {
        if (this.f13345k) {
            ul ulVar = am.f12446z0;
            int iMax = Math.max(i10 / ((Integer) zzba.zzc().a(ulVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) zzba.zzc().a(ulVar)).intValue(), 1);
            Bitmap bitmap = this.f13349p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f13349p.getHeight() == iMax2) {
                return;
            }
            this.f13349p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f13351r = false;
        }
    }

    public final void k() {
        this.f13337c.setVisibility(4);
        zzs.zza.post(new b10(this, 2));
    }

    public final void l(int i10, int i11, int i12, int i13) {
        if (zze.zzc()) {
            int length = String.valueOf(i10).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length() + 3 + String.valueOf(i13).length());
            l1.d.p(sb2, "Set video bounds to x:", i10, ";y:", i11);
            sb2.append(";w:");
            sb2.append(i12);
            sb2.append(";h:");
            sb2.append(i13);
            zze.zza(sb2.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.f13336b.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c10 c10Var = this.f13339e;
        if (z10) {
            c10Var.f12989c = false;
            y01 y01Var = zzs.zza;
            y01Var.removeCallbacks(c10Var);
            y01Var.postDelayed(c10Var, 250L);
        } else {
            c10Var.a();
            this.f13346m = this.l;
        }
        zzs.zza.post(new c10(this, z10, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        boolean z10 = false;
        c10 c10Var = this.f13339e;
        if (i10 == 0) {
            c10Var.f12989c = false;
            y01 y01Var = zzs.zza;
            y01Var.removeCallbacks(c10Var);
            y01Var.postDelayed(c10Var, 250L);
            z10 = true;
        } else {
            c10Var.a();
            this.f13346m = this.l;
        }
        zzs.zza.post(new c10(this, z10, 0));
    }
}
