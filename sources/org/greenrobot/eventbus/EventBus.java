package org.greenrobot.eventbus;

import android.os.Looper;
import android.support.v4.media.a;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;
import com.p004ironsource.d9;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.android.AndroidComponents;
import org.greenrobot.eventbus.android.AndroidComponentsImpl;
import org.greenrobot.eventbus.android.AndroidDependenciesDetector;
import org.greenrobot.eventbus.android.DefaultAndroidMainThreadSupport;

/* JADX INFO: loaded from: classes7.dex */
public class EventBus {
    public static volatile EventBus q;
    public static final EventBusBuilder r;
    public static final HashMap s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f45238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f45239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f45240c;
    public final ThreadLocal d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MainThreadSupport f45241e;
    public final Poster f;
    public final BackgroundPoster g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AsyncPoster f45242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SubscriberMethodFinder f45243i;
    public final ExecutorService j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f45244l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f45245n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Logger f45246p;

    /* JADX INFO: renamed from: org.greenrobot.eventbus.EventBus$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<PostingThreadState> {
        @Override // java.lang.ThreadLocal
        public final PostingThreadState initialValue() {
            return new PostingThreadState();
        }
    }

    /* JADX INFO: renamed from: org.greenrobot.eventbus.EventBus$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45247a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f45247a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45247a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45247a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45247a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45247a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface PostCallback {
    }

    public static final class PostingThreadState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f45248a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45250c;
        public Object d;
    }

    static {
        EventBusBuilder eventBusBuilder = new EventBusBuilder();
        eventBusBuilder.f45252a = EventBusBuilder.f45251b;
        r = eventBusBuilder;
        s = new HashMap();
    }

    public EventBus() {
        EventBusBuilder eventBusBuilder = r;
        this.d = new AnonymousClass1();
        eventBusBuilder.getClass();
        AndroidComponents androidComponents = AndroidComponents.f45276c;
        this.f45246p = androidComponents != null ? androidComponents.f45277a : new Logger.SystemOutLogger();
        this.f45238a = new HashMap();
        this.f45239b = new HashMap();
        this.f45240c = new ConcurrentHashMap();
        DefaultAndroidMainThreadSupport defaultAndroidMainThreadSupport = androidComponents != null ? androidComponents.f45278b : null;
        this.f45241e = defaultAndroidMainThreadSupport;
        this.f = defaultAndroidMainThreadSupport != null ? new HandlerPoster(this, Looper.getMainLooper()) : null;
        this.g = new BackgroundPoster(this);
        this.f45242h = new AsyncPoster(this);
        this.f45243i = new SubscriberMethodFinder();
        this.k = true;
        this.f45244l = true;
        this.m = true;
        this.f45245n = true;
        this.o = true;
        this.j = eventBusBuilder.f45252a;
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static EventBus b() {
        EventBus eventBus;
        EventBus eventBus2 = q;
        if (eventBus2 != null) {
            return eventBus2;
        }
        synchronized (EventBus.class) {
            try {
                eventBus = q;
                if (eventBus == null) {
                    eventBus = new EventBus();
                    q = eventBus;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eventBus;
    }

    public final void c(PendingPost pendingPost) {
        Object obj = pendingPost.f45255a;
        Subscription subscription = pendingPost.f45256b;
        pendingPost.f45255a = null;
        pendingPost.f45256b = null;
        pendingPost.f45257c = null;
        ArrayList arrayList = PendingPost.d;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(pendingPost);
            }
        }
        if (subscription.f45275c) {
            d(subscription, obj);
        }
    }

    public final void d(Subscription subscription, Object obj) {
        try {
            subscription.f45274b.f45263a.invoke(subscription.f45273a, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            boolean z2 = obj instanceof SubscriberExceptionEvent;
            boolean z3 = this.k;
            Logger logger = this.f45246p;
            if (!z2) {
                if (z3) {
                    logger.a(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f45273a.getClass(), cause);
                }
                if (this.m) {
                    f(new SubscriberExceptionEvent(cause, obj, subscription.f45273a));
                    return;
                }
                return;
            }
            if (z3) {
                Level level = Level.SEVERE;
                logger.a(level, "SubscriberExceptionEvent subscriber " + subscription.f45273a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                logger.a(level, "Initial event " + subscriberExceptionEvent.f45261b + " caused exception in " + subscriberExceptionEvent.f45262c, subscriberExceptionEvent.f45260a);
            }
        }
    }

    public final synchronized boolean e(Object obj) {
        return this.f45239b.containsKey(obj);
    }

    public final void f(Object obj) {
        PostingThreadState postingThreadState = (PostingThreadState) this.d.get();
        ArrayList arrayList = postingThreadState.f45248a;
        arrayList.add(obj);
        if (postingThreadState.f45249b) {
            return;
        }
        MainThreadSupport mainThreadSupport = this.f45241e;
        postingThreadState.f45250c = mainThreadSupport == null || mainThreadSupport.a();
        postingThreadState.f45249b = true;
        while (!arrayList.isEmpty()) {
            try {
                g(arrayList.remove(0), postingThreadState);
            } catch (Throwable th) {
                postingThreadState.f45249b = false;
                postingThreadState.f45250c = false;
                throw th;
            }
        }
        postingThreadState.f45249b = false;
        postingThreadState.f45250c = false;
    }

    public final void g(Object obj, PostingThreadState postingThreadState) {
        boolean zH;
        List list;
        Class<?> cls = obj.getClass();
        if (this.o) {
            HashMap map = s;
            synchronized (map) {
                try {
                    List list2 = (List) map.get(cls);
                    list = list2;
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                            arrayList.add(superclass);
                            a(arrayList, superclass.getInterfaces());
                        }
                        s.put(cls, arrayList);
                        list = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = list.size();
            zH = false;
            for (int i2 = 0; i2 < size; i2++) {
                zH |= h(obj, postingThreadState, (Class) list.get(i2));
            }
        } else {
            zH = h(obj, postingThreadState, cls);
        }
        if (zH) {
            return;
        }
        if (this.f45244l) {
            this.f45246p.b(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f45245n || cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
            return;
        }
        f(new NoSubscriberEvent(obj));
    }

    public final boolean h(Object obj, PostingThreadState postingThreadState, Class cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f45238a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (Subscription subscription : copyOnWriteArrayList) {
            postingThreadState.d = obj;
            i(subscription, obj, postingThreadState.f45250c);
        }
        return true;
    }

    public final void i(Subscription subscription, Object obj, boolean z2) {
        int i2 = AnonymousClass2.f45247a[subscription.f45274b.f45264b.ordinal()];
        if (i2 == 1) {
            d(subscription, obj);
            return;
        }
        Poster poster = this.f;
        if (i2 == 2) {
            if (z2) {
                d(subscription, obj);
                return;
            } else {
                poster.a(subscription, obj);
                return;
            }
        }
        if (i2 == 3) {
            if (poster != null) {
                poster.a(subscription, obj);
                return;
            } else {
                d(subscription, obj);
                return;
            }
        }
        if (i2 == 4) {
            if (z2) {
                this.g.a(subscription, obj);
                return;
            } else {
                d(subscription, obj);
                return;
            }
        }
        if (i2 == 5) {
            this.f45242h.a(subscription, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + subscription.f45274b.f45264b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    public final void j(Object obj) {
        SubscriberMethodFinder.FindState findState;
        Method[] methods;
        boolean z2;
        Subscribe subscribe;
        boolean zA;
        boolean z3 = true;
        if (AndroidDependenciesDetector.a()) {
            try {
                int i2 = AndroidComponentsImpl.d;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
            }
        }
        Class<?> cls = obj.getClass();
        SubscriberMethodFinder subscriberMethodFinder = this.f45243i;
        subscriberMethodFinder.getClass();
        ConcurrentHashMap concurrentHashMap = SubscriberMethodFinder.f45267a;
        List arrayList = (List) concurrentHashMap.get(cls);
        if (arrayList == null) {
            synchronized (SubscriberMethodFinder.f45268b) {
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        findState = new SubscriberMethodFinder.FindState();
                        break;
                    }
                    try {
                        SubscriberMethodFinder.FindState[] findStateArr = SubscriberMethodFinder.f45268b;
                        findState = findStateArr[i3];
                        if (findState != null) {
                            findStateArr[i3] = null;
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            findState.f45272e = cls;
            findState.f = false;
            findState.g = null;
            while (findState.f45272e != null) {
                findState.g = null;
                subscriberMethodFinder.getClass();
                try {
                    try {
                        methods = findState.f45272e.getDeclaredMethods();
                    } catch (Throwable unused2) {
                        methods = findState.f45272e.getMethods();
                        findState.f = z3;
                    }
                    int length = methods.length;
                    int i4 = 0;
                    while (i4 < length) {
                        Method method = methods[i4];
                        int modifiers = method.getModifiers();
                        if ((modifiers & 1) == 0 || (modifiers & 5192) != 0) {
                            z2 = z3;
                        } else {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length != z3 || (subscribe = (Subscribe) method.getAnnotation(Subscribe.class)) == null) {
                                z2 = z3;
                            } else {
                                Class<?> cls2 = parameterTypes[0];
                                HashMap map = findState.f45270b;
                                z2 = z3;
                                Object objPut = map.put(cls2, method);
                                if (objPut == null) {
                                    zA = z2;
                                } else {
                                    if (objPut instanceof Method) {
                                        if (!findState.a((Method) objPut, cls2)) {
                                            throw new IllegalStateException();
                                        }
                                        map.put(cls2, findState);
                                    }
                                    zA = findState.a(method, cls2);
                                }
                                if (zA) {
                                    findState.f45269a.add(new SubscriberMethod(method, cls2, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                                }
                            }
                        }
                        i4++;
                        z3 = z2;
                    }
                    boolean z4 = z3;
                    if (findState.f) {
                        findState.f45272e = null;
                    } else {
                        Class superclass = findState.f45272e.getSuperclass();
                        findState.f45272e = superclass;
                        String name = superclass.getName();
                        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                            findState.f45272e = null;
                        }
                    }
                    z3 = z4;
                } catch (LinkageError e2) {
                    throw new EventBusException(a.m("Could not inspect methods of ".concat(findState.f45272e.getName()), ". Please make this class visible to EventBus annotation processor to avoid reflection."), e2);
                }
            }
            arrayList = new ArrayList(findState.f45269a);
            findState.f45269a.clear();
            findState.f45270b.clear();
            findState.f45271c.clear();
            findState.d.setLength(0);
            findState.f45272e = null;
            findState.f = false;
            synchronized (SubscriberMethodFinder.f45268b) {
                for (int i5 = 0; i5 < 4; i5++) {
                    try {
                        SubscriberMethodFinder.FindState[] findStateArr2 = SubscriberMethodFinder.f45268b;
                        if (findStateArr2[i5] == null) {
                            findStateArr2[i5] = findState;
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
            }
            concurrentHashMap.put(cls, arrayList);
        }
        synchronized (this) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k(obj, (SubscriberMethod) it.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(Object obj, SubscriberMethod subscriberMethod) {
        Object value;
        Class cls = subscriberMethod.f45265c;
        Subscription subscription = new Subscription(obj, subscriberMethod);
        HashMap map = this.f45238a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(subscription)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 != size) {
                if (subscriberMethod.d <= ((Subscription) copyOnWriteArrayList.get(i2)).f45274b.d) {
                }
            }
            copyOnWriteArrayList.add(i2, subscription);
            break;
        }
        HashMap map2 = this.f45239b;
        List arrayList = (List) map2.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (subscriberMethod.f45266e) {
            ConcurrentHashMap concurrentHashMap = this.f45240c;
            MainThreadSupport mainThreadSupport = this.f45241e;
            if (!this.o) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    i(subscription, obj2, mainThreadSupport == null || mainThreadSupport.a());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    i(subscription, value, mainThreadSupport == null || mainThreadSupport.a());
                }
            }
        }
    }

    public final synchronized void l(BaseAct baseAct) {
        try {
            List list = (List) this.f45239b.get(baseAct);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) this.f45238a.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Subscription subscription = (Subscription) list2.get(i2);
                            if (subscription.f45273a == baseAct) {
                                subscription.f45275c = false;
                                list2.remove(i2);
                                i2--;
                                size--;
                            }
                            i2++;
                        }
                    }
                }
                this.f45239b.remove(baseAct);
            } else {
                this.f45246p.b(Level.WARNING, "Subscriber to unregister was not registered before: " + baseAct.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        return a.t(new StringBuilder("EventBus[indexCount=0, eventInheritance="), this.o, d9.i.f24752e);
    }
}
