package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f20207h = new b(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EventBus f20211e;
    public final ComponentRegistrarProcessor g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20208a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20209b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20210c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UiExecutor f20212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f20213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f20214c;
        public ComponentRegistrarProcessor d;

        public Builder() {
            UiExecutor uiExecutor = UiExecutor.X;
            this.f20213b = new ArrayList();
            this.f20214c = new ArrayList();
            this.d = ComponentRegistrarProcessor.S8;
            this.f20212a = uiExecutor;
        }
    }

    public ComponentRuntime(UiExecutor uiExecutor, List list, List list2, ComponentRegistrarProcessor componentRegistrarProcessor) {
        EventBus eventBus = new EventBus(uiExecutor);
        this.f20211e = eventBus;
        this.g = componentRegistrarProcessor;
        ArrayList<Component> arrayList = new ArrayList();
        arrayList.add(Component.c(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.c(this, ComponentLoader.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList.add(component);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((Component) it4.next()).f20199b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.d.add(obj.toString());
                    }
                }
            }
            if (this.f20208a.isEmpty()) {
                CycleDetector.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f20208a.keySet());
                arrayList4.addAll(arrayList);
                CycleDetector.a(arrayList4);
            }
            for (final Component component2 : arrayList) {
                this.f20208a.put(component2, new Lazy(new Provider() { // from class: com.google.firebase.components.c
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        ComponentRuntime componentRuntime = this.f20243a;
                        componentRuntime.getClass();
                        Component component3 = component2;
                        return component3.f.b(new RestrictedComponentContainer(component3, componentRuntime));
                    }
                }));
            }
            arrayList3.addAll(l(arrayList));
            arrayList3.addAll(m());
            k();
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            j(this.f20208a, bool.booleanValue());
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider b(Qualified qualified) {
        Preconditions.a(qualified, "Null interface requested.");
        return (Provider) this.f20209b.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider d(Qualified qualified) {
        LazySet lazySet = (LazySet) this.f20210c.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return f20207h;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred h(Qualified qualified) {
        Provider providerB = b(qualified);
        if (providerB == null) {
            return new OptionalProvider(OptionalProvider.f20230c, OptionalProvider.d);
        }
        return providerB instanceof OptionalProvider ? (OptionalProvider) providerB : new OptionalProvider(null, providerB);
    }

    public final void j(HashMap map, boolean z2) {
        ArrayDeque<Event> arrayDeque;
        Set<Map.Entry> setEntrySet;
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            int i2 = component.d;
            if (i2 == 1 || (i2 == 2 && z2)) {
                provider.get();
            }
        }
        EventBus eventBus = this.f20211e;
        synchronized (eventBus) {
            arrayDeque = eventBus.f20224b;
            if (arrayDeque != null) {
                eventBus.f20224b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            for (Event event : arrayDeque) {
                event.getClass();
                synchronized (eventBus) {
                    try {
                        ArrayDeque arrayDeque2 = eventBus.f20224b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(event);
                        } else {
                            synchronized (eventBus) {
                                try {
                                    Map map2 = (Map) eventBus.f20223a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            for (Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new d(2, entry2, event));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final void k() {
        for (Component component : this.f20208a.keySet()) {
            for (Dependency dependency : component.f20200c) {
                boolean z2 = dependency.f20221b == 2;
                Qualified qualified = dependency.f20220a;
                if (z2) {
                    HashMap map = this.f20210c;
                    if (!map.containsKey(qualified)) {
                        Set set = Collections.EMPTY_SET;
                        LazySet lazySet = new LazySet();
                        lazySet.f20229b = null;
                        lazySet.f20228a = Collections.newSetFromMap(new ConcurrentHashMap());
                        lazySet.f20228a.addAll(set);
                        map.put(qualified, lazySet);
                    }
                }
                HashMap map2 = this.f20209b;
                if (map2.containsKey(qualified)) {
                    continue;
                } else {
                    int i2 = dependency.f20221b;
                    if (i2 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + component + ": " + qualified);
                    }
                    if (i2 != 2) {
                        map2.put(qualified, new OptionalProvider(OptionalProvider.f20230c, OptionalProvider.d));
                    }
                }
            }
        }
    }

    public final ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.f20201e == 0) {
                Provider provider = (Provider) this.f20208a.get(component);
                for (Qualified qualified : component.f20199b) {
                    HashMap map = this.f20209b;
                    if (map.containsKey(qualified)) {
                        arrayList2.add(new d(0, (OptionalProvider) ((Provider) map.get(qualified)), provider));
                    } else {
                        map.put(qualified, provider);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList m() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f20208a.entrySet()) {
            Component component = (Component) entry.getKey();
            if (component.f20201e != 0) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.f20199b) {
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new HashSet());
                    }
                    ((Set) map.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f20210c;
            if (map2.containsKey(key)) {
                LazySet lazySet = (LazySet) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new d(1, lazySet, (Provider) it.next()));
                }
            } else {
                Qualified qualified2 = (Qualified) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                LazySet lazySet2 = new LazySet();
                lazySet2.f20229b = null;
                lazySet2.f20228a = Collections.newSetFromMap(new ConcurrentHashMap());
                lazySet2.f20228a.addAll(set);
                map2.put(qualified2, lazySet2);
            }
        }
        return arrayList;
    }
}
