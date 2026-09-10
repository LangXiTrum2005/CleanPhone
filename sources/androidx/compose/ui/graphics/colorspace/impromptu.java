package androidx.compose.ui.graphics.colorspace;

import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.dent;
import restrictive.overspeculate;

/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000  2\u00020\u0001:\u0002\u0011\u0016B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/impromptu;", "", "Landroidx/compose/ui/graphics/colorspace/dern;", "source", "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/triweekly;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/dern;Landroidx/compose/ui/graphics/colorspace/dern;Landroidx/compose/ui/graphics/colorspace/dern;Landroidx/compose/ui/graphics/colorspace/dern;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/dern;Landroidx/compose/ui/graphics/colorspace/dern;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lrestrictive/overspeculate;", "color", "attabal", "(J)J", "Landroidx/compose/ui/graphics/colorspace/dern;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/dern;", "saneness", "getDestination", "dern", "wireman", "marial", "I", "getRenderIntent-uksYyKA", "()I", "beachfront", "[F", "competently", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class impromptu {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final dern source;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final float[] transform;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final dern transformSource;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final int renderIntent;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final dern destination;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final dern transformDestination;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.impromptu$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/impromptu$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/dern;", "source", "Landroidx/compose/ui/graphics/colorspace/impromptu;", "dern", "(Landroidx/compose/ui/graphics/colorspace/dern;)Landroidx/compose/ui/graphics/colorspace/impromptu;", "destination", "Landroidx/compose/ui/graphics/colorspace/triweekly;", "intent", "", "saneness", "(Landroidx/compose/ui/graphics/colorspace/dern;Landroidx/compose/ui/graphics/colorspace/dern;I)[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final impromptu dern(dern source) {
            return new C0045attabal(source, triweekly.INSTANCE.dern());
        }

        public final float[] saneness(dern source, dern destination, int intent) {
            if (!triweekly.beachfront(intent, triweekly.INSTANCE.attabal())) {
                return null;
            }
            long model = source.getCom.ironsource.L6.B java.lang.String();
            androidx.compose.ui.graphics.colorspace.saneness.Companion companion = androidx.compose.ui.graphics.colorspace.saneness.INSTANCE;
            boolean zMarial = androidx.compose.ui.graphics.colorspace.saneness.marial(model, companion.saneness());
            boolean zMarial2 = androidx.compose.ui.graphics.colorspace.saneness.marial(destination.getCom.ironsource.L6.B java.lang.String(), companion.saneness());
            if (zMarial && zMarial2) {
                return null;
            }
            if (!zMarial && !zMarial2) {
                return null;
            }
            if (!zMarial) {
                source = destination;
            }
            Intrinsics.competently(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) source;
            float[] fArrDern = zMarial ? rgb.getWhitePoint().dern() : apical.f6488attabal.dern();
            float[] fArrDern2 = zMarial2 ? rgb.getWhitePoint().dern() : apical.f6488attabal.dern();
            return new float[]{fArrDern[0] / fArrDern2[0], fArrDern[1] / fArrDern2[1], fArrDern[2] / fArrDern2[2]};
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.impromptu$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Connector.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"androidx/compose/ui/graphics/colorspace/impromptu$attabal$attabal", "Landroidx/compose/ui/graphics/colorspace/impromptu;", "Lrestrictive/overspeculate;", "color", "attabal", "(J)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0045attabal extends impromptu {
            public C0045attabal(dern dernVar, int i) {
                super(dernVar, dernVar, i, null);
            }

            @Override // androidx.compose.ui.graphics.colorspace.impromptu
            public long attabal(long color) {
                return color;
            }
        }
    }

    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0010ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/impromptu$saneness;", "Landroidx/compose/ui/graphics/colorspace/impromptu;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/triweekly;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lrestrictive/overspeculate;", "color", "attabal", "(J)J", "source", "destination", "", "saneness", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "impromptu", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "taiyuan", "cutely", "[F", "mTransform", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends impromptu {

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public final float[] mTransform;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public final Rgb mSource;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public final Rgb mDestination;

        public /* synthetic */ saneness(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        @Override // androidx.compose.ui.graphics.colorspace.impromptu
        public long attabal(long color) {
            float fMonoploid = overspeculate.monoploid(color);
            float fArytenoidectomy = overspeculate.arytenoidectomy(color);
            float fTriweekly = overspeculate.triweekly(color);
            float fImpassible = overspeculate.impassible(color);
            float fAttabal = (float) this.mSource.getEotfFunc().attabal(fMonoploid);
            float fAttabal2 = (float) this.mSource.getEotfFunc().attabal(fArytenoidectomy);
            float fAttabal3 = (float) this.mSource.getEotfFunc().attabal(fTriweekly);
            float[] fArr = this.mTransform;
            return dent.attabal((float) this.mDestination.getOetfFunc().attabal((fArr[0] * fAttabal) + (fArr[3] * fAttabal2) + (fArr[6] * fAttabal3)), (float) this.mDestination.getOetfFunc().attabal((fArr[1] * fAttabal) + (fArr[4] * fAttabal2) + (fArr[7] * fAttabal3)), (float) this.mDestination.getOetfFunc().attabal((fArr[2] * fAttabal) + (fArr[5] * fAttabal2) + (fArr[8] * fAttabal3)), fImpassible, this.mDestination);
        }

        public final float[] saneness(Rgb source, Rgb destination, int intent) {
            if (wireman.beachfront(source.getWhitePoint(), destination.getWhitePoint())) {
                return wireman.formularize(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrDern = source.getWhitePoint().dern();
            float[] fArrDern2 = destination.getWhitePoint().dern();
            WhitePoint whitePoint = source.getWhitePoint();
            apical apicalVar = apical.f6488attabal;
            if (!wireman.beachfront(whitePoint, apicalVar.saneness())) {
                float[] transform2 = attabal.INSTANCE.attabal().getTransform();
                float[] fArrDern3 = apicalVar.dern();
                float[] fArrCopyOf = Arrays.copyOf(fArrDern3, fArrDern3.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                transform = wireman.formularize(wireman.marial(transform2, fArrDern, fArrCopyOf), source.getTransform());
            }
            if (!wireman.beachfront(destination.getWhitePoint(), apicalVar.saneness())) {
                float[] transform3 = attabal.INSTANCE.attabal().getTransform();
                float[] fArrDern4 = apicalVar.dern();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrDern4, fArrDern4.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                inverseTransform = wireman.apical(wireman.formularize(wireman.marial(transform3, fArrDern2, fArrCopyOf2), destination.getTransform()));
            }
            if (triweekly.beachfront(intent, triweekly.INSTANCE.attabal())) {
                transform = wireman.impassible(new float[]{fArrDern[0] / fArrDern2[0], fArrDern[1] / fArrDern2[1], fArrDern[2] / fArrDern2[2]}, transform);
            }
            return wireman.formularize(inverseTransform, transform);
        }

        public saneness(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = saneness(rgb, rgb2, i);
        }
    }

    public /* synthetic */ impromptu(dern dernVar, dern dernVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dernVar, dernVar2, i);
    }

    public long attabal(long color) {
        float fMonoploid = overspeculate.monoploid(color);
        float fArytenoidectomy = overspeculate.arytenoidectomy(color);
        float fTriweekly = overspeculate.triweekly(color);
        float fImpassible = overspeculate.impassible(color);
        long jCutely = this.transformSource.cutely(fMonoploid, fArytenoidectomy, fTriweekly);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jCutely >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jCutely & 4294967295L));
        float fImpassible2 = this.transformSource.impassible(fMonoploid, fArytenoidectomy, fTriweekly);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fImpassible2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        return this.transformDestination.triweekly(f, fIntBitsToFloat2, fImpassible2, fImpassible, this.destination);
    }

    public /* synthetic */ impromptu(dern dernVar, dern dernVar2, dern dernVar3, dern dernVar4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(dernVar, dernVar2, dernVar3, dernVar4, i, fArr);
    }

    public impromptu(dern dernVar, dern dernVar2, dern dernVar3, dern dernVar4, int i, float[] fArr) {
        this.source = dernVar;
        this.destination = dernVar2;
        this.transformSource = dernVar3;
        this.transformDestination = dernVar4;
        this.renderIntent = i;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public impromptu(dern dernVar, dern dernVar2, int i) {
        long model = dernVar.getCom.ironsource.L6.B java.lang.String();
        androidx.compose.ui.graphics.colorspace.saneness.Companion companion = androidx.compose.ui.graphics.colorspace.saneness.INSTANCE;
        this(dernVar, dernVar2, androidx.compose.ui.graphics.colorspace.saneness.marial(model, companion.saneness()) ? wireman.wireman(dernVar, apical.f6488attabal.saneness(), null, 2, null) : dernVar, androidx.compose.ui.graphics.colorspace.saneness.marial(dernVar2.getCom.ironsource.L6.B java.lang.String(), companion.saneness()) ? wireman.wireman(dernVar2, apical.f6488attabal.saneness(), null, 2, null) : dernVar2, i, INSTANCE.saneness(dernVar, dernVar2, i), null);
    }
}
