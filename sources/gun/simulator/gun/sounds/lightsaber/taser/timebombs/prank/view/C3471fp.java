package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3471fp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4387a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public C3877kY f;
    public long g;
    public final /* synthetic */ C3909kp h;

    public C3471fp(C3909kp c3909kp, String str) {
        this.h = c3909kp;
        this.f4387a = str;
        int i = c3909kp.g;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c3909kp.g; i2++) {
            sb.append(i2);
            File[] fileArr = this.c;
            String string = sb.toString();
            File file = c3909kp.f4618a;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
