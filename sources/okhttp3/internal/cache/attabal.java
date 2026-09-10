package okhttp3.internal.cache;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.Ie;
import duvetyn.beachfront;
import duvetyn.marial;
import duvetyn.restrictive;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.adultoid;
import okhttp3.cuirassed;
import okhttp3.molybdenite;
import okhttp3.monoploid;
import okhttp3.preprohormone;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import paddywack.impromptu;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/attabal;", "Lokhttp3/adultoid;", "Lokhttp3/dern;", "cache", "<init>", "(Lokhttp3/dern;)V", "Lokhttp3/adultoid$attabal;", "chain", "Lokhttp3/cuirassed;", "intercept", "(Lokhttp3/adultoid$attabal;)Lokhttp3/cuirassed;", "Lokhttp3/internal/cache/saneness;", "cacheRequest", Ie.n, "attabal", "(Lokhttp3/internal/cache/saneness;Lokhttp3/cuirassed;)Lokhttp3/cuirassed;", "kowloon", "Lokhttp3/dern;", "getCache$okhttp", "()Lokhttp3/dern;", "arytenoidectomy", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class attabal implements adultoid {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.dern cache;

    /* JADX INFO: renamed from: okhttp3.internal.cache.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache/attabal$attabal;", "", "<init>", "()V", "Lokhttp3/cuirassed;", Ie.n, "beachfront", "(Lokhttp3/cuirassed;)Lokhttp3/cuirassed;", "Lokhttp3/molybdenite;", "cachedHeaders", "networkHeaders", "dern", "(Lokhttp3/molybdenite;Lokhttp3/molybdenite;)Lokhttp3/molybdenite;", "", "fieldName", "", "marial", "(Ljava/lang/String;)Z", "wireman", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cuirassed beachfront(cuirassed response) {
            return (response == null ? null : response.getBody()) != null ? response.polder().saneness(null).dern() : response;
        }

        public final molybdenite dern(molybdenite cachedHeaders, molybdenite networkHeaders) {
            molybdenite.attabal attabalVar = new molybdenite.attabal();
            int size = cachedHeaders.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                String strWireman = cachedHeaders.wireman(i2);
                String strImpromptu = cachedHeaders.impromptu(i2);
                if ((!dovishness.stratoscope("Warning", strWireman, true) || !dovishness.starveling(strImpromptu, "1", false, 2, null)) && (wireman(strWireman) || !marial(strWireman) || networkHeaders.saneness(strWireman) == null)) {
                    attabalVar.wireman(strWireman, strImpromptu);
                }
                i2 = i3;
            }
            int size2 = networkHeaders.size();
            while (i < size2) {
                int i4 = i + 1;
                String strWireman2 = networkHeaders.wireman(i);
                if (!wireman(strWireman2) && marial(strWireman2)) {
                    attabalVar.wireman(strWireman2, networkHeaders.impromptu(i));
                }
                i = i4;
            }
            return attabalVar.marial();
        }

        public final boolean marial(String fieldName) {
            return (dovishness.stratoscope("Connection", fieldName, true) || dovishness.stratoscope("Keep-Alive", fieldName, true) || dovishness.stratoscope("Proxy-Authenticate", fieldName, true) || dovishness.stratoscope("Proxy-Authorization", fieldName, true) || dovishness.stratoscope("TE", fieldName, true) || dovishness.stratoscope("Trailers", fieldName, true) || dovishness.stratoscope("Transfer-Encoding", fieldName, true) || dovishness.stratoscope("Upgrade", fieldName, true)) ? false : true;
        }

        public final boolean wireman(String fieldName) {
            return dovishness.stratoscope("Content-Length", fieldName, true) || dovishness.stratoscope("Content-Encoding", fieldName, true) || dovishness.stratoscope("Content-Type", fieldName, true);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"okhttp3/internal/cache/attabal$saneness", "Lduvetyn/supplicat;", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", "close", "()V", "", "kowloon", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class saneness implements supplicat {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ beachfront f34466arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public boolean cacheRequestClosed;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ okhttp3.internal.cache.saneness f34468monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ marial f34469polloi;

        public saneness(beachfront beachfrontVar, okhttp3.internal.cache.saneness sanenessVar, marial marialVar) {
            this.f34466arytenoidectomy = beachfrontVar;
            this.f34468monoploid = sanenessVar;
            this.f34469polloi = marialVar;
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.cacheRequestClosed && !hereditist.wireman.molybdenite(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.f34468monoploid.abort();
            }
            this.f34466arytenoidectomy.close();
        }

        @Override // duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                long j = this.f34466arytenoidectomy.read(sink, byteCount);
                if (j != -1) {
                    sink.monoploid(this.f34469polloi.getBufferField(), sink.getSize() - j, j);
                    this.f34469polloi.emitCompleteSegments();
                    return j;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f34469polloi.close();
                }
                return -1L;
            } catch (IOException e) {
                if (this.cacheRequestClosed) {
                    throw e;
                }
                this.cacheRequestClosed = true;
                this.f34468monoploid.abort();
                throw e;
            }
        }

        @Override // duvetyn.supplicat
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25466kowloon() {
            return this.f34466arytenoidectomy.getF25466kowloon();
        }
    }

    public attabal(okhttp3.dern dernVar) {
        this.cache = dernVar;
    }

    public final cuirassed attabal(okhttp3.internal.cache.saneness cacheRequest, cuirassed response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        sealless body = cacheRequest.getBody();
        stratoscope body2 = response.getBody();
        Intrinsics.beachfront(body2);
        saneness sanenessVar = new saneness(body2.getDelegateSource(), cacheRequest, duvetyn.adultoid.dern(body));
        return response.polder().saneness(new impromptu(cuirassed.rotuma(response, "Content-Type", null, 2, null), response.getBody().getContentLength(), duvetyn.adultoid.wireman(sanenessVar))).dern();
    }

    @Override // okhttp3.adultoid
    public cuirassed intercept(adultoid.attabal chain) throws IOException {
        stratoscope body;
        stratoscope body2;
        stratoscope body3;
        Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.marial marialVarCall = chain.call();
        okhttp3.dern dernVar = this.cache;
        cuirassed cuirassedVarSaneness = dernVar == null ? null : dernVar.saneness(chain.request());
        dern dernVarSaneness = new dern.saneness(System.currentTimeMillis(), chain.request(), cuirassedVarSaneness).saneness();
        preprohormone networkRequest = dernVarSaneness.getNetworkRequest();
        cuirassed cacheResponse = dernVarSaneness.getCacheResponse();
        okhttp3.dern dernVar2 = this.cache;
        if (dernVar2 != null) {
            dernVar2.rotuma(dernVarSaneness);
        }
        okhttp3.internal.connection.marial marialVar = marialVarCall instanceof okhttp3.internal.connection.marial ? (okhttp3.internal.connection.marial) marialVarCall : null;
        monoploid eventListener = marialVar != null ? marialVar.getEventListener() : null;
        if (eventListener == null) {
            eventListener = monoploid.f34605saneness;
        }
        if (cuirassedVarSaneness != null && cacheResponse == null && (body3 = cuirassedVarSaneness.getBody()) != null) {
            hereditist.wireman.impassible(body3);
        }
        if (networkRequest == null && cacheResponse == null) {
            cuirassed cuirassedVarDern = new cuirassed.attabal().molybdenite(chain.request()).monoploid(Protocol.HTTP_1_1).competently(PglCryptUtils.BASE64_FAILED).triweekly("Unsatisfiable Request (only-if-cached)").saneness(hereditist.wireman.f27720dern).graveside(-1L).polloi(System.currentTimeMillis()).dern();
            eventListener.cuirassed(marialVarCall, cuirassedVarDern);
            return cuirassedVarDern;
        }
        if (networkRequest == null) {
            Intrinsics.beachfront(cacheResponse);
            cuirassed cuirassedVarDern2 = cacheResponse.polder().wireman(INSTANCE.beachfront(cacheResponse)).dern();
            eventListener.saneness(marialVarCall, cuirassedVarDern2);
            return cuirassedVarDern2;
        }
        if (cacheResponse != null) {
            eventListener.attabal(marialVarCall, cacheResponse);
        } else if (this.cache != null) {
            eventListener.dern(marialVarCall);
        }
        try {
            cuirassed cuirassedVarAttabal = chain.attabal(networkRequest);
            if (cuirassedVarAttabal == null && cuirassedVarSaneness != null && (body2 = cuirassedVarSaneness.getBody()) != null) {
                hereditist.wireman.impassible(body2);
            }
            if (cacheResponse != null) {
                if (cuirassedVarAttabal != null && cuirassedVarAttabal.getCode() == 304) {
                    cuirassed.attabal attabalVarPolder = cacheResponse.polder();
                    Companion companion = INSTANCE;
                    cuirassed cuirassedVarDern3 = attabalVarPolder.formularize(companion.dern(cacheResponse.getHeaders(), cuirassedVarAttabal.getHeaders())).graveside(cuirassedVarAttabal.getSentRequestAtMillis()).polloi(cuirassedVarAttabal.getReceivedResponseAtMillis()).wireman(companion.beachfront(cacheResponse)).kowloon(companion.beachfront(cuirassedVarAttabal)).dern();
                    stratoscope body4 = cuirassedVarAttabal.getBody();
                    Intrinsics.beachfront(body4);
                    body4.close();
                    okhttp3.dern dernVar3 = this.cache;
                    Intrinsics.beachfront(dernVar3);
                    dernVar3.dovishness();
                    this.cache.cuirassed(cacheResponse, cuirassedVarDern3);
                    eventListener.saneness(marialVarCall, cuirassedVarDern3);
                    return cuirassedVarDern3;
                }
                stratoscope body5 = cacheResponse.getBody();
                if (body5 != null) {
                    hereditist.wireman.impassible(body5);
                }
            }
            Intrinsics.beachfront(cuirassedVarAttabal);
            cuirassed.attabal attabalVarPolder2 = cuirassedVarAttabal.polder();
            Companion companion2 = INSTANCE;
            cuirassed cuirassedVarDern4 = attabalVarPolder2.wireman(companion2.beachfront(cacheResponse)).kowloon(companion2.beachfront(cuirassedVarAttabal)).dern();
            if (this.cache != null) {
                if (paddywack.marial.saneness(cuirassedVarDern4) && dern.INSTANCE.attabal(cuirassedVarDern4, networkRequest)) {
                    cuirassed cuirassedVarAttabal2 = attabal(this.cache.cutely(cuirassedVarDern4), cuirassedVarDern4);
                    if (cacheResponse != null) {
                        eventListener.dern(marialVarCall);
                    }
                    return cuirassedVarAttabal2;
                }
                if (paddywack.beachfront.f34994attabal.attabal(networkRequest.getMethod())) {
                    try {
                        this.cache.formularize(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return cuirassedVarDern4;
        } catch (Throwable th) {
            if (cuirassedVarSaneness != null && (body = cuirassedVarSaneness.getBody()) != null) {
                hereditist.wireman.impassible(body);
            }
            throw th;
        }
    }
}
