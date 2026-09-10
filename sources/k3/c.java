package k3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o1.e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f44275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f44277g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f44278h;

    public /* synthetic */ c() {
        super(3);
    }

    @Override // o1.e
    public final void g() {
        this.f22444b = 0;
        this.f47040c = 0L;
        this.f47041d = false;
        this.f44275e = null;
    }

    @Override // k3.d
    public final List getCues(long j10) {
        d dVar = this.f44275e;
        dVar.getClass();
        return dVar.getCues(j10 - this.f44276f);
    }

    @Override // k3.d
    public final long getEventTime(int i10) {
        d dVar = this.f44275e;
        dVar.getClass();
        return dVar.getEventTime(i10) + this.f44276f;
    }

    @Override // k3.d
    public final int getEventTimeCount() {
        d dVar = this.f44275e;
        dVar.getClass();
        return dVar.getEventTimeCount();
    }

    @Override // k3.d
    public final int getNextEventTimeIndex(long j10) {
        d dVar = this.f44275e;
        dVar.getClass();
        return dVar.getNextEventTimeIndex(j10 - this.f44276f);
    }

    @Override // o1.e
    public final void h() {
        switch (this.f44277g) {
            case 0:
                ((h2.b) this.f44278h).j(this);
                break;
            default:
                l3.h hVar = (l3.h) ((j) this.f44278h).f44293b;
                hVar.getClass();
                g();
                hVar.f45013b.add(this);
                break;
        }
    }

    public c(h2.b bVar) {
        super(3);
        this.f44278h = bVar;
    }
}
