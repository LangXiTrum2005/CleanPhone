package be;

import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f5591e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f5592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f5593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f5594d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f5591e = map;
    }

    public a0(Class cls, z zVar) {
        super(zVar);
        this.f5594d = new HashMap();
        com.bumptech.glide.c cVar = de.c.f38839a;
        Constructor constructorQ = cVar.q(cls);
        this.f5592b = constructorQ;
        de.c.f(constructorQ);
        String[] strArrT = cVar.t(cls);
        for (int i10 = 0; i10 < strArrT.length; i10++) {
            this.f5594d.put(strArrT[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f5592b.getParameterTypes();
        this.f5593c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f5593c[i11] = f5591e.get(parameterTypes[i11]);
        }
    }

    @Override // be.x
    public final Object d() {
        return (Object[]) this.f5593c.clone();
    }

    @Override // be.x
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f5592b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            com.bumptech.glide.c cVar = de.c.f38839a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException | InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + de.c.b(constructor) + "' with args " + Arrays.toString(objArr), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + de.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // be.x
    public final void f(Object obj, ge.a aVar, w wVar) {
        Object[] objArr = (Object[]) obj;
        String str = wVar.f5682c;
        Integer num = (Integer) this.f5594d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + de.c.b(this.f5592b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = wVar.f5685f.b(aVar);
        if (objB != null || !wVar.f5686g) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbK = d5.u.k("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbK.append(aVar.r());
            throw new com.google.gson.k(sbK.toString());
        }
    }
}
