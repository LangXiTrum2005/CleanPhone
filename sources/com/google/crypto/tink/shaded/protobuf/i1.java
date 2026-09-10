package com.google.crypto.tink.shaded.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f24573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f24574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f24575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f24576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f24577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f24578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f24579g;

    static {
        Unsafe unsafeJ = j();
        f24573a = unsafeJ;
        f24574b = c.f24541a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        h1 g1Var = null;
        if (unsafeJ != null) {
            if (!c.a()) {
                g1Var = new g1(unsafeJ);
            } else if (zF) {
                g1Var = new f1(unsafeJ, 1);
            } else if (zF2) {
                g1Var = new f1(unsafeJ, 0);
            }
        }
        f24575c = g1Var;
        f24576d = g1Var == null ? false : g1Var.s();
        f24577e = g1Var == null ? false : g1Var.r();
        f24578f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && g1Var != null) {
            g1Var.j(fieldE);
        }
        f24579g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(i1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f24573a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f24577e) {
            return f24575c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f24577e) {
            f24575c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
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

    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f24574b;
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

    public static byte g(long j10, byte[] bArr) {
        return f24575c.d(f24578f + j10, bArr);
    }

    public static byte h(long j10, Object obj) {
        return (byte) ((f24575c.g((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(long j10, Object obj) {
        return (byte) ((f24575c.g((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j10, byte b10) {
        f24575c.l(bArr, f24578f + j10, b10);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iG = f24575c.g(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        n(((255 & b10) << i10) | (iG & (~(255 << i10))), j11, obj);
    }

    public static void m(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        n(((255 & b10) << i10) | (f24575c.g(j11, obj) & (~(255 << i10))), j11, obj);
    }

    public static void n(int i10, long j10, Object obj) {
        f24575c.o(i10, j10, obj);
    }

    public static void o(Object obj, long j10, long j11) {
        f24575c.p(obj, j10, j11);
    }

    public static void p(Object obj, long j10, Object obj2) {
        f24575c.q(obj, j10, obj2);
    }
}
