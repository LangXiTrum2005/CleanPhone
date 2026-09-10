package f4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40648d;

    public g(int i10, int i11, long j10, long j11) {
        this.f40645a = i10;
        this.f40646b = i11;
        this.f40647c = j10;
        this.f40648d = j11;
    }

    public static g a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f40645a);
            dataOutputStream.writeInt(this.f40646b);
            dataOutputStream.writeLong(this.f40647c);
            dataOutputStream.writeLong(this.f40648d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f40646b == gVar.f40646b && this.f40647c == gVar.f40647c && this.f40645a == gVar.f40645a && this.f40648d == gVar.f40648d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40646b), Long.valueOf(this.f40647c), Integer.valueOf(this.f40645a), Long.valueOf(this.f40648d));
    }
}
