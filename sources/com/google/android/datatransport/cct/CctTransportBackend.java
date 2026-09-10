package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import com.smartdigimkt.o0.b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class CctTransportBackend implements TransportBackend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataEncoder f16679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f16680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16681c;
    public final URL d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Clock f16682e;
    public final Clock f;
    public final int g;

    public static final class HttpRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f16683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BatchedLogRequest f16684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f16685c;

        public HttpRequest(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.f16683a = url;
            this.f16684b = batchedLogRequest;
            this.f16685c = str;
        }
    }

    public static final class HttpResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f16687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f16688c;

        public HttpResponse(int i2, URL url, long j) {
            this.f16686a = i2;
            this.f16687b = url;
            this.f16688c = j;
        }
    }

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoBatchedLogRequestEncoder.f16690a.a(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.d = true;
        this.f16679a = jsonDataEncoderBuilder.a();
        this.f16681c = context;
        this.f16680b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(CCTDestination.f16675c);
        this.f16682e = clock2;
        this.f = clock;
        this.g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(android.support.v4.media.a.C("Invalid url: ", str), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00df  */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final EventInternal a(EventInternal eventInternal) {
        int type;
        int subtype;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f16680b.getActiveNetworkInfo();
        EventInternal.Builder builderN = eventInternal.n();
        ((HashMap) builderN.c()).put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        builderN.a("model", Build.MODEL);
        builderN.a("hardware", Build.HARDWARE);
        builderN.a(d9.h.G, Build.DEVICE);
        builderN.a(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        builderN.a("os-uild", Build.ID);
        builderN.a("manufacturer", Build.MANUFACTURER);
        builderN.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        builderN.c().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = NetworkConnectionInfo.NetworkType.X;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        ((HashMap) builderN.c()).put("net-type", String.valueOf(type));
        try {
            if (activeNetworkInfo != null) {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    SparseArray sparseArray2 = NetworkConnectionInfo.MobileSubtype.X;
                    subtype = 100;
                } else if (((NetworkConnectionInfo.MobileSubtype) NetworkConnectionInfo.MobileSubtype.X.get(subtype)) == null) {
                }
                ((HashMap) builderN.c()).put("mobile-subtype", String.valueOf(subtype));
                builderN.a("country", Locale.getDefault().getCountry());
                builderN.a("locale", Locale.getDefault().getLanguage());
                Context context = this.f16681c;
                simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (simOperator == null) {
                    simOperator = "";
                }
                builderN.a("mcc_mnc", simOperator);
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                builderN.a("application_build", Integer.toString(i2));
                return builderN.b();
            }
            SparseArray sparseArray3 = NetworkConnectionInfo.MobileSubtype.X;
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Logging.c("CctTransportBackend", "Unable to find version code for package", e2);
        }
        subtype = 0;
        ((HashMap) builderN.c()).put("mobile-subtype", String.valueOf(subtype));
        builderN.a("country", Locale.getDefault().getCountry());
        builderN.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f16681c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        builderN.a("mcc_mnc", simOperator);
        builderN.a("application_build", Integer.toString(i2));
        return builderN.b();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.datatransport.cct.a] */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final BackendResponse b(BackendRequest backendRequest) {
        int i2;
        String str;
        Object objA;
        LogEvent.Builder builderK;
        HashMap map = new HashMap();
        for (EventInternal eventInternal : backendRequest.b()) {
            String strL = eventInternal.l();
            if (map.containsKey(strL)) {
                ((List) map.get(strL)).add(eventInternal);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                map.put(strL, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (true) {
            i2 = 5;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder builderA = LogRequest.a();
            QosTier qosTier = QosTier.X;
            builderA.f();
            builderA.g(this.f.a());
            builderA.h(this.f16682e.a());
            ClientInfo.Builder builderA2 = ClientInfo.a();
            builderA2.c();
            AndroidClientInfo.Builder builderA3 = AndroidClientInfo.a();
            builderA3.m(Integer.valueOf(eventInternal2.i("sdk-version")));
            builderA3.j(eventInternal2.b("model"));
            builderA3.f(eventInternal2.b("hardware"));
            builderA3.d(eventInternal2.b(d9.h.G));
            builderA3.l(eventInternal2.b(AppLovinEventTypes.USER_VIEWED_PRODUCT));
            builderA3.k(eventInternal2.b("os-uild"));
            builderA3.h(eventInternal2.b("manufacturer"));
            builderA3.e(eventInternal2.b("fingerprint"));
            builderA3.c(eventInternal2.b("country"));
            builderA3.g(eventInternal2.b("locale"));
            builderA3.i(eventInternal2.b("mcc_mnc"));
            builderA3.b(eventInternal2.b("application_build"));
            builderA2.b(builderA3.a());
            builderA.b(builderA2.a());
            try {
                builderA.d(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                builderA.e((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayloadE = eventInternal3.e();
                Encoding encoding = encodedPayloadE.f16832a;
                boolean zEquals = encoding.equals(new Encoding("proto"));
                byte[] bArr = encodedPayloadE.f16833b;
                if (zEquals) {
                    builderK = LogEvent.k(bArr);
                } else if (encoding.equals(new Encoding("json"))) {
                    builderK = LogEvent.j(new String(bArr, Charset.forName("UTF-8")));
                } else {
                    String strD = Logging.d("CctTransportBackend");
                    if (Log.isLoggable(strD, 5)) {
                        Log.w(strD, "Received event of unsupported encoding " + encoding + ". Skipping...");
                    }
                }
                builderK.d(eventInternal3.f());
                builderK.e(eventInternal3.m());
                String str2 = (String) eventInternal3.c().get("tz-offset");
                builderK.h(str2 == null ? 0L : Long.valueOf(str2).longValue());
                NetworkConnectionInfo.Builder builderA4 = NetworkConnectionInfo.a();
                builderA4.c((NetworkConnectionInfo.NetworkType) NetworkConnectionInfo.NetworkType.X.get(eventInternal3.i("net-type")));
                builderA4.b((NetworkConnectionInfo.MobileSubtype) NetworkConnectionInfo.MobileSubtype.X.get(eventInternal3.i("mobile-subtype")));
                builderK.g(builderA4.a());
                if (eventInternal3.d() != null) {
                    builderK.c(eventInternal3.d());
                }
                if (eventInternal3.j() != null) {
                    ComplianceData.Builder builderA5 = ComplianceData.a();
                    ExternalPrivacyContext.Builder builderA6 = ExternalPrivacyContext.a();
                    ExternalPRequestContext.Builder builderA7 = ExternalPRequestContext.a();
                    builderA7.b(eventInternal3.j());
                    builderA6.b(builderA7.a());
                    builderA5.b(builderA6.a());
                    ComplianceData.ProductIdOrigin productIdOrigin = ComplianceData.ProductIdOrigin.X;
                    builderA5.c();
                    builderK.b(builderA5.a());
                }
                if (eventInternal3.g() != null || eventInternal3.h() != null) {
                    ExperimentIds.Builder builderA8 = ExperimentIds.a();
                    if (eventInternal3.g() != null) {
                        builderA8.b(eventInternal3.g());
                    }
                    if (eventInternal3.h() != null) {
                        builderA8.c(eventInternal3.h());
                    }
                    builderK.f(builderA8.a());
                }
                arrayList3.add(builderK.a());
            }
            builderA.c(arrayList3);
            arrayList2.add(builderA.a());
        }
        BatchedLogRequest batchedLogRequestA = BatchedLogRequest.a(arrayList2);
        byte[] bArrC = backendRequest.c();
        URL urlC = this.d;
        if (bArrC != null) {
            try {
                CCTDestination cCTDestinationB = CCTDestination.b(backendRequest.c());
                str = cCTDestinationB.f16678b;
                if (str == null) {
                    str = null;
                }
                String str3 = cCTDestinationB.f16677a;
                if (str3 != null) {
                    urlC = c(str3);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.a();
            }
        } else {
            str = null;
        }
        try {
            HttpRequest httpRequest = new HttpRequest(urlC, batchedLogRequestA, str);
            ?? r0 = new Function() { // from class: com.google.android.datatransport.cct.a
                public final Object a(Object obj) {
                    CctTransportBackend.HttpRequest httpRequest2 = (CctTransportBackend.HttpRequest) obj;
                    CctTransportBackend cctTransportBackend = this.f16689a;
                    cctTransportBackend.getClass();
                    String strD2 = Logging.d("CctTransportBackend");
                    boolean zIsLoggable = Log.isLoggable(strD2, 4);
                    URL url = httpRequest2.f16683a;
                    if (zIsLoggable) {
                        Log.i(strD2, String.format("Making request to: %s", url));
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setReadTimeout(cctTransportBackend.g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod(ko.f25535b);
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "datatransport/3.3.0 android/");
                    httpURLConnection.setRequestProperty("Content-Encoding", b.d);
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Accept-Encoding", b.d);
                    String str4 = httpRequest2.f16685c;
                    if (str4 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", str4);
                    }
                    try {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                cctTransportBackend.f16679a.a(httpRequest2.f16684b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Integer numValueOf = Integer.valueOf(responseCode);
                                String strD3 = Logging.d("CctTransportBackend");
                                if (Log.isLoggable(strD3, 4)) {
                                    Log.i(strD3, String.format("Status Code: %d", numValueOf));
                                }
                                Logging.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                                Logging.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                    return new CctTransportBackend.HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
                                if (responseCode != 200) {
                                    return new CctTransportBackend.HttpResponse(responseCode, null, 0L);
                                }
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = b.d.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        CctTransportBackend.HttpResponse httpResponse = new CctTransportBackend.HttpResponse(responseCode, null, LogResponse.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).b());
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return httpResponse;
                                    } catch (Throwable th) {
                                        if (gZIPInputStream != null) {
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } catch (Throwable th7) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                            }
                            throw th7;
                        }
                    } catch (EncodingException e2) {
                        e = e2;
                        Logging.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                        return new CctTransportBackend.HttpResponse(400, null, 0L);
                    } catch (ConnectException e3) {
                        e = e3;
                        Logging.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                        return new CctTransportBackend.HttpResponse(500, null, 0L);
                    } catch (UnknownHostException e4) {
                        e = e4;
                        Logging.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                        return new CctTransportBackend.HttpResponse(500, null, 0L);
                    } catch (IOException e5) {
                        e = e5;
                        Logging.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                        return new CctTransportBackend.HttpResponse(400, null, 0L);
                    }
                }
            };
            do {
                objA = r0.a(httpRequest);
                URL url = ((HttpResponse) objA).f16687b;
                if (url != null) {
                    Logging.a("CctTransportBackend", "Following redirect to: %s", url);
                    httpRequest = new HttpRequest(url, httpRequest.f16684b, httpRequest.f16685c);
                } else {
                    httpRequest = null;
                }
                if (httpRequest == null) {
                    break;
                }
                i2--;
            } while (i2 >= 1);
            HttpResponse httpResponse = (HttpResponse) objA;
            int i3 = httpResponse.f16686a;
            if (i3 == 200) {
                return BackendResponse.e(httpResponse.f16688c);
            }
            if (i3 < 500 && i3 != 404) {
                return i3 == 400 ? BackendResponse.d() : BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException e2) {
            Logging.c("CctTransportBackend", "Could not make request to the backend", e2);
            return BackendResponse.f();
        }
    }
}
