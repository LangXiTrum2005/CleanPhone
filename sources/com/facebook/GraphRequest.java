package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.applovin.impl.Z;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.smartdigimkt.o0.b;
import com.smartdigimkt.x.d;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/GraphRequest;", "", "Attachment", "Callback", "Companion", "GraphJSONArrayCallback", "GraphJSONObjectCallback", "KeyValueSerializer", "OnProgressCallback", "ParcelableResourceWithMimeType", "Serializer", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class GraphRequest {
    public static final String j;
    public static final Pattern k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile String f15932l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessToken f15933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f15935c;
    public Bundle d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15936e;
    public Callback f;
    public final HttpMethod g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15938i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequest$Attachment;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Attachment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GraphRequest f15939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f15940b;

        public Attachment(GraphRequest graphRequest, Object obj) {
            this.f15939a = graphRequest;
            this.f15940b = obj;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequest$Callback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void a(GraphResponse graphResponse);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010 \u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0018\u0010-\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u001c\u00100\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/facebook/GraphRequest$Companion;", "", "", "ACCEPT_LANGUAGE_HEADER", "Ljava/lang/String;", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "", "MAXIMUM_BATCH_SIZE", "I", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", "SEARCH", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "versionPattern", "Ljava/util/regex/Pattern;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final String a(Object obj) {
            String str = GraphRequest.j;
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            Intrinsics.e(str2, "iso8601DateFormat.format(value)");
            return str2;
        }

        public static HttpURLConnection b(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            if (GraphRequest.f15932l == null) {
                GraphRequest.f15932l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "12.1.0"}, 2));
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, GraphRequest.f15932l);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        public static ArrayList c(GraphRequestBatch requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionN;
            ArrayList arrayListD;
            Intrinsics.f(requests, "requests");
            Validate.e(requests);
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionN = n(requests);
                exc = null;
            } catch (Exception e2) {
                exc = e2;
                httpURLConnectionN = null;
            } catch (Throwable th) {
                th = th;
                Utility.l(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionN != null) {
                    arrayListD = d(requests, httpURLConnectionN);
                } else {
                    ArrayList arrayListA = GraphResponse.Companion.a(requests.Z, null, new FacebookException(exc));
                    k(requests, arrayListA);
                    arrayListD = arrayListA;
                }
                Utility.l(httpURLConnectionN);
                return arrayListD;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionN;
                Utility.l(httpURLConnection);
                throw th;
            }
        }

        public static ArrayList d(GraphRequestBatch requests, HttpURLConnection connection) {
            ArrayList arrayListA;
            Intrinsics.f(connection, "connection");
            Intrinsics.f(requests, "requests");
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            InputStream errorStream = null;
            try {
                try {
                    try {
                        if (!FacebookSdk.i()) {
                            Log.e("com.facebook.GraphResponse", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        }
                        errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                        arrayListA = GraphResponse.Companion.c(errorStream, connection, requests);
                        Utility.e(errorStream);
                        Utility.l(connection);
                        int size = requests.Z.size();
                        if (size != arrayListA.size()) {
                            throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListA.size()), Integer.valueOf(size)}, 2)));
                        }
                        k(requests, arrayListA);
                        final AccessTokenManager accessTokenManagerA = AccessTokenManager.g.a();
                        AccessToken accessToken = accessTokenManagerA.f15879a;
                        if (accessToken != null) {
                            long jF = Z.f();
                            if (accessToken.g0.X && jF - accessTokenManagerA.f15881c.getTime() > 3600000 && jF - accessToken.h0.getTime() > 86400000) {
                                if (Intrinsics.a(Looper.getMainLooper(), Looper.myLooper())) {
                                    accessTokenManagerA.a();
                                } else {
                                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.AccessTokenManager$refreshCurrentAccessToken$1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (CrashShieldHandler.b(this)) {
                                                return;
                                            }
                                            try {
                                                accessTokenManagerA.a();
                                            } catch (Throwable th) {
                                                CrashShieldHandler.a(this, th);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        return arrayListA;
                    } catch (Exception e2) {
                        HashMap map = Logger.d;
                        FacebookSdk.j(loggingBehavior);
                        arrayListA = GraphResponse.Companion.a(requests, connection, new FacebookException(e2));
                    }
                } catch (FacebookException e3) {
                    HashMap map2 = Logger.d;
                    FacebookSdk.j(loggingBehavior);
                    arrayListA = GraphResponse.Companion.a(requests, connection, e3);
                }
            } catch (Throwable th) {
                Utility.e(null);
                throw th;
            }
        }

        public static boolean e(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        public static boolean f(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        public static GraphRequest g(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.f15953Y, callback, 32);
            graphRequest.f15935c = jSONObject;
            return graphRequest;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002a  */
        public static void h(JSONObject jSONObject, String str, KeyValueSerializer keyValueSerializer) {
            String strGroup;
            boolean z2;
            Matcher matcher = GraphRequest.k.matcher(str);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                Intrinsics.e(strGroup, "matcher.group(1)");
            } else {
                strGroup = str;
            }
            if (StringsKt.M(strGroup, "me/", false) || StringsKt.M(strGroup, "/me/", false)) {
                int iV = StringsKt.v(str, ":", 0, false, 6);
                int iV2 = StringsKt.v(str, "?", 0, false, 6);
                if (iV <= 3 || (iV2 != -1 && iV >= iV2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = jSONObject.opt(key);
                boolean z3 = z2 && StringsKt.r(key, d.c.k, true);
                Intrinsics.e(key, "key");
                Intrinsics.e(value, "value");
                i(key, value, keyValueSerializer, z3);
            }
        }

        public static void i(String str, Object obj, KeyValueSerializer keyValueSerializer, boolean z2) {
            Class<?> cls = obj.getClass();
            if (!JSONObject.class.isAssignableFrom(cls)) {
                if (JSONArray.class.isAssignableFrom(cls)) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                        Object objOpt = jSONArray.opt(i2);
                        Intrinsics.e(objOpt, "jsonArray.opt(i)");
                        i(str2, objOpt, keyValueSerializer, z2);
                    }
                    return;
                }
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                    keyValueSerializer.a(str, obj.toString());
                    return;
                } else {
                    if (Date.class.isAssignableFrom(cls)) {
                        String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                        Intrinsics.e(str3, "iso8601DateFormat.format(date)");
                        keyValueSerializer.a(str, str3);
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (z2) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String str4 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                    Object objOpt2 = jSONObject.opt(next);
                    Intrinsics.e(objOpt2, "jsonObject.opt(propertyName)");
                    i(str4, objOpt2, keyValueSerializer, z2);
                }
                return;
            }
            if (jSONObject.has("id")) {
                String strOptString = jSONObject.optString("id");
                Intrinsics.e(strOptString, "jsonObject.optString(\"id\")");
                i(str, strOptString, keyValueSerializer, z2);
            } else if (jSONObject.has("url")) {
                String strOptString2 = jSONObject.optString("url");
                Intrinsics.e(strOptString2, "jsonObject.optString(\"url\")");
                i(str, strOptString2, keyValueSerializer, z2);
            } else if (jSONObject.has("fbsdk:create_object")) {
                String string = jSONObject.toString();
                Intrinsics.e(string, "jsonObject.toString()");
                i(str, string, keyValueSerializer, z2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void j(GraphRequestBatch graphRequestBatch, Logger logger, int i2, URL url, OutputStream outputStream, boolean z2) throws Throwable {
            String strC;
            Serializer serializer = new Serializer(outputStream, logger, z2);
            boolean z3 = true;
            if (i2 == 1) {
                GraphRequest graphRequest = (GraphRequest) graphRequestBatch.Z.get(0);
                HashMap map = new HashMap();
                for (String key : graphRequest.d.keySet()) {
                    Object obj = graphRequest.d.get(key);
                    if (e(obj)) {
                        Intrinsics.e(key, "key");
                        map.put(key, new Attachment(graphRequest, obj));
                    }
                }
                if (logger != null) {
                    logger.b();
                }
                Bundle bundle = graphRequest.d;
                for (String key2 : bundle.keySet()) {
                    Object obj2 = bundle.get(key2);
                    if (f(obj2)) {
                        Intrinsics.e(key2, "key");
                        serializer.g(key2, obj2, graphRequest);
                    }
                }
                if (logger != null) {
                    logger.b();
                }
                l(map, serializer);
                JSONObject jSONObject = graphRequest.f15935c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    Intrinsics.e(path, "url.path");
                    h(jSONObject, path, serializer);
                    return;
                }
                return;
            }
            graphRequestBatch.getClass();
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (true) {
                if (it.hasNext()) {
                    AccessToken accessToken = it.next().f15933a;
                    if (accessToken != null) {
                        strC = accessToken.i0;
                        break;
                    }
                } else {
                    String str = GraphRequest.j;
                    strC = FacebookSdk.c();
                    break;
                }
            }
            if (strC.length() == 0) {
                throw new FacebookException("App ID was not specified at the request or Settings.");
            }
            serializer.a("batch_app_id", strC);
            HashMap map2 = new HashMap();
            JSONArray jSONArray = new JSONArray();
            for (GraphRequest graphRequest2 : graphRequestBatch) {
                String str2 = GraphRequest.j;
                graphRequest2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                Collection collection = ServerProtocol.f16370a;
                String strH = graphRequest2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.g()}, z3 ? 1 : 0)));
                graphRequest2.a();
                Uri uri = Uri.parse(graphRequest2.b(strH, z3));
                Intrinsics.e(uri, "uri");
                String str3 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
                jSONObject2.put("relative_url", str3);
                jSONObject2.put("method", graphRequest2.g);
                AccessToken accessToken2 = graphRequest2.f15933a;
                if (accessToken2 != null) {
                    Logger.f16351e.c(accessToken2.f0);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = graphRequest2.d.keySet().iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String str4 = GraphRequest.j;
                    if (!zHasNext) {
                        break;
                    }
                    Object obj3 = graphRequest2.d.get(it2.next());
                    if (e(obj3)) {
                        String str5 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{d9.h.f24719b, Integer.valueOf(map2.size())}, 2));
                        arrayList.add(str5);
                        map2.put(str5, new Attachment(graphRequest2, obj3));
                    }
                    z3 = z3;
                }
                boolean z4 = z3;
                if (!arrayList.isEmpty()) {
                    jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                }
                JSONObject jSONObject3 = graphRequest2.f15935c;
                if (jSONObject3 != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    h(jSONObject3, str3, new KeyValueSerializer() { // from class: com.facebook.GraphRequest$serializeToBatch$1
                        @Override // com.facebook.GraphRequest.KeyValueSerializer
                        public final void a(String str6, String value) {
                            Intrinsics.f(value, "value");
                            arrayList2.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str6, URLEncoder.encode(value, "UTF-8")}, 2)));
                        }
                    });
                    jSONObject2.put("body", TextUtils.join(d9.i.f24749c, arrayList2));
                }
                jSONArray.put(jSONObject2);
                z3 = z4 ? 1 : 0;
            }
            byte b2 = z3 ? 1 : 0;
            OutputStream outputStream2 = serializer.f15945c;
            if (outputStream2 instanceof RequestOutputStream) {
                RequestOutputStream requestOutputStream = (RequestOutputStream) outputStream2;
                serializer.c("batch", null, null);
                serializer.b(d9.i.d, new Object[0]);
                int i3 = 0;
                for (GraphRequest graphRequest3 : graphRequestBatch) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                    requestOutputStream.a(graphRequest3);
                    if (i3 > 0) {
                        serializer.b(",%s", jSONObject4.toString());
                    } else {
                        serializer.b("%s", jSONObject4.toString());
                    }
                    i3++;
                }
                serializer.b(d9.i.f24752e, new Object[0]);
                Logger logger2 = serializer.d;
                if (logger2 != null) {
                    String strConcat = "    ".concat("batch");
                    String string = jSONArray.toString();
                    Intrinsics.e(string, "requestJsonArray.toString()");
                    logger2.a(string, strConcat);
                }
            } else {
                String string2 = jSONArray.toString();
                Intrinsics.e(string2, "requestJsonArray.toString()");
                serializer.a("batch", string2);
            }
            if (logger != null) {
                logger.b();
            }
            l(map2, serializer);
        }

        public static void k(final GraphRequestBatch requests, ArrayList arrayList) {
            Intrinsics.f(requests, "requests");
            int size = requests.Z.size();
            final ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                GraphRequest graphRequest = (GraphRequest) requests.Z.get(i2);
                if (graphRequest.f != null) {
                    arrayList2.add(new Pair(graphRequest.f, arrayList.get(i2)));
                }
            }
            if (arrayList2.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.GraphRequest$Companion$runCallbacks$runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequestBatch graphRequestBatch = requests;
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            for (Pair pair : arrayList2) {
                                GraphRequest.Callback callback = (GraphRequest.Callback) pair.first;
                                Object obj = pair.second;
                                Intrinsics.e(obj, "pair.second");
                                callback.a((GraphResponse) obj);
                            }
                            Iterator it = graphRequestBatch.e0.iterator();
                            while (it.hasNext()) {
                                ((GraphRequestBatch.Callback) it.next()).a(graphRequestBatch);
                            }
                        } catch (Throwable th) {
                            CrashShieldHandler.a(this, th);
                        }
                    }
                };
                Handler handler = requests.X;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        public static void l(HashMap map, Serializer serializer) throws Throwable {
            for (Map.Entry entry : map.entrySet()) {
                String str = GraphRequest.j;
                if (e(((Attachment) entry.getValue()).f15940b)) {
                    serializer.g((String) entry.getKey(), ((Attachment) entry.getValue()).f15940b, ((Attachment) entry.getValue()).f15939a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:68:0x0175  */
        /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
        public static void m(GraphRequestBatch requests, HttpURLConnection httpURLConnection) throws Throwable {
            boolean z2;
            Throwable th;
            FilterOutputStream filterOutputStream;
            FilterOutputStream progressOutputStream;
            URL url;
            ProgressNoopOutputStream progressNoopOutputStream;
            Intrinsics.f(requests, "requests");
            Logger logger = new Logger();
            int size = requests.Z.size();
            Iterator<GraphRequest> it = requests.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                GraphRequest next = it.next();
                Iterator<String> it2 = next.d.keySet().iterator();
                while (it2.hasNext()) {
                    if (e(next.d.get(it2.next()))) {
                        z2 = false;
                        break loop0;
                    }
                }
            }
            FilterOutputStream filterOutputStream2 = null;
            HttpMethod httpMethod = size == 1 ? ((GraphRequest) requests.Z.get(0)).g : null;
            HttpMethod httpMethod2 = HttpMethod.f15953Y;
            if (httpMethod == null) {
                httpMethod = httpMethod2;
            }
            httpURLConnection.setRequestMethod(httpMethod.name());
            if (z2) {
                httpURLConnection.setRequestProperty("Content-Type", b.f37293e);
                httpURLConnection.setRequestProperty("Content-Encoding", b.d);
            } else {
                httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.j}, 1)));
            }
            boolean z3 = z2;
            URL url2 = httpURLConnection.getURL();
            logger.b();
            logger.a(requests.f15949Y, "Id");
            Intrinsics.e(url2, "url");
            logger.a(url2, "URL");
            String requestMethod = httpURLConnection.getRequestMethod();
            Intrinsics.e(requestMethod, "connection.requestMethod");
            logger.a(requestMethod, "Method");
            String requestProperty = httpURLConnection.getRequestProperty(Command.HTTP_HEADER_USER_AGENT);
            Intrinsics.e(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            logger.a(requestProperty, Command.HTTP_HEADER_USER_AGENT);
            String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            Intrinsics.e(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            logger.a(requestProperty2, "Content-Type");
            httpURLConnection.setConnectTimeout(0);
            httpURLConnection.setReadTimeout(0);
            LoggingBehavior loggingBehavior = logger.f16352a;
            String str = logger.f16353b;
            if (httpMethod != httpMethod2) {
                String string = logger.f16354c.toString();
                Intrinsics.e(string, "contents.toString()");
                Logger.Companion.b(loggingBehavior, str, string);
                logger.f16354c = new StringBuilder();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                FilterOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (z3) {
                    try {
                        bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        filterOutputStream2 = bufferedOutputStream;
                        if (filterOutputStream2 != null) {
                            throw th;
                        }
                        filterOutputStream2.close();
                        throw th;
                    }
                }
                try {
                    Iterator it3 = requests.e0.iterator();
                    while (true) {
                        try {
                            try {
                                if (!it3.hasNext()) {
                                    Iterator<GraphRequest> it4 = requests.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            progressOutputStream = bufferedOutputStream;
                                            url = url2;
                                        } else if (it4.next().f instanceof OnProgressCallback) {
                                        }
                                        j(requests, logger, size, url, progressOutputStream, z3);
                                        progressOutputStream.close();
                                        String string2 = logger.f16354c.toString();
                                        Intrinsics.e(string2, "contents.toString()");
                                        Logger.Companion.b(loggingBehavior, str, string2);
                                        logger.f16354c = new StringBuilder();
                                        return;
                                    }
                                }
                                try {
                                    if (((GraphRequestBatch.Callback) it3.next()) instanceof GraphRequestBatch.OnProgressCallback) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    filterOutputStream = bufferedOutputStream;
                                    filterOutputStream2 = filterOutputStream;
                                    if (filterOutputStream2 != null) {
                                        throw th;
                                    }
                                    filterOutputStream2.close();
                                    throw th;
                                }
                                j(requests, logger, size, url, progressOutputStream, z3);
                                progressOutputStream.close();
                                String string3 = logger.f16354c.toString();
                                Intrinsics.e(string3, "contents.toString()");
                                Logger.Companion.b(loggingBehavior, str, string3);
                                logger.f16354c = new StringBuilder();
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                filterOutputStream2 = progressOutputStream;
                                th = th;
                                if (filterOutputStream2 != null) {
                                    throw th;
                                }
                                filterOutputStream2.close();
                                throw th;
                            }
                            progressOutputStream = new ProgressOutputStream(filterOutputStream, requests, progressNoopOutputStream.X, progressNoopOutputStream.e0);
                            url = url2;
                            size = size;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            filterOutputStream2 = filterOutputStream;
                            if (filterOutputStream2 != null) {
                                throw th;
                            }
                            filterOutputStream2.close();
                            throw th;
                        }
                        progressNoopOutputStream = new ProgressNoopOutputStream(requests.X);
                        j(requests, null, size, url2, progressNoopOutputStream, z3);
                        filterOutputStream = bufferedOutputStream;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    filterOutputStream = bufferedOutputStream;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }

        public static HttpURLConnection n(GraphRequestBatch requests) throws Throwable {
            URL url;
            Intrinsics.f(requests, "requests");
            for (GraphRequest graphRequest : requests) {
                if (HttpMethod.X == graphRequest.g) {
                    String strSubstring = graphRequest.f15936e;
                    if (strSubstring != null && strSubstring.length() != 0) {
                        if (StringsKt.M(strSubstring, "v", false)) {
                            strSubstring = strSubstring.substring(1);
                            Intrinsics.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        }
                        Object[] array = new Regex("\\.").f(strSubstring, 0).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        String[] strArr = (String[]) array;
                        if ((strArr.length < 2 || Integer.parseInt(strArr[0]) <= 2) && (Integer.parseInt(strArr[0]) < 2 || Integer.parseInt(strArr[1]) < 4)) {
                        }
                    }
                    if (!graphRequest.d.containsKey("fields") || Utility.C(graphRequest.d.getString("fields"))) {
                        HashMap map = Logger.d;
                        FacebookSdk.j(LoggingBehavior.g0);
                    }
                }
            }
            try {
                if (requests.Z.size() == 1) {
                    url = new URL(((GraphRequest) requests.Z.get(0)).g());
                } else {
                    Collection collection = ServerProtocol.f16370a;
                    url = new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.g()}, 1)));
                }
                HttpURLConnection httpURLConnectionB = null;
                try {
                    httpURLConnectionB = b(url);
                    m(requests, httpURLConnectionB);
                    return httpURLConnectionB;
                } catch (IOException e2) {
                    Utility.l(httpURLConnectionB);
                    throw new FacebookException("could not construct request body", e2);
                } catch (JSONException e3) {
                    Utility.l(httpURLConnectionB);
                    throw new FacebookException("could not construct request body", e3);
                }
            } catch (MalformedURLException e4) {
                throw new FacebookException("could not construct URL for request", e4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface GraphJSONArrayCallback {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface GraphJSONObjectCallback {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequest$KeyValueSerializer;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface KeyValueSerializer {
        void a(String str, String str2);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequest$OnProgressCallback;", "Lcom/facebook/GraphRequest$Callback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface OnProgressCallback extends Callback {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/GraphRequest$Serializer;", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Serializer implements KeyValueSerializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15943a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OutputStream f15945c;
        public final Logger d;

        public Serializer(OutputStream outputStream, Logger logger, boolean z2) {
            this.f15945c = outputStream;
            this.d = logger;
            this.f15944b = z2;
        }

        @Override // com.facebook.GraphRequest.KeyValueSerializer
        public final void a(String key, String value) throws IOException {
            Intrinsics.f(key, "key");
            Intrinsics.f(value, "value");
            c(key, null, null);
            f("%s", value);
            h();
            Logger logger = this.d;
            if (logger != null) {
                logger.a(value, "    ".concat(key));
            }
        }

        public final void b(String str, Object... args) throws IOException {
            Intrinsics.f(args, "args");
            OutputStream outputStream = this.f15945c;
            if (this.f15944b) {
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String strEncode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8");
                Intrinsics.e(strEncode, "URLEncoder.encode(String… format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(Charsets.f44691a);
                Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f15943a) {
                Charset charset = Charsets.f44691a;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.e(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes2);
                String str2 = GraphRequest.j;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str2.getBytes(charset);
                Intrinsics.e(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes3);
                byte[] bytes4 = IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(charset);
                Intrinsics.e(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                this.f15943a = false;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            byte[] bytes5 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(Charsets.f44691a);
            Intrinsics.e(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes5);
        }

        public final void c(String str, String str2, String str3) throws IOException {
            if (this.f15944b) {
                byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(Charsets.f44691a);
                Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
                this.f15945c.write(bytes);
                return;
            }
            b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                b("; filename=\"%s\"", str2);
            }
            f("", new Object[0]);
            if (str3 != null) {
                f("%s: %s", "Content-Type", str3);
            }
            f("", new Object[0]);
        }

        public final void d(Uri contentUri, String key, String str) throws Throwable {
            int iJ;
            long j;
            Intrinsics.f(key, "key");
            Intrinsics.f(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f15945c;
            if (outputStream instanceof ProgressNoopOutputStream) {
                Cursor cursorQuery = null;
                try {
                    cursorQuery = FacebookSdk.b().getContentResolver().query(contentUri, null, null, null, null);
                    if (cursorQuery == null) {
                        j = 0;
                    } else {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        cursorQuery.moveToFirst();
                        long j2 = cursorQuery.getLong(columnIndex);
                        cursorQuery.close();
                        j = j2;
                    }
                    ((ProgressNoopOutputStream) outputStream).h(j);
                    iJ = 0;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    cursorQuery.close();
                    throw th;
                }
            } else {
                iJ = Utility.j(FacebookSdk.b().getContentResolver().openInputStream(contentUri), outputStream);
            }
            f("", new Object[0]);
            h();
            Logger logger = this.d;
            if (logger != null) {
                logger.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iJ)}, 1)), "    ".concat(key));
            }
        }

        public final void e(String key, ParcelFileDescriptor descriptor, String str) throws Throwable {
            int iJ;
            Intrinsics.f(key, "key");
            Intrinsics.f(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f15945c;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).h(descriptor.getStatSize());
                iJ = 0;
            } else {
                iJ = Utility.j(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), outputStream);
            }
            f("", new Object[0]);
            h();
            Logger logger = this.d;
            if (logger != null) {
                logger.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iJ)}, 1)), "    ".concat(key));
            }
        }

        public final void f(String str, Object... objArr) throws IOException {
            b(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f15944b) {
                return;
            }
            b(IOUtils.LINE_SEPARATOR_WINDOWS, new Object[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(String key, Object obj, GraphRequest graphRequest) throws Throwable {
            Intrinsics.f(key, "key");
            OutputStream outputStream = this.f15945c;
            if (outputStream instanceof RequestOutputStream) {
                ((RequestOutputStream) outputStream).a(graphRequest);
            }
            String str = GraphRequest.j;
            if (Companion.f(obj)) {
                a(key, Companion.a(obj));
                return;
            }
            boolean z2 = obj instanceof Bitmap;
            Logger logger = this.d;
            if (z2) {
                Bitmap bitmap = (Bitmap) obj;
                Intrinsics.f(bitmap, "bitmap");
                c(key, key, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                f("", new Object[0]);
                h();
                if (logger != null) {
                    logger.a("<Image>", "    ".concat(key));
                    return;
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bytes = (byte[]) obj;
                Intrinsics.f(bytes, "bytes");
                c(key, key, "content/unknown");
                outputStream.write(bytes);
                f("", new Object[0]);
                h();
                if (logger != null) {
                    logger.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1)), "    ".concat(key));
                    return;
                }
                return;
            }
            if (obj instanceof Uri) {
                d((Uri) obj, key, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                e(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw new IllegalArgumentException("value is not a supported type.");
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable parcelable = parcelableResourceWithMimeType.f15942Y;
            boolean z3 = parcelable instanceof ParcelFileDescriptor;
            String str2 = parcelableResourceWithMimeType.X;
            if (z3) {
                e(key, (ParcelFileDescriptor) parcelable, str2);
            } else {
                if (!(parcelable instanceof Uri)) {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
                d((Uri) parcelable, key, str2);
            }
        }

        public final void h() throws IOException {
            if (!this.f15944b) {
                f("--%s", GraphRequest.j);
                return;
            }
            byte[] bytes = d9.i.f24749c.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f15945c.write(bytes);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.e(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < iNextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb.toString();
        Intrinsics.e(string, "buffer.toString()");
        j = string;
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, 63);
    }

    public static String f() {
        String strC = FacebookSdk.c();
        Validate.h();
        String str = FacebookSdk.f15918e;
        if (Utility.C(strC) || Utility.C(str)) {
            return null;
        }
        StringBuilder sbX = a.x(strC, com.smartdigimkt.b0.a.U1);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        sbX.append(str);
        return sbX.toString();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    public final void a() {
        String strE;
        Bundle bundle = this.d;
        if (this.f15937h) {
            strE = e();
            if (strE != null) {
                bundle.putString("access_token", strE);
            }
        } else {
            String strE2 = e();
            boolean zL = strE2 != null ? StringsKt.l(strE2, com.smartdigimkt.b0.a.U1, false) : false;
            if (strE2 == null || !StringsKt.M(strE2, "IG", false) || zL || !i()) {
                if ((Intrinsics.a(FacebookSdk.g(), "instagram.com") ? true ^ i() : true) || zL) {
                    strE = e();
                    if (strE != null) {
                        bundle.putString("access_token", strE);
                    }
                }
            }
            bundle.putString("access_token", f());
        }
        if (!bundle.containsKey("access_token")) {
            HashSet hashSet = FacebookSdk.f15915a;
            Validate.h();
            if (Utility.C(FacebookSdk.f15918e)) {
                Log.w("GraphRequest", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        FacebookSdk.j(LoggingBehavior.i0);
        FacebookSdk.j(LoggingBehavior.h0);
    }

    public final String b(String str, boolean z2) {
        if (!z2 && this.g == HttpMethod.f15953Y) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (Companion.f(obj)) {
                builderBuildUpon.appendQueryParameter(str2, Companion.a(obj).toString());
            } else if (this.g != HttpMethod.X) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        String string = builderBuildUpon.toString();
        Intrinsics.e(string, "uriBuilder.toString()");
        return string;
    }

    public final GraphResponse c() throws Throwable {
        ArrayList arrayListC = Companion.c(new GraphRequestBatch(ArraysKt.M(new GraphRequest[]{this})));
        if (arrayListC.size() == 1) {
            return (GraphResponse) arrayListC.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final GraphRequestAsyncTask d() {
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch(ArraysKt.M(new GraphRequest[]{this}));
        Validate.e(graphRequestBatch);
        GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(graphRequestBatch);
        graphRequestAsyncTask.executeOnExecutor(FacebookSdk.e(), new Void[0]);
        return graphRequestAsyncTask;
    }

    public final String e() {
        AccessToken accessToken = this.f15933a;
        if (accessToken != null) {
            if (!this.d.containsKey("access_token")) {
                Logger.Companion companion = Logger.f16351e;
                String str = accessToken.f0;
                companion.c(str);
                return str;
            }
        } else if (!this.f15937h && !this.d.containsKey("access_token")) {
            return f();
        }
        return this.d.getString("access_token");
    }

    public final String g() {
        String str;
        String str2;
        if (this.g == HttpMethod.f15953Y && (str2 = this.f15934b) != null && StringsKt.p(str2, "/videos", false)) {
            Collection collection = ServerProtocol.f16370a;
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{FacebookSdk.g()}, 1));
        } else {
            String subdomain = FacebookSdk.g();
            Collection collection2 = ServerProtocol.f16370a;
            Intrinsics.f(subdomain, "subdomain");
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        }
        String strH = h(str);
        a();
        return b(strH, false);
    }

    public final String h(String str) {
        if (!(!Intrinsics.a(FacebookSdk.g(), "instagram.com") ? true : !i())) {
            Collection collection = ServerProtocol.f16370a;
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.r}, 1));
        }
        Pattern pattern = k;
        String str2 = this.f15934b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f15936e, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.f15934b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(FacebookSdk.c());
        sb.append("/?.*");
        return this.f15938i || Pattern.matches(sb.toString(), str);
    }

    public final void j(Callback callback) {
        FacebookSdk.j(LoggingBehavior.i0);
        FacebookSdk.j(LoggingBehavior.h0);
        this.f = callback;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f15933a;
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f15934b);
        sb.append(", graphObject: ");
        sb.append(this.f15935c);
        sb.append(", httpMethod: ");
        sb.append(this.g);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1();
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Parcelable f15942Y;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "CREATOR", "Landroid/os/Parcelable$Creator;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable) {
            this.X = "image/png";
            this.f15942Y = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i2) {
            Intrinsics.f(out, "out");
            out.writeString(this.X);
            out.writeParcelable(this.f15942Y, i2);
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.X = parcel.readString();
            this.f15942Y = parcel.readParcelable(FacebookSdk.b().getClassLoader());
        }
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, 48);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, 32);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, int i2) {
        accessToken = (i2 & 1) != 0 ? null : accessToken;
        str = (i2 & 2) != 0 ? null : str;
        bundle = (i2 & 4) != 0 ? null : bundle;
        httpMethod = (i2 & 8) != 0 ? null : httpMethod;
        callback = (i2 & 16) != 0 ? null : callback;
        this.f15933a = accessToken;
        this.f15934b = str;
        this.f15936e = null;
        j(callback);
        this.g = httpMethod == null ? HttpMethod.X : httpMethod;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        if (this.f15936e == null) {
            this.f15936e = FacebookSdk.f();
        }
    }
}
