package com.iab.omid.library.startio.adsession;

import com.p004ironsource.d9;
import com.p004ironsource.x4;

/* JADX INFO: loaded from: classes3.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(d9.h.r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(x4.d);

    private final String impressionType;

    ImpressionType(String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.impressionType;
    }
}
