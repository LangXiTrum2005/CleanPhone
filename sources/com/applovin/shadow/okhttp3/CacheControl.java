package com.applovin.shadow.okhttp3;

import an.h;
import an.p;
import com.applovin.shadow.okhttp3.internal.Util;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lcom/applovin/shadow/okhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", InAppPurchaseConstants.METHOD_TO_STRING, "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/applovin/shadow/okhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", InAppPurchaseConstants.METHOD_BUILD, "Lcom/applovin/shadow/okhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j10) {
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int maxAge, TimeUnit timeUnit) {
            n.f(timeUnit, "timeUnit");
            if (maxAge < 0) {
                throw new IllegalArgumentException(d.e(maxAge, "maxAge < 0: ").toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
            return this;
        }

        public final Builder maxStale(int maxStale, TimeUnit timeUnit) {
            n.f(timeUnit, "timeUnit");
            if (maxStale < 0) {
                throw new IllegalArgumentException(d.e(maxStale, "maxStale < 0: ").toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
            return this;
        }

        public final Builder minFresh(int minFresh, TimeUnit timeUnit) {
            n.f(timeUnit, "timeUnit");
            if (minFresh < 0) {
                throw new IllegalArgumentException(d.e(minFresh, "minFresh < 0: ").toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(minFresh));
            return this;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/applovin/shadow/okhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lcom/applovin/shadow/okhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lcom/applovin/shadow/okhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (h.r0(str2, str.charAt(i10))) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.indexOfElement(str, str2, i10);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:17:0x0069  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:46:0x0103  */
        /* JADX WARN: Code duplicated, block: B:47:0x0109  */
        /* JADX WARN: Code duplicated, block: B:49:0x0111  */
        /* JADX WARN: Code duplicated, block: B:50:0x0117  */
        /* JADX WARN: Code duplicated, block: B:52:0x011f  */
        /* JADX WARN: Code duplicated, block: B:53:0x0125  */
        /* JADX WARN: Code duplicated, block: B:55:0x012d  */
        /* JADX WARN: Code duplicated, block: B:56:0x0135  */
        /* JADX WARN: Code duplicated, block: B:58:0x013d  */
        /* JADX WARN: Code duplicated, block: B:59:0x0143  */
        /* JADX WARN: Code duplicated, block: B:61:0x014c  */
        /* JADX WARN: Code duplicated, block: B:62:0x0153  */
        /* JADX WARN: Code duplicated, block: B:64:0x015b  */
        /* JADX WARN: Code duplicated, block: B:65:0x0162  */
        /* JADX WARN: Code duplicated, block: B:67:0x016a  */
        public final CacheControl parse(Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            String string;
            int i10;
            String string2;
            Headers headers2 = headers;
            n.f(headers2, "headers");
            int size = headers2.size();
            int i11 = 0;
            boolean z10 = true;
            String str = null;
            boolean z11 = false;
            boolean z12 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            while (i11 < size) {
                String strName = headers2.name(i11);
                String strValue = headers2.value(i11);
                if (p.i0(strName, "Cache-Control")) {
                    if (str == null) {
                        str = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = h.T0(strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length()) {
                            i10 = size;
                            if (strValue.charAt(iIndexOfElement2) == ',' && strValue.charAt(iIndexOfElement2) != ';') {
                                int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                                if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                    iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                    String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                    n.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = h.T0(strSubstring2).toString();
                                } else {
                                    int i12 = iIndexOfNonWhitespace + 1;
                                    int iV0 = h.v0(strValue, '\"', i12, 4);
                                    string2 = strValue.substring(i12, iV0);
                                    n.e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iIndexOfElement = iV0 + 1;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(string)) {
                                z11 = true;
                            } else if ("no-store".equalsIgnoreCase(string)) {
                                z12 = true;
                            } else if ("max-age".equalsIgnoreCase(string)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z13 = true;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z14 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z15 = true;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z16 = true;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z17 = true;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z18 = true;
                            }
                            size = i10;
                        } else {
                            i10 = size;
                        }
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z11 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z12 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z13 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z14 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z15 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z16 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z17 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z18 = true;
                        }
                        size = i10;
                    }
                    i11++;
                    headers2 = headers;
                    size = size;
                } else {
                    if (p.i0(strName, "Pragma")) {
                    }
                    i11++;
                    headers2 = headers;
                    size = size;
                }
                z10 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring3 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    n.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = h.T0(strSubstring3).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        i10 = size;
                        if (strValue.charAt(iIndexOfElement2) == ',') {
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z11 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z12 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z13 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z14 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z15 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z16 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z17 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z18 = true;
                        }
                        size = i10;
                    } else {
                        i10 = size;
                    }
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z11 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z12 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z13 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z14 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z15 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z16 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z17 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z18 = true;
                    }
                    size = i10;
                }
                i11++;
                headers2 = headers;
                size = size;
            }
            return new CacheControl(z11, z12, nonNegativeInt, nonNegativeInt2, z13, z14, z15, nonNegativeInt3, nonNegativeInt4, z16, z17, z18, !z10 ? null : str, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, g gVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public static final CacheControl parse(Headers headers) {
        return INSTANCE.parse(headers);
    }

    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        n.e(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    private CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }
}
