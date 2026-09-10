package h9;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import eb.d0;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f42269b;

    public /* synthetic */ g(i iVar, int i10) {
        this.f42268a = i10;
        this.f42269b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42268a) {
            case 0:
                i iVar = this.f42269b;
                synchronized (iVar) {
                    if (iVar.f42272a == 1) {
                        iVar.b("Timed out while binding");
                    }
                    break;
                }
                return;
            case 1:
                break;
            default:
                this.f42269b.b("Service disconnected");
                return;
        }
        while (true) {
            i iVar2 = this.f42269b;
            synchronized (iVar2) {
                try {
                    if (iVar2.f42272a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = iVar2.f42275d;
                    if (arrayDeque.isEmpty()) {
                        iVar2.d();
                        return;
                    }
                    j jVar = (j) arrayDeque.poll();
                    SparseArray sparseArray = iVar2.f42276e;
                    int i10 = jVar.f42278a;
                    sparseArray.put(i10, jVar);
                    ((ScheduledExecutorService) iVar2.f42277f.f42288c).schedule(new i0(24, iVar2, jVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                    }
                    k kVar = iVar2.f42277f;
                    Messenger messenger = iVar2.f42273b;
                    int i11 = jVar.f42280c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i11;
                    messageObtain.arg1 = i10;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.a());
                    bundle.putString("pkg", ((Context) kVar.f42287b).getPackageName());
                    bundle.putBundle("data", jVar.f42281d);
                    messageObtain.setData(bundle);
                    try {
                        d0 d0Var = iVar2.f42274c;
                        Messenger messenger2 = (Messenger) d0Var.f39976b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            e eVar = (e) d0Var.f39977c;
                            if (eVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            eVar.f42265a.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        iVar2.b(e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
