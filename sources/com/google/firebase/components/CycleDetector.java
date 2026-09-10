package com.google.firebase.components;

import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class CycleDetector {

    public static class ComponentNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Component f20215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f20216b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f20217c = new HashSet();

        public ComponentNode(Component component) {
            this.f20215a = component;
        }
    }

    public static class Dep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Qualified f20218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20219b;

        public Dep(Qualified qualified, boolean z2) {
            this.f20218a = qualified;
            this.f20219b = z2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Dep) {
                Dep dep = (Dep) obj;
                if (dep.f20218a.equals(this.f20218a) && dep.f20219b == this.f20219b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f20218a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f20219b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (ComponentNode componentNode : (Set) it2.next()) {
                        for (Dependency dependency : componentNode.f20215a.f20200c) {
                            if (dependency.f20222c == 0) {
                                Set<ComponentNode> set = (Set) map.get(new Dep(dependency.f20220a, dependency.f20221b == 2));
                                if (set != null) {
                                    for (ComponentNode componentNode2 : set) {
                                        componentNode.f20216b.add(componentNode2);
                                        componentNode2.f20217c.add(componentNode);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<ComponentNode> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (ComponentNode componentNode3 : hashSet) {
                    if (componentNode3.f20217c.isEmpty()) {
                        hashSet2.add(componentNode3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    ComponentNode componentNode4 = (ComponentNode) hashSet2.iterator().next();
                    hashSet2.remove(componentNode4);
                    i2++;
                    for (ComponentNode componentNode5 : componentNode4.f20216b) {
                        componentNode5.f20217c.remove(componentNode4);
                        if (componentNode5.f20217c.isEmpty()) {
                            hashSet2.add(componentNode5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ComponentNode componentNode6 : hashSet) {
                    if (!componentNode6.f20217c.isEmpty() && !componentNode6.f20216b.isEmpty()) {
                        arrayList2.add(componentNode6.f20215a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            Component component = (Component) it.next();
            ComponentNode componentNode7 = new ComponentNode(component);
            for (Qualified qualified : component.f20199b) {
                boolean z2 = component.f20201e == 0;
                Dep dep = new Dep(qualified, !z2);
                if (!map.containsKey(dep)) {
                    map.put(dep, new HashSet());
                }
                Set set2 = (Set) map.get(dep);
                if (!set2.isEmpty() && z2) {
                    throw new IllegalArgumentException("Multiple components provide " + qualified + mo.ono);
                }
                set2.add(componentNode7);
            }
        }
    }
}
