package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class tg extends ContinuationImpl {
    public vg a;
    public String b;
    public String c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vg f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(vg vgVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = vgVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return vg.a(this.f, null, null, this);
    }
}
