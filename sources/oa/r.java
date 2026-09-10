package oa;

import com.google.android.gms.internal.ads.p91;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends p91 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f47301g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, int i10) {
        super(uVar);
        this.f47300f = i10;
        this.f47301g = uVar;
    }

    @Override // com.google.android.gms.internal.ads.p91
    public final Object a(int i10) {
        switch (this.f47300f) {
            case 0:
                return this.f47301g.p()[i10];
            case 1:
                return new t(this.f47301g, i10);
            default:
                return this.f47301g.q()[i10];
        }
    }
}
