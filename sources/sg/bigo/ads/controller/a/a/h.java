package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47796c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47797e;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f47794a);
            parcel.writeLong(this.f47795b);
            parcel.writeLong(this.f47796c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.f47797e);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        synchronized (this) {
            this.f47794a = n.a(parcel, 0L);
            this.f47795b = n.a(parcel, 0L);
            this.f47796c = n.a(parcel, 0L);
            this.d = n.a(parcel, 0L);
            this.f47797e = n.a(parcel, 0L);
        }
    }

    public final String toString() {
        return super.toString();
    }
}
