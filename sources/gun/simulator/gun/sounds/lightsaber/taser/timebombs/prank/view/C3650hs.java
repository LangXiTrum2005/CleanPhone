package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3650hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventMessage[] f4477a;
    public final long[] b;
    public final String c;
    public final String d;

    public C3650hs(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.f4477a = eventMessageArr;
    }

    public final String a() {
        return this.c + "/" + this.d;
    }
}
