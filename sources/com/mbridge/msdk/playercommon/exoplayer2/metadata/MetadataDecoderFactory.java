package com.mbridge.msdk.playercommon.exoplayer2.metadata;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceInfoDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new MetadataDecoderFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoderFactory.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoderFactory
        public MetadataDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            str.getClass();
            switch (str) {
                case "application/id3":
                    return new Id3Decoder();
                case "application/x-emsg":
                    return new EventMessageDecoder();
                case "application/x-scte35":
                    return new SpliceInfoDecoder();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str);
        }
    };

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
