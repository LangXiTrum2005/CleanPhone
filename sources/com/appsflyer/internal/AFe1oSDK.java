package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1oSDK {
    final ExecutorService getRevenue;
    public Executor getCurrencyIso4217Code = Executors.newSingleThreadExecutor();
    final Timer getMonetizationNetwork = new Timer(true);
    public final List<AFe1qSDK> getMediationNetwork = new CopyOnWriteArrayList();
    final Set<AFe1pSDK> AFAdRevenueData = new CopyOnWriteArraySet();
    final Set<AFe1pSDK> component2 = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFe1mSDK<?>> areAllFieldsValid = new ConcurrentSkipListSet();
    final NavigableSet<AFe1mSDK<?>> component1 = new ConcurrentSkipListSet();
    final List<AFe1mSDK<?>> component3 = new ArrayList();
    final Set<AFe1mSDK<?>> component4 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        private /* synthetic */ AFe1mSDK getRevenue;

        public AnonymousClass1(AFe1mSDK aFe1mSDK) {
            this.getRevenue = aFe1mSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1oSDK.this.areAllFieldsValid) {
                try {
                    if (AFe1oSDK.this.component4.contains(this.getRevenue)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                        StringBuilder sb = new StringBuilder("tried to add already running task: ");
                        sb.append(this.getRevenue);
                        aFLogger.d(aFg1cSDK, sb.toString());
                        return;
                    }
                    if (!AFe1oSDK.this.areAllFieldsValid.contains(this.getRevenue) && !AFe1oSDK.this.component1.contains(this.getRevenue)) {
                        AFe1oSDK aFe1oSDK = AFe1oSDK.this;
                        AFe1mSDK aFe1mSDK = this.getRevenue;
                        for (AFe1pSDK aFe1pSDK : aFe1mSDK.getCurrencyIso4217Code) {
                            if (aFe1oSDK.component2.contains(aFe1pSDK)) {
                                aFe1mSDK.AFAdRevenueData.add(aFe1pSDK);
                            }
                        }
                        if (AFe1oSDK.this.getMonetizationNetwork(this.getRevenue)) {
                            zAdd = AFe1oSDK.this.areAllFieldsValid.add(this.getRevenue);
                        } else {
                            zAdd = AFe1oSDK.this.component1.add(this.getRevenue);
                            if (zAdd) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK2 = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("new task was blocked: ");
                                sb2.append(this.getRevenue);
                                aFLogger2.d(aFg1cSDK2, sb2.toString());
                                this.getRevenue.getMediationNetwork();
                            }
                        }
                        if (zAdd) {
                            AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
                            aFe1oSDK2.areAllFieldsValid.addAll(aFe1oSDK2.component3);
                            AFe1oSDK.this.component3.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK3 = AFg1cSDK.QUEUE;
                            StringBuilder sb3 = new StringBuilder("task not added, it's already in the queue: ");
                            sb3.append(this.getRevenue);
                            aFLogger3.d(aFg1cSDK3, sb3.toString());
                        }
                        if (!zAdd) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK4 = AFg1cSDK.QUEUE;
                            StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb4.append(this.getRevenue);
                            aFLogger4.w(aFg1cSDK4, sb4.toString());
                            return;
                        }
                        AFe1oSDK.this.component2.add(this.getRevenue.getRevenue);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK5 = AFg1cSDK.QUEUE;
                        StringBuilder sb5 = new StringBuilder("new task added: ");
                        sb5.append(this.getRevenue);
                        aFLogger5.d(aFg1cSDK5, sb5.toString());
                        for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                        }
                        AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
                        aFe1oSDK3.getRevenue.submit(aFe1oSDK3.new AnonymousClass2());
                        AFe1oSDK aFe1oSDK4 = AFe1oSDK.this;
                        synchronized (aFe1oSDK4.areAllFieldsValid) {
                            try {
                                for (int size = (aFe1oSDK4.areAllFieldsValid.size() + aFe1oSDK4.component1.size()) - 40; size > 0; size--) {
                                    boolean zIsEmpty = aFe1oSDK4.component1.isEmpty();
                                    boolean zIsEmpty2 = aFe1oSDK4.areAllFieldsValid.isEmpty();
                                    if (zIsEmpty2 || zIsEmpty) {
                                        if (!zIsEmpty2) {
                                            aFe1oSDK4.getMonetizationNetwork(aFe1oSDK4.areAllFieldsValid);
                                        } else if (!zIsEmpty) {
                                            aFe1oSDK4.getMonetizationNetwork(aFe1oSDK4.component1);
                                        }
                                    } else if (aFe1oSDK4.areAllFieldsValid.first().compareTo(aFe1oSDK4.component1.first()) > 0) {
                                        aFe1oSDK4.getMonetizationNetwork(aFe1oSDK4.areAllFieldsValid);
                                    } else {
                                        aFe1oSDK4.getMonetizationNetwork(aFe1oSDK4.component1);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK6 = AFg1cSDK.QUEUE;
                    StringBuilder sb6 = new StringBuilder("tried to add already scheduled task: ");
                    sb6.append(this.getRevenue);
                    aFLogger6.d(aFg1cSDK6, sb6.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1oSDK.this.areAllFieldsValid) {
                try {
                    final AFe1mSDK<?> aFe1mSDKPollFirst = AFe1oSDK.this.areAllFieldsValid.pollFirst();
                    if (aFe1mSDKPollFirst == null) {
                        return;
                    }
                    AFe1oSDK.this.component4.add(aFe1mSDKPollFirst);
                    long jAFAdRevenueData = aFe1mSDKPollFirst.AFAdRevenueData();
                    AFe1lSDK aFe1lSDK = new AFe1lSDK(Thread.currentThread());
                    if (jAFAdRevenueData > 0) {
                        AFe1oSDK.this.getMonetizationNetwork.schedule(aFe1lSDK, jAFAdRevenueData);
                    }
                    final AFe1oSDK aFe1oSDK = AFe1oSDK.this;
                    aFe1oSDK.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                            }
                        }
                    });
                    if (!AFe1oSDK.this.areAllFieldsValid.isEmpty()) {
                        AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
                        aFe1oSDK2.getRevenue.submit(aFe1oSDK2.new AnonymousClass2());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFe1mSDKPollFirst)));
                        final AFe1uSDK aFe1uSDKCall = aFe1mSDKPollFirst.call();
                        aFe1lSDK.cancel();
                        final AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
                        aFe1oSDK3.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(aFe1mSDKPollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1uSDKCall);
                                aFLogger.d(aFg1cSDK, sb.toString());
                                AFe1oSDK.this.component4.remove(aFe1mSDKPollFirst);
                                Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getRevenue(aFe1mSDKPollFirst, aFe1uSDKCall);
                                }
                                if (aFe1uSDKCall == AFe1uSDK.SUCCESS) {
                                    AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
                                    AFe1oSDK.this.getRevenue();
                                    return;
                                }
                                if (!aFe1mSDKPollFirst.getMonetizationNetwork()) {
                                    AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
                                    AFe1oSDK.this.getRevenue();
                                } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDKPollFirst)) {
                                    synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                        try {
                                            AFe1oSDK.this.component3.add(aFe1mSDKPollFirst);
                                            for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1mSDKPollFirst)));
                        final AFe1uSDK aFe1uSDK = AFe1uSDK.TIMEOUT;
                        aFe1mSDKPollFirst.getMonetizationNetwork = aFe1uSDK;
                        final AFe1oSDK aFe1oSDK4 = AFe1oSDK.this;
                        aFe1oSDK4.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(aFe1mSDKPollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1uSDK);
                                aFLogger.d(aFg1cSDK, sb.toString());
                                AFe1oSDK.this.component4.remove(aFe1mSDKPollFirst);
                                Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getRevenue(aFe1mSDKPollFirst, aFe1uSDK);
                                }
                                if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                                    AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
                                    AFe1oSDK.this.getRevenue();
                                    return;
                                }
                                if (!aFe1mSDKPollFirst.getMonetizationNetwork()) {
                                    AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
                                    AFe1oSDK.this.getRevenue();
                                } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDKPollFirst)) {
                                    synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                        try {
                                            AFe1oSDK.this.component3.add(aFe1mSDKPollFirst);
                                            for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFe1lSDK.cancel();
                        final AFe1oSDK aFe1oSDK5 = AFe1oSDK.this;
                        final AFe1uSDK aFe1uSDK2 = AFe1uSDK.FAILURE;
                        aFe1oSDK5.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(aFe1mSDKPollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1uSDK2);
                                aFLogger.d(aFg1cSDK, sb.toString());
                                AFe1oSDK.this.component4.remove(aFe1mSDKPollFirst);
                                Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getRevenue(aFe1mSDKPollFirst, aFe1uSDK2);
                                }
                                if (aFe1uSDK2 == AFe1uSDK.SUCCESS) {
                                    AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
                                    AFe1oSDK.this.getRevenue();
                                    return;
                                }
                                if (!aFe1mSDKPollFirst.getMonetizationNetwork()) {
                                    AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
                                    AFe1oSDK.this.getRevenue();
                                } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDKPollFirst)) {
                                    synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                        try {
                                            AFe1oSDK.this.component3.add(aFe1mSDKPollFirst);
                                            for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AFe1oSDK(ExecutorService executorService) {
        this.getRevenue = executorService;
    }

    public static boolean AFAdRevenueData(AFe1mSDK<?> aFe1mSDK) {
        return ((aFe1mSDK instanceof AFf1uSDK) && aFe1mSDK.getRevenue == AFe1pSDK.ARS_VALIDATE) ? false : true;
    }

    public final void getMonetizationNetwork(NavigableSet<AFe1mSDK<?>> navigableSet) {
        AFe1mSDK<?> aFe1mSDKPollFirst = navigableSet.pollFirst();
        this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
        Iterator<AFe1qSDK> it = this.getMediationNetwork.iterator();
        while (it.hasNext()) {
            it.next().getCurrencyIso4217Code(aFe1mSDKPollFirst);
        }
    }

    public final void getRevenue() {
        synchronized (this.areAllFieldsValid) {
            try {
                Iterator<AFe1mSDK<?>> it = this.component1.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    AFe1mSDK<?> next = it.next();
                    if (getMonetizationNetwork(next)) {
                        it.remove();
                        this.areAllFieldsValid.add(next);
                        z = true;
                    }
                }
                if (z) {
                    this.getRevenue.submit(new AnonymousClass2());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean getMonetizationNetwork(AFe1mSDK<?> aFe1mSDK) {
        return this.AFAdRevenueData.containsAll(aFe1mSDK.AFAdRevenueData);
    }
}
