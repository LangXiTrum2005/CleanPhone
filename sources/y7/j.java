package y7;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oa.k0;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.a f54250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tb.n f54251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Messenger f54253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f54256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f54257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f54259k;

    public j(Context context, n request) {
        kotlin.jvm.internal.n.f(request, "request");
        String applicationId = request.f54268d;
        String strValueOf = String.valueOf(request.f54269e);
        String str = request.f54282s;
        kotlin.jvm.internal.n.f(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f54249a = applicationContext != null ? applicationContext : context;
        this.f54254f = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f54255g = 65537;
        this.f54256h = applicationId;
        this.f54257i = strValueOf;
        this.f54258j = 20121101;
        this.f54259k = str;
        this.f54250b = new androidx.localbroadcastmanager.content.a(this);
    }

    public final void a(Bundle bundle) {
        if (this.f54252d) {
            this.f54252d = false;
            tb.n nVar = this.f54251c;
            if (nVar != null) {
                k kVar = (k) nVar.f50707b;
                n request = (n) nVar.f50708c;
                kotlin.jvm.internal.n.f(request, "$request");
                j jVar = kVar.f54260c;
                if (jVar != null) {
                    jVar.f54251c = null;
                }
                kVar.f54260c = null;
                k0 k0Var = kVar.d().f54298e;
                if (k0Var != null) {
                    View view = ((q) k0Var.f47269b).f54309e;
                    if (view == null) {
                        kotlin.jvm.internal.n.l("progressBar");
                        throw null;
                    }
                    view.setVisibility(8);
                }
                if (bundle != null) {
                    List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = xj.v.f53866a;
                    }
                    Set<String> set = request.f54266b;
                    if (set == null) {
                        set = xj.x.f53868a;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.length() == 0)) {
                        kVar.d().j();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            kVar.l(bundle, request);
                            return;
                        }
                        k0 k0Var2 = kVar.d().f54298e;
                        if (k0Var2 != null) {
                            View view2 = ((q) k0Var2.f47269b).f54309e;
                            if (view2 == null) {
                                kotlin.jvm.internal.n.l("progressBar");
                                throw null;
                            }
                            view2.setVisibility(0);
                        }
                        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        e0.o(string3, new qd.i(bundle, kVar, request, 15));
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        kVar.a("new_permissions", TextUtils.join(",", hashSet));
                    }
                    request.f54266b = hashSet;
                }
                kVar.d().j();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(service, "service");
        this.f54253e = new Messenger(service);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f54256h);
        String str = this.f54259k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.f54257i;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f54254f);
        messageObtain.arg1 = this.f54258j;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f54250b);
        try {
            Messenger messenger = this.f54253e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.n.f(name, "name");
        this.f54253e = null;
        try {
            this.f54249a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
