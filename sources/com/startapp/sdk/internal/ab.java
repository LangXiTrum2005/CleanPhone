package com.startapp.sdk.internal;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ab implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40799a;

    public ab(String str) {
        this.f40799a = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object objOpt = ((JSONObject) obj).opt(this.f40799a);
        Object objOpt2 = ((JSONObject) obj2).opt(this.f40799a);
        if ((objOpt instanceof Comparable) && (objOpt2 instanceof Comparable)) {
            if (objOpt.getClass() == objOpt2.getClass()) {
                return ((Comparable) objOpt).compareTo(objOpt2);
            }
            if ((objOpt instanceof Number) && (objOpt2 instanceof Number)) {
                return Double.compare(((Number) objOpt).doubleValue(), ((Number) objOpt2).doubleValue());
            }
        }
        Object obj3 = JSONObject.NULL;
        if (objOpt == obj3) {
            objOpt = null;
        }
        if (objOpt2 == obj3) {
            objOpt2 = null;
        }
        if (objOpt != null && objOpt2 != null) {
            return objOpt.toString().compareTo(objOpt2.toString());
        }
        if (objOpt != null) {
            return 1;
        }
        return objOpt2 != null ? -1 : 0;
    }
}
