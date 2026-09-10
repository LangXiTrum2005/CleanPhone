package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f9271a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f9272b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList f9273c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Handler f9274d = new a(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface Receiver {
        void onReceive(Intent intent, @Nullable Map<String, Object> map);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f9275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f9276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f9277c;

        public b(Intent intent, Map map, List list) {
            this.f9275a = intent;
            this.f9276b = map;
            this.f9277c = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f9278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Receiver f9279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f9280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f9281d;

        public c(IntentFilter intentFilter, Receiver receiver) {
            this.f9278a = intentFilter;
            this.f9279b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f9271a) {
                try {
                    ArrayList arrayList = f9273c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    arrayList.toArray(bVarArr);
                    arrayList.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                if (bVar != null) {
                    for (c cVar : bVar.f9277c) {
                        if (cVar != null && !cVar.f9281d) {
                            cVar.f9279b.onReceive(bVar.f9275a, bVar.f9276b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f9271a;
        synchronized (map) {
            try {
                c cVar = new c(intentFilter, receiver);
                ArrayList arrayList = (ArrayList) map.get(receiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(receiver, arrayList);
                }
                arrayList.add(cVar);
                Iterator<String> itActionsIterator = intentFilter.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    Map map2 = f9272b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, @Nullable Map<String, Object> map) {
        synchronized (f9271a) {
            try {
                List listA = a(intent);
                if (listA == null) {
                    return false;
                }
                f9273c.add(new b(intent, map, listA));
                Handler handler = f9274d;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, @Nullable Map<String, Object> map) {
        List<c> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (c cVar : listA) {
            if (!cVar.f9281d) {
                cVar.f9279b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, @Nullable Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f9271a;
        synchronized (map) {
            try {
                List<c> list = (List) map.remove(receiver);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    cVar.f9281d = true;
                    Iterator<String> itActionsIterator = cVar.f9278a.actionsIterator();
                    while (itActionsIterator.hasNext()) {
                        String next = itActionsIterator.next();
                        List list2 = (List) f9272b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((c) it.next()).f9279b == receiver) {
                                    cVar.f9281d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                f9272b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f9271a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<c> list = (List) f9272b.get(action);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = null;
                for (c cVar : list) {
                    if (!cVar.f9280c && cVar.f9278a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(cVar);
                        cVar.f9280c = true;
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f9280c = false;
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
