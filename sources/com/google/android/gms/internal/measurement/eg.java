package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eg f23433c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f23435b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f23433c = new eg(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public eg(UUID uuid, long j10) {
        this.f23434a = uuid;
        this.f23435b = new AtomicLong((j10 ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        long j12;
        do {
            atomicLong = this.f23435b;
            j10 = atomicLong.get();
            j11 = ((j10 * 25214903917L) + 11) & 281474976710655L;
            j12 = ((25214903917L * j11) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j10, j12));
        return (((long) ((int) (j11 >>> 16))) << 32) + ((long) ((int) (j12 >>> 16)));
    }

    public final UUID b() {
        long jA = a() & (-61441);
        long jA2 = a() >>> 2;
        UUID uuid = this.f23434a;
        return new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
    }
}
