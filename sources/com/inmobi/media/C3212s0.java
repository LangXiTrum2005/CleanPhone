package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.CancellationException;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;

/* JADX INFO: renamed from: com.inmobi.media.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3212s0 {
    public static final C3212s0 a = new C3212s0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Le le, ContinuationImpl continuationImpl) {
        C3163q0 c3163q0;
        InMobiAdRequestStatus.StatusCode statusCode;
        if (continuationImpl instanceof C3163q0) {
            c3163q0 = (C3163q0) continuationImpl;
            int i = c3163q0.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3163q0.c = i - Integer.MIN_VALUE;
            } else {
                c3163q0 = new C3163q0(this, continuationImpl);
            }
        } else {
            c3163q0 = new C3163q0(this, continuationImpl);
        }
        Object objB = c3163q0.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3163q0.c;
        if (i2 == 0) {
            dern.saneness(objB);
            c3163q0.c = 1;
            objB = b(le, c3163q0);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objB);
        }
        Ne ne = (Ne) objB;
        if (ne.c() == 200) {
            return ne;
        }
        int iC = ne.c();
        Y5 y5 = EnumC2765a6.b;
        if (iC == 192) {
            statusCode = InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED;
        } else if (iC == 0) {
            statusCode = InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE;
        } else if (iC == 504) {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT;
        } else if (400 > iC || iC >= 500) {
            statusCode = (500 > iC || iC > 599) ? InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : InMobiAdRequestStatus.StatusCode.SERVER_ERROR;
        } else {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_INVALID;
        }
        throw new Y(new InMobiAdRequestStatus(statusCode), new K6(ne.c()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Le le, ContinuationImpl continuationImpl) {
        C3187r0 c3187r0;
        if (continuationImpl instanceof C3187r0) {
            c3187r0 = (C3187r0) continuationImpl;
            int i = c3187r0.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3187r0.c = i - Integer.MIN_VALUE;
            } else {
                c3187r0 = new C3187r0(this, continuationImpl);
            }
        } else {
            c3187r0 = new C3187r0(this, continuationImpl);
        }
        Object obj = c3187r0.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3187r0.c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dern.saneness(obj);
                return obj;
            }
            dern.saneness(obj);
            C3271u9 c3271u9 = (C3271u9) He.a.getValue();
            c3187r0.c = 1;
            Object objA = c3271u9.a.a(le, c3187r0);
            return objA == objBeachfront ? objBeachfront : objA;
        } catch (CancellationException unused) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new J6((short) 2206));
        }
    }
}
