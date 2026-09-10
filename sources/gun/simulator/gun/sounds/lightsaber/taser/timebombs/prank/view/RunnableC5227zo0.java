package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5227zo0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5345a = 0;
    public final /* synthetic */ Vo0 b;

    public RunnableC5227zo0(Vo0 vo0) {
        this.b = vo0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.b.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(this.f5345a)});
        } catch (Throwable unused) {
        }
    }
}
