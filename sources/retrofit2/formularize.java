package retrofit2;

import duvetyn.supplicat;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: OkHttpCall.java */
/* JADX INFO: loaded from: classes5.dex */
public final class formularize<T> implements retrofit2.saneness<T> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    @Nullable
    public Throwable f36488adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Object[] f36489arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f36490dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    @Nullable
    public okhttp3.marial f36491graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final gintrap f36492kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public volatile boolean f36493molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final okhttp3.marial.attabal f36494monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final beachfront<okhttp3.stratoscope, T> f36495polloi;

    /* JADX INFO: compiled from: OkHttpCall.java */
    public class attabal implements okhttp3.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ wireman f36496attabal;

        public attabal(wireman wiremanVar) {
            this.f36496attabal = wiremanVar;
        }

        public final void attabal(Throwable th) {
            try {
                this.f36496attabal.attabal(formularize.this, th);
            } catch (Throwable th2) {
                trm.molybdenite(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.beachfront
        public void onFailure(okhttp3.marial marialVar, IOException iOException) {
            attabal(iOException);
        }

        @Override // okhttp3.beachfront
        public void onResponse(okhttp3.marial marialVar, okhttp3.cuirassed cuirassedVar) {
            try {
                try {
                    this.f36496attabal.saneness(formularize.this, formularize.this.marial(cuirassedVar));
                } catch (Throwable th) {
                    trm.molybdenite(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                trm.molybdenite(th2);
                attabal(th2);
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class dern extends okhttp3.stratoscope {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final long f36498arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        @Nullable
        public final okhttp3.dovishness f36499kowloon;

        public dern(@Nullable okhttp3.dovishness dovishnessVar, long j) {
            this.f36499kowloon = dovishnessVar;
            this.f36498arytenoidectomy = j;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f36498arytenoidectomy;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentType */
        public okhttp3.dovishness getContentType() {
            return this.f36499kowloon;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: source */
        public duvetyn.beachfront getDelegateSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class saneness extends okhttp3.stratoscope {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final duvetyn.beachfront f36500arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final okhttp3.stratoscope f36501kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        @Nullable
        public IOException f36502monoploid;

        /* JADX INFO: compiled from: OkHttpCall.java */
        public class attabal extends duvetyn.formularize {
            public attabal(supplicat supplicatVar) {
                super(supplicatVar);
            }

            @Override // duvetyn.formularize, duvetyn.supplicat
            public long read(duvetyn.wireman wiremanVar, long j) throws IOException {
                try {
                    return super.read(wiremanVar, j);
                } catch (IOException e) {
                    saneness.this.f36502monoploid = e;
                    throw e;
                }
            }
        }

        public saneness(okhttp3.stratoscope stratoscopeVar) {
            this.f36501kowloon = stratoscopeVar;
            this.f36500arytenoidectomy = duvetyn.adultoid.wireman(new attabal(stratoscopeVar.getDelegateSource()));
        }

        @Override // okhttp3.stratoscope, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f36501kowloon.close();
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f36501kowloon.getContentLength();
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentType */
        public okhttp3.dovishness getContentType() {
            return this.f36501kowloon.getContentType();
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: source */
        public duvetyn.beachfront getDelegateSource() {
            return this.f36500arytenoidectomy;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.f36502monoploid;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public formularize(gintrap gintrapVar, Object[] objArr, okhttp3.marial.attabal attabalVar, beachfront<okhttp3.stratoscope, T> beachfrontVar) {
        this.f36492kowloon = gintrapVar;
        this.f36489arytenoidectomy = objArr;
        this.f36494monoploid = attabalVar;
        this.f36495polloi = beachfrontVar;
    }

    @Override // retrofit2.saneness
    public void arytenoidectomy(wireman<T> wiremanVar) {
        okhttp3.marial marialVar;
        Throwable th;
        Objects.requireNonNull(wiremanVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f36490dovishness) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f36490dovishness = true;
                marialVar = this.f36491graveside;
                th = this.f36488adultoid;
                if (marialVar == null && th == null) {
                    try {
                        okhttp3.marial marialVarDern = dern();
                        this.f36491graveside = marialVarDern;
                        marialVar = marialVarDern;
                    } catch (Throwable th2) {
                        th = th2;
                        trm.molybdenite(th);
                        this.f36488adultoid = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            wiremanVar.attabal(this, th);
            return;
        }
        if (this.f36493molybdenite) {
            marialVar.cancel();
        }
        marialVar.privatdozent(new attabal(wiremanVar));
    }

    @Override // retrofit2.saneness
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public formularize<T> clone() {
        return new formularize<>(this.f36492kowloon, this.f36489arytenoidectomy, this.f36494monoploid, this.f36495polloi);
    }

    @Override // retrofit2.saneness
    public void cancel() {
        okhttp3.marial marialVar;
        this.f36493molybdenite = true;
        synchronized (this) {
            marialVar = this.f36491graveside;
        }
        if (marialVar != null) {
            marialVar.cancel();
        }
    }

    public final okhttp3.marial dern() throws IOException {
        okhttp3.marial marialVarAttabal = this.f36494monoploid.attabal(this.f36492kowloon.attabal(this.f36489arytenoidectomy));
        if (marialVarAttabal != null) {
            return marialVarAttabal;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.saneness
    public boolean isCanceled() {
        boolean z = true;
        if (this.f36493molybdenite) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.marial marialVar = this.f36491graveside;
                if (marialVar == null || !marialVar.getCanceled()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public rotuma<T> marial(okhttp3.cuirassed cuirassedVar) throws IOException {
        okhttp3.stratoscope body = cuirassedVar.getBody();
        okhttp3.cuirassed cuirassedVarDern = cuirassedVar.polder().saneness(new dern(body.getContentType(), body.getContentLength())).dern();
        int code = cuirassedVarDern.getCode();
        if (code < 200 || code >= 300) {
            try {
                return rotuma.dern(trm.attabal(body), cuirassedVarDern);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return rotuma.beachfront(null, cuirassedVarDern);
        }
        saneness sanenessVar = new saneness(body);
        try {
            return rotuma.beachfront(this.f36495polloi.convert(sanenessVar), cuirassedVarDern);
        } catch (RuntimeException e) {
            sanenessVar.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.saneness
    public synchronized okhttp3.preprohormone request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return wireman().request();
    }

    public final okhttp3.marial wireman() throws IOException {
        okhttp3.marial marialVar = this.f36491graveside;
        if (marialVar != null) {
            return marialVar;
        }
        Throwable th = this.f36488adultoid;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.marial marialVarDern = dern();
            this.f36491graveside = marialVarDern;
            return marialVarDern;
        } catch (IOException | Error | RuntimeException e) {
            trm.molybdenite(e);
            this.f36488adultoid = e;
            throw e;
        }
    }
}
