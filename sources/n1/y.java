package n1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f46416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f46418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f46419d;

    public y(h hVar) {
        hVar.getClass();
        this.f46416a = hVar;
        this.f46418c = Uri.EMPTY;
        this.f46419d = Collections.EMPTY_MAP;
    }

    @Override // n1.h
    public final long C(k kVar) {
        h hVar = this.f46416a;
        this.f46418c = kVar.f46369a;
        this.f46419d = Collections.EMPTY_MAP;
        try {
            return hVar.C(kVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f46418c = uri;
            }
            this.f46419d = hVar.getResponseHeaders();
        }
    }

    @Override // n1.h
    public final void c(z zVar) {
        zVar.getClass();
        this.f46416a.c(zVar);
    }

    @Override // n1.h
    public final void close() {
        this.f46416a.close();
    }

    @Override // n1.h
    public final Map getResponseHeaders() {
        return this.f46416a.getResponseHeaders();
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f46416a.getUri();
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f46416a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f46417b += (long) i12;
        }
        return i12;
    }
}
