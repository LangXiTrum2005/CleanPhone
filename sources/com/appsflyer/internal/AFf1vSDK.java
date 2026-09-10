package com.appsflyer.internal;

import android.media.AudioTrack;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.ironsource.Ua;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1vSDK extends AFe1fSDK<Map<String, String>> {
    private final UUID AFInAppEventType;
    public AFa1tSDK component2;
    private String copy;
    private String copydefault;
    private final AFd1nSDK equals;
    private String hashCode;
    private final boolean toString;

    public interface AFa1tSDK {
        void AFAdRevenueData(String str);

        void getCurrencyIso4217Code(Map<String, String> map);
    }

    public AFf1vSDK(AFd1zSDK aFd1zSDK, UUID uuid, Uri uri) throws Throwable {
        super(AFe1pSDK.ONELINK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.equals = aFd1zSDK.getRevenue();
        this.AFInAppEventType = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFk1wSDK.getMonetizationNetwork(uri.getHost()) && !AFk1wSDK.getMonetizationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1zSDK.i()};
                    Map map = AFa1hSDK.d;
                    Object declaredConstructor = map.get(862139947);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1hSDK.getRevenue(TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 62049), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36)).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                        map.put(862139947, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(-180621578);
                        if (method == null) {
                            method = ((Class) AFa1hSDK.getRevenue(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (KeyEvent.getDeadChar(0, 0) + 62049), (ViewConfiguration.getTouchSlop() >> 8) + 37)).getMethod("getMediationNetwork", null);
                            map.put(-180621578, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(614194017);
                            if (method2 == null) {
                                method2 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getLongPressTimeout() >> 16) + 37, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51)).getMethod("AFAdRevenueData", null);
                                map.put(614194017, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(2114469703);
                                if (method3 == null) {
                                    method3 = ((Class) AFa1hSDK.getRevenue(38 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), 51 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getRevenue", null);
                                    map.put(2114469703, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.copydefault = strArrSplit[1];
                                    this.copy = strArrSplit[2];
                                    this.hashCode = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.toString = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return Ua.C;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    public final boolean copy() {
        return (TextUtils.isEmpty(this.copydefault) || TextUtils.isEmpty(this.copy) || this.copydefault.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    public final boolean equals() {
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        ResponseNetwork responseNetwork;
        super.getCurrencyIso4217Code();
        AFa1tSDK aFa1tSDK = this.component2;
        if (aFa1tSDK != null) {
            if (this.getMonetizationNetwork == AFe1uSDK.SUCCESS && (responseNetwork = ((AFe1fSDK) this).areAllFieldsValid) != null) {
                aFa1tSDK.getCurrencyIso4217Code((Map) responseNetwork.getBody());
                return;
            }
            Throwable thComponent1 = component1();
            if (!(thComponent1 instanceof ParsingException)) {
                String str = this.hashCode;
                aFa1tSDK.AFAdRevenueData(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thComponent1).getRawResponse().isSuccessful()) {
                aFa1tSDK.AFAdRevenueData("Can't parse one link data");
            } else {
                String str2 = this.hashCode;
                aFa1tSDK.AFAdRevenueData(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<Map<String, String>> AFAdRevenueData(String str) {
        return this.equals.getMediationNetwork(this.copydefault, this.copy, this.AFInAppEventType, str);
    }
}
