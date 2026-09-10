package com.google.android.gms.internal.ads;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f17980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f17981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mu1 f17982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f17983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f17984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f17985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f17986g;

    static {
        boolean z10;
        mu1 mu1Var;
        Unsafe unsafeO = o();
        f17980a = unsafeO;
        int i10 = tr1.f20473a;
        f17981b = Memory.class;
        Class cls = Long.TYPE;
        boolean zP = p(cls);
        Class cls2 = Integer.TYPE;
        boolean zP2 = p(cls2);
        mu1 ku1Var = null;
        if (unsafeO != null) {
            if (zP) {
                ku1Var = new lu1(unsafeO);
            } else if (zP2) {
                ku1Var = new ku1(unsafeO);
            }
        }
        f17982c = ku1Var;
        if (ku1Var != null) {
            try {
                Class<?> cls3 = ((Unsafe) ku1Var.f17550a).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                c();
            } catch (Throwable th2) {
                Logger.getLogger(nu1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        mu1 mu1Var2 = f17982c;
        if (mu1Var2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = ((Unsafe) mu1Var2.f17550a).getClass();
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
                Logger.getLogger(nu1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z10 = false;
            }
        }
        f17983d = z10;
        f17984e = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        long jObjectFieldOffset = -1;
        if (fieldC != null && (mu1Var = f17982c) != null) {
            jObjectFieldOffset = ((Unsafe) mu1Var.f17550a).objectFieldOffset(fieldC);
        }
        f17985f = jObjectFieldOffset;
        f17986g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (f17983d) {
            return ((Unsafe) f17982c.f17550a).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f17983d) {
            ((Unsafe) f17982c.f17550a).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i10 = tr1.f20473a;
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

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = (Unsafe) f17982c.f17550a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = (Unsafe) f17982c.f17550a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static Object f(Class cls) {
        try {
            return f17980a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int g(long j10, Object obj) {
        return ((Unsafe) f17982c.f17550a).getInt(obj, j10);
    }

    public static void h(int i10, long j10, Object obj) {
        ((Unsafe) f17982c.f17550a).putInt(obj, j10, i10);
    }

    public static long i(long j10, Object obj) {
        return ((Unsafe) f17982c.f17550a).getLong(obj, j10);
    }

    public static void j(Object obj, long j10, long j11) {
        ((Unsafe) f17982c.f17550a).putLong(obj, j10, j11);
    }

    public static Object k(long j10, Object obj) {
        return ((Unsafe) f17982c.f17550a).getObject(obj, j10);
    }

    public static void l(Object obj, long j10, Object obj2) {
        ((Unsafe) f17982c.f17550a).putObject(obj, j10, obj2);
    }

    public static void m(byte[] bArr, long j10, byte b10) {
        f17982c.z0(bArr, f17984e + j10, b10);
    }

    public static long n(ByteBuffer byteBuffer) {
        return ((Unsafe) f17982c.f17550a).getLong(byteBuffer, f17985f);
    }

    public static Unsafe o() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new ju1());
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
            Logger.getLogger(nu1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean p(Class cls) {
        int i10 = tr1.f20473a;
        try {
            Class cls2 = f17981b;
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

    public static /* synthetic */ boolean q(long j10, Object obj) {
        return ((byte) ((((Unsafe) f17982c.f17550a).getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean r(long j10, Object obj) {
        return ((byte) ((((Unsafe) f17982c.f17550a).getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
