package com.mbridge.msdk.mbbid.common;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34578c;

    public c(String str, String str2) {
        this.f34576a = str;
        this.f34577b = str2;
    }

    public String getmFloorPrice() {
        return this.f34578c;
    }

    public String getmPlacementId() {
        return this.f34576a;
    }

    public String getmUnitId() {
        return this.f34577b;
    }

    public void setmFloorPrice(String str) {
        this.f34578c = str;
    }

    public void setmPlacementId(String str) {
        this.f34576a = str;
    }

    public void setmUnitId(String str) {
        this.f34577b = str;
    }

    public c(String str, String str2, String str3) {
        this.f34576a = str;
        this.f34577b = str2;
        this.f34578c = str3;
    }
}
