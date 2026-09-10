package hn;

import cn.w1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends c implements w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42454d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42455c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j10, s sVar, int i10) {
        super(sVar);
        this.f42455c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // hn.c
    public final boolean d() {
        return f42454d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f42454d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i10, ak.k kVar);

    public final void i() {
        if (f42454d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f42454d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE + i10));
        return true;
    }
}
