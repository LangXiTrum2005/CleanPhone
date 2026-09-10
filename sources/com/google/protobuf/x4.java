package com.google.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f25019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f25020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w4 f25021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f25022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f25023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f25024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f25025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f25026h;

    static {
        Unsafe unsafeL = l();
        f25019a = unsafeL;
        f25020b = c.f24780a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        w4 v4Var = null;
        if (unsafeL != null) {
            if (!c.a()) {
                v4Var = new v4(unsafeL);
            } else if (zH) {
                v4Var = new u4(unsafeL, 1);
            } else if (zH2) {
                v4Var = new u4(unsafeL, 0);
            }
        }
        f25021c = v4Var;
        f25022d = v4Var == null ? false : v4Var.x();
        f25023e = v4Var == null ? false : v4Var.w();
        f25024f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        java.lang.reflect.Field fieldF = f();
        f25025g = (fieldF == null || v4Var == null) ? -1L : v4Var.n(fieldF);
        f25026h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(x4.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f25021c.l(f25025g, byteBuffer);
    }

    public static Object c(Class cls) {
        try {
            return f25019a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int d(Class cls) {
        if (f25023e) {
            return f25021c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f25023e) {
            f25021c.b(cls);
        }
    }

    public static java.lang.reflect.Field f() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static void g(long j10, byte[] bArr, long j11, long j12) {
        f25021c.c(j10, bArr, j11, j12);
    }

    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f25020b;
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

    public static byte i(long j10, byte[] bArr) {
        return f25021c.g(f25024f + j10, bArr);
    }

    public static byte j(long j10, Object obj) {
        return (byte) ((f25021c.j((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte k(long j10, Object obj) {
        return (byte) ((f25021c.j((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new t4());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(byte b10, long j10) {
        f25021c.p(b10, j10);
    }

    public static void n(byte[] bArr, long j10, byte b10) {
        f25021c.q(bArr, f25024f + j10, b10);
    }

    public static void o(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iJ = f25021c.j(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        q(((255 & b10) << i10) | (iJ & (~(255 << i10))), j11, obj);
    }

    public static void p(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        q(((255 & b10) << i10) | (f25021c.j(j11, obj) & (~(255 << i10))), j11, obj);
    }

    public static void q(int i10, long j10, Object obj) {
        f25021c.t(i10, j10, obj);
    }

    public static void r(Object obj, long j10, long j11) {
        f25021c.u(obj, j10, j11);
    }

    public static void s(Object obj, long j10, Object obj2) {
        f25021c.v(obj, j10, obj2);
    }
}
