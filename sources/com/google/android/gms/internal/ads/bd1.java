package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends vc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f12735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f12737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f12738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f12739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f12740f;

    static {
        Unsafe unsafeP;
        try {
            try {
                unsafeP = Unsafe.getUnsafe();
            } catch (Exception e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10);
            }
        } catch (SecurityException unused) {
            try {
                unsafeP = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, ed1.f13936a);
            } catch (Exception unused2) {
                unsafeP = p();
                Unsafe unsafe = unsafeP;
            }
        }
        try {
            f12737c = unsafeP.objectFieldOffset(dd1.class.getDeclaredField("c"));
            f12736b = unsafeP.objectFieldOffset(dd1.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            f12738d = unsafeP.objectFieldOffset(dd1.class.getDeclaredField("a"));
            f12739e = unsafeP.objectFieldOffset(cd1.class.getDeclaredField("a"));
            f12740f = unsafeP.objectFieldOffset(cd1.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            f12735a = unsafeP;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static /* synthetic */ Unsafe p() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final void d(cd1 cd1Var, Thread thread) {
        f12735a.putObject(cd1Var, f12739e, thread);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final void g(cd1 cd1Var, cd1 cd1Var2) {
        f12735a.putObject(cd1Var, f12740f, cd1Var2);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean i(dd1 dd1Var, cd1 cd1Var, cd1 cd1Var2) {
        return ad1.a(f12735a, dd1Var, f12737c, cd1Var, cd1Var2);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean k(uc1 uc1Var, rc1 rc1Var, rc1 rc1Var2) {
        return yc1.a(f12735a, uc1Var, f12736b, rc1Var, rc1Var2);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final cd1 l(uc1 uc1Var) {
        cd1 cd1Var;
        cd1 cd1Var2 = cd1.f13138c;
        do {
            cd1Var = uc1Var.f13505c;
            if (cd1Var2 == cd1Var) {
                break;
            }
        } while (!i(uc1Var, cd1Var, cd1Var2));
        return cd1Var;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final rc1 n(uc1 uc1Var) {
        rc1 rc1Var;
        rc1 rc1Var2 = rc1.f19557d;
        do {
            rc1Var = uc1Var.f13504b;
            if (rc1Var2 == rc1Var) {
                break;
            }
        } while (!k(uc1Var, rc1Var, rc1Var2));
        return rc1Var;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean o(dd1 dd1Var, Object obj, Object obj2) {
        return zc1.a(f12735a, dd1Var, f12738d, obj, obj2);
    }
}
