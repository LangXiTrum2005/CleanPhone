package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import restrictive.creditor;
import restrictive.sealless;
import supplicat.impassible;

/* JADX INFO: compiled from: ComposeDragShadowBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/draganddrop/attabal;", "Landroid/view/View$DragShadowBuilder;", "Lmilliradian/wireman;", "density", "Lsupplicat/impassible;", "decorationSize", "Lkotlin/Function1;", "Lmerc/beachfront;", "", "drawDragDecoration", "<init>", "(Lmilliradian/wireman;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "attabal", "Lmilliradian/wireman;", "saneness", "J", "dern", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final milliradian.wireman density;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Function1<merc.beachfront, Unit> drawDragDecoration;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long decorationSize;

    public /* synthetic */ attabal(milliradian.wireman wiremanVar, long j, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, j, function1);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        merc.attabal attabalVar = new merc.attabal();
        milliradian.wireman wiremanVar = this.density;
        long j = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        creditor creditorVarAttabal = sealless.attabal(canvas);
        Function1<merc.beachfront, Unit> function1 = this.drawDragDecoration;
        merc.attabal.DrawParams drawParams = attabalVar.getDrawParams();
        milliradian.wireman density = drawParams.getDensity();
        LayoutDirection layoutDirectionSaneness = drawParams.saneness();
        creditor canvas2 = drawParams.getCanvas();
        long jWireman = drawParams.wireman();
        merc.attabal.DrawParams drawParams2 = attabalVar.getDrawParams();
        drawParams2.cutely(wiremanVar);
        drawParams2.apical(layoutDirection);
        drawParams2.taiyuan(creditorVarAttabal);
        drawParams2.formularize(j);
        creditorVarAttabal.formularize();
        function1.invoke(attabalVar);
        creditorVarAttabal.impromptu();
        merc.attabal.DrawParams drawParams3 = attabalVar.getDrawParams();
        drawParams3.cutely(density);
        drawParams3.apical(layoutDirectionSaneness);
        drawParams3.taiyuan(canvas2);
        drawParams3.formularize(jWireman);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        milliradian.wireman wiremanVar = this.density;
        outShadowSize.set(wiremanVar.arytenoidectomy(wiremanVar.trm(impassible.competently(this.decorationSize))), wiremanVar.arytenoidectomy(wiremanVar.trm(impassible.beachfront(this.decorationSize))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public attabal(milliradian.wireman wiremanVar, long j, Function1<? super merc.beachfront, Unit> function1) {
        this.density = wiremanVar;
        this.decorationSize = j;
        this.drawDragDecoration = function1;
    }
}
