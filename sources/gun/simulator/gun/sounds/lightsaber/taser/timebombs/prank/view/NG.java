package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class NG {
    public final File c;
    public final File d;
    public final long e;
    public RandomAccessFile h;
    public final Uo0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f3449a = -2147483648L;
    public final Object b = new Object();
    public volatile boolean f = false;
    public volatile boolean g = false;

    public NG(Uo0 uo0) {
        this.e = 0L;
        this.h = null;
        this.i = uo0;
        try {
            File fileF = AbstractC2845Vx.F(uo0.LD(), uo0.STP());
            this.c = fileF;
            File fileY = AbstractC2845Vx.Y(uo0.LD(), uo0.STP());
            this.d = fileY;
            if (fileY.exists()) {
                this.h = new RandomAccessFile(fileY, "r");
            } else {
                this.h = new RandomAccessFile(fileF, "rw");
            }
            if (fileY.exists()) {
                return;
            }
            this.e = fileF.length();
            a();
        } catch (Throwable unused) {
            uo0.NXR();
        }
    }

    public static void b(NG ng) {
        synchronized (ng.b) {
            if (ng.d.exists()) {
                ng.i.NXR();
                ng.i.STP();
                return;
            }
            try {
                if (!ng.c.renameTo(ng.d)) {
                    throw new IOException("Error renaming file " + ng.c + " to " + ng.d + " for completion!");
                }
                RandomAccessFile randomAccessFile = ng.h;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                ng.h = new RandomAccessFile(ng.d, "rw");
                ng.i.STP();
                ng.i.NXR();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public final void a() {
        JVA.Lxb lxbLD = Ro0.a() != null ? Ro0.a().LD() : new JVA.Lxb("v_cache");
        Uo0 uo0 = this.i;
        long jVVE = uo0.VVE();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lxbLD.Lxb(jVVE, timeUnit).LD(uo0.kqm(), timeUnit).lk(uo0.brP(), timeUnit);
        JVA jvaLxb = lxbLD.Lxb();
        uo0.STP();
        jvaLxb.Lxb(new NXR.Lxb().Lxb("RANGE", AbstractC3950lJ.s(new StringBuilder("bytes="), this.e, "-")).LD(uo0.NXR()).Lxb().Lxb("videoLoadWhenPlaying").Lxb(9).LD()).Lxb(new NN(this, 14));
    }
}
