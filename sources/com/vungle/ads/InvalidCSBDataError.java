package com.vungle.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/InvalidCSBDataError;", "Lcom/vungle/ads/VungleError;", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InvalidCSBDataError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCSBDataError(String message) {
        super(Sdk$SDKError.Reason.INVALID_CSB_DATA, "Invalid CSB data: " + message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
