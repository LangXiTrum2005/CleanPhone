package androidx.customview.poolingcontainer;

import android.view.View;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PoolingContainer {
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, kotlin.jvm.functions.Function2] */
    public static final void a(View view) {
        Intrinsics.f(view, "<this>");
        Iterator itM = SequencesKt.m(ViewKt.a(view).f44670a);
        while (itM.hasNext()) {
            View view2 = (View) itM.next();
            PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view2.getTag(com.charging.screenshow.battery.animations.themes.R.id.pooling_container_listener_holder_tag);
            if (poolingContainerListenerHolder == null) {
                poolingContainerListenerHolder = new PoolingContainerListenerHolder();
                view2.setTag(com.charging.screenshow.battery.animations.themes.R.id.pooling_container_listener_holder_tag, poolingContainerListenerHolder);
            }
            ArrayList arrayList = poolingContainerListenerHolder.f4578a;
            for (int iA = CollectionsKt.A(arrayList); -1 < iA; iA--) {
                ((PoolingContainerListener) arrayList.get(iA)).a();
            }
        }
    }

    public static final void b(RecyclerView recyclerView) {
        Iterator it = new ViewGroupKt$children$1(recyclerView).getF44671a();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            }
            View view = (View) viewGroupKt$iterator$1.next();
            PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(com.charging.screenshow.battery.animations.themes.R.id.pooling_container_listener_holder_tag);
            if (poolingContainerListenerHolder == null) {
                poolingContainerListenerHolder = new PoolingContainerListenerHolder();
                view.setTag(com.charging.screenshow.battery.animations.themes.R.id.pooling_container_listener_holder_tag, poolingContainerListenerHolder);
            }
            ArrayList arrayList = poolingContainerListenerHolder.f4578a;
            for (int iA = CollectionsKt.A(arrayList); -1 < iA; iA--) {
                ((PoolingContainerListener) arrayList.get(iA)).a();
            }
        }
    }
}
