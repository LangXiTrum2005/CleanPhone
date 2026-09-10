package com.smartdigimkt.n4;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0<? super r> f37051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RandomAccessFile f37052c;
    private Uri d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37053e;
    private boolean f;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public r() {
        this(null);
    }

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws a {
        try {
            this.d = kVar.f37004a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f37004a.getPath(), "r");
            this.f37052c = randomAccessFile;
            randomAccessFile.seek(kVar.d);
            long length = kVar.f37007e;
            if (length == -1) {
                length = this.f37052c.length() - kVar.d;
            }
            this.f37053e = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f = true;
            a0<? super r> a0Var = this.f37051b;
            if (a0Var != null) {
                a0Var.a(this, kVar);
            }
            return this.f37053e;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // com.smartdigimkt.n4.h
    public Uri c() {
        return this.d;
    }

    @Override // com.smartdigimkt.n4.h
    public void close() throws a {
        this.d = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f37052c;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f37052c = null;
                if (this.f) {
                    this.f = false;
                    a0<? super r> a0Var = this.f37051b;
                    if (a0Var != null) {
                        a0Var.a(this);
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.f37052c = null;
            if (this.f) {
                this.f = false;
                a0<? super r> a0Var2 = this.f37051b;
                if (a0Var2 != null) {
                    a0Var2.a(this);
                }
            }
            throw th;
        }
    }

    public r(a0<? super r> a0Var) {
        this.f37051b = a0Var;
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j = this.f37053e;
        if (j == 0) {
            return -1;
        }
        try {
            int i4 = this.f37052c.read(bArr, i2, (int) Math.min(j, i3));
            if (i4 > 0) {
                this.f37053e -= (long) i4;
                a0<? super r> a0Var = this.f37051b;
                if (a0Var != null) {
                    a0Var.a(this, i4);
                }
            }
            return i4;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }
}
