package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public interface RendererCapabilities {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdaptiveSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioOffloadSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Capabilities {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HardwareAccelerationSupport {
    }

    public interface Listener {
        void a(Renderer renderer);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TunnelingSupport {
    }

    static boolean g(int i2, boolean z2) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z2 && i3 == 3;
        }
        return true;
    }

    static int h(int i2, int i3, int i4, int i5) {
        return i2 | i3 | i4 | 128 | i5;
    }

    int a(Format format);

    default void f() {
    }

    String getName();

    int getTrackType();

    default void n(Listener listener) {
    }

    int supportsMixedMimeTypeAdaptation();
}
