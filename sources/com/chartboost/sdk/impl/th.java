package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class th {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f15226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f15227b;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15228b = new a();

        public a() {
            super(1, URL.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String str) {
            return new URL(str);
        }
    }

    public static abstract class b extends Exception {

        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f15229b = new a();

            public a() {
                super("Empty or null URL", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.th$b$b, reason: collision with other inner class name */
        public static final class C0175b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f15230b;

            public C0175b(int i2) {
                super(android.support.v4.media.a.h(i2, "Failed with HTTP code "), null, 2, 0 == true ? 1 : 0);
                this.f15230b = i2;
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f15231b = new c();

            public c() {
                super("Returned connection is null", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f15232b = new d();

            public d() {
                super("Too many redirects", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f15233b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String url, Throwable cause) {
                super("Uncontrolled error", cause, null);
                Intrinsics.f(url, "url");
                Intrinsics.f(cause, "cause");
                this.f15233b = url;
            }

            public final String a() {
                return this.f15233b;
            }

            @Override // com.chartboost.sdk.impl.th.b, java.lang.Throwable
            public String toString() {
                String string;
                Throwable cause = getCause();
                return (cause == null || (string = cause.toString()) == null) ? "No cause" : string;
            }
        }

        public b(String str, Throwable th) {
            super(str, th);
        }

        @Override // java.lang.Throwable
        public String toString() {
            String message = getMessage();
            return message == null ? "No message" : message;
        }

        public /* synthetic */ b(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : th, null);
        }

        public /* synthetic */ b(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }
    }

    public th(Function1 urlFactory, SSLSocketFactory sslSocket) {
        Intrinsics.f(urlFactory, "urlFactory");
        Intrinsics.f(sslSocket, "sslSocket");
        this.f15226a = urlFactory;
        this.f15227b = sslSocket;
    }

    public final Object a(b bVar) {
        return ResultKt.a(bVar);
    }

    public final boolean b(int i2) {
        return i2 <= o8.REQUEST_SUCCESS_END.b() && o8.REQUEST_SUCCESS_START.b() <= i2;
    }

    public final boolean a(int i2) {
        return i2 <= o8.REDIRECTION_END.b() && o8.REDIRECTION_START.b() <= i2;
    }

    public final HttpsURLConnection a(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
        if (httpsURLConnection == null) {
            return null;
        }
        httpsURLConnection.setSSLSocketFactory(this.f15227b);
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        return httpsURLConnection;
    }

    public /* synthetic */ th(Function1 function1, SSLSocketFactory sSLSocketFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? a.f15228b : function1, (i2 & 2) != 0 ? d3.f13672a.a() : sSLSocketFactory);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f6 A[RETURN] */
    public final Object a(String str, int i2) throws Throwable {
        Object objA;
        HttpsURLConnection httpsURLConnectionA;
        Object obj;
        Object objA2;
        HttpsURLConnection httpsURLConnection = null;
        za.a("Attempting to redirect url: " + str + ", limit: " + i2, (Throwable) null, 2, (Object) null);
        if (str == null || str.length() == 0) {
            Object objA3 = a(b.a.f15229b);
            za.e("Url is null or empty.", null, 2, null);
            return objA3;
        }
        if (i2 < 0) {
            Object objA4 = a(b.d.f15232b);
            za.e("Too many redirects for url: ".concat(str), null, 2, null);
            return objA4;
        }
        try {
            try {
                URL url = (URL) this.f15226a.invoke(str);
                httpsURLConnectionA = a(url);
                try {
                    if (httpsURLConnectionA != null) {
                        if (b(httpsURLConnectionA.getResponseCode())) {
                            za.a("Successfully fetched url: ".concat(str), (Throwable) null, 2, (Object) null);
                        } else if (a(httpsURLConnectionA.getResponseCode())) {
                            String headerField = httpsURLConnectionA.getHeaderField("Location");
                            Intrinsics.c(headerField);
                            if (StringsKt.M(headerField, "/", false)) {
                                headerField = url.getProtocol() + "://" + url.getHost() + headerField;
                            }
                            za.a("Redirecting to: " + headerField, (Throwable) null, 2, (Object) null);
                            objA = a(headerField, i2 + (-1));
                        } else {
                            objA2 = a(new b.C0175b(httpsURLConnectionA.getResponseCode()));
                            za.e("Failed with HTTP code " + httpsURLConnectionA.getResponseCode() + " for url: " + str, null, 2, null);
                        }
                        if (httpsURLConnectionA == null) {
                            objA = str;
                            return objA;
                        }
                        objA = str;
                        httpsURLConnectionA.disconnect();
                        obj = objA;
                        return obj;
                    }
                    objA2 = a(b.c.f15231b);
                    za.e("Null connection for url: ".concat(str), null, 2, null);
                    objA = objA2;
                    if (httpsURLConnectionA == null) {
                        objA = str;
                        return objA;
                    }
                } catch (Exception e2) {
                    e = e2;
                    httpsURLConnection = httpsURLConnectionA;
                    za.b("Cannot redirect ".concat(str), e);
                    objA = a(new b.e(str, e));
                    obj = objA;
                    if (httpsURLConnection != null) {
                        httpsURLConnectionA = httpsURLConnection;
                    }
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = httpsURLConnectionA;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        objA = str;
        httpsURLConnectionA.disconnect();
        obj = objA;
        return obj;
    }

    public static /* synthetic */ Object a(th thVar, String str, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        return thVar.a(str, i2);
    }
}
