package sg.bigo.ads.core.player.a.a;

import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.core.d.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sg.bigo.ads.core.player.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f48739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f48740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RandomAccessFile f48741c;

    public a(sg.bigo.ads.common.h.a aVar) {
        try {
            this.f48740b = aVar;
            File file = new File(aVar.a());
            this.f48739a = file;
            this.f48739a = file.exists() ? this.f48739a : new File(this.f48739a.getParentFile(), f.c(this.f48739a.getName()));
            this.f48741c = new RandomAccessFile(this.f48739a, "r");
        } catch (IOException e2) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error using file " + this.f48739a + " as disc cache, error message is : " + e2.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized int a(byte[] bArr, long j) {
        int i2;
        i2 = 0;
        try {
            this.f48741c.seek(j);
            i2 = this.f48741c.read(bArr, 0, Segment.SIZE);
        } catch (IOException e2) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading 8192 bytes with offset " + j + " from file[" + a() + " bytes] to buffer[" + bArr.length + " bytes], error message is : " + e2.toString());
        }
        return i2;
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized void b() {
        try {
            this.f48741c.close();
        } catch (IOException e2) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing file " + this.f48739a + ", error message is : " + e2.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized boolean c() {
        return this.f48740b.b();
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized long a() {
        long length;
        try {
            length = this.f48741c.length();
        } catch (IOException e2) {
            b.a(3005, 10112, e2.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading length of file " + this.f48739a + ", error message is : " + e2.toString());
            length = 0;
        }
        return length;
    }
}
