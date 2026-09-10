package zg;

import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;
import com.google.android.gms.internal.measurement.ge;
import fh.b;
import kotlin.jvm.internal.n;
import sg.c;
import xi.g;
import xi.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f54953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f54954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AudioManager f54955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ge f54956d;

    static {
        a aVar = new a();
        f54953a = aVar;
        Object systemService = super.h().getSystemService("audio");
        n.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        f54955c = (AudioManager) systemService;
    }

    @Override // xi.h
    public final void g(g gVar) {
        f54954b = gVar;
        android.support.v4.media.session.a.B(new b(2, null, 4));
        if (f54956d != null) {
            return;
        }
        f54956d = new ge(2);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
        super.h().registerReceiver(f54956d, intentFilter);
    }

    @Override // xi.h
    public final void onCancel() {
        f54954b = null;
        try {
            ge geVar = f54956d;
            if (geVar != null) {
                super.h().unregisterReceiver(geVar);
                f54956d = null;
            }
        } catch (IllegalArgumentException e10) {
            Log.e("ProjectLogger", "FlutterMuteStateService", e10);
            f54956d = null;
        }
    }
}
