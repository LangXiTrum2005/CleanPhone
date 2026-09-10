package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class LK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AK f3348a;

    /* JADX WARN: Code duplicated, block: B:32:0x009d A[LOOP:1: B:31:0x009b->B:32:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:25:0x0066->B:42:?, LOOP_END, SYNTHETIC] */
    public static String a(Uo0 uo0) {
        int size;
        int i;
        boolean z = !TextUtils.isEmpty(uo0.STP());
        String strSTP = z ? uo0.STP() : uo0.NXR();
        C4963wo0 c4963wo0B = C4963wo0.b();
        String[] strArr = {uo0.NXR()};
        c4963wo0B.getClass();
        if (TextUtils.isEmpty(strSTP)) {
            return strArr[0];
        }
        if (c4963wo0B.d == null) {
            return strArr[0];
        }
        if (c4963wo0B.e == null) {
            return strArr[0];
        }
        if (c4963wo0B.c.get() != 1) {
            return strArr[0];
        }
        ArrayList arrayListH = PK.h(strArr);
        if (arrayListH == null) {
            return strArr[0];
        }
        String strA = z ? strSTP : SG.a(strSTP);
        StringBuilder sb = new StringBuilder(512);
        String str = null;
        String string = null;
        while (true) {
            if (string != null) {
                if (arrayListH.size() == 1) {
                    break;
                }
                arrayListH.remove(arrayListH.size() - 1);
                sb.delete(0, sb.length());
                sb.append("rk=");
                sb.append(Uri.encode(strSTP));
                sb.append("&k=");
                sb.append(Uri.encode(strA));
                size = arrayListH.size();
                while (i < size) {
                    sb.append("&u");
                    sb.append(i);
                    sb.append("=");
                    sb.append(Uri.encode((String) arrayListH.get(i)));
                }
                string = sb.toString();
                if (string.length() <= 3072) {
                    str = string;
                    break;
                }
            } else {
                sb.delete(0, sb.length());
                sb.append("rk=");
                sb.append(Uri.encode(strSTP));
                sb.append("&k=");
                sb.append(Uri.encode(strA));
                size = arrayListH.size();
                for (i = 0; i < size; i++) {
                    sb.append("&u");
                    sb.append(i);
                    sb.append("=");
                    sb.append(Uri.encode((String) arrayListH.get(i)));
                }
                string = sb.toString();
                if (string.length() <= 3072) {
                    str = string;
                    break;
                }
            }
        }
        if (str == null) {
            return strArr[0];
        }
        return ("https://" + C4963wo0.d() + ":" + c4963wo0B.b + "?" + str).replaceFirst(com.umeng.analytics.pro.bc.aH, "");
    }

    public final boolean b() {
        No0 no0;
        if (this.f3348a != null) {
            return true;
        }
        File file = new File(Ro0.f3682a.getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            no0 = new No0(file);
            try {
                no0.p = 104857600L;
                Handler handler = no0.t;
                TY ty = no0.s;
                handler.removeCallbacks(ty);
                handler.postDelayed(ty, WorkRequest.MIN_BACKOFF_MILLIS);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            no0 = null;
        }
        if (no0 == null) {
            return false;
        }
        AbstractC4648tE.e = true;
        AbstractC4648tE.f = true;
        AbstractC4648tE.g = 1;
        C4963wo0 c4963wo0B = C4963wo0.b();
        if (c4963wo0B.i.compareAndSet(false, true)) {
            Thread thread = new Thread(c4963wo0B.h);
            thread.setName("csj_proxy_server");
            thread.start();
        }
        try {
            AK ak = new AK();
            this.f3348a = ak;
            ak.setName("csj_video_cache_preloader");
            this.f3348a.start();
            AbstractC4648tE.a(no0, Ro0.f3682a);
            C4959wm0.c();
            C4959wm0.c().f5197a = 10485759;
            if (AbstractC4648tE.c) {
                "MaxPreloadSize: ".concat(String.valueOf(10485759));
            }
            return true;
        } catch (Exception unused3) {
            return false;
        }
    }
}
