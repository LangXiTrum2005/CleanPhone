package n1;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.ironsource.F9;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f46402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f46403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f46404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46405h;

    @Override // n1.h
    public final long C(k kVar) throws p {
        Uri uri = kVar.f46369a;
        long j10 = kVar.f46373e;
        this.f46403f = uri;
        e();
        int i10 = F9.a.f26070f;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f46402e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = kVar.f46374f;
                if (length == -1) {
                    length = this.f46402e.length() - j10;
                }
                this.f46404g = length;
                if (length < 0) {
                    throw new p(2008, null, null);
                }
                this.f46405h = true;
                g(kVar);
                return this.f46404g;
            } catch (IOException e10) {
                throw new p(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e11.getCause() instanceof ErrnoException) || ((ErrnoException) e11.getCause()).errno != OsConstants.EACCES) {
                    i10 = F9.a.f26068d;
                }
                throw new p(i10, e11);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbV = defpackage.e.v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbV.append(fragment);
            throw new p(1004, e11, sbV.toString());
        } catch (SecurityException e12) {
            throw new p(F9.a.f26070f, e12);
        } catch (RuntimeException e13) {
            throw new p(2000, e13);
        }
    }

    @Override // n1.h
    public final void close() {
        this.f46403f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f46402e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f46402e = null;
                if (this.f46405h) {
                    this.f46405h = false;
                    d();
                }
            } catch (IOException e10) {
                throw new p(2000, e10);
            }
        } catch (Throwable th2) {
            this.f46402e = null;
            if (this.f46405h) {
                this.f46405h = false;
                d();
            }
            throw th2;
        }
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f46403f;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws p {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f46404g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f46402e;
            String str = l1.y.f44830a;
            int i12 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                this.f46404g -= (long) i12;
                b(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new p(2000, e10);
        }
    }
}
