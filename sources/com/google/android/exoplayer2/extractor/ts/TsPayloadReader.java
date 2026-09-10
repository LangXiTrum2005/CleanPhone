package com.google.android.exoplayer2.extractor.ts;

import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface TsPayloadReader {

    public static final class DvbSubtitleInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f18093b;

        public DvbSubtitleInfo(String str, byte[] bArr) {
            this.f18092a = str;
            this.f18093b = bArr;
        }
    }

    public static final class EsInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f18095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f18096c;

        public EsInfo(int i2, String str, ArrayList arrayList, byte[] bArr) {
            this.f18094a = str;
            this.f18095b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.f18096c = bArr;
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
        public final String f18097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18099c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f18100e;

        public TrackIdGenerator(int i2, int i3) {
            this(Integer.MIN_VALUE, i2, i3);
        }

        public final void a() {
            int i2 = this.d;
            this.d = i2 == Integer.MIN_VALUE ? this.f18098b : i2 + this.f18099c;
            this.f18100e = this.f18097a + this.d;
        }

        public final void b() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public TrackIdGenerator(int i2, int i3, int i4) {
            this.f18097a = i2 != Integer.MIN_VALUE ? a.f(i2, "/") : "";
            this.f18098b = i3;
            this.f18099c = i4;
            this.d = Integer.MIN_VALUE;
            this.f18100e = "";
        }
    }

    void a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);

    void b(int i2, ParsableByteArray parsableByteArray);

    void seek();
}
