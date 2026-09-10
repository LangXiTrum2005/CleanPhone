package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5392b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5394b;
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    static {
        Builder builder = new Builder();
        Assertions.b(builder.f5393a <= builder.f5394b);
        new DeviceInfo(builder);
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
    }

    public DeviceInfo(Builder builder) {
        builder.getClass();
        this.f5391a = builder.f5393a;
        this.f5392b = builder.f5394b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        deviceInfo.getClass();
        if (this.f5391a != deviceInfo.f5391a || this.f5392b != deviceInfo.f5392b) {
            return false;
        }
        int i2 = Util.f5683a;
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f5391a) * 31) + this.f5392b) * 31;
    }
}
