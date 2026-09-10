package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f20107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20108b;

    public t02(int i10) {
        switch (i10) {
            case 1:
                this.f20107a = new SparseBooleanArray();
                break;
            default:
                this.f20107a = new SparseBooleanArray();
                break;
        }
    }

    public void a(int i10) {
        go.k.t(!this.f20108b);
        this.f20107a.append(i10, true);
    }

    public i1.n b() {
        go.k.t(!this.f20108b);
        this.f20108b = true;
        return new i1.n(this.f20107a);
    }

    public void c(int i10) {
        ps1.c0(!this.f20108b);
        this.f20107a.append(i10, true);
    }

    public z02 d() {
        ps1.c0(!this.f20108b);
        this.f20108b = true;
        return new z02(this.f20107a);
    }
}
