package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P9 f23286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiAdRequestStatus f23287b;

    public V(P9 mResponse) {
        Intrinsics.f(mResponse, "mResponse");
        this.f23286a = mResponse;
        I9 i9 = mResponse.d;
        if (i9 != null) {
            switch (U.f23240a[i9.f22886a.ordinal()]) {
                case 1:
                    this.f23287b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    break;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    this.f23287b = inMobiAdRequestStatus;
                    I9 i10 = mResponse.d;
                    String str = i10 != null ? i10.f22887b : null;
                    if (str != null) {
                        inMobiAdRequestStatus.setCustomMessage(str);
                    }
                    break;
                case 3:
                    this.f23287b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.f23287b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    break;
                case 9:
                    this.f23287b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    break;
                default:
                    this.f23287b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    break;
            }
        }
    }
}
