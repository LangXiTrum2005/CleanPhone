package k9;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final i9.c[] E = new i9.c[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    @NonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public ConnectionResult A;
    public boolean B;
    public volatile k0 C;
    public final AtomicInteger D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f44409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g4.g f44410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f44411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f44412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f44413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i9.e f44414k;
    public final f0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f44415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f44416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y f44417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f44418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IInterface f44419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f44420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h0 f44421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f44423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f44424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f44425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f44426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile String f44427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile r9.a f44428z;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, Looper looper, int i10, b bVar, c cVar) {
        o0 o0VarA = o0.a(context);
        i9.e eVar = i9.e.f42929b;
        c0.h(bVar);
        c0.h(cVar);
        this(context, looper, o0VarA, eVar, i10, bVar, cVar, null);
    }

    public abstract IInterface a(IBinder iBinder);

    public Executor b() {
        return null;
    }

    public Bundle c() {
        return new Bundle();
    }

    public void checkAvailabilityAndConnect() {
        int iC = this.f44414k.c(this.f44411h, getMinApkVersion());
        if (iC == 0) {
            connect(new m(this));
            return;
        }
        i(1, null);
        this.f44418p = new m(this);
        int i10 = this.D.get();
        f0 f0Var = this.l;
        f0Var.sendMessage(f0Var.obtainMessage(3, i10, iC, null));
    }

    public void connect(@NonNull d dVar) {
        c0.i(dVar, "Connection progress callbacks cannot be null.");
        this.f44418p = dVar;
        i(2, null);
    }

    public Set d() {
        return Collections.EMPTY_SET;
    }

    public void disconnect() {
        this.D.incrementAndGet();
        ArrayList arrayList = this.f44420r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    x xVar = (x) arrayList.get(i10);
                    synchronized (xVar) {
                        xVar.f44526a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f44416n) {
            this.f44417o = null;
        }
        i(1, null);
    }

    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i10;
        IInterface iInterface;
        y yVar;
        synchronized (this.f44415m) {
            i10 = this.f44422t;
            iInterface = this.f44419q;
        }
        synchronized (this.f44416n) {
            yVar = this.f44417o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) e()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (yVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.f44532a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f44406c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f44406c;
            String str2 = simpleDateFormat.format(new Date(j10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(str2).length());
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(str2);
            printWriterAppend.println(sb2.toString());
        }
        if (this.f44405b > r9) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f44404a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f44405b;
            String str3 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(str3).length());
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(str3);
            printWriterAppend2.println(sb3.toString());
        }
        if (this.f44408e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.internal.auth.i.y(this.f44407d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f44408e;
            String str4 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(str4).length());
            sb4.append(j12);
            sb4.append(" ");
            sb4.append(str4);
            printWriterAppend3.println(sb4.toString());
        }
    }

    public abstract String e();

    public abstract String f();

    public boolean g() {
        return getMinApkVersion() >= 211700000;
    }

    @Nullable
    public Account getAccount() {
        return null;
    }

    @NonNull
    public i9.c[] getApiFeatures() {
        return E;
    }

    @Nullable
    public r9.a getAttributionSourceWrapper() {
        return this.f44428z;
    }

    @Nullable
    public final i9.c[] getAvailableFeatures() {
        k0 k0Var = this.C;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f44468b;
    }

    @Nullable
    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.f44411h;
    }

    @NonNull
    public String getEndpointPackageName() {
        if (!isConnected() || this.f44410g == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public int getGCoreServiceId() {
        return this.f44425w;
    }

    @Nullable
    public String getLastDisconnectMessage() {
        return this.f44409f;
    }

    @NonNull
    public final Looper getLooper() {
        return this.f44412i;
    }

    public int getMinApkVersion() {
        return i9.e.f42928a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getRemoteService(@Nullable j jVar, @NonNull Set<Scope> set) {
        AttributionSource attributionSource;
        Bundle bundleC = c();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f44428z == null || (attributionSource = this.f44428z.f49510a) == null || attributionSource.getAttributionTag() == null) ? this.f44427y : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i10 = this.f44425w;
        int i11 = i9.e.f42928a;
        Scope[] scopeArr = h.f44438o;
        Bundle bundle = new Bundle();
        i9.c[] cVarArr = h.f44439p;
        h hVar = new h(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        hVar.f44443d = this.f44411h.getPackageName();
        hVar.f44446g = bundleC;
        if (set != null) {
            hVar.f44445f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            hVar.f44447h = account;
            if (jVar != 0) {
                hVar.f44444e = ((com.google.android.gms.internal.auth.a) jVar).f22789b;
            }
        } else if (requiresAccount()) {
            hVar.f44447h = getAccount();
        }
        hVar.f44448i = E;
        hVar.f44449j = getApiFeatures();
        if (usesClientTelemetry()) {
            hVar.f44451m = true;
        }
        try {
            try {
                synchronized (this.f44416n) {
                    try {
                        y yVar = this.f44417o;
                        if (yVar != null) {
                            yVar.q(new g0(this, this.D.get()), hVar);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (DeadObjectException e10) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
                triggerConnectionSuspended(3);
            } catch (SecurityException e11) {
                throw e11;
            }
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            int i12 = this.D.get();
            i0 i0Var = new i0(this, 8, null, null);
            f0 f0Var = this.l;
            f0Var.sendMessage(f0Var.obtainMessage(1, i12, -1, i0Var));
        }
    }

    @NonNull
    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.f44415m) {
            try {
                if (this.f44422t == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f44419q;
                c0.i(iInterface, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    @Nullable
    public IBinder getServiceBrokerBinder() {
        synchronized (this.f44416n) {
            try {
                y yVar = this.f44417o;
                if (yVar == null) {
                    return null;
                }
                return yVar.f44532a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Nullable
    public g getTelemetryConfiguration() {
        k0 k0Var = this.C;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f44470d;
    }

    public final /* synthetic */ boolean h(int i10, int i11, IInterface iInterface) {
        synchronized (this.f44415m) {
            try {
                if (this.f44422t != i10) {
                    return false;
                }
                i(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean hasConnectionInfo() {
        return this.C != null;
    }

    public final void i(int i10, IInterface iInterface) {
        g4.g gVar;
        c0.b((i10 == 4) == (iInterface != null));
        synchronized (this.f44415m) {
            try {
                this.f44422t = i10;
                this.f44419q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    h0 h0Var = this.f44421s;
                    if (h0Var != null) {
                        o0 o0Var = this.f44413j;
                        String str = this.f44410g.f41504a;
                        c0.h(str);
                        this.f44410g.getClass();
                        if (this.f44426x == null) {
                            this.f44411h.getClass();
                        }
                        boolean z10 = this.f44410g.f41505b;
                        o0Var.getClass();
                        o0Var.c(new l0(str, z10), h0Var);
                        this.f44421s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    h0 h0Var2 = this.f44421s;
                    if (h0Var2 != null && (gVar = this.f44410g) != null) {
                        String str2 = gVar.f41504a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        o0 o0Var2 = this.f44413j;
                        String str3 = this.f44410g.f41504a;
                        c0.h(str3);
                        this.f44410g.getClass();
                        if (this.f44426x == null) {
                            this.f44411h.getClass();
                        }
                        boolean z11 = this.f44410g.f41505b;
                        o0Var2.getClass();
                        o0Var2.c(new l0(str3, z11), h0Var2);
                        this.D.incrementAndGet();
                    }
                    h0 h0Var3 = new h0(this, this.D.get());
                    this.f44421s = h0Var3;
                    String strF = f();
                    boolean zG = g();
                    this.f44410g = new g4.g(strF, zG);
                    if (zG && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f44410g.f41504a)));
                    }
                    o0 o0Var3 = this.f44413j;
                    String str4 = this.f44410g.f41504a;
                    c0.h(str4);
                    this.f44410g.getClass();
                    String name = this.f44426x;
                    if (name == null) {
                        name = this.f44411h.getClass().getName();
                    }
                    ConnectionResult connectionResultB = o0Var3.b(new l0(str4, this.f44410g.f41505b), h0Var3, name, b());
                    if (!connectionResultB.b()) {
                        String str5 = this.f44410g.f41504a;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str5);
                        sb3.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb3.toString());
                        int i11 = connectionResultB.f11641b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (connectionResultB.f11642c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, connectionResultB.f11642c);
                        }
                        int i12 = this.D.get();
                        j0 j0Var = new j0(this, i11, bundle);
                        f0 f0Var = this.l;
                        f0Var.sendMessage(f0Var.obtainMessage(7, i12, -1, j0Var));
                    }
                } else if (i10 == 4) {
                    c0.h(iInterface);
                    this.f44406c = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.f44415m) {
            z10 = this.f44422t == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.f44415m) {
            int i10 = this.f44422t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onUserSignOut(@NonNull e eVar) {
        s4.i iVar = (s4.i) eVar;
        iVar.getClass();
        ((com.google.android.gms.common.api.internal.r) iVar.f50111a).f11762m.f11705n.post(new androidx.lifecycle.a0(iVar));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(@NonNull r9.a aVar) {
        this.f44428z = aVar;
    }

    public void setAttributionTag(@NonNull String str) {
        this.f44427y = str;
    }

    public void triggerConnectionSuspended(int i10) {
        int i11 = this.D.get();
        f0 f0Var = this.l;
        f0Var.sendMessage(f0Var.obtainMessage(6, i11, i10));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public f(Context context, Looper looper, o0 o0Var, i9.e eVar, int i10, b bVar, c cVar, String str) {
        this.f44409f = null;
        this.f44415m = new Object();
        this.f44416n = new Object();
        this.f44420r = new ArrayList();
        this.f44422t = 1;
        this.A = null;
        this.B = false;
        this.C = null;
        this.D = new AtomicInteger(0);
        c0.i(context, "Context must not be null");
        this.f44411h = context;
        c0.i(looper, "Looper must not be null");
        this.f44412i = looper;
        c0.i(o0Var, "Supervisor must not be null");
        this.f44413j = o0Var;
        c0.i(eVar, "API availability must not be null");
        this.f44414k = eVar;
        this.l = new f0(this, looper);
        this.f44425w = i10;
        this.f44423u = bVar;
        this.f44424v = cVar;
        this.f44426x = str;
    }

    public void disconnect(@NonNull String str) {
        this.f44409f = str;
        disconnect();
    }
}
