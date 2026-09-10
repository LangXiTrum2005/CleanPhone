package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4787uo0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5104a;
    public final int b;

    public CallableC4787uo0(String str, int i) {
        this.f5104a = str;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Socket socket;
        Throwable th;
        try {
            socket = new Socket(this.f5104a, this.b);
            try {
                socket.setSoTimeout(2000);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("Ping\n".getBytes(PK.b));
                outputStream.flush();
                if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                    Boolean bool = Boolean.TRUE;
                    PK.k(socket);
                    return bool;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.getMessage();
                    Log.getStackTraceString(th);
                } finally {
                    PK.k(socket);
                }
            }
        } catch (Throwable th3) {
            socket = null;
            th = th3;
        }
        return Boolean.FALSE;
    }
}
