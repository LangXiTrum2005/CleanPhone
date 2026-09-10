package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractMessageLite implements MessageLite {

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        @Override // 
        public abstract Builder c();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public abstract Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public static final class LimitedInputStream extends FilterInputStream {
            public int X;

            public LimitedInputStream(ByteArrayInputStream byteArrayInputStream, int i2) {
                super(byteArrayInputStream);
                this.X = i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.X);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.X <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 >= 0) {
                    this.X--;
                }
                return i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.X));
                if (jSkip >= 0) {
                    this.X = (int) (((long) this.X) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) throws IOException {
                int i4 = this.X;
                if (i4 <= 0) {
                    return -1;
                }
                int i5 = super.read(bArr, i2, Math.min(i3, i4));
                if (i5 >= 0) {
                    this.X -= i5;
                }
                return i5;
            }
        }
    }
}
