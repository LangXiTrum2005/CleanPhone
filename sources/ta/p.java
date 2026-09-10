package ta;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends qk.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f50631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f50632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f50633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f50634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f50635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f50636g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new o());
            }
            try {
                f50633d = unsafe.objectFieldOffset(r.class.getDeclaredField("c"));
                f50632c = unsafe.objectFieldOffset(r.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                f50634e = unsafe.objectFieldOffset(r.class.getDeclaredField("a"));
                f50635f = unsafe.objectFieldOffset(q.class.getDeclaredField("a"));
                f50636g = unsafe.objectFieldOffset(q.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                f50631b = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    @Override // qk.i0
    public final f F(r rVar) {
        f fVar;
        f fVar2 = f.f50609d;
        do {
            fVar = rVar.f50647b;
            if (fVar2 == fVar) {
                break;
            }
        } while (!f(rVar, fVar, fVar2));
        return fVar;
    }

    @Override // qk.i0
    public final q G(r rVar) {
        q qVar;
        q qVar2 = q.f50639c;
        do {
            qVar = rVar.f50648c;
            if (qVar2 == qVar) {
                break;
            }
        } while (!h(rVar, qVar, qVar2));
        return qVar;
    }

    @Override // qk.i0
    public final void X(q qVar, q qVar2) {
        f50631b.putObject(qVar, f50636g, qVar2);
    }

    @Override // qk.i0
    public final void Y(q qVar, Thread thread) {
        f50631b.putObject(qVar, f50635f, thread);
    }

    @Override // qk.i0
    public final boolean f(r rVar, f fVar, f fVar2) {
        return m.a(f50631b, rVar, f50632c, fVar, fVar2);
    }

    @Override // qk.i0
    public final boolean g(r rVar, Object obj, Object obj2) {
        return n.a(f50631b, rVar, f50634e, obj, obj2);
    }

    @Override // qk.i0
    public final boolean h(r rVar, q qVar, q qVar2) {
        return l.a(f50631b, rVar, f50633d, qVar, qVar2);
    }
}
