package com.smartdigimkt.h1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.smartdigimkt.x.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f35626b;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.f35625a = "b";
        this.f35626b = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i2 = message.what;
        Object obj = message.obj;
        CopyOnWriteArrayList<d> copyOnWriteArrayListG = this.f35626b.g();
        List<d> listF = this.f35626b.f();
        com.smartdigimkt.g1.d dVarL = this.f35626b.l();
        boolean zQ = this.f35626b.q();
        String strJ = this.f35626b.j();
        String strO = this.f35626b.o();
        a.d dVarI = this.f35626b.i();
        com.smartdigimkt.e3.a aVarN = this.f35626b.n();
        boolean zP = this.f35626b.p();
        this.f35626b.r();
        com.smartdigimkt.f3.d dVarM = this.f35626b.m();
        if (i2 == 8) {
            if (copyOnWriteArrayListG == null || copyOnWriteArrayListG.size() <= 0) {
                return;
            }
            boolean z2 = (listF == null || listF.size() <= 0) ? false : !TextUtils.isEmpty(listF.get(0).g0());
            int iS1 = copyOnWriteArrayListG.get(0).s1();
            if (dVarL != null && dVarL.a(copyOnWriteArrayListG, z2, iS1)) {
                if (dVarI == null || !zQ) {
                    return;
                }
                dVarI.c(strJ, strO);
                return;
            }
            if (dVarI == null || !zQ) {
                return;
            }
            com.smartdigimkt.a3.a.a(strO);
            com.smartdigimkt.a3.a.b();
            dVarI.a("load timeout");
            return;
        }
        if (i2 == 9) {
            if (aVarN == null || !zQ) {
                return;
            }
            if (zP) {
                try {
                    this.f35626b.a();
                } catch (Throwable th) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        th.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            aVarN.onVideoLoadSuccess();
            return;
        }
        if (i2 != 1001002) {
            switch (i2) {
                case 16:
                case 18:
                    if (aVarN != null && zQ) {
                        String string = obj instanceof String ? obj.toString() : "";
                        com.smartdigimkt.a3.a.a(strO);
                        com.smartdigimkt.a3.a.b();
                        if (zP) {
                            try {
                                this.f35626b.a();
                            } catch (Throwable th2) {
                                if (com.smartdigimkt.b.b.f33800a) {
                                    th2.printStackTrace();
                                    return;
                                }
                                return;
                            }
                        }
                        aVarN.onVideoLoadFail(string);
                        break;
                    }
                    break;
                case 17:
                    if (aVarN != null && zQ) {
                        if (zP) {
                            try {
                                this.f35626b.a();
                            } catch (Throwable th3) {
                                if (com.smartdigimkt.b.b.f33800a) {
                                    th3.printStackTrace();
                                    return;
                                }
                                return;
                            }
                        }
                        aVarN.onLoadSuccess();
                        break;
                    }
                    break;
            }
            return;
        }
        if (dVarM != null) {
            dVarM.w();
        }
        if (dVarL != null) {
            if (dVarL.isReady()) {
                if (dVarI != null) {
                    try {
                        CopyOnWriteArrayList<d> copyOnWriteArrayListI = dVarL.i();
                        if (copyOnWriteArrayListI != null) {
                            copyOnWriteArrayListI.size();
                        }
                    } catch (Throwable th4) {
                        th4.getMessage();
                    }
                    dVarI.d(strJ, strO);
                    return;
                }
                return;
            }
            if (!dVarL.g(false)) {
                if (dVarL.g(true)) {
                    if (!dVarL.isReady()) {
                        dVarL.h(true);
                        return;
                    }
                    if (dVarI != null) {
                        dVarL.f(true);
                        try {
                            CopyOnWriteArrayList<d> copyOnWriteArrayListI2 = dVarL.i();
                            if (copyOnWriteArrayListI2 != null) {
                                copyOnWriteArrayListI2.size();
                            }
                        } catch (Throwable th5) {
                            th5.getMessage();
                        }
                        dVarI.d(strJ, strO);
                        return;
                    }
                    return;
                }
                return;
            }
            if (dVarL.isReady()) {
                if (dVarI != null) {
                    dVarL.f(false);
                    try {
                        CopyOnWriteArrayList<d> copyOnWriteArrayListI3 = dVarL.i();
                        if (copyOnWriteArrayListI3 != null) {
                            copyOnWriteArrayListI3.size();
                        }
                    } catch (Throwable th6) {
                        th6.getMessage();
                    }
                    dVarI.d(strJ, strO);
                    return;
                }
                return;
            }
            dVarL.h(false);
            if (dVarL.g(true)) {
                if (!dVarL.isReady()) {
                    dVarL.h(true);
                    return;
                }
                if (dVarI != null) {
                    dVarL.f(true);
                    try {
                        CopyOnWriteArrayList<d> copyOnWriteArrayListI4 = dVarL.i();
                        if (copyOnWriteArrayListI4 != null) {
                            copyOnWriteArrayListI4.size();
                        }
                    } catch (Throwable th7) {
                        th7.getMessage();
                    }
                    dVarI.d(strJ, strO);
                }
            }
        }
    }
}
