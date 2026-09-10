package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import com.p004ironsource.x4;

/* JADX INFO: loaded from: classes4.dex */
public enum zzfrp {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(d9.h.r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(x4.d);

    private final String zzi;

    zzfrp(String str) {
        this.zzi = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzi;
    }
}
