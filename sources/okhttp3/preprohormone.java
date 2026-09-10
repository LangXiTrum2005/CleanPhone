package okhttp3;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3460cc;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001 BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b \u0010,R*\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b'\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00100R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00107\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b$\u00106¨\u00068"}, d2 = {"Lokhttp3/preprohormone;", "", "Lokhttp3/graveside;", "url", "", "method", "Lokhttp3/molybdenite;", "headers", "Lokhttp3/cord;", "body", "", "Ljava/lang/Class;", "tags", "<init>", "(Lokhttp3/graveside;Ljava/lang/String;Lokhttp3/molybdenite;Lokhttp3/cord;Ljava/util/Map;)V", "name", "wireman", "(Ljava/lang/String;)Ljava/lang/String;", "", "marial", "(Ljava/lang/String;)Ljava/util/List;", "cutely", "()Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "type", "apical", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/preprohormone$attabal;", "taiyuan", "()Lokhttp3/preprohormone$attabal;", "toString", "()Ljava/lang/String;", "attabal", "Lokhttp3/graveside;", "formularize", "()Lokhttp3/graveside;", "saneness", "Ljava/lang/String;", "impromptu", "dern", "Lokhttp3/molybdenite;", "beachfront", "()Lokhttp3/molybdenite;", "Lokhttp3/cord;", "()Lokhttp3/cord;", "Ljava/util/Map;", "()Ljava/util/Map;", "Lokhttp3/wireman;", "Lokhttp3/wireman;", "lazyCacheControl", "", "competently", "()Z", "isHttps", "()Lokhttp3/wireman;", "cacheControl", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final graveside url;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public wireman lazyCacheControl;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final molybdenite headers;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Map<Class<?>, Object> tags;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final String method;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final cord body;

    public preprohormone(graveside url, String method, molybdenite headers, cord cordVar, Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = cordVar;
        this.tags = tags;
    }

    public final <T> T apical(Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.tags.get(type));
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final cord getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final molybdenite getHeaders() {
        return this.headers;
    }

    public final boolean competently() {
        return this.url.getIsHttps();
    }

    public final Object cutely() {
        return apical(Object.class);
    }

    public final Map<Class<?>, Object> dern() {
        return this.tags;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final graveside getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final List<String> marial(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.taiyuan(name);
    }

    public final wireman saneness() {
        wireman wiremanVar = this.lazyCacheControl;
        if (wiremanVar != null) {
            return wiremanVar;
        }
        wireman wiremanVarSaneness = wireman.INSTANCE.saneness(this.headers);
        this.lazyCacheControl = wiremanVarSaneness;
        return wiremanVarSaneness;
    }

    public final attabal taiyuan() {
        return new attabal(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(getMethod());
        sb.append(", url=");
        sb.append(getUrl());
        if (getHeaders().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : getHeaders()) {
                int i2 = i + 1;
                if (i < 0) {
                    p002kotlin.collections.adultoid.dovishness();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(':');
                sb.append(strComponent2);
                i = i2;
            }
            sb.append(']');
        }
        if (!dern().isEmpty()) {
            sb.append(", tags=");
            sb.append(dern());
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String wireman(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.saneness(name);
    }

    /* JADX INFO: compiled from: Request.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b*\u0010+J/\u0010/\u001a\u00020\u0000\"\u0004\b\u0000\u0010,2\u000e\u0010.\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000-2\b\u0010)\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00102R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010&\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0018\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR2\u0010N\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030-\u0012\u0004\u0012\u00020\u00010H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lokhttp3/preprohormone$attabal;", "", "<init>", "()V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "(Lokhttp3/preprohormone;)V", "Lokhttp3/graveside;", "url", "dovishness", "(Lokhttp3/graveside;)Lokhttp3/preprohormone$attabal;", "", "graveside", "(Ljava/lang/String;)Lokhttp3/preprohormone$attabal;", "Ljava/net/URL;", "adultoid", "(Ljava/net/URL;)Lokhttp3/preprohormone$attabal;", "name", "value", "impromptu", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/preprohormone$attabal;", "attabal", "formularize", "Lokhttp3/molybdenite;", "headers", "taiyuan", "(Lokhttp3/molybdenite;)Lokhttp3/preprohormone$attabal;", "Lokhttp3/wireman;", "cacheControl", "dern", "(Lokhttp3/wireman;)Lokhttp3/preprohormone$attabal;", "wireman", "()Lokhttp3/preprohormone$attabal;", "competently", "Lokhttp3/cord;", "body", "apical", "(Lokhttp3/cord;)Lokhttp3/preprohormone$attabal;", "method", "cutely", "(Ljava/lang/String;Lokhttp3/cord;)Lokhttp3/preprohormone$attabal;", "tag", "molybdenite", "(Ljava/lang/Object;)Lokhttp3/preprohormone$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "type", "polloi", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/preprohormone$attabal;", "saneness", "()Lokhttp3/preprohormone;", "Lokhttp3/graveside;", "getUrl$okhttp", "()Lokhttp3/graveside;", "monoploid", "(Lokhttp3/graveside;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "kowloon", "(Ljava/lang/String;)V", "Lokhttp3/molybdenite$attabal;", "Lokhttp3/molybdenite$attabal;", "marial", "()Lokhttp3/molybdenite$attabal;", "triweekly", "(Lokhttp3/molybdenite$attabal;)V", "Lokhttp3/cord;", "getBody$okhttp", "()Lokhttp3/cord;", "impassible", "(Lokhttp3/cord;)V", "", "Ljava/util/Map;", "beachfront", "()Ljava/util/Map;", "arytenoidectomy", "(Ljava/util/Map;)V", "tags", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public graveside url;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public molybdenite.attabal headers;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public Map<Class<?>, Object> tags;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public String method;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public cord body;

        public attabal() {
            this.tags = new LinkedHashMap();
            this.method = C3460cc.a;
            this.headers = new molybdenite.attabal();
        }

        public attabal adultoid(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            graveside.Companion sanenessVar = graveside.INSTANCE;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return dovishness(sanenessVar.wireman(string));
        }

        public attabal apical(cord body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return cutely(C3460cc.b, body);
        }

        public final void arytenoidectomy(Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public attabal attabal(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            getHeaders().attabal(name, value);
            return this;
        }

        public final Map<Class<?>, Object> beachfront() {
            return this.tags;
        }

        public attabal competently() {
            return cutely("HEAD", null);
        }

        public attabal cutely(String method, cord body) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (paddywack.beachfront.marial(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!paddywack.beachfront.saneness(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            kowloon(method);
            impassible(body);
            return this;
        }

        public attabal dern(wireman cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? formularize("Cache-Control") : impromptu("Cache-Control", string);
        }

        public attabal dovishness(graveside url) {
            Intrinsics.checkNotNullParameter(url, "url");
            monoploid(url);
            return this;
        }

        public attabal formularize(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            getHeaders().impromptu(name);
            return this;
        }

        public attabal graveside(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (p002kotlin.text.dovishness.privatdozent(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.arytenoidectomy("http:", strSubstring);
            } else if (p002kotlin.text.dovishness.privatdozent(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.arytenoidectomy("https:", strSubstring2);
            }
            return dovishness(graveside.INSTANCE.wireman(url));
        }

        public final void impassible(cord cordVar) {
            this.body = cordVar;
        }

        public attabal impromptu(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            getHeaders().taiyuan(name, value);
            return this;
        }

        public final void kowloon(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final molybdenite.attabal getHeaders() {
            return this.headers;
        }

        public attabal molybdenite(Object tag) {
            return polloi(Object.class, tag);
        }

        public final void monoploid(graveside gravesideVar) {
            this.url = gravesideVar;
        }

        public <T> attabal polloi(Class<? super T> type, T tag) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (tag == null) {
                beachfront().remove(type);
                return this;
            }
            if (beachfront().isEmpty()) {
                arytenoidectomy(new LinkedHashMap());
            }
            Map<Class<?>, Object> mapBeachfront = beachfront();
            T tCast = type.cast(tag);
            Intrinsics.beachfront(tCast);
            mapBeachfront.put(type, tCast);
            return this;
        }

        public preprohormone saneness() {
            graveside gravesideVar = this.url;
            if (gravesideVar != null) {
                return new preprohormone(gravesideVar, this.method, this.headers.marial(), this.body, hereditist.wireman.mathsort(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public attabal taiyuan(molybdenite headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            triweekly(headers.marial());
            return this;
        }

        public final void triweekly(molybdenite.attabal attabalVar) {
            Intrinsics.checkNotNullParameter(attabalVar, "<set-?>");
            this.headers = attabalVar;
        }

        public attabal wireman() {
            return cutely(C3460cc.a, null);
        }

        public attabal(preprohormone request) {
            Map<Class<?>, Object> mapStratoscope;
            Intrinsics.checkNotNullParameter(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.getUrl();
            this.method = request.getMethod();
            this.body = request.getBody();
            if (request.dern().isEmpty()) {
                mapStratoscope = new LinkedHashMap<>();
            } else {
                mapStratoscope = seminary.stratoscope(request.dern());
            }
            this.tags = mapStratoscope;
            this.headers = request.getHeaders().marial();
        }
    }
}
