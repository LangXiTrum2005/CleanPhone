package com.google.crypto.tink.shaded.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: IterableByteBufferInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class preprohormone extends InputStream {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public byte[] f22264adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public ByteBuffer f22265arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f22266dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public long f22267gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f22268graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Iterator<ByteBuffer> f22269kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f22270molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f22271monoploid = 0;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f22272polloi;

    public preprohormone(Iterable<ByteBuffer> iterable) {
        this.f22269kowloon = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f22271monoploid++;
        }
        this.f22272polloi = -1;
        if (attabal()) {
            return;
        }
        this.f22265arytenoidectomy = rotuma.f22276marial;
        this.f22272polloi = 0;
        this.f22270molybdenite = 0;
        this.f22267gintrap = 0L;
    }

    public final boolean attabal() {
        ByteBuffer next;
        do {
            this.f22272polloi++;
            if (!this.f22269kowloon.hasNext()) {
                return false;
            }
            next = this.f22269kowloon.next();
            this.f22265arytenoidectomy = next;
        } while (!next.hasRemaining());
        this.f22270molybdenite = this.f22265arytenoidectomy.position();
        if (this.f22265arytenoidectomy.hasArray()) {
            this.f22268graveside = true;
            this.f22264adultoid = this.f22265arytenoidectomy.array();
            this.f22266dovishness = this.f22265arytenoidectomy.arrayOffset();
        } else {
            this.f22268graveside = false;
            this.f22267gintrap = sayid.apical(this.f22265arytenoidectomy);
            this.f22264adultoid = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f22272polloi == this.f22271monoploid) {
            return -1;
        }
        if (this.f22268graveside) {
            int i = this.f22264adultoid[this.f22270molybdenite + this.f22266dovishness] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            saneness(1);
            return i;
        }
        int iDovishness = sayid.dovishness(((long) this.f22270molybdenite) + this.f22267gintrap) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        saneness(1);
        return iDovishness;
    }

    public final void saneness(int i) {
        int i2 = this.f22270molybdenite + i;
        this.f22270molybdenite = i2;
        if (i2 == this.f22265arytenoidectomy.limit()) {
            attabal();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f22272polloi == this.f22271monoploid) {
            return -1;
        }
        int iLimit = this.f22265arytenoidectomy.limit();
        int i3 = this.f22270molybdenite;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f22268graveside) {
            System.arraycopy(this.f22264adultoid, i3 + this.f22266dovishness, bArr, i, i2);
            saneness(i2);
            return i2;
        }
        int iPosition = this.f22265arytenoidectomy.position();
        cord.dern(this.f22265arytenoidectomy, this.f22270molybdenite);
        this.f22265arytenoidectomy.get(bArr, i, i2);
        cord.dern(this.f22265arytenoidectomy, iPosition);
        saneness(i2);
        return i2;
    }
}
