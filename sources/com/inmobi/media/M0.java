package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class M0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f22962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(S0 s0) {
        super(1);
        this.f22962a = s0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short s;
        EnumC3157o4 it = (EnumC3157o4) obj;
        Intrinsics.f(it, "it");
        S0 s0 = this.f22962a;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        int iOrdinal = it.ordinal();
        if (iOrdinal == 0) {
            s = 2100;
        } else if (iOrdinal != 18) {
            switch (iOrdinal) {
                case 12:
                    s = 2101;
                    break;
                case 13:
                    s = 2102;
                    break;
                case 14:
                    s = 2103;
                    break;
                case 15:
                    s = 2104;
                    break;
                case 16:
                    s = 2105;
                    break;
                default:
                    s = 2100;
                    break;
            }
        } else {
            s = 2228;
        }
        s0.a(inMobiAdRequestStatus, true, s);
        return Unit.f43263a;
    }
}
