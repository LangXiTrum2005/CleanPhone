package androidx.media3.extractor.jpeg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class JpegMotionPhotoExtractor implements Extractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExtractorOutput f6898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6899c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6900e;
    public MotionPhotoMetadata g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DefaultExtractorInput f6901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StartOffsetExtractorInput f6902i;
    public Mp4Extractor j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f6897a = new ParsableByteArray(6);
    public long f = -1;

    public final void a() {
        ExtractorOutput extractorOutput = this.f6898b;
        extractorOutput.getClass();
        extractorOutput.endTracks();
        this.f6898b.e(new SeekMap.Unseekable(-9223372036854775807L));
        this.f6899c = 6;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        ParsableByteArray parsableByteArray = this.f6897a;
        parsableByteArray.D(2);
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 2, false);
        if (parsableByteArray.A() == 65496) {
            parsableByteArray.D(2);
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 2, false);
            int iA = parsableByteArray.A();
            this.d = iA;
            if (iA == 65504) {
                parsableByteArray.D(2);
                defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 2, false);
                defaultExtractorInput.c(parsableByteArray.A() - 2, false);
                parsableByteArray.D(2);
                defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 2, false);
                this.d = parsableByteArray.A();
            }
            if (this.d == 65505) {
                defaultExtractorInput.c(2, false);
                parsableByteArray.D(6);
                defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 6, false);
                if (parsableByteArray.w() == 1165519206 && parsableByteArray.A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f6898b = extractorOutput;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        String strP;
        MotionPhotoDescription motionPhotoDescriptionA;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        byte b2 = -1;
        int i2 = this.f6899c;
        long j2 = -1;
        ParsableByteArray parsableByteArray = this.f6897a;
        if (i2 == 0) {
            parsableByteArray.D(2);
            ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f5667a, 0, 2, false);
            int iA = parsableByteArray.A();
            this.d = iA;
            if (iA == 65498) {
                if (this.f != -1) {
                    this.f6899c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iA < 65488 || iA > 65497) && iA != 65281) {
                this.f6899c = 1;
            }
        } else {
            if (i2 == 1) {
                parsableByteArray.D(2);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f5667a, 0, 2, false);
                this.f6900e = parsableByteArray.A() - 2;
                this.f6899c = 2;
                return 0;
            }
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 == 6) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f6902i == null || extractorInput != this.f6901h) {
                        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                        this.f6901h = defaultExtractorInput;
                        this.f6902i = new StartOffsetExtractorInput(defaultExtractorInput, this.f);
                    }
                    Mp4Extractor mp4Extractor = this.j;
                    mp4Extractor.getClass();
                    int iF = mp4Extractor.f(this.f6902i, positionHolder);
                    if (iF == 1) {
                        positionHolder.f6793a += this.f;
                    }
                    return iF;
                }
                long j3 = ((DefaultExtractorInput) extractorInput).d;
                long j4 = this.f;
                if (j3 != j4) {
                    positionHolder.f6793a = j4;
                    return 1;
                }
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                if (!defaultExtractorInput2.peekFully(parsableByteArray.f5667a, 0, 1, true)) {
                    a();
                    return 0;
                }
                defaultExtractorInput2.f = 0;
                if (this.j == null) {
                    this.j = new Mp4Extractor(SubtitleParser.Factory.f7215a, 8);
                }
                StartOffsetExtractorInput startOffsetExtractorInput = new StartOffsetExtractorInput(defaultExtractorInput2, this.f);
                this.f6902i = startOffsetExtractorInput;
                if (!this.j.c(startOffsetExtractorInput)) {
                    a();
                    return 0;
                }
                Mp4Extractor mp4Extractor2 = this.j;
                long j5 = this.f;
                ExtractorOutput extractorOutput = this.f6898b;
                extractorOutput.getClass();
                mp4Extractor2.d(new StartOffsetExtractorOutput(j5, extractorOutput));
                MotionPhotoMetadata motionPhotoMetadata2 = this.g;
                motionPhotoMetadata2.getClass();
                ExtractorOutput extractorOutput2 = this.f6898b;
                extractorOutput2.getClass();
                TrackOutput trackOutputTrack = extractorOutput2.track(1024, 4);
                Format.Builder builder = new Format.Builder();
                builder.k = MimeTypes.l("image/jpeg");
                builder.j = new Metadata(motionPhotoMetadata2);
                trackOutputTrack.b(new Format(builder));
                this.f6899c = 5;
                return 0;
            }
            if (this.d == 65505) {
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.f6900e);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f5667a, 0, this.f6900e, false);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(parsableByteArray2.p()) && (strP = parsableByteArray2.p()) != null) {
                    long j6 = ((DefaultExtractorInput) extractorInput).f6741c;
                    if (j6 == -1) {
                        motionPhotoMetadata = null;
                    } else {
                        try {
                            motionPhotoDescriptionA = XmpMotionPhotoDescriptionParser.a(strP);
                        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                            Log.g("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                            motionPhotoDescriptionA = null;
                        }
                        if (motionPhotoDescriptionA == null) {
                            motionPhotoMetadata = null;
                        } else {
                            List list = motionPhotoDescriptionA.f6904b;
                            if (list.size() < 2) {
                                motionPhotoMetadata = null;
                            } else {
                                int size = list.size() - 1;
                                boolean z2 = false;
                                long j7 = -1;
                                long j8 = -1;
                                long j9 = -1;
                                long j10 = -1;
                                while (size >= 0) {
                                    MotionPhotoDescription.ContainerItem containerItem = (MotionPhotoDescription.ContainerItem) list.get(size);
                                    byte b3 = b2;
                                    boolean zEquals = "video/mp4".equals(containerItem.f6905a) | z2;
                                    if (size == 0) {
                                        j6 -= containerItem.f6907c;
                                        j = 0;
                                    } else {
                                        j = j6 - containerItem.f6906b;
                                    }
                                    long j11 = j6;
                                    j6 = j;
                                    if (!zEquals || j6 == j11) {
                                        z2 = zEquals;
                                    } else {
                                        j10 = j11 - j6;
                                        z2 = false;
                                        j9 = j6;
                                    }
                                    if (size == 0) {
                                        j8 = j11;
                                        j7 = j6;
                                    }
                                    size--;
                                    b2 = b3;
                                    j2 = j2;
                                }
                                long j12 = j2;
                                if (j9 == j12 || j10 == j12 || j7 == j12 || j8 == j12) {
                                    motionPhotoMetadata = null;
                                } else {
                                    motionPhotoMetadata = new MotionPhotoMetadata(j7, j8, motionPhotoDescriptionA.f6903a, j9, j10);
                                }
                            }
                        }
                    }
                    this.g = motionPhotoMetadata;
                    if (motionPhotoMetadata != null) {
                        this.f = motionPhotoMetadata.e0;
                    }
                }
            } else {
                ((DefaultExtractorInput) extractorInput).skipFully(this.f6900e);
            }
            this.f6899c = 0;
        }
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.j;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.f6899c = 0;
            this.j = null;
        } else if (this.f6899c == 5) {
            Mp4Extractor mp4Extractor = this.j;
            mp4Extractor.getClass();
            mp4Extractor.seek(j, j2);
        }
    }
}
