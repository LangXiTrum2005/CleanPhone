package androidx.compose.ui.window;

import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.czestochowa;
import androidx.compose.runtime.graveside;
import androidx.compose.runtime.licking;
import androidx.compose.runtime.outmarry;
import androidx.compose.runtime.polloi;
import androidx.compose.runtime.snapshots.yemenite;
import androidx.compose.runtime.taiyuan;
import androidx.compose.runtime.tout;
import androidx.compose.ui.layout.competently;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.setterwort;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import milliradian.kowloon;
import milliradian.monoploid;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0001\rJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J#\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0010\u0010\u0005J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010\u0005J\u0019\u0010$\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00107\u001a\u0002018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010\u0005\u001a\u0004\b4\u00105R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R5\u0010H\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR/\u0010O\u001a\u0004\u0018\u00010I2\b\u0010A\u001a\u0004\u0018\u00010I8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010C\u001a\u0004\bb\u0010c\"\u0004\b\u000b\u0010dR$\u0010h\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00168\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010WR\u0014\u0010k\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\"\u0010o\u001a\u00020n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0014\u0010w\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/setterwort;", "", "apical", "()V", "formularize", "Landroidx/compose/runtime/graveside;", "parent", "Lkotlin/Function0;", "content", "setContent", "(Landroidx/compose/runtime/graveside;Lkotlin/jvm/functions/Function2;)V", "attabal", "(Landroidx/compose/runtime/taiyuan;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "impromptu", "(II)V", "", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "competently", "(ZIIII)V", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "impassible", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "layoutDirection", "setLayoutDirection", "(I)V", "", "gintrap", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "testTag", "Landroid/view/WindowManager$LayoutParams;", "rotuma", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "params", "Landroidx/compose/ui/unit/LayoutDirection;", "preprohormone", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Lmilliradian/monoploid;", "<set-?>", "cord", "Landroidx/compose/runtime/czestochowa;", "getPopupContentSize-bOM6tXw", "()Lmilliradian/monoploid;", "setPopupContentSize-fhxjrPA", "(Lmilliradian/monoploid;)V", "popupContentSize", "Landroidx/compose/ui/layout/competently;", "cuirassed", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/competently;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/competently;)V", "parentLayoutCoordinates", "Lmilliradian/kowloon;", "stratoscope", "Lmilliradian/kowloon;", "parentBounds", "trm", "Landroidx/compose/runtime/tout;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Landroidx/compose/runtime/snapshots/yemenite;", "oilcan", "Landroidx/compose/runtime/snapshots/yemenite;", "snapshotStateObserver", "", "yemenite", "Ljava/lang/Object;", "backCallback", "sealless", "getContent", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "kattegat", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "Landroidx/compose/ui/window/dern;", "positionProvider", "Landroidx/compose/ui/window/dern;", "getPositionProvider", "()Landroidx/compose/ui/window/dern;", "setPositionProvider", "(Landroidx/compose/ui/window/dern;)V", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "supplicat", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PopupLayout extends AbstractComposeView implements setterwort {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final czestochowa popupContentSize;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final czestochowa parentLayoutCoordinates;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public String testTag;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final yemenite snapshotStateObserver;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final czestochowa content;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public kowloon parentBounds;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final tout canCalculatePosition;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public Object backCallback;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public static final int f7948restrictive = 8;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static final Function1<PopupLayout, Unit> f7947merc = new Function1<PopupLayout, Unit>() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PopupLayout popupLayout) {
            invoke2(popupLayout);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.impassible();
            }
        }
    };

    private final Function2<taiyuan, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final competently getParentLayoutCoordinates() {
        return (competently) this.parentLayoutCoordinates.getValue();
    }

    private final void setContent(Function2<? super taiyuan, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    private final void setParentLayoutCoordinates(competently competentlyVar) {
        this.parentLayoutCoordinates.setValue(competentlyVar);
    }

    public final void apical() {
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void attabal(taiyuan taiyuanVar, final int i) {
        int i2;
        taiyuan taiyuanVarAttabal = taiyuanVar.attabal(-857613600);
        if ((i & 6) == 0) {
            i2 = (taiyuanVarAttabal.impassible(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && taiyuanVarAttabal.saneness()) {
            taiyuanVarAttabal.kowloon();
        } else {
            if (polloi.grimness()) {
                polloi.mathsort(-857613600, i2, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(taiyuanVarAttabal, 0);
            if (polloi.grimness()) {
                polloi.peridotite();
            }
        }
        licking lickingVarDern = taiyuanVarAttabal.dern();
        if (lickingVarDern != null) {
            lickingVarDern.attabal(new Function2<taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p002kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(taiyuan taiyuanVar2, Integer num) {
                    invoke(taiyuanVar2, num.intValue());
                    return Unit.f29295attabal;
                }

                public final void invoke(taiyuan taiyuanVar2, int i3) {
                    this.$tmp0_rcvr.attabal(taiyuanVar2, outmarry.attabal(i | 1));
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void competently(boolean changed, int left, int top, int right, int bottom) {
        super.competently(changed, left, top, right, bottom);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() != 4) {
            return super.dispatchKeyEvent(event);
        }
        throw null;
    }

    public final void formularize() {
        if (Build.VERSION.SDK_INT >= 33) {
            saneness.marial(this, this.backCallback);
        }
        this.backCallback = null;
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final monoploid m24getPopupContentSizebOM6tXw() {
        return (monoploid) this.popupContentSize.getValue();
    }

    public final dern getPositionProvider() {
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.setterwort
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public final void impassible() {
        monoploid monoploidVarM24getPopupContentSizebOM6tXw;
        if (this.parentBounds == null || (monoploidVarM24getPopupContentSizebOM6tXw = m24getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        monoploidVarM24getPopupContentSizebOM6tXw.getPackedValue();
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void impromptu(int widthMeasureSpec, int heightMeasureSpec) {
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.monoploid();
        apical();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.polloi();
        this.snapshotStateObserver.beachfront();
        formularize();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        throw null;
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m25setPopupContentSizefhxjrPA(monoploid monoploidVar) {
        this.popupContentSize.setValue(monoploidVar);
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void setContent(graveside parent, Function2<? super taiyuan, ? super Integer, Unit> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // androidx.compose.ui.platform.setterwort
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setPositionProvider(dern dernVar) {
    }
}
