package com.adjust.sdk.network;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustSigner;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageBuilder;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.Util;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.ironsource.B5;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import com.ironsource.Y3;
import d5.u;
import defpackage.e;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityPackageSender implements IActivityPackageSender {
    private String basePath;
    private String clientSdk;
    private int connectionTimeout;
    private Context context;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String subscriptionPath;
    private UrlStrategy urlStrategy;
    private ILogger logger = AdjustFactory.getLogger();
    private ThreadExecutor executor = new SingleThreadCachedScheduler("ActivityPackageSender");
    private UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = AdjustFactory.getHttpsURLConnectionProvider();
    private UtilNetworking.IConnectionOptions connectionOptions = AdjustFactory.getConnectionOptions();

    public ActivityPackageSender(List<String> list, boolean z10, String str, String str2, String str3, String str4, String str5, int i10, Context context) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.connectionTimeout = i10;
        this.context = context;
        this.urlStrategy = new UrlStrategy(AdjustFactory.getBaseUrl(), AdjustFactory.getGdprUrl(), AdjustFactory.getSubscriptionUrl(), AdjustFactory.getPurchaseVerificationUrl(), list, z10);
    }

    private DataOutputStream configConnectionForGET(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        httpsURLConnection.setRequestMethod(C0375hc.f28788a);
        return null;
    }

    private DataOutputStream configConnectionForPOST(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws IOException {
        httpsURLConnection.setRequestMethod(C0375hc.f28789b);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String strGeneratePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (strGeneratePOSTBodyString == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(strGeneratePOSTBodyString);
        return dataOutputStream;
    }

    private String errorMessage(Throwable th2, String str, ActivityPackage activityPackage) {
        return Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th2));
    }

    private static String extractAuthorizationHeader(Map<String, String> map) {
        return map.remove("authorization");
    }

    private static String extractTargetUrl(Map<String, String> map, ActivityKind activityKind, UrlStrategy urlStrategy) {
        String strRemove = map.remove(B5.f25704r);
        return strRemove != null ? strRemove : urlStrategy.targetUrlByActivityKind(activityKind);
    }

    private String generatePOSTBodyString(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb2);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb2);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb2);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private String generateUrlStringForGET(ActivityKind activityKind, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        URL url = new URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug("Making request to url: %s", builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                builder.appendQueryParameter(entry3.getKey(), entry3.getValue());
            }
        }
        return builder.build().toString();
    }

    private String generateUrlStringForPOST(ActivityKind activityKind, String str, Map<String, String> map) {
        String string = Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", string);
        return string;
    }

    private void injectParametersToPOSTStringBuilder(Map<String, String> map, StringBuilder sb2) throws UnsupportedEncodingException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strEncode = URLEncoder.encode(entry.getKey(), "UTF-8");
            String value = entry.getValue();
            u.r(sb2, strEncode, X3.j.f27830b, value != null ? URLEncoder.encode(value, "UTF-8") : "", X3.j.f27832c);
        }
    }

    private void localError(Throwable th2, String str, ResponseData responseData, int i10) {
        String strErrorMessage = errorMessage(th2, str, responseData.activityPackage);
        this.logger.error(strErrorMessage, new Object[0]);
        responseData.message = strErrorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i10);
    }

    private void parseResponse(ResponseData responseData, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e10) {
            this.logger.error(errorMessage(e10, "Failed to parse JSON response", responseData.activityPackage), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        responseData.jsonResponse = jSONObject;
        responseData.message = UtilNetworking.extractJsonString(jSONObject, "message");
        responseData.adid = UtilNetworking.extractJsonString(jSONObject, "adid");
        responseData.timestamp = UtilNetworking.extractJsonString(jSONObject, "timestamp");
        String strExtractJsonString = UtilNetworking.extractJsonString(jSONObject, "tracking_state");
        if (strExtractJsonString != null && strExtractJsonString.equals("opted_out")) {
            responseData.trackingState = TrackingState.OPTED_OUT;
        }
        responseData.askIn = UtilNetworking.extractJsonLong(jSONObject, "ask_in");
        responseData.retryIn = UtilNetworking.extractJsonLong(jSONObject, "retry_in");
        responseData.continueIn = UtilNetworking.extractJsonLong(jSONObject, "continue_in");
        responseData.attribution = Util.attributionFromJson(jSONObject.optJSONObject(Y3.f27960c), Util.getSdkPrefixPlatform(this.clientSdk));
        responseData.resolvedDeeplink = UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
        responseData.controlParams = jSONObject.optJSONObject("control_params");
    }

    private void remoteError(Throwable th2, String str, ResponseData responseData, Integer num) {
        String strQ = e.q(errorMessage(th2, str, responseData.activityPackage), " Will retry later", new StringBuilder());
        this.logger.error(strQ, new Object[0]);
        responseData.message = strQ;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSendWithUrlStrategy(ResponseData responseData) {
        if (responseData.jsonResponse != null) {
            this.logger.debug("Will not retry with current url strategy, already got a valid json response", new Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        }
        boolean zShouldRetryAfterFailure = this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind);
        ILogger iLogger = this.logger;
        if (zShouldRetryAfterFailure) {
            iLogger.error("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        }
        iLogger.error("Failed with current url strategy and it will not retry", new Object[0]);
        return false;
    }

    private Map<String, String> signParameters(ActivityPackage activityPackage, Map<String, String> map) {
        HashMap map2 = new HashMap(activityPackage.getParameters());
        if (map != null) {
            map2.putAll(map);
        }
        HashMap map3 = new HashMap();
        map3.put("client_sdk", activityPackage.getClientSdk());
        map3.put("activity_kind", activityPackage.getActivityKind().toString());
        map3.put(B5.f25704r, this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        JSONObject controlParamsJson = SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            Iterator<String> itKeys = controlParamsJson.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (controlParamsJson.get(next) instanceof String) {
                        map3.put(next, (String) controlParamsJson.get(next));
                    }
                } catch (JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new Object[0]);
                }
            }
        }
        return AdjustSigner.sign(map2, map3, this.context, this.logger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void tryToGetResponse(ResponseData responseData) {
        ActivityPackageSender activityPackageSender;
        ActivityPackageSender activityPackageSender2;
        String strGenerateUrlStringForPOST;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                String strExtractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
                this.logger.verbose("authorizationHeader: %s", strExtractAuthorizationHeader);
                boolean z10 = true;
                boolean z11 = responseData.activityPackage.getActivityKind() == ActivityKind.ATTRIBUTION;
                ActivityPackage activityPackage = responseData.activityPackage;
                try {
                    if (z11) {
                        activityPackageSender2 = this;
                        strGenerateUrlStringForPOST = activityPackageSender2.generateUrlStringForGET(activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                    } else {
                        activityPackageSender2 = this;
                        strGenerateUrlStringForPOST = activityPackageSender2.generateUrlStringForPOST(activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters);
                    }
                    HttpsURLConnection httpsURLConnectionGenerateHttpsURLConnection = activityPackageSender2.httpsURLConnectionProvider.generateHttpsURLConnection(new URL(strGenerateUrlStringForPOST));
                    activityPackageSender2.connectionOptions.applyConnectionOptions(httpsURLConnectionGenerateHttpsURLConnection, activityPackageSender2.clientSdk, activityPackageSender2.connectionTimeout);
                    if (strExtractAuthorizationHeader != null) {
                        httpsURLConnectionGenerateHttpsURLConnection.setRequestProperty("Authorization", strExtractAuthorizationHeader);
                    }
                    DataOutputStream dataOutputStreamConfigConnectionForGET = z11 ? activityPackageSender2.configConnectionForGET(httpsURLConnectionGenerateHttpsURLConnection) : activityPackageSender2.configConnectionForPOST(httpsURLConnectionGenerateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                    Integer connectionResponse = activityPackageSender2.readConnectionResponse(httpsURLConnectionGenerateHttpsURLConnection, responseData);
                    responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && connectionResponse != null && connectionResponse.intValue() == 200;
                    JSONObject jSONObject = responseData.jsonResponse;
                    if (jSONObject != null && responseData.retryIn == null) {
                        z10 = false;
                    }
                    responseData.willRetry = z10;
                    if (jSONObject == null) {
                        responseData.activityPackage.addError(1000);
                    } else if (responseData.retryIn != null) {
                        responseData.activityPackage.addError(1001);
                    }
                    if (dataOutputStreamConfigConnectionForGET != null) {
                        try {
                            dataOutputStreamConfigConnectionForGET.flush();
                            dataOutputStreamConfigConnectionForGET.close();
                        } catch (IOException e10) {
                            activityPackageSender2.logger.error(activityPackageSender2.errorMessage(e10, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                        }
                    }
                } catch (UnsupportedEncodingException e11) {
                    e = e11;
                    activityPackageSender.localError(e, "Failed to encode parameters", responseData, 1002);
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            responseData = responseData;
                        } catch (IOException e12) {
                            String strErrorMessage = activityPackageSender.errorMessage(e12, "Flushing and closing connection output stream", responseData.activityPackage);
                            ILogger iLogger = activityPackageSender.logger;
                            iLogger.error(strErrorMessage, new Object[0]);
                            responseData = iLogger;
                        }
                    }
                } catch (MalformedURLException e13) {
                    e = e13;
                    activityPackageSender.localError(e, "Malformed URL", responseData, 1003);
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            responseData = responseData;
                        } catch (IOException e14) {
                            String strErrorMessage2 = activityPackageSender.errorMessage(e14, "Flushing and closing connection output stream", responseData.activityPackage);
                            ILogger iLogger2 = activityPackageSender.logger;
                            iLogger2.error(strErrorMessage2, new Object[0]);
                            responseData = iLogger2;
                        }
                    }
                } catch (ProtocolException e15) {
                    e = e15;
                    activityPackageSender.localError(e, "Protocol Error", responseData, 1004);
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            responseData = responseData;
                        } catch (IOException e16) {
                            String strErrorMessage3 = activityPackageSender.errorMessage(e16, "Flushing and closing connection output stream", responseData.activityPackage);
                            ILogger iLogger3 = activityPackageSender.logger;
                            iLogger3.error(strErrorMessage3, new Object[0]);
                            responseData = iLogger3;
                        }
                    }
                } catch (SocketTimeoutException e17) {
                    e = e17;
                    activityPackageSender.remoteError(e, "Request timed out", responseData, 1005);
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            responseData = responseData;
                        } catch (IOException e18) {
                            String strErrorMessage4 = activityPackageSender.errorMessage(e18, "Flushing and closing connection output stream", responseData.activityPackage);
                            ILogger iLogger4 = activityPackageSender.logger;
                            iLogger4.error(strErrorMessage4, new Object[0]);
                            responseData = iLogger4;
                        }
                    }
                } catch (SSLHandshakeException e19) {
                    e = e19;
                    activityPackageSender.remoteError(e, "Certificate failed", responseData, 1006);
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            responseData = responseData;
                        } catch (IOException e20) {
                            String strErrorMessage5 = activityPackageSender.errorMessage(e20, "Flushing and closing connection output stream", responseData.activityPackage);
                            ILogger iLogger5 = activityPackageSender.logger;
                            iLogger5.error(strErrorMessage5, new Object[0]);
                            responseData = iLogger5;
                        }
                    }
                } catch (IOException e21) {
                    e = e21;
                    activityPackageSender.remoteError(e, "Request failed", responseData, 1007);
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            responseData = responseData;
                        } catch (IOException e22) {
                            String strErrorMessage6 = activityPackageSender.errorMessage(e22, "Flushing and closing connection output stream", responseData.activityPackage);
                            ILogger iLogger6 = activityPackageSender.logger;
                            iLogger6.error(strErrorMessage6, new Object[0]);
                            responseData = iLogger6;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    activityPackageSender.localError(th, "Sending SDK package", responseData, ErrorCodes.THROWABLE);
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            responseData = responseData;
                        } catch (IOException e23) {
                            String strErrorMessage7 = activityPackageSender.errorMessage(e23, "Flushing and closing connection output stream", responseData.activityPackage);
                            ILogger iLogger7 = activityPackageSender.logger;
                            iLogger7.error(strErrorMessage7, new Object[0]);
                            responseData = iLogger7;
                        }
                    }
                }
            } catch (UnsupportedEncodingException e24) {
                e = e24;
                activityPackageSender = this;
            } catch (MalformedURLException e25) {
                e = e25;
                activityPackageSender = this;
            } catch (ProtocolException e26) {
                e = e26;
                activityPackageSender = this;
            } catch (SocketTimeoutException e27) {
                e = e27;
                activityPackageSender = this;
            } catch (SSLHandshakeException e28) {
                e = e28;
                activityPackageSender = this;
            } catch (IOException e29) {
                e = e29;
                activityPackageSender = this;
            } catch (Throwable th3) {
                th = th3;
                activityPackageSender = this;
            }
        } catch (Throwable th4) {
            if (0 == 0) {
                throw th4;
            }
            try {
                dataOutputStream.flush();
                dataOutputStream.close();
                throw th4;
            } catch (IOException e30) {
                activityPackageSender.logger.error(activityPackageSender.errorMessage(e30, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                throw th4;
            }
        }
    }

    private Map<String, String> updateSendingParameters(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        PackageBuilder.addString(map, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return map;
    }

    private String urlWithExtraPathByActivityKind(ActivityKind activityKind, String str) {
        if (activityKind == ActivityKind.GDPR) {
            if (this.gdprPath != null) {
                StringBuilder sbI = u.i(str);
                sbI.append(this.gdprPath);
                return sbI.toString();
            }
        } else if (activityKind == ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath != null) {
                StringBuilder sbI2 = u.i(str);
                sbI2.append(this.subscriptionPath);
                return sbI2.toString();
            }
        } else if (activityKind == ActivityKind.PURCHASE_VERIFICATION) {
            if (this.purchaseVerificationPath != null) {
                StringBuilder sbI3 = u.i(str);
                sbI3.append(this.purchaseVerificationPath);
                return sbI3.toString();
            }
        } else if (this.basePath != null) {
            StringBuilder sbI4 = u.i(str);
            sbI4.append(this.basePath);
            return sbI4.toString();
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    public Integer readConnectionResponse(HttpsURLConnection httpsURLConnection, ResponseData responseData) {
        int iIntValue;
        ILogger iLogger;
        String str;
        int iIntValue2;
        ILogger iLogger2;
        StringBuilder sb2 = new StringBuilder();
        Integer numValueOf = null;
        try {
            try {
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseCode >= 400 ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                }
            } catch (IOException e10) {
                this.logger.error(errorMessage(e10, "Connecting and reading response", responseData.activityPackage), new Object[0]);
                if (httpsURLConnection != null) {
                    break;
                }
                if (sb2.length() == 0) {
                    this.logger.error("Empty response string buffer", new Object[0]);
                    return numValueOf;
                }
                iIntValue = numValueOf.intValue();
                iLogger = this.logger;
                if (iIntValue == 429) {
                    iLogger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                    return numValueOf;
                }
                String string = sb2.toString();
                iLogger.debug("Response string: %s", string);
                parseResponse(responseData, string);
                if (responseData.controlParams != null) {
                    SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
                }
                str = responseData.message;
                if (str != null) {
                    iIntValue2 = numValueOf.intValue();
                    iLogger2 = this.logger;
                    if (iIntValue2 == 200) {
                        iLogger2.info("Response message: %s", str);
                    } else {
                        iLogger2.error("Response message: %s", str);
                    }
                }
                return numValueOf;
            }
            httpsURLConnection.disconnect();
            if (sb2.length() == 0) {
                this.logger.error("Empty response string buffer", new Object[0]);
                return numValueOf;
            }
            iIntValue = numValueOf.intValue();
            iLogger = this.logger;
            if (iIntValue == 429) {
                iLogger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                return numValueOf;
            }
            String string2 = sb2.toString();
            iLogger.debug("Response string: %s", string2);
            parseResponse(responseData, string2);
            if (responseData.controlParams != null) {
                SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
            }
            str = responseData.message;
            if (str != null) {
                iIntValue2 = numValueOf.intValue();
                iLogger2 = this.logger;
                if (iIntValue2 == 200) {
                    iLogger2.info("Response message: %s", str);
                } else {
                    iLogger2.error("Response message: %s", str);
                }
            }
            return numValueOf;
        } catch (Throwable th2) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th2;
        }
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public void sendActivityPackage(ActivityPackage activityPackage, Map<String, String> map, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new a(this, responseDataCallbackSubscriber, activityPackage, map));
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map) {
        ResponseData responseDataBuildResponseData;
        do {
            Map<String, String> mapUpdateSendingParameters = updateSendingParameters(map);
            responseDataBuildResponseData = ResponseData.buildResponseData(activityPackage, mapUpdateSendingParameters, signParameters(activityPackage, mapUpdateSendingParameters));
            tryToGetResponse(responseDataBuildResponseData);
        } while (shouldRetryToSendWithUrlStrategy(responseDataBuildResponseData));
        return responseDataBuildResponseData;
    }
}
