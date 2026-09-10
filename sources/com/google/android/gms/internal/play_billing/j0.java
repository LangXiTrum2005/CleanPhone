package com.google.android.gms.internal.play_billing;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Unsafe f24298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f24299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f24300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f24301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f24302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f24303h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new o0());
            }
            try {
                f24300e = unsafe.objectFieldOffset(l0.class.getDeclaredField("c"));
                f24299d = unsafe.objectFieldOffset(l0.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                f24301f = unsafe.objectFieldOffset(l0.class.getDeclaredField("a"));
                f24302g = unsafe.objectFieldOffset(k0.class.getDeclaredField("a"));
                f24303h = unsafe.objectFieldOffset(k0.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                f24298c = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    @Override // a.a
    public final f0 I(u0 u0Var) {
        f0 f0Var;
        f0 f0Var2 = f0.f24264d;
        do {
            f0Var = u0Var.f24402b;
            if (f0Var2 == f0Var) {
                break;
            }
        } while (!M(u0Var, f0Var, f0Var2));
        return f0Var;
    }

    @Override // a.a
    public final k0 J(u0 u0Var) {
        k0 k0Var;
        k0 k0Var2 = k0.f24392c;
        do {
            k0Var = u0Var.f24403c;
            if (k0Var2 == k0Var) {
                break;
            }
        } while (!O(u0Var, k0Var, k0Var2));
        return k0Var;
    }

    @Override // a.a
    public final void K(k0 k0Var, k0 k0Var2) {
        f24298c.putObject(k0Var, f24303h, k0Var2);
    }

    @Override // a.a
    public final void L(k0 k0Var, Thread thread) {
        f24298c.putObject(k0Var, f24302g, thread);
    }

    @Override // a.a
    public final boolean M(u0 u0Var, f0 f0Var, f0 f0Var2) {
        return n0.a(f24298c, u0Var, f24299d, f0Var, f0Var2);
    }

    @Override // a.a
    public final boolean N(l0 l0Var, Object obj, Object obj2) {
        return n0.a(f24298c, l0Var, f24301f, obj, obj2);
    }

    @Override // a.a
    public final boolean O(l0 l0Var, k0 k0Var, k0 k0Var2) {
        return n0.a(f24298c, l0Var, f24300e, k0Var, k0Var2);
    }
}
