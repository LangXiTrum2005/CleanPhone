package com.google.firebase.datastorage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorageKt {
    public static final Object a(MutablePreferences mutablePreferences, Preferences.Key key, Serializable serializable) {
        Intrinsics.f(mutablePreferences, "<this>");
        Intrinsics.f(key, "key");
        Object objCopyOf = mutablePreferences.f4725a.get(key);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.e(objCopyOf, "copyOf(this, size)");
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }
}
