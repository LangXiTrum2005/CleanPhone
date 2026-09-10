package com.facebook.ads.redexgen.core;

import android.net.Uri;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2707nn implements FL, InterfaceC1291Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C11205i A01;
    public InterfaceC1407Hd A02;
    public boolean A04;
    public final Uri A06;
    public final AnonymousClass48 A07;
    public final AG A08;
    public final DD A09;
    public final HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C12239p A0D;
    public final HV A0B = new HV();
    public boolean A03 = true;
    public final long A05 = Cq.A00();

    public C2707nn(C12239p c12239p, Uri uri, InterfaceC2796pF interfaceC2796pF, DD dd, HA ha, AnonymousClass48 anonymousClass48) {
        this.A0D = c12239p;
        this.A06 = uri;
        this.A08 = new AG(interfaceC2796pF);
        this.A09 = dd;
        this.A0A = ha;
        this.A07 = anonymousClass48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j, long j2) {
        this.A0B.A00 = j;
        this.A00 = j2;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public final void A4r() {
        this.A0C = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x011b */
    @Override // com.facebook.ads.redexgen.core.FL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AAr() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2707nn.AAr():void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1291Cp
    public final void AE5(C11074v c11074v) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c11074v.A07();
        InterfaceC1407Hd interfaceC1407Hd = (InterfaceC1407Hd) AbstractC10843y.A01(this.A02);
        interfaceC1407Hd.AIr(c11074v, iA07);
        interfaceC1407Hd.AIu(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
