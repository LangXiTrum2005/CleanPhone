package okhttp3.internal.cache;

import com.google.android.gms.ads.AdSize;
import com.ironsource.Ie;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.cuirassed;
import okhttp3.molybdenite;
import okhttp3.preprohormone;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\b\nB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache/dern;", "", "Lokhttp3/preprohormone;", "networkRequest", "Lokhttp3/cuirassed;", "cacheResponse", "<init>", "(Lokhttp3/preprohormone;Lokhttp3/cuirassed;)V", "attabal", "Lokhttp3/preprohormone;", "saneness", "()Lokhttp3/preprohormone;", "Lokhttp3/cuirassed;", "()Lokhttp3/cuirassed;", "dern", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final preprohormone networkRequest;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final cuirassed cacheResponse;

    /* JADX INFO: renamed from: okhttp3.internal.cache.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/cache/dern$attabal;", "", "<init>", "()V", "Lokhttp3/cuirassed;", Ie.n, "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "", "attabal", "(Lokhttp3/cuirassed;Lokhttp3/preprohormone;)Z", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean attabal(cuirassed response, preprohormone request) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int code = response.getCode();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code == 307) {
                    if (cuirassed.rotuma(response, "Expires", null, 2, null) == null && response.saneness().getMaxAgeSeconds() == -1 && !response.saneness().getIsPublic() && !response.saneness().getIsPrivate()) {
                        return false;
                    }
                } else if (code != 308 && code != 404 && code != 405) {
                    switch (code) {
                        case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                        case 301:
                            break;
                        case 302:
                            if (cuirassed.rotuma(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.saneness().getNoStore() || request.saneness().getNoStore()) ? false : true;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/cache/dern$saneness;", "", "", "nowMillis", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/cuirassed;", "cacheResponse", "<init>", "(JLokhttp3/preprohormone;Lokhttp3/cuirassed;)V", "Lokhttp3/internal/cache/dern;", "saneness", "()Lokhttp3/internal/cache/dern;", "", "beachfront", "()Z", "dern", "wireman", "()J", "attabal", "marial", "(Lokhttp3/preprohormone;)Z", "J", "Lokhttp3/preprohormone;", "getRequest$okhttp", "()Lokhttp3/preprohormone;", "Lokhttp3/cuirassed;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "competently", "lastModifiedString", "impromptu", "expires", "taiyuan", "sentRequestMillis", "cutely", "receivedResponseMillis", "apical", DownloadModel.ETAG, "", "formularize", "I", "ageSeconds", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
        public String etag;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final long nowMillis;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public Date lastModified;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public String lastModifiedString;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public long receivedResponseMillis;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final cuirassed cacheResponse;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
        public int ageSeconds;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public Date expires;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public String servedDateString;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final preprohormone request;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public long sentRequestMillis;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public Date servedDate;

        public saneness(long j, preprohormone request, cuirassed cuirassedVar) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.nowMillis = j;
            this.request = request;
            this.cacheResponse = cuirassedVar;
            this.ageSeconds = -1;
            if (cuirassedVar != null) {
                this.sentRequestMillis = cuirassedVar.getSentRequestAtMillis();
                this.receivedResponseMillis = cuirassedVar.getReceivedResponseAtMillis();
                molybdenite headers = cuirassedVar.getHeaders();
                int size = headers.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    String strWireman = headers.wireman(i);
                    String strImpromptu = headers.impromptu(i);
                    if (dovishness.stratoscope(strWireman, "Date", true)) {
                        this.servedDate = paddywack.dern.attabal(strImpromptu);
                        this.servedDateString = strImpromptu;
                    } else if (dovishness.stratoscope(strWireman, "Expires", true)) {
                        this.expires = paddywack.dern.attabal(strImpromptu);
                    } else if (dovishness.stratoscope(strWireman, "Last-Modified", true)) {
                        this.lastModified = paddywack.dern.attabal(strImpromptu);
                        this.lastModifiedString = strImpromptu;
                    } else if (dovishness.stratoscope(strWireman, Command.HTTP_HEADER_ETAG, true)) {
                        this.etag = strImpromptu;
                    } else if (dovishness.stratoscope(strWireman, "Age", true)) {
                        this.ageSeconds = hereditist.wireman.overspeculate(strImpromptu, -1);
                    }
                    i = i2;
                }
            }
        }

        public final long attabal() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i = this.ageSeconds;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.receivedResponseMillis;
            return jMax + (j - this.sentRequestMillis) + (this.nowMillis - j);
        }

        public final boolean beachfront() {
            cuirassed cuirassedVar = this.cacheResponse;
            Intrinsics.beachfront(cuirassedVar);
            return cuirassedVar.saneness().getMaxAgeSeconds() == -1 && this.expires == null;
        }

        public final dern dern() {
            String str;
            if (this.cacheResponse == null) {
                return new dern(this.request, null);
            }
            if (this.request.competently() && this.cacheResponse.getHandshake() == null) {
                return new dern(this.request, null);
            }
            if (!dern.INSTANCE.attabal(this.cacheResponse, this.request)) {
                return new dern(this.request, null);
            }
            okhttp3.wireman wiremanVarSaneness = this.request.saneness();
            if (wiremanVarSaneness.getNoCache() || marial(this.request)) {
                return new dern(this.request, null);
            }
            okhttp3.wireman wiremanVarSaneness2 = this.cacheResponse.saneness();
            long jAttabal = attabal();
            long jWireman = wireman();
            if (wiremanVarSaneness.getMaxAgeSeconds() != -1) {
                jWireman = Math.min(jWireman, TimeUnit.SECONDS.toMillis(wiremanVarSaneness.getMaxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = wiremanVarSaneness.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(wiremanVarSaneness.getMinFreshSeconds()) : 0L;
            if (!wiremanVarSaneness2.getMustRevalidate() && wiremanVarSaneness.getMaxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(wiremanVarSaneness.getMaxStaleSeconds());
            }
            if (!wiremanVarSaneness2.getNoCache()) {
                long j = millis2 + jAttabal;
                if (j < millis + jWireman) {
                    cuirassed.attabal attabalVarPolder = this.cacheResponse.polder();
                    if (j >= jWireman) {
                        attabalVarPolder.attabal("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jAttabal > SignalManager.TWENTY_FOUR_HOURS_MILLIS && beachfront()) {
                        attabalVarPolder.attabal("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new dern(null, attabalVarPolder.dern());
                }
            }
            String str2 = this.etag;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                } else {
                    if (this.servedDate == null) {
                        return new dern(this.request, null);
                    }
                    str2 = this.servedDateString;
                }
                str = "If-Modified-Since";
            }
            molybdenite.attabal attabalVarMarial = this.request.getHeaders().marial();
            Intrinsics.beachfront(str2);
            attabalVarMarial.wireman(str, str2);
            return new dern(this.request.taiyuan().taiyuan(attabalVarMarial.marial()).saneness(), this.cacheResponse);
        }

        public final boolean marial(preprohormone request) {
            return (request.wireman("If-Modified-Since") == null && request.wireman("If-None-Match") == null) ? false : true;
        }

        public final dern saneness() {
            dern dernVarDern = dern();
            return (dernVarDern.getNetworkRequest() == null || !this.request.saneness().getOnlyIfCached()) ? dernVarDern : new dern(null, null);
        }

        public final long wireman() {
            Long lValueOf;
            cuirassed cuirassedVar = this.cacheResponse;
            Intrinsics.beachfront(cuirassedVar);
            okhttp3.wireman wiremanVarSaneness = cuirassedVar.saneness();
            if (wiremanVarSaneness.getMaxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(wiremanVarSaneness.getMaxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (lValueOf == null ? this.receivedResponseMillis : lValueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified != null && this.cacheResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getUrl().arytenoidectomy() == null) {
                Date date3 = this.servedDate;
                lValueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
                long jLongValue = lValueOf == null ? this.sentRequestMillis : lValueOf.longValue();
                Date date4 = this.lastModified;
                Intrinsics.beachfront(date4);
                long time2 = jLongValue - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
            }
            return 0L;
        }
    }

    public dern(preprohormone preprohormoneVar, cuirassed cuirassedVar) {
        this.networkRequest = preprohormoneVar;
        this.cacheResponse = cuirassedVar;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final cuirassed getCacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final preprohormone getNetworkRequest() {
        return this.networkRequest;
    }
}
