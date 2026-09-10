package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.walach;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class jo {
    public static final jo a = new jo();
    public static final C3149pb b = new C3149pb();
    public static final C2809bo c;

    static {
        Context context = Ji.a;
        c = context != null ? new C2809bo(context, a()) : null;
    }

    public static AdConfig.WebAssetCacheConfig a() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.a.a(AdConfig.class)).getWebAssetCache();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ce A[Catch: Exception -> 0x01ec, TimeoutCancellationException -> 0x01f1, PHI: r0 r2 r6 r10 r13 r14 r18 r19
  0x01ce: PHI (r0v31 java.lang.Object) = (r0v25 java.lang.Object), (r0v1 java.lang.Object) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r2v7 com.inmobi.media.m9) = (r2v1 com.inmobi.media.m9), (r2v16 com.inmobi.media.m9) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r6v8 java.lang.String) = (r6v7 java.lang.String), (r6v11 java.lang.String) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r10v8 java.util.Map) = (r10v2 java.util.Map), (r10v19 java.util.Map) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r13v12 java.lang.String) = (r13v9 java.lang.String), (r13v21 java.lang.String) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r14v7 long) = (r14v1 long), (r14v15 long) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r18v6 java.lang.String) = (r18v2 java.lang.String), (r18v7 java.lang.String) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r19v15 java.lang.Object) = (r19v9 java.lang.Object), (r19v18 java.lang.Object) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE], TryCatch #18 {TimeoutCancellationException -> 0x01f1, Exception -> 0x01ec, blocks: (B:101:0x01ce, B:103:0x01d2, B:98:0x01a2), top: B:166:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01d2 A[Catch: Exception -> 0x01ec, TimeoutCancellationException -> 0x01f1, TRY_LEAVE, TryCatch #18 {TimeoutCancellationException -> 0x01f1, Exception -> 0x01ec, blocks: (B:101:0x01ce, B:103:0x01d2, B:98:0x01a2), top: B:166:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0212 A[Catch: TimeoutCancellationException -> 0x0242, Exception -> 0x0247, TryCatch #6 {TimeoutCancellationException -> 0x0242, blocks: (B:116:0x0212, B:118:0x0218, B:121:0x022a, B:126:0x0249, B:129:0x0292, B:131:0x02b5, B:105:0x01e8, B:111:0x01f7, B:96:0x0195), top: B:154:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0292 A[Catch: TimeoutCancellationException -> 0x0242, Exception -> 0x0247, TryCatch #6 {TimeoutCancellationException -> 0x0242, blocks: (B:116:0x0212, B:118:0x0218, B:121:0x022a, B:126:0x0249, B:129:0x0292, B:131:0x02b5, B:105:0x01e8, B:111:0x01f7, B:96:0x0195), top: B:154:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01d2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x0292, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:142:0x02d2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x02f8, please report this as an issue */
    public final Object a(String str, InterfaceC3072m9 interfaceC3072m9, ContinuationImpl continuationImpl) throws Throwable {
        go goVar;
        Map linkedHashMap;
        long jCurrentTimeMillis;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        String str4;
        String str5;
        Ne ne;
        C3149pb c3149pb;
        Ne ne2;
        long j;
        InterfaceC3072m9 interfaceC3072m10;
        InterfaceC3072m9 interfaceC3072m11;
        InterfaceC3072m9 interfaceC3072m12 = interfaceC3072m9;
        if (continuationImpl instanceof go) {
            goVar = (go) continuationImpl;
            int i = goVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                goVar.i = i - Integer.MIN_VALUE;
            } else {
                goVar = new go(this, continuationImpl);
            }
        } else {
            goVar = new go(this, continuationImpl);
        }
        Object objA = goVar.g;
        Object objBeachfront = attabal.beachfront();
        int i2 = goVar.i;
        if (i2 == 0) {
            dern.saneness(objA);
            C2809bo c2809bo = c;
            if (c2809bo == null || c2809bo.a == null) {
                if (interfaceC3072m12 == null) {
                    return null;
                }
                ((C3097n9) interfaceC3072m12).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + c2809bo + " for URL: " + str);
                return null;
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                String mimeTypeFromExtension = F3.a(fileExtensionFromUrl) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
                String str6 = (mimeTypeFromExtension == null || mimeTypeFromExtension.length() == 0) ? "text/html" : mimeTypeFromExtension;
                if (interfaceC3072m12 != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        str4 = "WebResourceHandler";
                        try {
                            try {
                                sb.append("mimeType is ");
                                sb.append(str6);
                                sb.append(" for ");
                                sb.append(str);
                                String string = sb.toString();
                                try {
                                    C3097n9 c3097n9 = (C3097n9) interfaceC3072m12;
                                    obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                                    str2 = str4;
                                    try {
                                        try {
                                            c3097n9.a(str2, string);
                                        } catch (Exception e) {
                                            e = e;
                                            obj = obj2;
                                            linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                                            if (interfaceC3072m12 != null) {
                                                ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                            }
                                            linkedHashMap.put("networkType", C3342x5.m());
                                            linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                                            Wj wj = Wj.a;
                                            Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                                            return null;
                                        }
                                    } catch (TimeoutCancellationException e2) {
                                        e = e2;
                                        obj = obj2;
                                        str3 = str;
                                        linkedHashMap.put(obj, igo.attabal.beachfront((short) 2193));
                                        if (interfaceC3072m12 != null) {
                                            ((C3097n9) interfaceC3072m12).a(str2, "Timeout occurred for url: " + str3, e);
                                        }
                                        linkedHashMap.put("networkType", C3342x5.m());
                                        linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                                        Wj wj2 = Wj.a;
                                        Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                                        return null;
                                    }
                                } catch (TimeoutCancellationException e3) {
                                    e = e3;
                                    obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                                    str2 = str4;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                                str2 = str4;
                                obj = obj2;
                                linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                                if (interfaceC3072m12 != null) {
                                    ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                }
                                linkedHashMap.put("networkType", C3342x5.m());
                                linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                                Wj wj3 = Wj.a;
                                Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                                return null;
                            }
                        } catch (TimeoutCancellationException e5) {
                            e = e5;
                            obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                            str2 = str4;
                        }
                    } catch (TimeoutCancellationException e6) {
                        e = e6;
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str2 = "WebResourceHandler";
                    } catch (Exception e7) {
                        e = e7;
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str2 = "WebResourceHandler";
                    }
                } else {
                    obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                    str2 = "WebResourceHandler";
                }
                try {
                    InputStream inputStreamA = c2809bo.a(str, interfaceC3072m12);
                    if (inputStreamA != null) {
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).a(str2, "Found in cache: " + str);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("url", str);
                        Wj wj4 = Wj.a;
                        Wj.b("ResourceCacheHit", linkedHashMap2, EnumC2779ak.SDK);
                        return F3.a(inputStreamA, str6);
                    }
                    C3149pb c3149pb2 = b;
                    ho hoVar = new ho(str, interfaceC3072m12, null);
                    goVar.a = str;
                    goVar.b = interfaceC3072m12;
                    goVar.c = linkedHashMap;
                    goVar.d = str6;
                    goVar.f = jCurrentTimeMillis;
                    goVar.i = 1;
                    objA = c3149pb2.a(str, hoVar, goVar);
                    if (objA != objBeachfront) {
                        str3 = str;
                        str5 = str6;
                        walach walachVar = (walach) objA;
                        str4 = str2;
                        long jMax = ((long) Math.max(1, a().getMaxRetries())) * ((long) a().getTimeout());
                        io ioVar = new io(interfaceC3072m12, str3, walachVar, null);
                        goVar.a = str3;
                        goVar.b = interfaceC3072m12;
                        goVar.c = linkedHashMap;
                        goVar.d = str5;
                        goVar.f = jCurrentTimeMillis;
                        goVar.i = 2;
                        objA = TimeoutKt.dern(jMax, ioVar, goVar);
                        if (objA == objBeachfront) {
                            ne = (Ne) objA;
                            if (interfaceC3072m12 != null) {
                                str2 = str4;
                                ((C3097n9) interfaceC3072m12).c(str2, "Response received for url: " + str3);
                            } else {
                                str2 = str4;
                            }
                            c3149pb = b;
                            goVar.a = str3;
                            goVar.b = interfaceC3072m12;
                            goVar.c = linkedHashMap;
                            goVar.d = str5;
                            goVar.e = ne;
                            goVar.f = jCurrentTimeMillis;
                            goVar.i = 3;
                            if (c3149pb.a(str3, goVar) != objBeachfront) {
                                ne2 = ne;
                                if (ne2 == null) {
                                }
                                if (interfaceC3072m12 != null) {
                                    ((C3097n9) interfaceC3072m12).b(str2, "onFailedResponse: " + str3 + " " + ne2);
                                }
                                obj = obj2;
                                linkedHashMap.put(obj, igo.attabal.beachfront((short) 2194));
                            }
                        }
                    }
                    return objBeachfront;
                } catch (TimeoutCancellationException e8) {
                    e = e8;
                    obj = obj2;
                    str3 = str;
                }
            } catch (TimeoutCancellationException e9) {
                e = e9;
                obj = IronSourceConstants.EVENTS_ERROR_CODE;
                str2 = "WebResourceHandler";
            } catch (Exception e10) {
                e = e10;
                obj = IronSourceConstants.EVENTS_ERROR_CODE;
                str2 = "WebResourceHandler";
                linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                if (interfaceC3072m12 != null) {
                    ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                }
                linkedHashMap.put("networkType", C3342x5.m());
                linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                Wj wj5 = Wj.a;
                Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                return null;
            }
        } else if (i2 == 1) {
            j = goVar.f;
            str5 = goVar.d;
            linkedHashMap = goVar.c;
            interfaceC3072m10 = goVar.b;
            str3 = goVar.a;
            try {
                dern.saneness(objA);
                obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                str2 = "WebResourceHandler";
                jCurrentTimeMillis = j;
                interfaceC3072m12 = interfaceC3072m10;
                try {
                    walach walachVar2 = (walach) objA;
                    str4 = str2;
                    try {
                        long jMax2 = ((long) Math.max(1, a().getMaxRetries())) * ((long) a().getTimeout());
                        io ioVar2 = new io(interfaceC3072m12, str3, walachVar2, null);
                        goVar.a = str3;
                        goVar.b = interfaceC3072m12;
                        goVar.c = linkedHashMap;
                        goVar.d = str5;
                        goVar.f = jCurrentTimeMillis;
                        goVar.i = 2;
                        objA = TimeoutKt.dern(jMax2, ioVar2, goVar);
                        if (objA == objBeachfront) {
                            ne = (Ne) objA;
                            if (interfaceC3072m12 != null) {
                                str2 = str4;
                                ((C3097n9) interfaceC3072m12).c(str2, "Response received for url: " + str3);
                            } else {
                                str2 = str4;
                            }
                            c3149pb = b;
                            goVar.a = str3;
                            goVar.b = interfaceC3072m12;
                            goVar.c = linkedHashMap;
                            goVar.d = str5;
                            goVar.e = ne;
                            goVar.f = jCurrentTimeMillis;
                            goVar.i = 3;
                            if (c3149pb.a(str3, goVar) != objBeachfront) {
                                ne2 = ne;
                                if (ne2 == null) {
                                }
                                if (interfaceC3072m12 != null) {
                                    ((C3097n9) interfaceC3072m12).b(str2, "onFailedResponse: " + str3 + " " + ne2);
                                }
                                obj = obj2;
                                linkedHashMap.put(obj, igo.attabal.beachfront((short) 2194));
                            }
                        }
                        return objBeachfront;
                    } catch (TimeoutCancellationException e11) {
                        e = e11;
                        str2 = str4;
                        obj = obj2;
                    } catch (Exception e12) {
                        e = e12;
                        str2 = str4;
                        obj = obj2;
                        linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                        }
                        linkedHashMap.put("networkType", C3342x5.m());
                        linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                        Wj wj6 = Wj.a;
                        Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                        return null;
                    }
                } catch (TimeoutCancellationException e13) {
                    e = e13;
                    obj = obj2;
                }
            } catch (TimeoutCancellationException e14) {
                e = e14;
                obj = IronSourceConstants.EVENTS_ERROR_CODE;
                str2 = "WebResourceHandler";
                jCurrentTimeMillis = j;
                interfaceC3072m12 = interfaceC3072m10;
            } catch (Exception e15) {
                e = e15;
                interfaceC3072m11 = interfaceC3072m10;
                obj = IronSourceConstants.EVENTS_ERROR_CODE;
                str2 = "WebResourceHandler";
                jCurrentTimeMillis = j;
                interfaceC3072m12 = interfaceC3072m11;
                linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                if (interfaceC3072m12 != null) {
                    ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                }
                linkedHashMap.put("networkType", C3342x5.m());
                linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                Wj wj7 = Wj.a;
                Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                return null;
            }
        } else {
            if (i2 == 2) {
                j = goVar.f;
                str5 = goVar.d;
                Map map = goVar.c;
                interfaceC3072m11 = goVar.b;
                String str7 = goVar.a;
                try {
                    dern.saneness(objA);
                    obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                    str4 = "WebResourceHandler";
                    jCurrentTimeMillis = j;
                    interfaceC3072m12 = interfaceC3072m11;
                    str3 = str7;
                    linkedHashMap = map;
                    ne = (Ne) objA;
                    if (interfaceC3072m12 != null) {
                        str2 = str4;
                        ((C3097n9) interfaceC3072m12).c(str2, "Response received for url: " + str3);
                    } else {
                        str2 = str4;
                    }
                    c3149pb = b;
                    goVar.a = str3;
                    goVar.b = interfaceC3072m12;
                    goVar.c = linkedHashMap;
                    goVar.d = str5;
                    goVar.e = ne;
                    goVar.f = jCurrentTimeMillis;
                    goVar.i = 3;
                    if (c3149pb.a(str3, goVar) != objBeachfront) {
                        ne2 = ne;
                        if (ne2 == null) {
                        }
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).b(str2, "onFailedResponse: " + str3 + " " + ne2);
                        }
                        obj = obj2;
                        linkedHashMap.put(obj, igo.attabal.beachfront((short) 2194));
                    }
                    return objBeachfront;
                } catch (TimeoutCancellationException e16) {
                    e = e16;
                    str3 = str7;
                    linkedHashMap = map;
                    interfaceC3072m10 = interfaceC3072m11;
                    obj = IronSourceConstants.EVENTS_ERROR_CODE;
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j;
                    interfaceC3072m12 = interfaceC3072m10;
                } catch (Exception e17) {
                    e = e17;
                    linkedHashMap = map;
                    obj = IronSourceConstants.EVENTS_ERROR_CODE;
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j;
                    interfaceC3072m12 = interfaceC3072m11;
                    linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                    if (interfaceC3072m12 != null) {
                        ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                    }
                    linkedHashMap.put("networkType", C3342x5.m());
                    linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                    Wj wj8 = Wj.a;
                    Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                    return null;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = goVar.f;
                ne2 = goVar.e;
                str5 = goVar.d;
                linkedHashMap = goVar.c;
                interfaceC3072m10 = goVar.b;
                String str8 = goVar.a;
                try {
                    dern.saneness(objA);
                    str3 = str8;
                    obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j;
                    interfaceC3072m12 = interfaceC3072m10;
                    if (ne2 == null && AbstractC2935gl.a(ne2) && ne2.d().string(Charsets.UTF_8).length() > 0) {
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).c(str2, "onSuccessfulResponse: " + str3);
                        }
                        linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                        linkedHashMap.put("size", igo.attabal.marial(((long) ne2.b().c) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
                        linkedHashMap.put("networkType", C3342x5.m());
                        Wj wj9 = Wj.a;
                        Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                        IntRange intRange = Se.a;
                        Intrinsics.checkNotNullParameter(ne2, "<this>");
                        return F3.a(new ByteArrayInputStream(ne2.d().toByteArray()), str5);
                    }
                    if (interfaceC3072m12 != null) {
                        ((C3097n9) interfaceC3072m12).b(str2, "onFailedResponse: " + str3 + " " + ne2);
                    }
                    obj = obj2;
                    try {
                        linkedHashMap.put(obj, igo.attabal.beachfront((short) 2194));
                    } catch (TimeoutCancellationException e18) {
                        e = e18;
                        linkedHashMap.put(obj, igo.attabal.beachfront((short) 2193));
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).a(str2, "Timeout occurred for url: " + str3, e);
                        }
                    } catch (Exception e19) {
                        e = e19;
                        linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                        if (interfaceC3072m12 != null) {
                            ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                        }
                    }
                } catch (TimeoutCancellationException e20) {
                    e = e20;
                    str3 = str8;
                    obj = IronSourceConstants.EVENTS_ERROR_CODE;
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j;
                    interfaceC3072m12 = interfaceC3072m10;
                } catch (Exception e21) {
                    e = e21;
                    obj = IronSourceConstants.EVENTS_ERROR_CODE;
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j;
                    interfaceC3072m12 = interfaceC3072m10;
                    linkedHashMap.put(obj, igo.attabal.beachfront((short) 2195));
                    if (interfaceC3072m12 != null) {
                        ((C3097n9) interfaceC3072m12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                    }
                    linkedHashMap.put("networkType", C3342x5.m());
                    linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
                    Wj wj10 = Wj.a;
                    Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
                    return null;
                }
            }
            obj = IronSourceConstants.EVENTS_ERROR_CODE;
            str2 = "WebResourceHandler";
            jCurrentTimeMillis = j;
            interfaceC3072m12 = interfaceC3072m10;
            linkedHashMap.put(obj, igo.attabal.beachfront((short) 2193));
            if (interfaceC3072m12 != null) {
                ((C3097n9) interfaceC3072m12).a(str2, "Timeout occurred for url: " + str3, e);
            }
        }
        linkedHashMap.put("networkType", C3342x5.m());
        linkedHashMap.put("latency", igo.attabal.marial(System.currentTimeMillis() - jCurrentTimeMillis));
        Wj wj11 = Wj.a;
        Wj.b("ResourceCacheMiss", linkedHashMap, EnumC2779ak.SDK);
        return null;
    }

    public static walach a(String str, InterfaceC3072m9 interfaceC3072m9) {
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("WebResourceHandler", "downloadResourceFile(): " + str);
        }
        return ((C3271u9) He.d.getValue()).a(new Je(str, null, new C3158pk(a().getTimeout(), a().getTimeout(), a().getTimeout()), null, new Ai(500L, a().getMaxRetries()), false, 42));
    }
}
