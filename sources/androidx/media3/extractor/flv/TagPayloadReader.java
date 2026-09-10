package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackOutput f6890a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(TrackOutput trackOutput) {
        this.f6890a = trackOutput;
    }
}
