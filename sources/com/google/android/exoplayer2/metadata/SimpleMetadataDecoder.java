package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.MetadataDecoder
    public final Metadata a(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.Z;
        byteBuffer.getClass();
        Assertions.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (metadataInputBuffer.b(Integer.MIN_VALUE)) {
            return null;
        }
        return b(metadataInputBuffer, byteBuffer);
    }

    public abstract Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}
