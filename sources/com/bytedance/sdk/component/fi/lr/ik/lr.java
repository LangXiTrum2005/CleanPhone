package com.bytedance.sdk.component.fi.lr.ik;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.fi.aw;
import com.bytedance.sdk.component.fi.nr;
import com.bytedance.sdk.component.fi.qt;
import com.bytedance.sdk.component.fi.vr;
import com.bytedance.sdk.component.utils.slm;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements vr {
    private volatile di ri;

    private lr() {
    }

    private void lr(Context context, aw awVar) {
        if (awVar == null) {
            awVar = fi.ri(context);
        }
        this.ri = new di(context, awVar);
    }

    public static vr ri(Context context, aw awVar) {
        lr lrVar = new lr();
        lrVar.lr(context, awVar);
        return lrVar;
    }

    @Override // com.bytedance.sdk.component.fi.vr
    public qt ri(String str) {
        return new ik.lr(this.ri).ik(str);
    }

    @Override // com.bytedance.sdk.component.fi.vr
    public InputStream ri(String str, String str2) {
        byte[] bArrRi;
        if (this.ri != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = slm.ri(str);
            }
            nr nrVarIk = this.ri.ik();
            if (nrVarIk != null && (bArrRi = nrVarIk.ri(str2)) != null) {
                return new ByteArrayInputStream(bArrRi);
            }
            Collection<com.bytedance.sdk.component.fi.ik> collectionKa = this.ri.ka();
            if (collectionKa != null) {
                Iterator<com.bytedance.sdk.component.fi.ik> it = collectionKa.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamRi = it.next().ri(str2);
                    if (inputStreamRi != null) {
                        return inputStreamRi;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fi.vr
    public boolean ri(String str, String str2, String str3) {
        if (this.ri == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = slm.ri(str);
        }
        com.bytedance.sdk.component.fi.ik ikVarRi = this.ri.ri(str3);
        if (ikVarRi != null) {
            return ikVarRi.lr(str2);
        }
        return false;
    }
}
