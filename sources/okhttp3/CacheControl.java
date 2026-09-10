package okhttp3;

import android.support.v4.media.a;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int maxAge, TimeUnit timeUnit) {
            Intrinsics.f(timeUnit, "timeUnit");
            if (maxAge < 0) {
                throw new IllegalArgumentException(a.h(maxAge, "maxAge < 0: ").toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
            return this;
        }

        public final Builder maxStale(int maxStale, TimeUnit timeUnit) {
            Intrinsics.f(timeUnit, "timeUnit");
            if (maxStale < 0) {
                throw new IllegalArgumentException(a.h(maxStale, "maxStale < 0: ").toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
            return this;
        }

        public final Builder minFresh(int minFresh, TimeUnit timeUnit) {
            Intrinsics.f(timeUnit, "timeUnit");
            if (minFresh < 0) {
                throw new IllegalArgumentException(a.h(minFresh, "minFresh < 0: ").toString());
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (StringsKt.m(str2, str.charAt(i2))) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return companion.indexOfElement(str, str2, i2);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00df  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:44:0x0100  */
        /* JADX WARN: Code duplicated, block: B:46:0x0108  */
        /* JADX WARN: Code duplicated, block: B:47:0x010f  */
        /* JADX WARN: Code duplicated, block: B:49:0x0117  */
        /* JADX WARN: Code duplicated, block: B:50:0x011e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0126  */
        /* JADX WARN: Code duplicated, block: B:53:0x012e  */
        /* JADX WARN: Code duplicated, block: B:55:0x0136  */
        /* JADX WARN: Code duplicated, block: B:56:0x013e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0146  */
        /* JADX WARN: Code duplicated, block: B:59:0x014c  */
        /* JADX WARN: Code duplicated, block: B:61:0x0155  */
        /* JADX WARN: Code duplicated, block: B:62:0x015e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0166  */
        /* JADX WARN: Code duplicated, block: B:65:0x016f  */
        /* JADX WARN: Code duplicated, block: B:67:0x0177  */
        @JvmStatic
        public final CacheControl parse(Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            boolean z2;
            String string;
            int i2;
            String string2;
            Headers headers2 = headers;
            Intrinsics.f(headers2, "headers");
            int size = headers2.size();
            boolean z3 = true;
            boolean z4 = true;
            int i3 = 0;
            String str = null;
            boolean z5 = false;
            boolean z6 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (i3 < size) {
                String strName = headers2.name(i3);
                String strValue = headers2.value(i3);
                if (StringsKt.r(strName, "Cache-Control", z3)) {
                    if (str == null) {
                        str = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        z2 = z3;
                        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = StringsKt.a0(strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length()) {
                            i2 = size;
                            if (strValue.charAt(iIndexOfElement2) == ',' && strValue.charAt(iIndexOfElement2) != ';') {
                                int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                                if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                    iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                    String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                    Intrinsics.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = StringsKt.a0(strSubstring2).toString();
                                } else {
                                    int i4 = iIndexOfNonWhitespace + 1;
                                    int iU = StringsKt.u(strValue, AbstractJsonLexerKt.STRING, i4, 4);
                                    string2 = strValue.substring(i4, iU);
                                    Intrinsics.e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iIndexOfElement = iU + 1;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z5 = z3;
                            } else if ("no-store".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z6 = z3;
                            } else {
                                if ("max-age".equalsIgnoreCase(string)) {
                                    nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(string)) {
                                    nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                } else if ("private".equalsIgnoreCase(string)) {
                                    z3 = z2;
                                    z7 = z3;
                                } else if ("public".equalsIgnoreCase(string)) {
                                    z3 = z2;
                                    z8 = z3;
                                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                    z3 = z2;
                                    z9 = z3;
                                } else if ("max-stale".equalsIgnoreCase(string)) {
                                    nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(string)) {
                                    nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                    z3 = z2;
                                    z10 = z3;
                                } else if ("no-transform".equalsIgnoreCase(string)) {
                                    z3 = z2;
                                    z11 = z3;
                                } else if ("immutable".equalsIgnoreCase(string)) {
                                    z3 = z2;
                                    z12 = z3;
                                }
                                z3 = z2;
                            }
                            size = i2;
                        } else {
                            i2 = size;
                        }
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z5 = z3;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z6 = z3;
                        } else {
                            if ("max-age".equalsIgnoreCase(string)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z7 = z3;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z8 = z3;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z9 = z3;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z10 = z3;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z11 = z3;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z12 = z3;
                            }
                            z3 = z2;
                        }
                        size = i2;
                    }
                    i3++;
                    headers2 = headers;
                    z3 = z3;
                    size = size;
                } else {
                    if (StringsKt.r(strName, "Pragma", z3)) {
                    }
                    i3++;
                    headers2 = headers;
                    z3 = z3;
                    size = size;
                }
                z4 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring3 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    z2 = z3;
                    Intrinsics.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt.a0(strSubstring3).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        i2 = size;
                        if (strValue.charAt(iIndexOfElement2) == ',') {
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z5 = z3;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z6 = z3;
                        } else {
                            if ("max-age".equalsIgnoreCase(string)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z7 = z3;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z8 = z3;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z9 = z3;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z10 = z3;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z11 = z3;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z3 = z2;
                                z12 = z3;
                            }
                            z3 = z2;
                        }
                        size = i2;
                    } else {
                        i2 = size;
                    }
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z3 = z2;
                        z5 = z3;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = z2;
                        z6 = z3;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z7 = z3;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z8 = z3;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z9 = z3;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z10 = z3;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z11 = z3;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z3 = z2;
                            z12 = z3;
                        }
                        z3 = z2;
                    }
                    size = i2;
                }
                i3++;
                headers2 = headers;
                z3 = z3;
                size = size;
            }
            return new CacheControl(z5, z6, nonNegativeInt, nonNegativeInt2, z7, z8, z9, nonNegativeInt3, nonNegativeInt4, z10, z11, z12, !z4 ? null : str, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, i2, i3, z4, z5, z6, i4, i5, z7, z8, z9, str);
    }

    @JvmStatic
    public static final CacheControl parse(Headers headers) {
        return INSTANCE.parse(headers);
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @Deprecated
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
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    private CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.noCache = z2;
        this.noStore = z3;
        this.maxAgeSeconds = i2;
        this.sMaxAgeSeconds = i3;
        this.isPrivate = z4;
        this.isPublic = z5;
        this.mustRevalidate = z6;
        this.maxStaleSeconds = i4;
        this.minFreshSeconds = i5;
        this.onlyIfCached = z7;
        this.noTransform = z8;
        this.immutable = z9;
        this.headerValue = str;
    }
}
