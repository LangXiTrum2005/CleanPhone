package androidx.compose.ui.graphics;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "attabal", "()Landroidx/compose/ui/graphics/Path;", "", PglCryptUtils.KEY_MESSAGE, "", "dern", "(Ljava/lang/String;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "Landroid/graphics/Path$Direction;", "wireman", "(Landroidx/compose/ui/graphics/Path$Direction;)Landroid/graphics/Path$Direction;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: compiled from: AndroidPath.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6719attabal;

        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Path.Direction.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6719attabal = iArr;
        }
    }

    public static final Path attabal() {
        return new androidx.compose.ui.graphics.attabal(null, 1, 0 == true ? 1 : 0);
    }

    public static final void dern(String str) {
        throw new IllegalStateException(str);
    }

    public static final android.graphics.Path.Direction wireman(Path.Direction direction) {
        int i = attabal.f6719attabal[direction.ordinal()];
        if (i == 1) {
            return android.graphics.Path.Direction.CCW;
        }
        if (i == 2) {
            return android.graphics.Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
