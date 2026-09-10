package com.startapp.sdk.adsbase.consent;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;
    private Integer falseClick;
    private Integer impression;
    private Integer trueClick;

    public final Integer a() {
        return this.falseClick;
    }

    public final Integer b() {
        return this.impression;
    }

    public final Integer c() {
        return this.trueClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ConsentTypeInfoConfig.class == obj.getClass()) {
            ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
            if (vi.a((Object) this.impression, (Object) consentTypeInfoConfig.impression) && vi.a((Object) this.trueClick, (Object) consentTypeInfoConfig.trueClick) && vi.a((Object) this.falseClick, (Object) consentTypeInfoConfig.falseClick)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
