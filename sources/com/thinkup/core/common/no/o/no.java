package com.thinkup.core.common.no.o;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes6.dex */
public final class no {
    private final mo m;
    private final InetAddress[] o;

    public no(InetAddress[] inetAddressArr, mo moVar) {
        this.o = inetAddressArr;
        this.m = moVar;
    }

    private mo n() {
        return this.m;
    }

    public final om m() {
        mo moVar = this.m;
        if (moVar != null) {
            return moVar.o();
        }
        return null;
    }

    public final InetAddress[] o() {
        return this.o;
    }
}
