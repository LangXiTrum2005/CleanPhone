package com.google.zxing.oned;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.smartdigimkt.b0.a;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class Code93Reader extends OneDReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21374a;

    static {
        "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
        f21374a = new int[]{276, 328, 324, 322, a.T0, 292, 290, 336, 274, 266, 424, 420, 418, 404, TTAdConstant.AD_ID_IS_NULL_CODE, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, a.W0, 436, 434, 428, 422, 406, 410, 364, 358, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
    }
}
