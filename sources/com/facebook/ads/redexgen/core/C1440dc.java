package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1440dc extends IOException {
    public final int A00;

    public C1440dc(int i) {
        this.A00 = i;
    }

    public C1440dc(String str, int i) {
        super(str);
        this.A00 = i;
    }

    public C1440dc(String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
    }

    public C1440dc(Throwable th, int i) {
        super(th);
        this.A00 = i;
    }

    public static boolean A06(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C1440dc) && ((C1440dc) cause).A00 == 2008) {
                return true;
            }
        }
        return false;
    }
}
