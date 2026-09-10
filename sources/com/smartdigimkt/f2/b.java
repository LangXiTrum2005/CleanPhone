package com.smartdigimkt.f2;

/* JADX INFO: loaded from: classes5.dex */
public enum b implements a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35011b;

    b(int i2, String str) {
        this.f35010a = i2;
        this.f35011b = str;
    }

    public int c() {
        return this.f35010a;
    }

    public String d() {
        return this.f35011b;
    }
}
