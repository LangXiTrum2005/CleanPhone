package h3;

import com.google.android.gms.internal.ads.i3;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f42141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f42142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f42143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i3 f42144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i1.p f42146f;

    public j(p pVar, r rVar, a0 a0Var) {
        this.f42141a = pVar;
        this.f42142b = rVar;
        this.f42143c = a0Var;
        this.f42144d = MimeTypes.AUDIO_TRUEHD.equals(pVar.f42187g.f42643n) ? new i3(1) : null;
    }
}
