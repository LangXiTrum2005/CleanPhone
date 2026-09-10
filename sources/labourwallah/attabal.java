package labourwallah;

import com.bumptech.glide.load.data.marial;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferRewinder.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal implements marial<ByteBuffer> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ByteBuffer f32570attabal;

    /* JADX INFO: renamed from: labourwallah.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferRewinder.java */
    public static class C0714attabal implements marial.attabal<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.marial.attabal
        public Class<ByteBuffer> attabal() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.marial.attabal
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public marial<ByteBuffer> saneness(ByteBuffer byteBuffer) {
            return new attabal(byteBuffer);
        }
    }

    public attabal(ByteBuffer byteBuffer) {
        this.f32570attabal = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.marial
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public ByteBuffer attabal() {
        this.f32570attabal.position(0);
        return this.f32570attabal;
    }

    @Override // com.bumptech.glide.load.data.marial
    public void saneness() {
    }
}
