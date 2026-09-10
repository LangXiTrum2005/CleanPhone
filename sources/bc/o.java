package bc;

import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f5569c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f5571b;

    public o(File file) {
        this.f5570a = file;
    }

    @Override // bc.d
    public final void a() {
        zb.f.b(this.f5571b, "There was a problem closing the Crashlytics log file.");
        this.f5571b = null;
    }

    public final void b() {
        File file = this.f5570a;
        if (this.f5571b == null) {
            try {
                this.f5571b = new m(file);
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // bc.d
    public final String g() {
        n nVar;
        byte[] bArr;
        if (this.f5570a.exists()) {
            b();
            m mVar = this.f5571b;
            if (mVar == null) {
                nVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[mVar.p()];
                try {
                    this.f5571b.c(new f(bArr2, iArr));
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                nVar = new n(bArr2, iArr[0]);
            }
        } else {
            nVar = null;
        }
        if (nVar == null) {
            bArr = null;
        } else {
            int i10 = nVar.f5568b;
            bArr = new byte[i10];
            System.arraycopy(nVar.f5567a, 0, bArr, 0, i10);
        }
        if (bArr != null) {
            return new String(bArr, f5569c);
        }
        return null;
    }

    @Override // bc.d
    public final void h(long j10, String str) {
        b();
        if (this.f5571b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - Http2.INITIAL_MAX_FRAME_SIZE);
            }
            this.f5571b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f5569c));
            while (!this.f5571b.d() && this.f5571b.p() > 65536) {
                this.f5571b.k();
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }
}
