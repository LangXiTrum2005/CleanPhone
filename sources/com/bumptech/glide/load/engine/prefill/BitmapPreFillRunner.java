package com.bumptech.glide.load.engine.prefill;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class BitmapPreFillRunner implements Runnable {

    public static class Clock {
    }

    public static final class UniqueKey implements Key {
        @Override // com.bumptech.glide.load.Key
        public final void b(MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(1L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw null;
    }
}
