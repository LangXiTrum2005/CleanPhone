package com.google.android.exoplayer2.extractor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public interface Extractor {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    boolean b(ExtractorInput extractorInput);

    int c(ExtractorInput extractorInput, PositionHolder positionHolder);

    void d(ExtractorOutput extractorOutput);

    void release();

    void seek(long j, long j2);
}
