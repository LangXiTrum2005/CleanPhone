package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode;

    public interface InternalOneOfEnum {
    }

    public static void a(Set set, List list) {
        Charset charset = Internal.f4857a;
        set.getClass();
        if (!(set instanceof LazyStringList)) {
            if (set instanceof PrimitiveNonBoxingCollection) {
                list.addAll(set);
                return;
            }
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List underlyingElements = ((LazyStringList) set).getUnderlyingElements();
        LazyStringList lazyStringList = (LazyStringList) list;
        int size3 = list.size();
        for (Object obj2 : underlyingElements) {
            if (obj2 == null) {
                String str2 = "Element at index " + (lazyStringList.size() - size3) + " is null.";
                for (int size4 = lazyStringList.size() - 1; size4 >= size3; size4--) {
                    lazyStringList.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof ByteString) {
                lazyStringList.j0((ByteString) obj2);
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                lazyStringList.j0(ByteString.h(0, bArr.length, bArr));
            } else {
                lazyStringList.add((String) obj2);
            }
        }
    }

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e(Schema schema) {
        int iD = d();
        if (iD != -1) {
            return iD;
        }
        int iB = schema.b(this);
        f(iB);
        return iB;
    }

    public void f(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void g(OutputStream outputStream) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int iE = generatedMessageLite.e(null);
        Logger logger = CodedOutputStream.f4775b;
        if (iE > 4096) {
            iE = 4096;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, iE);
        generatedMessageLite.c(outputStreamEncoder);
        if (outputStreamEncoder.f > 0) {
            outputStreamEncoder.P();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final ByteString toByteString() {
        try {
            int iE = ((GeneratedMessageLite) this).e(null);
            ByteString byteString = ByteString.f4747Y;
            ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(iE);
            CodedOutputStream codedOutputStream = codedBuilder.f4749a;
            ((GeneratedMessageLite) this).c(codedOutputStream);
            CodedOutputStream.ArrayEncoder arrayEncoder = (CodedOutputStream.ArrayEncoder) codedOutputStream;
            if (arrayEncoder.f4779e - arrayEncoder.f == 0) {
                return new ByteString.LiteralByteString(codedBuilder.f4750b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Override // 
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.Builder clone();

        public static final class LimitedInputStream extends FilterInputStream {
            public int X;

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
            public final long skip(long j) {
                int iSkip = (int) super.skip(Math.min(j, this.X));
                if (iSkip >= 0) {
                    this.X -= iSkip;
                }
                return iSkip;
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
