package com.applovin.impl.communicator;

import androidx.fragment.app.n;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f7671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7672b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7673c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f7674d = new Object();

    private Queue a(String str) {
        LinkedList linkedList;
        synchronized (this.f7674d) {
            try {
                Queue queue = (Queue) this.f7673c.get(str);
                linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedList;
    }

    private void b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.f7674d) {
                try {
                    Queue queue = (Queue) this.f7673c.get(communicatorMessageImpl.getTopic());
                    if (queue != null) {
                        queue.add(communicatorMessageImpl);
                        if (queue.size() > 10) {
                            queue.remove();
                        }
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(communicatorMessageImpl);
                        this.f7673c.put(communicatorMessageImpl.getTopic(), linkedList);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void c(CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = a();
        this.f7671a = scheduledThreadPoolExecutorA;
        scheduledThreadPoolExecutorA.execute(new n(communicatorMessageImpl, 8));
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            c((CommunicatorMessageImpl) it.next());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        c(appLovinCommunicatorMessage);
        b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.f7672b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f7671a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, new a(0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
