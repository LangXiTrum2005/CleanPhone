package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventBus {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile EventBus f33177o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33189k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static ExecutorService f33176n = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f33178p = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f33179a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f33180b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f33181c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f33182d = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f33183e = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33184f = "onEvent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HandlerPoster f33185g = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final BackgroundPoster f33186h = new BackgroundPoster(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AsyncPoster f33187i = new AsyncPoster(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SubscriberMethodFinder f33188j = new SubscriberMethodFinder();
    private boolean l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f33190m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33193a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f33193a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33193a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33193a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33193a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class BooleanWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f33194a;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z10) {
        Iterator<SubscriberMethod> it = this.f33188j.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z10);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f33178p.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f33177o == null) {
            synchronized (EventBus.class) {
                try {
                    if (f33177o == null) {
                        f33177o = new EventBus();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33177o;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public void configureLogSubscriberExceptions(boolean z10) {
        if (this.f33189k) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.l = z10;
    }

    public Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f33181c) {
            obj = this.f33181c.get(cls);
        }
        return obj;
    }

    public void post(Object obj) {
        List<Object> list = this.f33182d.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f33183e.get();
        if (booleanWrapper.f33194a) {
            return;
        }
        boolean z10 = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f33194a = true;
        while (!list.isEmpty()) {
            try {
                a(list.remove(0), z10);
            } catch (Throwable th2) {
                booleanWrapper.f33194a = false;
                throw th2;
            }
        }
        booleanWrapper.f33194a = false;
    }

    public void postSticky(Object obj) {
        post(obj);
        synchronized (this.f33181c) {
            this.f33181c.put(obj.getClass(), obj);
        }
    }

    public void register(Object obj) {
        a(obj, this.f33184f, false);
    }

    public void registerSticky(Object obj) {
        a(obj, this.f33184f, true);
    }

    public void release() {
        if (f33177o != null) {
            f33177o = null;
            f33176n = null;
            Map<Class<?>, List<Class<?>>> map = f33178p;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f33179a;
            if (map2 != null && map2.size() > 0) {
                this.f33179a.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f33180b;
            if (map3 != null && map3.size() > 0) {
                this.f33180b.clear();
            }
            Map<Class<?>, Object> map4 = this.f33181c;
            if (map4 != null && map4.size() > 0) {
                this.f33181c.clear();
            }
            Map<String, Object> map5 = this.f33190m;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.f33190m.clear();
        }
    }

    public Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.f33181c) {
            objRemove = this.f33181c.remove(cls);
        }
        return objRemove;
    }

    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        try {
            if (clsArr.length == 0) {
                throw new IllegalArgumentException("Provide at least one event class");
            }
            List<Class<?>> list = this.f33180b.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.f33180b.remove(obj);
                }
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void register(String str, Object obj) {
        Map<String, Object> map = this.f33190m;
        if (map != null && map.containsKey(str)) {
            unregister(this.f33190m.get(str));
        }
        this.f33190m.put(str, obj);
        a(obj, this.f33184f, false);
    }

    public void registerSticky(Object obj, String str) {
        a(obj, str, true);
    }

    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f33184f, true, cls, clsArr);
    }

    public synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.f33181c) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f33181c.get(cls))) {
                    return false;
                }
                this.f33181c.remove(cls);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized void a(Object obj, String str, boolean z10, Class<?> cls, Class<?>... clsArr) {
        try {
            for (SubscriberMethod subscriberMethod : this.f33188j.a(obj.getClass(), str)) {
                if (cls == subscriberMethod.f33207c) {
                    a(obj, subscriberMethod, z10);
                } else if (clsArr != null) {
                    for (Class<?> cls2 : clsArr) {
                        if (cls2 == subscriberMethod.f33207c) {
                            a(obj, subscriberMethod, z10);
                            break;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void register(Object obj, String str) {
        a(obj, str, false);
    }

    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f33184f, false, cls, clsArr);
    }

    public synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.f33180b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(obj, it.next());
                }
                this.f33180b.remove(obj);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z10) {
        Object obj2;
        this.f33189k = true;
        Class<?> cls = subscriberMethod.f33207c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f33179a.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f33179a.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f33205a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.f33180b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f33180b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z10) {
            synchronized (this.f33181c) {
                obj2 = this.f33181c.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized void unregister(String str) {
        try {
            Map<String, Object> map = this.f33190m;
            if (map != null && map.containsKey(str)) {
                Object objRemove = this.f33190m.remove(str);
                List<Class<?>> list = this.f33180b.get(objRemove);
                if (list != null) {
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        a(objRemove, it.next());
                    }
                    this.f33180b.remove(objRemove);
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + objRemove.getClass());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f33179a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                if (copyOnWriteArrayList.get(i10).f33211a == obj) {
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    private void a(Object obj, boolean z10) throws Error {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                List<Class<?>> listA = a(cls);
                int size = listA.size();
                boolean z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    Class<?> cls2 = listA.get(i10);
                    synchronized (this) {
                        copyOnWriteArrayList = this.f33179a.get(cls2);
                    }
                    if (copyOnWriteArrayList != null) {
                        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            a(it.next(), obj, z10);
                        }
                        z11 = true;
                    }
                }
                if (z11) {
                    return;
                }
                Log.d(TAG, "No subscripers registered for event " + cls);
                if (cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
                    return;
                }
                post(new NoSubscriberEvent(this, obj));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z10) {
        int i10 = AnonymousClass3.f33193a[subscription.f33212b.f33206b.ordinal()];
        if (i10 == 1) {
            a(subscription, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                a(subscription, obj);
                return;
            } else {
                this.f33185g.a(subscription, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f33186h.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f33187i.enqueue(subscription, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + subscription.f33212b.f33206b);
        }
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f33178p;
        synchronized (map) {
            try {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f33178p.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public void a(PendingPost pendingPost) {
        Object obj = pendingPost.f33200a;
        Subscription subscription = pendingPost.f33201b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    public void a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f33212b.f33205a.invoke(subscription.f33211a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f33211a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.l) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f33211a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f33211a));
        }
    }
}
