package monroe;

import android.graphics.Typeface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TypefaceCompatApi28Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly extends impassible {
    @Override // monroe.impassible
    public Typeface cutely(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f33595competently, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f33598impassible.invoke(null, objNewInstance, C.SANS_SERIF_NAME, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // monroe.impassible
    public Method dovishness(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
