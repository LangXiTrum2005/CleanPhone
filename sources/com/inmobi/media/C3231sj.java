package com.inmobi.media;

import android.widget.ImageView;
import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3231sj extends ContinuationImpl {
    public List a;
    public ImageView b;
    public Ref$BooleanRef c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3331wj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3231sj(C3331wj c3331wj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c3331wj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((List) null, (ImageView) null, this);
    }
}
