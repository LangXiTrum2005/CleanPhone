package dishoard;

import android.text.TextUtils;
import babyless.marial;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: GsonParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Gson f25327attabal;

    public attabal(Gson gson) {
        this.f25327attabal = gson;
    }

    @Override // dishoard.saneness
    public <T> T attabal(String str, marial marialVar, Class cls) {
        T t;
        T t2;
        T t3;
        T t4;
        if (str == null) {
            return null;
        }
        Class<?> cls2 = marialVar.f14826dern;
        Class<?> cls3 = marialVar.f14829wireman;
        if (cls2 == null && cls != null) {
            if (marialVar.f14825attabal == '0' && (t4 = (T) competently(str, cls)) != null) {
                return t4;
            }
            if (marialVar.f14825attabal == '1' && (t3 = (T) wireman(str, cls)) != null) {
                return t3;
            }
            if (marialVar.f14825attabal == '3' && (t2 = (T) impromptu(str, cls)) != null) {
                return t2;
            }
        }
        if (cls3 == null && cls2 != null && cls != null && marialVar.f14825attabal == '2' && (t = (T) beachfront(str, cls2, cls)) != null) {
            return t;
        }
        switch (marialVar.f14825attabal) {
            case '0':
                return (T) competently(str, cls);
            case '1':
                return (T) marial(str, cls2, cls);
            case '2':
                return (T) beachfront(str, cls2, cls3);
            case '3':
                return (T) impromptu(str, cls2);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.HashMap, java.util.Map] */
    public final <K, V, T> T beachfront(String str, Class<?> cls, Class<?> cls2) {
        ?? r0 = (T) new HashMap();
        if (cls != null && cls2 != null) {
            for (Map.Entry<K, V> entry : ((Map) dern(str, new HashMap().getClass())).entrySet()) {
                r0.put(dern(saneness(entry.getKey()), cls), dern(saneness(entry.getValue()), cls2));
            }
        }
        return r0;
    }

    public final <T> T competently(String str, Class<?> cls) {
        return (T) dern(str, cls);
    }

    public <T> T dern(String str, Type type) throws JsonSyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) this.f25327attabal.fromJson(str, type);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.HashSet, java.util.Set] */
    public final <T> T impromptu(String str, Class<?> cls) {
        ?? r0 = (T) new HashSet();
        if (cls != null) {
            Iterator it = ((Set) dern(str, new HashSet().getClass())).iterator();
            while (it.hasNext()) {
                r0.add(dern(saneness(it.next()), cls));
            }
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.util.ArrayList, java.util.List] */
    public final <T> T marial(String str, Class<?> cls, Class<?> cls2) {
        if (cls == null) {
            return null;
        }
        List list = (List) dern(str, new ArrayList().getClass());
        ?? r6 = (T) new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r6.add(i, dern(saneness(list.get(i)), cls));
        }
        return r6;
    }

    @Override // dishoard.saneness
    public String saneness(Object obj) {
        return this.f25327attabal.toJson(obj);
    }

    public final <T> T wireman(String str, Class<?> cls) {
        return (T) marial(str, cls, null);
    }
}
