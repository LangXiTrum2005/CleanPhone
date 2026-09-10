package androidx.media3.extractor;

import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Extractor {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    default Extractor b() {
        return this;
    }

    boolean c(ExtractorInput extractorInput);

    void d(ExtractorOutput extractorOutput);

    default List e() {
        return ImmutableList.x();
    }

    int f(ExtractorInput extractorInput, PositionHolder positionHolder);

    void release();

    void seek(long j, long j2);
}
