package com.google.common.hash;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {

    public enum JavaLittleEndianBytes implements LittleEndianBytes {
        X { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
        }
    }

    public interface LittleEndianBytes {
    }

    public enum UnsafeByteArray implements LittleEndianBytes {
        X { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
        },
        f20003Y { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
        };

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2] */
        static {
            Unsafe unsafeD = d();
            unsafeD.arrayBaseOffset(byte[].class);
            if (unsafeD.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        public static Unsafe d() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new a());
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        public static /* synthetic */ Unsafe g() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    UnsafeByteArray.AnonymousClass1 anonymousClass1 = UnsafeByteArray.X;
                } else {
                    UnsafeByteArray.AnonymousClass2 anonymousClass2 = UnsafeByteArray.f20003Y;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
