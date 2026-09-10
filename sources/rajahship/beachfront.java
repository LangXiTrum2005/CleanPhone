package rajahship;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BatchBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront extends DecoderInputBuffer {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f36039cord;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f36040preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public long f36041rotuma;

    public beachfront() {
        super(2);
        this.f36039cord = 32;
    }

    public final boolean adultoid(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!preprohormone()) {
            return true;
        }
        if (this.f36040preprohormone >= this.f36039cord) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f11483polloi;
        return byteBuffer2 == null || (byteBuffer = this.f11483polloi) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public void cord(int i) {
        decarock.attabal.attabal(i > 0);
        this.f36039cord = i;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, miliaria.attabal
    public void dern() {
        super.dern();
        this.f36040preprohormone = 0;
    }

    public long dovishness() {
        return this.f11480graveside;
    }

    public long gintrap() {
        return this.f36041rotuma;
    }

    public boolean graveside(DecoderInputBuffer decoderInputBuffer) {
        decarock.attabal.attabal(!decoderInputBuffer.monoploid());
        decarock.attabal.attabal(!decoderInputBuffer.marial());
        decarock.attabal.attabal(!decoderInputBuffer.taiyuan());
        if (!adultoid(decoderInputBuffer)) {
            return false;
        }
        int i = this.f36040preprohormone;
        this.f36040preprohormone = i + 1;
        if (i == 0) {
            this.f11480graveside = decoderInputBuffer.f11480graveside;
            if (decoderInputBuffer.apical()) {
                impassible(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f11483polloi;
        if (byteBuffer != null) {
            kowloon(byteBuffer.remaining());
            this.f11483polloi.put(byteBuffer);
        }
        this.f36041rotuma = decoderInputBuffer.f11480graveside;
        return true;
    }

    public boolean preprohormone() {
        return this.f36040preprohormone > 0;
    }

    public int rotuma() {
        return this.f36040preprohormone;
    }
}
