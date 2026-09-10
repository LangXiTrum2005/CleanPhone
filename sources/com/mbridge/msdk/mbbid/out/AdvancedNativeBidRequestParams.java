package com.mbridge.msdk.mbbid.out;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34594e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f34593d = i11;
        this.f34594e = i10;
    }

    public int getHeight() {
        return this.f34593d;
    }

    public int getWidth() {
        return this.f34594e;
    }

    public void setHeight(int i10) {
        this.f34593d = i10;
    }

    public void setWidth(int i10) {
        this.f34594e = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f34593d = i11;
        this.f34594e = i10;
    }
}
