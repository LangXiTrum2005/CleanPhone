package com.inmobi.media;

import java.util.concurrent.CancellationException;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3016k3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(S2 s2, ContinuationImpl continuationImpl) {
        C2991j3 c2991j3;
        String str;
        Exception e;
        S2 s3 = s2;
        if (continuationImpl instanceof C2991j3) {
            c2991j3 = (C2991j3) continuationImpl;
            int i = c2991j3.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2991j3.d = i - Integer.MIN_VALUE;
            } else {
                c2991j3 = new C2991j3(this, continuationImpl);
            }
        } else {
            c2991j3 = new C2991j3(this, continuationImpl);
        }
        Object objA = c2991j3.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2991j3.d;
        if (i2 == 0) {
            dern.saneness(objA);
            C3315w3 c3315w3 = C3315w3.a;
            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
            int i3 = s3.a;
            str = "access$getTAG$p(...)";
            Je je = new Je(s3.b, C3315w3.a(s3), new C3158pk(C3315w3.c().getPingTimeout() * 1000, C3315w3.c().getPingTimeout() * 1000, C3315w3.c().getPingTimeout() * 1000), s3.c, null, s3.d, 16);
            try {
                C3271u9 c3271u9 = (C3271u9) He.f.getValue();
                c2991j3.a = s3;
                c2991j3.d = 1;
                objA = c3271u9.a.a(je, c2991j3);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            } catch (CancellationException unused) {
                C3315w3 c3315w4 = C3315w3.a;
                Intrinsics.checkNotNullExpressionValue("w3", str);
                return EnumC2765a6.n;
            } catch (Exception e2) {
                e = e2;
                C3315w3 c3315w5 = C3315w3.a;
                Intrinsics.checkNotNullExpressionValue("w3", str);
                e.getMessage();
                return EnumC2765a6.d;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s3 = c2991j3.a;
            try {
                dern.saneness(objA);
                str = "access$getTAG$p(...)";
            } catch (CancellationException unused2) {
                str = "access$getTAG$p(...)";
                C3315w3 c3315w6 = C3315w3.a;
                Intrinsics.checkNotNullExpressionValue("w3", str);
                return EnumC2765a6.n;
            } catch (Exception e3) {
                e = e3;
                str = "access$getTAG$p(...)";
                C3315w3 c3315w7 = C3315w3.a;
                Intrinsics.checkNotNullExpressionValue("w3", str);
                e.getMessage();
                return EnumC2765a6.d;
            }
        }
        Ne ne = (Ne) objA;
        C3315w3 c3315w8 = C3315w3.a;
        if (AbstractC2935gl.a(ne)) {
            return null;
        }
        int iC = ne.c();
        if (200 <= iC && iC < 300) {
            return null;
        }
        if (!s3.d) {
            Y5 y5 = EnumC2765a6.b;
            if (303 == iC || 302 == iC) {
                return null;
            }
        }
        EnumC2765a6.b.getClass();
        return Y5.a(iC);
    }
}
