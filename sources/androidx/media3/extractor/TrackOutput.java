package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface TrackOutput {

    public static final class CryptoData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f6806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6807c;
        public final int d;

        public CryptoData(int i2, byte[] bArr, int i3, int i4) {
            this.f6805a = i2;
            this.f6806b = bArr;
            this.f6807c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CryptoData.class == obj.getClass()) {
                CryptoData cryptoData = (CryptoData) obj;
                if (this.f6805a == cryptoData.f6805a && this.f6807c == cryptoData.f6807c && this.d == cryptoData.d && Arrays.equals(this.f6806b, cryptoData.f6806b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f6806b) + (this.f6805a * 31)) * 31) + this.f6807c) * 31) + this.d;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    void a(ParsableByteArray parsableByteArray, int i2, int i3);

    void b(Format format);

    default int c(DataReader dataReader, int i2, boolean z2) {
        return d(dataReader, i2, z2);
    }

    int d(DataReader dataReader, int i2, boolean z2);

    default void e(int i2, ParsableByteArray parsableByteArray) {
        a(parsableByteArray, i2, 0);
    }

    void f(long j, int i2, int i3, int i4, CryptoData cryptoData);
}
