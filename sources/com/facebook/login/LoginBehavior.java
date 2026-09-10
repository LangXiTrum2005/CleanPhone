package com.facebook.login;

/* JADX INFO: loaded from: classes3.dex */
public enum LoginBehavior {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ONLY(true, true, false, false, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    KATANA_ONLY(false, true, false, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_ONLY(false, false, true, false, true, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_VIEW_ONLY(false, false, true, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);

    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f16474Y;
    public final boolean Z;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;

    LoginBehavior(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.X = z2;
        this.f16474Y = z3;
        this.Z = z4;
        this.e0 = z5;
        this.f0 = z6;
        this.g0 = z7;
        this.h0 = z8;
    }
}
