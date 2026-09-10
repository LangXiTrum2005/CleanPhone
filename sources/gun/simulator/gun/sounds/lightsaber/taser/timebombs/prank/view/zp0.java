package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zp0 extends vp0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public zp0(ServiceConnectionC3340eN serviceConnectionC3340eN, IBinder iBinder) {
        this.b = 1;
        this.d = serviceConnectionC3340eN;
        this.c = iBinder;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.IInterface, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pp0] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vp0
    public final void a() {
        IInterface ip0Var;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Cp0 cp0 = (Cp0) obj;
                vp0 vp0Var = (vp0) obj2;
                IInterface iInterface = cp0.m;
                ArrayList<vp0> arrayList = cp0.d;
                B4 b4 = cp0.b;
                if (iInterface == null && !cp0.g) {
                    b4.c("Initiate binding to the service.", new Object[0]);
                    arrayList.add(vp0Var);
                    ServiceConnectionC3340eN serviceConnectionC3340eN = new ServiceConnectionC3340eN(cp0);
                    cp0.l = serviceConnectionC3340eN;
                    cp0.g = true;
                    if (!cp0.f2944a.bindService(cp0.h, serviceConnectionC3340eN, 1)) {
                        b4.c("Failed to bind to the service.", new Object[0]);
                        cp0.g = false;
                        for (vp0 vp0Var2 : arrayList) {
                            C3770jF c3770jF = new C3770jF(3);
                            TaskCompletionSource taskCompletionSource = vp0Var2.f5157a;
                            if (taskCompletionSource != null) {
                                taskCompletionSource.trySetException(c3770jF);
                            }
                        }
                        arrayList.clear();
                    }
                } else if (cp0.g) {
                    b4.c("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(vp0Var);
                } else {
                    vp0Var.run();
                }
                break;
            case 1:
                ServiceConnectionC3340eN serviceConnectionC3340eN2 = (ServiceConnectionC3340eN) obj;
                Cp0 cp1 = (Cp0) serviceConnectionC3340eN2.b;
                IBinder iBinder = (IBinder) obj2;
                int i2 = lp0.f4670a;
                if (iBinder == null) {
                    ip0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    ip0Var = iInterfaceQueryLocalInterface instanceof pp0 ? (pp0) iInterfaceQueryLocalInterface : new ip0(iBinder);
                }
                cp1.m = ip0Var;
                Object obj3 = serviceConnectionC3340eN2.b;
                Cp0 cp2 = (Cp0) obj3;
                cp2.b.c("linkToDeath", new Object[0]);
                try {
                    cp2.m.asBinder().linkToDeath(cp2.j, 0);
                    break;
                } catch (RemoteException unused) {
                    Object[] objArr = new Object[0];
                    boolean zIsLoggable = Log.isLoggable("PlayCore", 6);
                    B4 b5 = cp2.b;
                    if (zIsLoggable) {
                        B4.d(b5.f2852a, "linkToDeath failed", objArr);
                    } else {
                        b5.getClass();
                    }
                }
                Cp0 cp3 = (Cp0) obj3;
                cp3.g = false;
                Iterator it = cp3.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((Cp0) obj3).d.clear();
                break;
            default:
                try {
                    ?? r3 = ((up0) obj).f5105a.m;
                    String str = ((up0) obj).b;
                    Bundle bundleA = wp0.a();
                    up0 up0Var = (up0) obj;
                    String str2 = up0Var.b;
                    r3.a(str, bundleA, new com.google.android.play.core.review.c(up0Var, (TaskCompletionSource) obj2));
                } catch (RemoteException e) {
                    B4 b6 = up0.c;
                    Object[] objArr2 = {((up0) obj).b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        B4.d(b6.f2852a, "error requesting in-app review for %s", objArr2);
                    } else {
                        b6.getClass();
                    }
                    ((TaskCompletionSource) obj2).trySetException(new RuntimeException(e));
                    return;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp0(Object obj, TaskCompletionSource taskCompletionSource, Object obj2, int i) {
        super(taskCompletionSource);
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }
}
