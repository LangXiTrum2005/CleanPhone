package androidx.media3.exoplayer.upstream;

import com.google.common.base.Joiner;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class CmcdData {

    public static final class CmcdObject {

        public static final class Builder {
        }
    }

    public static final class CmcdRequest {

        public static final class Builder {
        }
    }

    public static final class CmcdSession {

        public static final class Builder {
        }
    }

    public static final class CmcdStatus {

        public static final class Builder {
        }
    }

    public static final class Factory {
        static {
            Pattern.compile(".*-.*");
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    static {
        new Joiner(",");
    }
}
