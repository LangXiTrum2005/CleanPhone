package k;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.ads.q00;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends q00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44143c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f44144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f44145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, v9.e eVar) {
        super(vVar);
        this.f44144d = vVar;
        this.f44145e = eVar;
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final IntentFilter d() {
        switch (this.f44143c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final int g() {
        Location location;
        boolean z10;
        long j10;
        Location lastKnownLocation;
        switch (this.f44143c) {
            case 0:
                return o.a((PowerManager) this.f44145e) ? 2 : 1;
            default:
                v9.e eVar = (v9.e) this.f44145e;
                c0 c0Var = (c0) eVar.f52505d;
                LocationManager locationManager = (LocationManager) eVar.f52504c;
                if (c0Var.f44059b <= System.currentTimeMillis()) {
                    Context context = (Context) eVar.f52503b;
                    Location lastKnownLocation2 = null;
                    if (i0.i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (i0.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z10 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (b0.f44042d == null) {
                            b0.f44042d = new b0();
                        }
                        b0 b0Var = b0.f44042d;
                        b0Var.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        b0Var.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z10 = b0Var.f44045c == 1;
                        long j11 = b0Var.f44044b;
                        long j12 = b0Var.f44043a;
                        b0Var.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j13 = b0Var.f44044b;
                        if (j11 == -1 || j12 == -1) {
                            j10 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j12) {
                                j11 = j13;
                            } else if (jCurrentTimeMillis > j11) {
                                j11 = j12;
                            }
                            j10 = j11 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                        }
                        c0Var.f44058a = z10;
                        c0Var.f44059b = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z10 = true;
                        }
                    }
                    break;
                } else {
                    z10 = c0Var.f44058a;
                }
                return z10 ? 2 : 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final void m() {
        switch (this.f44143c) {
            case 0:
                this.f44144d.l(true, true);
                break;
            default:
                this.f44144d.l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Context context) {
        super(vVar);
        this.f44144d = vVar;
        this.f44145e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
