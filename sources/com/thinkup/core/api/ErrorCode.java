package com.thinkup.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class ErrorCode {
    public static final String adShowError = "4006";
    public static final String adSourceBidError = "4007";
    public static final String adSourceLoadBidTypeFilterError = "2032";
    public static final String adSourceLoadCappingError = "2022";
    public static final String adSourceLoadPriceFilterError = "2033";
    public static final String adSourceLoadRiskError = "2031";
    public static final String adSourceLoadUnitFilterError = "2034";
    public static final String adSourceNotFilledError = "4008";
    public static final String adapterInnerError = "2006";
    public static final String adapterNotExistError = "2002";
    public static final String appIdError = "10003";
    public static final String appIdOrPlaceIdEmpty = "3002";
    public static final String appKeyError = "10001";
    public static final String biddingResultHasShow = "2019";
    public static final String c2sBiddingCacheError = "2012";
    public static final String compareFailedError = "2035";
    public static final String contextDestoryError = "4002";
    public static final String dataLevelLowError = "9992";
    public static final String exception = "9999";
    public static final String filterByMNErrorCodeReqLimit = "2020";
    public static final String filterByMatchNetworkErrorCode = "2021";
    public static final String filterByRefreshSystemSplash = "2015";
    public static final String filterSourceError = "2010";
    public static final String forbidNetworkByDeveloper = "2018";
    public static final String formatError = "3003";
    public static final String httpStatuException = "9990";
    public static final String inAdxBidFailedInterval = "2017";
    public static final String inAdxBidInterval = "2016";
    public static final String inNetworkErrorCodeRequestFailPacing = "2014";
    public static final String inPacingError = "2004";
    public static final String inPacingError_Format = "2030";
    public static final String inPacingError_Global = "2029";
    public static final String inRequestFailPacing = "2007";
    public static final String loadCappingError = "2009";
    public static final String loadCappingError_Format = "2024";
    public static final String loadCappingError_Global = "2023";
    public static final String loadFailInPacingError = "2008";
    public static final String loadInShowingFilter = "2011";
    public static final String loadingError = "2005";
    public static final String networkError = "1001";
    public static final String networkFirmIdFilterSourceError = "2013";
    public static final String noADError = "4001";
    public static final String noAdsourceConfig = "4004";
    public static final String noAdsourceConfigInDebugerMode = "4009";
    public static final String noAvailableAdsource = "4005";
    public static final String noFillNcError = "2036";
    public static final String noFillSError = "2037";
    public static final String noFillSrError = "2038";
    public static final String outOfCapError = "2003";
    public static final String outOfCapError_day_Format = "2026";
    public static final String outOfCapError_day_Global = "2025";
    public static final String outOfCapError_hour_Format = "2028";
    public static final String outOfCapError_hour_Global = "2027";
    public static final String placeDeletedError = "3004";
    public static final String placeStrategyError = "3001";
    public static final String placementAdClose = "4003";
    public static final String placementIdError = "10004";
    public static final String serverError = "1002";
    public static final String sharedPlacementIdError = "10019";
    public static final String statuError = "9991";
    public static final String timeOutError = "2001";
    public static final String unknown = "-9999";
    public static final String unknownMediationIdError = "10020";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AdError getErrorCode(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6 = loadingError;
        String str7 = inPacingError;
        String str8 = outOfCapError;
        String str9 = adapterNotExistError;
        String str10 = timeOutError;
        String str11 = serverError;
        str.getClass();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 1507424:
                str4 = adapterInnerError;
                str5 = networkError;
                if (str.equals(str5)) {
                    b2 = 0;
                }
                break;
            case 1507425:
                str4 = adapterInnerError;
                b2 = str.equals(str11) ? (byte) 1 : (byte) -1;
                str11 = str11;
                str5 = networkError;
                break;
            case 1537215:
                str4 = adapterInnerError;
                b2 = str.equals(str10) ? (byte) 2 : (byte) -1;
                str10 = str10;
                str5 = networkError;
                break;
            case 1537216:
                str4 = adapterInnerError;
                b2 = str.equals(str9) ? (byte) 3 : (byte) -1;
                str9 = str9;
                str5 = networkError;
                break;
            case 1537217:
                str4 = adapterInnerError;
                b2 = str.equals(str8) ? (byte) 4 : (byte) -1;
                str8 = str8;
                str5 = networkError;
                break;
            case 1537218:
                str4 = adapterInnerError;
                b2 = str.equals(str7) ? (byte) 5 : (byte) -1;
                str7 = str7;
                str5 = networkError;
                break;
            case 1537219:
                str4 = adapterInnerError;
                b2 = str.equals(str6) ? (byte) 6 : (byte) -1;
                str6 = str6;
                str5 = networkError;
                break;
            case 1537220:
                if (str.equals(adapterInnerError)) {
                    b2 = 7;
                }
                str4 = adapterInnerError;
                str5 = networkError;
                break;
            case 1537221:
                str4 = adapterInnerError;
                if (str.equals(inRequestFailPacing)) {
                    b2 = 8;
                }
                str5 = networkError;
                break;
            case 1537222:
                str4 = adapterInnerError;
                if (str.equals(loadFailInPacingError)) {
                    b2 = 9;
                }
                str5 = networkError;
                break;
            case 1537223:
                str4 = adapterInnerError;
                if (str.equals(loadCappingError)) {
                    b2 = 10;
                }
                str5 = networkError;
                break;
            case 1537245:
                str4 = adapterInnerError;
                if (str.equals(filterSourceError)) {
                    b2 = 11;
                }
                str5 = networkError;
                break;
            case 1537246:
                str4 = adapterInnerError;
                if (str.equals(loadInShowingFilter)) {
                    b2 = 12;
                }
                str5 = networkError;
                break;
            case 1537247:
                str4 = adapterInnerError;
                if (str.equals(c2sBiddingCacheError)) {
                    b2 = 13;
                }
                str5 = networkError;
                break;
            case 1537248:
                str4 = adapterInnerError;
                if (str.equals(networkFirmIdFilterSourceError)) {
                    b2 = 14;
                }
                str5 = networkError;
                break;
            case 1537249:
                str4 = adapterInnerError;
                if (str.equals(inNetworkErrorCodeRequestFailPacing)) {
                    b2 = 15;
                }
                str5 = networkError;
                break;
            case 1537250:
                str4 = adapterInnerError;
                if (str.equals(filterByRefreshSystemSplash)) {
                    b2 = 16;
                }
                str5 = networkError;
                break;
            case 1537251:
                str4 = adapterInnerError;
                if (str.equals(inAdxBidInterval)) {
                    b2 = 17;
                }
                str5 = networkError;
                break;
            case 1537252:
                str4 = adapterInnerError;
                if (str.equals(inAdxBidFailedInterval)) {
                    b2 = 18;
                }
                str5 = networkError;
                break;
            case 1537253:
                str4 = adapterInnerError;
                if (str.equals(forbidNetworkByDeveloper)) {
                    b2 = 19;
                }
                str5 = networkError;
                break;
            case 1537276:
                str4 = adapterInnerError;
                if (str.equals(filterByMNErrorCodeReqLimit)) {
                    b2 = 20;
                }
                str5 = networkError;
                break;
            case 1537277:
                str4 = adapterInnerError;
                if (str.equals(filterByMatchNetworkErrorCode)) {
                    b2 = 21;
                }
                str5 = networkError;
                break;
            case 1537278:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadCappingError)) {
                    b2 = 22;
                }
                str5 = networkError;
                break;
            case 1537279:
                str4 = adapterInnerError;
                if (str.equals(loadCappingError_Global)) {
                    b2 = 23;
                }
                str5 = networkError;
                break;
            case 1537280:
                str4 = adapterInnerError;
                if (str.equals(loadCappingError_Format)) {
                    b2 = 24;
                }
                str5 = networkError;
                break;
            case 1537281:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_day_Global)) {
                    b2 = 25;
                }
                str5 = networkError;
                break;
            case 1537282:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_day_Format)) {
                    b2 = 26;
                }
                str5 = networkError;
                break;
            case 1537283:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_hour_Global)) {
                    b2 = 27;
                }
                str5 = networkError;
                break;
            case 1537284:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_hour_Format)) {
                    b2 = 28;
                }
                str5 = networkError;
                break;
            case 1537285:
                str4 = adapterInnerError;
                if (str.equals(inPacingError_Global)) {
                    b2 = 29;
                }
                str5 = networkError;
                break;
            case 1537307:
                str4 = adapterInnerError;
                if (str.equals(inPacingError_Format)) {
                    b2 = 30;
                }
                str5 = networkError;
                break;
            case 1537308:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadRiskError)) {
                    b2 = 31;
                }
                str5 = networkError;
                break;
            case 1537309:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadBidTypeFilterError)) {
                    b2 = 32;
                }
                str5 = networkError;
                break;
            case 1537310:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadPriceFilterError)) {
                    b2 = 33;
                }
                str5 = networkError;
                break;
            case 1537311:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadUnitFilterError)) {
                    b2 = 34;
                }
                str5 = networkError;
                break;
            case 1537312:
                str4 = adapterInnerError;
                if (str.equals(compareFailedError)) {
                    b2 = 35;
                }
                str5 = networkError;
                break;
            case 1537313:
                str4 = adapterInnerError;
                if (str.equals(noFillNcError)) {
                    b2 = 36;
                }
                str5 = networkError;
                break;
            case 1537314:
                str4 = adapterInnerError;
                if (str.equals(noFillSError)) {
                    b2 = 37;
                }
                str5 = networkError;
                break;
            case 1537315:
                str4 = adapterInnerError;
                if (str.equals(noFillSrError)) {
                    b2 = 38;
                }
                str5 = networkError;
                break;
            case 1567006:
                str4 = adapterInnerError;
                if (str.equals("3001")) {
                    b2 = 39;
                }
                str5 = networkError;
                break;
            case 1567007:
                str4 = adapterInnerError;
                if (str.equals("3002")) {
                    b2 = 40;
                }
                str5 = networkError;
                break;
            case 1567008:
                str4 = adapterInnerError;
                if (str.equals("3003")) {
                    b2 = 41;
                }
                str5 = networkError;
                break;
            case 1596797:
                str4 = adapterInnerError;
                if (str.equals(noADError)) {
                    b2 = 42;
                }
                str5 = networkError;
                break;
            case 1596798:
                str4 = adapterInnerError;
                if (str.equals(contextDestoryError)) {
                    b2 = 43;
                }
                str5 = networkError;
                break;
            case 1596799:
                str4 = adapterInnerError;
                if (str.equals(placementAdClose)) {
                    b2 = 44;
                }
                str5 = networkError;
                break;
            case 1596800:
                str4 = adapterInnerError;
                if (str.equals(noAdsourceConfig)) {
                    b2 = 45;
                }
                str5 = networkError;
                break;
            case 1596801:
                str4 = adapterInnerError;
                if (str.equals(noAvailableAdsource)) {
                    b2 = 46;
                }
                str5 = networkError;
                break;
            case 1596802:
                str4 = adapterInnerError;
                if (str.equals(adShowError)) {
                    b2 = 47;
                }
                str5 = networkError;
                break;
            case 1596803:
                str4 = adapterInnerError;
                if (str.equals(adSourceBidError)) {
                    b2 = 48;
                }
                str5 = networkError;
                break;
            case 1596804:
                str4 = adapterInnerError;
                if (str.equals(adSourceNotFilledError)) {
                    b2 = 49;
                }
                str5 = networkError;
                break;
            case 1596805:
                str4 = adapterInnerError;
                if (str.equals(noAdsourceConfigInDebugerMode)) {
                    b2 = 50;
                }
                str5 = networkError;
                break;
            case 1754679:
                str4 = adapterInnerError;
                if (str.equals(httpStatuException)) {
                    b2 = 51;
                }
                str5 = networkError;
                break;
            case 1754680:
                str4 = adapterInnerError;
                if (str.equals(statuError)) {
                    b2 = 52;
                }
                str5 = networkError;
                break;
            case 1754681:
                str4 = adapterInnerError;
                if (str.equals(dataLevelLowError)) {
                    b2 = 53;
                }
                str5 = networkError;
                break;
            case 1754688:
                str4 = adapterInnerError;
                if (str.equals(exception)) {
                    b2 = 54;
                }
                str5 = networkError;
                break;
            case 46730162:
                str4 = adapterInnerError;
                if (str.equals("10001")) {
                    b2 = 55;
                }
                str5 = networkError;
                break;
            case 46730164:
                str4 = adapterInnerError;
                if (str.equals("10003")) {
                    b2 = 56;
                }
                str5 = networkError;
                break;
            case 46730165:
                str4 = adapterInnerError;
                if (str.equals("10004")) {
                    b2 = 57;
                }
                str5 = networkError;
                break;
            case 46730201:
                str4 = adapterInnerError;
                if (str.equals(sharedPlacementIdError)) {
                    b2 = 58;
                }
                str5 = networkError;
                break;
            case 46730223:
                str4 = adapterInnerError;
                if (str.equals(unknownMediationIdError)) {
                    b2 = 59;
                }
                str5 = networkError;
                break;
            default:
                str4 = adapterInnerError;
                str5 = networkError;
                break;
        }
        switch (b2) {
            case 0:
                return new AdError(str5, "Network is unavailable.", str2, str3);
            case 1:
                return new AdError(str11, "Server is unavailable.", str2, str3);
            case 2:
                return new AdError(str10, "Ad load time out.", str2, str3);
            case 3:
                return new AdError(str9, "Adapter does not exist.", str2, str3);
            case 4:
                return new AdError(str8, "Not satisfy the Placement's Cap configuration.", str2, str3);
            case 5:
                return new AdError(str7, "Not satisfy the Placement's Placing configuration.", str2, str3);
            case 6:
                return new AdError(str6, "Placement's Ad is loading.", str2, str3);
            case 7:
                return new AdError(str4, "Please check if your network sdk version is correct and all the network plugin has been put in your package.", str2, str3);
            case 8:
                return new AdError(inRequestFailPacing, "Not satisfy the Fail-request's Placing configuration.", str2, str3);
            case 9:
                return new AdError(loadFailInPacingError, "The placement load too frequent within the specified time period after the previous load failure.", str2, str3);
            case 10:
                return new AdError(loadCappingError, "The placement load too many times within the specified time period.", str2, str3);
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return new AdError(str, str3, str2, str3);
            case 12:
                return new AdError(loadInShowingFilter, "This unitgroup can't load on showing.", str2, str3);
            case 13:
                return new AdError(c2sBiddingCacheError, "C2S Bidding Cache error.", str2, str3);
            case 14:
                return new AdError(noAdsourceConfigInDebugerMode, "AdSource filter by network firm id.", str2, str3);
            case 23:
                return new AdError(loadCappingError_Global, "The placement load too many times within global time period.", str2, str3);
            case 24:
                return new AdError(loadCappingError_Format, "The placement load too many times within format time period.", str2, str3);
            case 25:
                return new AdError(outOfCapError_day_Global, "App global cap limit within day.", str2, str3);
            case 26:
                return new AdError(outOfCapError_day_Format, "Ad format cap limit within day.", str2, str3);
            case 27:
                return new AdError(outOfCapError_hour_Global, "App global cap limit within hour.", str2, str3);
            case 28:
                return new AdError(outOfCapError_hour_Format, "Ad format cap limit within hour.", str2, str3);
            case 29:
                return new AdError(inPacingError_Global, "App global pace limit.", str2, str3);
            case 30:
                return new AdError(inPacingError_Format, "Format pace limit.", str2, str3);
            case 31:
                return new AdError(adSourceLoadRiskError, "Risk device filter.", str2, str3);
            case 32:
                return new AdError(adSourceLoadBidTypeFilterError, "Bid type limit.", str2, str3);
            case 33:
                return new AdError(adSourceLoadPriceFilterError, "Price limit.", str2, str3);
            case 34:
                return new AdError(adSourceLoadUnitFilterError, "Ad unit limit.", str2, str3);
            case 35:
                return new AdError(compareFailedError, "Multi mediation fail.", str2, str3);
            case 36:
                return new AdError(str, "AdSource continuous no fill.", str2, str3);
            case 37:
                return new AdError(str, "AdSource cumulative no fill.", str2, str3);
            case 38:
                return new AdError(str, "AdSource cumulative no fill percentage.", str2, str3);
            case 39:
                return new AdError("3001", "Get placement strategy error, please check your appid、appkey and placementid is availiable.", str2, str3);
            case 40:
                return new AdError("3002", "AppId or PlacementId is empty.", str2, str3);
            case 41:
                return new AdError("3003", "Mismatched ad placement and ad format", str2, str3);
            case 42:
                return new AdError(noADError, "Return Ad is empty.", str2, str3);
            case 43:
                return new AdError(contextDestoryError, "Context or activity has been destory.", str2, str3);
            case 44:
                return new AdError(placementAdClose, "Placement Ads switch is close.", str2, str3);
            case 45:
                return new AdError(noAdsourceConfig, "The placement strategy does not contain any ad sources, please check the mediation configuration in TopOn", str2, str3);
            case 46:
                return new AdError(noAvailableAdsource, "Ad sources are filtered, no ad source is currently available", str2, str3);
            case 47:
                return new AdError(adShowError, "Ad show failed", str2, str3);
            case 48:
                return new AdError(adSourceBidError, "Bid error", str2, str3);
            case 49:
                return new AdError(adSourceNotFilledError, "Ad source not filled, cause by customize fillter.", str2, str3);
            case 50:
                return new AdError(noAdsourceConfigInDebugerMode, "The placement strategy does not contain any ad sources, please check the debugger configuration in TUSDK.setDebuggerConfig", str2, str3);
            case AD_REWARD_USER_VALUE:
                return new AdError(httpStatuException, "Possible network issue on device. Please check your network.", str2, str3);
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                if ("699".equals(str2)) {
                    return new AdError("3004", "This Placement has been suspended or deleted and no longer obtains Placement strategy.", "", "");
                }
                return "700".equals(str2) ? new AdError(statuError, "API access restricted due to too many requests. Please reduce requests or try again later.", "", "") : new AdError(statuError, "Service status error.", str2, str3);
            case 53:
                return new AdError(dataLevelLowError, "Upload data level is FORBIDDEN, must called 'TUSDK.setGDPRUploadDataLevel' to set the level.", str2, str3);
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                return new AdError(exception, "Exception in sdk.", str2, str3);
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                return new AdError("10001", "Please check your appkey.", str2, str3);
            case 56:
                return new AdError("10003", "Please check your appid.", str2, str3);
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                return new AdError("10004", "Please check your placementid.", str2, str3);
            case 58:
                return new AdError(sharedPlacementIdError, "Forbidden placement", str2, str3);
            case 59:
                return new AdError(unknownMediationIdError, "Unknown Mediation ID", str2, str3);
            default:
                return new AdError("-9999", "unknown", str2, str3);
        }
    }
}
