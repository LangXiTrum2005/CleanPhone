package com.inmobi.media;

import formularization.attabal;
import org.json.JSONObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Ng extends ContinuationImpl {
    public JSONObject a;
    public attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Og d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ng(Og og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = og;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((JSONObject) null, this);
    }
}
