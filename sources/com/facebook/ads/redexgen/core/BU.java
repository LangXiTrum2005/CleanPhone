package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BU extends V4 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final EventMessage A00(C1576fq c1576fq) {
        return new EventMessage((String) AbstractC1517es.A01(c1576fq.A0U()), (String) AbstractC1517es.A01(c1576fq.A0U()), c1576fq.A0P(), c1576fq.A0P(), Arrays.copyOfRange(c1576fq.A0l(), c1576fq.A09(), c1576fq.A0A()));
    }

    @Override // com.facebook.ads.redexgen.core.V4
    public final Metadata A0R(Bi bi, ByteBuffer byteBuffer) {
        return new Metadata(A00(new C1576fq(byteBuffer.array(), byteBuffer.limit())));
    }
}
