package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Fm extends ContinuationImpl {
    public MediaPlayer a;
    public InterfaceC3072m9 b;
    public Iterator c;
    public String d;
    public /* synthetic */ Object e;
    public int f;

    public Fm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return Mm.a((MediaPlayer) null, (ArrayList) null, (C3097n9) null, this);
    }
}
