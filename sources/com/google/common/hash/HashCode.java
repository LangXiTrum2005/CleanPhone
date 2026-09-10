package com.google.common.hash;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class HashCode {
    public static final char[] X = "0123456789abcdef".toCharArray();

    public static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.hash.HashCode
        public final byte[] d() {
            throw null;
        }

        @Override // com.google.common.hash.HashCode
        public final int g() {
            throw null;
        }

        @Override // com.google.common.hash.HashCode
        public final long h() {
            throw null;
        }

        @Override // com.google.common.hash.HashCode
        public final int i() {
            throw null;
        }

        @Override // com.google.common.hash.HashCode
        public final boolean j(HashCode hashCode) {
            throw null;
        }

        @Override // com.google.common.hash.HashCode
        public final byte[] k() {
            return null;
        }
    }

    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.hash.HashCode
        public final byte[] d() {
            return new byte[]{(byte) 0, (byte) (0 >> 8), (byte) (0 >> 16), (byte) (0 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public final int g() {
            return 0;
        }

        @Override // com.google.common.hash.HashCode
        public final long h() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        public final int i() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        public final boolean j(HashCode hashCode) {
            return hashCode.g() == 0;
        }
    }

    public static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.hash.HashCode
        public final byte[] d() {
            return new byte[]{(byte) 0, (byte) (0 >> 8), (byte) (0 >> 16), (byte) (0 >> 24), (byte) (0 >> 32), (byte) (0 >> 40), (byte) (0 >> 48), (byte) (0 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public final int g() {
            return (int) 0;
        }

        @Override // com.google.common.hash.HashCode
        public final long h() {
            return 0L;
        }

        @Override // com.google.common.hash.HashCode
        public final int i() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        public final boolean j(HashCode hashCode) {
            return 0 == hashCode.h();
        }
    }

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        return i() == hashCode.i() && j(hashCode);
    }

    public abstract int g();

    public abstract long h();

    public final int hashCode() {
        if (i() >= 32) {
            return g();
        }
        byte[] bArrK = k();
        int i2 = bArrK[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i3 = 1; i3 < bArrK.length; i3++) {
            i2 |= (bArrK[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i3 * 8);
        }
        return i2;
    }

    public abstract int i();

    public abstract boolean j(HashCode hashCode);

    public byte[] k() {
        return d();
    }

    public final String toString() {
        byte[] bArrK = k();
        StringBuilder sb = new StringBuilder(bArrK.length * 2);
        for (byte b2 : bArrK) {
            char[] cArr = X;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
