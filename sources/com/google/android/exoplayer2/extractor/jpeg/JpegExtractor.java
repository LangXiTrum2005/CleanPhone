package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class JpegExtractor implements Extractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExtractorOutput f17648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17649c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17650e;
    public MotionPhotoMetadata g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DefaultExtractorInput f17651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StartOffsetExtractorInput f17652i;
    public Mp4Extractor j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17647a = new ParsableByteArray(6);
    public long f = -1;

    public final void a() {
        e(new Metadata.Entry[0]);
        ExtractorOutput extractorOutput = this.f17648b;
        extractorOutput.getClass();
        extractorOutput.endTracks();
        this.f17648b.g(new SeekMap.Unseekable(-9223372036854775807L));
        this.f17649c = 6;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        ParsableByteArray parsableByteArray = this.f17647a;
        parsableByteArray.C(2);
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 2, false);
        if (parsableByteArray.z() == 65496) {
            parsableByteArray.C(2);
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 2, false);
            int iZ = parsableByteArray.z();
            this.d = iZ;
            if (iZ == 65504) {
                parsableByteArray.C(2);
                defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 2, false);
                defaultExtractorInput.c(parsableByteArray.z() - 2, false);
                parsableByteArray.C(2);
                defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 2, false);
                this.d = parsableByteArray.z();
            }
            if (this.d == 65505) {
                defaultExtractorInput.c(2, false);
                parsableByteArray.C(6);
                defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 6, false);
                if (parsableByteArray.v() == 1165519206 && parsableByteArray.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        String strP;
        MotionPhotoDescription motionPhotoDescriptionA;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        byte b2 = -1;
        int i2 = this.f17649c;
        long j2 = -1;
        ParsableByteArray parsableByteArray = this.f17647a;
        if (i2 == 0) {
            parsableByteArray.C(2);
            ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 0, 2, false);
            int iZ = parsableByteArray.z();
            this.d = iZ;
            if (iZ == 65498) {
                if (this.f != -1) {
                    this.f17649c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iZ < 65488 || iZ > 65497) && iZ != 65281) {
                this.f17649c = 1;
            }
        } else {
            if (i2 == 1) {
                parsableByteArray.C(2);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 0, 2, false);
                this.f17650e = parsableByteArray.z() - 2;
                this.f17649c = 2;
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
                    if (this.f17652i == null || extractorInput != this.f17651h) {
                        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                        this.f17651h = defaultExtractorInput;
                        this.f17652i = new StartOffsetExtractorInput(defaultExtractorInput, this.f);
                    }
                    Mp4Extractor mp4Extractor = this.j;
                    mp4Extractor.getClass();
                    int iC = mp4Extractor.c(this.f17652i, positionHolder);
                    if (iC == 1) {
                        positionHolder.f17554a += this.f;
                    }
                    return iC;
                }
                long j3 = ((DefaultExtractorInput) extractorInput).d;
                long j4 = this.f;
                if (j3 != j4) {
                    positionHolder.f17554a = j4;
                    return 1;
                }
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                if (!defaultExtractorInput2.peekFully(parsableByteArray.f18956a, 0, 1, true)) {
                    a();
                    return 0;
                }
                defaultExtractorInput2.f = 0;
                if (this.j == null) {
                    this.j = new Mp4Extractor();
                }
                StartOffsetExtractorInput startOffsetExtractorInput = new StartOffsetExtractorInput(defaultExtractorInput2, this.f);
                this.f17652i = startOffsetExtractorInput;
                if (!this.j.b(startOffsetExtractorInput)) {
                    a();
                    return 0;
                }
                Mp4Extractor mp4Extractor2 = this.j;
                long j5 = this.f;
                ExtractorOutput extractorOutput = this.f17648b;
                extractorOutput.getClass();
                mp4Extractor2.q = new StartOffsetExtractorOutput(j5, extractorOutput);
                MotionPhotoMetadata motionPhotoMetadata2 = this.g;
                motionPhotoMetadata2.getClass();
                e(motionPhotoMetadata2);
                this.f17649c = 5;
                return 0;
            }
            if (this.d == 65505) {
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.f17650e);
                ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f18956a, 0, this.f17650e, false);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(parsableByteArray2.p()) && (strP = parsableByteArray2.p()) != null) {
                    long j6 = ((DefaultExtractorInput) extractorInput).f17527c;
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
                            List list = motionPhotoDescriptionA.f17654b;
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
                                    boolean zEquals = "video/mp4".equals(containerItem.f17655a) | z2;
                                    if (size == 0) {
                                        j6 -= containerItem.f17657c;
                                        j = 0;
                                    } else {
                                        j = j6 - containerItem.f17656b;
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
                                    motionPhotoMetadata = new MotionPhotoMetadata(j7, j8, motionPhotoDescriptionA.f17653a, j9, j10);
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
                ((DefaultExtractorInput) extractorInput).skipFully(this.f17650e);
            }
            this.f17649c = 0;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17648b = extractorOutput;
    }

    public final void e(Metadata.Entry... entryArr) {
        ExtractorOutput extractorOutput = this.f17648b;
        extractorOutput.getClass();
        TrackOutput trackOutputTrack = extractorOutput.track(1024, 4);
        Format.Builder builder = new Format.Builder();
        builder.j = "image/jpeg";
        builder.f17086i = new Metadata(entryArr);
        trackOutputTrack.c(new Format(builder));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.j;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.f17649c = 0;
            this.j = null;
        } else if (this.f17649c == 5) {
            Mp4Extractor mp4Extractor = this.j;
            mp4Extractor.getClass();
            mp4Extractor.seek(j, j2);
        }
    }
}
