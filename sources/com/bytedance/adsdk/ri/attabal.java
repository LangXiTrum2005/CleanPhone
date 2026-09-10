package com.bytedance.adsdk.ri;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class attabal {
    public static /* synthetic */ BigDecimal attabal(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
