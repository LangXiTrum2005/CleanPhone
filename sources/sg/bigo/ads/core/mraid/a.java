package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes7.dex */
final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f48605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f48606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0872a f48607c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC0872a {
        void a(float f);
    }

    public a(Handler handler, Context context, InterfaceC0872a interfaceC0872a) {
        super(handler);
        this.f48605a = -1.0f;
        this.f48606b = context.getApplicationContext();
        this.f48607c = interfaceC0872a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        super.onChange(z2);
        AudioManager audioManager = (AudioManager) this.f48606b.getSystemService("audio");
        float streamVolume = audioManager != null ? 100.0f * (audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.f48605a) {
            this.f48605a = streamVolume;
            sg.bigo.ads.common.t.a.a(0, 3, "AudioVolumeContentObserver", "Volume change, current value: " + streamVolume);
            InterfaceC0872a interfaceC0872a = this.f48607c;
            if (interfaceC0872a != null) {
                interfaceC0872a.a(this.f48605a);
            }
        }
    }
}
