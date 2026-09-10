package l3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import go.k;
import java.util.ArrayDeque;
import k3.j;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements k3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f45012a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f45013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f45014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f45015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45018g;

    public h() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f45012a.add(new g(1));
        }
        this.f45013b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f45013b;
            j jVar = new j(this, 1);
            k3.c cVar = new k3.c();
            cVar.f44278h = jVar;
            arrayDeque.add(cVar);
        }
        this.f45014c = new ArrayDeque();
        this.f45018g = C.TIME_UNSET;
    }

    @Override // o1.b
    public final void a(long j10) {
        this.f45018g = j10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // o1.b
    public final void b(k3.i iVar) {
        k.i(iVar == this.f45015d);
        g gVar = (g) iVar;
        if (gVar.c(4)) {
            long j10 = this.f45017f;
            this.f45017f = 1 + j10;
            gVar.f45011k = j10;
            this.f45014c.add(gVar);
        } else {
            long j11 = gVar.f47037g;
            if (j11 != Long.MIN_VALUE) {
                long j12 = this.f45018g;
                if (j12 == C.TIME_UNSET || j11 >= j12) {
                    long j13 = this.f45017f;
                    this.f45017f = 1 + j13;
                    gVar.f45011k = j13;
                    this.f45014c.add(gVar);
                } else {
                    gVar.g();
                    this.f45012a.add(gVar);
                }
            } else {
                long j14 = this.f45017f;
                this.f45017f = 1 + j14;
                gVar.f45011k = j14;
                this.f45014c.add(gVar);
            }
        }
        this.f45015d = null;
    }

    public abstract i c();

    public abstract void d(g gVar);

    @Override // o1.b
    public final Object dequeueInputBuffer() {
        k.t(this.f45015d == null);
        ArrayDeque arrayDeque = this.f45012a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f45015d = gVar;
        return gVar;
    }

    @Override // o1.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k3.c dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f45013b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f45014c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            String str = y.f44830a;
            if (gVar.f47037g > this.f45016e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean zC = gVar2.c(4);
            ArrayDeque arrayDeque3 = this.f45012a;
            if (zC) {
                k3.c cVar = (k3.c) arrayDeque.pollFirst();
                cVar.a(4);
                gVar2.g();
                arrayDeque3.add(gVar2);
                return cVar;
            }
            d(gVar2);
            if (f()) {
                i iVarC = c();
                k3.c cVar2 = (k3.c) arrayDeque.pollFirst();
                long j10 = gVar2.f47037g;
                cVar2.f47040c = j10;
                cVar2.f44275e = iVarC;
                cVar2.f44276f = j10;
                gVar2.g();
                arrayDeque3.add(gVar2);
                return cVar2;
            }
            gVar2.g();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean f();

    @Override // o1.b
    public void flush() {
        ArrayDeque arrayDeque;
        this.f45017f = 0L;
        this.f45016e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f45014c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f45012a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            String str = y.f44830a;
            gVar.g();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f45015d;
        if (gVar2 != null) {
            gVar2.g();
            arrayDeque.add(gVar2);
            this.f45015d = null;
        }
    }

    @Override // k3.e
    public final void setPositionUs(long j10) {
        this.f45016e = j10;
    }

    @Override // o1.b
    public void release() {
    }
}
