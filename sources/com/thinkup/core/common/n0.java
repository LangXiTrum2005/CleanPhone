package com.thinkup.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 {
    private static final String m = "InnerBroadcastManager";
    private static n0 mm = null;
    private static final Object mo = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f41937n = false;
    static final int o = 1;
    private final Handler m0;
    private final Context o0;
    private final HashMap<BroadcastReceiver, ArrayList<m>> oo = new HashMap<>();
    private final HashMap<String, ArrayList<m>> om = new HashMap<>();
    private final ArrayList<o> on = new ArrayList<>();

    public static final class m {
        final BroadcastReceiver m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f41938n;
        final IntentFilter o;
        boolean o0;

        public m(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.o = intentFilter;
            this.m = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.m);
            sb.append(" filter=");
            sb.append(this.o);
            if (this.o0) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class o {
        final ArrayList<m> m;
        final Intent o;

        public o(Intent intent, ArrayList<m> arrayList) {
            this.o = intent;
            this.m = arrayList;
        }
    }

    private n0(Context context) {
        this.o0 = context;
        this.m0 = new Handler(context.getMainLooper()) { // from class: com.thinkup.core.common.n0.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    n0.this.o();
                }
            }
        };
    }

    private void m(Intent intent) {
        if (o(intent)) {
            o();
        }
    }

    private static n0 o(Context context) {
        n0 n0Var;
        synchronized (mo) {
            try {
                if (mm == null) {
                    mm = new n0(context.getApplicationContext());
                }
                n0Var = mm;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n0Var;
    }

    private void o(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.oo) {
            try {
                m mVar = new m(intentFilter, broadcastReceiver);
                ArrayList<m> arrayList = this.oo.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.oo.put(broadcastReceiver, arrayList);
                }
                arrayList.add(mVar);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<m> arrayList2 = this.om.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.om.put(action, arrayList2);
                    }
                    arrayList2.add(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(BroadcastReceiver broadcastReceiver) {
        synchronized (this.oo) {
            try {
                ArrayList<m> arrayListRemove = this.oo.remove(broadcastReceiver);
                if (arrayListRemove != null) {
                    for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                        m mVar = arrayListRemove.get(size);
                        mVar.o0 = true;
                        for (int i2 = 0; i2 < mVar.o.countActions(); i2++) {
                            String action = mVar.o.getAction(i2);
                            ArrayList<m> arrayList = this.om.get(action);
                            if (arrayList != null) {
                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                    m mVar2 = arrayList.get(size2);
                                    if (mVar2.m == broadcastReceiver) {
                                        mVar2.o0 = true;
                                        arrayList.remove(size2);
                                    }
                                }
                                if (arrayList.size() <= 0) {
                                    this.om.remove(action);
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

    private boolean o(Intent intent) {
        String str;
        synchronized (this.oo) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.o0.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<m> arrayList = this.om.get(intent.getAction());
                if (arrayList != null) {
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList)));
                    }
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        m mVar = arrayList.get(i2);
                        if (z2) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + mVar.o);
                        }
                        if (mVar.f41938n) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            action = action;
                        } else {
                            int iMatch = mVar.o.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z2) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(mVar);
                                mVar.f41938n = true;
                            } else {
                                action = action;
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
                                    Log.v("LocalBroadcastManager", "  Filter did not match: ".concat(str));
                                }
                            }
                        }
                        i2++;
                        action = action;
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((m) arrayList2.get(i3)).f41938n = false;
                        }
                        this.on.add(new o(intent, arrayList2));
                        if (!this.m0.hasMessages(1)) {
                            this.m0.sendEmptyMessage(1);
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

    public final void o() {
        int size;
        o[] oVarArr;
        while (true) {
            synchronized (this.oo) {
                try {
                    size = this.on.size();
                    if (size <= 0) {
                        return;
                    }
                    oVarArr = new o[size];
                    this.on.toArray(oVarArr);
                    this.on.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                o oVar = oVarArr[i2];
                int size2 = oVar.m.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    m mVar = oVar.m.get(i3);
                    if (!mVar.o0) {
                        mVar.m.onReceive(this.o0, oVar.o);
                    }
                }
            }
        }
    }
}
