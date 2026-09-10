package androidx.media3.common.audio;

import android.support.v4.media.a;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f5559a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class AudioFormat {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AudioFormat f5560e = new AudioFormat(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5563c;
        public final int d;

        public AudioFormat(int i2, int i3, int i4) {
            this.f5561a = i2;
            this.f5562b = i3;
            this.f5563c = i4;
            this.d = Util.F(i4) ? Util.x(i4, i3) : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.f5561a == audioFormat.f5561a && this.f5562b == audioFormat.f5562b && this.f5563c == audioFormat.f5563c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5561a), Integer.valueOf(this.f5562b), Integer.valueOf(this.f5563c)});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f5561a);
            sb.append(", channelCount=");
            sb.append(this.f5562b);
            sb.append(", encoding=");
            return a.p(sb, this.f5563c, AbstractJsonLexerKt.END_LIST);
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            super("Unhandled input format: " + audioFormat);
        }
    }

    AudioFormat a(AudioFormat audioFormat);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
