package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilitiesReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f6063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f6064c;
    public final AudioDeviceCallbackV23 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f6065e;
    public final ExternalSurroundSoundSettingObserver f;
    public AudioCapabilities g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioDeviceInfoApi23 f6066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioAttributes f6067i;
    public boolean j;

    public static final class Api23 {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    public final class AudioDeviceCallbackV23 extends AudioDeviceCallback {
        public AudioDeviceCallbackV23() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f6062a, audioCapabilitiesReceiver.f6067i, audioCapabilitiesReceiver.f6066h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            AudioDeviceInfoApi23 audioDeviceInfoApi23 = audioCapabilitiesReceiver.f6066h;
            int i2 = Util.f5683a;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (Util.a(audioDeviceInfo, audioDeviceInfoApi23)) {
                    audioCapabilitiesReceiver.f6066h = null;
                    break;
                }
            }
            audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f6062a, audioCapabilitiesReceiver.f6067i, audioCapabilitiesReceiver.f6066h));
        }
    }

    public final class ExternalSurroundSoundSettingObserver extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f6069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f6070b;

        public ExternalSurroundSoundSettingObserver(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f6069a = contentResolver;
            this.f6070b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f6062a, audioCapabilitiesReceiver.f6067i, audioCapabilitiesReceiver.f6066h));
        }
    }

    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        public HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(AudioCapabilities.b(context, intent, audioCapabilitiesReceiver.f6067i, audioCapabilitiesReceiver.f6066h));
        }
    }

    public interface Listener {
    }

    public AudioCapabilitiesReceiver(Context context, g gVar, AudioAttributes audioAttributes, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        Context applicationContext = context.getApplicationContext();
        this.f6062a = applicationContext;
        this.f6063b = gVar;
        this.f6067i = audioAttributes;
        this.f6066h = audioDeviceInfoApi23;
        int i2 = Util.f5683a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f6064c = handler;
        int i3 = Util.f5683a;
        this.d = i3 >= 23 ? new AudioDeviceCallbackV23() : null;
        this.f6065e = i3 >= 21 ? new HdmiAudioPlugBroadcastReceiver() : null;
        AudioCapabilities audioCapabilities = AudioCapabilities.f6055c;
        String str = Util.f5685c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new ExternalSurroundSoundSettingObserver(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(AudioCapabilities audioCapabilities) {
        RendererCapabilities.Listener listener;
        if (!this.j || audioCapabilities.equals(this.g)) {
            return;
        }
        this.g = audioCapabilities;
        DefaultAudioSink defaultAudioSink = this.f6063b.f6192a;
        defaultAudioSink.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = defaultAudioSink.i0;
        if (looper != looperMyLooper) {
            String name = AbstractJsonLexerKt.NULL;
            String name2 = looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
            if (looperMyLooper != null) {
                name = looperMyLooper.getThread().getName();
            }
            throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.n("Current looper (", name, ") is not the playback looper (", name2, ")"));
        }
        if (audioCapabilities.equals(defaultAudioSink.x)) {
            return;
        }
        defaultAudioSink.x = audioCapabilities;
        AudioSink.Listener listener2 = defaultAudioSink.s;
        if (listener2 != null) {
            MediaCodecAudioRenderer mediaCodecAudioRenderer = MediaCodecAudioRenderer.this;
            synchronized (mediaCodecAudioRenderer.X) {
                listener = mediaCodecAudioRenderer.r0;
            }
            if (listener != null) {
                listener.a(mediaCodecAudioRenderer);
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.f6066h;
        if (Util.a(audioDeviceInfo, audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.f6073a)) {
            return;
        }
        AudioDeviceInfoApi23 audioDeviceInfoApi24 = audioDeviceInfo != null ? new AudioDeviceInfoApi23(audioDeviceInfo) : null;
        this.f6066h = audioDeviceInfoApi24;
        a(AudioCapabilities.c(this.f6062a, this.f6067i, audioDeviceInfoApi24));
    }
}
