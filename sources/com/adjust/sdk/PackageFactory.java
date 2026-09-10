package com.adjust.sdk;

import android.net.UrlQuerySanitizer;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PackageFactory {
    private static final String ADJUST_PREFIX = "adjust_";

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r2 = r11.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage(android.net.Uri r11, android.net.Uri r12, long r13, com.adjust.sdk.ActivityState r15, com.adjust.sdk.AdjustConfig r16, com.adjust.sdk.DeviceInfo r17, com.adjust.sdk.GlobalParameters r18, com.adjust.sdk.q0 r19, com.adjust.sdk.ActivityHandler.InternalState r20) {
        /*
            r1 = 0
            if (r11 != 0) goto L4
            return r1
        L4:
            java.lang.String r2 = r11.toString()
            if (r2 == 0) goto La1
            int r0 = r2.length()
            if (r0 != 0) goto L12
            goto La1
        L12:
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.lang.Exception -> L19 java.lang.IllegalArgumentException -> L1b java.io.UnsupportedEncodingException -> L1d
            goto L54
        L19:
            r0 = move-exception
            goto L1f
        L1b:
            r0 = move-exception
            goto L31
        L1d:
            r0 = move-exception
            goto L43
        L1f:
            com.adjust.sdk.ILogger r3 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "Deeplink url decoding failed. Message: (%s)"
            r3.error(r4, r0)
            goto L54
        L31:
            com.adjust.sdk.ILogger r3 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r3.error(r4, r0)
            goto L54
        L43:
            com.adjust.sdk.ILogger r3 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r3.error(r4, r0)
        L54:
            com.adjust.sdk.ILogger r0 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r4 = "Url to parse (%s)"
            r0.verbose(r4, r3)
            android.net.UrlQuerySanitizer r0 = new android.net.UrlQuerySanitizer
            r0.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r3 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r0.setUnregisteredParameterValueSanitizer(r3)
            r3 = 1
            r0.setAllowUnregisteredParamaters(r3)
            r0.parseUrl(r2)
            java.util.List r4 = r0.getParameterList()
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            com.adjust.sdk.PackageBuilder r15 = queryStringClickPackageBuilder(r4, r5, r6, r7, r8, r9, r10)
            if (r15 != 0) goto L8a
            return r1
        L8a:
            java.lang.String r11 = r11.toString()
            r15.deeplink = r11
            r15.clickTimeInMilliseconds = r13
            if (r12 == 0) goto L9a
            java.lang.String r11 = r12.toString()
            r15.referrer = r11
        L9a:
            java.lang.String r11 = "deeplink"
            com.adjust.sdk.ActivityPackage r11 = r15.buildClickPackage(r11)
            return r11
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.PackageFactory.buildDeeplinkSdkClickPackage(android.net.Uri, android.net.Uri, long, com.adjust.sdk.ActivityState, com.adjust.sdk.AdjustConfig, com.adjust.sdk.DeviceInfo, com.adjust.sdk.GlobalParameters, com.adjust.sdk.q0, com.adjust.sdk.ActivityHandler$InternalState):com.adjust.sdk.ActivityPackage");
    }

    public static ActivityPackage buildInstallReferrerSdkClickPackage(ReferrerDetails referrerDetails, String str, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, q0 q0Var, ActivityHandler.InternalState internalState) {
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, q0Var, System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.referrer = referrerDetails.installReferrer;
        packageBuilder.clickTimeInSeconds = referrerDetails.referrerClickTimestampSeconds;
        packageBuilder.installBeginTimeInSeconds = referrerDetails.installBeginTimestampSeconds;
        packageBuilder.clickTimeServerInSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        packageBuilder.installBeginTimeServerInSeconds = referrerDetails.installBeginTimestampServerSeconds;
        packageBuilder.installVersion = referrerDetails.installVersion;
        packageBuilder.googlePlayInstant = referrerDetails.googlePlayInstant;
        packageBuilder.isClick = referrerDetails.isClick;
        packageBuilder.referrerApi = str;
        return packageBuilder.buildClickPackage(Constants.INSTALL_REFERRER);
    }

    public static ActivityPackage buildLicenseVerificationSdkClickPackage(LicenseData licenseData, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, q0 q0Var, ActivityHandler.InternalState internalState) {
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, q0Var, System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.licenseData = licenseData;
        return packageBuilder.buildClickPackage(Constants.LICENSE_VERIFICATION);
    }

    public static ActivityPackage buildPreinstallSdkClickPackage(String str, String str2, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, q0 q0Var) {
        if (str == null || str.length() == 0) {
            return null;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, q0Var, System.currentTimeMillis());
        packageBuilder.preinstallPayload = str;
        packageBuilder.preinstallLocation = str2;
        return packageBuilder.buildClickPackage(Constants.PREINSTALL);
    }

    public static ActivityPackage buildReftagSdkClickPackage(String str, long j10, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, q0 q0Var, ActivityHandler.InternalState internalState) {
        String strDecode = Constants.MALFORMED;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            strDecode = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e10.getMessage());
        } catch (IllegalArgumentException e11) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e11.getMessage());
        } catch (Exception e12) {
            AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e12.getMessage());
        }
        AdjustFactory.getLogger().verbose("Referrer to parse (%s)", strDecode);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(strDecode);
        PackageBuilder packageBuilderQueryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, q0Var, internalState);
        if (packageBuilderQueryStringClickPackageBuilder == null) {
            return null;
        }
        packageBuilderQueryStringClickPackageBuilder.referrer = strDecode;
        packageBuilderQueryStringClickPackageBuilder.clickTimeInMilliseconds = j10;
        packageBuilderQueryStringClickPackageBuilder.rawReferrer = str;
        return packageBuilderQueryStringClickPackageBuilder.buildClickPackage(Constants.REFTAG);
    }

    private static PackageBuilder queryStringClickPackageBuilder(List<UrlQuerySanitizer.ParameterValuePair> list, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, q0 q0Var, ActivityHandler.InternalState internalState) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            readQueryString(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, adjustAttribution);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove(Constants.REFTAG);
        if (activityState != null) {
            activityState.lastInterval = jCurrentTimeMillis - activityState.lastActivity;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, q0Var, jCurrentTimeMillis);
        packageBuilder.internalState = internalState;
        packageBuilder.extraParameters = linkedHashMap;
        packageBuilder.attribution = adjustAttribution;
        packageBuilder.reftag = str;
        return packageBuilder;
    }

    private static boolean readQueryString(String str, String str2, Map<String, String> map, AdjustAttribution adjustAttribution) {
        if (str == null || str2 == null || !str.startsWith(ADJUST_PREFIX)) {
            return false;
        }
        String strSubstring = str.substring(7);
        if (strSubstring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (tryToSetAttribution(adjustAttribution, strSubstring, str2)) {
            return true;
        }
        map.put(strSubstring, str2);
        return true;
    }

    private static boolean tryToSetAttribution(AdjustAttribution adjustAttribution, String str, String str2) {
        if (str.equals("tracker")) {
            adjustAttribution.trackerName = str2;
            return true;
        }
        if (str.equals(MBInterstitialActivity.INTENT_CAMAPIGN)) {
            adjustAttribution.campaign = str2;
            return true;
        }
        if (str.equals("adgroup")) {
            adjustAttribution.adgroup = str2;
            return true;
        }
        if (!str.equals("creative")) {
            return false;
        }
        adjustAttribution.creative = str2;
        return true;
    }
}
