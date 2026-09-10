package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i30 implements y30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kj f15556b;

    public /* synthetic */ i30(kj kjVar, int i10) {
        this.f15555a = i10;
        this.f15556b = kjVar;
    }

    @Override // com.google.android.gms.internal.ads.y30
    public final void zza(boolean z10, int i10, String str, String str2) {
        switch (this.f15555a) {
            case 0:
                this.f15556b.a();
                break;
            default:
                kj kjVar = this.f15556b;
                if (!z10) {
                    int length = String.valueOf(i10).length();
                    StringBuilder sb2 = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Image Web View failed to load. Error code: ");
                    sb2.append(i10);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    kjVar.zzd(new eo0(1, defpackage.e.q(", Failing URL: ", str2, sb2)));
                } else {
                    kjVar.a();
                }
                break;
        }
    }
}
