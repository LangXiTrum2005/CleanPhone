package eg;

import android.media.MediaFormat;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements jg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg.b f40039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg.a f40040b;

    public b(jg.b bVar, dg.a aVar) {
        this.f40039a = bVar;
        this.f40040b = aVar;
    }

    @Override // jg.b
    public final boolean a(vf.c type) {
        n.f(type, "type");
        return this.f40039a.a(type);
    }

    @Override // jg.b
    public final void b(vf.c cVar) {
        this.f40039a.b(cVar);
    }

    @Override // jg.b
    public final void c(vf.c cVar) {
        this.f40039a.c(cVar);
    }

    @Override // jg.b
    public final MediaFormat d(vf.c cVar) {
        return this.f40039a.d(cVar);
    }

    @Override // jg.b
    public final void e(f2.e chunk) {
        n.f(chunk, "chunk");
        this.f40039a.e(chunk);
    }

    @Override // jg.b
    public final boolean f() {
        return ((Boolean) this.f40040b.invoke()).booleanValue() || this.f40039a.f();
    }

    @Override // jg.b
    public final void g() {
        this.f40039a.g();
    }

    @Override // jg.b
    public final long getDurationUs() {
        return this.f40039a.getDurationUs();
    }

    @Override // jg.b
    public final double[] getLocation() {
        return this.f40039a.getLocation();
    }

    @Override // jg.b
    public final int getOrientation() {
        return this.f40039a.getOrientation();
    }

    @Override // jg.b
    public final long getPositionUs() {
        return this.f40039a.getPositionUs();
    }

    @Override // jg.b
    public final void initialize() {
        this.f40039a.initialize();
    }

    @Override // jg.b
    public final boolean isInitialized() {
        return this.f40039a.isInitialized();
    }
}
