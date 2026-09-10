package polder;

import android.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpolder/seminary;", "", "<init>", "()V", "Landroid/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Path;", "path", "", "attabal", "(Landroid/graphics/Outline;Landroidx/compose/ui/graphics/Path;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final seminary f35408attabal = new seminary();

    public final void attabal(Outline outline, Path path) {
        if (!(path instanceof androidx.compose.ui.graphics.attabal)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((androidx.compose.ui.graphics.attabal) path).getInternalPath());
    }
}
