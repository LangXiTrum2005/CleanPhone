package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f12683i;

    public b8(int i10) {
        switch (i10) {
            case 1:
                this.f12683i = new l1.q();
                this.f12675a = new int[NotificationCompat.FLAG_LOCAL_ONLY];
                break;
            default:
                this.f12683i = new np0();
                this.f12675a = new int[NotificationCompat.FLAG_LOCAL_ONLY];
                break;
        }
    }
}
