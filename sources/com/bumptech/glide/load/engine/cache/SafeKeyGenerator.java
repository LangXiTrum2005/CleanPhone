package com.bumptech.glide.load.engine.cache;

import androidx.core.util.Pools;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import com.inmobi.commons.core.configs.AdConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class SafeKeyGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f12530a = new LruCache(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool f12531b = FactoryPools.a(10, new AnonymousClass1());

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.SafeKeyGenerator$1, reason: invalid class name */
    public class AnonymousClass1 implements FactoryPools.Factory<PoolableDigestContainer> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final Object a() {
            try {
                return new PoolableDigestContainer(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static final class PoolableDigestContainer implements FactoryPools.Poolable {
        public final MessageDigest X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final StateVerifier f12532Y = StateVerifier.a();

        public PoolableDigestContainer(MessageDigest messageDigest) {
            this.X = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        public final StateVerifier b() {
            return this.f12532Y;
        }
    }

    public final String a(Key key) {
        String str;
        synchronized (this.f12530a) {
            str = (String) this.f12530a.b(key);
        }
        if (str == null) {
            Object objB = this.f12531b.b();
            Preconditions.c(objB, "Argument must not be null");
            PoolableDigestContainer poolableDigestContainer = (PoolableDigestContainer) objB;
            try {
                key.b(poolableDigestContainer.X);
                byte[] bArrDigest = poolableDigestContainer.X.digest();
                char[] cArr = Util.f12852b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < bArrDigest.length; i2++) {
                        byte b2 = bArrDigest[i2];
                        int i3 = i2 * 2;
                        int i4 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
                        char[] cArr2 = Util.f12851a;
                        cArr[i3] = cArr2[i4];
                        cArr[i3 + 1] = cArr2[b2 & 15];
                    }
                    str = new String(cArr);
                }
                this.f12531b.a(poolableDigestContainer);
            } catch (Throwable th) {
                this.f12531b.a(poolableDigestContainer);
                throw th;
            }
        }
        synchronized (this.f12530a) {
            this.f12530a.e(key, str);
        }
        return str;
    }
}
