package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzgxh implements PrivilegedExceptionAction {
    static final /* synthetic */ zzgxh zza = new zzgxh();

    private /* synthetic */ zzgxh() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() throws IllegalAccessException {
        int i2 = zzgxg.zzd.zzg;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
