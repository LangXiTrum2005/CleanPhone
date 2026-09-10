package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class CB extends AbstractC2507kK {
    public static int A00(@CheckForNull Object... objects) {
        return Arrays.hashCode(objects);
    }

    public static boolean A01(@CheckForNull Object a2, @CheckForNull Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }
}
