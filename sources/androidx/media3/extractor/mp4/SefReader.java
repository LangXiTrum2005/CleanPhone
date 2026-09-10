package androidx.media3.extractor.mp4;

import com.google.common.base.Splitter;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
final class SefReader {
    public static final Splitter d = Splitter.a(AbstractJsonLexerKt.COLON);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Splitter f7132e = Splitter.a('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7133a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7134b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7135c;

    public static final class DataReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7137b;

        public DataReference(long j, int i2) {
            this.f7136a = j;
            this.f7137b = i2;
        }
    }
}
