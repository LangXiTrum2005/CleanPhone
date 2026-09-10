package com.smartdigimkt.o4;

import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements com.smartdigimkt.n4.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f37402l = 20480;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.o4.a f37403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37405c;
    private final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.n4.k f37406e;
    private File f;
    private OutputStream g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileOutputStream f37407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37408i;
    private long j;
    private x k;

    public static class a extends com.smartdigimkt.o4.a.C0559a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.smartdigimkt.o4.a aVar, long j) {
        this(aVar, j, 20480, true);
    }

    private void b() throws IOException {
        long j = this.f37406e.f37007e;
        long jMin = j == -1 ? this.f37404b : Math.min(j - this.j, this.f37404b);
        com.smartdigimkt.o4.a aVar = this.f37403a;
        com.smartdigimkt.n4.k kVar = this.f37406e;
        this.f = aVar.a(kVar.f, this.j + kVar.f37006c, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        this.f37407h = fileOutputStream;
        if (this.f37405c > 0) {
            x xVar = this.k;
            if (xVar == null) {
                this.k = new x(this.f37407h, this.f37405c);
            } else {
                xVar.a(fileOutputStream);
            }
            this.g = this.k;
        } else {
            this.g = fileOutputStream;
        }
        this.f37408i = 0L;
    }

    @Override // com.smartdigimkt.n4.g
    public void a(com.smartdigimkt.n4.k kVar) throws a {
        if (kVar.f37007e == -1 && !kVar.a(2)) {
            this.f37406e = null;
            return;
        }
        this.f37406e = kVar;
        this.j = 0L;
        try {
            b();
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // com.smartdigimkt.n4.g
    public void close() throws a {
        if (this.f37406e == null) {
            return;
        }
        try {
            a();
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public b(com.smartdigimkt.o4.a aVar, long j, boolean z2) {
        this(aVar, j, 20480, z2);
    }

    public b(com.smartdigimkt.o4.a aVar, long j, int i2) {
        this(aVar, j, i2, true);
    }

    public b(com.smartdigimkt.o4.a aVar, long j, int i2, boolean z2) {
        this.f37403a = (com.smartdigimkt.o4.a) com.smartdigimkt.p4.a.a(aVar);
        this.f37404b = j;
        this.f37405c = i2;
        this.d = z2;
    }

    @Override // com.smartdigimkt.n4.g
    public void a(byte[] bArr, int i2, int i3) throws a {
        if (this.f37406e == null) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            try {
                if (this.f37408i == this.f37404b) {
                    a();
                    b();
                }
                int iMin = (int) Math.min(i3 - i4, this.f37404b - this.f37408i);
                this.g.write(bArr, i2 + i4, iMin);
                i4 += iMin;
                long j = iMin;
                this.f37408i += j;
                this.j += j;
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
    }

    private void a() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.d) {
                this.f37407h.getFD().sync();
            }
            f0.a(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.f37403a.a(file);
        } catch (Throwable th) {
            f0.a(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }
}
