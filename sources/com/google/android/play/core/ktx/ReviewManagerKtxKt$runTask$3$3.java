package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", g.f39715A, "Ljava/lang/Exception;", "Lkotlin/jvm/internal/EnhancedNullability;", "onFailure"}, k = 3, mv = {2, 0, 0}, xi = 48)
final class ReviewManagerKtxKt$runTask$3$3 implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception) {
        Intrinsics.f(exception, "exception");
        ResultKt.a(exception);
        throw null;
    }
}
