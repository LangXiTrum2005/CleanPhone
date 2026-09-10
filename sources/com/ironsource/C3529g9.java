package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3529g9 {

    /* JADX INFO: renamed from: com.ironsource.g9$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        P7.a(P7.a, runnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        P7.a.a(callback);
    }

    public final IronSource.a[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i = a.a[it.next().ordinal()];
            if (i == 1) {
                arrayList.add(IronSource.a.BANNER);
            } else if (i == 2) {
                arrayList.add(IronSource.a.INTERSTITIAL);
            } else if (i == 3) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final C3462ce b(C3462ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C3462ce(error.c(), "serverResponseIsNotValid") : error;
    }

    public final IronSourceError a(C3462ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.c() != 2070 && error.c() != 2110) {
            if (error.c() != 2080 && error.c() != 2100) {
                if (error.c() == 2090) {
                    return C3753t5.a.a();
                }
                return new IronSourceError(510, error.d());
            }
            return C3753t5.a.c();
        }
        return C3753t5.a.b();
    }

    public final void a(long j, Ie.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put("isMultipleAdObjects", 1);
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.b());
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Gb.s.d().q().a(new C3804w5(EnumC3821x5.SDK_INIT_SUCCESS, jSONObjectB));
    }

    public final void a(C3462ce error, long j) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            jSONObjectB.put("reason", error.d());
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j);
            jSONObjectB.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Gb.s.d().q().a(new C3804w5(EnumC3821x5.SDK_INIT_FAILED, jSONObjectB));
    }

    public final void a(long j, long j2, long j3, long j4, long j5) {
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, "parsingDurationMs=" + j + ";javaHeapKb=" + j2 + ";nativeHeapKb=" + j3 + ";sharedOtherKb=" + j4 + ";initResponseJsonSizeKb=" + j5);
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Gb.s.d().q().a(new C3804w5(EnumC3821x5.TROUBLESHOOTING_INIT_SUCCESS, jSONObjectB));
    }
}
