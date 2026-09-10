package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2393Em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3037a;
    public final HashMap b;
    public final int c;
    public final Oa0 d;
    public final boolean e;

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public C2393Em(Context context) {
        String strJ0;
        TelephonyManager telephonyManager;
        this.f3037a = context == null ? null : context.getApplicationContext();
        int i = Ug0.f3833a;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            strJ0 = FW.j0(Locale.getDefault().getCountry());
        } else {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (TextUtils.isEmpty(networkCountryIso)) {
                strJ0 = FW.j0(Locale.getDefault().getCountry());
            } else {
                strJ0 = FW.j0(networkCountryIso);
            }
        }
        int[] iArrA = C2419Fm.a(strJ0);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        C3965lY c3965lY = C2419Fm.n;
        map.put(2, (Long) c3965lY.get(iArrA[0]));
        map.put(3, (Long) C2419Fm.o.get(iArrA[1]));
        map.put(4, (Long) C2419Fm.p.get(iArrA[2]));
        map.put(5, (Long) C2419Fm.q.get(iArrA[3]));
        map.put(10, (Long) C2419Fm.r.get(iArrA[4]));
        map.put(9, (Long) C2419Fm.s.get(iArrA[5]));
        map.put(7, (Long) c3965lY.get(iArrA[0]));
        this.b = map;
        this.c = 2000;
        this.d = InterfaceC2412Ff.f3077a;
        this.e = true;
    }
}
