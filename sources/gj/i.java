package gj;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f41941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f41942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f41943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41945h;

    public i(Context context, ComponentName componentName) {
        super(componentName);
        this.f41941d = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f41942e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f41943f = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // gj.o
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f41956a);
        if (this.f41941d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f41944g) {
                        this.f41944g = true;
                        if (!this.f41945h) {
                            this.f41942e.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // gj.o
    public final void c() {
        synchronized (this) {
            try {
                if (this.f41945h) {
                    if (this.f41944g) {
                        this.f41942e.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                    }
                    this.f41945h = false;
                    this.f41943f.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gj.o
    public final void d() {
        synchronized (this) {
            try {
                if (!this.f41945h) {
                    this.f41945h = true;
                    this.f41943f.acquire(600000L);
                    this.f41942e.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gj.o
    public final void e() {
        synchronized (this) {
            this.f41944g = false;
        }
    }
}
