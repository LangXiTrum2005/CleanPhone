package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import eb.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<b>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<b>> mActions = new HashMap<>();
    private final ArrayList<d0> mPendingBroadcasts = new ArrayList<>();

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new a(this, context.getMainLooper(), 0);
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = mInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return localBroadcastManager;
    }

    public void executePendingBroadcasts() {
        int size;
        d0[] d0VarArr;
        while (true) {
            synchronized (this.mReceivers) {
                try {
                    size = this.mPendingBroadcasts.size();
                    if (size <= 0) {
                        return;
                    }
                    d0VarArr = new d0[size];
                    this.mPendingBroadcasts.toArray(d0VarArr);
                    this.mPendingBroadcasts.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                d0 d0Var = d0VarArr[i10];
                int size2 = ((ArrayList) d0Var.f39977c).size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b bVar = (b) ((ArrayList) d0Var.f39977c).get(i11);
                    if (!bVar.f4631d) {
                        bVar.f4629b.onReceive(this.mAppContext, (Intent) d0Var.f39976b);
                    }
                }
            }
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            try {
                b bVar = new b(broadcastReceiver, intentFilter);
                ArrayList<b> arrayList = this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<b> arrayList2 = this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean sendBroadcast(@NonNull Intent intent) {
        String str;
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v(TAG, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<b> arrayList = this.mActions.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        Log.v(TAG, "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        b bVar = arrayList.get(i10);
                        if (z10) {
                            Log.v(TAG, "Matching against filter " + bVar.f4628a);
                        }
                        if (bVar.f4630c) {
                            if (z10) {
                                Log.v(TAG, "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = bVar.f4628a.match(action, strResolveTypeIfNeeded, scheme, data, categories, TAG);
                            if (iMatch >= 0) {
                                if (z10) {
                                    Log.v(TAG, "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.f4630c = true;
                            } else {
                                arrayList = arrayList;
                                if (z10) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v(TAG, "  Filter did not match: " + str);
                                }
                            }
                        }
                        i10++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((b) arrayList2.get(i11)).f4630c = false;
                        }
                        this.mPendingBroadcasts.add(new d0((Object) intent, false, (Object) arrayList2, 2));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            try {
                ArrayList<b> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    b bVar = arrayListRemove.get(size);
                    bVar.f4631d = true;
                    for (int i10 = 0; i10 < bVar.f4628a.countActions(); i10++) {
                        String action = bVar.f4628a.getAction(i10);
                        ArrayList<b> arrayList = this.mActions.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = arrayList.get(size2);
                                if (bVar2.f4629b == broadcastReceiver) {
                                    bVar2.f4631d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
