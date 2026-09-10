package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f4572f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j4.d f4577e;

    public o0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4573a = linkedHashMap;
        this.f4574b = new LinkedHashMap();
        this.f4575c = new LinkedHashMap();
        this.f4576d = new LinkedHashMap();
        this.f4577e = new androidx.fragment.app.i0(this, 2);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(o0 o0Var) {
        LinkedHashMap linkedHashMap = o0Var.f4573a;
        Iterator it = xj.b0.X(o0Var.f4574b).entrySet().iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                wj.f[] fVarArr = {new wj.f("keys", arrayList), new wj.f("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i10 < 2) {
                    wj.f fVar = fVarArr[i10];
                    String str2 = (String) fVar.f53283a;
                    Object obj = fVar.f53284b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        kotlin.jvm.internal.n.c(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        bundle.putSizeF(str2, (SizeF) obj);
                    }
                    i10++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle bundleA = ((j4.d) entry.getValue()).a();
            kotlin.jvm.internal.n.f(key, "key");
            if (bundleA != null) {
                while (true) {
                    if (i10 >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
                    }
                    Class cls = f4572f[i10];
                    kotlin.jvm.internal.n.c(cls);
                    if (cls.isInstance(bundleA)) {
                        break;
                    }
                    i10++;
                }
            }
            Object obj2 = o0Var.f4575c.get(key);
            f0 f0Var = obj2 instanceof f0 ? (f0) obj2 : null;
            if (f0Var != null) {
                f0Var.j(bundleA);
            } else {
                linkedHashMap.put(key, bundleA);
            }
            fn.n0 n0Var = (fn.n0) o0Var.f4576d.get(key);
            if (n0Var != null) {
                ((fn.a1) n0Var).d0(bundleA);
            }
        }
    }

    public o0() {
        this.f4573a = new LinkedHashMap();
        this.f4574b = new LinkedHashMap();
        this.f4575c = new LinkedHashMap();
        this.f4576d = new LinkedHashMap();
        this.f4577e = new androidx.fragment.app.i0(this, 2);
    }
}
