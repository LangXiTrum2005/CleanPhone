package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3770jF extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3770jF(int i) {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        this.f4545a = i;
        if (i != 3) {
        } else {
            super("Failed to bind to the service.");
        }
    }

    private synchronized void a() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f4545a) {
            case 5:
                a();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3770jF(String str, int i) {
        super(str);
        this.f4545a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3770jF(String str, Throwable th, int i) {
        super(str, th);
        this.f4545a = i;
    }
}
