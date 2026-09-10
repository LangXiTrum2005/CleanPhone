package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import restrictive.underbelly;
import supplicat.MutableRect;

/* JADX INFO: compiled from: OwnedLayer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0019J\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010#J9\u0010(\u001a\u00020\u00042\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H&¢\u0006\u0004\b(\u0010)ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/walach;", "", "Lrestrictive/underbelly;", "scope", "", "beachfront", "(Lrestrictive/underbelly;)V", "Lsupplicat/competently;", X3.i.L, "", "marial", "(J)Z", "Lmilliradian/impassible;", "impromptu", "(J)V", "Lmilliradian/monoploid;", "size", "wireman", "Lrestrictive/creditor;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "attabal", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "taiyuan", "()V", "invalidate", "destroy", "point", "inverse", "saneness", "(JZ)J", "Lsupplicat/marial;", "rect", "competently", "(Lsupplicat/marial;Z)V", "Lkotlin/Function2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "dern", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface walach {
    void attabal(restrictive.creditor canvas, GraphicsLayer parentLayer);

    void beachfront(underbelly scope);

    void competently(MutableRect rect, boolean inverse);

    void dern(Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer);

    void destroy();

    void impromptu(long position);

    void invalidate();

    boolean marial(long position);

    long saneness(long point, boolean inverse);

    void taiyuan();

    void wireman(long size);
}
