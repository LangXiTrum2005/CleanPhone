package androidx.media;

import android.media.VolumeProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class VolumeProviderCompat {

    /* JADX INFO: renamed from: androidx.media.VolumeProviderCompat$1, reason: invalid class name */
    class AnonymousClass1 extends VolumeProvider {
        @Override // android.media.VolumeProvider
        public final void onAdjustVolume(int i2) {
            throw null;
        }

        @Override // android.media.VolumeProvider
        public final void onSetVolumeTo(int i2) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.media.VolumeProviderCompat$2, reason: invalid class name */
    class AnonymousClass2 extends VolumeProvider {
        @Override // android.media.VolumeProvider
        public final void onAdjustVolume(int i2) {
            throw null;
        }

        @Override // android.media.VolumeProvider
        public final void onSetVolumeTo(int i2) {
            throw null;
        }
    }

    public static class Api21Impl {
        public static void a(VolumeProvider volumeProvider, int i2) {
            volumeProvider.setCurrentVolume(i2);
        }
    }

    public static abstract class Callback {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }
}
