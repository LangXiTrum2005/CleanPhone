package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;
import na.g;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new d(new k0(file, 1));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new d(new g(parcelFileDescriptor, 4));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new b(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new b(ByteBuffer.wrap(bArr, i10, i11).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
