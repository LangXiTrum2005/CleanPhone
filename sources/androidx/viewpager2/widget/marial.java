package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: compiled from: ScrollEventAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f13965apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ViewPager2.taiyuan f13966attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f13967beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public attabal f13968competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f13969cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final RecyclerView f13970dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f13971formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f13972impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f13973impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f13974marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ViewPager2 f13975saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f13976taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final LinearLayoutManager f13977wireman;

    /* JADX INFO: compiled from: ScrollEventAdapter.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f13978attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f13979dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f13980saneness;

        public void attabal() {
            this.f13978attabal = -1;
            this.f13980saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f13979dern = 0;
        }
    }

    public marial(ViewPager2 viewPager2) {
        this.f13975saneness = viewPager2;
        RecyclerView recyclerView = viewPager2.f13932rotuma;
        this.f13970dern = recyclerView;
        this.f13977wireman = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f13968competently = new attabal();
        formularize();
    }

    public void apical(int i, boolean z) {
        this.f13974marial = z ? 2 : 3;
        this.f13972impassible = false;
        boolean z2 = this.f13976taiyuan != i;
        this.f13976taiyuan = i;
        dern(2);
        if (z2) {
            saneness(i);
        }
    }

    public final void attabal(int i, float f, int i2) {
        ViewPager2.taiyuan taiyuanVar = this.f13966attabal;
        if (taiyuanVar != null) {
            taiyuanVar.saneness(i, f, i2);
        }
    }

    public int beachfront() {
        return this.f13967beachfront;
    }

    public boolean competently() {
        return this.f13972impassible;
    }

    public void cutely() {
        this.f13971formularize = true;
    }

    public final void dern(int i) {
        if ((this.f13974marial == 3 && this.f13967beachfront == 0) || this.f13967beachfront == i) {
            return;
        }
        this.f13967beachfront = i;
        ViewPager2.taiyuan taiyuanVar = this.f13966attabal;
        if (taiyuanVar != null) {
            taiyuanVar.attabal(i);
        }
    }

    public final void formularize() {
        this.f13974marial = 0;
        this.f13967beachfront = 0;
        this.f13968competently.attabal();
        this.f13973impromptu = -1;
        this.f13976taiyuan = -1;
        this.f13969cutely = false;
        this.f13965apical = false;
        this.f13972impassible = false;
        this.f13971formularize = false;
    }

    public void impassible(ViewPager2.taiyuan taiyuanVar) {
        this.f13966attabal = taiyuanVar;
    }

    public boolean impromptu() {
        return this.f13967beachfront == 0;
    }

    public final void kowloon() {
        int top;
        attabal attabalVar = this.f13968competently;
        int iFindFirstVisibleItemPosition = this.f13977wireman.findFirstVisibleItemPosition();
        attabalVar.f13978attabal = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            attabalVar.attabal();
            return;
        }
        View viewFindViewByPosition = this.f13977wireman.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            attabalVar.attabal();
            return;
        }
        int leftDecorationWidth = this.f13977wireman.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f13977wireman.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f13977wireman.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f13977wireman.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f13977wireman.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f13970dern.getPaddingLeft();
            if (this.f13975saneness.wireman()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f13970dern.getPaddingTop();
        }
        int i = -top;
        attabalVar.f13979dern = i;
        if (i >= 0) {
            attabalVar.f13980saneness = height == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : i / height;
        } else {
            if (!new androidx.viewpager2.widget.attabal(this.f13977wireman).wireman()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(attabalVar.f13979dern)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    public double marial() {
        kowloon();
        attabal attabalVar = this.f13968competently;
        return ((double) attabalVar.f13978attabal) + ((double) attabalVar.f13980saneness);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (!(this.f13974marial == 1 && this.f13967beachfront == 1) && i == 1) {
            triweekly(false);
            return;
        }
        if (taiyuan() && i == 2) {
            if (this.f13965apical) {
                dern(2);
                this.f13969cutely = true;
                return;
            }
            return;
        }
        if (taiyuan() && i == 0) {
            kowloon();
            if (this.f13965apical) {
                attabal attabalVar = this.f13968competently;
                if (attabalVar.f13979dern == 0) {
                    int i2 = this.f13973impromptu;
                    int i3 = attabalVar.f13978attabal;
                    if (i2 != i3) {
                        saneness(i3);
                    }
                }
            } else {
                int i4 = this.f13968competently.f13978attabal;
                if (i4 != -1) {
                    attabal(i4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                }
            }
            dern(0);
            formularize();
        }
        if (this.f13974marial == 2 && i == 0 && this.f13971formularize) {
            kowloon();
            attabal attabalVar2 = this.f13968competently;
            if (attabalVar2.f13979dern == 0) {
                int i5 = this.f13976taiyuan;
                int i6 = attabalVar2.f13978attabal;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    saneness(i6);
                }
                dern(0);
                formularize();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        attabal attabalVar;
        int i3;
        this.f13965apical = true;
        kowloon();
        if (this.f13969cutely) {
            this.f13969cutely = false;
            if (i2 > 0) {
                attabalVar = this.f13968competently;
                if (attabalVar.f13979dern != 0) {
                    i3 = attabalVar.f13978attabal + 1;
                } else {
                    i3 = this.f13968competently.f13978attabal;
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.f13975saneness.wireman()) {
                        attabalVar = this.f13968competently;
                        if (attabalVar.f13979dern != 0) {
                            i3 = attabalVar.f13978attabal + 1;
                        }
                    }
                }
                i3 = this.f13968competently.f13978attabal;
            }
            this.f13976taiyuan = i3;
            if (this.f13973impromptu != i3) {
                saneness(i3);
            }
        } else if (this.f13974marial == 0) {
            int i4 = this.f13968competently.f13978attabal;
            if (i4 == -1) {
                i4 = 0;
            }
            saneness(i4);
        }
        attabal attabalVar2 = this.f13968competently;
        int i5 = attabalVar2.f13978attabal;
        if (i5 == -1) {
            i5 = 0;
        }
        attabal(i5, attabalVar2.f13980saneness, attabalVar2.f13979dern);
        attabal attabalVar3 = this.f13968competently;
        int i6 = attabalVar3.f13978attabal;
        int i7 = this.f13976taiyuan;
        if ((i6 == i7 || i7 == -1) && attabalVar3.f13979dern == 0 && this.f13967beachfront != 1) {
            dern(0);
            formularize();
        }
    }

    public final void saneness(int i) {
        ViewPager2.taiyuan taiyuanVar = this.f13966attabal;
        if (taiyuanVar != null) {
            taiyuanVar.dern(i);
        }
    }

    public final boolean taiyuan() {
        int i = this.f13974marial;
        return i == 1 || i == 4;
    }

    public final void triweekly(boolean z) {
        this.f13972impassible = z;
        this.f13974marial = z ? 4 : 1;
        int i = this.f13976taiyuan;
        if (i != -1) {
            this.f13973impromptu = i;
            this.f13976taiyuan = -1;
        } else if (this.f13973impromptu == -1) {
            this.f13973impromptu = wireman();
        }
        dern(1);
    }

    public final int wireman() {
        return this.f13977wireman.findFirstVisibleItemPosition();
    }
}
