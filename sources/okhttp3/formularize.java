package okhttp3;

import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 (2\u00020\u0001:\u0001\u001cBQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u0004\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\r\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b*\u0010'¨\u0006+"}, d2 = {"Lokhttp3/formularize;", "", "", "name", "value", "", "expiresAt", X3.j.D, "path", "", "secure", "httpOnly", "persistent", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "forObsoleteRfc2965", "formularize", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "attabal", "J", "beachfront", "()J", "saneness", "marial", "dern", "taiyuan", "wireman", "Z", "apical", "()Z", "impromptu", "cutely", "competently", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long expiresAt;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final boolean persistent;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final boolean hostOnly;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String path;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final boolean httpOnly;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final String domain;
    private final String value;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final boolean secure;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final Pattern f34232taiyuan = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Pattern f34229cutely = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Pattern f34228apical = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final Pattern f34230formularize = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: okhttp3.formularize$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001c\u0010,\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001c\u0010-\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u0006."}, d2 = {"Lokhttp3/formularize$attabal;", "", "<init>", "()V", "Lokhttp3/graveside;", "url", "", "setCookie", "Lokhttp3/formularize;", "dern", "(Lokhttp3/graveside;Ljava/lang/String;)Lokhttp3/formularize;", "", "currentTimeMillis", "wireman", "(JLokhttp3/graveside;Ljava/lang/String;)Lokhttp3/formularize;", "Lokhttp3/molybdenite;", "headers", "", "marial", "(Lokhttp3/graveside;Lokhttp3/molybdenite;)Ljava/util/List;", "urlHost", X3.j.D, "", "saneness", "(Ljava/lang/String;Ljava/lang/String;)Z", "s", "", "pos", "limit", "competently", "(Ljava/lang/String;II)J", "input", "invert", "attabal", "(Ljava/lang/String;IIZ)I", "impromptu", "(Ljava/lang/String;)J", "beachfront", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                int i = pos + 1;
                char cCharAt = input.charAt(pos);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos = i;
            }
            return limit;
        }

        public final String beachfront(String s) {
            if (p002kotlin.text.dovishness.cuirassed(s, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strMarial = hereditist.attabal.marial(StringsKt.hardpan(s, "."));
            if (strMarial != null) {
                return strMarial;
            }
            throw new IllegalArgumentException();
        }

        public final long competently(String s, int pos, int limit) {
            int iAttabal = attabal(s, pos, limit, false);
            Matcher matcher = formularize.f34230formularize.matcher(s);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int iLotta = -1;
            int i4 = -1;
            int i5 = -1;
            while (iAttabal < limit) {
                int iAttabal2 = attabal(s, iAttabal + 1, limit, true);
                matcher.region(iAttabal, iAttabal2);
                if (i2 == -1 && matcher.usePattern(formularize.f34230formularize).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i2 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i4 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i5 = Integer.parseInt(strGroup3);
                } else if (i3 == -1 && matcher.usePattern(formularize.f34228apical).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup4);
                } else if (iLotta == -1 && matcher.usePattern(formularize.f34229cutely).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = formularize.f34229cutely.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iLotta = StringsKt.lotta(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i == -1 && matcher.usePattern(formularize.f34232taiyuan).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i = Integer.parseInt(strGroup6);
                }
                iAttabal = attabal(s, iAttabal2 + 1, limit, false);
            }
            if (70 <= i && i < 100) {
                i += 1900;
            }
            if (i >= 0 && i < 70) {
                i += 2000;
            }
            if (i < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iLotta == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i3 || i3 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i2 < 0 || i2 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i4 < 0 || i4 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i5 < 0 || i5 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(hereditist.wireman.f27718beachfront);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i);
            gregorianCalendar.set(2, iLotta - 1);
            gregorianCalendar.set(5, i3);
            gregorianCalendar.set(11, i2);
            gregorianCalendar.set(12, i4);
            gregorianCalendar.set(13, i5);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final formularize dern(graveside url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return wireman(System.currentTimeMillis(), url, setCookie);
        }

        public final long impromptu(String s) {
            try {
                long j = Long.parseLong(s);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e) {
                if (new Regex("-?\\d+").matches(s)) {
                    return p002kotlin.text.dovishness.starveling(s, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        public final List<formularize> marial(graveside url, molybdenite headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> listTaiyuan = headers.taiyuan("Set-Cookie");
            int size = listTaiyuan.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                formularize formularizeVarDern = dern(url, listTaiyuan.get(i));
                if (formularizeVarDern != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(formularizeVarDern);
                }
                i = i2;
            }
            if (arrayList == null) {
                return p002kotlin.collections.adultoid.formularize();
            }
            List<formularize> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        public final boolean saneness(String urlHost, String domain) {
            if (Intrinsics.wireman(urlHost, domain)) {
                return true;
            }
            return p002kotlin.text.dovishness.cuirassed(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !hereditist.wireman.taiyuan(urlHost);
        }

        public final formularize wireman(long currentTimeMillis, graveside url, String setCookie) {
            long j;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iPolloi = hereditist.wireman.polloi(setCookie, ';', 0, 0, 6, null);
            int iPolloi2 = hereditist.wireman.polloi(setCookie, '=', 0, iPolloi, 2, null);
            formularize formularizeVar = null;
            if (iPolloi2 == iPolloi) {
                return null;
            }
            String strDent = hereditist.wireman.dent(setCookie, 0, iPolloi2, 1, null);
            if (strDent.length() == 0 || hereditist.wireman.preprohormone(strDent) != -1) {
                return null;
            }
            String strClubfoot = hereditist.wireman.clubfoot(setCookie, iPolloi2 + 1, iPolloi);
            if (hereditist.wireman.preprohormone(strClubfoot) != -1) {
                return null;
            }
            int i = iPolloi + 1;
            int length = setCookie.length();
            String strBeachfront = null;
            String str = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long jImpromptu = -1;
            long jCompetently = DatesKt.MAX_DATE;
            while (i < length) {
                int iArytenoidectomy = hereditist.wireman.arytenoidectomy(setCookie, ';', i, length);
                int iArytenoidectomy2 = hereditist.wireman.arytenoidectomy(setCookie, '=', i, iArytenoidectomy);
                String strClubfoot2 = hereditist.wireman.clubfoot(setCookie, i, iArytenoidectomy2);
                String strClubfoot3 = iArytenoidectomy2 < iArytenoidectomy ? hereditist.wireman.clubfoot(setCookie, iArytenoidectomy2 + 1, iArytenoidectomy) : "";
                formularize formularizeVar2 = formularizeVar;
                if (p002kotlin.text.dovishness.stratoscope(strClubfoot2, "expires", true)) {
                    try {
                        jCompetently = competently(strClubfoot3, 0, strClubfoot3.length());
                        z2 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (p002kotlin.text.dovishness.stratoscope(strClubfoot2, "max-age", true)) {
                    jImpromptu = impromptu(strClubfoot3);
                    z2 = true;
                } else if (p002kotlin.text.dovishness.stratoscope(strClubfoot2, X3.j.D, true)) {
                    strBeachfront = beachfront(strClubfoot3);
                    z4 = false;
                } else if (p002kotlin.text.dovishness.stratoscope(strClubfoot2, "path", true)) {
                    str = strClubfoot3;
                } else if (p002kotlin.text.dovishness.stratoscope(strClubfoot2, "secure", true)) {
                    z3 = true;
                } else if (p002kotlin.text.dovishness.stratoscope(strClubfoot2, "httponly", true)) {
                    z = true;
                }
                i = iArytenoidectomy + 1;
                formularizeVar = formularizeVar2;
            }
            formularize formularizeVar3 = formularizeVar;
            if (jImpromptu == Long.MIN_VALUE) {
                j = Long.MIN_VALUE;
            } else if (jImpromptu != -1) {
                long j2 = currentTimeMillis + (jImpromptu <= 9223372036854775L ? jImpromptu * ((long) 1000) : Long.MAX_VALUE);
                j = (j2 < currentTimeMillis || j2 > DatesKt.MAX_DATE) ? 253402300799999L : j2;
            } else {
                j = jCompetently;
            }
            String host = url.getHost();
            if (strBeachfront == null) {
                strBeachfront = host;
            } else if (!saneness(host, strBeachfront)) {
                return formularizeVar3;
            }
            if (host.length() != strBeachfront.length() && PublicSuffixDatabase.INSTANCE.dern().dern(strBeachfront) == null) {
                return formularizeVar3;
            }
            String strSubstring = "/";
            if (str == null || !p002kotlin.text.dovishness.starveling(str, "/", false, 2, formularizeVar3)) {
                String strWireman = url.wireman();
                int iSensatory = StringsKt.sensatory(strWireman, '/', 0, false, 6, null);
                if (iSensatory != 0) {
                    strSubstring = strWireman.substring(0, iSensatory);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new formularize(strDent, strClubfoot, j, strBeachfront, str, z3, z, z2, z4, null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ formularize(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    public boolean equals(Object other) {
        if (!(other instanceof formularize)) {
            return false;
        }
        formularize formularizeVar = (formularize) other;
        return Intrinsics.wireman(formularizeVar.name, this.name) && Intrinsics.wireman(formularizeVar.value, this.value) && formularizeVar.expiresAt == this.expiresAt && Intrinsics.wireman(formularizeVar.domain, this.domain) && Intrinsics.wireman(formularizeVar.path, this.path) && formularizeVar.secure == this.secure && formularizeVar.httpOnly == this.httpOnly && formularizeVar.persistent == this.persistent && formularizeVar.hostOnly == this.hostOnly;
    }

    public final String formularize(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append('=');
        sb.append(getValue());
        if (getPersistent()) {
            if (getExpiresAt() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(paddywack.dern.saneness(new Date(getExpiresAt())));
            }
        }
        if (!getHostOnly()) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(getDomain());
        }
        sb.append("; path=");
        sb.append(getPath());
        if (getSecure()) {
            sb.append("; secure");
        }
        if (getHttpOnly()) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: name, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public String toString() {
        return formularize(false);
    }

    /* JADX INFO: renamed from: value, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public formularize(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }
}
