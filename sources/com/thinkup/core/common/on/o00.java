package com.thinkup.core.common.on;

/* JADX INFO: loaded from: classes6.dex */
public final class o00 extends nn0 {
    public static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42223n = "return_flag";
    public static final int o = 1;
    public static final String o0 = "sdk_native_im_w";
    public static final String oo = "sdk_native_im_h";
    private String oo0m;
    private String oo0n;
    private int ooo0 = 1;
    private int oooo;

    private String n0m() {
        return this.oo0m;
    }

    private int n0n() {
        return this.ooo0;
    }

    private String n0o() {
        return this.oo0n;
    }

    private int no0() {
        return this.oooo;
    }

    public final void m(String str) {
        this.oo0m = str;
    }

    public final void o(String str) {
        this.oo0n = str;
    }

    public final void m(int i2) {
        this.oooo = i2;
    }

    public final void o(int i2) {
        this.ooo0 = i2;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final int o() {
        return this.ooo0 == 1 ? 2 : 4;
    }
}
