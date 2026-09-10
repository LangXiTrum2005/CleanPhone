package okhttp3;

import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u0000 (2\u00020\u0001:\u0002\u0016\u001aBs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lokhttp3/wireman;", "", "", "noCache", "noStore", "", "maxAgeSeconds", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "attabal", "Z", "impromptu", "()Z", "saneness", "taiyuan", "dern", "I", "wireman", "()I", "formularize", "marial", "beachfront", "competently", "cutely", "apical", "impassible", "Ljava/lang/String;", "triweekly", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final boolean noTransform;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean noCache;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final boolean isPublic;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final boolean mustRevalidate;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final boolean onlyIfCached;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int maxAgeSeconds;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final boolean immutable;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public String headerValue;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final int maxStaleSeconds;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final boolean isPrivate;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean noStore;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final int minFreshSeconds;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final wireman f34703kowloon = new attabal().wireman().attabal();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final wireman f34702arytenoidectomy = new attabal().beachfront().dern(Integer.MAX_VALUE, TimeUnit.SECONDS).attabal();

    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0007*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015¨\u0006!"}, d2 = {"Lokhttp3/wireman$attabal;", "", "<init>", "()V", "wireman", "()Lokhttp3/wireman$attabal;", "marial", "", "maxStale", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "dern", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/wireman$attabal;", "beachfront", "Lokhttp3/wireman;", "attabal", "()Lokhttp3/wireman;", "", "saneness", "(J)I", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "competently", "noTransform", "impromptu", "immutable", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public boolean noCache;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public boolean onlyIfCached;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public boolean noTransform;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public boolean immutable;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public boolean noStore;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public int maxAgeSeconds = -1;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public int maxStaleSeconds = -1;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public int minFreshSeconds = -1;

        public final wireman attabal() {
            return new wireman(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final attabal beachfront() {
            this.onlyIfCached = true;
            return this;
        }

        public final attabal dern(int maxStale, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (maxStale < 0) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("maxStale < 0: ", Integer.valueOf(maxStale)).toString());
            }
            this.maxStaleSeconds = saneness(timeUnit.toSeconds(maxStale));
            return this;
        }

        public final attabal marial() {
            this.noStore = true;
            return this;
        }

        public final int saneness(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final attabal wireman() {
            this.noCache = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: okhttp3.wireman$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/wireman$saneness;", "", "<init>", "()V", "Lokhttp3/molybdenite;", "headers", "Lokhttp3/wireman;", "saneness", "(Lokhttp3/molybdenite;)Lokhttp3/wireman;", "", "characters", "", "startIndex", "attabal", "(Ljava/lang/String;Ljava/lang/String;I)I", "FORCE_CACHE", "Lokhttp3/wireman;", "FORCE_NETWORK", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                if (StringsKt.splinterproof(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004d  */
        /* JADX WARN: Code duplicated, block: B:21:0x007c  */
        /* JADX WARN: Code duplicated, block: B:39:0x0106  */
        /* JADX WARN: Code duplicated, block: B:42:0x0114  */
        /* JADX WARN: Code duplicated, block: B:54:0x0156  */
        /* JADX WARN: Code duplicated, block: B:57:0x0164  */
        /* JADX WARN: Code duplicated, block: B:75:0x00e1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x0191 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00e9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x011c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x012c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x013c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x016d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x017f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00fe A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x010e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x014e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x015e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0189 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0177 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0146 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x0134 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0124 A[SYNTHETIC] */
        public final wireman saneness(molybdenite headers) {
            int iAttabal;
            int iAttabal2;
            String string;
            boolean z;
            String string2;
            molybdenite headers2 = headers;
            Intrinsics.checkNotNullParameter(headers2, "headers");
            int size = headers2.size();
            boolean z2 = true;
            boolean z3 = true;
            int i = 0;
            String str = null;
            boolean z4 = false;
            boolean z5 = false;
            int iOverspeculate = -1;
            int iOverspeculate2 = -1;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int iOverspeculate3 = -1;
            int iOverspeculate4 = -1;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (i < size) {
                int i2 = i + 1;
                String strWireman = headers2.wireman(i);
                String strImpromptu = headers2.impromptu(i);
                if (p002kotlin.text.dovishness.stratoscope(strWireman, "Cache-Control", z2)) {
                    if (str == null) {
                        str = strImpromptu;
                    }
                    iAttabal = 0;
                    while (iAttabal < strImpromptu.length()) {
                        iAttabal2 = attabal(strImpromptu, "=,;", iAttabal);
                        String strSubstring = strImpromptu.substring(iAttabal, iAttabal2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = StringsKt.stupefactive(strSubstring).toString();
                        z = z2;
                        if (iAttabal2 != strImpromptu.length() || strImpromptu.charAt(iAttabal2) == ',' || strImpromptu.charAt(iAttabal2) == ';') {
                            strImpromptu = strImpromptu;
                            iAttabal = iAttabal2 + 1;
                            string2 = null;
                        } else {
                            int iOilcan = hereditist.wireman.oilcan(strImpromptu, iAttabal2 + 1);
                            if (iOilcan >= strImpromptu.length() || strImpromptu.charAt(iOilcan) != '\"') {
                                strImpromptu = strImpromptu;
                                iAttabal = attabal(strImpromptu, ",;", iOilcan);
                                String strSubstring2 = strImpromptu.substring(iOilcan, iAttabal);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = StringsKt.stupefactive(strSubstring2).toString();
                            } else {
                                int i3 = iOilcan + 1;
                                String str2 = strImpromptu;
                                int iNosophobia = StringsKt.nosophobia(str2, '\"', i3, false, 4, null);
                                strImpromptu = str2;
                                String strSubstring3 = strImpromptu.substring(i3, iNosophobia);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                iAttabal = iNosophobia + 1;
                                string2 = strSubstring3;
                            }
                        }
                        if (p002kotlin.text.dovishness.stratoscope("no-cache", string, z)) {
                            z4 = z;
                            z2 = z4;
                        } else if (p002kotlin.text.dovishness.stratoscope("no-store", string, z)) {
                            z5 = z;
                            z2 = z5;
                        } else {
                            if (p002kotlin.text.dovishness.stratoscope("max-age", string, z)) {
                                iOverspeculate = hereditist.wireman.overspeculate(string2, -1);
                            } else if (p002kotlin.text.dovishness.stratoscope("s-maxage", string, z)) {
                                iOverspeculate2 = hereditist.wireman.overspeculate(string2, -1);
                            } else if (p002kotlin.text.dovishness.stratoscope("private", string, z)) {
                                z6 = z;
                                z2 = z6;
                            } else if (p002kotlin.text.dovishness.stratoscope("public", string, z)) {
                                z7 = z;
                                z2 = z7;
                            } else if (p002kotlin.text.dovishness.stratoscope("must-revalidate", string, z)) {
                                z8 = z;
                                z2 = z8;
                            } else if (p002kotlin.text.dovishness.stratoscope("max-stale", string, z)) {
                                iOverspeculate3 = hereditist.wireman.overspeculate(string2, Integer.MAX_VALUE);
                            } else if (p002kotlin.text.dovishness.stratoscope("min-fresh", string, z)) {
                                iOverspeculate4 = hereditist.wireman.overspeculate(string2, -1);
                            } else if (p002kotlin.text.dovishness.stratoscope("only-if-cached", string, z)) {
                                z9 = z;
                                z2 = z9;
                            } else if (p002kotlin.text.dovishness.stratoscope("no-transform", string, z)) {
                                z10 = z;
                                z2 = z10;
                            } else if (p002kotlin.text.dovishness.stratoscope("immutable", string, z)) {
                                z11 = z;
                                z2 = z11;
                            }
                            z2 = z;
                        }
                    }
                    headers2 = headers;
                    i = i2;
                } else {
                    if (p002kotlin.text.dovishness.stratoscope(strWireman, "Pragma", z2)) {
                    }
                    headers2 = headers;
                    i = i2;
                }
                z3 = false;
                iAttabal = 0;
                while (iAttabal < strImpromptu.length()) {
                    iAttabal2 = attabal(strImpromptu, "=,;", iAttabal);
                    String strSubstring4 = strImpromptu.substring(iAttabal, iAttabal2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt.stupefactive(strSubstring4).toString();
                    z = z2;
                    if (iAttabal2 != strImpromptu.length()) {
                        strImpromptu = strImpromptu;
                        iAttabal = iAttabal2 + 1;
                        string2 = null;
                    } else {
                        strImpromptu = strImpromptu;
                        iAttabal = iAttabal2 + 1;
                        string2 = null;
                    }
                    if (p002kotlin.text.dovishness.stratoscope("no-cache", string, z)) {
                        z4 = z;
                        z2 = z4;
                    } else if (p002kotlin.text.dovishness.stratoscope("no-store", string, z)) {
                        z5 = z;
                        z2 = z5;
                    } else {
                        if (p002kotlin.text.dovishness.stratoscope("max-age", string, z)) {
                            iOverspeculate = hereditist.wireman.overspeculate(string2, -1);
                        } else if (p002kotlin.text.dovishness.stratoscope("s-maxage", string, z)) {
                            iOverspeculate2 = hereditist.wireman.overspeculate(string2, -1);
                        } else if (p002kotlin.text.dovishness.stratoscope("private", string, z)) {
                            z6 = z;
                            z2 = z6;
                        } else if (p002kotlin.text.dovishness.stratoscope("public", string, z)) {
                            z7 = z;
                            z2 = z7;
                        } else if (p002kotlin.text.dovishness.stratoscope("must-revalidate", string, z)) {
                            z8 = z;
                            z2 = z8;
                        } else if (p002kotlin.text.dovishness.stratoscope("max-stale", string, z)) {
                            iOverspeculate3 = hereditist.wireman.overspeculate(string2, Integer.MAX_VALUE);
                        } else if (p002kotlin.text.dovishness.stratoscope("min-fresh", string, z)) {
                            iOverspeculate4 = hereditist.wireman.overspeculate(string2, -1);
                        } else if (p002kotlin.text.dovishness.stratoscope("only-if-cached", string, z)) {
                            z9 = z;
                            z2 = z9;
                        } else if (p002kotlin.text.dovishness.stratoscope("no-transform", string, z)) {
                            z10 = z;
                            z2 = z10;
                        } else if (p002kotlin.text.dovishness.stratoscope("immutable", string, z)) {
                            z11 = z;
                            z2 = z11;
                        }
                        z2 = z;
                    }
                }
                headers2 = headers;
                i = i2;
            }
            return new wireman(z4, z5, iOverspeculate, iOverspeculate2, z6, z7, z8, iOverspeculate3, iOverspeculate4, z9, z10, z11, !z3 ? null : str, null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ wireman(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (getNoCache()) {
            sb.append("no-cache, ");
        }
        if (getNoStore()) {
            sb.append("no-store, ");
        }
        if (getMaxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(getMaxAgeSeconds());
            sb.append(", ");
        }
        if (getSMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(getSMaxAgeSeconds());
            sb.append(", ");
        }
        if (getIsPrivate()) {
            sb.append("private, ");
        }
        if (getIsPublic()) {
            sb.append("public, ");
        }
        if (getMustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (getMaxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(getMaxStaleSeconds());
            sb.append(", ");
        }
        if (getMinFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(getMinFreshSeconds());
            sb.append(", ");
        }
        if (getOnlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (getNoTransform()) {
            sb.append("no-transform, ");
        }
        if (getImmutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public wireman(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }
}
