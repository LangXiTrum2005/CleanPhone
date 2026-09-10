package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Supplier {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6195Y;

    public /* synthetic */ c(Object obj, int i2) {
        this.X = i2;
        this.f6195Y = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        DefaultBandwidthMeter defaultBandwidthMeter;
        switch (this.X) {
            case 0:
                return new DefaultRenderersFactory((Context) this.f6195Y);
            case 1:
                DefaultExtractorsFactory defaultExtractorsFactory = new DefaultExtractorsFactory();
                defaultExtractorsFactory.Z = new DefaultSubtitleParserFactory();
                defaultExtractorsFactory.f6743Y = true;
                return new DefaultMediaSourceFactory((Context) this.f6195Y, defaultExtractorsFactory);
            case 2:
                return new DefaultTrackSelector((Context) this.f6195Y);
            case 3:
                Context context = (Context) this.f6195Y;
                ImmutableList immutableList = DefaultBandwidthMeter.f6561n;
                synchronized (DefaultBandwidthMeter.class) {
                    try {
                        if (DefaultBandwidthMeter.t == null) {
                            DefaultBandwidthMeter.Builder builder = new DefaultBandwidthMeter.Builder(context);
                            DefaultBandwidthMeter.t = new DefaultBandwidthMeter(builder.f6570a, builder.f6571b, builder.f6572c, builder.d, builder.f6573e);
                        }
                        defaultBandwidthMeter = DefaultBandwidthMeter.t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultBandwidthMeter;
            default:
                return Boolean.valueOf(((ExoPlayerImplInternal) this.f6195Y).B0);
        }
    }
}
