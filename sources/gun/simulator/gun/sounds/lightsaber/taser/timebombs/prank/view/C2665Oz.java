package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2665Oz extends AbstractC2691Pz {
    public final String l;
    public final AC m;

    public C2665Oz(String str, C2665Oz c2665Oz, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, c2665Oz, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = AC.j(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2665Oz(String str, long j, String str2, String str3, long j2) {
        this(str, null, "", 0L, -1, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, null, str2, str3, j, j2, false, C3965lY.e);
        C5086yC c5086yC = AC.b;
    }
}
