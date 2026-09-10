package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRenderersFactory implements RenderersFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultMediaCodecAdapterFactory f5852b;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f5851a = context;
        this.f5852b = new DefaultMediaCodecAdapterFactory(context);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public final Renderer[] a(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        ArrayList arrayList = new ArrayList();
        DefaultMediaCodecAdapterFactory defaultMediaCodecAdapterFactory = this.f5852b;
        Context context = this.f5851a;
        arrayList.add(new MediaCodecVideoRenderer(context, defaultMediaCodecAdapterFactory, handler, videoRendererEventListener));
        DefaultAudioSink.Builder builder = new DefaultAudioSink.Builder(context);
        Assertions.e(!builder.f6148c);
        builder.f6148c = true;
        if (builder.f6147b == null) {
            builder.f6147b = new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0]);
        }
        if (builder.f6149e == null) {
            builder.f6149e = new DefaultAudioOffloadSupportProvider(context);
        }
        arrayList.add(new MediaCodecAudioRenderer(context, defaultMediaCodecAdapterFactory, handler, audioRendererEventListener, new DefaultAudioSink(builder)));
        arrayList.add(new TextRenderer(textOutput, handler.getLooper()));
        arrayList.add(new MetadataRenderer(metadataOutput, handler.getLooper()));
        arrayList.add(new CameraMotionRenderer());
        arrayList.add(new ImageRenderer(ImageDecoder.Factory.f6253a));
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }
}
