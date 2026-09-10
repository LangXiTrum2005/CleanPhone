package com.applovin.impl;

import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum w7 {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(300),
    TIMED_OUT(301),
    WRAPPER_LIMIT_REACHED(302),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(400),
    NO_MEDIA_FILE_PROVIDED(InterfaceC0435l1.a.b.f29082b),
    MEDIA_FILE_TIMEOUT(402),
    MEDIA_FILE_ERROR(InterfaceC0435l1.a.b.f29085e),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9973a;

    w7(int i10) {
        this.f9973a = i10;
    }

    public int b() {
        return this.f9973a;
    }
}
