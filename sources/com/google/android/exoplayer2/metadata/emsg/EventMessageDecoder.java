package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public final Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(byteBuffer.array(), byteBuffer.limit());
        String strP = parsableByteArray.p();
        strP.getClass();
        String strP2 = parsableByteArray.p();
        strP2.getClass();
        return new Metadata(new EventMessage(strP, strP2, parsableByteArray.o(), parsableByteArray.o(), Arrays.copyOfRange(parsableByteArray.f18956a, parsableByteArray.f18957b, parsableByteArray.f18958c)));
    }
}
