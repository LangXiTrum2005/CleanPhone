package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f22550c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f22548a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22549b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22551d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22552e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22553f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22554g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22555h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22556i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22557j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22558k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    public k1.a a() {
        Layout.Alignment alignment;
        float f10 = this.f22555h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.f22551d;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.f22556i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.f22551d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        k1.a aVar = new k1.a();
        int i13 = this.f22551d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            d5.u.v(i13, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        aVar.f44203c = alignment;
        float f12 = this.f22552e;
        int i14 = this.f22553f;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        aVar.f44205e = f11;
        aVar.f44206f = i14;
        aVar.f44207g = this.f22554g;
        aVar.f44208h = f10;
        aVar.f44209i = i11;
        float f13 = this.f22557j;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 == 1) {
            f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
        } else if (i11 != 2) {
            throw new IllegalStateException(String.valueOf(i11));
        }
        aVar.l = Math.min(f13, f10);
        aVar.f44215p = this.f22558k;
        CharSequence charSequence = this.f22550c;
        if (charSequence != null) {
            aVar.f44201a = charSequence;
            aVar.f44202b = null;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public z70 b() {
        Layout.Alignment alignment;
        float f10 = this.f22555h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.f22551d;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.f22556i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.f22551d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        z70 z70Var = new z70();
        int i13 = this.f22551d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            com.applovin.impl.ca.r(new StringBuilder(String.valueOf(i13).length() + 23), "Unknown textAlignment: ", i13, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        z70Var.f22535c = alignment;
        float f12 = this.f22552e;
        int i14 = this.f22553f;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        z70Var.f22537e = f11;
        z70Var.f22538f = i14;
        z70Var.f22539g = this.f22554g;
        z70Var.f22540h = f10;
        z70Var.f22541i = i11;
        float f13 = this.f22557j;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException(String.valueOf(i11));
            }
        } else if (f10 <= 0.5f) {
            f10 += f10;
        } else {
            float f14 = 1.0f - f10;
            f10 = f14 + f14;
        }
        z70Var.l = Math.min(f13, f10);
        z70Var.f22545n = this.f22558k;
        CharSequence charSequence = this.f22550c;
        if (charSequence != null) {
            z70Var.f22533a = charSequence;
            z70Var.f22534b = null;
        }
        return z70Var;
    }
}
