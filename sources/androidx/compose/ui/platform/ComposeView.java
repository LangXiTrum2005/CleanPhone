package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.licking;
import androidx.compose.runtime.miliaria;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "attabal", "(Landroidx/compose/runtime/taiyuan;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/czestochowa;", "gintrap", "Landroidx/compose/runtime/czestochowa;", "", "<set-?>", "rotuma", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.czestochowa<Function2<androidx.compose.runtime.taiyuan, Integer, Unit>> content;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void attabal(androidx.compose.runtime.taiyuan taiyuanVar, final int i) {
        int i2;
        androidx.compose.runtime.taiyuan taiyuanVarAttabal = taiyuanVar.attabal(420213850);
        if ((i & 6) == 0) {
            i2 = (taiyuanVarAttabal.impassible(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && taiyuanVarAttabal.saneness()) {
            taiyuanVarAttabal.kowloon();
        } else {
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.mathsort(420213850, i2, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            Function2<androidx.compose.runtime.taiyuan, Integer, Unit> value = this.content.getValue();
            if (value == null) {
                taiyuanVarAttabal.graveside(358373017);
            } else {
                taiyuanVarAttabal.graveside(150107752);
                value.invoke(taiyuanVarAttabal, 0);
            }
            taiyuanVarAttabal.polloi();
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.peridotite();
            }
        }
        licking lickingVarDern = taiyuanVarAttabal.dern();
        if (lickingVarDern != null) {
            lickingVarDern.attabal(new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.ComposeView$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p002kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar2, Integer num) {
                    invoke(taiyuanVar2, num.intValue());
                    return Unit.f29295attabal;
                }

                public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar2, int i3) {
                    this.$tmp0_rcvr.attabal(taiyuanVar2, androidx.compose.runtime.outmarry.attabal(i | 1));
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(Function2<? super androidx.compose.runtime.taiyuan, ? super Integer, Unit> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(content);
        if (isAttachedToWindow()) {
            wireman();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.content = miliaria.saneness(null, null, 2, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
