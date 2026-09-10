package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3399a;
    public final Uo0 b;
    public final File d;
    public final File e;
    public volatile boolean c = false;
    public final ArrayList f = new ArrayList();
    public volatile boolean g = false;

    public MG(Context context, Uo0 uo0) {
        this.d = null;
        this.e = null;
        this.f3399a = context;
        this.b = uo0;
        this.d = AbstractC2845Vx.F(uo0.LD(), uo0.STP());
        this.e = AbstractC2845Vx.Y(uo0.LD(), uo0.STP());
    }

    public static void a(MG mg, Uo0 uo0, int i, String str) {
        mg.getClass();
        synchronized (InterfaceC5182zK.class) {
            try {
                for (InterfaceC5182zK interfaceC5182zK : mg.f) {
                    if (interfaceC5182zK != null) {
                        interfaceC5182zK.Lxb(uo0, i, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(MG mg, Closeable closeable) {
        mg.getClass();
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void e(MG mg) {
        File file = mg.d;
        File file2 = mg.e;
        try {
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("Error renaming file " + file + " to " + file2 + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r1.length() >= r14.Lxb()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK r14) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MG.c(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zK):void");
    }

    public final void d(Uo0 uo0, int i) {
        synchronized (InterfaceC5182zK.class) {
            try {
                for (InterfaceC5182zK interfaceC5182zK : this.f) {
                    if (interfaceC5182zK != null) {
                        interfaceC5182zK.Lxb(uo0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
