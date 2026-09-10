package com.thinkup.core.common.no.m.o.oo;

/* JADX INFO: loaded from: classes6.dex */
public enum m {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int n0;

    m(int i2) {
        this.n0 = i2;
    }

    private static /* synthetic */ m[] o() {
        return new m[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    public static m o(int i2) {
        for (m mVar : values()) {
            if (mVar.n0 == i2) {
                return mVar;
            }
        }
        return null;
    }
}
