package okhttp3.internal.publicsuffix;

import an.h;
import com.google.android.gms.internal.play_billing.q1;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.m;
import j1.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import lo.j;
import qk.i0;
import xj.v;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "j2/n", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f47557e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f47558f = f.C("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f47559g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f47560a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f47561b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f47562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f47563d;

    public static List c(String str) {
        List listJ0 = h.J0(str, new char[]{'.'});
        return n.a(xj.n.w0(listJ0), "") ? xj.n.l0(listJ0) : listJ0;
    }

    public final String a(String str) {
        String strD;
        String strD2;
        String strD3;
        List listJ0;
        int size;
        int size2;
        String unicodeDomain = IDN.toUnicode(str);
        n.e(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        List listJ1 = v.f53866a;
        if (this.f47560a.get() || !this.f47560a.compareAndSet(false, true)) {
            try {
                this.f47561b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    } catch (IOException e10) {
                        m mVar = m.f42045a;
                        m.f42045a.getClass();
                        m.g("Failed to read public suffix list", 5, e10);
                        if (z10) {
                        }
                    }
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f47562c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i10 = 0; i10 < size3; i10++) {
            String str2 = (String) listC.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            n.e(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                strD = null;
                break;
            }
            byte[] bArr2 = this.f47562c;
            if (bArr2 == null) {
                n.l("publicSuffixListBytes");
                throw null;
            }
            strD = j2.n.d(bArr2, bArr, i11);
            if (strD != null) {
                break;
            }
            i11++;
        }
        if (size3 <= 1) {
            strD2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                strD2 = null;
                break;
            }
            bArr3[i12] = f47557e;
            byte[] bArr4 = this.f47562c;
            if (bArr4 == null) {
                n.l("publicSuffixListBytes");
                throw null;
            }
            strD2 = j2.n.d(bArr4, bArr3, i12);
            if (strD2 != null) {
                break;
            }
            i12++;
        }
        if (strD2 == null) {
            strD3 = null;
            break;
        }
        int i13 = size3 - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                strD3 = null;
                break;
            }
            byte[] bArr5 = this.f47563d;
            if (bArr5 == null) {
                n.l("publicSuffixExceptionListBytes");
                throw null;
            }
            strD3 = j2.n.d(bArr5, bArr, i14);
            if (strD3 != null) {
                break;
            }
            i14++;
        }
        if (strD3 != null) {
            listJ0 = h.J0("!".concat(strD3), new char[]{'.'});
        } else if (strD == null && strD2 == null) {
            listJ0 = f47558f;
        } else {
            List listJ2 = strD != null ? h.J0(strD, new char[]{'.'}) : listJ1;
            if (strD2 != null) {
                listJ1 = h.J0(strD2, new char[]{'.'});
            }
            listJ0 = listJ2.size() > listJ1.size() ? listJ2 : listJ1;
        }
        if (listC.size() == listJ0.size() && ((String) listJ0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listJ0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listJ0.size();
        } else {
            size = listC.size();
            size2 = listJ0.size() + 1;
        }
        return l.T(l.O(xj.n.g0(c(str)), size - size2), ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                lo.n nVar = new lo.n(new j(q1.B(resourceAsStream)));
                try {
                    long j10 = nVar.readInt();
                    nVar.require(j10);
                    byte[] byteArray = nVar.f45657b.readByteArray(j10);
                    long j11 = nVar.readInt();
                    nVar.require(j11);
                    byte[] byteArray2 = nVar.f45657b.readByteArray(j11);
                    nVar.close();
                    synchronized (this) {
                        this.f47562c = byteArray;
                        this.f47563d = byteArray2;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        i0.j(nVar, th2);
                        throw th3;
                    }
                }
            }
            this.f47561b.countDown();
        } catch (Throwable th4) {
            this.f47561b.countDown();
            throw th4;
        }
    }
}
