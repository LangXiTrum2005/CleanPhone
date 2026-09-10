package com.smartdigimkt.t6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final String f = "InnerBroadcastManager";
    private static final boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f38740h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f38741i = new Object();
    private static a j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f38743b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f38744c = new HashMap<>();
    private final ArrayList<b> d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f38745e;

    /* JADX INFO: renamed from: com.smartdigimkt.t6.a$a, reason: collision with other inner class name */
    public class HandlerC0623a extends Handler {
        public HandlerC0623a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f38747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<c> f38748b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f38747a = intent;
            this.f38748b = arrayList;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f38749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f38750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f38751c;
        boolean d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f38749a = intentFilter;
            this.f38750b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f38750b);
            sb.append(" filter=");
            sb.append(this.f38749a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f38742a = context;
        this.f38745e = new HandlerC0623a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f38741i) {
            try {
                if (j == null) {
                    j = new a(context.getApplicationContext());
                }
                aVar = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void b(Intent intent) {
        if (a(intent)) {
            a();
        }
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f38743b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f38743b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f38743b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<c> arrayList2 = this.f38744c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f38744c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f38743b) {
            try {
                ArrayList<c> arrayListRemove = this.f38743b.remove(broadcastReceiver);
                if (arrayListRemove != null) {
                    for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                        c cVar = arrayListRemove.get(size);
                        cVar.d = true;
                        for (int i2 = 0; i2 < cVar.f38749a.countActions(); i2++) {
                            String action = cVar.f38749a.getAction(i2);
                            ArrayList<c> arrayList = this.f38744c.get(action);
                            if (arrayList != null) {
                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                    c cVar2 = arrayList.get(size2);
                                    if (cVar2.f38750b == broadcastReceiver) {
                                        cVar2.d = true;
                                        arrayList.remove(size2);
                                    }
                                }
                                if (arrayList.size() <= 0) {
                                    this.f38744c.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(Intent intent) {
        String str;
        synchronized (this.f38743b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f38742a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.f38744c.get(intent.getAction());
                if (arrayList != null) {
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        c cVar = arrayList.get(i2);
                        if (z2) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f38749a);
                        }
                        if (cVar.f38751c) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = cVar.f38749a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z2) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f38751c = true;
                            } else {
                                arrayList = arrayList;
                                if (z2) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch == -2) {
                                        str = "data";
                                    } else if (iMatch != -1) {
                                        str = "unknown reason";
                                    } else {
                                        str = "type";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i2++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((c) arrayList2.get(i3)).f38751c = false;
                        }
                        this.d.add(new b(intent, arrayList2));
                        if (!this.f38745e.hasMessages(1)) {
                            this.f38745e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f38743b) {
                try {
                    size = this.d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.d.toArray(bVarArr);
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = bVarArr[i2];
                int size2 = bVar.f38748b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c cVar = bVar.f38748b.get(i3);
                    if (!cVar.d) {
                        cVar.f38750b.onReceive(this.f38742a, bVar.f38747a);
                    }
                }
            }
        }
    }
}
