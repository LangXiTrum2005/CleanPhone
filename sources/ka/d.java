package ka;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Iterator;
import la.j;
import la.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends la.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44537b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f44538c = taskCompletionSource2;
        this.f44539d = fVar;
    }

    @Override // la.f
    public final void a() {
        HashMap map;
        la.d bVar = null;
        switch (this.f44537b) {
            case 0:
                try {
                    f fVar = (f) this.f44539d;
                    la.d dVar = fVar.f44544a.f45271m;
                    String str = fVar.f44545b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = g.f44546a;
                    synchronized (g.class) {
                        map = g.f44546a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey(IronSourceConstants.EVENTS_NATIVE)) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get(IronSourceConstants.EVENTS_NATIVE)).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    f fVar2 = (f) this.f44539d;
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f44538c;
                    String str2 = fVar2.f44545b;
                    e eVar = new e(fVar2, taskCompletionSource);
                    la.b bVar2 = (la.b) dVar;
                    bVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i10 = la.a.f45246a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(eVar);
                    try {
                        bVar2.f45247a.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e10) {
                    f fVar3 = (f) this.f44539d;
                    la.e eVar2 = f.f44543c;
                    Object[] objArr = {fVar3.f44545b};
                    eVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", la.e.c(eVar2.f45249a, "error requesting in-app review for %s", objArr), e10);
                    }
                    ((TaskCompletionSource) this.f44538c).trySetException(new RuntimeException(e10));
                    return;
                }
            default:
                k kVar = (k) ((j) this.f44539d).f45258b;
                IBinder iBinder = (IBinder) this.f44538c;
                int i11 = la.c.f45248b;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    bVar = iInterfaceQueryLocalInterface instanceof la.d ? (la.d) iInterfaceQueryLocalInterface : new la.b(iBinder);
                }
                kVar.f45271m = bVar;
                la.e eVar3 = kVar.f45261b;
                eVar3.a("linkToDeath", new Object[0]);
                try {
                    ((la.b) kVar.f45271m).f45247a.linkToDeath(kVar.f45269j, 0);
                    break;
                } catch (RemoteException e11) {
                    Object[] objArr2 = new Object[0];
                    eVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", la.e.c(eVar3.f45249a, "linkToDeath failed", objArr2), e11);
                    }
                }
                kVar.f45266g = false;
                Iterator it = kVar.f45263d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                kVar.f45263d.clear();
                return;
        }
    }

    public d(j jVar, IBinder iBinder) {
        this.f44538c = iBinder;
        this.f44539d = jVar;
    }
}
