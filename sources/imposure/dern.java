package imposure;

import okhttp3.dovishness;
import okhttp3.stratoscope;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dern extends stratoscope {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final stratoscope f28489kowloon;

    public dern(stratoscope stratoscopeVar) {
        this.f28489kowloon = stratoscopeVar;
    }

    public abstract void attabal();

    @Override // okhttp3.stratoscope, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28489kowloon.close();
        attabal();
    }

    @Override // okhttp3.stratoscope
    /* JADX INFO: renamed from: contentLength */
    public final long getF34695arytenoidectomy() {
        return this.f28489kowloon.getF34695arytenoidectomy();
    }

    @Override // okhttp3.stratoscope
    /* JADX INFO: renamed from: contentType */
    public final dovishness getF34696kowloon() {
        return this.f28489kowloon.getF34696kowloon();
    }

    @Override // okhttp3.stratoscope
    /* JADX INFO: renamed from: source */
    public final duvetyn.beachfront getF34697monoploid() {
        return this.f28489kowloon.getF34697monoploid();
    }
}
