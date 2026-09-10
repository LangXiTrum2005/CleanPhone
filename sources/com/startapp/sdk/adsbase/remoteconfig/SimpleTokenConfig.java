package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.vf;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleTokenConfig implements Serializable {
    private static final long serialVersionUID = 2058698844345650499L;
    private boolean enabled = false;

    public final boolean a(Context context) {
        Boolean boolB;
        a aVarA = a.a(context);
        return !((vf) aVarA.G.a()).getBoolean("userDisabledSimpleToken", false) && this.enabled && (boolB = ((h6) aVarA.j.a()).b()) != null && boolB.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.enabled == ((SimpleTokenConfig) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
