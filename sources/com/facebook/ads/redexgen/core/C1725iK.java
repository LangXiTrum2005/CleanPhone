package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C1725iK {
    public final int A00;
    public final AbstractC0943Os A01;
    public final InterfaceC1724iJ A02;
    public final boolean A03;

    public C1725iK(InterfaceC1724iJ strategy) {
        this(strategy, false, AbstractC0943Os.A03(), Integer.MAX_VALUE);
    }

    public C1725iK(InterfaceC1724iJ strategy, boolean omitEmptyStrings, AbstractC0943Os trimmer, int limit) {
        this.A02 = strategy;
        this.A03 = omitEmptyStrings;
        this.A01 = trimmer;
        this.A00 = limit;
    }

    public static C1725iK A02(char separator) {
        return A03(AbstractC0943Os.A02(separator));
    }

    public static C1725iK A03(final AbstractC0943Os separatorMatcher) {
        AbstractC1718iD.A04(separatorMatcher);
        return new C1725iK(new C0940Op(separatorMatcher));
    }

    private Iterator<String> A04(CharSequence sequence) {
        return this.A02.AAa(this, sequence);
    }

    public final List<String> A06(CharSequence sequence) {
        AbstractC1718iD.A04(sequence);
        Iterator<String> itA04 = A04(sequence);
        List<String> result = new ArrayList<>();
        while (itA04.hasNext()) {
            result.add(itA04.next());
        }
        return Collections.unmodifiableList(result);
    }
}
