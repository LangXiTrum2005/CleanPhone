package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12848d;

    public /* synthetic */ bq0(int i10, int i11, int i12, int i13) {
        this.f12845a = i10;
        this.f12846b = i11;
        this.f12847c = i12;
        this.f12848d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f12845a - this.f12846b <= 1) {
                return false;
            }
        } else if (this.f12847c - this.f12848d <= 1) {
            return false;
        }
        return true;
    }
}
