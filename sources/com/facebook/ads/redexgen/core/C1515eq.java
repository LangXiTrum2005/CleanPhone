package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Exo does not declare this as public but we need to as Hero's CacheDataSink refers to this")
public final class C1515eq extends BufferedOutputStream {
    public static String[] A01 = {"PiQy", "G6KCp7f52sDEA89p4imp", "97", "6pSBfAH1OxCBcy5yGydTYFPB7r4upCRI", "lYiFuyNPOwIxx4wYM4ZrzJHjTbOFYhfk", "gvgTm", "3F3tygLGcCOUvU", "FByKFNUieM4ghTpYxOeDjwgLwoPn3nTA"};
    public boolean A00;

    public C1515eq(OutputStream outputStream) {
        super(outputStream);
    }

    public C1515eq(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void A00(OutputStream outputStream) {
        AbstractC1517es.A08(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.A00 = true;
        Throwable th = null;
        try {
            flush();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable th3) {
            if (A01[4].charAt(29) == 'K') {
                Throwable thrown = new RuntimeException();
                throw thrown;
            }
            String[] strArr = A01;
            strArr[3] = "B1Xshf9VxYDce5z2qBH6SkhHm5u7eWij";
            strArr[7] = "HSYkgNOxIO60XV4ngpdc16Z8wmTOtZr1";
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            AbstractC1600gE.A11(th);
            throw null;
        }
    }
}
