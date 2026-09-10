package androidx.fragment.app;

import androidx.collection.splinterproof;

/* JADX INFO: compiled from: FragmentFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final splinterproof<ClassLoader, splinterproof<String, Class<?>>> f10319attabal = new splinterproof<>();

    public static Class<?> dern(ClassLoader classLoader, String str) throws ClassNotFoundException {
        splinterproof<ClassLoader, splinterproof<String, Class<?>>> splinterproofVar = f10319attabal;
        splinterproof<String, Class<?>> splinterproofVar2 = splinterproofVar.get(classLoader);
        if (splinterproofVar2 == null) {
            splinterproofVar2 = new splinterproof<>();
            splinterproofVar.put(classLoader, splinterproofVar2);
        }
        Class<?> cls = splinterproofVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        splinterproofVar2.put(str, cls2);
        return cls2;
    }

    public static boolean saneness(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(dern(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends Fragment> wireman(ClassLoader classLoader, String str) {
        try {
            return dern(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public Fragment attabal(ClassLoader classLoader, String str) {
        throw null;
    }
}
