package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class zb {
    public static final Object f;
    public static zb g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f41776b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41777c = new HashMap();
    public final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wb f41778e;

    static {
        int i2 = q0.f41381a;
        "startapp.".concat("zb");
        f = new Object();
    }

    public zb(Context context) {
        this.f41775a = context;
        this.f41778e = new wb(this, context.getMainLooper());
    }

    public static zb a(Context context) {
        zb zbVar;
        synchronized (f) {
            try {
                if (g == null) {
                    Context contextA = x0.a(context);
                    if (contextA != null) {
                        context = contextA;
                    }
                    g = new zb(context);
                }
                zbVar = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zbVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f41776b) {
            try {
                yb ybVar = new yb(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f41776b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f41776b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.f41777c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f41777c.put(action, arrayList2);
                    }
                    arrayList2.add(ybVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f41776b) {
            try {
                ArrayList arrayList = (ArrayList) this.f41776b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i2);
                    for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                        String action = intentFilter.getAction(i3);
                        ArrayList arrayList2 = (ArrayList) this.f41777c.get(action);
                        if (arrayList2 != null) {
                            int i4 = 0;
                            while (i4 < arrayList2.size()) {
                                if (((yb) arrayList2.get(i4)).f41707b == broadcastReceiver) {
                                    arrayList2.remove(i4);
                                    i4--;
                                }
                                i4++;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f41777c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Intent intent) {
        synchronized (this.f41776b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f41775a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                ArrayList arrayList = (ArrayList) this.f41777c.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        yb ybVar = (yb) arrayList.get(i2);
                        if (!ybVar.f41708c && ybVar.f41706a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(ybVar);
                            ybVar.f41708c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((yb) arrayList2.get(i3)).f41708c = false;
                        }
                        this.d.add(new xb(intent, arrayList2));
                        if (!this.f41778e.hasMessages(1)) {
                            this.f41778e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
