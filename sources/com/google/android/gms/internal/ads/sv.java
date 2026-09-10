package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sv extends hp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uv f20054a;

    @Override // com.google.android.gms.internal.ads.ip
    public final void K0(ap apVar, String str) {
        vv vvVar;
        uv uvVar = this.f20054a;
        if (uvVar.f20911b == null) {
            return;
        }
        synchronized (uvVar) {
            vvVar = uvVar.f20912c;
            if (vvVar == null) {
                vvVar = new vv(apVar);
                uvVar.f20912c = vvVar;
            }
        }
        uvVar.f20911b.onCustomClick(vvVar, str);
    }
}
