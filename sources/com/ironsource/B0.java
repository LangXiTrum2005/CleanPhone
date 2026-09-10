package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class B0 {
    public static int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int b(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return 1020;
        }
        if (aVar == IronSource.a.BANNER) {
            return 1019;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return 1018;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int c(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == IronSource.a.BANNER) {
            return IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int d(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_LOAD_DURING_SHOW;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int e(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return 1024;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == IronSource.a.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int f(IronSource.a aVar) {
        if (aVar == IronSource.a.INTERSTITIAL || aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_PLACEMENT_CAPPED;
        }
        if (aVar == IronSource.a.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int g(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int h(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_SHOW_EXCEPTION;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }
}
