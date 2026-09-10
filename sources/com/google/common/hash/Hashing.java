package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Hashing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20001a = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Immutable
    public static abstract class ChecksumType implements ImmutableSupplier<Checksum> {
        public static final /* synthetic */ ChecksumType[] X = {new AnonymousClass1("CRC_32", 0), new AnonymousClass2("ADLER_32", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ChecksumType EF6;

        /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$1, reason: invalid class name */
        public final enum AnonymousClass1 extends ChecksumType {
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new CRC32();
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$2, reason: invalid class name */
        public final enum AnonymousClass2 extends ChecksumType {
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Adler32();
            }
        }

        public static ChecksumType valueOf(String str) {
            return (ChecksumType) Enum.valueOf(ChecksumType.class, str);
        }

        public static ChecksumType[] values() {
            return (ChecksumType[]) X.clone();
        }
    }

    public static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        public final boolean equals(Object obj) {
            if (!(obj instanceof ConcatenatedHashFunction)) {
                return false;
            }
            ((ConcatenatedHashFunction) obj).getClass();
            return Arrays.equals((Object[]) null, (Object[]) null);
        }

        public final int hashCode() {
            return Arrays.hashCode((Object[]) null);
        }
    }

    public static final class LinearCongruentialGenerator {
    }

    public static class Md5Holder {
        static {
            new MessageDigestHashFunction("MD5", "Hashing.md5()");
        }
    }

    public static class Sha1Holder {
        static {
            new MessageDigestHashFunction(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, "Hashing.sha1()");
        }
    }

    public static class Sha256Holder {
        static {
            new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
        }
    }

    public static class Sha384Holder {
        static {
            new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");
        }
    }

    public static class Sha512Holder {
        static {
            new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");
        }
    }

    static {
        System.currentTimeMillis();
    }
}
