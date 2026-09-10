package k9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f44490a;

    public /* synthetic */ n0(o0 o0Var) {
        this.f44490a = o0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            o0 o0Var = this.f44490a;
            synchronized (o0Var.f44496a) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) o0Var.f44496a.get(l0Var);
                    if (m0Var != null && m0Var.f44478a.isEmpty()) {
                        if (m0Var.f44480c) {
                            l0 l0Var2 = m0Var.f44482e;
                            o0 o0Var2 = m0Var.f44484g;
                            o0Var2.f44498c.removeMessages(1, l0Var2);
                            o0Var2.f44499d.c(o0Var2.f44497b, m0Var);
                            m0Var.f44480c = false;
                            m0Var.f44479b = 2;
                        }
                        o0Var.f44496a.remove(l0Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        o0 o0Var3 = this.f44490a;
        synchronized (o0Var3.f44496a) {
            try {
                l0 l0Var3 = (l0) message.obj;
                m0 m0Var2 = (m0) o0Var3.f44496a.get(l0Var3);
                if (m0Var2 != null && m0Var2.f44479b == 3) {
                    String strValueOf = String.valueOf(l0Var3);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = m0Var2.f44483f;
                    if (componentName == null) {
                        componentName = l0Var3.f44473c;
                    }
                    if (componentName == null) {
                        String str = l0Var3.f44472b;
                        c0.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    m0Var2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
