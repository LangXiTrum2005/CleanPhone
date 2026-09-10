package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.ArrayMap;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class VersionedParcelStream extends VersionedParcel {
    public static final Charset m = Charset.forName("UTF-16");
    public final DataInputStream d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataOutputStream f8517e;
    public final DataInputStream f;
    public DataOutputStream g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FieldBuffer f8518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8519i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8520l;

    public static class FieldBuffer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f8521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataOutputStream f8522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8523c;
        public final DataOutputStream d;

        public FieldBuffer(int i2, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f8521a = byteArrayOutputStream;
            this.f8522b = new DataOutputStream(byteArrayOutputStream);
            this.f8523c = i2;
            this.d = dataOutputStream;
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.j = 0;
        this.k = -1;
        this.f8520l = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new FilterInputStream(inputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f8520l;
                if (i2 != -1 && versionedParcelStream.j >= i2) {
                    throw new IOException();
                }
                int i3 = super.read();
                versionedParcelStream.j++;
                return i3;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f8520l;
                if (i2 != -1 && versionedParcelStream.j >= i2) {
                    throw new IOException();
                }
                long jSkip = super.skip(j);
                if (jSkip > 0) {
                    versionedParcelStream.j += (int) jSkip;
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i4 = versionedParcelStream.f8520l;
                if (i4 != -1 && versionedParcelStream.j >= i4) {
                    throw new IOException();
                }
                int i5 = super.read(bArr, i2, i3);
                if (i5 > 0) {
                    versionedParcelStream.j += i5;
                }
                return i5;
            }
        }) : null;
        this.d = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f8517e = dataOutputStream;
        this.f = dataInputStream;
        this.g = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() {
        FieldBuffer fieldBuffer = this.f8518h;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.f8521a.size() != 0) {
                    FieldBuffer fieldBuffer2 = this.f8518h;
                    fieldBuffer2.f8522b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = fieldBuffer2.f8521a;
                    int size = byteArrayOutputStream.size();
                    int i2 = fieldBuffer2.f8523c << 16;
                    int i3 = size >= 65535 ? 65535 : size;
                    DataOutputStream dataOutputStream = fieldBuffer2.d;
                    dataOutputStream.writeInt(i2 | i3);
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.f8518h = null;
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        return new VersionedParcelStream(this.f, this.g, this.f8511a, this.f8512b, this.f8513c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        try {
            return this.f.readBoolean();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() {
        DataInputStream dataInputStream = this.f;
        try {
            int i2 = dataInputStream.readInt();
            if (i2 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i2];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i2) {
        while (true) {
            try {
                int i3 = this.k;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                int i4 = this.j;
                int i5 = this.f8520l;
                DataInputStream dataInputStream = this.d;
                if (i4 < i5) {
                    dataInputStream.skip(i5 - i4);
                }
                this.f8520l = -1;
                int i6 = dataInputStream.readInt();
                this.j = 0;
                int i7 = i6 & 65535;
                if (i7 == 65535) {
                    i7 = dataInputStream.readInt();
                }
                this.k = (i6 >> 16) & 65535;
                this.f8520l = i7;
            } catch (IOException unused) {
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        try {
            return this.f.readInt();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Parcelable m() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() {
        DataInputStream dataInputStream = this.f;
        try {
            int i2 = dataInputStream.readInt();
            if (i2 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i2];
            dataInputStream.readFully(bArr);
            return new String(bArr, m);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i2) {
        a();
        FieldBuffer fieldBuffer = new FieldBuffer(i2, this.f8517e);
        this.f8518h = fieldBuffer;
        this.g = fieldBuffer.f8522b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(boolean z2, boolean z3) {
        if (!z2) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f8519i = z3;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z2) {
        try {
            this.g.writeBoolean(z2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) {
        try {
            if (bArr == null) {
                this.g.writeInt(-1);
            } else {
                this.g.writeInt(bArr.length);
                this.g.write(bArr);
            }
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        if (!this.f8519i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i2) {
        try {
            this.g.writeInt(i2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        if (!this.f8519i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) {
        try {
            if (str == null) {
                this.g.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(m);
            this.g.writeInt(bytes.length);
            this.g.write(bytes);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }
}
