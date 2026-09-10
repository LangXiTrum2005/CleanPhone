package com.google.android.gms.internal.measurement;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f24192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f24193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2 f24194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f24195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f24196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f24197f;

    static {
        boolean z10;
        y2 y2Var;
        Unsafe unsafeL = l();
        f24192a = unsafeL;
        int i10 = n0.f23760a;
        f24193b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        y2 w2Var = null;
        if (unsafeL != null) {
            if (zM) {
                w2Var = new x2(unsafeL);
            } else if (zM2) {
                w2Var = new w2(unsafeL);
            }
        }
        f24194c = w2Var;
        if (w2Var != null) {
            try {
                Class<?> cls3 = ((Unsafe) w2Var.f24166a).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th2) {
                Logger.getLogger(z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        y2 y2Var2 = f24194c;
        if (y2Var2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = ((Unsafe) y2Var2.f24166a).getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z10 = true;
            } catch (Throwable th3) {
                Logger.getLogger(z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z10 = false;
            }
        }
        f24195d = z10;
        f24196e = p(byte[].class);
        p(boolean[].class);
        q(boolean[].class);
        p(int[].class);
        q(int[].class);
        p(long[].class);
        q(long[].class);
        p(float[].class);
        q(float[].class);
        p(double[].class);
        q(double[].class);
        p(Object[].class);
        q(Object[].class);
        Field fieldA = a();
        if (fieldA != null && (y2Var = f24194c) != null) {
            ((Unsafe) y2Var.f24166a).objectFieldOffset(fieldA);
        }
        f24197f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field a() {
        Field declaredField;
        Field declaredField2;
        int i10 = n0.f23760a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void b(Object obj, long j10, byte b10) {
        Unsafe unsafe = (Unsafe) f24194c.f24166a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void c(Object obj, long j10, byte b10) {
        Unsafe unsafe = (Unsafe) f24194c.f24166a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static Object d(Class cls) {
        try {
            return f24192a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int e(long j10, Object obj) {
        return ((Unsafe) f24194c.f24166a).getInt(obj, j10);
    }

    public static void f(int i10, long j10, Object obj) {
        ((Unsafe) f24194c.f24166a).putInt(obj, j10, i10);
    }

    public static long g(long j10, Object obj) {
        return ((Unsafe) f24194c.f24166a).getLong(obj, j10);
    }

    public static void h(Object obj, long j10, long j11) {
        ((Unsafe) f24194c.f24166a).putLong(obj, j10, j11);
    }

    public static Object i(long j10, Object obj) {
        return ((Unsafe) f24194c.f24166a).getObject(obj, j10);
    }

    public static void j(Object obj, long j10, Object obj2) {
        ((Unsafe) f24194c.f24166a).putObject(obj, j10, obj2);
    }

    public static void k(byte[] bArr, long j10, byte b10) {
        f24194c.b(bArr, f24196e + j10, b10);
    }

    public static Unsafe l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new v2());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i10 = n0.f23760a;
        try {
            Class cls2 = f24193b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean n(long j10, Object obj) {
        return ((byte) ((((Unsafe) f24194c.f24166a).getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(long j10, Object obj) {
        return ((byte) ((((Unsafe) f24194c.f24166a).getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f24195d) {
            return ((Unsafe) f24194c.f24166a).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void q(Class cls) {
        if (f24195d) {
            ((Unsafe) f24194c.f24166a).arrayIndexScale(cls);
        }
    }
}
