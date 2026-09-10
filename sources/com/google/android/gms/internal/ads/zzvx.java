package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvx {
    private static final AtomicLong zza = new AtomicLong();

    public zzvx(long j, zzhf zzhfVar, Uri uri, Map map, long j2, long j3, long j4) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
