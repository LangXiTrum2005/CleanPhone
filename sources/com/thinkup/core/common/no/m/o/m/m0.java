package com.thinkup.core.common.no.m.o.m;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 extends RuntimeException {
    private IOException m;
    private IOException o;

    public m0(IOException iOException) {
        super(iOException);
        this.o = iOException;
        this.m = iOException;
    }

    public final IOException m() {
        return this.m;
    }

    public final IOException o() {
        return this.o;
    }

    public final void o(IOException iOException) {
        com.thinkup.core.common.no.m.o.n.o(this.o, iOException);
        this.m = iOException;
    }
}
