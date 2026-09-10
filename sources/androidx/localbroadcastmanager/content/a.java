package androidx.localbroadcastmanager.content;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.f22;
import com.google.android.gms.internal.ads.h22;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.n;
import y1.c;
import y1.d;
import y7.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4627b;

    /* JADX WARN: Code duplicated, block: B:159:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:183:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f22 f22Var;
        ArrayDeque arrayDeque;
        c cVar;
        ArrayDeque arrayDeque2;
        switch (this.f4626a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                } else {
                    ((LocalBroadcastManager) this.f4627b).executePendingBroadcasts();
                    return;
                }
            case 1:
                h22 h22Var = (h22) this.f4627b;
                h22Var.getClass();
                int i10 = message.what;
                f22 f22Var2 = null;
                if (i10 != 1) {
                    if (i10 == 2) {
                        f22Var = (f22) message.obj;
                        int i11 = f22Var.f14190a;
                        MediaCodec.CryptoInfo cryptoInfo = f22Var.f14192c;
                        long j10 = f22Var.f14193d;
                        int i12 = f22Var.f14194e;
                        try {
                            synchronized (h22.f15079h) {
                                try {
                                    h22Var.f15080a.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                        } catch (RuntimeException e10) {
                            AtomicReference atomicReference = h22Var.f15083d;
                            while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i10 == 3) {
                        h22Var.f15084e.a();
                    } else if (i10 != 4) {
                        AtomicReference atomicReference2 = h22Var.f15083d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        try {
                            h22Var.f15080a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e11) {
                            AtomicReference atomicReference3 = h22Var.f15083d;
                            while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                            }
                        }
                    }
                    if (f22Var2 != null) {
                        arrayDeque = h22.f15078g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(f22Var2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                f22Var = (f22) message.obj;
                try {
                    h22Var.f15080a.queueInputBuffer(f22Var.f14190a, 0, f22Var.f14191b, f22Var.f14193d, f22Var.f14194e);
                    break;
                } catch (RuntimeException e12) {
                    AtomicReference atomicReference4 = h22Var.f15083d;
                    while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                    }
                }
                f22Var2 = f22Var;
                if (f22Var2 != null) {
                    arrayDeque = h22.f15078g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(f22Var2);
                        return;
                    }
                }
                return;
            case 2:
                int i13 = message.what;
                if (i13 == -3 || i13 == -2 || i13 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f4627b).get(), message.what);
                    return;
                } else {
                    if (i13 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 3:
                if (v7.a.b(this)) {
                    return;
                }
                try {
                    if (v7.a.b(this)) {
                        return;
                    }
                    try {
                        n.f(message, "message");
                        j jVar = (j) this.f4627b;
                        if (message.what == jVar.f54255g) {
                            Bundle data = message.getData();
                            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                                jVar.a(null);
                            } else {
                                jVar.a(data);
                            }
                            try {
                                jVar.f54249a.unbindService(jVar);
                                return;
                            } catch (IllegalArgumentException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        v7.a.a(this, th3);
                        return;
                    }
                    v7.a.a(this, th);
                    return;
                } catch (Throwable th4) {
                    v7.a.a(this, th4);
                    return;
                }
            default:
                d dVar = (d) this.f4627b;
                int i14 = message.what;
                c cVar2 = null;
                if (i14 != 1) {
                    if (i14 == 2) {
                        cVar = (c) message.obj;
                        int i15 = cVar.f54105a;
                        MediaCodec.CryptoInfo cryptoInfo2 = cVar.f54107c;
                        long j11 = cVar.f54108d;
                        int i16 = cVar.f54109e;
                        try {
                            synchronized (d.f54111h) {
                                try {
                                    dVar.f54112a.queueSecureInputBuffer(i15, 0, cryptoInfo2, j11, i16);
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                                break;
                            }
                        } catch (RuntimeException e13) {
                            AtomicReference atomicReference5 = dVar.f54115d;
                            while (!atomicReference5.compareAndSet(null, e13) && atomicReference5.get() == null) {
                            }
                        }
                    } else if (i14 == 3) {
                        dVar.f54116e.c();
                    } else if (i14 != 4) {
                        AtomicReference atomicReference6 = dVar.f54115d;
                        IllegalStateException illegalStateException2 = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference6.compareAndSet(null, illegalStateException2) && atomicReference6.get() == null) {
                        }
                    } else {
                        try {
                            dVar.f54112a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e14) {
                            AtomicReference atomicReference7 = dVar.f54115d;
                            while (!atomicReference7.compareAndSet(null, e14) && atomicReference7.get() == null) {
                            }
                        }
                    }
                    if (cVar2 != null) {
                        arrayDeque2 = d.f54110g;
                        synchronized (arrayDeque2) {
                            arrayDeque2.add(cVar2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                cVar = (c) message.obj;
                try {
                    dVar.f54112a.queueInputBuffer(cVar.f54105a, 0, cVar.f54106b, cVar.f54108d, cVar.f54109e);
                    break;
                } catch (RuntimeException e15) {
                    AtomicReference atomicReference8 = dVar.f54115d;
                    while (!atomicReference8.compareAndSet(null, e15) && atomicReference8.get() == null) {
                    }
                }
                cVar2 = cVar;
                if (cVar2 != null) {
                    arrayDeque2 = d.f54110g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(cVar2);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Looper looper, int i10) {
        super(looper);
        this.f4626a = i10;
        this.f4627b = obj;
    }

    public a(j jVar) {
        this.f4626a = 3;
        this.f4627b = jVar;
    }
}
