package okhttp3;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3460cc;
import com.ironsource.Ie;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.ui.AdActivity;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.internal.cache.DiskLruCache;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0004\u0010\u00156?B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0018\u00010\fR\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0000¢\u0006\u0004\b(\u0010\"R\u001a\u0010-\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00107\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00100\u001a\u0004\b6\u00102\"\u0004\b/\u00104R\u0016\u00109\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00100R\u0016\u0010;\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00100R\u0016\u0010=\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00100¨\u0006@"}, d2 = {"Lokhttp3/dern;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ljava/io/File;", "directory", "", "maxSize", "Lgraunch/attabal;", "fileSystem", "<init>", "(Ljava/io/File;JLgraunch/attabal;)V", "(Ljava/io/File;J)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "", "attabal", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/cuirassed;", "saneness", "(Lokhttp3/preprohormone;)Lokhttp3/cuirassed;", Ie.n, "Lokhttp3/internal/cache/saneness;", "cutely", "(Lokhttp3/cuirassed;)Lokhttp3/internal/cache/saneness;", "formularize", "(Lokhttp3/preprohormone;)V", "cached", "network", "cuirassed", "(Lokhttp3/cuirassed;Lokhttp3/cuirassed;)V", "flush", "()V", "close", "Lokhttp3/internal/cache/dern;", "cacheStrategy", "rotuma", "(Lokhttp3/internal/cache/dern;)V", "dovishness", "kowloon", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "cache", "", "arytenoidectomy", "I", "marial", "()I", "monoploid", "(I)V", "writeSuccessCount", "dern", "writeAbortCount", "polloi", "networkCount", "molybdenite", "hitCount", "graveside", "requestCount", "adultoid", "wireman", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class dern implements Closeable, Flushable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int writeSuccessCount;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public int requestCount;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final DiskLruCache cache;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int hitCount;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int writeAbortCount;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int networkCount;

    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lokhttp3/dern$attabal;", "Lokhttp3/stratoscope;", "Lokhttp3/internal/cache/DiskLruCache$dern;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "", "contentType", "contentLength", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$dern;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/dovishness;", "()Lokhttp3/dovishness;", "", "()J", "Lduvetyn/beachfront;", "source", "()Lduvetyn/beachfront;", "kowloon", "Lokhttp3/internal/cache/DiskLruCache$dern;", "attabal", "()Lokhttp3/internal/cache/DiskLruCache$dern;", "arytenoidectomy", "Ljava/lang/String;", "monoploid", "polloi", "Lduvetyn/beachfront;", "bodySource", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal extends stratoscope {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final String contentType;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final DiskLruCache.dern snapshot;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final String contentLength;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.beachfront bodySource;

        /* JADX INFO: renamed from: okhttp3.dern$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/dern$attabal$attabal", "Lduvetyn/formularize;", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0757attabal extends duvetyn.formularize {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ attabal f34199arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ supplicat f34200kowloon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0757attabal(supplicat supplicatVar, attabal attabalVar) {
                super(supplicatVar);
                this.f34200kowloon = supplicatVar;
                this.f34199arytenoidectomy = attabalVar;
            }

            @Override // duvetyn.formularize, duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f34199arytenoidectomy.getSnapshot().close();
                super.close();
            }
        }

        public attabal(DiskLruCache.dern snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = duvetyn.adultoid.wireman(new C0757attabal(snapshot.saneness(1), this));
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final DiskLruCache.dern getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return hereditist.wireman.splinterproof(str, -1L);
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentType */
        public dovishness getF34696kowloon() {
            String str = this.contentType;
            if (str == null) {
                return null;
            }
            return dovishness.INSTANCE.saneness(str);
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: source, reason: from getter */
        public duvetyn.beachfront getBodySource() {
            return this.bodySource;
        }
    }

    /* JADX INFO: renamed from: okhttp3.dern$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0014*\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0010*\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b*\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lokhttp3/dern$saneness;", "", "<init>", "()V", "Lokhttp3/graveside;", "url", "", "saneness", "(Lokhttp3/graveside;)Ljava/lang/String;", "Lduvetyn/beachfront;", "source", "", "dern", "(Lduvetyn/beachfront;)I", "Lokhttp3/cuirassed;", "cachedResponse", "Lokhttp3/molybdenite;", "cachedRequest", "Lokhttp3/preprohormone;", "newRequest", "", "competently", "(Lokhttp3/cuirassed;Lokhttp3/molybdenite;Lokhttp3/preprohormone;)Z", "attabal", "(Lokhttp3/cuirassed;)Z", "beachfront", "(Lokhttp3/cuirassed;)Lokhttp3/molybdenite;", "", "wireman", "(Lokhttp3/molybdenite;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "marial", "(Lokhttp3/molybdenite;Lokhttp3/molybdenite;)Lokhttp3/molybdenite;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean attabal(cuirassed cuirassedVar) {
            Intrinsics.checkNotNullParameter(cuirassedVar, "<this>");
            return wireman(cuirassedVar.getHeaders()).contains("*");
        }

        public final molybdenite beachfront(cuirassed cuirassedVar) {
            Intrinsics.checkNotNullParameter(cuirassedVar, "<this>");
            cuirassed networkResponse = cuirassedVar.getNetworkResponse();
            Intrinsics.beachfront(networkResponse);
            return marial(networkResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getHeaders(), cuirassedVar.getHeaders());
        }

        public final boolean competently(cuirassed cachedResponse, molybdenite cachedRequest, preprohormone newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setWireman = wireman(cachedResponse.getHeaders());
            if ((setWireman instanceof Collection) && setWireman.isEmpty()) {
                return true;
            }
            for (String str : setWireman) {
                if (!Intrinsics.wireman(cachedRequest.taiyuan(str), newRequest.marial(str))) {
                    return false;
                }
            }
            return true;
        }

        public final int dern(duvetyn.beachfront source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.length() <= 0) {
                    return (int) decimalLong;
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final molybdenite marial(molybdenite requestHeaders, molybdenite responseHeaders) {
            Set<String> setWireman = wireman(responseHeaders);
            if (setWireman.isEmpty()) {
                return hereditist.wireman.f27723saneness;
            }
            molybdenite.attabal attabalVar = new molybdenite.attabal();
            int size = requestHeaders.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String strWireman = requestHeaders.wireman(i);
                if (setWireman.contains(strWireman)) {
                    attabalVar.attabal(strWireman, requestHeaders.impromptu(i));
                }
                i = i2;
            }
            return attabalVar.marial();
        }

        public final String saneness(graveside url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return ByteString.INSTANCE.wireman(url.getUrl()).md5().hex();
        }

        public final Set<String> wireman(molybdenite molybdeniteVar) {
            int size = molybdeniteVar.size();
            TreeSet treeSet = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (p002kotlin.text.dovishness.stratoscope("Vary", molybdeniteVar.wireman(i), true)) {
                    String strImpromptu = molybdeniteVar.impromptu(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(p002kotlin.text.dovishness.oilcan(p002kotlin.jvm.internal.gintrap.f29390attabal));
                    }
                    Iterator it = StringsKt.homozygous(strImpromptu, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.stupefactive((String) it.next()).toString());
                    }
                }
                i = i2;
            }
            return treeSet == null ? creditor.marial() : treeSet;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/dern$wireman;", "Lokhttp3/internal/cache/saneness;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "<init>", "(Lokhttp3/dern;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "abort", "()V", "Lduvetyn/sealless;", "body", "()Lduvetyn/sealless;", "attabal", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "saneness", "Lduvetyn/sealless;", "cacheOut", "dern", "", "wireman", "Z", "()Z", "(Z)V", "done", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class wireman implements okhttp3.internal.cache.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final DiskLruCache.Editor editor;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final sealless body;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ dern f34216marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final sealless cacheOut;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public boolean done;

        /* JADX INFO: compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/dern$wireman$attabal", "Lduvetyn/apical;", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class attabal extends duvetyn.apical {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ dern f34219arytenoidectomy;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final /* synthetic */ wireman f34220monoploid;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(dern dernVar, wireman wiremanVar, sealless seallessVar) {
                super(seallessVar);
                this.f34219arytenoidectomy = dernVar;
                this.f34220monoploid = wiremanVar;
            }

            @Override // duvetyn.apical, duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                dern dernVar = this.f34219arytenoidectomy;
                wireman wiremanVar = this.f34220monoploid;
                synchronized (dernVar) {
                    if (wiremanVar.getDone()) {
                        return;
                    }
                    wiremanVar.dern(true);
                    dernVar.monoploid(dernVar.getWriteSuccessCount() + 1);
                    super.close();
                    this.f34220monoploid.editor.saneness();
                }
            }
        }

        public wireman(dern this$0, DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f34216marial = this$0;
            this.editor = editor;
            sealless seallessVarBeachfront = editor.beachfront(1);
            this.cacheOut = seallessVarBeachfront;
            this.body = new attabal(this$0, this, seallessVarBeachfront);
        }

        @Override // okhttp3.internal.cache.saneness
        public void abort() {
            dern dernVar = this.f34216marial;
            synchronized (dernVar) {
                if (getDone()) {
                    return;
                }
                dern(true);
                dernVar.arytenoidectomy(dernVar.getWriteAbortCount() + 1);
                hereditist.wireman.impassible(this.cacheOut);
                try {
                    this.editor.attabal();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.saneness
        /* JADX INFO: renamed from: body, reason: from getter */
        public sealless getBody() {
            return this.body;
        }

        public final void dern(boolean z) {
            this.done = z;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }
    }

    public dern(File directory, long j, graunch.attabal fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, directory, 201105, 2, j, gold.marial.f27337taiyuan);
    }

    public final void arytenoidectomy(int i) {
        this.writeAbortCount = i;
    }

    public final void attabal(DiskLruCache.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.attabal();
        } catch (IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void cuirassed(cuirassed cached, cuirassed network) {
        DiskLruCache.Editor editorAttabal;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        C0758dern c0758dern = new C0758dern(network);
        stratoscope body = cached.getBody();
        if (body == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            editorAttabal = ((attabal) body).getSnapshot().attabal();
            if (editorAttabal == null) {
                return;
            }
            try {
                c0758dern.beachfront(editorAttabal);
                editorAttabal.saneness();
            } catch (IOException unused) {
                attabal(editorAttabal);
            }
        } catch (IOException unused2) {
            editorAttabal = null;
        }
    }

    public final okhttp3.internal.cache.saneness cutely(cuirassed response) {
        DiskLruCache.Editor editorRestrictive;
        Intrinsics.checkNotNullParameter(response, "response");
        String method = response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getMethod();
        if (paddywack.beachfront.f34994attabal.attabal(response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getMethod())) {
            try {
                formularize(response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.wireman(method, C3460cc.a)) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.attabal(response)) {
            return null;
        }
        C0758dern c0758dern = new C0758dern(response);
        try {
            editorRestrictive = DiskLruCache.restrictive(this.cache, companion.saneness(response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getUrl()), 0L, 2, null);
            if (editorRestrictive == null) {
                return null;
            }
            try {
                c0758dern.beachfront(editorRestrictive);
                return new wireman(this, editorRestrictive);
            } catch (IOException unused2) {
                attabal(editorRestrictive);
                return null;
            }
        } catch (IOException unused3) {
            editorRestrictive = null;
        }
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized void dovishness() {
        this.hitCount++;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final void formularize(preprohormone request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.cache.sayid(INSTANCE.saneness(request.getUrl()));
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final void monoploid(int i) {
        this.writeSuccessCount = i;
    }

    public final synchronized void rotuma(okhttp3.internal.cache.dern cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final cuirassed saneness(preprohormone request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            DiskLruCache.dern dernVarMerc = this.cache.merc(INSTANCE.saneness(request.getUrl()));
            if (dernVarMerc == null) {
                return null;
            }
            try {
                C0758dern c0758dern = new C0758dern(dernVarMerc.saneness(0));
                cuirassed cuirassedVarWireman = c0758dern.wireman(dernVarMerc);
                if (c0758dern.saneness(request, cuirassedVarWireman)) {
                    return cuirassedVarWireman;
                }
                stratoscope body = cuirassedVarWireman.getBody();
                if (body != null) {
                    hereditist.wireman.impassible(body);
                }
                return null;
            } catch (IOException unused) {
                hereditist.wireman.impassible(dernVarMerc);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dern(File directory, long j) {
        this(directory, j, graunch.attabal.f27424saneness);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX INFO: renamed from: okhttp3.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u0000 B2\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tR\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00062\n\u0010\u0015\u001a\u00060\u0014R\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00101R\u0014\u00103\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u00105\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010@¨\u0006C"}, d2 = {"Lokhttp3/dern$dern;", "", "Lduvetyn/supplicat;", "rawSource", "<init>", "(Lduvetyn/supplicat;)V", "Lokhttp3/cuirassed;", Ie.n, "(Lokhttp3/cuirassed;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "", "beachfront", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "", "saneness", "(Lokhttp3/preprohormone;Lokhttp3/cuirassed;)Z", "Lokhttp3/internal/cache/DiskLruCache$dern;", "snapshot", "wireman", "(Lokhttp3/internal/cache/DiskLruCache$dern;)Lokhttp3/cuirassed;", "Lduvetyn/beachfront;", "source", "", "Ljava/security/cert/Certificate;", "dern", "(Lduvetyn/beachfront;)Ljava/util/List;", "Lduvetyn/marial;", "sink", "certificates", "marial", "(Lduvetyn/marial;Ljava/util/List;)V", "Lokhttp3/graveside;", "attabal", "Lokhttp3/graveside;", "url", "Lokhttp3/molybdenite;", "Lokhttp3/molybdenite;", "varyHeaders", "", "Ljava/lang/String;", "requestMethod", "Lokhttp3/Protocol;", "Lokhttp3/Protocol;", "protocol", "", "I", "code", PglCryptUtils.KEY_MESSAGE, "competently", "responseHeaders", "Lokhttp3/Handshake;", "impromptu", "Lokhttp3/Handshake;", "handshake", "", "taiyuan", "J", "sentRequestMillis", "cutely", "receivedResponseMillis", "()Z", "isHttps", "apical", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C0758dern {

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static final String f34202formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static final String f34203impassible;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final graveside url;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final String message;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public final molybdenite responseHeaders;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public final long receivedResponseMillis;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final String requestMethod;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public final Handshake handshake;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final molybdenite varyHeaders;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public final long sentRequestMillis;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final Protocol protocol;

        static {
            elusion.impromptu.Companion companion = elusion.impromptu.INSTANCE;
            f34202formularize = Intrinsics.arytenoidectomy(companion.competently().competently(), "-Sent-Millis");
            f34203impassible = Intrinsics.arytenoidectomy(companion.competently().competently(), "-Received-Millis");
        }

        public C0758dern(supplicat rawSource) throws IOException {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                duvetyn.beachfront beachfrontVarWireman = duvetyn.adultoid.wireman(rawSource);
                String utf8LineStrict = beachfrontVarWireman.readUtf8LineStrict();
                graveside gravesideVarBeachfront = graveside.INSTANCE.beachfront(utf8LineStrict);
                if (gravesideVarBeachfront == null) {
                    IOException iOException = new IOException(Intrinsics.arytenoidectomy("Cache corruption for ", utf8LineStrict));
                    elusion.impromptu.INSTANCE.competently().apical("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = gravesideVarBeachfront;
                this.requestMethod = beachfrontVarWireman.readUtf8LineStrict();
                molybdenite.attabal attabalVar = new molybdenite.attabal();
                int iDern = dern.INSTANCE.dern(beachfrontVarWireman);
                int i = 0;
                int i2 = 0;
                while (i2 < iDern) {
                    i2++;
                    attabalVar.dern(beachfrontVarWireman.readUtf8LineStrict());
                }
                this.varyHeaders = attabalVar.marial();
                paddywack.apical apicalVarAttabal = paddywack.apical.INSTANCE.attabal(beachfrontVarWireman.readUtf8LineStrict());
                this.protocol = apicalVarAttabal.protocol;
                this.code = apicalVarAttabal.code;
                this.message = apicalVarAttabal.com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String;
                molybdenite.attabal attabalVar2 = new molybdenite.attabal();
                int iDern2 = dern.INSTANCE.dern(beachfrontVarWireman);
                while (i < iDern2) {
                    i++;
                    attabalVar2.dern(beachfrontVarWireman.readUtf8LineStrict());
                }
                String str = f34202formularize;
                String strBeachfront = attabalVar2.beachfront(str);
                String str2 = f34203impassible;
                String strBeachfront2 = attabalVar2.beachfront(str2);
                attabalVar2.impromptu(str);
                attabalVar2.impromptu(str2);
                long j = 0;
                this.sentRequestMillis = strBeachfront == null ? 0L : Long.parseLong(strBeachfront);
                if (strBeachfront2 != null) {
                    j = Long.parseLong(strBeachfront2);
                }
                this.receivedResponseMillis = j;
                this.responseHeaders = attabalVar2.marial();
                if (attabal()) {
                    String utf8LineStrict2 = beachfrontVarWireman.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                    }
                    this.handshake = Handshake.INSTANCE.saneness(!beachfrontVarWireman.exhausted() ? TlsVersion.INSTANCE.attabal(beachfrontVarWireman.readUtf8LineStrict()) : TlsVersion.SSL_3_0, impromptu.INSTANCE.saneness(beachfrontVarWireman.readUtf8LineStrict()), dern(beachfrontVarWireman), dern(beachfrontVarWireman));
                } else {
                    this.handshake = null;
                }
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(rawSource, th);
                    throw th2;
                }
            }
        }

        public final boolean attabal() {
            return Intrinsics.wireman(this.url.getScheme(), HttpRequest.DEFAULT_SCHEME);
        }

        public final void beachfront(DiskLruCache.Editor editor) throws IOException {
            Intrinsics.checkNotNullParameter(editor, "editor");
            duvetyn.marial marialVarDern = duvetyn.adultoid.dern(editor.beachfront(0));
            try {
                marialVarDern.writeUtf8(this.url.getUrl()).writeByte(10);
                marialVarDern.writeUtf8(this.requestMethod).writeByte(10);
                marialVarDern.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    marialVarDern.writeUtf8(this.varyHeaders.wireman(i)).writeUtf8(": ").writeUtf8(this.varyHeaders.impromptu(i)).writeByte(10);
                    i = i2;
                }
                marialVarDern.writeUtf8(new paddywack.apical(this.protocol, this.code, this.message).toString()).writeByte(10);
                marialVarDern.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    marialVarDern.writeUtf8(this.responseHeaders.wireman(i3)).writeUtf8(": ").writeUtf8(this.responseHeaders.impromptu(i3)).writeByte(10);
                }
                marialVarDern.writeUtf8(f34202formularize).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
                marialVarDern.writeUtf8(f34203impassible).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
                if (attabal()) {
                    marialVarDern.writeByte(10);
                    Handshake handshake = this.handshake;
                    Intrinsics.beachfront(handshake);
                    marialVarDern.writeUtf8(handshake.getCipherSuite().getJavaName()).writeByte(10);
                    marial(marialVarDern, this.handshake.wireman());
                    marial(marialVarDern, this.handshake.dern());
                    marialVarDern.writeUtf8(this.handshake.getTlsVersion().javaName()).writeByte(10);
                }
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(marialVarDern, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(marialVarDern, th);
                    throw th2;
                }
            }
        }

        public final List<Certificate> dern(duvetyn.beachfront source) throws IOException {
            int iDern = dern.INSTANCE.dern(source);
            if (iDern == -1) {
                return p002kotlin.collections.adultoid.formularize();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(iDern);
                int i = 0;
                while (i < iDern) {
                    i++;
                    String utf8LineStrict = source.readUtf8LineStrict();
                    duvetyn.wireman wiremanVar = new duvetyn.wireman();
                    ByteString byteStringAttabal = ByteString.INSTANCE.attabal(utf8LineStrict);
                    Intrinsics.beachfront(byteStringAttabal);
                    wiremanVar.sensatory(byteStringAttabal);
                    arrayList.add(certificateFactory.generateCertificate(wiremanVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void marial(duvetyn.marial sink, List<? extends Certificate> certificates) throws IOException {
            try {
                sink.writeDecimalLong(certificates.size()).writeByte(10);
                Iterator<? extends Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    ByteString.Companion companion = ByteString.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    sink.writeUtf8(ByteString.Companion.impromptu(companion, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean saneness(preprohormone request, cuirassed response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.wireman(this.url, request.getUrl()) && Intrinsics.wireman(this.requestMethod, request.getMethod()) && dern.INSTANCE.competently(response, this.varyHeaders, request);
        }

        public final cuirassed wireman(DiskLruCache.dern snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String strSaneness = this.responseHeaders.saneness("Content-Type");
            String strSaneness2 = this.responseHeaders.saneness("Content-Length");
            return new cuirassed.attabal().molybdenite(new preprohormone.attabal().dovishness(this.url).cutely(this.requestMethod, null).taiyuan(this.varyHeaders).saneness()).monoploid(this.protocol).competently(this.code).triweekly(this.message).formularize(this.responseHeaders).saneness(new attabal(snapshot, strSaneness, strSaneness2)).cutely(this.handshake).graveside(this.sentRequestMillis).polloi(this.receivedResponseMillis).dern();
        }

        public C0758dern(cuirassed response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.url = response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getUrl();
            this.varyHeaders = dern.INSTANCE.beachfront(response);
            this.requestMethod = response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getMethod();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.responseHeaders = response.getHeaders();
            this.handshake = response.getHandshake();
            this.sentRequestMillis = response.getSentRequestAtMillis();
            this.receivedResponseMillis = response.getReceivedResponseAtMillis();
        }
    }
}
