package rollout;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: QueueFile.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu implements Closeable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final Logger f36755adultoid = Logger.getLogger(impromptu.class.getName());

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f36756arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final byte[] f36757graveside = new byte[16];

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final RandomAccessFile f36758kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public saneness f36759molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f36760monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public saneness f36761polloi;

    /* JADX INFO: compiled from: QueueFile.java */
    public class attabal implements wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f36762attabal = true;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f36764saneness;

        public attabal(StringBuilder sb) {
            this.f36764saneness = sb;
        }

        @Override // rollout.impromptu.wireman
        public void attabal(InputStream inputStream, int i) throws IOException {
            if (this.f36762attabal) {
                this.f36762attabal = false;
            } else {
                this.f36764saneness.append(", ");
            }
            this.f36764saneness.append(i);
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    public final class dern extends InputStream {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f36765arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f36766kowloon;

        public /* synthetic */ dern(impromptu impromptuVar, saneness sanenessVar, attabal attabalVar) {
            this(sanenessVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            impromptu.kattegat(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f36765arytenoidectomy;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            impromptu.this.creditor(this.f36766kowloon, bArr, i, i2);
            this.f36766kowloon = impromptu.this.milliradian(this.f36766kowloon + i2);
            this.f36765arytenoidectomy -= i2;
            return i2;
        }

        public dern(saneness sanenessVar) {
            this.f36766kowloon = impromptu.this.milliradian(sanenessVar.f36769attabal + 4);
            this.f36765arytenoidectomy = sanenessVar.f36770saneness;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f36765arytenoidectomy == 0) {
                return -1;
            }
            impromptu.this.f36758kowloon.seek(this.f36766kowloon);
            int i = impromptu.this.f36758kowloon.read();
            this.f36766kowloon = impromptu.this.milliradian(this.f36766kowloon + 1);
            this.f36765arytenoidectomy--;
            return i;
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    public static class saneness {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final saneness f36768dern = new saneness(0, 0);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f36769attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36770saneness;

        public saneness(int i, int i2) {
            this.f36769attabal = i;
            this.f36770saneness = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f36769attabal + ", length = " + this.f36770saneness + X3.j.e;
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    public interface wireman {
        void attabal(InputStream inputStream, int i) throws IOException;
    }

    public impromptu(File file) throws IOException {
        if (!file.exists()) {
            rotuma(file);
        }
        this.f36758kowloon = restrictive(file);
        polder();
    }

    public static <T> T kattegat(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void lerp(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void nosophobia(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            lerp(bArr, i, i2);
            i += 4;
        }
    }

    public static RandomAccessFile restrictive(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    public static void rotuma(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileRestrictive = restrictive(file2);
        try {
            randomAccessFileRestrictive.setLength(4096L);
            randomAccessFileRestrictive.seek(0L);
            byte[] bArr = new byte[16];
            nosophobia(bArr, 4096, 0, 0, 0);
            randomAccessFileRestrictive.write(bArr);
            randomAccessFileRestrictive.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileRestrictive.close();
            throw th;
        }
    }

    public static int seminary(byte[] bArr, int i) {
        return ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) + ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public synchronized void arytenoidectomy() throws IOException {
        try {
            itchy(4096, 0, 0, 0);
            this.f36760monoploid = 0;
            saneness sanenessVar = saneness.f36768dern;
            this.f36761polloi = sanenessVar;
            this.f36759molybdenite = sanenessVar;
            if (this.f36756arytenoidectomy > 4096) {
                dent(4096);
            }
            this.f36756arytenoidectomy = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f36758kowloon.close();
    }

    public final void creditor(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iMilliradian = milliradian(i);
        int i4 = iMilliradian + i3;
        int i5 = this.f36756arytenoidectomy;
        if (i4 <= i5) {
            this.f36758kowloon.seek(iMilliradian);
            this.f36758kowloon.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iMilliradian;
        this.f36758kowloon.seek(iMilliradian);
        this.f36758kowloon.readFully(bArr, i2, i6);
        this.f36758kowloon.seek(16L);
        this.f36758kowloon.readFully(bArr, i2 + i6, i3 - i6);
    }

    public synchronized boolean cuirassed() {
        return this.f36760monoploid == 0;
    }

    public void cutely(byte[] bArr) throws IOException {
        formularize(bArr, 0, bArr.length);
    }

    public final void dent(int i) throws IOException {
        this.f36758kowloon.setLength(i);
        this.f36758kowloon.getChannel().force(true);
    }

    public synchronized void dovishness(wireman wiremanVar) throws IOException {
        int iMilliradian = this.f36761polloi.f36769attabal;
        for (int i = 0; i < this.f36760monoploid; i++) {
            saneness sanenessVarMerc = merc(iMilliradian);
            wiremanVar.attabal(new dern(this, sanenessVarMerc, null), sanenessVarMerc.f36770saneness);
            iMilliradian = milliradian(sanenessVarMerc.f36769attabal + 4 + sanenessVarMerc.f36770saneness);
        }
    }

    public synchronized void formularize(byte[] bArr, int i, int i2) throws IOException {
        int iMilliradian;
        try {
            kattegat(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            monoploid(i2);
            boolean zCuirassed = cuirassed();
            if (zCuirassed) {
                iMilliradian = 16;
            } else {
                saneness sanenessVar = this.f36759molybdenite;
                iMilliradian = milliradian(sanenessVar.f36769attabal + 4 + sanenessVar.f36770saneness);
            }
            saneness sanenessVar2 = new saneness(iMilliradian, i2);
            lerp(this.f36757graveside, 0, i2);
            starveling(sanenessVar2.f36769attabal, this.f36757graveside, 0, 4);
            starveling(sanenessVar2.f36769attabal + 4, bArr, i, i2);
            itchy(this.f36756arytenoidectomy, this.f36760monoploid + 1, zCuirassed ? sanenessVar2.f36769attabal : this.f36761polloi.f36769attabal, sanenessVar2.f36769attabal);
            this.f36759molybdenite = sanenessVar2;
            this.f36760monoploid++;
            if (zCuirassed) {
                this.f36761polloi = sanenessVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void itchy(int i, int i2, int i3, int i4) throws IOException {
        nosophobia(this.f36757graveside, i, i2, i3, i4);
        this.f36758kowloon.seek(0L);
        this.f36758kowloon.write(this.f36757graveside);
    }

    public final saneness merc(int i) throws IOException {
        if (i == 0) {
            return saneness.f36768dern;
        }
        this.f36758kowloon.seek(i);
        return new saneness(i, this.f36758kowloon.readInt());
    }

    public final int milliradian(int i) {
        int i2 = this.f36756arytenoidectomy;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void monoploid(int i) throws IOException {
        int i2 = i + 4;
        int iSaran = saran();
        if (iSaran >= i2) {
            return;
        }
        int i3 = this.f36756arytenoidectomy;
        do {
            iSaran += i3;
            i3 <<= 1;
        } while (iSaran < i2);
        dent(i3);
        saneness sanenessVar = this.f36759molybdenite;
        int iMilliradian = milliradian(sanenessVar.f36769attabal + 4 + sanenessVar.f36770saneness);
        if (iMilliradian < this.f36761polloi.f36769attabal) {
            FileChannel channel = this.f36758kowloon.getChannel();
            channel.position(this.f36756arytenoidectomy);
            long j = iMilliradian - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f36759molybdenite.f36769attabal;
        int i5 = this.f36761polloi.f36769attabal;
        if (i4 < i5) {
            int i6 = (this.f36756arytenoidectomy + i4) - 16;
            itchy(i3, this.f36760monoploid, i5, i6);
            this.f36759molybdenite = new saneness(i6, this.f36759molybdenite.f36770saneness);
        } else {
            itchy(i3, this.f36760monoploid, i5, i4);
        }
        this.f36756arytenoidectomy = i3;
    }

    public final void polder() throws IOException {
        this.f36758kowloon.seek(0L);
        this.f36758kowloon.readFully(this.f36757graveside);
        int iSeminary = seminary(this.f36757graveside, 0);
        this.f36756arytenoidectomy = iSeminary;
        if (iSeminary <= this.f36758kowloon.length()) {
            this.f36760monoploid = seminary(this.f36757graveside, 4);
            int iSeminary2 = seminary(this.f36757graveside, 8);
            int iSeminary3 = seminary(this.f36757graveside, 12);
            this.f36761polloi = merc(iSeminary2);
            this.f36759molybdenite = merc(iSeminary3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f36756arytenoidectomy + ", Actual length: " + this.f36758kowloon.length());
    }

    public synchronized void privatdozent() throws IOException {
        try {
            if (cuirassed()) {
                throw new NoSuchElementException();
            }
            if (this.f36760monoploid == 1) {
                arytenoidectomy();
            } else {
                saneness sanenessVar = this.f36761polloi;
                int iMilliradian = milliradian(sanenessVar.f36769attabal + 4 + sanenessVar.f36770saneness);
                creditor(iMilliradian, this.f36757graveside, 0, 4);
                int iSeminary = seminary(this.f36757graveside, 0);
                itchy(this.f36756arytenoidectomy, this.f36760monoploid - 1, iMilliradian, this.f36759molybdenite.f36769attabal);
                this.f36760monoploid--;
                this.f36761polloi = new saneness(iMilliradian, iSeminary);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int saran() {
        return this.f36756arytenoidectomy - timberyard();
    }

    public final void starveling(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iMilliradian = milliradian(i);
        int i4 = iMilliradian + i3;
        int i5 = this.f36756arytenoidectomy;
        if (i4 <= i5) {
            this.f36758kowloon.seek(iMilliradian);
            this.f36758kowloon.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iMilliradian;
        this.f36758kowloon.seek(iMilliradian);
        this.f36758kowloon.write(bArr, i2, i6);
        this.f36758kowloon.seek(16L);
        this.f36758kowloon.write(bArr, i2 + i6, i3 - i6);
    }

    public int timberyard() {
        if (this.f36760monoploid == 0) {
            return 16;
        }
        saneness sanenessVar = this.f36759molybdenite;
        int i = sanenessVar.f36769attabal;
        int i2 = this.f36761polloi.f36769attabal;
        return i >= i2 ? (i - i2) + 4 + sanenessVar.f36770saneness + 16 : (((i + 4) + sanenessVar.f36770saneness) + this.f36756arytenoidectomy) - i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f36756arytenoidectomy);
        sb.append(", size=");
        sb.append(this.f36760monoploid);
        sb.append(", first=");
        sb.append(this.f36761polloi);
        sb.append(", last=");
        sb.append(this.f36759molybdenite);
        sb.append(", element lengths=[");
        try {
            dovishness(new attabal(sb));
        } catch (IOException e) {
            f36755adultoid.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
