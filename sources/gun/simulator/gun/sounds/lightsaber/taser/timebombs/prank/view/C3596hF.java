package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3596hF implements InterfaceC3191ch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f4450a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f4450a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3297dr
    public final void a(Object obj, Object obj2) {
        ((InterfaceC3280dh0) obj2).d(f4450a.format((Date) obj));
    }
}
