package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2472Hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3185a;
    public final G7 b = new G7();

    public C2472Hn(Context context) {
        this.f3185a = context;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    public final L9[] a(Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os2, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os3, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os4) {
        ArrayList arrayList = new ArrayList();
        G7 g7 = this.b;
        Context context = this.f3185a;
        arrayList.add(new KN(context, g7, handler, surfaceHolderCallbackC2658Os));
        C4694tm c4694tm = new C4694tm();
        C3144c7 c3144c7 = C3144c7.c;
        c4694tm.f5050a = c3144c7;
        c4694tm.e = 0;
        c4694tm.f = InterfaceC4606sm.f4997a;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i = Ug0.f3833a;
        if (i >= 17) {
            String str = Ug0.c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                c3144c7 = C3144c7.d;
            } else if (i < 29 && (Ug0.K(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
                c3144c7 = new C3144c7(AbstractC3056b7.a(), 8);
            } else if (intentRegisterReceiver != null && intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                c3144c7 = new C3144c7(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
            }
        } else if (i < 29) {
            if (intentRegisterReceiver != null) {
                c3144c7 = new C3144c7(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
            }
        } else if (intentRegisterReceiver != null) {
            c3144c7 = new C3144c7(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        c3144c7.getClass();
        c4694tm.f5050a = c3144c7;
        c4694tm.c = false;
        c4694tm.d = false;
        c4694tm.e = 0;
        if (c4694tm.b == null) {
            c4694tm.b = new C4568sM(new InterfaceC3759j7[0]);
        }
        C2315Bm c2315Bm = new C2315Bm(c4694tm);
        arrayList.add(new C4481rN(this.f3185a, this.b, handler, surfaceHolderCallbackC2658Os2, c2315Bm));
        arrayList.add(new Yb0(surfaceHolderCallbackC2658Os3, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.metadata.a(surfaceHolderCallbackC2658Os4, handler.getLooper()));
        arrayList.add(new C2694Qc());
        return (L9[]) arrayList.toArray(new L9[0]);
    }
}
