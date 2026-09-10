package okhttp3;

import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.A5;
import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jacoco.core.runtime.AgentOptions;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\u0018\u0000 \u001c2\u00020\u0001:\u0002'*Bc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b\u0004\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u0005\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b\f\u0010\u0017R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(R\u0017\u0010:\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0011\u0010;\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b5\u0010\u0017R\u0011\u0010<\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0011\u0010=\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b.\u00104R\u0013\u0010?\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0013\u0010A\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b@\u0010\u0017R\u0013\u0010B\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b*\u0010\u0017¨\u0006C"}, d2 = {"Lokhttp3/graveside;", "", "", "scheme", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", "host", "", AgentOptions.PORT, "", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "adultoid", "()Ljava/net/URL;", "Ljava/net/URI;", "graveside", "()Ljava/net/URI;", "monoploid", "()Ljava/lang/String;", "link", "polloi", "(Ljava/lang/String;)Lokhttp3/graveside;", "Lokhttp3/graveside$attabal;", "apical", "()Lokhttp3/graveside$attabal;", "formularize", "(Ljava/lang/String;)Lokhttp3/graveside$attabal;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "attabal", "Ljava/lang/String;", "molybdenite", "saneness", "dern", "wireman", "taiyuan", "marial", "I", "kowloon", "beachfront", "Ljava/util/List;", "triweekly", "()Ljava/util/List;", "competently", "impromptu", "cutely", "Z", "()Z", "isHttps", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "arytenoidectomy", "query", "encodedFragment", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class graveside {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final char[] f34261formularize = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String scheme;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final List<String> pathSegments;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final List<String> queryNamesAndValues;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final boolean isHttps;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String password;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final String fragment;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final int port;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final String username;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final String host;

    /* JADX INFO: compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 M2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001aJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010\u001aJ\u001f\u0010(\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\u0000H\u0000¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010/2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b5\u00106R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u00107\u001a\u0004\b8\u00103\"\u0004\b9\u0010:R\"\u0010=\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u00107\u001a\u0004\b;\u00103\"\u0004\b<\u0010:R\"\u0010@\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00107\u001a\u0004\b>\u00103\"\u0004\b?\u0010:R$\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u00107\u001a\u0004\bA\u00103\"\u0004\bB\u0010:R\"\u0010!\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010C\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010FR \u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR,\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010I\u001a\u0004\bM\u0010K\"\u0004\bN\u0010OR$\u0010R\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u00107\u001a\u0004\bH\u00103\"\u0004\bQ\u0010:¨\u0006S"}, d2 = {"Lokhttp3/graveside$attabal;", "", "<init>", "()V", "", "wireman", "()I", "", "input", "startPos", "limit", "", "gintrap", "(Ljava/lang/String;II)V", "pos", "", "addTrailingSlash", "alreadyEncoded", "adultoid", "(Ljava/lang/String;IIZZ)V", "kowloon", "(Ljava/lang/String;)Z", "arytenoidectomy", "molybdenite", "scheme", "rotuma", "(Ljava/lang/String;)Lokhttp3/graveside$attabal;", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "sealless", "password", "polloi", "host", "triweekly", AgentOptions.PORT, "graveside", "(I)Lokhttp3/graveside$attabal;", "encodedQuery", "marial", "name", "value", "saneness", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/graveside$attabal;", "encodedName", "encodedValue", "attabal", "dovishness", "()Lokhttp3/graveside$attabal;", "Lokhttp3/graveside;", "dern", "()Lokhttp3/graveside;", "toString", "()Ljava/lang/String;", "base", "monoploid", "(Lokhttp3/graveside;Ljava/lang/String;)Lokhttp3/graveside$attabal;", "Ljava/lang/String;", "impassible", "yemenite", "(Ljava/lang/String;)V", "cutely", "stratoscope", "encodedUsername", "competently", "cord", "encodedPassword", "apical", "trm", "I", "formularize", "oilcan", "(I)V", "", "beachfront", "Ljava/util/List;", "impromptu", "()Ljava/util/List;", "encodedPathSegments", "taiyuan", "cuirassed", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "preprohormone", "encodedFragment", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public String scheme;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final List<String> encodedPathSegments;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public List<String> encodedQueryNamesAndValues;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public String encodedFragment;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public String host;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public String encodedUsername = "";

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public String encodedPassword = "";

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public int port = -1;

        /* JADX INFO: renamed from: okhttp3.graveside$attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: HttpUrl.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/graveside$attabal$attabal;", "", "<init>", "()V", "", "input", "", "pos", "limit", "competently", "(Ljava/lang/String;II)I", "impromptu", "beachfront", "marial", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int beachfront(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos >= limit) {
                                break;
                            }
                        } while (input.charAt(pos) != ']');
                    } else if (cCharAt == ':') {
                        return pos;
                    }
                    pos++;
                }
                return limit;
            }

            public final int competently(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((Intrinsics.taiyuan(cCharAt, 97) >= 0 && Intrinsics.taiyuan(cCharAt, 122) <= 0) || (Intrinsics.taiyuan(cCharAt, 65) >= 0 && Intrinsics.taiyuan(cCharAt, 90) <= 0)) {
                    int i = pos + 1;
                    while (i < limit) {
                        int i2 = i + 1;
                        char cCharAt2 = input.charAt(i);
                        if (('a' <= cCharAt2 && cCharAt2 < '{') || (('A' <= cCharAt2 && cCharAt2 < '[') || (('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                            i = i2;
                        } else if (cCharAt2 == ':') {
                            return i;
                        }
                    }
                }
                return -1;
            }

            public final int impromptu(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }

            public final int marial(String input, int pos, int limit) {
                try {
                    int i = Integer.parseInt(Companion.saneness(graveside.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 > i || i >= 65536) {
                        return -1;
                    }
                    return i;
                } catch (NumberFormatException unused) {
                }
            }

            public Companion() {
            }
        }

        public attabal() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        public final void adultoid(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strSaneness = Companion.saneness(graveside.INSTANCE, input, pos, limit, HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
            if (kowloon(strSaneness)) {
                return;
            }
            if (arytenoidectomy(strSaneness)) {
                molybdenite();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strSaneness);
            } else {
                this.encodedPathSegments.add(strSaneness);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        /* JADX INFO: renamed from: apical, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        public final boolean arytenoidectomy(String input) {
            return Intrinsics.wireman(input, "..") || p002kotlin.text.dovishness.stratoscope(input, "%2e.", true) || p002kotlin.text.dovishness.stratoscope(input, ".%2e", true) || p002kotlin.text.dovishness.stratoscope(input, "%2e%2e", true);
        }

        public final attabal attabal(String encodedName, String encodedValue) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (taiyuan() == null) {
                cuirassed(new ArrayList());
            }
            List<String> listTaiyuan = taiyuan();
            Intrinsics.beachfront(listTaiyuan);
            Companion companion = graveside.INSTANCE;
            listTaiyuan.add(Companion.saneness(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> listTaiyuan2 = taiyuan();
            Intrinsics.beachfront(listTaiyuan2);
            listTaiyuan2.add(encodedValue == null ? null : Companion.saneness(companion, encodedValue, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        /* JADX INFO: renamed from: beachfront, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* JADX INFO: renamed from: competently, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final void cord(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final void cuirassed(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        /* JADX INFO: renamed from: cutely, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        public final graveside dern() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = graveside.INSTANCE;
            String strImpromptu = Companion.impromptu(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strImpromptu2 = Companion.impromptu(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iWireman = wireman();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.impromptu(graveside.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 == null) {
                arrayList = null;
            } else {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 == null ? null : Companion.impromptu(graveside.INSTANCE, str3, 0, 0, true, 3, null));
                }
                arrayList = arrayList3;
            }
            String str4 = this.encodedFragment;
            return new graveside(str, strImpromptu, strImpromptu2, str2, iWireman, arrayList2, arrayList, str4 != null ? Companion.impromptu(graveside.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final attabal dovishness() {
            String host = getHost();
            trm(host == null ? null : new Regex("[\"<>^`{|}]").replace(host, ""));
            int size = impromptu().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                impromptu().set(i2, Companion.saneness(graveside.INSTANCE, impromptu().get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, Sdk$SDKError.Reason.INVALID_CSB_DATA_VALUE, null));
            }
            List<String> listTaiyuan = taiyuan();
            if (listTaiyuan != null) {
                int size2 = listTaiyuan.size();
                while (i < size2) {
                    int i3 = i + 1;
                    String str = listTaiyuan.get(i);
                    listTaiyuan.set(i, str == null ? null : Companion.saneness(graveside.INSTANCE, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, Opcodes.MONITOREXIT, null));
                    i = i3;
                }
            }
            String encodedFragment = getEncodedFragment();
            preprohormone(encodedFragment != null ? Companion.saneness(graveside.INSTANCE, encodedFragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, Opcodes.IF_ICMPGT, null) : null);
            return this;
        }

        /* JADX INFO: renamed from: formularize, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public final void gintrap(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i = startPos;
            while (i < limit) {
                int iMonoploid = hereditist.wireman.monoploid(input, "/\\", i, limit);
                boolean z = iMonoploid < limit;
                input = input;
                adultoid(input, i, iMonoploid, z, true);
                i = z ? iMonoploid + 1 : iMonoploid;
            }
        }

        public final attabal graveside(int port) {
            if (1 > port || port >= 65536) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("unexpected port: ", Integer.valueOf(port)).toString());
            }
            oilcan(port);
            return this;
        }

        /* JADX INFO: renamed from: impassible, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final List<String> impromptu() {
            return this.encodedPathSegments;
        }

        public final boolean kowloon(String input) {
            return Intrinsics.wireman(input, ".") || p002kotlin.text.dovishness.stratoscope(input, "%2e", true);
        }

        public final attabal marial(String encodedQuery) {
            Companion companion;
            String strSaneness;
            List<String> listCutely = null;
            if (encodedQuery != null && (strSaneness = Companion.saneness((companion = graveside.INSTANCE), encodedQuery, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) != null) {
                listCutely = companion.cutely(strSaneness);
            }
            cuirassed(listCutely);
            return this;
        }

        public final void molybdenite() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        public final attabal monoploid(graveside base, String input) {
            int iMonoploid;
            int i;
            boolean z;
            int i2;
            int i3;
            int i4;
            char c;
            int i5;
            String input2 = input;
            Intrinsics.checkNotNullParameter(input2, "input");
            int iCuirassed = hereditist.wireman.cuirassed(input2, 0, 0, 3, null);
            int iTrm = hereditist.wireman.trm(input2, iCuirassed, 0, 2, null);
            Companion companion = INSTANCE;
            int iCompetently = companion.competently(input2, iCuirassed, iTrm);
            String str = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z2 = true;
            int i6 = -1;
            if (iCompetently != -1) {
                if (p002kotlin.text.dovishness.saran(input2, "https:", iCuirassed, true)) {
                    this.scheme = HttpRequest.DEFAULT_SCHEME;
                    iCuirassed += 6;
                } else {
                    if (!p002kotlin.text.dovishness.saran(input2, "http:", iCuirassed, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input2.substring(0, iCompetently);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    iCuirassed += 5;
                }
            } else {
                if (base == null) {
                    throw new IllegalArgumentException(Intrinsics.arytenoidectomy("Expected URL scheme 'http' or 'https' but no scheme was found for ", input2.length() > 6 ? Intrinsics.arytenoidectomy(p002kotlin.text.cord.miliaria(input2, 6), "...") : input2));
                }
                this.scheme = base.getScheme();
            }
            int iImpromptu = companion.impromptu(input2, iCuirassed, iTrm);
            int i7 = 63;
            int i8 = 35;
            if (iImpromptu >= 2 || base == null || !Intrinsics.wireman(base.getScheme(), this.scheme)) {
                int i9 = iCuirassed + iImpromptu;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    iMonoploid = hereditist.wireman.monoploid(input2, "@/\\?#", i9, iTrm);
                    int iCharAt = iMonoploid != iTrm ? input2.charAt(iMonoploid) : i6;
                    if (iCharAt == i6 || iCharAt == i8 || iCharAt == 47 || iCharAt == 92 || iCharAt == i7) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z3) {
                            z = z2;
                            i2 = i6;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            input2 = input;
                            i3 = iMonoploid;
                            sb2.append(Companion.saneness(graveside.INSTANCE, input2, i9, iMonoploid, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int iArytenoidectomy = hereditist.wireman.arytenoidectomy(input2, ':', i9, iMonoploid);
                            Companion companion2 = graveside.INSTANCE;
                            i2 = i6;
                            z = z2;
                            String strSaneness = Companion.saneness(companion2, input2, i9, iArytenoidectomy, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                            if (z4) {
                                strSaneness = this.encodedUsername + "%40" + strSaneness;
                            }
                            this.encodedUsername = strSaneness;
                            if (iArytenoidectomy != iMonoploid) {
                                i4 = iMonoploid;
                                this.encodedPassword = Companion.saneness(companion2, input, iArytenoidectomy + 1, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                                z3 = z;
                            } else {
                                i4 = iMonoploid;
                            }
                            input2 = input;
                            i3 = i4;
                            z4 = z;
                        }
                        i9 = i3 + 1;
                        i6 = i2;
                        iTrm = iTrm;
                        str = str;
                        z2 = z;
                        i7 = 63;
                        i8 = 35;
                    }
                }
                i = iTrm;
                String str2 = str;
                int i10 = i6;
                Companion companion3 = INSTANCE;
                int iBeachfront = companion3.beachfront(input2, i9, iMonoploid);
                int i11 = iBeachfront + 1;
                if (i11 < iMonoploid) {
                    this.host = hereditist.attabal.marial(Companion.impromptu(graveside.INSTANCE, input2, i9, iBeachfront, false, 4, null));
                    int iMarial = companion3.marial(input2, i11, iMonoploid);
                    this.port = iMarial;
                    if (iMarial == i10) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input2.substring(i11, iMonoploid);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str2);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = graveside.INSTANCE;
                    this.host = hereditist.attabal.marial(Companion.impromptu(companion4, input2, i9, iBeachfront, false, 4, null));
                    String str3 = this.scheme;
                    Intrinsics.beachfront(str3);
                    this.port = companion4.dern(str3);
                }
                if (this.host == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input2.substring(i9, iBeachfront);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str2);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iCuirassed = iMonoploid;
            } else {
                this.encodedUsername = base.competently();
                this.encodedPassword = base.dern();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.marial());
                if (iCuirassed == iTrm || input2.charAt(iCuirassed) == '#') {
                    marial(base.beachfront());
                }
                i = iTrm;
            }
            int i12 = i;
            int iMonoploid2 = hereditist.wireman.monoploid(input2, "?#", iCuirassed, i12);
            gintrap(input2, iCuirassed, iMonoploid2);
            if (iMonoploid2 >= i12 || input2.charAt(iMonoploid2) != '?') {
                c = '#';
                i5 = iMonoploid2;
            } else {
                c = '#';
                int iArytenoidectomy2 = hereditist.wireman.arytenoidectomy(input2, '#', iMonoploid2, i12);
                Companion companion5 = graveside.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.cutely(Companion.saneness(companion5, input2, iMonoploid2 + 1, iArytenoidectomy2, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, null));
                i5 = iArytenoidectomy2;
            }
            if (i5 < i12 && input2.charAt(i5) == c) {
                this.encodedFragment = Companion.saneness(graveside.INSTANCE, input2, i5 + 1, i12, "", true, false, false, true, null, Opcodes.ARETURN, null);
            }
            return this;
        }

        public final void oilcan(int i) {
            this.port = i;
        }

        public final attabal polloi(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            cord(Companion.saneness(graveside.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final void preprohormone(String str) {
            this.encodedFragment = str;
        }

        public final attabal rotuma(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (p002kotlin.text.dovishness.stratoscope(scheme, "http", true)) {
                yemenite("http");
                return this;
            }
            if (!p002kotlin.text.dovishness.stratoscope(scheme, HttpRequest.DEFAULT_SCHEME, true)) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("unexpected scheme: ", scheme));
            }
            yemenite(HttpRequest.DEFAULT_SCHEME);
            return this;
        }

        public final attabal saneness(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (taiyuan() == null) {
                cuirassed(new ArrayList());
            }
            List<String> listTaiyuan = taiyuan();
            Intrinsics.beachfront(listTaiyuan);
            Companion companion = graveside.INSTANCE;
            listTaiyuan.add(Companion.saneness(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Sdk$SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            List<String> listTaiyuan2 = taiyuan();
            Intrinsics.beachfront(listTaiyuan2);
            listTaiyuan2.add(value == null ? null : Companion.saneness(companion, value, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Sdk$SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            return this;
        }

        public final attabal sealless(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            stratoscope(Companion.saneness(graveside.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final void stratoscope(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final List<String> taiyuan() {
            return this.encodedQueryNamesAndValues;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (getScheme() != null) {
                sb.append(getScheme());
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (getEncodedUsername().length() > 0 || getEncodedPassword().length() > 0) {
                sb.append(getEncodedUsername());
                if (getEncodedPassword().length() > 0) {
                    sb.append(':');
                    sb.append(getEncodedPassword());
                }
                sb.append('@');
            }
            if (getHost() != null) {
                String host = getHost();
                Intrinsics.beachfront(host);
                if (StringsKt.splinterproof(host, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(getHost());
                    sb.append(']');
                } else {
                    sb.append(getHost());
                }
            }
            if (getPort() != -1 || getScheme() != null) {
                int iWireman = wireman();
                if (getScheme() != null) {
                    Companion companion = graveside.INSTANCE;
                    String scheme = getScheme();
                    Intrinsics.beachfront(scheme);
                    if (iWireman != companion.dern(scheme)) {
                        sb.append(':');
                        sb.append(iWireman);
                    }
                } else {
                    sb.append(':');
                    sb.append(iWireman);
                }
            }
            Companion companion2 = graveside.INSTANCE;
            companion2.taiyuan(impromptu(), sb);
            if (taiyuan() != null) {
                sb.append('?');
                List<String> listTaiyuan = taiyuan();
                Intrinsics.beachfront(listTaiyuan);
                companion2.apical(listTaiyuan, sb);
            }
            if (getEncodedFragment() != null) {
                sb.append('#');
                sb.append(getEncodedFragment());
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final attabal triweekly(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strMarial = hereditist.attabal.marial(Companion.impromptu(graveside.INSTANCE, host, 0, 0, false, 7, null));
            if (strMarial == null) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("unexpected host: ", host));
            }
            trm(strMarial);
            return this;
        }

        public final void trm(String str) {
            this.host = str;
        }

        public final int wireman() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = graveside.INSTANCE;
            String str = this.scheme;
            Intrinsics.beachfront(str);
            return companion.dern(str);
        }

        public final void yemenite(String str) {
            this.scheme = str;
        }
    }

    /* JADX INFO: renamed from: okhttp3.graveside$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00040\t2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011*\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0014*\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J1\u0010\u001c\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJc\u0010$\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b$\u0010%J3\u0010(\u001a\u00020\r*\u00020&2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J]\u0010-\u001a\u00020\r*\u00020&2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u00100R\u0014\u00107\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u00100R\u0014\u00108\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00100R\u0014\u00109\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u00100R\u0014\u0010:\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00100R\u0014\u0010;\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00100R\u0014\u0010<\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u00100R\u0014\u0010=\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00100¨\u0006>"}, d2 = {"Lokhttp3/graveside$saneness;", "", "<init>", "()V", "", "scheme", "", "dern", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "", "taiyuan", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "apical", "", "cutely", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/graveside;", "wireman", "(Ljava/lang/String;)Lokhttp3/graveside;", "beachfront", "pos", "limit", "", "plusIsSpace", "competently", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", A5.N, "attabal", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "Lduvetyn/wireman;", "encoded", "impassible", "(Lduvetyn/wireman;Ljava/lang/String;IIZ)V", "marial", "(Ljava/lang/String;II)Z", "input", "formularize", "(Lduvetyn/wireman;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String impromptu(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.competently(str, i, i2, z);
        }

        public static /* synthetic */ String saneness(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 8) != 0) {
                z = false;
            }
            if ((i3 & 16) != 0) {
                z2 = false;
            }
            if ((i3 & 32) != 0) {
                z3 = false;
            }
            if ((i3 & 64) != 0) {
                z4 = false;
            }
            if ((i3 & 128) != 0) {
                charset = null;
            }
            return companion.attabal(str, i, i2, str2, z, z2, z3, z4, charset);
        }

        public final void apical(List<String> list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, list.size()), 2);
            int first = attabalVarArytenoidectomy.getFirst();
            int last = attabalVarArytenoidectomy.getLast();
            int step = attabalVarArytenoidectomy.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                int i = first + step;
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first = i;
                }
            }
        }

        public final String attabal(String str, int i, int i2, String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt.splinterproof(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z || (z2 && !marial(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                    duvetyn.wireman wiremanVar = new duvetyn.wireman();
                    wiremanVar.writeUtf8(str, i, iCharCount);
                    formularize(wiremanVar, str, iCharCount, i2, encodeSet, z, z2, z3, z4, charset);
                    return wiremanVar.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final graveside beachfront(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return wireman(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String competently(String str, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    duvetyn.wireman wiremanVar = new duvetyn.wireman();
                    wiremanVar.writeUtf8(str, i, i3);
                    impassible(wiremanVar, str, i3, i2, z);
                    return wiremanVar.readUtf8();
                }
                i3 = i4;
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final List<String> cutely(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                String str2 = str;
                int iNosophobia = StringsKt.nosophobia(str2, '&', i, false, 4, null);
                if (iNosophobia == -1) {
                    iNosophobia = str2.length();
                }
                int iNosophobia2 = StringsKt.nosophobia(str2, '=', i, false, 4, null);
                if (iNosophobia2 == -1 || iNosophobia2 > iNosophobia) {
                    String strSubstring = str2.substring(i, iNosophobia);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i, iNosophobia2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iNosophobia2 + 1, iNosophobia);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iNosophobia + 1;
                str = str2;
            }
            return arrayList;
        }

        public final int dern(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.wireman(scheme, "http")) {
                return 80;
            }
            return Intrinsics.wireman(scheme, HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        }

        public final void formularize(duvetyn.wireman wiremanVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            int iCharCount = i;
            duvetyn.wireman wiremanVar2 = null;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z3) {
                        wiremanVar.writeUtf8(z ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z4)) {
                            if (!StringsKt.splinterproof(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z && (!z2 || marial(str, iCharCount, i2))))) {
                                wiremanVar.monroe(iCodePointAt);
                            }
                        }
                        if (wiremanVar2 == null) {
                            wiremanVar2 = new duvetyn.wireman();
                        }
                        if (charset == null || Intrinsics.wireman(charset, StandardCharsets.UTF_8)) {
                            wiremanVar2.monroe(iCodePointAt);
                        } else {
                            wiremanVar2.gusty(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!wiremanVar2.exhausted()) {
                            byte b = wiremanVar2.readByte();
                            int i3 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            wiremanVar.writeByte(37);
                            wiremanVar.writeByte(graveside.f34261formularize[(i3 >> 4) & 15]);
                            wiremanVar.writeByte(graveside.f34261formularize[b & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        public final void impassible(duvetyn.wireman wiremanVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int iRestrictive = hereditist.wireman.restrictive(str.charAt(i + 1));
                    int iRestrictive2 = hereditist.wireman.restrictive(str.charAt(i3));
                    if (iRestrictive == -1 || iRestrictive2 == -1) {
                        wiremanVar.monroe(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        wiremanVar.writeByte((iRestrictive << 4) + iRestrictive2);
                        i = Character.charCount(iCodePointAt) + i3;
                    }
                } else if (iCodePointAt == 43 && z) {
                    wiremanVar.writeByte(32);
                    i++;
                } else {
                    wiremanVar.monroe(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        public final boolean marial(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && hereditist.wireman.restrictive(str.charAt(i + 1)) != -1 && hereditist.wireman.restrictive(str.charAt(i3)) != -1;
        }

        public final void taiyuan(List<String> list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(list.get(i));
            }
        }

        public final graveside wireman(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new attabal().monoploid(null, str).dern();
        }

        public Companion() {
        }
    }

    public graveside(String scheme, String username, String password, String host, int i, List<String> pathSegments, List<String> list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = Intrinsics.wireman(scheme, HttpRequest.DEFAULT_SCHEME);
    }

    public static final graveside impassible(String str) {
        return INSTANCE.beachfront(str);
    }

    public static final graveside impromptu(String str) {
        return INSTANCE.wireman(str);
    }

    public final URL adultoid() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final attabal apical() {
        attabal attabalVar = new attabal();
        attabalVar.yemenite(this.scheme);
        attabalVar.stratoscope(competently());
        attabalVar.cord(dern());
        attabalVar.trm(this.host);
        attabalVar.oilcan(this.port != INSTANCE.dern(this.scheme) ? this.port : -1);
        attabalVar.impromptu().clear();
        attabalVar.impromptu().addAll(marial());
        attabalVar.marial(beachfront());
        attabalVar.preprohormone(saneness());
        return attabalVar;
    }

    public final String arytenoidectomy() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.apical(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String beachfront() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iNosophobia = StringsKt.nosophobia(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iNosophobia, hereditist.wireman.arytenoidectomy(str, '#', iNosophobia, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String competently() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, hereditist.wireman.monoploid(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final String dern() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(StringsKt.nosophobia(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, StringsKt.nosophobia(this.url, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object other) {
        return (other instanceof graveside) && Intrinsics.wireman(((graveside) other).url, this.url);
    }

    public final attabal formularize(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new attabal().monoploid(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final URI graveside() {
        String string = apical().dovishness().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    public final List<String> marial() {
        int iNosophobia = StringsKt.nosophobia(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iMonoploid = hereditist.wireman.monoploid(str, "?#", iNosophobia, str.length());
        ArrayList arrayList = new ArrayList();
        while (iNosophobia < iMonoploid) {
            int i = iNosophobia + 1;
            int iArytenoidectomy = hereditist.wireman.arytenoidectomy(this.url, '/', i, iMonoploid);
            String strSubstring = this.url.substring(i, iArytenoidectomy);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iNosophobia = iArytenoidectomy;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    public final String monoploid() {
        attabal attabalVarFormularize = formularize("/...");
        Intrinsics.beachfront(attabalVarFormularize);
        return attabalVarFormularize.sealless("").polloi("").dern().getUrl();
    }

    public final graveside polloi(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        attabal attabalVarFormularize = formularize(link);
        if (attabalVarFormularize == null) {
            return null;
        }
        return attabalVarFormularize.dern();
    }

    public final String saneness() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(StringsKt.nosophobia(this.url, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final List<String> triweekly() {
        return this.pathSegments;
    }

    public final String wireman() {
        int iNosophobia = StringsKt.nosophobia(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        String strSubstring = this.url.substring(iNosophobia, hereditist.wireman.monoploid(str, "?#", iNosophobia, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
