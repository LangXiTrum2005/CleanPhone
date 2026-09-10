package com.applovin.shadow.okhttp3.internal.http;

import an.p;
import com.applovin.shadow.okhttp3.Challenge;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.CookieJar;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.ironsource.Ve;
import com.ironsource.X3;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lcom/applovin/shadow/okhttp3/Headers;", "", "headerName", "", "Lcom/applovin/shadow/okhttp3/Challenge;", "parseChallenges", "(Lcom/applovin/shadow/okhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lcom/applovin/shadow/okio/Buffer;", "", "result", "Lwj/r;", "readChallengeHeader", "(Lcom/applovin/shadow/okio/Buffer;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lcom/applovin/shadow/okio/Buffer;)Z", "", "prefix", "startsWith", "(Lcom/applovin/shadow/okio/Buffer;B)Z", "readQuotedString", "(Lcom/applovin/shadow/okio/Buffer;)Ljava/lang/String;", "readToken", "Lcom/applovin/shadow/okhttp3/CookieJar;", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lcom/applovin/shadow/okhttp3/CookieJar;Lcom/applovin/shadow/okhttp3/HttpUrl;Lcom/applovin/shadow/okhttp3/Headers;)V", "Lcom/applovin/shadow/okhttp3/Response;", "promisesBody", "(Lcom/applovin/shadow/okhttp3/Response;)Z", Ve.f27442n, "hasBody", "Lcom/applovin/shadow/okio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lcom/applovin/shadow/okio/ByteString;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        n.f(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        n.f(headers, "<this>");
        n.f(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (headerName.equalsIgnoreCase(headers.name(i10))) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(headers.value(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        n.f(response, "<this>");
        if (n.a(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7 A[EDGE_INSN: B:59:0x00b7->B:48:0x00b7 BREAK  A[LOOP:2: B:22:0x006d->B:47:0x00b5], SYNTHETIC] */
    private static final void readChallengeHeader(Buffer buffer, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(buffer);
                    token2 = readToken(buffer);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(buffer);
                String token3 = readToken(buffer);
                if (token3 == null) {
                    if (buffer.exhausted()) {
                        list.add(new Challenge(token2, w.f53867a));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(buffer, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(buffer);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || buffer.exhausted())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(buffer, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(buffer, (byte) 34)) {
                                token = readQuotedString(buffer);
                            } else {
                                token = readToken(buffer);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(buffer)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(buffer);
                            if (!skipCommasAndWhitespace(buffer)) {
                                iSkipAll2 = Util.skipAll(buffer, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(buffer)) {
                                    return;
                                }
                                if (startsWith(buffer, (byte) 34)) {
                                    token = readQuotedString(buffer);
                                } else {
                                    token = readToken(buffer);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(buffer) && !buffer.exhausted()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    StringBuilder sbI = u.i(token3);
                    sbI.append(p.l0(iSkipAll, X3.j.f27830b));
                    Map mapSingletonMap = Collections.singletonMap(null, sbI.toString());
                    n.e(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == 34) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final String readToken(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        n.f(cookieJar, "<this>");
        n.f(url, "url");
        n.f(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) throws EOFException {
        boolean z10 = false;
        while (!buffer.exhausted()) {
            byte b10 = buffer.getByte(0L);
            if (b10 == 44) {
                buffer.readByte();
                z10 = true;
            } else {
                if (b10 != 32 && b10 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z10;
    }

    private static final boolean startsWith(Buffer buffer, byte b10) {
        return !buffer.exhausted() && buffer.getByte(0L) == b10;
    }
}
