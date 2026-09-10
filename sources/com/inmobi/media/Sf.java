package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.sf;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sf f23987a = new sf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f23988b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AdConfig.WebAssetCacheConfig f23989c;
    public static final pf d;

    static {
        LinkedHashMap linkedHashMap = O2.f23027a;
        AdConfig.WebAssetCacheConfig webAssetCache = ((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getWebAssetCache();
        f23989c = webAssetCache;
        Context contextD = Uc.d();
        d = contextD != null ? new pf(contextD, webAssetCache) : null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r2v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.test(Unknown Source)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(Unknown Source)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(Unknown Source)
     */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x00bb: MOVE (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:35:0x00bb */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x00bd: MOVE (r5 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:35:0x00bb */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final WebResourceResponse a(final String url, final InterfaceC3333z5 interfaceC3333z5) {
        ?? r5;
        long j;
        ?? r6;
        String mimeTypeFromExtension;
        String str;
        Object obj;
        String str2;
        Pair pair;
        I9 i9;
        String str3 = "errorCode";
        Intrinsics.f(url, "url");
        pf pfVar = d;
        if (pfVar == null || pfVar.f23902a == null) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + pfVar + " for URL: " + url);
            }
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("url", url);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(url);
            if (B2.a(fileExtensionFromUrl)) {
                j = jCurrentTimeMillis;
                try {
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                } catch (TimeoutException unused) {
                    r5 = "ResourceCacheMiss";
                } catch (Exception e2) {
                    e = e2;
                    r5 = "ResourceCacheMiss";
                    linkedHashMap.put(str3, (short) 2195);
                    r6 = r5;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).b("WebResourceHandler", rf.a(e, new StringBuilder("Unhandled exception occurred: ")));
                        r6 = r5;
                    }
                    linkedHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                    Pd pd = Pd.f23077a;
                    Pd.b(r6, linkedHashMap, Td.SDK);
                    return null;
                }
            } else {
                j = jCurrentTimeMillis;
                mimeTypeFromExtension = null;
            }
            if (mimeTypeFromExtension == null || mimeTypeFromExtension.length() == 0) {
                mimeTypeFromExtension = "text/html";
            }
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WebResourceHandler", "mimeType is " + mimeTypeFromExtension + " for " + url);
            }
            InputStream inputStreamA = pfVar.a(url, interfaceC3333z5);
            if (inputStreamA != null) {
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("WebResourceHandler", "Found in cache: ".concat(url));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("url", url);
                Pd pd2 = Pd.f23077a;
                Pd.b("ResourceCacheHit", linkedHashMap2, Td.SDK);
                return B2.a(inputStreamA, mimeTypeFromExtension);
            }
            ConcurrentHashMap concurrentHashMap = f23988b;
            FutureTask futureTask = (FutureTask) concurrentHashMap.get(url);
            try {
                if (futureTask != null) {
                    str2 = "errorCode";
                    try {
                        pair = new Pair(Boolean.TRUE, futureTask);
                    } catch (TimeoutException unused2) {
                        r5 = "ResourceCacheMiss";
                        str3 = str2;
                        linkedHashMap.put(str3, (short) 2193);
                        r6 = r5;
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).b("WebResourceHandler", "Timeout exception occurred for url: ".concat(url));
                            r6 = r5;
                        }
                        linkedHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                        Pd pd3 = Pd.f23077a;
                        Pd.b(r6, linkedHashMap, Td.SDK);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        str3 = str2;
                        r5 = "ResourceCacheMiss";
                        linkedHashMap.put(str3, (short) 2195);
                        r6 = r5;
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).b("WebResourceHandler", rf.a(e, new StringBuilder("Unhandled exception occurred: ")));
                            r6 = r5;
                        }
                        linkedHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                        Pd pd4 = Pd.f23077a;
                        Pd.b(r6, linkedHashMap, Td.SDK);
                        return null;
                    }
                } else {
                    str2 = "errorCode";
                    FutureTask futureTask2 = new FutureTask(new Callable() { // from class: A.v0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return sf.a(this.X, url, interfaceC3333z5);
                        }
                    });
                    FutureTask futureTask3 = (FutureTask) concurrentHashMap.putIfAbsent(url, futureTask2);
                    pair = futureTask3 == null ? new Pair(Boolean.FALSE, futureTask2) : new Pair(Boolean.TRUE, futureTask3);
                }
                boolean zBooleanValue = ((Boolean) pair.X).booleanValue();
                FutureTask futureTask4 = (FutureTask) pair.f43249Y;
                if (!zBooleanValue) {
                    InputStream inputStreamA2 = pfVar.a(url, interfaceC3333z5);
                    if (inputStreamA2 != null) {
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).a("WebResourceHandler", "Found in cache in After FutureTask created: ".concat(url));
                        }
                        concurrentHashMap.remove(url);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("url", url);
                        Pd pd5 = Pd.f23077a;
                        Pd.b("ResourceCacheHit", linkedHashMap3, Td.SDK);
                        return B2.a(inputStreamA2, mimeTypeFromExtension);
                    }
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).c("WebResourceHandler", "request for ".concat(url));
                    }
                    futureTask4.run();
                    concurrentHashMap.remove(url);
                    linkedHashMap.put("networkType", L3.q());
                } else if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("WebResourceHandler", "waiting for existing request for ".concat(url));
                }
                AdConfig.WebAssetCacheConfig webAssetCacheConfig = f23989c;
                C3324yc c3324yc = (C3324yc) futureTask4.get(((long) webAssetCacheConfig.getTimeout()) * ((long) Math.max(1, webAssetCacheConfig.getMaxRetries())), TimeUnit.MILLISECONDS);
                Intrinsics.c(c3324yc);
                byte[] bArr = c3324yc.f24135c;
                r5 = c3324yc.d;
                try {
                    try {
                        if (r5 != 0 && r5.intValue() == 200 && bArr != null) {
                            try {
                                if (bArr.length != 0) {
                                    linkedHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                                    byte[] bArr2 = c3324yc.f24135c;
                                    linkedHashMap.put("size", Long.valueOf(bArr2 != null ? ((long) bArr2.length) / 1024 : 0L));
                                    Pd pd6 = Pd.f23077a;
                                    Pd.b("ResourceCacheMiss", linkedHashMap, Td.SDK);
                                    return B2.a(new ByteArrayInputStream(c3324yc.f24135c), mimeTypeFromExtension);
                                }
                            } catch (TimeoutException unused3) {
                                r5 = r2;
                                str3 = str2;
                            } catch (Exception e4) {
                                e = e4;
                                r5 = r2;
                                str3 = str2;
                                linkedHashMap.put(str3, (short) 2195);
                                r6 = r5;
                                if (interfaceC3333z5 != null) {
                                    ((A5) interfaceC3333z5).b("WebResourceHandler", rf.a(e, new StringBuilder("Unhandled exception occurred: ")));
                                    r6 = r5;
                                }
                                linkedHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                                Pd pd7 = Pd.f23077a;
                                Pd.b(r6, linkedHashMap, Td.SDK);
                                return null;
                            }
                            linkedHashMap.put(str3, (short) 2193);
                            r6 = r5;
                            if (interfaceC3333z5 != null) {
                                ((A5) interfaceC3333z5).b("WebResourceHandler", "Timeout exception occurred for url: ".concat(url));
                                r6 = r5;
                            }
                            linkedHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                            Pd pd8 = Pd.f23077a;
                            Pd.b(r6, linkedHashMap, Td.SDK);
                            return null;
                        }
                        linkedHashMap.put(str3, i9 != null ? Integer.valueOf(i9.f22886a.f23864a) : (short) 2194);
                        r6 = r5;
                    } catch (TimeoutException unused4) {
                        linkedHashMap.put(str3, (short) 2193);
                        r6 = r5;
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).b("WebResourceHandler", "Timeout exception occurred for url: ".concat(url));
                            r6 = r5;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        linkedHashMap.put(str3, (short) 2195);
                        r6 = r5;
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).b("WebResourceHandler", rf.a(e, new StringBuilder("Unhandled exception occurred: ")));
                            r6 = r5;
                        }
                    }
                    r5 = r2;
                    i9 = c3324yc.f24133a;
                    str3 = str2;
                } catch (TimeoutException unused5) {
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (TimeoutException unused6) {
                str3 = str;
                r5 = obj;
            } catch (Exception e7) {
                e = e7;
            }
            linkedHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
            Pd pd9 = Pd.f23077a;
            Pd.b(r6, linkedHashMap, Td.SDK);
            return null;
        } catch (TimeoutException unused7) {
            r5 = "ResourceCacheMiss";
            j = jCurrentTimeMillis;
        } catch (Exception e8) {
            e = e8;
            r5 = "ResourceCacheMiss";
            j = jCurrentTimeMillis;
        }
    }

    public static final C3324yc a(sf this_run, String url, InterfaceC3333z5 interfaceC3333z5) throws Throwable {
        C3324yc c3324ycA;
        I9 i9;
        Intrinsics.f(this_run, "$this_run");
        Intrinsics.f(url, "$url");
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("WebResourceHandler", AbstractC3041h0.a("downloadResourceFile(): ", url));
        }
        EnumC3212rc method = EnumC3212rc.GET;
        Intrinsics.f(method, "method");
        C3197qc c3197qc = new C3197qc(url, method);
        AdConfig.WebAssetCacheConfig webAssetCacheConfig = f23989c;
        c3197qc.f23937h = Integer.valueOf(webAssetCacheConfig.getTimeout());
        c3197qc.f23938i = Integer.valueOf(webAssetCacheConfig.getTimeout());
        c3197qc.g = new C3244tc(webAssetCacheConfig.getMaxRetries(), 500);
        C3260uc c3260uc = new C3260uc(c3197qc);
        do {
            c3324ycA = H9.a(c3260uc, (Function2) null);
            i9 = c3324ycA.f24133a;
        } while ((i9 != null ? i9.f22886a : null) == EnumC3157o4.m);
        byte[] bArr = c3324ycA.f24135c;
        Integer num = c3324ycA.d;
        if (num != null && num.intValue() == 200 && bArr != null && bArr.length != 0) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("WebResourceHandler", "onSuccessfulResponse: ".concat(url));
            }
            pf pfVar = d;
            if (pfVar != null) {
                String data = J9.a(c3324ycA.f24135c);
                Intrinsics.f(data, "data");
                if (pfVar.f23902a != null) {
                    try {
                        String strValueOf = String.valueOf(url.hashCode());
                        S3 s3 = pfVar.f23902a;
                        if (s3 == null) {
                            Intrinsics.m("diskLruCache");
                            throw null;
                        }
                        P3 p3A = s3.a(strValueOf);
                        if (p3A != null) {
                            p3A.a(url, 0);
                            p3A.a(data, 1);
                            if (p3A.f23064c) {
                                S3.a(p3A.d, p3A, false);
                                p3A.d.d(p3A.f23062a.f23098a);
                                return c3324ycA;
                            }
                            S3.a(p3A.d, p3A, true);
                            return c3324ycA;
                        }
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for ".concat(url));
                            return c3324ycA;
                        }
                    } catch (Exception e2) {
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e2.getMessage() + " for " + url);
                        }
                    }
                } else if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: ".concat(url));
                }
            }
        }
        return c3324ycA;
    }
}
