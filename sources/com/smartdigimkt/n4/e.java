package com.smartdigimkt.n4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f36989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<? super e> f36990c;
    private Uri d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AssetFileDescriptor f36991e;
    private FileInputStream f;
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36992h;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public e(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws a {
        try {
            Uri uri = kVar.f37004a;
            this.d = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f36989b.openAssetFileDescriptor(uri, "r");
            this.f36991e = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.d);
            }
            this.f = new FileInputStream(this.f36991e.getFileDescriptor());
            long startOffset = this.f36991e.getStartOffset();
            long jSkip = this.f.skip(kVar.d + startOffset) - startOffset;
            if (jSkip != kVar.d) {
                throw new EOFException();
            }
            long j = kVar.f37007e;
            long jPosition = -1;
            if (j != -1) {
                this.g = j;
            } else {
                long length = this.f36991e.getLength();
                if (length == -1) {
                    FileChannel channel = this.f.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        jPosition = size - channel.position();
                    }
                    this.g = jPosition;
                } else {
                    this.g = length - jSkip;
                }
            }
            this.f36992h = true;
            a0<? super e> a0Var = this.f36990c;
            if (a0Var != null) {
                a0Var.a(this, kVar);
            }
            return this.g;
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
                FileInputStream fileInputStream = this.f;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f36991e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f36991e = null;
                        if (this.f36992h) {
                            this.f36992h = false;
                            a0<? super e> a0Var = this.f36990c;
                            if (a0Var != null) {
                                a0Var.a(this);
                            }
                        }
                    } catch (IOException e2) {
                        throw new a(e2);
                    }
                } catch (Throwable th) {
                    this.f36991e = null;
                    if (this.f36992h) {
                        this.f36992h = false;
                        a0<? super e> a0Var2 = this.f36990c;
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
                    AssetFileDescriptor assetFileDescriptor2 = this.f36991e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f36991e = null;
                    if (this.f36992h) {
                        this.f36992h = false;
                        a0<? super e> a0Var3 = this.f36990c;
                        if (a0Var3 != null) {
                            a0Var3.a(this);
                        }
                    }
                    throw th2;
                } catch (IOException e4) {
                    throw new a(e4);
                }
            } catch (Throwable th3) {
                this.f36991e = null;
                if (this.f36992h) {
                    this.f36992h = false;
                    a0<? super e> a0Var4 = this.f36990c;
                    if (a0Var4 != null) {
                        a0Var4.a(this);
                    }
                }
                throw th3;
            }
        }
    }

    public e(Context context, a0<? super e> a0Var) {
        this.f36989b = context.getContentResolver();
        this.f36990c = a0Var;
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
        a0<? super e> a0Var = this.f36990c;
        if (a0Var != null) {
            a0Var.a(this, i4);
        }
        return i4;
    }
}
