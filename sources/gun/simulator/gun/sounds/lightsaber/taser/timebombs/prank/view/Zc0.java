package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class Zc0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4080a;
    public final C4483rP b;
    public final C4092mw c;
    public final FirebaseMessaging d;
    public final ScheduledExecutorService f;
    public final Xc0 h;
    public final ArrayMap e = new ArrayMap();
    public boolean g = false;

    public Zc0(FirebaseMessaging firebaseMessaging, C4483rP c4483rP, Xc0 xc0, C4092mw c4092mw, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.b = c4483rP;
        this.h = xc0;
        this.c = c4092mw;
        this.f4080a = context;
        this.f = scheduledExecutorService;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        C4092mw c4092mw = this.c;
        c4092mw.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(c4092mw.c(c4092mw.f(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        C4092mw c4092mw = this.c;
        c4092mw.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(c4092mw.c(c4092mw.f(strA, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Vc0 vc0) {
        synchronized (this.e) {
            try {
                String str = vc0.c;
                if (this.e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void e(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    public final boolean f() throws IOException {
        Vc0 vc0A;
        byte b;
        while (true) {
            synchronized (this) {
                try {
                    vc0A = this.h.a();
                    if (vc0A == null) {
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = vc0A.b;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(ExifInterface.LATITUDE_SOUTH)) {
                    b = 0;
                } else {
                    b = -1;
                }
                String str2 = vc0A.f3879a;
                if (b == 0) {
                    b(str2);
                } else if (b == 1) {
                    c(str2);
                }
                this.h.c(vc0A);
                d(vc0A);
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    e.getMessage();
                } else if (e.getMessage() != null) {
                    throw e;
                }
                return false;
            }
        }
    }

    public final void g(long j2) {
        this.f.schedule(new RunnableC3095bd0(this, this.f4080a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        synchronized (this) {
            this.g = true;
        }
    }
}
