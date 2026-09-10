package com.mbridge.msdk.mbbid.out;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34596e;

    public BannerBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f34595d = i11;
        this.f34596e = i10;
    }

    public int getHeight() {
        return this.f34595d;
    }

    public int getWidth() {
        return this.f34596e;
    }

    public void setHeight(int i10) {
        this.f34595d = i10;
    }

    public void setWidth(int i10) {
        this.f34596e = i10;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f34595d = i11;
        this.f34596e = i10;
    }
}
