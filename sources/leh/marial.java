package leh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridSpaceItemDecoration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lleh/marial;", "Landroidx/recyclerview/widget/RecyclerView$triweekly;", "", "spanCount", "rowSpacing", "columnSpacing", "", "excludeHeader", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "footerAdapter", "<init>", "(IIIZLandroidx/recyclerview/widget/RecyclerView$Adapter;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$rotuma;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$rotuma;)V", "attabal", "I", "saneness", "dern", "wireman", "Z", "marial", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class marial extends RecyclerView.triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int spanCount;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int columnSpacing;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final RecyclerView.Adapter<?> footerAdapter;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int rowSpacing;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final boolean excludeHeader;

    public marial(int i, int i2, int i3, boolean z, RecyclerView.Adapter<?> adapter) {
        this.spanCount = i;
        this.rowSpacing = i2;
        this.columnSpacing = i3;
        this.excludeHeader = z;
        this.footerAdapter = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.triweekly
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.rotuma state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (this.excludeHeader && childAdapterPosition == 0) {
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        RecyclerView.Adapter<?> adapter2 = this.footerAdapter;
        if (adapter2 == null || adapter2.getItemCount() <= 0 || adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
            if (this.excludeHeader) {
                childAdapterPosition--;
            }
            int i = this.spanCount;
            int i2 = childAdapterPosition % i;
            int i3 = this.columnSpacing;
            outRect.left = (i2 * i3) / i;
            outRect.right = i3 - (((i2 + 1) * i3) / i);
            if (childAdapterPosition >= i) {
                outRect.top = this.rowSpacing;
            }
        }
    }

    public /* synthetic */ marial(int i, int i2, int i3, boolean z, RecyclerView.Adapter adapter, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? null : adapter);
    }
}
