package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C1772Vm c1772Vm) {
        if (c1772Vm.A03().isPublicError()) {
            return new AdError(c1772Vm.A03().getErrorCode(), c1772Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
