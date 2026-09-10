package com.google.android.exoplayer2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultRenderersFactory implements RenderersFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultMediaCodecAdapterFactory f17021b = new DefaultMediaCodecAdapterFactory();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f17020a = context;
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    public final Renderer[] a(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        ArrayList arrayList = new ArrayList();
        DefaultMediaCodecAdapterFactory defaultMediaCodecAdapterFactory = this.f17021b;
        Context context = this.f17020a;
        arrayList.add(new MediaCodecVideoRenderer(context, defaultMediaCodecAdapterFactory, handler, videoRendererEventListener));
        DefaultAudioSink.Builder builder = new DefaultAudioSink.Builder();
        builder.f17354a = AudioCapabilities.f17281c;
        builder.f17356c = DefaultAudioSink.AudioTrackBufferSizeProvider.f17353a;
        AudioCapabilities audioCapabilitiesA = AudioCapabilities.a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
        audioCapabilitiesA.getClass();
        builder.f17354a = audioCapabilitiesA;
        if (builder.f17355b == null) {
            builder.f17355b = new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0]);
        }
        arrayList.add(new MediaCodecAudioRenderer(this.f17020a, defaultMediaCodecAdapterFactory, handler, audioRendererEventListener, new DefaultAudioSink(builder)));
        arrayList.add(new TextRenderer(textOutput, handler.getLooper()));
        arrayList.add(new MetadataRenderer(metadataOutput, handler.getLooper()));
        arrayList.add(new CameraMotionRenderer());
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }
}
