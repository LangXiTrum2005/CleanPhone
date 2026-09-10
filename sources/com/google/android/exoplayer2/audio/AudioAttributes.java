package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioAttributes implements Bundleable {
    public static final AudioAttributes h0 = new AudioAttributes(0, 0, 1, 1, 0);
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f17279Y;
    public final int Z;
    public final int e0;
    public final int f0;
    public AudioAttributesV21 g0;

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
        public final android.media.AudioAttributes f17280a;

        public AudioAttributesV21(AudioAttributes audioAttributes) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(audioAttributes.X).setFlags(audioAttributes.f17279Y).setUsage(audioAttributes.Z);
            int i2 = Util.f18979a;
            if (i2 >= 29) {
                Api29.a(usage, audioAttributes.e0);
            }
            if (i2 >= 32) {
                Api32.a(usage, audioAttributes.f0);
            }
            this.f17280a = usage.build();
        }
    }

    public static final class Builder {
    }

    static {
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public AudioAttributes(int i2, int i3, int i4, int i5, int i6) {
        this.X = i2;
        this.f17279Y = i3;
        this.Z = i4;
        this.e0 = i5;
        this.f0 = i6;
    }

    public final AudioAttributesV21 a() {
        if (this.g0 == null) {
            this.g0 = new AudioAttributesV21(this);
        }
        return this.g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AudioAttributes.class == obj.getClass()) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            if (this.X == audioAttributes.X && this.f17279Y == audioAttributes.f17279Y && this.Z == audioAttributes.Z && this.e0 == audioAttributes.e0 && this.f0 == audioAttributes.f0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.X) * 31) + this.f17279Y) * 31) + this.Z) * 31) + this.e0) * 31) + this.f0;
    }
}
