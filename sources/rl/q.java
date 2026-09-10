package rl;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f49646k = new q(false, false, false, false, false, new q(false, false, false, false, false, null, false, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), false, null, null, 988);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f49652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f49654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f49655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f49656j;

    public q(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, q qVar, boolean z15, q qVar2, q qVar3, int i10) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        qVar = (i10 & 32) != 0 ? null : qVar;
        z15 = (i10 & 64) != 0 ? true : z15;
        qVar2 = (i10 & 128) != 0 ? qVar : qVar2;
        qVar3 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? qVar : qVar3;
        boolean z16 = (i10 & 512) == 0;
        this.f49647a = z10;
        this.f49648b = z11;
        this.f49649c = z12;
        this.f49650d = z13;
        this.f49651e = z14;
        this.f49652f = qVar;
        this.f49653g = z15;
        this.f49654h = qVar2;
        this.f49655i = qVar3;
        this.f49656j = z16;
    }
}
