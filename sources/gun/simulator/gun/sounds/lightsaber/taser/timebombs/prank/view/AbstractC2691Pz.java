package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.drm.DrmInitData;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2691Pz implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3582a;
    public final C2665Oz b;
    public final long c;
    public final int d;
    public final long e;
    public final DrmInitData f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public AbstractC2691Pz(String str, C2665Oz c2665Oz, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
        this.f3582a = str;
        this.b = c2665Oz;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = drmInitData;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
