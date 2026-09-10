package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wg extends y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24126b;

    public /* synthetic */ wg(int i10) {
        this.f24126b = i10;
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final /* synthetic */ Object a() {
        switch (this.f24126b) {
            case 0:
                return new xg();
            case 1:
                return new zg();
            case 2:
                return new ph();
            default:
                return new rh();
        }
    }
}
