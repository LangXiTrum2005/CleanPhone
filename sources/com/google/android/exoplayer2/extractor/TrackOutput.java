package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface TrackOutput {

    public static final class CryptoData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f17563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17564c;
        public final int d;

        public CryptoData(int i2, byte[] bArr, int i3, int i4) {
            this.f17562a = i2;
            this.f17563b = bArr;
            this.f17564c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CryptoData.class == obj.getClass()) {
                CryptoData cryptoData = (CryptoData) obj;
                if (this.f17562a == cryptoData.f17562a && this.f17564c == cryptoData.f17564c && this.d == cryptoData.d && Arrays.equals(this.f17563b, cryptoData.f17563b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f17563b) + (this.f17562a * 31)) * 31) + this.f17564c) * 31) + this.d;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    int a(DataReader dataReader, int i2, boolean z2);

    void b(int i2, ParsableByteArray parsableByteArray);

    void c(Format format);

    default int d(DataReader dataReader, int i2, boolean z2) {
        return a(dataReader, i2, z2);
    }

    default void e(int i2, ParsableByteArray parsableByteArray) {
        b(i2, parsableByteArray);
    }

    void f(long j, int i2, int i3, int i4, CryptoData cryptoData);
}
