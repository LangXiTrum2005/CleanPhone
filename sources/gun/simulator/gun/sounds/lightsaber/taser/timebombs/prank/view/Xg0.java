package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class Xg0 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3987a;

    public /* synthetic */ Xg0(int i) {
        this.f3987a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i = this.f3987a;
        switch (i) {
            case 0:
                return new PathMeasure();
            case 1:
                switch (i) {
                    case 1:
                        return new Path();
                    default:
                        return new Path();
                }
            case 2:
                switch (i) {
                    case 1:
                        return new Path();
                    default:
                        return new Path();
                }
            case 3:
                return new float[4];
            case 4:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Vg0.e);
                return simpleDateFormat;
        }
    }
}
