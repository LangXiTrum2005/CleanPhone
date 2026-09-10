package j1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f43604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f43605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f43606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f43607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f43608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f43609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43610h;

    public l() {
        ByteBuffer byteBuffer = k.f43603a;
        this.f43608f = byteBuffer;
        this.f43609g = byteBuffer;
        h hVar = h.f43596e;
        this.f43606d = hVar;
        this.f43607e = hVar;
        this.f43604b = hVar;
        this.f43605c = hVar;
    }

    @Override // j1.k
    public final h a(h hVar) {
        this.f43606d = hVar;
        this.f43607e = c(hVar);
        return isActive() ? this.f43607e : h.f43596e;
    }

    public abstract h c(h hVar);

    @Override // j1.k
    public final void flush() {
        this.f43609g = k.f43603a;
        this.f43610h = false;
        this.f43604b = this.f43606d;
        this.f43605c = this.f43607e;
        d();
    }

    public final ByteBuffer g(int i10) {
        if (this.f43608f.capacity() < i10) {
            this.f43608f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f43608f.clear();
        }
        ByteBuffer byteBuffer = this.f43608f;
        this.f43609g = byteBuffer;
        return byteBuffer;
    }

    @Override // j1.k
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f43609g;
        this.f43609g = k.f43603a;
        return byteBuffer;
    }

    @Override // j1.k
    public boolean isActive() {
        return this.f43607e != h.f43596e;
    }

    @Override // j1.k
    public boolean isEnded() {
        return this.f43610h && this.f43609g == k.f43603a;
    }

    @Override // j1.k
    public final void queueEndOfStream() {
        this.f43610h = true;
        e();
    }

    @Override // j1.k
    public final void reset() {
        ByteBuffer byteBuffer = k.f43603a;
        this.f43609g = byteBuffer;
        this.f43610h = false;
        this.f43608f = byteBuffer;
        h hVar = h.f43596e;
        this.f43606d = hVar;
        this.f43607e = hVar;
        this.f43604b = hVar;
        this.f43605c = hVar;
        f();
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }
}
