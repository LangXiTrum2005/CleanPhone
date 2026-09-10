package com.github.dart_lang.jni;

import ak.f;
import ak.k;
import cn.n0;
import jn.d;
import jn.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PortContinuation<T> implements f {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j10) {
        this.port = j10;
    }

    private native void _resumeWith(long j10, Object obj);

    @Override // ak.f
    public k getContext() {
        e eVar = n0.f6748a;
        return d.f44017b;
    }

    @Override // ak.f
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
