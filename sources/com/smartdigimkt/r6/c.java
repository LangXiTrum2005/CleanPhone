package com.smartdigimkt.r6;

import android.content.Context;
import com.smartdigimkt.u6.j;

/* JADX INFO: loaded from: classes6.dex */
public class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38099h;

    public c(Context context, String str, String str2, long j) {
        super(context, str, str2, j);
    }

    @Override // com.smartdigimkt.r6.e
    public int a() {
        return 2;
    }

    @Override // com.smartdigimkt.r6.e
    public b c() {
        boolean z2;
        boolean zB = this.f38099h;
        if (System.currentTimeMillis() - this.d > h.e().i()) {
            zB = com.smartdigimkt.n8.h.b(this.f38102b, this.f38101a);
            j.a(com.smartdigimkt.u6.d.a(this.f38102b)).a(this.f38103c, zB, this.f38101a);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z2;
        return new b(this.f38101a, this.f38103c, z3, z3 ? System.currentTimeMillis() : this.d, zB);
    }

    public c(Context context, String str, String str2, long j, boolean z2) {
        this(context, str, str2, j);
        this.f38099h = z2;
    }
}
