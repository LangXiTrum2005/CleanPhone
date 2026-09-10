package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0005\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0017"}, d2 = {"Lcom/ironsource/bj;", "", "Ljava/lang/Runnable;", "runnable", "", "a", "callback", "b", "", "Lcom/unity3d/ironsourceads/IronSourceAds$AdFormat;", "adFormats", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "(Ljava/util/List;)[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/ps;", "error", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "", "duration", "Lcom/ironsource/qt$a;", "responseOrigin", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bj {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24431a;

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
            f24431a = iArr;
        }
    }

    public final IronSourceError a(ps error) {
        Intrinsics.f(error, "error");
        if (error.c() == 2070 || error.c() == 2110) {
            return wb.f27568a.b();
        }
        if (error.c() == 2080 || error.c() == 2100) {
            return wb.f27568a.c();
        }
        return error.c() == 2090 ? wb.f27568a.a() : new IronSourceError(510, error.d());
    }

    public final void b(Runnable callback) {
        Intrinsics.f(callback, "callback");
        pg.f26494a.a(callback);
    }

    public final void a(long duration, qt.a responseOrigin) {
        Intrinsics.f(responseOrigin, "responseOrigin");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("isMultipleAdObjects", 1);
            mediationAdditionalData.put("duration", duration);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.a());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        on.INSTANCE.d().z().a(new zb(ac.SDK_INIT_SUCCESS, mediationAdditionalData));
    }

    public final void a(ps error, long duration) {
        Intrinsics.f(error, "error");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("errorCode", error.c());
            mediationAdditionalData.put("reason", error.d());
            mediationAdditionalData.put("duration", duration);
            mediationAdditionalData.put("isMultipleAdObjects", 1);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        on.INSTANCE.d().z().a(new zb(ac.SDK_INIT_FAILED, mediationAdditionalData));
    }

    public final void a(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        pg.a(pg.f26494a, runnable, 0L, 2, (Object) null);
    }

    public final IronSource.AD_UNIT[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        IronSource.AD_UNIT ad_unit;
        Intrinsics.f(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i2 = a.f24431a[it.next().ordinal()];
            if (i2 == 1) {
                ad_unit = IronSource.AD_UNIT.BANNER;
            } else if (i2 == 2) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            } else if (i2 == 3) {
                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            }
            arrayList.add(ad_unit);
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }
}
