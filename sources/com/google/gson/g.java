package com.google.gson;

import be.i1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public boolean b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final j h() {
        if (this instanceof j) {
            return (j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            ge.b bVar = new ge.b(new ae.t(sb2, 0));
            bVar.f41886h = 1;
            i1.f5647z.getClass();
            be.m.e(bVar, this);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
