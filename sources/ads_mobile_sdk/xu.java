package ads_mobile_sdk;

import android.net.Uri;
import android.view.InputEvent;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class xu extends ContinuationImpl {
    public iv a;
    public Uri b;
    public Object c;
    public et d;
    public /* synthetic */ Object e;
    public final /* synthetic */ iv f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return iv.a(this.f, (Uri) null, (InputEvent) null, this);
    }
}
