package restrictive;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0007\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lrestrictive/kattegat;", "Lrestrictive/milliradian;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "attabal", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "", "saneness", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "wireman", "(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "dern", "(Landroid/view/View;)J", "Landroid/view/ViewGroup;", "", "Ljava/lang/Object;", "lock", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "viewLayerContainer", "Landroid/content/ComponentCallbacks2;", "Landroid/content/ComponentCallbacks2;", "componentCallback", "marial", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class kattegat implements milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final ViewGroup ownerView;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public DrawChildContainer viewLayerContainer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Object lock = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final ComponentCallbacks2 componentCallback = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static boolean f36264beachfront = true;

    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrestrictive/kattegat$saneness;", "", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "attabal", "(Landroid/view/View;)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f36270attabal = new saneness();

        public static final long attabal(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public kattegat(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
    }

    @Override // restrictive.milliradian
    public GraphicsLayer attabal() {
        GraphicsLayerImpl wiremanVar;
        GraphicsLayer graphicsLayer;
        synchronized (this.lock) {
            try {
                long jDern = dern(this.ownerView);
                if (Build.VERSION.SDK_INT >= 29) {
                    wiremanVar = new androidx.compose.ui.graphics.layer.dern(jDern, null, null, 6, null);
                } else if (f36264beachfront) {
                    try {
                        wiremanVar = new androidx.compose.ui.graphics.layer.saneness(this.ownerView, jDern, null, null, 12, null);
                    } catch (Throwable unused) {
                        f36264beachfront = false;
                        wiremanVar = new androidx.compose.ui.graphics.layer.wireman(wireman(this.ownerView), jDern, null, null, 12, null);
                    }
                } else {
                    wiremanVar = new androidx.compose.ui.graphics.layer.wireman(wireman(this.ownerView), jDern, null, null, 12, null);
                }
                graphicsLayer = new GraphicsLayer(wiremanVar, null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return graphicsLayer;
    }

    public final long dern(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return saneness.attabal(view);
        }
        return -1L;
    }

    @Override // restrictive.milliradian
    public void saneness(GraphicsLayer layer) {
        synchronized (this.lock) {
            layer.oilcan();
            Unit unit = Unit.f29295attabal;
        }
    }

    public final DrawChildContainer wireman(ViewGroup ownerView) {
        DrawChildContainer drawChildContainer = this.viewLayerContainer;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(ownerView.getContext());
        ownerView.addView(viewLayerContainer);
        this.viewLayerContainer = viewLayerContainer;
        return viewLayerContainer;
    }
}
