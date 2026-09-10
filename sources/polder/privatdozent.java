package polder;

import android.view.RenderNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: GraphicsLayerV23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lpolder/privatdozent;", "", "<init>", "()V", "Landroid/view/RenderNode;", "renderNode", "", "attabal", "(Landroid/view/RenderNode;)I", "target", "", "dern", "(Landroid/view/RenderNode;I)V", "saneness", "wireman", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class privatdozent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final privatdozent f35405attabal = new privatdozent();

    public final int attabal(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final void dern(RenderNode renderNode, int target) {
        renderNode.setAmbientShadowColor(target);
    }

    public final int saneness(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void wireman(RenderNode renderNode, int target) {
        renderNode.setSpotShadowColor(target);
    }
}
