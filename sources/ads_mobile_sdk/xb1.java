package ads_mobile_sdk;

import android.util.Base64;
import android.view.MotionEvent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.C3724ra;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import saneness.madbrain;
import saneness.psalmodic;

/* JADX INFO: loaded from: classes.dex */
public final class xb1 {
    public final Object a;
    public final madbrain b;
    public final psalmodic c;
    public final boolean d;

    public xb1(Object obj, madbrain madbrainVar, psalmodic psalmodicVar, boolean z) {
        this.a = obj;
        this.b = madbrainVar;
        this.c = psalmodicVar;
        this.d = z;
    }

    public final synchronized void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", null).invoke(this.a, null);
            psalmodic psalmodicVar = this.c;
            ((kc1) ((x4) psalmodicVar).a).a(3001, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
        } catch (Exception e) {
            throw new s73(2003, e);
        }
    }

    public final synchronized int b() {
        try {
        } catch (Exception e) {
            throw new s73(2006, e);
        }
        return ((Integer) this.a.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, null).invoke(this.a, null)).intValue();
    }

    public final synchronized boolean c() {
        try {
        } catch (Exception e) {
            throw new s73(2001, e);
        }
        return ((Boolean) this.a.getClass().getDeclaredMethod(X3.a.f, null).invoke(this.a, null)).booleanValue();
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ((gd0) this.b).getClass();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put(C3724ra.b, null);
            map.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, map);
            psalmodic psalmodicVar = this.c;
            ((kc1) ((x4) psalmodicVar).a).a(3003, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
        } catch (Exception e) {
            throw new s73(2005, e);
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(((nb) nb.o().attabal(bb.DG).dern(kn.a(bArr, 0, bArr.length)).a()).a(), 11);
    }

    public final synchronized byte[] a(HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.c.a(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, map);
    }
}
