package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3470fo0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4386a = 0;
    public final Context b;
    public final AudioManager c;
    public float d;
    public final C2443Gk e;
    public final C4523ro0 f;

    public C3470fo0(Handler handler, Context context, C2443Gk c2443Gk, C4523ro0 c4523ro0) {
        super(handler);
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.e = c2443Gk;
        this.f = c4523ro0;
    }

    public final float a() {
        int i = this.f4386a;
        C2443Gk c2443Gk = this.e;
        AudioManager audioManager = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return c2443Gk.a(audioManager.getStreamVolume(3), audioManager.getStreamMaxVolume(3));
    }

    public final boolean b(float f) {
        switch (this.f4386a) {
            case 0:
                return f != this.d;
            case 1:
                return f != this.d;
            default:
                return f != this.d;
        }
    }

    public final void c() {
        int i = this.f4386a;
        C4523ro0 c4523ro0 = this.f;
        switch (i) {
            case 0:
                c4523ro0.a(this.d);
                break;
            case 1:
                c4523ro0.a(this.d);
                break;
            default:
                c4523ro0.a(this.d);
                break;
        }
    }

    public final void d() {
        int i = this.f4386a;
        Context context = this.b;
        switch (i) {
            case 0:
                this.d = a();
                c();
                context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
                break;
            case 1:
                this.d = a();
                c();
                context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
                break;
            default:
                this.d = a();
                c();
                context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
                break;
        }
    }

    public final void e() {
        int i = this.f4386a;
        Context context = this.b;
        switch (i) {
            case 0:
                context.getContentResolver().unregisterContentObserver(this);
                break;
            case 1:
                context.getContentResolver().unregisterContentObserver(this);
                break;
            default:
                context.getContentResolver().unregisterContentObserver(this);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.f4386a) {
            case 0:
                super.onChange(z);
                float fA = a();
                if (b(fA)) {
                    this.d = fA;
                    c();
                }
                break;
            case 1:
                super.onChange(z);
                float fA2 = a();
                if (b(fA2)) {
                    this.d = fA2;
                    c();
                }
                break;
            default:
                super.onChange(z);
                float fA3 = a();
                if (b(fA3)) {
                    this.d = fA3;
                    c();
                }
                break;
        }
    }

    public C3470fo0(Handler handler, Context context, C2443Gk c2443Gk, C4523ro0 c4523ro0, int i) {
        super(handler);
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.e = c2443Gk;
        this.f = c4523ro0;
    }

    public C3470fo0(Handler handler, Context context, C2443Gk c2443Gk, C4523ro0 c4523ro0, Object obj) {
        super(handler);
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.e = c2443Gk;
        this.f = c4523ro0;
    }
}
