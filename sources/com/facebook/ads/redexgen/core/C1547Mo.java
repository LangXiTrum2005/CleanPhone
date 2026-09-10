package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Exo does not declare this as public but we need to as Hero's CacheDataSink refers to this")
public final class C1547Mo extends BufferedOutputStream {
    public boolean A00;

    public C1547Mo(OutputStream outputStream) {
        super(outputStream);
    }

    public C1547Mo(OutputStream outputStream, int i2) {
        super(outputStream, i2);
    }

    public final void A00(OutputStream outputStream) {
        AbstractC10843y.A08(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.A00 = true;
        Throwable e2 = null;
        try {
            flush();
        } catch (Throwable th) {
            e2 = th;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e2 == null) {
                e2 = thrown;
            }
        }
        if (e2 != null) {
            C5C.A11(e2);
            throw null;
        }
    }
}
