package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f17293Y;
        public final Format Z;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i2, int i3, int i4, int i5, Format format, boolean z2, RuntimeException runtimeException) {
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "AudioTrack init failed ", " Config(", ", ");
            androidx.datastore.preferences.protobuf.a.y(sbP, i4, ", ", i5, ") ");
            sbP.append(format);
            sbP.append(z2 ? " (recoverable)" : "");
            super(sbP.toString(), runtimeException);
            this.X = i2;
            this.f17293Y = z2;
            this.Z = format;
        }
    }

    public interface Listener {
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
        public final boolean f17294Y;
        public final Format Z;

        public WriteException(int i2, Format format, boolean z2) {
            super(android.support.v4.media.a.h(i2, "AudioTrack write failed: "));
            this.f17294Y = z2;
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
