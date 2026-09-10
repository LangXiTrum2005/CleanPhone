package androidx.datastore.preferences.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: IterableByteBufferInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class rotuma extends InputStream {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public byte[] f9808adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public ByteBuffer f9809arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f9810dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public long f9811gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f9812graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Iterator<ByteBuffer> f9813kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f9814molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f9815monoploid = 0;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f9816polloi;

    public rotuma(Iterable<ByteBuffer> iterable) {
        this.f9813kowloon = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f9815monoploid++;
        }
        this.f9816polloi = -1;
        if (attabal()) {
            return;
        }
        this.f9809arytenoidectomy = gintrap.f9717marial;
        this.f9816polloi = 0;
        this.f9814molybdenite = 0;
        this.f9811gintrap = 0L;
    }

    public final boolean attabal() {
        this.f9816polloi++;
        if (!this.f9813kowloon.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f9813kowloon.next();
        this.f9809arytenoidectomy = next;
        this.f9814molybdenite = next.position();
        if (this.f9809arytenoidectomy.hasArray()) {
            this.f9812graveside = true;
            this.f9808adultoid = this.f9809arytenoidectomy.array();
            this.f9810dovishness = this.f9809arytenoidectomy.arrayOffset();
        } else {
            this.f9812graveside = false;
            this.f9811gintrap = sayid.apical(this.f9809arytenoidectomy);
            this.f9808adultoid = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f9816polloi == this.f9815monoploid) {
            return -1;
        }
        if (this.f9812graveside) {
            int i = this.f9808adultoid[this.f9814molybdenite + this.f9810dovishness] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            saneness(1);
            return i;
        }
        int iDovishness = sayid.dovishness(((long) this.f9814molybdenite) + this.f9811gintrap) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        saneness(1);
        return iDovishness;
    }

    public final void saneness(int i) {
        int i2 = this.f9814molybdenite + i;
        this.f9814molybdenite = i2;
        if (i2 == this.f9809arytenoidectomy.limit()) {
            attabal();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9816polloi == this.f9815monoploid) {
            return -1;
        }
        int iLimit = this.f9809arytenoidectomy.limit();
        int i3 = this.f9814molybdenite;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f9812graveside) {
            System.arraycopy(this.f9808adultoid, i3 + this.f9810dovishness, bArr, i, i2);
            saneness(i2);
            return i2;
        }
        int iPosition = this.f9809arytenoidectomy.position();
        preprohormone.dern(this.f9809arytenoidectomy, this.f9814molybdenite);
        this.f9809arytenoidectomy.get(bArr, i, i2);
        preprohormone.dern(this.f9809arytenoidectomy, iPosition);
        saneness(i2);
        return i2;
    }
}
