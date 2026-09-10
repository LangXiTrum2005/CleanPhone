package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes3.dex */
public final class SeekParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SeekParameters f17198c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17200b;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        new SeekParameters(Long.MAX_VALUE, 0L);
        new SeekParameters(0L, Long.MAX_VALUE);
        f17198c = seekParameters;
    }

    public SeekParameters(long j, long j2) {
        Assertions.b(j >= 0);
        Assertions.b(j2 >= 0);
        this.f17199a = j;
        this.f17200b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekParameters.class == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.f17199a == seekParameters.f17199a && this.f17200b == seekParameters.f17200b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17199a) * 31) + ((int) this.f17200b);
    }
}
