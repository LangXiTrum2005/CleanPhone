package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultExtractorsFactory f18316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Extractor f18317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DefaultExtractorInput f18318c;

    public BundledExtractorsAdapter(DefaultExtractorsFactory defaultExtractorsFactory) {
        this.f18316a = defaultExtractorsFactory;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void a() {
        Extractor extractor = this.f18317b;
        if (extractor instanceof Mp3Extractor) {
            ((Mp3Extractor) extractor).f17742p = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final long b() {
        DefaultExtractorInput defaultExtractorInput = this.f18318c;
        if (defaultExtractorInput != null) {
            return defaultExtractorInput.d;
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final int c(PositionHolder positionHolder) {
        Extractor extractor = this.f18317b;
        extractor.getClass();
        DefaultExtractorInput defaultExtractorInput = this.f18318c;
        defaultExtractorInput.getClass();
        return extractor.c(defaultExtractorInput, positionHolder);
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0206 A[Catch: all -> 0x0222, TRY_ENTER, TryCatch #1 {all -> 0x0222, blocks: (B:7:0x0024, B:9:0x0037, B:12:0x003e, B:161:0x0206, B:162:0x0209, B:165:0x0211, B:168:0x0217, B:171:0x021d, B:172:0x0220, B:175:0x0225, B:16:0x004a), top: B:228:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0217 A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:7:0x0024, B:9:0x0037, B:12:0x003e, B:161:0x0206, B:162:0x0209, B:165:0x0211, B:168:0x0217, B:171:0x021d, B:172:0x0220, B:175:0x0225, B:16:0x004a), top: B:228:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0289  */
    /* JADX WARN: Code duplicated, block: B:218:0x029d  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:240:0x02b3 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void d(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput) throws UnrecognizedInputFormatException {
        int iA;
        int i2;
        Extractor[] extractorArr;
        StringBuilder sb;
        int i3;
        boolean z2;
        int i4;
        int i5 = 6;
        byte b2 = 2;
        boolean z3 = true;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, j, j2);
        this.f18318c = defaultExtractorInput;
        if (this.f18317b != null) {
            return;
        }
        DefaultExtractorsFactory defaultExtractorsFactory = this.f18316a;
        synchronized (defaultExtractorsFactory) {
            try {
                int[] iArr = DefaultExtractorsFactory.f17529Y;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (str != null) {
                    ArrayList arrayList2 = MimeTypes.f18924a;
                    switch (str) {
                        case "audio/x-flac":
                            str = "audio/flac";
                            break;
                        case "audio/x-wav":
                            str = "audio/wav";
                            break;
                        case "audio/mp3":
                            str = "audio/mpeg";
                            break;
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            b2 = str.equals("audio/eac3-joc") ? (byte) 0 : (byte) -1;
                            break;
                        case -1662384011:
                            b2 = str.equals("video/mp2p") ? (byte) 1 : (byte) -1;
                            break;
                        case -1662384007:
                            if (!str.equals("video/mp2t")) {
                                b2 = -1;
                            }
                            break;
                        case -1662095187:
                            b2 = str.equals("video/webm") ? (byte) 3 : (byte) -1;
                            break;
                        case -1606874997:
                            b2 = str.equals("audio/amr-wb") ? (byte) 4 : (byte) -1;
                            break;
                        case -1487394660:
                            b2 = str.equals("image/jpeg") ? (byte) 5 : (byte) -1;
                            break;
                        case -1248337486:
                            b2 = str.equals("application/mp4") ? (byte) 6 : (byte) -1;
                            break;
                        case -1079884372:
                            b2 = str.equals("video/x-msvideo") ? (byte) 7 : (byte) -1;
                            break;
                        case -1004728940:
                            b2 = str.equals("text/vtt") ? (byte) 8 : (byte) -1;
                            break;
                        case -387023398:
                            b2 = str.equals("audio/x-matroska") ? (byte) 9 : (byte) -1;
                            break;
                        case -43467528:
                            b2 = str.equals("application/webm") ? (byte) 10 : (byte) -1;
                            break;
                        case 13915911:
                            b2 = str.equals("video/x-flv") ? (byte) 11 : (byte) -1;
                            break;
                        case 187078296:
                            b2 = str.equals("audio/ac3") ? (byte) 12 : (byte) -1;
                            break;
                        case 187078297:
                            b2 = str.equals("audio/ac4") ? (byte) 13 : (byte) -1;
                            break;
                        case 187078669:
                            b2 = str.equals("audio/amr") ? (byte) 14 : (byte) -1;
                            break;
                        case 187090232:
                            b2 = str.equals("audio/mp4") ? (byte) 15 : (byte) -1;
                            break;
                        case 187091926:
                            b2 = str.equals("audio/ogg") ? (byte) 16 : (byte) -1;
                            break;
                        case 187099443:
                            b2 = str.equals("audio/wav") ? (byte) 17 : (byte) -1;
                            break;
                        case 1331848029:
                            b2 = str.equals("video/mp4") ? (byte) 18 : (byte) -1;
                            break;
                        case 1503095341:
                            b2 = str.equals("audio/3gpp") ? (byte) 19 : (byte) -1;
                            break;
                        case 1504578661:
                            b2 = str.equals("audio/eac3") ? (byte) 20 : (byte) -1;
                            break;
                        case 1504619009:
                            b2 = str.equals("audio/flac") ? (byte) 21 : (byte) -1;
                            break;
                        case 1504824762:
                            b2 = str.equals("audio/midi") ? (byte) 22 : (byte) -1;
                            break;
                        case 1504831518:
                            b2 = str.equals("audio/mpeg") ? (byte) 23 : (byte) -1;
                            break;
                        case 1505118770:
                            b2 = str.equals("audio/webm") ? (byte) 24 : (byte) -1;
                            break;
                        case 2039520277:
                            b2 = str.equals("video/x-matroska") ? (byte) 25 : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                        case 12:
                        case 20:
                            i5 = 0;
                            break;
                        case 1:
                            i5 = 10;
                            break;
                        case 2:
                            i5 = 11;
                            break;
                        case 4:
                        case 14:
                        case 19:
                            i5 = 3;
                            break;
                        case 5:
                            i5 = 14;
                            break;
                        case 6:
                        case 15:
                        case 18:
                            i5 = 8;
                            break;
                        case 7:
                            i5 = 16;
                            break;
                        case 8:
                            i5 = 13;
                            break;
                        case 11:
                            i5 = 5;
                            break;
                        case 13:
                            i5 = 1;
                            break;
                        case 16:
                            i5 = 9;
                            break;
                        case 17:
                            i5 = 12;
                            break;
                        case 21:
                            i5 = 4;
                            break;
                        case 22:
                            i5 = 15;
                            break;
                        case 23:
                            i5 = 7;
                            break;
                    }
                    if (i5 != -1) {
                        defaultExtractorsFactory.a(i5, arrayList);
                    }
                    iA = FileTypes.a(uri);
                    if (iA != -1 && iA != i5) {
                        defaultExtractorsFactory.a(iA, arrayList);
                    }
                    for (i2 = 0; i2 < 16; i2++) {
                        i4 = iArr[i2];
                        if (i4 == i5 && i4 != iA) {
                            defaultExtractorsFactory.a(i4, arrayList);
                        }
                    }
                    extractorArr = (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
                }
                i5 = -1;
                if (i5 != -1) {
                    defaultExtractorsFactory.a(i5, arrayList);
                }
                iA = FileTypes.a(uri);
                if (iA != -1) {
                    defaultExtractorsFactory.a(iA, arrayList);
                }
                while (i2 < 16) {
                    i4 = iArr[i2];
                    if (i4 == i5) {
                    }
                }
                extractorArr = (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (extractorArr.length == 1) {
            this.f18317b = extractorArr[0];
        } else {
            for (Extractor extractor : extractorArr) {
                try {
                    if (extractor.b(defaultExtractorInput)) {
                        this.f18317b = extractor;
                        defaultExtractorInput.f = 0;
                        if (this.f18317b == null) {
                            StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                            int i6 = Util.f18979a;
                            sb = new StringBuilder();
                            for (i3 = 0; i3 < extractorArr.length; i3++) {
                                sb.append(extractorArr[i3].getClass().getSimpleName());
                                if (i3 < extractorArr.length - 1) {
                                    sb.append(", ");
                                }
                            }
                            sb2.append(sb.toString());
                            sb2.append(") could read the stream.");
                            throw new UnrecognizedInputFormatException(sb2.toString(), null, false, 1);
                        }
                    } else {
                        z2 = this.f18317b != null || defaultExtractorInput.d == j;
                    }
                } catch (EOFException unused) {
                    z2 = this.f18317b != null || defaultExtractorInput.d == j;
                } catch (Throwable th2) {
                    if (this.f18317b == null && defaultExtractorInput.d != j) {
                        z3 = false;
                    }
                    Assertions.d(z3);
                    defaultExtractorInput.f = 0;
                    throw th2;
                }
                Assertions.d(z2);
                defaultExtractorInput.f = 0;
            }
            if (this.f18317b == null) {
                StringBuilder sb3 = new StringBuilder("None of the available extractors (");
                int i7 = Util.f18979a;
                sb = new StringBuilder();
                while (i3 < extractorArr.length) {
                    sb.append(extractorArr[i3].getClass().getSimpleName());
                    if (i3 < extractorArr.length - 1) {
                        sb.append(", ");
                    }
                }
                sb3.append(sb.toString());
                sb3.append(") could read the stream.");
                throw new UnrecognizedInputFormatException(sb3.toString(), null, false, 1);
            }
        }
        this.f18317b.d(extractorOutput);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void release() {
        Extractor extractor = this.f18317b;
        if (extractor != null) {
            extractor.release();
            this.f18317b = null;
        }
        this.f18318c = null;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void seek(long j, long j2) {
        Extractor extractor = this.f18317b;
        extractor.getClass();
        extractor.seek(j, j2);
    }
}
