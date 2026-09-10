package androidx.media3.exoplayer.upstream;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public interface LoadErrorHandlingPolicy {

    public static final class FallbackOptions {
    }

    public static final class FallbackSelection {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    public static final class LoadErrorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IOException f6574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6575b;

        public LoadErrorInfo(IOException iOException, int i2) {
            this.f6574a = iOException;
            this.f6575b = i2;
        }
    }

    int a(int i2);

    long b(LoadErrorInfo loadErrorInfo);
}
