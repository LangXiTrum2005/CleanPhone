package imposure;

import com.google.common.base.formularize;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.adultoid;
import okhttp3.cuirassed;
import okhttp3.stratoscope;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements adultoid, AutoCloseable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Map f28494arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final competently f28495kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final ScheduledExecutorService f28496monoploid;

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public static final class attabal extends impromptu<attabal, saneness> {
        public attabal(CronetEngine cronetEngine) {
            super(cronetEngine, attabal.class);
        }

        @Override // imposure.impromptu
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public saneness saneness(competently competentlyVar) {
            return new saneness(competentlyVar, null);
        }
    }

    /* JADX INFO: renamed from: imposure.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public class C0649saneness extends dern {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final okhttp3.marial f28497arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ saneness f28498monoploid;

        public /* synthetic */ C0649saneness(saneness sanenessVar, stratoscope stratoscopeVar, okhttp3.marial marialVar, byte[] bArr) {
            this(sanenessVar, stratoscopeVar, marialVar);
        }

        @Override // imposure.dern
        public void attabal() {
            this.f28498monoploid.saneness().remove(this.f28497arytenoidectomy);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0649saneness(saneness sanenessVar, stratoscope stratoscopeVar, okhttp3.marial marialVar) {
            super(stratoscopeVar);
            Objects.requireNonNull(sanenessVar);
            this.f28498monoploid = sanenessVar;
            this.f28497arytenoidectomy = marialVar;
        }
    }

    public /* synthetic */ saneness(competently competentlyVar, byte[] bArr) {
        this(competentlyVar);
    }

    public static attabal marial(CronetEngine cronetEngine) {
        return new attabal(cronetEngine);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f28496monoploid.shutdown();
    }

    public final cuirassed cutely(cuirassed cuirassedVar, okhttp3.marial marialVar) {
        formularize.triweekly(cuirassedVar.getBody());
        return cuirassedVar.getBody() instanceof C0649saneness ? cuirassedVar : cuirassedVar.polder().saneness(new C0649saneness(this, cuirassedVar.getBody(), marialVar, null)).dern();
    }

    public final /* synthetic */ void dern() {
        Iterator it = this.f28494arytenoidectomy.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Map.Entry entry = (Map.Entry) it.next();
                if (((okhttp3.marial) entry.getKey()).getCanceled()) {
                    it.remove();
                    ((UrlRequest) entry.getValue()).cancel();
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // okhttp3.adultoid
    public cuirassed intercept(adultoid.attabal attabalVar) throws IOException {
        if (attabalVar.call().getCanceled()) {
            throw new IOException("Canceled");
        }
        competently.saneness sanenessVarSaneness = this.f28495kowloon.saneness(attabalVar.request(), attabalVar.readTimeoutMillis(), attabalVar.writeTimeoutMillis());
        this.f28494arytenoidectomy.put(attabalVar.call(), sanenessVarSaneness.attabal());
        try {
            sanenessVarSaneness.attabal().start();
            return cutely(sanenessVarSaneness.saneness(), attabalVar.call());
        } catch (IOException | RuntimeException e) {
            this.f28494arytenoidectomy.remove(attabalVar.call());
            throw e;
        }
    }

    public /* synthetic */ Map saneness() {
        return this.f28494arytenoidectomy;
    }

    public saneness(competently competentlyVar) {
        this.f28494arytenoidectomy = new ConcurrentHashMap();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.f28496monoploid = scheduledThreadPoolExecutor;
        this.f28495kowloon = (competently) formularize.triweekly(competentlyVar);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() { // from class: imposure.attabal
            @Override // java.lang.Runnable
            public final void run() {
                this.f28477kowloon.dern();
            }
        }, 500L, 500L, TimeUnit.MILLISECONDS);
    }
}
