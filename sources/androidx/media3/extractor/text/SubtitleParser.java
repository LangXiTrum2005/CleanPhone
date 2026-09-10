package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public interface SubtitleParser {

    public interface Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Factory f7215a = new AnonymousClass1();

        /* JADX INFO: renamed from: androidx.media3.extractor.text.SubtitleParser$Factory$1, reason: invalid class name */
        public class AnonymousClass1 implements Factory {
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public final boolean a(Format format) {
                return false;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public final int b(Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public final SubtitleParser c(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(Format format);

        int b(Format format);

        SubtitleParser c(Format format);
    }

    public static class OutputOptions {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OutputOptions f7216c = new OutputOptions(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7218b;

        public OutputOptions(long j, boolean z2) {
            this.f7217a = j;
            this.f7218b = z2;
        }
    }

    void a(byte[] bArr, int i2, int i3, OutputOptions outputOptions, Consumer consumer);

    default Subtitle b(int i2, int i3, byte[] bArr) {
        ImmutableList.Builder builderS = ImmutableList.s();
        a(bArr, 0, i3, OutputOptions.f7216c, new b(builderS, 1));
        return new CuesWithTimingSubtitle(builderS.j());
    }

    int c();

    default void reset() {
    }
}
