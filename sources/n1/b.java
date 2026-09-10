package n1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.F9;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f46335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f46336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f46337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46339i;

    public b(Context context) {
        super(false);
        this.f46335e = context.getAssets();
    }

    @Override // n1.h
    public final long C(k kVar) throws a {
        try {
            Uri uri = kVar.f46369a;
            long j10 = kVar.f46373e;
            this.f46336f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.f46335e.open(path, 1);
            this.f46337g = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new a(2008, null);
            }
            long j11 = kVar.f46374f;
            if (j11 != -1) {
                this.f46338h = j11;
            } else {
                long jAvailable = this.f46337g.available();
                this.f46338h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f46338h = -1L;
                }
            }
            this.f46339i = true;
            g(kVar);
            return this.f46338h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11 instanceof FileNotFoundException ? F9.a.f26068d : 2000, e11);
        }
    }

    @Override // n1.h
    public final void close() {
        this.f46336f = null;
        try {
            try {
                InputStream inputStream = this.f46337g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f46337g = null;
                if (this.f46339i) {
                    this.f46339i = false;
                    d();
                }
            } catch (IOException e10) {
                throw new a(2000, e10);
            }
        } catch (Throwable th2) {
            this.f46337g = null;
            if (this.f46339i) {
                this.f46339i = false;
                d();
            }
            throw th2;
        }
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f46336f;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f46338h;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new a(2000, e10);
                }
            }
            InputStream inputStream = this.f46337g;
            String str = l1.y.f44830a;
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                long j11 = this.f46338h;
                if (j11 != -1) {
                    this.f46338h = j11 - ((long) i12);
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }
}
