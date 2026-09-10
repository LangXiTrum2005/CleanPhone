package com.google.android.gms.internal.ads;

import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxq {
    public static Object zza(String str, String str2, zzfxp... zzfxpVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Class.forName(str).getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
    }
}
