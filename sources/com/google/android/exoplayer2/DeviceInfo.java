package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceInfo implements Bundleable {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f17022Y;
    public final int Z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    static {
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public DeviceInfo(int i2, int i3, int i4) {
        this.X = i2;
        this.f17022Y = i3;
        this.Z = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.X == deviceInfo.X && this.f17022Y == deviceInfo.f17022Y && this.Z == deviceInfo.Z;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.X) * 31) + this.f17022Y) * 31) + this.Z;
    }
}
