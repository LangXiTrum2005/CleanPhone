package ze;

import zc.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum b {
    RSA_ECB_PKCS1Padding(new h(2), 1),
    /* JADX INFO: Fake field, exist only in values array */
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new h(3), 23),
    AES_GCM_NoPadding(new h(4), 23);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f54912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54913b;

    b(h hVar, int i10) {
        this.f54912a = hVar;
        this.f54913b = i10;
    }
}
