package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.core.view.g;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    public static final Pair g = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f6487h = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExtractorOutput f6488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaParser.SeekMap f6489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6490c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6491e;
    public boolean f;

    public static final class DataReaderAdapter implements DataReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaParser$InputReader f6492a;

        @Override // androidx.media3.common.DataReader
        public final int read(byte[] bArr, int i2, int i3) {
            MediaParser$InputReader mediaParser$InputReader = this.f6492a;
            int i4 = Util.f5683a;
            return b.j(mediaParser$InputReader).read(bArr, i2, i3);
        }
    }

    public static final class SeekMapAdapter implements SeekMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaParser.SeekMap f6493a;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.f6493a = seekMap;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            long durationMicros = this.f6493a.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            Pair seekPoints = this.f6493a.getSeekPoints(j);
            Object obj = seekPoints.first;
            if (obj == seekPoints.second) {
                MediaParser.SeekPoint seekPointL = g.l(obj);
                SeekPoint seekPoint = new SeekPoint(seekPointL.timeMicros, seekPointL.position);
                return new SeekMap.SeekPoints(seekPoint, seekPoint);
            }
            MediaParser.SeekPoint seekPointL2 = g.l(obj);
            SeekPoint seekPoint2 = new SeekPoint(seekPointL2.timeMicros, seekPointL2.position);
            MediaParser.SeekPoint seekPointL3 = g.l(seekPoints.second);
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPointL3.timeMicros, seekPointL3.position));
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            return this.f6493a.isSeekable();
        }
    }

    public final void a(int i2) {
        throw null;
    }

    public final void b(String str) {
        String str2;
        str.getClass();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                str2 = "video/mp4";
                break;
            case "android.media.mediaparser.OggParser":
                str2 = "audio/ogg";
                break;
            case "android.media.mediaparser.TsParser":
                str2 = "video/mp2t";
                break;
            case "android.media.mediaparser.AdtsParser":
                str2 = "audio/mp4a-latm";
                break;
            case "android.media.mediaparser.WavParser":
                str2 = "audio/raw";
                break;
            case "android.media.mediaparser.PsParser":
                str2 = "video/mp2p";
                break;
            case "android.media.mediaparser.Ac3Parser":
                str2 = "audio/ac3";
                break;
            case "android.media.mediaparser.AmrParser":
                str2 = "audio/amr";
                break;
            case "android.media.mediaparser.FlacParser":
                str2 = "audio/flac";
                break;
            case "android.media.mediaparser.MatroskaParser":
                str2 = "video/webm";
                break;
            case "android.media.mediaparser.Ac4Parser":
                str2 = "audio/ac4";
                break;
            case "android.media.mediaparser.Mp3Parser":
                str2 = "audio/mpeg";
                break;
            case "android.media.mediaparser.FlvParser":
                str2 = "video/x-flv";
                break;
            default:
                throw new IllegalArgumentException("Illegal parser name: ".concat(str));
        }
        this.f6490c = str2;
    }

    public final void onSampleCompleted(int i2, long j, int i3, int i4, int i5, MediaCodec.CryptoInfo cryptoInfo) {
        if (0 == -9223372036854775807L || j < 0) {
            throw null;
        }
    }

    public final void onSampleDataFound(int i2, MediaParser$InputReader mediaParser$InputReader) {
        a(i2);
        throw null;
    }

    public final void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMapAdapter;
        this.f6489b = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.f6488a;
        if (this.f) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            seekMapAdapter = new SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.e(seekMapAdapter);
    }

    public final void onTrackCountFound(int i2) {
        this.d = true;
        if (this.d && !this.f6491e) {
            throw null;
        }
    }

    public final void onTrackDataFound(int i2, MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("chunk-index-int-sizes");
        if (byteBuffer == null) {
            a(i2);
            throw null;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("chunk-index-long-offsets");
        byteBuffer2.getClass();
        LongBuffer longBufferAsLongBuffer = byteBuffer2.asLongBuffer();
        ByteBuffer byteBuffer3 = mediaFormat.getByteBuffer("chunk-index-long-us-durations");
        byteBuffer3.getClass();
        LongBuffer longBufferAsLongBuffer2 = byteBuffer3.asLongBuffer();
        ByteBuffer byteBuffer4 = mediaFormat.getByteBuffer("chunk-index-long-us-times");
        byteBuffer4.getClass();
        LongBuffer longBufferAsLongBuffer3 = byteBuffer4.asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        this.f6488a.e(new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }
}
