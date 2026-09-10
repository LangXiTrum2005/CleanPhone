package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2907Yh {
    public static final Pattern e;
    public static final Pattern f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f4033a = new HashSet();
    public final Executor b;
    public final C2777Th c;
    public final C2777Th d;

    static {
        Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C2907Yh(ScheduledExecutorService scheduledExecutorService, C2777Th c2777Th, C2777Th c2777Th2) {
        this.b = scheduledExecutorService;
        this.c = c2777Th;
        this.d = c2777Th2;
    }

    public static C2803Uh c(C2777Th c2777Th) {
        synchronized (c2777Th) {
            try {
                Task task = c2777Th.c;
                if (task == null || !task.isSuccessful()) {
                    try {
                        return (C2803Uh) C2777Th.a(c2777Th.b(), TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return (C2803Uh) c2777Th.c.getResult();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static HashSet d(C2777Th c2777Th) {
        HashSet hashSet = new HashSet();
        C2803Uh c2803UhC = c(c2777Th);
        if (c2803UhC == null) {
            return hashSet;
        }
        Iterator<String> itKeys = c2803UhC.b.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    public static String e(C2777Th c2777Th, String str) {
        C2803Uh c2803UhC = c(c2777Th);
        if (c2803UhC == null) {
            return null;
        }
        try {
            return c2803UhC.b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(C4580sY c4580sY) {
        synchronized (this.f4033a) {
            this.f4033a.add(c4580sY);
        }
    }

    public final void b(C2803Uh c2803Uh, String str) {
        if (c2803Uh == null) {
            return;
        }
        synchronized (this.f4033a) {
            try {
                Iterator it = this.f4033a.iterator();
                while (it.hasNext()) {
                    this.b.execute(new RunnableC4746uO((BiConsumer) it.next(), str, c2803Uh, 10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(String str, String str2) {
    }
}
