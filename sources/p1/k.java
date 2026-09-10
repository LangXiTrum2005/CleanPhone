package p1;

import android.os.Build;
import com.google.android.gms.internal.play_billing.q1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface k extends i1.k0 {

    /* JADX INFO: renamed from: w9, reason: collision with root package name */
    public static final int f48102w9;

    static {
        String str = l1.y.f44830a;
        String strF = q1.F(Build.DEVICE);
        f48102w9 = (strF.contains("emulator") || strF.contains("emu64a") || strF.contains("emu64x") || strF.contains("generic")) ? 30000 : 10000;
    }
}
