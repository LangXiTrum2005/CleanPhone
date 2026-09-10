package androidx.media3.extractor;

import I.a;
import android.net.Uri;
import androidx.media3.common.FileTypes;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.avi.AviExtractor;
import androidx.media3.extractor.avif.AvifExtractor;
import androidx.media3.extractor.bmp.BmpExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.heif.HeifExtractor;
import androidx.media3.extractor.jpeg.JpegExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.png.PngExtractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractor;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import androidx.media3.extractor.webp.WebpExtractor;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    public static final int[] f0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final ExtensionLoader g0 = new ExtensionLoader(new a(21));
    public static final ExtensionLoader h0 = new ExtensionLoader(new a(22));
    public ImmutableList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f6743Y;
    public DefaultSubtitleParserFactory Z;
    public int e0;

    public static final class ExtensionLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstructorSupplier f6744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f6745b = new AtomicBoolean(false);

        public interface ConstructorSupplier {
            Constructor a();
        }

        public ExtensionLoader(ConstructorSupplier constructorSupplier) {
            this.f6744a = constructorSupplier;
        }

        public final Extractor a(Object... objArr) {
            Constructor constructorA;
            synchronized (this.f6745b) {
                if (!this.f6745b.get()) {
                    try {
                        constructorA = this.f6744a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f6745b.set(true);
                        constructorA = null;
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating extension", e2);
                    }
                }
                constructorA = null;
            }
            if (constructorA == null) {
                return null;
            }
            try {
                return (Extractor) constructorA.newInstance(objArr);
            } catch (Exception e3) {
                throw new IllegalStateException("Unexpected error creating extractor", e3);
            }
        }
    }

    public final void a(int i2, ArrayList arrayList) {
        switch (i2) {
            case 0:
                arrayList.add(new Ac3Extractor());
                break;
            case 1:
                arrayList.add(new Ac4Extractor());
                break;
            case 2:
                arrayList.add(new AdtsExtractor());
                break;
            case 3:
                arrayList.add(new AmrExtractor());
                break;
            case 4:
                Extractor extractorA = g0.a(0);
                if (extractorA == null) {
                    arrayList.add(new FlacExtractor());
                } else {
                    arrayList.add(extractorA);
                }
                break;
            case 5:
                arrayList.add(new FlvExtractor());
                break;
            case 6:
                arrayList.add(new MatroskaExtractor(this.Z, this.f6743Y ? 0 : 2));
                break;
            case 7:
                arrayList.add(new Mp3Extractor());
                break;
            case 8:
                arrayList.add(new FragmentedMp4Extractor(this.Z, this.f6743Y ? 0 : 32));
                arrayList.add(new Mp4Extractor(this.Z, this.f6743Y ? 0 : 16));
                break;
            case 9:
                arrayList.add(new OggExtractor());
                break;
            case 10:
                arrayList.add(new PsExtractor());
                break;
            case 11:
                if (this.X == null) {
                    this.X = ImmutableList.x();
                }
                arrayList.add(new TsExtractor(!this.f6743Y ? 1 : 0, this.Z, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.X)));
                break;
            case 12:
                arrayList.add(new WavExtractor());
                break;
            case 14:
                arrayList.add(new JpegExtractor(this.e0));
                break;
            case 15:
                Extractor extractorA2 = h0.a(new Object[0]);
                if (extractorA2 != null) {
                    arrayList.add(extractorA2);
                }
                break;
            case 16:
                arrayList.add(new AviExtractor(!this.f6743Y ? 1 : 0, this.Z));
                break;
            case 17:
                arrayList.add(new PngExtractor());
                break;
            case 18:
                arrayList.add(new WebpExtractor());
                break;
            case 19:
                arrayList.add(new BmpExtractor());
                break;
            case 20:
                arrayList.add(new HeifExtractor());
                break;
            case 21:
                arrayList.add(new AvifExtractor());
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0230 A[Catch: all -> 0x024d, TRY_ENTER, TryCatch #0 {all -> 0x024d, blocks: (B:4:0x001f, B:6:0x0032, B:9:0x0039, B:168:0x0230, B:169:0x0233, B:172:0x023b, B:175:0x0241, B:178:0x0247, B:179:0x024a, B:182:0x024f, B:183:0x0255, B:185:0x025b, B:187:0x0265, B:189:0x026d, B:191:0x0275, B:193:0x027d, B:195:0x0285, B:197:0x028d, B:198:0x0295, B:13:0x0045), top: B:204:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0241 A[Catch: all -> 0x024d, TryCatch #0 {all -> 0x024d, blocks: (B:4:0x001f, B:6:0x0032, B:9:0x0039, B:168:0x0230, B:169:0x0233, B:172:0x023b, B:175:0x0241, B:178:0x0247, B:179:0x024a, B:182:0x024f, B:183:0x0255, B:185:0x025b, B:187:0x0265, B:189:0x026d, B:191:0x0275, B:193:0x027d, B:195:0x0285, B:197:0x028d, B:198:0x0295, B:13:0x0045), top: B:204:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:185:0x025b A[Catch: all -> 0x024d, TryCatch #0 {all -> 0x024d, blocks: (B:4:0x001f, B:6:0x0032, B:9:0x0039, B:168:0x0230, B:169:0x0233, B:172:0x023b, B:175:0x0241, B:178:0x0247, B:179:0x024a, B:182:0x024f, B:183:0x0255, B:185:0x025b, B:187:0x0265, B:189:0x026d, B:191:0x0275, B:193:0x027d, B:195:0x0285, B:197:0x028d, B:198:0x0295, B:13:0x0045), top: B:204:0x001f }] */
    /* JADX WARN: switch over string: strings are not added: [[image/jpeg]] */
    @Override // androidx.media3.extractor.ExtractorsFactory
    public final synchronized Extractor[] b(Uri uri, Map map) {
        int iA;
        int i2;
        Extractor[] extractorArr;
        Extractor subtitleTranscodingExtractor;
        int i3;
        int i4 = 14;
        synchronized (this) {
            try {
                int[] iArr = f0;
                ArrayList arrayList = new ArrayList(21);
                List list = (List) map.get("Content-Type");
                String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (str != null) {
                    String strL = MimeTypes.l(str);
                    strL.getClass();
                    switch (strL) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/eac3":
                            i4 = 0;
                            break;
                        case "video/mp2p":
                            i4 = 10;
                            break;
                        case "video/mp2t":
                            i4 = 11;
                            break;
                        case "video/webm":
                        case "audio/x-matroska":
                        case "application/webm":
                        case "audio/webm":
                        case "video/x-matroska":
                            i4 = 6;
                            break;
                        case "audio/amr-wb":
                        case "audio/amr":
                        case "audio/3gpp":
                            i4 = 3;
                            break;
                        case "image/avif":
                            i4 = 21;
                            break;
                        case "image/heic":
                        case "image/heif":
                            i4 = 20;
                            break;
                        case "image/webp":
                            i4 = 18;
                            break;
                        case "application/mp4":
                        case "audio/mp4":
                        case "video/mp4":
                            i4 = 8;
                            break;
                        case "video/x-msvideo":
                            i4 = 16;
                            break;
                        case "text/vtt":
                            i4 = 13;
                            break;
                        case "image/bmp":
                            i4 = 19;
                            break;
                        case "image/png":
                            i4 = 17;
                            break;
                        case "video/x-flv":
                            i4 = 5;
                            break;
                        case "audio/ac4":
                            i4 = 1;
                            break;
                        case "audio/ogg":
                            i4 = 9;
                            break;
                        case "audio/wav":
                            i4 = 12;
                            break;
                        case "audio/flac":
                            i4 = 4;
                            break;
                        case "audio/midi":
                            i4 = 15;
                            break;
                        case "audio/mpeg":
                            i4 = 7;
                            break;
                    }
                    if (i4 != -1) {
                        a(i4, arrayList);
                    }
                    iA = FileTypes.a(uri);
                    if (iA != -1 && iA != i4) {
                        a(iA, arrayList);
                    }
                    for (i2 = 0; i2 < 21; i2++) {
                        i3 = iArr[i2];
                        if (i3 == i4 && i3 != iA) {
                            a(i3, arrayList);
                        }
                    }
                    extractorArr = new Extractor[arrayList.size()];
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        subtitleTranscodingExtractor = (Extractor) arrayList.get(i5);
                        if (this.f6743Y && !(subtitleTranscodingExtractor.b() instanceof FragmentedMp4Extractor) && !(subtitleTranscodingExtractor.b() instanceof Mp4Extractor) && !(subtitleTranscodingExtractor.b() instanceof TsExtractor) && !(subtitleTranscodingExtractor.b() instanceof AviExtractor) && !(subtitleTranscodingExtractor.b() instanceof MatroskaExtractor)) {
                            subtitleTranscodingExtractor = new SubtitleTranscodingExtractor(subtitleTranscodingExtractor, this.Z);
                        }
                        extractorArr[i5] = subtitleTranscodingExtractor;
                    }
                }
                i4 = -1;
                if (i4 != -1) {
                    a(i4, arrayList);
                }
                iA = FileTypes.a(uri);
                if (iA != -1) {
                    a(iA, arrayList);
                }
                while (i2 < 21) {
                    i3 = iArr[i2];
                    if (i3 == i4) {
                    }
                }
                extractorArr = new Extractor[arrayList.size()];
                while (i5 < arrayList.size()) {
                    subtitleTranscodingExtractor = (Extractor) arrayList.get(i5);
                    if (this.f6743Y) {
                        subtitleTranscodingExtractor = new SubtitleTranscodingExtractor(subtitleTranscodingExtractor, this.Z);
                    }
                    extractorArr[i5] = subtitleTranscodingExtractor;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extractorArr;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final synchronized Extractor[] createExtractors() {
        return b(Uri.EMPTY, new HashMap());
    }
}
