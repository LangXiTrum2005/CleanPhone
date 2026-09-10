package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dr1 {
    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final fr1 h() {
        if (this instanceof fr1) {
            return (fr1) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final hr1 m() {
        if (this instanceof hr1) {
            return (hr1) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            qr1 qr1Var = new qr1(new ae.t(sb2, 2));
            qr1Var.f19183h = 1;
            ai1.k(qr1Var, this);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
