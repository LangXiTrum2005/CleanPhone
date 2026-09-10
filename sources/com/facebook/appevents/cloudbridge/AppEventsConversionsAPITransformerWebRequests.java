package com.facebook.appevents.cloudbridge;

import an.h;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.B5;
import com.ironsource.C0375hc;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n;
import l7.b0;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.e0;
import q7.x;
import qk.i0;
import wi.d;
import wj.f;
import wj.q;
import xj.g0;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001HB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001b\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00120\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\b2\u001a\u0010\u001c\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJi\u0010)\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\b\b\u0002\u0010$\u001a\u00020\u00152\u001e\u0010&\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010%H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010-R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u001500j\b\u0012\u0004\u0012\u00020\u0015`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001500j\b\u0012\u0004\u0012\u00020\u0015`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\"\u00106\u001a\u0002058\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R4\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00120<8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u001eR\u0014\u0010B\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010-R\"\u0010C\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests;", "", "<init>", "()V", "", "datasetID", "url", "accessKey", "Lwj/r;", "configure", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCredentials", "()Ljava/lang/String;", "Ll7/b0;", "request", "transformGraphRequestAndSendToCAPIGEndPoint", "(Ll7/b0;)V", "", "", "transformAppEventRequestForCAPIG", "(Ll7/b0;)Ljava/util/List;", "", "responseCode", "processedEvents", "maxRetryCount", "handleError$facebook_core_release", "(Ljava/lang/Integer;Ljava/util/List;I)V", "handleError", "events", "appendEvents$facebook_core_release", "(Ljava/util/List;)V", "appendEvents", "urlStr", "requestMethod", "jsonBodyStr", "requestProperties", "timeOutInterval", "Lkotlin/Function2;", "requestCallback", "makeHttpRequest$facebook_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjk/c;)V", "makeHttpRequest", "TAG", "Ljava/lang/String;", "MAX_CACHED_TRANSFORMED_EVENTS", "I", "MAX_PROCESSED_TRANSFORMED_EVENTS", "TIMEOUT_INTERVAL", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "ACCEPTABLE_HTTP_RESPONSE", "Ljava/util/HashSet;", "RETRY_EVENTS_HTTP_RESPONSE", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "credentials", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "getCredentials$facebook_core_release", "()Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "setCredentials$facebook_core_release", "(Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;)V", "", "transformedEvents", "Ljava/util/List;", "getTransformedEvents$facebook_core_release", "()Ljava/util/List;", "setTransformedEvents$facebook_core_release", "MAX_RETRY_COUNT", "currentRetryCount", "getCurrentRetryCount$facebook_core_release", "()I", "setCurrentRetryCount$facebook_core_release", "(I)V", "CloudBridgeCredentials", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventsConversionsAPITransformerWebRequests {
    public static final int MAX_CACHED_TRANSFORMED_EVENTS = 1000;
    private static final int MAX_PROCESSED_TRANSFORMED_EVENTS = 10;
    public static final int MAX_RETRY_COUNT = 5;
    private static final String TAG = "CAPITransformerWebRequests";
    private static final int TIMEOUT_INTERVAL = 60000;
    public static CloudBridgeCredentials credentials;
    private static int currentRetryCount;
    public static List<Map<String, Object>> transformedEvents;
    public static final AppEventsConversionsAPITransformerWebRequests INSTANCE = new AppEventsConversionsAPITransformerWebRequests();
    private static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = g0.t0(200, Integer.valueOf(InterfaceC0435l1.c.b.f29097c));
    private static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = g0.t0(503, 504, Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS));

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "", "datasetID", "", "cloudBridgeURL", "accessKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessKey", "()Ljava/lang/String;", "getCloudBridgeURL", "getDatasetID", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class CloudBridgeCredentials {
        private final String accessKey;
        private final String cloudBridgeURL;
        private final String datasetID;

        public CloudBridgeCredentials(String datasetID, String cloudBridgeURL, String accessKey) {
            n.f(datasetID, "datasetID");
            n.f(cloudBridgeURL, "cloudBridgeURL");
            n.f(accessKey, "accessKey");
            this.datasetID = datasetID;
            this.cloudBridgeURL = cloudBridgeURL;
            this.accessKey = accessKey;
        }

        public static /* synthetic */ CloudBridgeCredentials copy$default(CloudBridgeCredentials cloudBridgeCredentials, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cloudBridgeCredentials.datasetID;
            }
            if ((i10 & 2) != 0) {
                str2 = cloudBridgeCredentials.cloudBridgeURL;
            }
            if ((i10 & 4) != 0) {
                str3 = cloudBridgeCredentials.accessKey;
            }
            return cloudBridgeCredentials.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDatasetID() {
            return this.datasetID;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAccessKey() {
            return this.accessKey;
        }

        public final CloudBridgeCredentials copy(String datasetID, String cloudBridgeURL, String accessKey) {
            n.f(datasetID, "datasetID");
            n.f(cloudBridgeURL, "cloudBridgeURL");
            n.f(accessKey, "accessKey");
            return new CloudBridgeCredentials(datasetID, cloudBridgeURL, accessKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloudBridgeCredentials)) {
                return false;
            }
            CloudBridgeCredentials cloudBridgeCredentials = (CloudBridgeCredentials) other;
            return n.a(this.datasetID, cloudBridgeCredentials.datasetID) && n.a(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && n.a(this.accessKey, cloudBridgeCredentials.accessKey);
        }

        public final String getAccessKey() {
            return this.accessKey;
        }

        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        public final String getDatasetID() {
            return this.datasetID;
        }

        public int hashCode() {
            return this.accessKey.hashCode() + u.e(this.datasetID.hashCode() * 31, 31, this.cloudBridgeURL);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb2.append(this.datasetID);
            sb2.append(", cloudBridgeURL=");
            sb2.append(this.cloudBridgeURL);
            sb2.append(", accessKey=");
            return d.k(sb2, this.accessKey, ')');
        }
    }

    private AppEventsConversionsAPITransformerWebRequests() {
    }

    public static final void configure(String datasetID, String url, String accessKey) {
        n.f(datasetID, "datasetID");
        n.f(url, "url");
        n.f(accessKey, "accessKey");
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
        appEventsConversionsAPITransformerWebRequests.setCredentials$facebook_core_release(new CloudBridgeCredentials(datasetID, url, accessKey));
        appEventsConversionsAPITransformerWebRequests.setTransformedEvents$facebook_core_release(new ArrayList());
    }

    public static final String getCredentials() {
        try {
            CloudBridgeCredentials credentials$facebook_core_release = INSTANCE.getCredentials$facebook_core_release();
            if (credentials$facebook_core_release != null) {
                return credentials$facebook_core_release.toString();
            }
            return null;
        } catch (q unused) {
            return null;
        }
    }

    public static /* synthetic */ void handleError$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, Integer num, List list, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 5;
        }
        appEventsConversionsAPITransformerWebRequests.handleError$facebook_core_release(num, list, i10);
    }

    public static /* synthetic */ void makeHttpRequest$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, String str, String str2, String str3, Map map, int i10, c cVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 60000;
        }
        appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, str2, str3, map, i10, cVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final List<Map<String, Object>> transformAppEventRequestForCAPIG(b0 request) {
        JSONObject jSONObject = request.f45089c;
        if (jSONObject == null) {
            return null;
        }
        LinkedHashMap linkedHashMapY = xj.b0.Y(e0.g(jSONObject));
        String str = request.f45091e;
        n.d(str, "null cannot be cast to non-null type kotlin.Any");
        linkedHashMapY.put("custom_events", str);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : linkedHashMapY.keySet()) {
            sb2.append(str2);
            sb2.append(" : ");
            sb2.append(linkedHashMapY.get(str2));
            sb2.append(System.getProperty("line.separator"));
        }
        x.f48792c.t(l7.g0.f45136d, TAG, "\nGraph Request data: \n\n%s \n\n", sb2);
        return AppEventsConversionsAPITransformer.INSTANCE.conversionsAPICompatibleEvent$facebook_core_release(linkedHashMapY);
    }

    public static final void transformGraphRequestAndSendToCAPIGEndPoint(b0 request) {
        n.f(request, "request");
        try {
            s.d().execute(new androidx.fragment.app.n(request, 16));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transformGraphRequestAndSendToCAPIGEndPoint$lambda$0(b0 request) {
        n.f(request, "$request");
        String str = request.f45088b;
        List listI0 = str != null ? h.I0(str, new String[]{"/"}, 0, 6) : null;
        l7.g0 g0Var = l7.g0.f45137e;
        if (listI0 == null || listI0.size() != 2) {
            x.f48792c.t(g0Var, TAG, "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
            String str2 = appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getDatasetID() + "/events";
            List<Map<String, Object>> listTransformAppEventRequestForCAPIG = appEventsConversionsAPITransformerWebRequests.transformAppEventRequestForCAPIG(request);
            if (listTransformAppEventRequestForCAPIG == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.appendEvents$facebook_core_release(listTransformAppEventRequestForCAPIG);
            int iMin = Math.min(appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().size(), 10);
            List<Map<String, Object>> transformedEvents$facebook_core_release = appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release();
            pk.c cVar = new pk.c(0, iMin - 1, 1);
            n.f(transformedEvents$facebook_core_release, "<this>");
            List listN0 = cVar.isEmpty() ? v.f53866a : xj.n.N0(transformedEvents$facebook_core_release.subList(0, cVar.f48394b + 1));
            appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listN0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getAccessKey());
            appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str2, C0375hc.f28789b, new JSONObject(linkedHashMap).toString(), xj.b0.P(new f("Content-Type", B5.M)), 60000, new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(listN0));
        } catch (q e10) {
            x.f48792c.t(g0Var, TAG, "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void appendEvents$facebook_core_release(List<? extends Map<String, ? extends Object>> events) {
        if (events != null) {
            getTransformedEvents$facebook_core_release().addAll(events);
        }
        int iMax = Math.max(0, getTransformedEvents$facebook_core_release().size() - 1000);
        if (iMax > 0) {
            setTransformedEvents$facebook_core_release(h0.a(xj.n.k0(getTransformedEvents$facebook_core_release(), iMax)));
        }
    }

    public final CloudBridgeCredentials getCredentials$facebook_core_release() {
        CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        n.l("credentials");
        throw null;
    }

    public final int getCurrentRetryCount$facebook_core_release() {
        return currentRetryCount;
    }

    public final List<Map<String, Object>> getTransformedEvents$facebook_core_release() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        n.l("transformedEvents");
        throw null;
    }

    public final void handleError$facebook_core_release(Integer responseCode, List<? extends Map<String, ? extends Object>> processedEvents, int maxRetryCount) {
        n.f(processedEvents, "processedEvents");
        if (xj.n.i0(RETRY_EVENTS_HTTP_RESPONSE, responseCode)) {
            if (currentRetryCount >= maxRetryCount) {
                getTransformedEvents$facebook_core_release().clear();
                currentRetryCount = 0;
            } else {
                getTransformedEvents$facebook_core_release().addAll(0, processedEvents);
                currentRetryCount++;
            }
        }
    }

    public final void makeHttpRequest$facebook_core_release(String urlStr, String requestMethod, String jsonBodyStr, Map<String, String> requestProperties, int timeOutInterval, c requestCallback) {
        Set<String> setKeySet;
        l7.g0 g0Var = l7.g0.f45136d;
        n.f(urlStr, "urlStr");
        n.f(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(urlStr).openConnection();
            n.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (requestProperties != null && (setKeySet = requestProperties.keySet()) != null) {
                for (String str : setKeySet) {
                    httpURLConnection.setRequestProperty(str, requestProperties.get(str));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals(C0375hc.f28789b) || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(timeOutInterval);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
            bufferedWriter.write(jsonBodyStr);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            i0.j(bufferedReader, th2);
                            throw th3;
                        }
                    }
                }
                bufferedReader.close();
            }
            String string = sb2.toString();
            n.e(string, "connResponseSB.toString()");
            x.f48792c.t(g0Var, TAG, "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (requestCallback != null) {
                requestCallback.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e10) {
            x.f48792c.t(g0Var, TAG, "Connection failed, retrying: \n%s", e10.toString());
            if (requestCallback != null) {
                requestCallback.invoke(null, 503);
            }
        } catch (IOException e11) {
            x.f48792c.t(l7.g0.f45137e, TAG, "Send to server failed: \n%s", e11.toString());
        }
    }

    public final void setCredentials$facebook_core_release(CloudBridgeCredentials cloudBridgeCredentials) {
        n.f(cloudBridgeCredentials, "<set-?>");
        credentials = cloudBridgeCredentials;
    }

    public final void setCurrentRetryCount$facebook_core_release(int i10) {
        currentRetryCount = i10;
    }

    public final void setTransformedEvents$facebook_core_release(List<Map<String, Object>> list) {
        n.f(list, "<set-?>");
        transformedEvents = list;
    }
}
