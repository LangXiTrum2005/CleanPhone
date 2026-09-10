package com.startapp.sdk.internal;

import android.content.pm.Signature;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Signature) obj).toCharsString().compareTo(((Signature) obj2).toCharsString());
    }
}
