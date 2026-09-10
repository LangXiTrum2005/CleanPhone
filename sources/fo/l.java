package fo;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends ao.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41246e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f41247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f41248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f41249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i10, List list) {
        super(str, true);
        this.f41247f = nVar;
        this.f41248g = i10;
        this.f41249h = list;
    }

    @Override // ao.a
    public final long a() {
        switch (this.f41246e) {
            case 0:
                this.f41247f.f41264k.getClass();
                try {
                    this.f41247f.f41275w.k(this.f41248g, 9);
                    synchronized (this.f41247f) {
                        this.f41247f.f41277y.remove(Integer.valueOf(this.f41248g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f41247f.f41264k.getClass();
                try {
                    this.f41247f.f41275w.k(this.f41248g, 9);
                    synchronized (this.f41247f) {
                        this.f41247f.f41277y.remove(Integer.valueOf(this.f41248g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f41247f = nVar;
        this.f41248g = i10;
        this.f41249h = list;
    }
}
