package com.mbridge.msdk.config.component.common.express.node;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f31893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f31894b;

    public f(d dVar, d dVar2) {
        this.f31893a = dVar;
        this.f31894b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        try {
            Object objA = this.f31893a.a(dVar, eVar, aVar);
            String str = (String) this.f31894b.a(dVar, eVar, aVar);
            if (objA != null && !TextUtils.isEmpty(str)) {
                int i10 = Integer.parseInt(str);
                if (objA instanceof Object[]) {
                    if (i10 < ((Object[]) objA).length) {
                        return ((Object[]) objA)[i10];
                    }
                } else if (objA instanceof int[]) {
                    if (i10 < ((int[]) objA).length) {
                        return Integer.valueOf(((int[]) objA)[i10]);
                    }
                } else if (objA instanceof long[]) {
                    if (i10 < ((long[]) objA).length) {
                        return Long.valueOf(((long[]) objA)[i10]);
                    }
                } else if (objA instanceof double[]) {
                    if (i10 < ((double[]) objA).length) {
                        return Double.valueOf(((double[]) objA)[i10]);
                    }
                } else if (objA instanceof float[]) {
                    if (i10 < ((float[]) objA).length) {
                        return Float.valueOf(((float[]) objA)[i10]);
                    }
                } else if (objA instanceof boolean[]) {
                    if (i10 < ((boolean[]) objA).length) {
                        return Boolean.valueOf(((boolean[]) objA)[i10]);
                    }
                } else if (objA instanceof char[]) {
                    if (i10 < ((char[]) objA).length) {
                        return Character.valueOf(((char[]) objA)[i10]);
                    }
                } else if (objA instanceof byte[]) {
                    if (i10 < ((byte[]) objA).length) {
                        return Byte.valueOf(((byte[]) objA)[i10]);
                    }
                } else if (objA instanceof short[]) {
                    if (i10 < ((short[]) objA).length) {
                        return Short.valueOf(((short[]) objA)[i10]);
                    }
                } else if ((objA instanceof List) && i10 < ((List) objA).size()) {
                    return ((List) objA).get(i10);
                }
                return null;
            }
            return null;
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("IndexAccessNode error: "), "IndexAccessNode");
        }
    }
}
