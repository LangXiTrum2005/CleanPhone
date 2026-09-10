package com.google.android.exoplayer2.metadata;

import android.support.v4.media.a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.icy.IcyDecoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder;

/* JADX INFO: loaded from: classes3.dex */
public interface MetadataDecoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MetadataDecoderFactory f18198a = new AnonymousClass1();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.MetadataDecoderFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MetadataDecoderFactory {
        public final SimpleMetadataDecoder a(Format format) {
            String str = format.m0;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new AppInfoTableDecoder();
                    case "application/x-icy":
                        return new IcyDecoder();
                    case "application/id3":
                        return new Id3Decoder(null);
                    case "application/x-emsg":
                        return new EventMessageDecoder();
                    case "application/x-scte35":
                        return new SpliceInfoDecoder();
                }
            }
            throw new IllegalArgumentException(a.C("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(Format format) {
            String str = format.m0;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
