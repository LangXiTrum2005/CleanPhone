package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.internal.Model.CBError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14865b;

        static {
            int[] iArr = new int[CBError.Impression.values().length];
            try {
                iArr[CBError.Impression.INTERNET_UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CBError.Impression.NO_AD_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CBError.Impression.SESSION_NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CBError.Impression.IMPRESSION_ALREADY_VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CBError.Impression.NO_HOST_ACTIVITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CBError.Impression.USER_CANCELLATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CBError.Impression.VIDEO_UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CBError.Impression.VIDEO_ID_MISSING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CBError.Impression.ERROR_PLAYING_VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CBError.Impression.ERROR_CREATING_VIEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CBError.Impression.ERROR_DISPLAYING_VIEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CBError.Impression.ERROR_LOADING_WEB_VIEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CBError.Impression.PENDING_IMPRESSION_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f14864a = iArr;
            int[] iArr2 = new int[CBError.Click.values().length];
            try {
                iArr2[CBError.Click.URI_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CBError.Click.URI_UNRECOGNIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f14865b = iArr2;
        }
    }

    public static final CacheError a(Throwable th) {
        CacheError.Code code;
        ChartboostError chartboostError = th instanceof ChartboostError ? (ChartboostError) th : null;
        if (chartboostError instanceof ChartboostError.Load.NotInitialized) {
            code = CacheError.Code.SESSION_NOT_STARTED;
        } else if (chartboostError instanceof ChartboostError.Load.TimedOut) {
            code = CacheError.Code.TIMEOUT;
        } else if (chartboostError instanceof ChartboostError.Load.NoAd) {
            code = CacheError.Code.NO_AD_FOUND;
        } else if ((chartboostError instanceof ChartboostError.Load.AssetUnavailable) || (chartboostError instanceof ChartboostError.Load.UnsupportedCodec)) {
            code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
        } else if (chartboostError instanceof ChartboostError.Connectivity.NoInternet) {
            code = CacheError.Code.INTERNET_UNAVAILABLE;
        } else if ((chartboostError instanceof ChartboostError.Load.InvalidResponse) || (chartboostError instanceof ChartboostError.Load.InvalidAdm)) {
            code = CacheError.Code.SERVER_ERROR;
        } else if (chartboostError instanceof ChartboostError.Load.Disabled) {
            code = CacheError.Code.DISABLED;
        } else if (chartboostError instanceof ChartboostError.Load.LoadInProgress) {
            code = CacheError.Code.LOAD_IN_PROGRESS;
        } else if (chartboostError instanceof ChartboostError.Load.AlreadyLoaded) {
            code = CacheError.Code.ALREADY_LOADED;
        } else if (chartboostError instanceof ChartboostError.Load.InvalidPlacement) {
            code = CacheError.Code.INVALID_PLACEMENT;
        } else if (chartboostError instanceof ChartboostError.Load.RateLimited) {
            code = CacheError.Code.RATE_LIMITED;
        } else if (chartboostError instanceof ChartboostError.Load.InvalidRequest) {
            code = CacheError.Code.INVALID_REQUEST;
        } else if (chartboostError instanceof ChartboostError.Load.NoStorage) {
            code = CacheError.Code.NO_STORAGE;
        } else if (chartboostError instanceof ChartboostError.Load.NoMraidJs) {
            code = CacheError.Code.NO_MRAID_JS;
        } else if (chartboostError instanceof ChartboostError.Load.InvalidHtml) {
            code = CacheError.Code.INVALID_HTML;
        } else if (chartboostError instanceof ChartboostError.Load.WebViewFailed) {
            code = CacheError.Code.WEBVIEW_FAILED;
        } else if (chartboostError instanceof ChartboostError.Load.WebViewCrashed) {
            code = CacheError.Code.WEBVIEW_CRASHED;
        } else if (chartboostError instanceof ChartboostError.Load.InvalidAssetUrl) {
            code = CacheError.Code.INVALID_ASSET_URL;
        } else if (chartboostError instanceof ChartboostError.Load.VastError) {
            code = CacheError.Code.VAST_ERROR;
        } else if (chartboostError instanceof ChartboostError.Connectivity.NetworkError) {
            code = CacheError.Code.NETWORK_FAILURE;
        } else {
            code = chartboostError instanceof ChartboostError.Connectivity.ServerError ? CacheError.Code.SERVER_ERROR : CacheError.Code.INTERNAL;
        }
        return new CacheError(code, th instanceof Exception ? (Exception) th : null);
    }

    public static final ShowError b(Throwable error) {
        ShowError.Code code;
        Intrinsics.f(error, "error");
        ChartboostError.Show unknown = error instanceof ChartboostError.Show ? (ChartboostError.Show) error : null;
        if (unknown == null) {
            unknown = new ChartboostError.Show.Unknown(error.getMessage(), error);
        }
        if (unknown instanceof ChartboostError.Show.Unknown) {
            code = ShowError.Code.INTERNAL;
        } else if (unknown instanceof ChartboostError.Show.NoAd) {
            code = ShowError.Code.NO_CACHED_AD;
        } else if (unknown instanceof ChartboostError.Show.AdExpired) {
            code = ShowError.Code.AD_EXPIRED;
        } else if (unknown instanceof ChartboostError.Show.AdInvalidated) {
            code = ShowError.Code.AD_INVALIDATED;
        } else if (unknown instanceof ChartboostError.Show.NoContext) {
            code = ShowError.Code.NO_CONTEXT;
        } else if (unknown instanceof ChartboostError.Show.AssetUnavailable) {
            code = ShowError.Code.ASSET_UNAVAILABLE;
        } else if (unknown instanceof ChartboostError.Show.FullscreenAlreadyShowing) {
            code = ShowError.Code.AD_ALREADY_VISIBLE;
        } else if (unknown instanceof ChartboostError.Show.TimedOut) {
            code = ShowError.Code.TIMEOUT;
        } else if (unknown instanceof ChartboostError.Show.Disabled) {
            code = ShowError.Code.DISABLED;
        } else {
            if (!(unknown instanceof ChartboostError.Show.NotInitialized)) {
                throw new NoWhenBranchMatchedException();
            }
            code = ShowError.Code.SESSION_NOT_STARTED;
        }
        return new ShowError(code, new Exception(error));
    }

    public static final ClickError a(CBError.Click error, String errorMsg) {
        ClickError.Code code;
        Intrinsics.f(error, "error");
        Intrinsics.f(errorMsg, "errorMsg");
        int i2 = a.f14865b[error.ordinal()];
        if (i2 == 1) {
            code = ClickError.Code.URI_INVALID;
        } else if (i2 != 2) {
            code = ClickError.Code.INTERNAL;
        } else {
            code = ClickError.Code.URI_UNRECOGNIZED;
        }
        return new ClickError(code, new Exception(errorMsg));
    }

    public static final CacheError a(CBError.Type error) {
        CacheError.Code code;
        Intrinsics.f(error, "error");
        if (error == CBError.Impression.INTERNET_UNAVAILABLE) {
            code = CacheError.Code.INTERNET_UNAVAILABLE;
        } else if (error == CBError.Impression.TOO_MANY_CONNECTIONS || error == CBError.Impression.NETWORK_FAILURE) {
            code = CacheError.Code.NETWORK_FAILURE;
        } else if (error == CBError.Impression.NO_AD_FOUND) {
            code = CacheError.Code.NO_AD_FOUND;
        } else if (error == CBError.Impression.SESSION_NOT_STARTED) {
            code = CacheError.Code.SESSION_NOT_STARTED;
        } else if (error == CBError.Impression.INVALID_RESPONSE) {
            code = CacheError.Code.SERVER_ERROR;
        } else if (error == CBError.Impression.ASSETS_DOWNLOAD_FAILURE || error == CBError.Impression.ASSET_PREFETCH_IN_PROGRESS || error == CBError.Impression.ASSET_MISSING) {
            code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
        } else {
            code = error == CBError.Impression.INTERNET_UNAVAILABLE_AT_CACHE ? CacheError.Code.INTERNET_UNAVAILABLE : CacheError.Code.INTERNAL;
        }
        return new CacheError(code, null, 2, null);
    }

    public static final ShowError a(CBError.Impression error) {
        ShowError.Code code;
        Intrinsics.f(error, "error");
        switch (a.f14864a[error.ordinal()]) {
            case 1:
                code = ShowError.Code.INTERNET_UNAVAILABLE;
                break;
            case 2:
                code = ShowError.Code.NO_CACHED_AD;
                break;
            case 3:
                code = ShowError.Code.SESSION_NOT_STARTED;
                break;
            case 4:
                code = ShowError.Code.AD_ALREADY_VISIBLE;
                break;
            case 5:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 6:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 7:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 8:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 9:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 10:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 11:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 12:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 13:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 14:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 15:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 16:
                code = ShowError.Code.INTERNET_UNAVAILABLE;
                break;
            default:
                code = ShowError.Code.INTERNAL;
                break;
        }
        return new ShowError(code, null, 2, null);
    }
}
