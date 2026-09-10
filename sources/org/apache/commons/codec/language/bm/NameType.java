package org.apache.commons.codec.language.bm;

import com.p004ironsource.mediationsdk.IronSourceSegment;

/* JADX INFO: loaded from: classes7.dex */
public enum NameType {
    ASHKENAZI("ash"),
    GENERIC(IronSourceSegment.GENDER),
    SEPHARDIC("sep");

    public final String X;

    NameType(String str) {
        this.X = str;
    }
}
