package com.mbridge.msdk.video.dynview.error;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37357b;

    a(int i10, String str) {
        this.f37356a = i10;
        this.f37357b = str;
    }

    public int g() {
        return this.f37356a;
    }

    public String h() {
        return this.f37357b;
    }
}
