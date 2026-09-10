package com.smartdigimkt.n4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f37076i = "rawresource";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f37077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<? super y> f37078c;
    private Uri d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AssetFileDescriptor f37079e;
    private InputStream f;
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37080h;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    public y(Context context) {
        this(context, null);
    }

    public static Uri a(int i2) {
        return Uri.parse("rawresource:///" + i2);
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
                InputStream inputStream = this.f;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f37079e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f37079e = null;
                        if (this.f37080h) {
                            this.f37080h = false;
                            a0<? super y> a0Var = this.f37078c;
                            if (a0Var != null) {
                                a0Var.a(this);
                            }
                        }
                    } catch (IOException e2) {
                        throw new a(e2);
                    }
                } catch (Throwable th) {
                    this.f37079e = null;
                    if (this.f37080h) {
                        this.f37080h = false;
                        a0<? super y> a0Var2 = this.f37078c;
                        if (a0Var2 != null) {
                            a0Var2.a(this);
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw new a(e3);
            }
        } catch (Throwable th2) {
            this.f = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f37079e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f37079e = null;
                    if (this.f37080h) {
                        this.f37080h = false;
                        a0<? super y> a0Var3 = this.f37078c;
                        if (a0Var3 != null) {
                            a0Var3.a(this);
                        }
                    }
                    throw th2;
                } catch (IOException e4) {
                    throw new a(e4);
                }
            } catch (Throwable th3) {
                this.f37079e = null;
                if (this.f37080h) {
                    this.f37080h = false;
                    a0<? super y> a0Var4 = this.f37078c;
                    if (a0Var4 != null) {
                        a0Var4.a(this);
                    }
                }
                throw th3;
            }
        }
    }

    public y(Context context, a0<? super y> a0Var) {
        this.f37077b = context.getResources();
        this.f37078c = a0Var;
    }

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws a {
        try {
            Uri uri = kVar.f37004a;
            this.d = uri;
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                this.f37079e = this.f37077b.openRawResourceFd(Integer.parseInt(this.d.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.f37079e.getFileDescriptor());
                this.f = fileInputStream;
                fileInputStream.skip(this.f37079e.getStartOffset());
                if (this.f.skip(kVar.d) < kVar.d) {
                    throw new EOFException();
                }
                long j = kVar.f37007e;
                long j2 = -1;
                if (j != -1) {
                    this.g = j;
                } else {
                    long length = this.f37079e.getLength();
                    if (length != -1) {
                        j2 = length - kVar.d;
                    }
                    this.g = j2;
                }
                this.f37080h = true;
                a0<? super y> a0Var = this.f37078c;
                if (a0Var != null) {
                    a0Var.a(this, kVar);
                }
                return this.g;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j = this.g;
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
        int i4 = this.f.read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.g == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.g;
        if (j2 != -1) {
            this.g = j2 - ((long) i4);
        }
        a0<? super y> a0Var = this.f37078c;
        if (a0Var != null) {
            a0Var.a(this, i4);
        }
        return i4;
    }
}
