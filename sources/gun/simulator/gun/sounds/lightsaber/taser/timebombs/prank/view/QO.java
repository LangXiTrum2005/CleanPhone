package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class QO implements FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3601a;
    public final Context b;

    public QO(Context context, int i) {
        this.f3601a = i;
        if (i == 1) {
            this.b = context.getApplicationContext();
        } else if (i != 2) {
            this.b = context;
        } else {
            this.b = context.getApplicationContext();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f3601a) {
            case 0:
                break;
            case 1:
                break;
        }
        return d((Uri) obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final /* bridge */ /* synthetic */ EP b(Object obj, int i, int i2, YS ys) {
        switch (this.f3601a) {
            case 0:
                break;
            case 1:
                break;
        }
        return c((Uri) obj, i, i2, ys);
    }

    public final EP c(Uri uri, int i, int i2, YS ys) {
        Long l;
        int i3 = this.f3601a;
        Context context = this.b;
        switch (i3) {
            case 0:
                return new EP(new C3697iS(uri), new PO(context, uri));
            case 1:
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new EP(new C3697iS(uri), C3972lc0.d(context, uri, new C3796jc0(context.getContentResolver())));
            default:
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) ys.c(C4246oh0.d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new EP(new C3697iS(uri), C3972lc0.d(context, uri, new C3884kc0(context.getContentResolver())));
        }
    }

    public final boolean d(Uri uri) {
        switch (this.f3601a) {
            case 0:
                return AbstractC2340Cl.G(uri);
            case 1:
                return AbstractC2340Cl.G(uri) && !uri.getPathSegments().contains("video");
            default:
                return AbstractC2340Cl.G(uri) && uri.getPathSegments().contains("video");
        }
    }
}
