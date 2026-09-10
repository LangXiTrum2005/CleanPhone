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

/* JADX INFO: renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0390i9 {

    /* JADX INFO: renamed from: com.ironsource.i9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28898a;

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
            f28898a = iArr;
        }
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        R7.a(R7.f27125a, runnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        R7.f27125a.a(callback);
    }

    public final IronSource.a[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        kotlin.jvm.internal.n.f(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i10 = a.f28898a[it.next().ordinal()];
            if (i10 == 1) {
                arrayList.add(IronSource.a.BANNER);
            } else if (i10 == 2) {
                arrayList.add(IronSource.a.INTERSTITIAL);
            } else if (i10 == 3) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final C0520pe b(C0520pe error) {
        kotlin.jvm.internal.n.f(error, "error");
        return error.c() == 2080 ? new C0520pe(error.c(), "serverResponseIsNotValid") : error;
    }

    public final IronSourceError a(C0520pe error) {
        kotlin.jvm.internal.n.f(error, "error");
        if (error.c() != 2070 && error.c() != 2110) {
            if (error.c() != 2080 && error.c() != 2100) {
                if (error.c() == 2090) {
                    return C0600u5.f30795a.a();
                }
                return new IronSourceError(510, error.d());
            }
            return C0600u5.f30795a.c();
        }
        return C0600u5.f30795a.b();
    }

    public final void a(long j10, Ve.a responseOrigin) {
        kotlin.jvm.internal.n.f(responseOrigin, "responseOrigin");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put("isMultipleAdObjects", 1);
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j10);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.b());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Kb.f26413u.d().q().a(new C0654x5(EnumC0672y5.SDK_INIT_SUCCESS, jSONObjectB));
    }

    public final void a(C0520pe error, long j10) {
        kotlin.jvm.internal.n.f(error, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            jSONObjectB.put("reason", error.d());
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j10);
            jSONObjectB.put("isMultipleAdObjects", 1);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Kb.f26413u.d().q().a(new C0654x5(EnumC0672y5.SDK_INIT_FAILED, jSONObjectB));
    }

    public final void a(long j10, long j11, long j12, long j13, long j14) {
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, "parsingDurationMs=" + j10 + ";javaHeapKb=" + j11 + ";nativeHeapKb=" + j12 + ";sharedOtherKb=" + j13 + ";initResponseJsonSizeKb=" + j14);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Kb.f26413u.d().q().a(new C0654x5(EnumC0672y5.TROUBLESHOOTING_INIT_SUCCESS, jSONObjectB));
    }
}
