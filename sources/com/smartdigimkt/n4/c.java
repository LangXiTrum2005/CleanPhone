package com.smartdigimkt.n4;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f36986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<? super c> f36987c;
    private Uri d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f36988e;
    private long f;
    private boolean g;

    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public c(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws a {
        try {
            Uri uri = kVar.f37004a;
            this.d = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f36986b.open(path, 1);
            this.f36988e = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.d) < kVar.d) {
                throw new EOFException();
            }
            long j = kVar.f37007e;
            if (j != -1) {
                this.f = j;
            } else {
                long jAvailable = this.f36988e.available();
                this.f = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f = -1L;
                }
            }
            this.g = true;
            a0<? super c> a0Var = this.f36987c;
            if (a0Var != null) {
                a0Var.a(this, kVar);
            }
            return this.f;
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
                InputStream inputStream = this.f36988e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f36988e = null;
                if (this.g) {
                    this.g = false;
                    a0<? super c> a0Var = this.f36987c;
                    if (a0Var != null) {
                        a0Var.a(this);
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.f36988e = null;
            if (this.g) {
                this.g = false;
                a0<? super c> a0Var2 = this.f36987c;
                if (a0Var2 != null) {
                    a0Var2.a(this);
                }
            }
            throw th;
        }
    }

    public c(Context context, a0<? super c> a0Var) {
        this.f36986b = context.getAssets();
        this.f36987c = a0Var;
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i3 = (int) Math.min(j, i3);
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
        int i4 = this.f36988e.read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - ((long) i4);
        }
        a0<? super c> a0Var = this.f36987c;
        if (a0Var != null) {
            a0Var.a(this, i4);
        }
        return i4;
    }
}
