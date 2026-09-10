package h9;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import b0.q0;
import b2.g0;
import b2.h0;
import b2.j0;
import com.google.android.gms.internal.measurement.ce;
import com.google.android.gms.internal.measurement.dg;
import com.google.android.gms.internal.measurement.hc;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.tg;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.tools.SameMD5;
import i1.e0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import ta.c0;
import ta.k0;
import ta.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static k f42283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HandlerThread f42284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Handler f42285g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f42288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f42289d;

    public k(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f42286a = i10;
        this.f42289d = str;
        this.f42287b = arrayList;
        this.f42288c = arrayList2;
    }

    public static synchronized k e(Context context) {
        try {
            if (f42283e == null) {
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new q9.a("MessengerIpcClient")));
                k kVar = new k();
                kVar.f42289d = new i(kVar);
                kVar.f42286a = 1;
                kVar.f42288c = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                kVar.f42287b = context.getApplicationContext();
                f42283e = kVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f42283e;
    }

    public void a(b0.g gVar) {
        IconCompat iconCompatA = gVar.a();
        int i10 = gVar.f5115f;
        boolean z10 = gVar.f5113d;
        Bundle bundle = gVar.f5110a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.g() : null, gVar.f5118i, gVar.f5119j);
        q0[] q0VarArr = gVar.f5112c;
        if (q0VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[q0VarArr.length];
            for (int i11 = 0; i11 < q0VarArr.length; i11++) {
                q0 q0Var = q0VarArr[i11];
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(q0Var.f5192a).setLabel(q0Var.f5193b).setChoices(q0Var.f5194c).setAllowFreeFormInput(q0Var.f5195d).addExtras(q0Var.f5197f);
                Set set = q0Var.f5198g;
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        builderAddExtras.setAllowDataType((String) it.next(), true);
                    }
                }
                builderAddExtras.setEditChoicesBeforeSending(q0Var.f5196e);
                remoteInputArr[i11] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
        int i12 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z10);
        bundle2.putInt("android.support.action.semanticAction", i10);
        builder.setSemanticAction(i10);
        builder.setContextual(gVar.f5116g);
        if (i12 >= 31) {
            b0.h.b(builder, gVar.f5120k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", gVar.f5114e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.f42287b).addAction(builder.build());
    }

    public String b(h0 h0Var, Uri uri, int i10) throws e0 {
        String str = (String) this.f42289d;
        String str2 = (String) this.f42287b;
        String str3 = (String) this.f42288c;
        int i11 = this.f42286a;
        if (i11 == 1) {
            String strEncodeToString = Base64.encodeToString((h0Var.f5291a + ":" + h0Var.f5292b).getBytes(g0.f5278g), 0);
            String str4 = l1.y.f44830a;
            Locale locale = Locale.US;
            return defpackage.e.n("Basic ", strEncodeToString);
        }
        if (i11 != 2) {
            throw new e0(null, new UnsupportedOperationException(), false, 4);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            String strG = j0.g(i10);
            String str5 = h0Var.f5291a + ":" + str2 + ":" + h0Var.f5292b;
            Charset charset = g0.f5278g;
            String strY = l1.y.Y(messageDigest.digest((l1.y.Y(messageDigest.digest(str5.getBytes(charset))) + ":" + str3 + ":" + l1.y.Y(messageDigest.digest((strG + ":" + uri).getBytes(charset)))).getBytes(charset)));
            if (str.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", h0Var.f5291a, str2, str3, uri, strY);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", h0Var.f5291a, str2, str3, uri, strY, str);
        } catch (NoSuchAlgorithmException e10) {
            throw new e0(null, e10, false, 4);
        }
    }

    public int c() {
        int i10 = this.f42286a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return com.ironsource.mediationsdk.metadata.a.f29616n;
    }

    @Override // ta.y
    public ListenableFuture call() {
        ce ceVar = (ce) this.f42287b;
        l0 l0Var = (l0) this.f42288c;
        int i10 = this.f42286a;
        ArrayList arrayList = (ArrayList) this.f42289d;
        ListenableFuture listenableFutureD = k0.d(l0Var);
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) k0.b((Future) arrayList.get(i11))).booleanValue()) {
                if (((List) ceVar.f23361b).get(i11) != null) {
                    throw new ClassCastException();
                }
                hc hcVar = new hc(1);
                int i12 = tg.f23998a;
                listenableFutureD = k0.g(listenableFutureD, new ce(4, dg.a(), hcVar), c0.f50592a);
            }
        }
        return listenableFutureD;
    }

    public void d() {
        HandlerThread handlerThread;
        synchronized (this.f42287b) {
            try {
                go.k.t(this.f42286a > 0);
                int i10 = this.f42286a - 1;
                this.f42286a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.f42289d) != null) {
                    handlerThread.quit();
                    this.f42289d = null;
                    this.f42288c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(Throwable th2) {
        com.android.billingclient.api.j jVar = (com.android.billingclient.api.j) this.f42289d;
        if (th2 instanceof TimeoutException) {
            jVar.N(28, com.android.billingclient.api.k.F, j3.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            jVar.N(28, com.android.billingclient.api.k.F, j3.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f42288c).run();
    }

    public synchronized Task g(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!((i) this.f42289d).a(jVar)) {
                i iVar = new i(this);
                this.f42289d = iVar;
                iVar.a(jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar.f42279b.getTask();
    }

    public k(int i10, String str, String str2, String str3) {
        this.f42286a = i10;
        this.f42287b = str;
        this.f42288c = str2;
        this.f42289d = str3;
    }

    public k(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f42287b = str;
        this.f42286a = i11;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f42288c = listUnmodifiableList;
        this.f42289d = bArr;
    }

    public k(int i10, ak.k kVar, en.a aVar, fn.e eVar) {
        this.f42287b = eVar;
        this.f42286a = i10;
        this.f42288c = aVar;
        this.f42289d = kVar;
    }

    public k(int i10) {
        switch (i10) {
            case 6:
                this.f42287b = new Object();
                this.f42288c = null;
                this.f42289d = null;
                this.f42286a = 0;
                break;
            default:
                this.f42287b = new SparseIntArray[9];
                this.f42288c = new ArrayList();
                this.f42289d = new b0.d(this);
                this.f42286a = 1;
                break;
        }
    }
}
