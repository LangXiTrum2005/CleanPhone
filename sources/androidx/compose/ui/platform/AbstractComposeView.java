package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\"J7\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0004¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J!\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00109J)\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010<J#\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010?J+\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010@J+\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\bA\u0010BJ3\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010C\u001a\u00020$H\u0014¢\u0006\u0004\bA\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u00101R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR(\u0010P\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010X\u001a\u0004\u0018\u00010\r2\b\u0010K\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bU\u0010V\"\u0004\bW\u0010\u0015R$\u0010]\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010\fR0\u0010c\u001a\u00020$2\u0006\u0010K\u001a\u00020$8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bb\u0010\f\u001a\u0004\b`\u00101\"\u0004\ba\u00103R\u0016\u0010e\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010_R\u0016\u0010g\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R\u0018\u0010j\u001a\u00020$*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bk\u00101R\u0011\u0010n\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bm\u00101¨\u0006o"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "dern", "()V", "Landroidx/compose/runtime/graveside;", "saneness", "(Landroidx/compose/runtime/graveside;)Landroidx/compose/runtime/graveside;", "cutely", "()Landroidx/compose/runtime/graveside;", "beachfront", "parent", "setParentCompositionContext", "(Landroidx/compose/runtime/graveside;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", X3.f.e, "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "attabal", "(Landroidx/compose/runtime/taiyuan;I)V", "wireman", "marial", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "impromptu", "", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "(ZIIII)V", "competently", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "kowloon", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "arytenoidectomy", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Landroidx/compose/runtime/molybdenite;", "monoploid", "Landroidx/compose/runtime/molybdenite;", "composition", "polloi", "Landroidx/compose/runtime/graveside;", "setParentContext", "parentContext", "Lkotlin/Function0;", "molybdenite", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", "graveside", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "adultoid", "creatingComposition", "dovishness", "isTransitionGroupSet", "taiyuan", "(Landroidx/compose/runtime/graveside;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public boolean creatingComposition;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public IBinder previousAttachedWindowToken;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public boolean isTransitionGroupSet;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public WeakReference<androidx.compose.runtime.graveside> cachedViewTreeCompositionContext;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> disposeViewCompositionStrategy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.molybdenite composition;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.graveside parentContext;

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void setParentContext(androidx.compose.runtime.graveside gravesideVar) {
        if (this.parentContext != gravesideVar) {
            this.parentContext = gravesideVar;
            if (gravesideVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            androidx.compose.runtime.molybdenite molybdeniteVar = this.composition;
            if (molybdeniteVar != null) {
                molybdeniteVar.attabal();
                this.composition = null;
                if (isAttachedToWindow()) {
                    beachfront();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        dern();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        dern();
        return super.addViewInLayout(child, index, params);
    }

    public abstract void attabal(androidx.compose.runtime.taiyuan taiyuanVar, int i);

    public final void beachfront() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = immediately.saneness(this, cutely(), cuirassed.wireman.saneness(-656146368, true, new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @Override // p002kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar, Integer num) {
                        invoke(taiyuanVar, num.intValue());
                        return Unit.f29295attabal;
                    }

                    public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar, int i) {
                        if ((i & 3) == 2 && taiyuanVar.saneness()) {
                            taiyuanVar.kowloon();
                            return;
                        }
                        if (androidx.compose.runtime.polloi.grimness()) {
                            androidx.compose.runtime.polloi.mathsort(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
                        }
                        this.this$0.attabal(taiyuanVar, 0);
                        if (androidx.compose.runtime.polloi.grimness()) {
                            androidx.compose.runtime.polloi.peridotite();
                        }
                    }
                }));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    public void competently(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public final androidx.compose.runtime.graveside cutely() {
        androidx.compose.runtime.graveside gravesideVar;
        androidx.compose.runtime.graveside gravesideVarSaneness = this.parentContext;
        if (gravesideVarSaneness == null) {
            androidx.compose.runtime.graveside gravesideVarWireman = WindowRecomposer_androidKt.wireman(this);
            androidx.compose.runtime.graveside gravesideVar2 = null;
            gravesideVarSaneness = gravesideVarWireman != null ? saneness(gravesideVarWireman) : null;
            if (gravesideVarSaneness == null) {
                WeakReference<androidx.compose.runtime.graveside> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (gravesideVar = weakReference.get()) != null && taiyuan(gravesideVar)) {
                    gravesideVar2 = gravesideVar;
                }
                return gravesideVar2 == null ? saneness(WindowRecomposer_androidKt.impromptu(this)) : gravesideVar2;
            }
        }
        return gravesideVarSaneness;
    }

    public final void dern() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void impromptu(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    public final void marial() {
        androidx.compose.runtime.molybdenite molybdeniteVar = this.composition;
        if (molybdeniteVar != null) {
            molybdeniteVar.attabal();
        }
        this.composition = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            beachfront();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        competently(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        beachfront();
        impromptu(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    public final androidx.compose.runtime.graveside saneness(androidx.compose.runtime.graveside gravesideVar) {
        androidx.compose.runtime.graveside gravesideVar2 = taiyuan(gravesideVar) ? gravesideVar : null;
        if (gravesideVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(gravesideVar2);
        }
        return gravesideVar;
    }

    public final void setParentCompositionContext(androidx.compose.runtime.graveside parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.peridotite) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy strategy) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.attabal(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean taiyuan(androidx.compose.runtime.graveside gravesideVar) {
        return !(gravesideVar instanceof Recomposer) || ((Recomposer) gravesideVar).coi().getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    public final void wireman() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        beachfront();
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        dern();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        dern();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.INSTANCE.attabal().attabal(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        dern();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        dern();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        dern();
        super.addView(child, index, params);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
