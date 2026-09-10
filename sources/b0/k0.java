package b0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5142c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f5143d = new HashSet();

    public k0(Context context) {
        this.f5140a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f5141b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(j0 j0Var) {
        boolean z10;
        ArrayDeque arrayDeque = j0Var.f5134d;
        ComponentName componentName = j0Var.f5131a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (j0Var.f5132b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f5140a;
            boolean zBindService = context.bindService(component, this, 33);
            j0Var.f5132b = zBindService;
            if (zBindService) {
                j0Var.f5135e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = j0Var.f5132b;
        }
        if (!z10 || j0Var.f5133c == null) {
            b(j0Var);
            return;
        }
        while (true) {
            h0 h0Var = (h0) arrayDeque.peek();
            if (h0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + h0Var);
                }
                h0Var.a(j0Var.f5133c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e10) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(j0Var);
    }

    public final void b(j0 j0Var) {
        ComponentName componentName = j0Var.f5131a;
        ArrayDeque arrayDeque = j0Var.f5134d;
        Handler handler = this.f5141b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = j0Var.f5135e;
        int i11 = i10 + 1;
        j0Var.f5135e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + j0Var.f5135e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        d.c cVar = null;
        if (i10 == 0) {
            h0 h0Var = (h0) message.obj;
            String string = Settings.Secure.getString(this.f5140a.getContentResolver(), "enabled_notification_listeners");
            synchronized (l0.f5146c) {
                if (string != null) {
                    try {
                        if (!string.equals(l0.f5147d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            l0.f5148e = hashSet2;
                            l0.f5147d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = l0.f5148e;
            }
            if (!hashSet.equals(this.f5143d)) {
                this.f5143d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f5140a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f5142c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f5142c.put(componentName2, new j0(componentName2));
                    }
                }
                Iterator it = this.f5142c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        j0 j0Var = (j0) entry.getValue();
                        if (j0Var.f5132b) {
                            this.f5140a.unbindService(this);
                            j0Var.f5132b = false;
                        }
                        j0Var.f5133c = null;
                        it.remove();
                    }
                }
            }
            for (j0 j0Var2 : this.f5142c.values()) {
                j0Var2.f5134d.add(h0Var);
                a(j0Var2);
            }
        } else if (i10 == 1) {
            i0 i0Var = (i0) message.obj;
            ComponentName componentName3 = i0Var.f5129a;
            IBinder iBinder = i0Var.f5130b;
            j0 j0Var3 = (j0) this.f5142c.get(componentName3);
            if (j0Var3 != null) {
                int i11 = d.b.f38608a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.c.f38609a9);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d.c)) {
                        d.a aVar = new d.a();
                        aVar.f38607a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (d.c) iInterfaceQueryLocalInterface;
                    }
                }
                j0Var3.f5133c = cVar;
                j0Var3.f5135e = 0;
                a(j0Var3);
                return true;
            }
        } else if (i10 == 2) {
            j0 j0Var4 = (j0) this.f5142c.get((ComponentName) message.obj);
            if (j0Var4 != null) {
                if (j0Var4.f5132b) {
                    this.f5140a.unbindService(this);
                    j0Var4.f5132b = false;
                }
                j0Var4.f5133c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            j0 j0Var5 = (j0) this.f5142c.get((ComponentName) message.obj);
            if (j0Var5 != null) {
                a(j0Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f5141b.obtainMessage(1, new i0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f5141b.obtainMessage(2, componentName).sendToTarget();
    }
}
