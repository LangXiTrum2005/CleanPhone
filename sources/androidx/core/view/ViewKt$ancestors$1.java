package androidx.core.view;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
