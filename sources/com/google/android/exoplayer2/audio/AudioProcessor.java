package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f17286a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class AudioFormat {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AudioFormat f17287e = new AudioFormat(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17290c;
        public final int d;

        public AudioFormat(int i2, int i3, int i4) {
            this.f17288a = i2;
            this.f17289b = i3;
            this.f17290c = i4;
            this.d = Util.z(i4) ? Util.t(i4, i3) : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.f17288a == audioFormat.f17288a && this.f17289b == audioFormat.f17289b && this.f17290c == audioFormat.f17290c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17288a), Integer.valueOf(this.f17289b), Integer.valueOf(this.f17290c)});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f17288a);
            sb.append(", channelCount=");
            sb.append(this.f17289b);
            sb.append(", encoding=");
            return android.support.v4.media.a.p(sb, this.f17290c, AbstractJsonLexerKt.END_LIST);
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            super("Unhandled format: " + audioFormat);
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
