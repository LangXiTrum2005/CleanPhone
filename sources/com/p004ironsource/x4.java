package com.p004ironsource;

import com.smartdigimkt.h5.f;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0005\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ironsource/x4;", "", "", "auctionFallbackEnabled", "", "a", "", "errorCode", "(ZLjava/lang/Integer;)Ljava/lang/String;", "b", "Ljava/lang/String;", "TRIALS_FAIL_AUCTION_FALLBACK_VALUE", "c", "PARSING_AUCTION_FALLBACK_VALUE", "d", "DEFAULT_AUCTION_FALLBACK_VALUE", "e", "DISABLED_AUCTION_FALLBACK_VALUE", f.j, "DISABLED_AUCTION_FALLBACK_ID", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x4 f27661a = new x4();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TRIALS_FAIL_AUCTION_FALLBACK_VALUE = "trials_fail";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final String PARSING_AUCTION_FALLBACK_VALUE = "parsing";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final String DEFAULT_AUCTION_FALLBACK_VALUE = "other";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final String DISABLED_AUCTION_FALLBACK_VALUE = "disabled";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final String DISABLED_AUCTION_FALLBACK_ID = "-1";

    private x4() {
    }

    public static /* synthetic */ String a(x4 x4Var, boolean z2, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        return x4Var.a(z2, num);
    }

    public final String a(boolean auctionFallbackEnabled) {
        if (!auctionFallbackEnabled) {
            return DISABLED_AUCTION_FALLBACK_ID;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    public final String a(boolean auctionFallbackEnabled, Integer errorCode) {
        if (!auctionFallbackEnabled) {
            return DISABLED_AUCTION_FALLBACK_VALUE;
        }
        if (errorCode != null && errorCode.intValue() == 1003) {
            return PARSING_AUCTION_FALLBACK_VALUE;
        }
        if (errorCode != null && errorCode.intValue() == 1008) {
            return PARSING_AUCTION_FALLBACK_VALUE;
        }
        if (errorCode != null && errorCode.intValue() == 1002) {
            return PARSING_AUCTION_FALLBACK_VALUE;
        }
        if (errorCode != null && errorCode.intValue() == 1006) {
            return TRIALS_FAIL_AUCTION_FALLBACK_VALUE;
        }
        return (errorCode != null && errorCode.intValue() == 1001) ? TRIALS_FAIL_AUCTION_FALLBACK_VALUE : DEFAULT_AUCTION_FALLBACK_VALUE;
    }
}
