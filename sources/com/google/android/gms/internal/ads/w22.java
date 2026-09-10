package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f21394b;

    public w22(boolean z10, boolean z11, boolean z12, int i10) {
        switch (i10) {
            case 1:
                this.f21393a = (z10 || z11 || z12) ? 1 : 0;
                break;
            default:
                int i11 = 1;
                if (!z10 && !z11 && !z12) {
                    i11 = 0;
                }
                this.f21393a = i11;
                break;
        }
    }
}
