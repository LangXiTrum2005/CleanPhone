package com.startapp.sdk.adsbase.adrules;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ProbabilityRule extends AdRule implements Serializable {
    private static final long serialVersionUID = 3331748489661622124L;
    private double probability;

    public ProbabilityRule() {
        super(false);
    }

    @Override // com.startapp.sdk.adsbase.adrules.AdRule
    public final boolean a(List list) {
        return Math.random() < this.probability;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Double.compare(((ProbabilityRule) obj).probability, this.probability) == 0;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.probability)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
