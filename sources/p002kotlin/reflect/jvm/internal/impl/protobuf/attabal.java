package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class attabal implements triweekly {
    protected int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamMerc = CodedOutputStream.merc(outputStream, CodedOutputStream.adultoid(CodedOutputStream.dovishness(serializedSize) + serializedSize));
        codedOutputStreamMerc.sensatory(serializedSize);
        writeTo(codedOutputStreamMerc);
        codedOutputStreamMerc.restrictive();
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0693attabal<BuilderType extends AbstractC0693attabal> implements triweekly.attabal {
        public static UninitializedMessageException dern(triweekly triweeklyVar) {
            return new UninitializedMessageException(triweeklyVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.triweekly.attabal
        /* JADX INFO: renamed from: attabal */
        public abstract BuilderType cutely(marial marialVar, beachfront beachfrontVar) throws IOException;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractMessageLite.java */
        public static final class C0694attabal extends FilterInputStream {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public int f31102kowloon;

            public C0694attabal(InputStream inputStream, int i) {
                super(inputStream);
                this.f31102kowloon = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f31102kowloon);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f31102kowloon <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f31102kowloon--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f31102kowloon));
                if (jSkip >= 0) {
                    this.f31102kowloon = (int) (((long) this.f31102kowloon) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f31102kowloon;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f31102kowloon -= i4;
                }
                return i4;
            }
        }
    }
}
