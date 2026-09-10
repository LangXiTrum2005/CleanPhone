package ads_mobile_sdk;

import kotlinx.coroutines.gintrap;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class iy extends ContinuationImpl {
    public ky a;
    public CronetProvider b;
    public gintrap c;
    public CronetEngine.Builder d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ky f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(ky kyVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = kyVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ky.a(this.f, null, null, this);
    }
}
