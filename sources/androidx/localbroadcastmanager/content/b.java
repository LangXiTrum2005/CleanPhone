package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f4628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f4629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4631d;

    public b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f4628a = intentFilter;
        this.f4629b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f4629b);
        sb2.append(" filter=");
        sb2.append(this.f4628a);
        if (this.f4631d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
