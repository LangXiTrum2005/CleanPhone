package androidx.compose.ui.graphics.colorspace;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Adaptation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\t\b&\u0018\u0000 \b2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/attabal;", "", "", "transform", "<init>", "([F)V", "attabal", "[F", "saneness", "()[F", "wireman", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float[] transform;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal f6499dern = new C0044attabal(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal f6502wireman = new dern(new float[]{0.40024f, -0.2263f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7076f, 1.16532f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal f6500marial = new saneness(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/colorspace/attabal$attabal", "Landroidx/compose/ui/graphics/colorspace/attabal;", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0044attabal extends attabal {
        public C0044attabal(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/colorspace/attabal$dern", "Landroidx/compose/ui/graphics/colorspace/attabal;", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern extends attabal {
        public dern(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/colorspace/attabal$saneness", "Landroidx/compose/ui/graphics/colorspace/attabal;", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends attabal {
        public saneness(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.attabal$wireman, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/attabal$wireman;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/attabal;", "Bradford", "Landroidx/compose/ui/graphics/colorspace/attabal;", "attabal", "()Landroidx/compose/ui/graphics/colorspace/attabal;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final attabal attabal() {
            return attabal.f6499dern;
        }

        public Companion() {
        }
    }

    public /* synthetic */ attabal(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    public attabal(float[] fArr) {
        this.transform = fArr;
    }
}
