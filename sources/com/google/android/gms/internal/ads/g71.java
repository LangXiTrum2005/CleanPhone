package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f14784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f14790g;

    public final h71 a() {
        IBinder iBinder;
        if (this.f14790g == 31 && (iBinder = this.f14784a) != null) {
            return new h71(iBinder, this.f14785b, this.f14786c, this.f14787d, this.f14788e, this.f14789f);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f14784a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f14790g & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f14790g & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f14790g & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f14790g & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.f14790g & 16) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
