package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import sg.bigo.ads.api.a.j;
import sg.bigo.ads.common.l;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sg.bigo.ads.common.f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47772a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47773b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47774c = 12;
    public int d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47775e = 3;
    public int f = 10;
    public int g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.api.a.h f47776h;

    public d(sg.bigo.ads.api.a.h hVar) {
        this.f47776h = hVar;
    }

    @Override // sg.bigo.ads.common.l
    public final int a() {
        return this.f47772a;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f47772a = n.a(parcel, 3);
        this.f47773b = n.a(parcel, 2);
        this.f47774c = n.a(parcel, 12);
        this.d = n.a(parcel, 3);
        this.f47775e = n.a(parcel, 3);
        this.f = n.a(parcel, 10);
        this.g = n.a(parcel, 5);
    }

    @Override // sg.bigo.ads.common.l
    public final int c() {
        return this.f47773b;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean d() {
        return a(13);
    }

    @Override // sg.bigo.ads.common.l
    public final int e() {
        return this.f47774c;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean f() {
        return a(10);
    }

    @Override // sg.bigo.ads.common.l
    public final int g() {
        return this.d;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean h() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int i() {
        return this.f47775e;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean j() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final int k() {
        return this.f;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean l() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int m() {
        return this.g;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean n() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean o() {
        return a(18);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean p() {
        return a(13);
    }

    public final String toString() {
        return super.toString();
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        synchronized (this) {
            parcel.writeInt(this.f47772a);
            parcel.writeInt(this.f47773b);
            parcel.writeInt(this.f47774c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.f47775e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    @Override // sg.bigo.ads.common.l
    public final boolean b() {
        return a(13);
    }

    private boolean a(int i2) {
        sg.bigo.ads.api.a.h hVar = this.f47776h;
        j jVarN = hVar != null ? hVar.n() : null;
        if (jVarN != null) {
            return jVarN.a(i2);
        }
        return false;
    }
}
