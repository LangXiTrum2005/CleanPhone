package com.google.common.primitives;

import com.inmobi.commons.core.configs.AdConfig;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedBytes {

    public static class LexicographicalComparatorHolder {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class PureJavaComparator implements Comparator<byte[]> {
            public static final /* synthetic */ PureJavaComparator[] X = {new PureJavaComparator("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            PureJavaComparator EF5;

            public static PureJavaComparator valueOf(String str) {
                return (PureJavaComparator) Enum.valueOf(PureJavaComparator.class, str);
            }

            public static PureJavaComparator[] values() {
                return (PureJavaComparator[]) X.clone();
            }

            @Override // java.util.Comparator
            public final int compare(byte[] bArr, byte[] bArr2) {
                byte[] bArr3 = bArr;
                byte[] bArr4 = bArr2;
                int iMin = Math.min(bArr3.length, bArr4.length);
                for (int i2 = 0; i2 < iMin; i2++) {
                    int i3 = (bArr3[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - (bArr4[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i3 != 0) {
                        return i3;
                    }
                }
                return bArr3.length - bArr4.length;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class UnsafeComparator implements Comparator<byte[]> {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final Unsafe f20065Y;
            public static final int Z;

            /* JADX INFO: Fake field, exist only in values array */
            UnsafeComparator EF5;
            public static final /* synthetic */ UnsafeComparator[] e0 = {new UnsafeComparator("INSTANCE", 0)};
            public static final boolean X = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* JADX INFO: renamed from: com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1, reason: invalid class name */
            class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
                public static Unsafe a() throws IllegalAccessException {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }

                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Unsafe run() {
                    return a();
                }
            }

            static {
                Unsafe unsafeD = d();
                f20065Y = unsafeD;
                int iArrayBaseOffset = unsafeD.arrayBaseOffset(byte[].class);
                Z = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafeD.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            public static int a(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i2 = iMin & (-8);
                int i3 = 0;
                while (i3 < i2) {
                    Unsafe unsafe = f20065Y;
                    long j = ((long) Z) + ((long) i3);
                    long j2 = unsafe.getLong(bArr, j);
                    long j3 = unsafe.getLong(bArr2, j);
                    if (j2 != j3) {
                        if (X) {
                            return UnsignedLongs.a(j2, j3);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j3 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i3 += 8;
                }
                while (i3 < iMin) {
                    int i4 = (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - (bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i4 != 0) {
                        return i4;
                    }
                    i3++;
                }
                return bArr.length - bArr2.length;
            }

            public static Unsafe d() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
                    }
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            }

            public static UnsafeComparator valueOf(String str) {
                return (UnsafeComparator) Enum.valueOf(UnsafeComparator.class, str);
            }

            public static UnsafeComparator[] values() {
                return (UnsafeComparator[]) e0.clone();
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
                return a(bArr, bArr2);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        static {
            try {
                Object[] enumConstants = Class.forName(LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator")).getEnumConstants();
                Objects.requireNonNull(enumConstants);
            } catch (Throwable unused) {
            }
        }
    }
}
