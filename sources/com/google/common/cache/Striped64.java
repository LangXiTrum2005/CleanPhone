package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class Striped64 extends Number {
    public static final ThreadLocal e0 = new ThreadLocal();
    public static final Random f0 = new Random();
    public static final int g0 = Runtime.getRuntime().availableProcessors();
    public static final Unsafe h0;
    public static final long i0;
    public static final long j0;
    public volatile transient Cell[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile transient long f19772Y;
    public volatile transient int Z;

    /* JADX INFO: renamed from: com.google.common.cache.Striped64$1, reason: invalid class name */
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

    public static final class Cell {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Unsafe f19773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f19774c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f19775a;

        static {
            try {
                Unsafe unsafeH = Striped64.h();
                f19773b = unsafeH;
                f19774c = unsafeH.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        public Cell(long j) {
            this.f19775a = j;
        }

        public final boolean a(long j, long j2) {
            return f19773b.compareAndSwapLong(this, f19774c, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafeH = h();
            h0 = unsafeH;
            i0 = unsafeH.objectFieldOffset(Striped64.class.getDeclaredField("Y"));
            j0 = unsafeH.objectFieldOffset(Striped64.class.getDeclaredField("Z"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    public static Unsafe h() {
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

    public final boolean b(long j, long j2) {
        return h0.compareAndSwapLong(this, i0, j, j2);
    }

    public final boolean g() {
        return h0.compareAndSwapInt(this, j0, 0, 1);
    }
}
