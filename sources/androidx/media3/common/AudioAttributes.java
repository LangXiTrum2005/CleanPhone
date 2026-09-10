package androidx.media3.common;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributes {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AudioAttributes f5374b = new AudioAttributes();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesV21 f5375a;

    public static final class Api29 {
        public static void a(android.media.AudioAttributes.Builder builder, int i2) {
            builder.setAllowedCapturePolicy(i2);
        }
    }

    public static final class Api32 {
        public static void a(android.media.AudioAttributes.Builder builder, int i2) {
            builder.setSpatializationBehavior(i2);
        }
    }

    public static final class AudioAttributesV21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.media.AudioAttributes f5376a;

        public AudioAttributesV21(AudioAttributes audioAttributes) {
            android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
            audioAttributes.getClass();
            android.media.AudioAttributes.Builder usage = builder.setContentType(0).setFlags(0).setUsage(1);
            int i2 = Util.f5683a;
            if (i2 >= 29) {
                Api29.a(usage, 1);
            }
            if (i2 >= 32) {
                Api32.a(usage, 0);
            }
            this.f5376a = usage.build();
        }
    }

    public static final class Builder {
    }

    static {
        a.s(0, 1, 2, 3, 4);
    }

    public final AudioAttributesV21 a() {
        if (this.f5375a == null) {
            this.f5375a = new AudioAttributesV21(this);
        }
        return this.f5375a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
