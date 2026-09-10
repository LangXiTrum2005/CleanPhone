package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class t4 extends t2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q0.a f9796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f9797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f9798p;

    public t4(q0.a aVar, boolean z10, Context context) {
        super(t2.c.RIGHT_DETAIL);
        this.f9796n = aVar;
        this.f9797o = context;
        this.f9735c = new SpannedString(aVar.a());
        this.f9798p = z10;
    }

    @Override // com.applovin.impl.t2
    public SpannedString f() {
        return new SpannedString(this.f9796n.a(this.f9797o));
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.t2
    public boolean p() {
        Boolean boolB = this.f9796n.b(this.f9797o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f9798p));
        }
        return false;
    }
}
