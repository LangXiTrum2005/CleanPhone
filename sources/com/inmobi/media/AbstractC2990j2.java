package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import kotlinx.coroutines.flow.formularize;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2990j2 {
    public final Context a;

    public AbstractC2990j2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public abstract Object a(FrameLayout frameLayout, C3025kc c3025kc);

    public abstract Object a(ContinuationImpl continuationImpl);

    public abstract void a();

    public abstract void a(formularize formularizeVar);

    public abstract void b();
}
