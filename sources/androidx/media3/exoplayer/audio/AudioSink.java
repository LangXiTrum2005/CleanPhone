package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    public static final class AudioTrackConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6084c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6085e;
        public final int f;

        public AudioTrackConfig(int i2, int i3, int i4, boolean z2, boolean z3, int i5) {
            this.f6082a = i2;
            this.f6083b = i3;
            this.f6084c = i4;
            this.d = z2;
            this.f6085e = z3;
            this.f = i5;
        }
    }

    public static final class InitializationException extends Exception {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f6086Y;
        public final Format Z;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i2, int i3, int i4, int i5, Format format, boolean z2, RuntimeException runtimeException) {
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "AudioTrack init failed ", " Config(", ", ");
            androidx.datastore.preferences.protobuf.a.y(sbP, i4, ", ", i5, ") ");
            sbP.append(format);
            sbP.append(z2 ? " (recoverable)" : "");
            super(sbP.toString(), runtimeException);
            this.X = i2;
            this.f6086Y = z2;
            this.Z = format;
        }
    }

    public interface Listener {
        default void j(AudioTrackConfig audioTrackConfig) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
    }

    public static final class WriteException extends Exception {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f6087Y;
        public final Format Z;

        public WriteException(int i2, Format format, boolean z2) {
            super(android.support.v4.media.a.h(i2, "AudioTrack write failed: "));
            this.f6087Y = z2;
            this.X = i2;
            this.Z = format;
        }
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    public static final class ConfigurationException extends Exception {
        public final Format X;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, Format format) {
            super(unhandledAudioFormatException);
            this.X = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.X = format;
        }
    }
}
