package com.facebook;

import android.support.v4.media.a;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", "", "Companion", "PagingDirection", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class GraphResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f15950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f15951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f15952c;
    public final FacebookRequestError d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/facebook/GraphResponse$Companion;", "", "", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "NON_JSON_RESPONSE_PROPERTY", "RESPONSE_LOG_TAG", "SUCCESS_KEY", "TAG", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static ArrayList a(AbstractList requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            Intrinsics.f(requests, "requests");
            ArrayList arrayList = new ArrayList(CollectionsKt.n(requests, 10));
            Iterator it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(facebookException)));
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0124  */
        /* JADX WARN: Code duplicated, block: B:72:0x0133  */
        /* JADX WARN: Code duplicated, block: B:76:0x0143  */
        /* JADX WARN: Code duplicated, block: B:78:0x014b  */
        /* JADX WARN: Code duplicated, block: B:79:0x0154  */
        /* JADX WARN: Code duplicated, block: B:81:0x015a  */
        /* JADX WARN: Code duplicated, block: B:88:0x0196  */
        /* JADX WARN: Code duplicated, block: B:90:0x019e  */
        /* JADX WARN: Code duplicated, block: B:92:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:94:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:96:0x01cd  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v24 */
        /* JADX WARN: Type inference failed for: r0v27 */
        /* JADX WARN: Type inference failed for: r0v33 */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v19, types: [com.facebook.AccessTokenManager] */
        /* JADX WARN: Type inference failed for: r3v20, types: [com.facebook.AccessTokenManager] */
        public static GraphResponse b(GraphRequest request, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            FacebookRequestError facebookRequestError;
            ?? r0;
            Object objU;
            AccessToken accessToken;
            int i2;
            AccessTokenManager.Companion companion;
            AccessToken accessTokenB;
            AccessToken accessToken2;
            int iOptInt;
            boolean zOptBoolean;
            boolean z2;
            String str;
            String str2;
            String str3;
            int iOptInt2;
            String str4;
            Object obj3 = obj;
            if (obj3 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj3;
                ?? r1 = "error_code";
                try {
                    if (jSONObject.has("code")) {
                        try {
                            int i3 = jSONObject.getInt("code");
                            Object objU2 = Utility.u("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                            try {
                                if (objU2 == null || !(objU2 instanceof JSONObject)) {
                                    r1 = 1;
                                } else {
                                    try {
                                        if (((JSONObject) objU2).has("error")) {
                                            JSONObject jSONObject2 = (JSONObject) Utility.u("error", null, (JSONObject) objU2);
                                            String strOptString = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                                            String strOptString2 = jSONObject2 != null ? jSONObject2.optString(PglCryptUtils.KEY_MESSAGE, null) : null;
                                            int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                                            int iOptInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                                            String strOptString3 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                                            String strOptString4 = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                                            zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                                            z2 = true;
                                            str2 = strOptString2;
                                            str3 = strOptString;
                                            objU2 = objU2;
                                            iOptInt2 = iOptInt4;
                                            str4 = strOptString3;
                                            str = strOptString4;
                                            iOptInt = iOptInt3;
                                        } else {
                                            if (((JSONObject) objU2).has("error_code") || ((JSONObject) objU2).has("error_msg") || ((JSONObject) objU2).has("error_reason")) {
                                                String strOptString5 = ((JSONObject) objU2).optString("error_reason", null);
                                                String strOptString6 = ((JSONObject) objU2).optString("error_msg", null);
                                                iOptInt = ((JSONObject) objU2).optInt("error_code", -1);
                                                zOptBoolean = false;
                                                z2 = true;
                                                str = null;
                                                str2 = strOptString6;
                                                str3 = strOptString5;
                                                iOptInt2 = ((JSONObject) objU2).optInt("error_subcode", -1);
                                            } else {
                                                z2 = false;
                                                zOptBoolean = false;
                                                iOptInt = -1;
                                                iOptInt2 = -1;
                                                str3 = null;
                                                str2 = null;
                                                str = null;
                                            }
                                            str4 = null;
                                        }
                                        if (z2) {
                                            r0 = 1;
                                            facebookRequestError = new FacebookRequestError(i3, iOptInt, iOptInt2, str3, str2, str, str4, jSONObject, obj2, null, zOptBoolean);
                                        } else {
                                            r1 = 1;
                                        }
                                    } catch (JSONException unused) {
                                        r1 = 1;
                                    }
                                    if (facebookRequestError != null) {
                                        Log.e("com.facebook.GraphResponse", facebookRequestError.toString());
                                        if (facebookRequestError.e0 == 190 && (accessToken = request.f15933a) != null) {
                                            Date date = AccessToken.m0;
                                            if (accessToken.equals(AccessToken.Companion.b())) {
                                                i2 = facebookRequestError.f0;
                                                companion = AccessTokenManager.g;
                                                if (i2 != 493) {
                                                    companion.a().c(null, r0);
                                                } else {
                                                    accessTokenB = AccessToken.Companion.b();
                                                    if (accessTokenB != null && !accessTokenB.b() && (accessToken2 = companion.a().f15879a) != null) {
                                                        companion.a().c(new AccessToken(accessToken2.f0, accessToken2.i0, accessToken2.j0, accessToken2.f15877Y, accessToken2.Z, accessToken2.e0, accessToken2.g0, new Date(), new Date(), accessToken2.k0), r0);
                                                    }
                                                }
                                            }
                                        }
                                        return new GraphResponse(request, httpURLConnection, facebookRequestError);
                                    }
                                    objU = Utility.u("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                                    if (objU instanceof JSONObject) {
                                        return new GraphResponse(request, httpURLConnection, objU.toString(), (JSONObject) objU);
                                    }
                                    if (objU instanceof JSONArray) {
                                        String rawResponse = objU.toString();
                                        JSONArray graphObjects = (JSONArray) objU;
                                        Intrinsics.f(request, "request");
                                        Intrinsics.f(rawResponse, "rawResponse");
                                        Intrinsics.f(graphObjects, "graphObjects");
                                        return new GraphResponse(request, httpURLConnection, null, graphObjects, null);
                                    }
                                    obj3 = JSONObject.NULL;
                                    Intrinsics.e(obj3, "JSONObject.NULL");
                                }
                                if (200 > i3 || 299 < i3) {
                                    if (jSONObject.has("body")) {
                                    }
                                    facebookRequestError = new FacebookRequestError(i3, -1, -1, null, null, null, null, jSONObject, obj2, null, false);
                                    r0 = r1;
                                }
                            } catch (JSONException unused2) {
                            }
                        } catch (JSONException unused3) {
                            r1 = 1;
                        }
                        if (facebookRequestError != null) {
                            Log.e("com.facebook.GraphResponse", facebookRequestError.toString());
                            if (facebookRequestError.e0 == 190) {
                                Date date2 = AccessToken.m0;
                                if (accessToken.equals(AccessToken.Companion.b())) {
                                    i2 = facebookRequestError.f0;
                                    companion = AccessTokenManager.g;
                                    if (i2 != 493) {
                                        companion.a().c(null, r0);
                                    } else {
                                        accessTokenB = AccessToken.Companion.b();
                                        if (accessTokenB != null) {
                                            companion.a().c(new AccessToken(accessToken2.f0, accessToken2.i0, accessToken2.j0, accessToken2.f15877Y, accessToken2.Z, accessToken2.e0, accessToken2.g0, new Date(), new Date(), accessToken2.k0), r0);
                                        }
                                    }
                                }
                            }
                            return new GraphResponse(request, httpURLConnection, facebookRequestError);
                        }
                        objU = Utility.u("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                        if (objU instanceof JSONObject) {
                            return new GraphResponse(request, httpURLConnection, objU.toString(), (JSONObject) objU);
                        }
                        if (objU instanceof JSONArray) {
                            String rawResponse2 = objU.toString();
                            JSONArray graphObjects2 = (JSONArray) objU;
                            Intrinsics.f(request, "request");
                            Intrinsics.f(rawResponse2, "rawResponse");
                            Intrinsics.f(graphObjects2, "graphObjects");
                            return new GraphResponse(request, httpURLConnection, null, graphObjects2, null);
                        }
                        obj3 = JSONObject.NULL;
                        Intrinsics.e(obj3, "JSONObject.NULL");
                    } else {
                        r1 = 1;
                    }
                } catch (JSONException unused4) {
                }
                facebookRequestError = null;
                r0 = r1;
                if (facebookRequestError != null) {
                    Log.e("com.facebook.GraphResponse", facebookRequestError.toString());
                    if (facebookRequestError.e0 == 190) {
                        Date date3 = AccessToken.m0;
                        if (accessToken.equals(AccessToken.Companion.b())) {
                            i2 = facebookRequestError.f0;
                            companion = AccessTokenManager.g;
                            if (i2 != 493) {
                                companion.a().c(null, r0);
                            } else {
                                accessTokenB = AccessToken.Companion.b();
                                if (accessTokenB != null) {
                                    companion.a().c(new AccessToken(accessToken2.f0, accessToken2.i0, accessToken2.j0, accessToken2.f15877Y, accessToken2.Z, accessToken2.e0, accessToken2.g0, new Date(), new Date(), accessToken2.k0), r0);
                                }
                            }
                        }
                    }
                    return new GraphResponse(request, httpURLConnection, facebookRequestError);
                }
                objU = Utility.u("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                if (objU instanceof JSONObject) {
                    return new GraphResponse(request, httpURLConnection, objU.toString(), (JSONObject) objU);
                }
                if (objU instanceof JSONArray) {
                    String rawResponse3 = objU.toString();
                    JSONArray graphObjects3 = (JSONArray) objU;
                    Intrinsics.f(request, "request");
                    Intrinsics.f(rawResponse3, "rawResponse");
                    Intrinsics.f(graphObjects3, "graphObjects");
                    return new GraphResponse(request, httpURLConnection, null, graphObjects3, null);
                }
                obj3 = JSONObject.NULL;
                Intrinsics.e(obj3, "JSONObject.NULL");
            }
            if (obj3 == JSONObject.NULL) {
                return new GraphResponse(request, httpURLConnection, obj3.toString(), null);
            }
            throw new FacebookException("Got unexpected object type in response, class: ".concat(obj3.getClass().getSimpleName()));
        }

        public static ArrayList c(InputStream inputStream, HttpURLConnection httpURLConnection, GraphRequestBatch requests) throws JSONException {
            Object obj;
            Intrinsics.f(requests, "requests");
            String strP = Utility.P(inputStream);
            HashMap map = Logger.d;
            FacebookSdk.j(LoggingBehavior.Z);
            Object resultObject = new JSONTokener(strP).nextValue();
            Intrinsics.e(resultObject, "resultObject");
            int size = requests.Z.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = (GraphRequest) requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", resultObject);
                    jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e2) {
                    arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(e2)));
                    obj = resultObject;
                } catch (JSONException e3) {
                    arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(e3)));
                    obj = resultObject;
                }
            } else {
                obj = resultObject;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        GraphRequest graphRequest2 = (GraphRequest) requests.get(i2);
                        try {
                            Object obj2 = ((JSONArray) obj).get(i2);
                            Intrinsics.e(obj2, "obj");
                            arrayList.add(b(graphRequest2, httpURLConnection, obj2, resultObject));
                        } catch (FacebookException e4) {
                            arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(e4)));
                        } catch (JSONException e5) {
                            arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(e5)));
                        }
                    }
                    HashMap map2 = Logger.d;
                    FacebookSdk.j(LoggingBehavior.X);
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphResponse$PagingDirection;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class PagingDirection {
        public static final /* synthetic */ PagingDirection[] X = {new PagingDirection("NEXT", 0), new PagingDirection("PREVIOUS", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        PagingDirection EF5;

        public static PagingDirection valueOf(String str) {
            return (PagingDirection) Enum.valueOf(PagingDirection.class, str);
        }

        public static PagingDirection[] values() {
            return (PagingDirection[]) X.clone();
        }
    }

    public GraphResponse(GraphRequest request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.f(request, "request");
        this.f15951b = httpURLConnection;
        this.f15952c = jSONObject;
        this.d = facebookRequestError;
        this.f15950a = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f15951b;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbY = a.y("{Response:  responseCode: ", str, ", graphObject: ");
        sbY.append(this.f15952c);
        sbY.append(", error: ");
        sbY.append(this.d);
        sbY.append("}");
        String string = sbY.toString();
        Intrinsics.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        Intrinsics.f(request, "request");
        Intrinsics.f(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest request, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(request, httpURLConnection, null, null, facebookRequestError);
        Intrinsics.f(request, "request");
    }
}
