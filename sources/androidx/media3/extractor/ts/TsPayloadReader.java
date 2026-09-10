package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.ExtractorOutput;
import com.p004ironsource.mediationsdk.metadata.a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface TsPayloadReader {

    public static final class DvbSubtitleInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f7646b;

        public DvbSubtitleInfo(String str, byte[] bArr) {
            this.f7645a = str;
            this.f7646b = bArr;
        }
    }

    public static final class EsInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f7649c;
        public final byte[] d;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioType {
        }

        public EsInfo(int i2, String str, int i3, ArrayList arrayList, byte[] bArr) {
            this.f7647a = str;
            this.f7648b = i3;
            this.f7649c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.d = bArr;
        }

        public final int a() {
            int i2 = this.f7648b;
            if (i2 != 2) {
                return i2 != 3 ? 0 : 512;
            }
            return a.f25965n;
        }
    }

    public interface Factory {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class TrackIdGenerator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7652c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f7653e;

        public TrackIdGenerator(int i2, int i3) {
            this(Integer.MIN_VALUE, i2, i3);
        }

        public final void a() {
            int i2 = this.d;
            this.d = i2 == Integer.MIN_VALUE ? this.f7651b : i2 + this.f7652c;
            this.f7653e = this.f7650a + this.d;
        }

        public final void b() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public TrackIdGenerator(int i2, int i3, int i4) {
            this.f7650a = i2 != Integer.MIN_VALUE ? androidx.datastore.preferences.protobuf.a.f(i2, "/") : "";
            this.f7651b = i3;
            this.f7652c = i4;
            this.d = Integer.MIN_VALUE;
            this.f7653e = "";
        }
    }

    void a(int i2, ParsableByteArray parsableByteArray);

    void b(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);

    void seek();
}
