package fo;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ao.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f41239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f41240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f41241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, n nVar, int i10, int i11, int i12) {
        super(str, true);
        this.f41238e = i12;
        this.f41239f = nVar;
        this.f41240g = i10;
        this.f41241h = i11;
    }

    @Override // ao.a
    public final long a() {
        switch (this.f41238e) {
            case 0:
                n nVar = this.f41239f;
                try {
                    nVar.f41275w.j(true, this.f41240g, this.f41241h);
                    return -1L;
                } catch (IOException e10) {
                    nVar.a(2, 2, e10);
                    return -1L;
                }
            case 1:
                y yVar = this.f41239f.f41264k;
                int i10 = this.f41241h;
                yVar.getClass();
                d5.u.n(i10, IronSourceConstants.EVENTS_ERROR_CODE);
                synchronized (this.f41239f) {
                    this.f41239f.f41277y.remove(Integer.valueOf(this.f41240g));
                }
                return -1L;
            default:
                n nVar2 = this.f41239f;
                try {
                    int i11 = this.f41240g;
                    int i12 = this.f41241h;
                    d5.u.n(i12, "statusCode");
                    nVar2.f41275w.k(i11, i12);
                    return -1L;
                } catch (IOException e11) {
                    nVar2.a(2, 2, e11);
                    return -1L;
                }
        }
    }
}
