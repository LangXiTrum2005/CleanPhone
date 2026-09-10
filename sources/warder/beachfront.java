package warder;

import com.ironsource.X3;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.cutely;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import retrofit2.preprohormone;

/* JADX INFO: compiled from: RetrofitUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Lwarder/beachfront;", "", "<init>", "()V", "", "baseUrl", "Lokhttp3/rotuma;", "okHttpClient", X3.i.W, "Lretrofit2/preprohormone;", "attabal", "(Ljava/lang/String;Lokhttp3/rotuma;Ljava/lang/String;)Lretrofit2/preprohormone;", "Lretrofit2/preprohormone$saneness;", "wireman", "(Ljava/lang/String;)Lretrofit2/preprohormone$saneness;", "saneness", "(Ljava/lang/String;)Lokhttp3/rotuma;", "builder", "", "marial", "(Ljava/lang/String;Lretrofit2/preprohormone$saneness;)V", "okhttpClient", "beachfront", "(Ljava/lang/String;Lokhttp3/rotuma;)V", "impromptu", "()Lretrofit2/preprohormone$saneness;", "Lokhttp3/rotuma$attabal;", "competently", "()Lokhttp3/rotuma$attabal;", "", "Ljava/util/Map;", "OKHTTP_CLIENT_MAP", "dern", "RETROFIT_BUILDER_MAP", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f39597attabal = new beachfront();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, rotuma> OKHTTP_CLIENT_MAP = new ConcurrentHashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, preprohormone.saneness> RETROFIT_BUILDER_MAP = new ConcurrentHashMap();

    public static /* synthetic */ rotuma dern(beachfront beachfrontVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "default_http_default_key";
        }
        return beachfrontVar.saneness(str);
    }

    public final preprohormone attabal(String baseUrl, rotuma okHttpClient, String key) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(key, "key");
        rotuma rotumaVarSaneness = okHttpClient == null ? saneness(key) : okHttpClient;
        if (!OKHTTP_CLIENT_MAP.containsKey(key)) {
            beachfront(key, okHttpClient);
        }
        preprohormone preprohormoneVarMarial = wireman(key).dern(baseUrl).competently(rotumaVarSaneness).marial();
        Intrinsics.checkNotNullExpressionValue(preprohormoneVarMarial, "getRetrofitBuilder(key).…ent)\n            .build()");
        return preprohormoneVarMarial;
    }

    public final void beachfront(String key, rotuma okhttpClient) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, rotuma> map = OKHTTP_CLIENT_MAP;
        if (okhttpClient == null) {
            okhttpClient = competently().dern();
        }
        map.put(key, okhttpClient);
    }

    public final rotuma.attabal competently() {
        rotuma.attabal attabalVar = new rotuma.attabal();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return attabalVar.beachfront(20000L, timeUnit).hydrovane(20000L, timeUnit).competently(new cutely(10, 5L, TimeUnit.MINUTES));
    }

    public final preprohormone.saneness impromptu() {
        return new preprohormone.saneness();
    }

    public final void marial(String key, preprohormone.saneness builder) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (builder == null) {
            builder = impromptu();
        }
        RETROFIT_BUILDER_MAP.put(key, builder);
    }

    public final rotuma saneness(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        rotuma rotumaVarDern = OKHTTP_CLIENT_MAP.get(key);
        if (rotumaVarDern == null) {
            rotumaVarDern = competently().dern();
        }
        if (!RETROFIT_BUILDER_MAP.containsKey(key)) {
            beachfront(key, rotumaVarDern);
        }
        return rotumaVarDern;
    }

    public final preprohormone.saneness wireman(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, preprohormone.saneness> map = RETROFIT_BUILDER_MAP;
        preprohormone.saneness sanenessVarImpromptu = map.get(key);
        if (sanenessVarImpromptu == null) {
            sanenessVarImpromptu = impromptu();
        }
        if (!map.containsKey(key)) {
            map.put(key, sanenessVarImpromptu);
        }
        return sanenessVarImpromptu;
    }
}
