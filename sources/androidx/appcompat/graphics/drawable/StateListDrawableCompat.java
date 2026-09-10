package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: loaded from: classes.dex */
public class StateListDrawableCompat extends DrawableContainerCompat {
    public StateListState o0;
    public boolean p0;

    public static class StateListState extends DrawableContainerCompat.DrawableContainerState {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int[][] f3417I;

        public StateListState(StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            super(stateListState, stateListDrawableCompat, resources);
            if (stateListState != null) {
                this.f3417I = stateListState.f3417I;
            } else {
                this.f3417I = new int[this.g.length][];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void d() {
            int[][] iArr = this.f3417I;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f3417I[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f3417I = iArr2;
        }

        public final int e(int[] iArr) {
            int[][] iArr2 = this.f3417I;
            int i2 = this.f3408h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new StateListDrawableCompat(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawableCompat(this, resources);
        }
    }

    public StateListDrawableCompat(StateListState stateListState, Resources resources) {
        e(new StateListState(stateListState, this, resources));
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void e(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.e(drawableContainerState);
        if (drawableContainerState instanceof StateListState) {
            this.o0 = (StateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public StateListState b() {
        return new StateListState(this.o0, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.p0) {
            super.mutate();
            this.o0.d();
            this.p0 = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iE = this.o0.e(iArr);
        if (iE < 0) {
            iE = this.o0.e(StateSet.WILD_CARD);
        }
        return d(iE) || zOnStateChange;
    }
}
