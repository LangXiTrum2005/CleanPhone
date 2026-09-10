package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.in, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3730in implements InterfaceC3150cA, JI {
    public static final C2911Yl o = new C2911Yl(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2497Im f4520a;
    public final InterfaceC2951Zz b;
    public final G7 c;
    public DO f;
    public OI g;
    public Handler h;
    public InterfaceC3062bA i;
    public C2847Vz j;
    public Uri k;
    public C2743Rz l;
    public boolean m;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C3730in(C2497Im c2497Im, G7 g7, InterfaceC2951Zz interfaceC2951Zz) {
        this.f4520a = c2497Im;
        this.b = interfaceC2951Zz;
        this.c = g7;
    }

    public final C2743Rz a(Uri uri, boolean z) {
        HashMap map = this.d;
        C2743Rz c2743Rz = ((C3643hn) map.get(uri)).d;
        if (c2743Rz != null && z && !uri.equals(this.k)) {
            List list = this.j.e;
            for (int i = 0; i < list.size(); i++) {
                if (uri.equals(((C2821Uz) list.get(i)).f3851a)) {
                    C2743Rz c2743Rz2 = this.l;
                    if (c2743Rz2 != null && c2743Rz2.o) {
                        break;
                    }
                    this.k = uri;
                    C3643hn c3643hn = (C3643hn) map.get(uri);
                    C2743Rz c2743Rz3 = c3643hn.d;
                    if (c2743Rz3 != null && c2743Rz3.o) {
                        this.l = c2743Rz3;
                        ((C2769Sz) this.i).w(c2743Rz3);
                        break;
                    }
                    c3643hn.f(b(uri));
                    break;
                }
            }
        }
        return c2743Rz;
    }

    public final Uri b(Uri uri) {
        C2639Nz c2639Nz;
        C2743Rz c2743Rz = this.l;
        if (c2743Rz == null || !c2743Rz.v.e || (c2639Nz = (C2639Nz) ((C4405qY) c2743Rz.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2639Nz.b));
        int i = c2639Nz.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        C2847Vz c2847Vz;
        MT mt = (MT) li;
        AbstractC2873Wz abstractC2873Wz = (AbstractC2873Wz) mt.f;
        boolean z = abstractC2873Wz instanceof C2743Rz;
        if (z) {
            String str = abstractC2873Wz.f3949a;
            C2847Vz c2847Vz2 = C2847Vz.n;
            Uri uri = Uri.parse(str);
            C4531rw c4531rw = new C4531rw();
            c4531rw.f4954a = "0";
            c4531rw.j = MimeTypes.APPLICATION_M3U8;
            c2847Vz = new C2847Vz("", Collections.emptyList(), Collections.singletonList(new C2821Uz(uri, new C4619sw(c4531rw), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            c2847Vz = (C2847Vz) abstractC2873Wz;
        }
        this.j = c2847Vz;
        this.k = ((C2821Uz) c2847Vz.e.get(0)).f3851a;
        this.e.add(new C3555gn(this));
        List list = c2847Vz.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.d.put(uri2, new C3643hn(this, uri2));
        }
        Uri uri3 = mt.d.c;
        FI fi = new FI();
        C3643hn c3643hn = (C3643hn) this.d.get(this.k);
        if (z) {
            c3643hn.g((C2743Rz) abstractC2873Wz, fi);
        } else {
            c3643hn.f(c3643hn.f4470a);
        }
        this.c.getClass();
        this.f.f(fi, 4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        MT mt = (MT) li;
        long j3 = mt.f3405a;
        Uri uri = mt.d.c;
        FI fi = new FI();
        this.c.getClass();
        this.f.d(fi, 4, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        long jMin;
        MT mt = (MT) li;
        long j3 = mt.f3405a;
        Uri uri = mt.d.c;
        FI fi = new FI();
        this.c.getClass();
        if (!(iOException instanceof KT) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof OA) && !(iOException instanceof NI)) {
            int i2 = C4604sl.b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof C4604sl) && ((C4604sl) cause).f4995a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z = jMin == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f.j(fi, mt.c, iOException, z);
        return z ? OI.f : OI.b(jMin, false);
    }

    public final boolean f(Uri uri) {
        int i;
        C3643hn c3643hn = (C3643hn) this.d.get(uri);
        if (c3643hn.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, Ug0.W(c3643hn.d.u));
        C2743Rz c2743Rz = c3643hn.d;
        return c2743Rz.o || (i = c2743Rz.d) == 2 || i == 1 || c3643hn.e + jMax > jElapsedRealtime;
    }
}
