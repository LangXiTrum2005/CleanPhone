package oj;

import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f47465a = {kotlin.jvm.internal.d0.f44761a.g(new kotlin.jvm.internal.v(a0.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0.b f47466b = j1.f.E("FlutterSharedPreferences", null, null, 14);

    public static final s0.i a(Context context) {
        kotlin.jvm.internal.n.f(context, "<this>");
        return (s0.i) f47466b.getValue(context, f47465a[0]);
    }

    public static final boolean b(String key, Object obj, Set set) {
        kotlin.jvm.internal.n.f(key, "key");
        if (set == null) {
            return (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double);
        }
        return set.contains(key);
    }

    public static final Object c(Object obj, ne.c cVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!an.p.p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
            if (!an.p.p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false)) {
                return obj;
            }
            String strSubstring = str.substring(40);
            kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
            return Double.valueOf(Double.parseDouble(strSubstring));
        }
        if (an.p.p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return obj;
        }
        String listString = str.substring(40);
        kotlin.jvm.internal.n.e(listString, "substring(...)");
        cVar.getClass();
        kotlin.jvm.internal.n.f(listString, "listString");
        Object object = new c0(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
        kotlin.jvm.internal.n.d(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) object) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
