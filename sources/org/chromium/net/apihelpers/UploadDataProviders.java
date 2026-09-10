package org.chromium.net.apihelpers;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes5.dex */
public final class UploadDataProviders {

    public static final class ByteBufferUploadProvider extends UploadDataProvider {
        private final ByteBuffer mUploadBuffer;

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.mUploadBuffer.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.mUploadBuffer.remaining()) {
                byteBuffer.put(this.mUploadBuffer);
            } else {
                int iLimit = this.mUploadBuffer.limit();
                ByteBuffer byteBuffer2 = this.mUploadBuffer;
                byteBuffer.put(this.mUploadBuffer);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindSucceeded();
        }

        private ByteBufferUploadProvider(ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }
    }

    public interface FileChannelProvider {
        FileChannel getChannel() throws IOException;
    }

    public static final class FileUploadProvider extends UploadDataProvider {
        private volatile FileChannel mChannel;
        private final Object mLock;
        private final FileChannelProvider mProvider;

        private FileChannel getChannel() throws IOException {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    try {
                        if (this.mChannel == null) {
                            this.mChannel = this.mProvider.getChannel();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.mChannel;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return getChannel().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel channel = getChannel();
            int i = 0;
            while (i == 0) {
                int i2 = channel.read(byteBuffer);
                if (i2 == -1) {
                    break;
                } else {
                    i += i2;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            getChannel().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private FileUploadProvider(FileChannelProvider fileChannelProvider) {
            this.mLock = new Object();
            this.mProvider = fileChannelProvider;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(final File file) {
        return new FileUploadProvider(new FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.1
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() throws IOException {
                return new FileInputStream(file).getChannel();
            }
        });
    }

    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new FileUploadProvider(new FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.2
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() throws IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
            }
        });
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ByteBufferUploadProvider(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new ByteBufferUploadProvider(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
