package earstone;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: GhostViewPort.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu extends ViewGroup implements marial {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public View f25526arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f25527graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public ViewGroup f25528kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public Matrix f25529molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final View f25530monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f25531polloi;

    /* JADX INFO: compiled from: GhostViewPort.java */
    public class attabal implements ViewTreeObserver.OnPreDrawListener {
        public attabal() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            impromptu.this.postInvalidateOnAnimation();
            impromptu impromptuVar = impromptu.this;
            ViewGroup viewGroup = impromptuVar.f25528kowloon;
            if (viewGroup == null || (view = impromptuVar.f25526arytenoidectomy) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            impromptu.this.f25528kowloon.postInvalidateOnAnimation();
            impromptu impromptuVar2 = impromptu.this;
            impromptuVar2.f25528kowloon = null;
            impromptuVar2.f25526arytenoidectomy = null;
            return true;
        }
    }

    public impromptu(View view) {
        super(view.getContext());
        this.f25527graveside = new attabal();
        this.f25530monoploid = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static void beachfront(View view) {
        impromptu impromptuVarMarial = marial(view);
        if (impromptuVarMarial != null) {
            int i = impromptuVarMarial.f25531polloi - 1;
            impromptuVarMarial.f25531polloi = i;
            if (i <= 0) {
                ((beachfront) impromptuVarMarial.getParent()).removeView(impromptuVarMarial);
            }
        }
    }

    public static void competently(View view, impromptu impromptuVar) {
        view.setTag(triweekly.ghost_view, impromptuVar);
    }

    public static void dern(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        sealless.impromptu(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        sealless.taiyuan(viewGroup, matrix);
    }

    public static impromptu marial(View view) {
        return (impromptu) view.getTag(triweekly.ghost_view);
    }

    public static impromptu saneness(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        beachfront beachfrontVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        beachfront beachfrontVarSaneness = beachfront.saneness(viewGroup);
        impromptu impromptuVarMarial = marial(view);
        if (impromptuVarMarial == null || (beachfrontVar = (beachfront) impromptuVarMarial.getParent()) == beachfrontVarSaneness) {
            i = 0;
        } else {
            i = impromptuVarMarial.f25531polloi;
            beachfrontVar.removeView(impromptuVarMarial);
            impromptuVarMarial = null;
        }
        if (impromptuVarMarial == null) {
            if (matrix == null) {
                matrix = new Matrix();
                dern(view, viewGroup, matrix);
            }
            impromptuVarMarial = new impromptu(view);
            impromptuVarMarial.impromptu(matrix);
            if (beachfrontVarSaneness == null) {
                beachfrontVarSaneness = new beachfront(viewGroup);
            } else {
                beachfrontVarSaneness.competently();
            }
            wireman(viewGroup, beachfrontVarSaneness);
            wireman(viewGroup, impromptuVarMarial);
            beachfrontVarSaneness.attabal(impromptuVarMarial);
            impromptuVarMarial.f25531polloi = i;
        } else if (matrix != null) {
            impromptuVarMarial.impromptu(matrix);
        }
        impromptuVarMarial.f25531polloi++;
        return impromptuVarMarial;
    }

    public static void wireman(View view, View view2) {
        sealless.marial(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    @Override // earstone.marial
    public void attabal(ViewGroup viewGroup, View view) {
        this.f25528kowloon = viewGroup;
        this.f25526arytenoidectomy = view;
    }

    public void impromptu(Matrix matrix) {
        this.f25529molybdenite = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        competently(this.f25530monoploid, this);
        this.f25530monoploid.getViewTreeObserver().addOnPreDrawListener(this.f25527graveside);
        sealless.competently(this.f25530monoploid, 4);
        if (this.f25530monoploid.getParent() != null) {
            ((View) this.f25530monoploid.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f25530monoploid.getViewTreeObserver().removeOnPreDrawListener(this.f25527graveside);
        sealless.competently(this.f25530monoploid, 0);
        competently(this.f25530monoploid, null);
        if (this.f25530monoploid.getParent() != null) {
            ((View) this.f25530monoploid.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        earstone.attabal.attabal(canvas, true);
        canvas.setMatrix(this.f25529molybdenite);
        sealless.competently(this.f25530monoploid, 0);
        this.f25530monoploid.invalidate();
        sealless.competently(this.f25530monoploid, 4);
        drawChild(canvas, this.f25530monoploid, getDrawingTime());
        earstone.attabal.attabal(canvas, false);
    }

    @Override // android.view.View, earstone.marial
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (marial(this.f25530monoploid) == this) {
            sealless.competently(this.f25530monoploid, i == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
