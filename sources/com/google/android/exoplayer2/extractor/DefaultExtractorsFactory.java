package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.jpeg.JpegExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int[] f17529Y = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final ExtensionLoader Z = new ExtensionLoader(new f(16));
    public static final ExtensionLoader e0 = new ExtensionLoader(new f(17));
    public final ImmutableList X = ImmutableList.x();

    public static final class ExtensionLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstructorSupplier f17530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f17531b = new AtomicBoolean(false);

        public interface ConstructorSupplier {
            Constructor a();
        }

        public ExtensionLoader(ConstructorSupplier constructorSupplier) {
            this.f17530a = constructorSupplier;
        }

        public final Extractor a(Object... objArr) {
            Constructor constructorA;
            synchronized (this.f17531b) {
                if (!this.f17531b.get()) {
                    try {
                        constructorA = this.f17530a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f17531b.set(true);
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
                Extractor extractorA = Z.a(0);
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
                arrayList.add(new MatroskaExtractor());
                break;
            case 7:
                arrayList.add(new Mp3Extractor());
                break;
            case 8:
                arrayList.add(new FragmentedMp4Extractor());
                arrayList.add(new Mp4Extractor());
                break;
            case 9:
                arrayList.add(new OggExtractor());
                break;
            case 10:
                arrayList.add(new PsExtractor());
                break;
            case 11:
                arrayList.add(new TsExtractor(new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.X)));
                break;
            case 12:
                WavExtractor wavExtractor = new WavExtractor();
                wavExtractor.f18105c = 0;
                wavExtractor.d = -1L;
                wavExtractor.f = -1;
                wavExtractor.g = -1L;
                arrayList.add(wavExtractor);
                break;
            case 14:
                arrayList.add(new JpegExtractor());
                break;
            case 15:
                Extractor extractorA2 = e0.a(new Object[0]);
                if (extractorA2 != null) {
                    arrayList.add(extractorA2);
                }
                break;
            case 16:
                arrayList.add(new AviExtractor());
                break;
        }
    }
}
