package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import setterwort.wireman;
import wostteth.marial;

/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object PROTECTION_VIEW = new Object();
    private setterwort.attabal mGroup;
    private final List<attabal> mProtections;

    public ProtectionLayout(Context context) {
        super(context);
        this.mProtections = new ArrayList();
    }

    private void addProtectionView(Context context, int i, attabal attabalVar) {
        attabalVar.dern();
        int iMarial = attabalVar.marial();
        if (iMarial == 1 || iMarial == 2 || iMarial == 4 || iMarial == 8) {
            throw null;
        }
        throw new IllegalArgumentException("Unexpected side: " + attabalVar.marial());
    }

    private void addProtectionViews() {
        if (this.mProtections.isEmpty()) {
            return;
        }
        this.mGroup = new setterwort.attabal(getOrInstallSystemBarStateMonitor(), this.mProtections);
        int childCount = getChildCount();
        int iTaiyuan = this.mGroup.taiyuan();
        for (int i = 0; i < iTaiyuan; i++) {
            addProtectionView(getContext(), i + childCount, this.mGroup.impromptu(i));
        }
    }

    private wireman getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(marial.tag_system_bar_state_monitor);
        if (tag instanceof wireman) {
            return (wireman) tag;
        }
        wireman wiremanVar = new wireman(viewGroup);
        viewGroup.setTag(marial.tag_system_bar_state_monitor, wiremanVar);
        return wiremanVar;
    }

    private void maybeUninstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(marial.tag_system_bar_state_monitor);
        if (tag instanceof wireman) {
            wireman wiremanVar = (wireman) tag;
            if (wiremanVar.apical()) {
                return;
            }
            wiremanVar.impromptu();
            viewGroup.setTag(marial.tag_system_bar_state_monitor, null);
        }
    }

    private void removeProtectionViews() {
        if (this.mGroup != null) {
            removeViews(getChildCount() - this.mGroup.taiyuan(), this.mGroup.taiyuan());
            if (this.mGroup.taiyuan() > 0) {
                this.mGroup.impromptu(0).dern();
                throw null;
            }
            this.mGroup.competently();
            this.mGroup = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != PROTECTION_VIEW) {
            setterwort.attabal attabalVar = this.mGroup;
            int childCount = getChildCount() - (attabalVar != null ? attabalVar.taiyuan() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mGroup != null) {
            removeProtectionViews();
        }
        addProtectionViews();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeProtectionViews();
        maybeUninstallSystemBarStateMonitor();
    }

    public void setProtections(List<attabal> list) {
        this.mProtections.clear();
        this.mProtections.addAll(list);
        if (isAttachedToWindow()) {
            removeProtectionViews();
            addProtectionViews();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context, List<attabal> list) {
        super(context);
        this.mProtections = new ArrayList();
        setProtections(list);
    }
}
