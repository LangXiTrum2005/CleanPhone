package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.shadow.okio.Segment;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f4997d;

    public d(k kVar) {
        this.f4997d = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // m0.b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        PagerAdapter pagerAdapter;
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(k.class.getName());
        k kVar = this.f4997d;
        PagerAdapter pagerAdapter2 = kVar.mAdapter;
        if (pagerAdapter2 != null) {
            z10 = pagerAdapter2.getCount() > 1;
        }
        accessibilityEvent.setScrollable(z10);
        if (accessibilityEvent.getEventType() != 4096 || (pagerAdapter = kVar.mAdapter) == null) {
            return;
        }
        accessibilityEvent.setItemCount(pagerAdapter.getCount());
        accessibilityEvent.setFromIndex(kVar.mCurItem);
        accessibilityEvent.setToIndex(kVar.mCurItem);
    }

    @Override // m0.b
    public final void b(View view, n0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f46334a;
        this.f45679a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(k.class.getName());
        k kVar = this.f4997d;
        PagerAdapter pagerAdapter = kVar.mAdapter;
        accessibilityNodeInfo.setScrollable(pagerAdapter != null && pagerAdapter.getCount() > 1);
        if (kVar.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (kVar.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(Segment.SIZE);
        }
    }

    @Override // m0.b
    public final boolean c(View view, int i10, Bundle bundle) {
        if (super.c(view, i10, bundle)) {
            return true;
        }
        k kVar = this.f4997d;
        if (i10 == 4096) {
            if (!kVar.canScrollHorizontally(1)) {
                return false;
            }
            kVar.setCurrentItem(kVar.mCurItem + 1);
            return true;
        }
        if (i10 != 8192 || !kVar.canScrollHorizontally(-1)) {
            return false;
        }
        kVar.setCurrentItem(kVar.mCurItem - 1);
        return true;
    }
}
