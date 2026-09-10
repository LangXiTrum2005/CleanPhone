package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hb extends ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f41048b;

    public hb(Set set) {
        super(set);
        this.f41048b = new JSONObject();
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Object obj, boolean z2, boolean z3) throws SDKException {
        Object string;
        if (this.f41583a.contains(str)) {
            return;
        }
        try {
            if (obj instanceof ue) {
                string = ((ue) obj).a();
            } else {
                string = obj != null ? obj.toString() : null;
            }
            if (string != null) {
                this.f41048b.put(str, string);
            } else if (z2) {
                throw new SDKException(str);
            }
        } catch (JSONException e2) {
            if (z2) {
                throw new SDKException(str, e2);
            }
        }
    }

    public final String toString() {
        return this.f41048b.toString();
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Set set) {
        if (this.f41583a.contains(str) || set == null || set.size() <= 0) {
            return;
        }
        try {
            this.f41048b.put(str, new JSONArray((Collection) set));
        } catch (JSONException unused) {
        }
    }
}
