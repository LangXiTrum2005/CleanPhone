package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1272ar {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C1447dj A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1272ar(long j, C1447dj c1447dj, long j2) {
        Uri uri;
        if (c1447dj != null) {
            uri = c1447dj.A06;
        } else {
            uri = null;
        }
        this(j, c1447dj, uri, Collections.emptyMap(), j2, 0L, 0L);
    }

    public C1272ar(long j, C1447dj c1447dj, Uri uri, Map<String, List<String>> responseHeaders, long j2, long j3, long j4) {
        this.A03 = j;
        this.A05 = c1447dj;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
