package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f31927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f31928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.express.node.d f31929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f31930d;

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f31929c = dVar2;
        this.f31927a = dVar;
        this.f31928b = eVar;
        this.f31930d = aVar;
    }

    public void a(Object obj) {
        this.f31930d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f31929c.a(this.f31927a, this.f31928b, this.f31930d);
    }
}
