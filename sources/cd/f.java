package cd;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import h9.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fd.a f6372e = fd.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6376d;

    public f(Activity activity) {
        i iVar = new i(1);
        HashMap map = new HashMap();
        this.f6376d = false;
        this.f6373a = activity;
        this.f6374b = iVar;
        this.f6375c = map;
    }

    public final md.d a() {
        boolean z10 = this.f6376d;
        fd.a aVar = f6372e;
        if (!z10) {
            aVar.a("No recording has been started.");
            return new md.d();
        }
        SparseIntArray sparseIntArray = ((SparseIntArray[]) ((k) this.f6374b.f50111a).f42287b)[0];
        if (sparseIntArray == null) {
            aVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new md.d();
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int iKeyAt = sparseIntArray.keyAt(i13);
            int iValueAt = sparseIntArray.valueAt(i13);
            i10 += iValueAt;
            if (iKeyAt > 700) {
                i12 += iValueAt;
            }
            if (iKeyAt > 16) {
                i11 += iValueAt;
            }
        }
        return new md.d(new gd.d(i10, i11, i12));
    }

    public final void b() {
        boolean z10 = this.f6376d;
        Activity activity = this.f6373a;
        if (z10) {
            f6372e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        k kVar = (k) this.f6374b.f50111a;
        kVar.getClass();
        if (k.f42284f == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            k.f42284f = handlerThread;
            handlerThread.start();
            k.f42285g = new Handler(k.f42284f.getLooper());
        }
        for (int i10 = 0; i10 <= 8; i10++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) kVar.f42287b;
            if (sparseIntArrayArr[i10] == null) {
                if (((1 << i10) & kVar.f42286a) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((b0.d) kVar.f42289d, k.f42285g);
        ((ArrayList) kVar.f42288c).add(new WeakReference(activity));
        this.f6376d = true;
    }
}
