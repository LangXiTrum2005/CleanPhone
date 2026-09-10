package com.google.android.gms.internal.ads;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum ny0 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADED(X3.i.f27812r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWABLE("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIBLE("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("other");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18026a;

    ny0(String str) {
        this.f18026a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18026a;
    }
}
