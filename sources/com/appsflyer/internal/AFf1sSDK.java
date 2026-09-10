package com.appsflyer.internal;

import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public class AFf1sSDK extends AFe1fSDK<String> {
    private static final AFe1pSDK[] registerClient = {AFe1pSDK.DLSDK, AFe1pSDK.ONELINK, AFe1pSDK.REGISTER};
    private final AFf1fSDK AFInAppEventType;
    private final AFc1hSDK AFKeystoreWrapper;
    protected final AFc1qSDK component2;
    private final AFh1mSDK copy;
    private final AFe1vSDK copydefault;
    private final AFc1oSDK equals;
    private final AFf1kSDK hashCode;
    protected final AFg1nSDK toString;

    public AFf1sSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK) {
        this(aFh1mSDK, aFd1zSDK, null);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<String> AFAdRevenueData(String str) {
        double d;
        JSONObject jSONObject;
        String string;
        String str2;
        Exception exc;
        String strReplaceAll;
        String str3;
        AFAdRevenueData(this.copy);
        if (this.copy.AFAdRevenueData.containsKey("meta")) {
            try {
                d = this.hashCode.AFAdRevenueData.getCurrencyIso4217Code.getMonetizationNetwork.getMonetizationNetwork.getMonetizationNetwork;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFh1mSDK.getRevenue(d)) {
                this.copy.AFAdRevenueData.remove("meta");
            }
        }
        AFd1hSDK<String> currencyIso4217Code = ((AFe1fSDK) this).component4.getCurrencyIso4217Code(this.copy, str, this.AFKeystoreWrapper);
        Map<String, Object> map = this.copy.AFAdRevenueData;
        try {
            jSONObject = new JSONObject(map);
            try {
                string = jSONObject.toString();
                try {
                    if (string == null) {
                        throw new NullPointerException("JSON toString of eventParams map returns null");
                    }
                    strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                    str2 = strReplaceAll;
                    str3 = string != null ? string : "";
                    if (str2.equals(str3)) {
                        str2 = str3;
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                        try {
                            jSONObject = new JSONObject(str2);
                        } catch (JSONException e) {
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": preparing data: ");
                    AFg1aSDK.getRevenue(sb.toString(), jSONObject);
                    this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
                    return currencyIso4217Code;
                } catch (NullPointerException e2) {
                    e = e2;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFa1hSDK.d;
                        Object method = map2.get(-226252430);
                        if (method == null) {
                            method = ((Class) AFa1hSDK.getRevenue(198 - View.resolveSize(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 37)).getMethod("getMonetizationNetwork", Map.class);
                            map2.put(-226252430, method);
                        }
                        String str4 = (String) ((Method) method).invoke(null, objArr);
                        try {
                            if (str4 == null) {
                                throw new NullPointerException("JSON toString of eventParams map returns null");
                            }
                            strReplaceAll = str4.replaceAll("\\p{C}", "*Non-printing character*");
                            string = str4;
                        } catch (NullPointerException e3) {
                            e = e3;
                            string = str4;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str2 = "";
                        } catch (Exception e4) {
                            exc = e4;
                            string = str4;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str2 = "";
                        } catch (Throwable th) {
                            th = th;
                            string = str4;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            str2 = "";
                        }
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e5) {
                            e = e5;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str2 = "";
                            if (string != null) {
                            }
                            if (str2.equals(str3)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(str2);
                            } else {
                                str2 = str3;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this);
                            sb2.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb2.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
                            return currencyIso4217Code;
                        } catch (Exception e6) {
                            exc = e6;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str2 = "";
                            if (string != null) {
                            }
                            if (str2.equals(str3)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(str2);
                            } else {
                                str2 = str3;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this);
                            sb3.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb3.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
                            return currencyIso4217Code;
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            str2 = "";
                            if (string != null) {
                            }
                            if (str2.equals(str3)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(str2);
                            } else {
                                str2 = str3;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this);
                            sb4.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb4.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
                            return currencyIso4217Code;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    str2 = "";
                    if (string != null) {
                    }
                    if (str2.equals(str3)) {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                        jSONObject = new JSONObject(str2);
                    } else {
                        str2 = str3;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this);
                    sb5.append(": preparing data: ");
                    AFg1aSDK.getRevenue(sb5.toString(), jSONObject);
                    this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
                    return currencyIso4217Code;
                }
            } catch (NullPointerException e7) {
                e = e7;
                string = null;
            } catch (Throwable th5) {
                th = th5;
                string = null;
            }
        } catch (NullPointerException e8) {
            e = e8;
            jSONObject = null;
            string = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
            string = null;
        }
    }

    public void component1(AFh1mSDK aFh1mSDK) {
        this.toString.getMediationNetwork(aFh1mSDK);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return this.copy.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public boolean copydefault() {
        return true;
    }

    public void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        this.toString.AFAdRevenueData(aFh1mSDK);
    }

    public void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        this.toString.getMonetizationNetwork(aFh1mSDK.AFAdRevenueData);
    }

    public void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        this.toString.getRevenue(aFh1mSDK);
    }

    public void getRevenue(AFh1mSDK aFh1mSDK) {
        this.toString.getCurrencyIso4217Code(aFh1mSDK);
    }

    public AFf1sSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK, String str) {
        super(aFh1mSDK.AFAdRevenueData(), new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.copy = aFh1mSDK;
        this.copydefault = aFd1zSDK.AFKeystoreWrapper();
        this.component2 = aFd1zSDK.component4();
        this.hashCode = aFd1zSDK.component1();
        this.AFKeystoreWrapper = aFd1zSDK.AFInAppEventParameterName();
        this.equals = aFd1zSDK.AFAdRevenueData();
        this.toString = aFd1zSDK.component3();
        this.AFInAppEventType = aFd1zSDK.afDebugLog();
        for (AFe1pSDK aFe1pSDK : registerClient) {
            if (this.getRevenue == aFe1pSDK) {
                return;
            }
        }
        int i = this.copy.component4;
        AFe1pSDK aFe1pSDK2 = this.getRevenue;
        if (i > 0) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        } else {
            AFe1pSDK aFe1pSDK3 = AFe1pSDK.CONVERSION;
            if (aFe1pSDK2 != aFe1pSDK3) {
                this.AFAdRevenueData.add(aFe1pSDK3);
            }
        }
    }

    public void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        AFe1tSDK aFe1tSDK;
        try {
            try {
                getCurrencyIso4217Code(aFh1mSDK);
                getMediationNetwork(aFh1mSDK);
                getMonetizationNetwork(aFh1mSDK);
                getRevenue(aFh1mSDK);
                component1(aFh1mSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1mSDK.getMediationNetwork()) {
                aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getRevenue(aFh1mSDK.AFAdRevenueData));
                aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getMediationNetwork(aFh1mSDK.AFAdRevenueData));
            }
            if (aFh1mSDK.component1()) {
                aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getRevenue());
            }
            Set<AFe1pSDK> set = this.AFAdRevenueData;
            boolean z = set.contains(AFe1pSDK.LAUNCH) || set.contains(AFe1pSDK.CONVERSION);
            if (areAllFieldsValid() && z) {
                aFh1mSDK.AFAdRevenueData(this.component2.getRevenue("appsFlyerCount", 0));
            }
            if (aFh1mSDK.areAllFieldsValid()) {
                Map<String, Object> mapAFAdRevenueData = AFj1aSDK.AFAdRevenueData(aFh1mSDK.AFAdRevenueData);
                AFe1vSDK aFe1vSDK = this.copydefault;
                String strAFAdRevenueData = aFe1vSDK.AFAdRevenueData();
                String currencyIso4217Code = aFe1vSDK.getCurrencyIso4217Code();
                if (AFe1vSDK.getMediationNetwork()) {
                    aFe1tSDK = AFe1tSDK.DEFAULT;
                } else {
                    aFe1tSDK = AFe1tSDK.API;
                }
                HostMeta hostMeta = new HostMeta(strAFAdRevenueData, currencyIso4217Code, aFe1tSDK);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", hostMeta.name);
                AFe1tSDK aFe1tSDK2 = hostMeta.method;
                if (aFe1tSDK2 != AFe1tSDK.DEFAULT) {
                    jSONObject.put("method", aFe1tSDK2.getCurrencyIso4217Code);
                }
                String str = hostMeta.prefix;
                if (str != null && !StringsKt.empress(str)) {
                    jSONObject.put("prefix", hostMeta.prefix);
                }
                mapAFAdRevenueData.put("host", jSONObject);
            }
            if (this.equals.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
                AFj1aSDK.AFAdRevenueData(aFh1mSDK.AFAdRevenueData).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFInAppEventType.getCurrencyIso4217Code(aFh1mSDK.AFAdRevenueData, aFh1mSDK.AFAdRevenueData());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }
}
