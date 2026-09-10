package androidx.media3.exoplayer;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class LoadingInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5918c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f5919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f5920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f5921c;
    }

    public LoadingInfo(Builder builder) {
        this.f5916a = builder.f5919a;
        this.f5917b = builder.f5920b;
        this.f5918c = builder.f5921c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.f5916a == loadingInfo.f5916a && this.f5917b == loadingInfo.f5917b && this.f5918c == loadingInfo.f5918c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5916a), Float.valueOf(this.f5917b), Long.valueOf(this.f5918c)});
    }
}
