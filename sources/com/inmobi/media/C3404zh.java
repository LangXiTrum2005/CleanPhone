package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.kowloon;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3404zh extends ContinuationImpl {
    public String a;
    public String b;
    public kowloon c;
    public List d;
    public Ne e;
    public List f;
    public Iterator g;
    public List h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Bh p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3404zh(Bh bh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.p = bh;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, null, null, null, this);
    }
}
