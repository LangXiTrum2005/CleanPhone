package restrictive;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R*\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R*\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R*\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R*\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b(\u0010\u0016R0\u00100\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00103\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R*\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R*\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0012\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R*\u0010=\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u0016R*\u0010@\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0012\u001a\u0004\b>\u0010\u0014\"\u0004\b?\u0010\u0016R0\u0010C\u001a\u00020A2\u0006\u0010\u0010\u001a\u00020A8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b\b\u0010-\"\u0004\bB\u0010/R*\u0010J\u001a\u00020D2\u0006\u0010\u0010\u001a\u00020D8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\b'\u0010G\"\u0004\bH\u0010IR*\u0010Q\u001a\u00020K2\u0006\u0010\u0010\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR0\u0010V\u001a\u00020R2\u0006\u0010\u0010\u001a\u00020R8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bS\u0010\t\u001a\u0004\bT\u0010\u000b\"\u0004\bU\u0010\rR(\u0010Z\u001a\u00020W8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\bX\u0010-\"\u0004\bY\u0010/R\"\u0010b\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010i\u001a\u00020c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR.\u0010r\u001a\u0004\u0018\u00010j2\b\u0010k\u001a\u0004\u0018\u00010j8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u0014R\u0014\u0010u\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0014R.\u0010w\u001a\u0004\u0018\u00010v2\b\u0010\u0010\u001a\u0004\u0018\u00010v8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006}"}, d2 = {"Lrestrictive/underbelly;", "Lrestrictive/treadless;", "<init>", "()V", "", "stratoscope", "itchy", "", "kowloon", "I", "formularize", "()I", "setMutatedFields$ui_release", "(I)V", "mutatedFields", "", "value", "arytenoidectomy", "F", "monoploid", "()F", "overspeculate", "(F)V", "scaleX", "cord", "clubfoot", "scaleY", "polloi", "attabal", "oilcan", "alpha", "molybdenite", "gintrap", "milliradian", "translationX", "graveside", "dovishness", "treadless", "translationY", "adultoid", "dent", "shadowElevation", "Lrestrictive/overspeculate;", "J", "saneness", "()J", "sealless", "(J)V", "ambientShadowColor", "cuirassed", "premeiotic", "spotShadowColor", "rotuma", "peridotite", "rotationX", "preprohormone", "competently", "mathsort", "rotationY", "taiyuan", "splinterproof", "rotationZ", "apical", "supplicat", "cameraDistance", "Lrestrictive/picketboat;", "timberyard", "transformOrigin", "Lrestrictive/wostteth;", "trm", "Lrestrictive/wostteth;", "()Lrestrictive/wostteth;", "permissivist", "(Lrestrictive/wostteth;)V", "shape", "", "Z", "wireman", "()Z", "grimness", "(Z)V", "clip", "Lrestrictive/permissivist;", "yemenite", "marial", "privatdozent", "compositingStrategy", "Lsupplicat/impassible;", "dern", "cultivated", "size", "Lmilliradian/wireman;", "kattegat", "Lmilliradian/wireman;", "beachfront", "()Lmilliradian/wireman;", "starveling", "(Lmilliradian/wireman;)V", "graphicsDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "cutely", "()Landroidx/compose/ui/unit/LayoutDirection;", "hydrovane", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/graphics/dern;", "<set-?>", "restrictive", "Landroidx/compose/ui/graphics/dern;", "impassible", "()Landroidx/compose/ui/graphics/dern;", "setOutline$ui_release", "(Landroidx/compose/ui/graphics/dern;)V", "outline", "getDensity", "density", "fontScale", "Lrestrictive/sensatory;", "renderEffect", "Lrestrictive/sensatory;", "triweekly", "()Lrestrictive/sensatory;", "walach", "(Lrestrictive/sensatory;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class underbelly implements treadless {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public float shadowElevation;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public float rotationZ;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int mutatedFields;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public boolean clip;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public float rotationY;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.graphics.dern outline;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public float rotationX;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public float scaleX = 1.0f;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public float scaleY = 1.0f;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public float alpha = 1.0f;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public long ambientShadowColor = itchy.attabal();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public long spotShadowColor = itchy.attabal();

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public long transformOrigin = picketboat.INSTANCE.attabal();

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public wostteth shape = androidx.compose.ui.graphics.beachfront.attabal();

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public int compositingStrategy = permissivist.INSTANCE.attabal();

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public long size = supplicat.impassible.INSTANCE.attabal();

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public milliradian.wireman graphicsDensity = milliradian.beachfront.saneness(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: adultoid, reason: from getter */
    public wostteth getShape() {
        return this.shape;
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: apical, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final milliradian.wireman getGraphicsDensity() {
        return this.graphicsDensity;
    }

    public void clubfoot(float f) {
        if (this.scaleY == f) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f;
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: competently, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: cord, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: cuirassed, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public void cultivated(long j) {
        this.size = j;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public void dent(float f) {
        if (this.shadowElevation == f) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    @Override // milliradian.wireman
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    public void grimness(boolean z) {
        if (this.clip != z) {
            this.mutatedFields |= 16384;
            this.clip = z;
        }
    }

    public final void hydrovane(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final androidx.compose.ui.graphics.dern getOutline() {
        return this.outline;
    }

    public final void itchy() {
        this.outline = getShape().attabal(getSize(), this.layoutDirection, this.graphicsDensity);
    }

    @Override // milliradian.apical
    /* JADX INFO: renamed from: kattegat */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    public void mathsort(float f) {
        if (this.rotationY == f) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f;
    }

    public void milliradian(float f) {
        if (this.translationX == f) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f;
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    public void oilcan(float f) {
        if (this.alpha == f) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f;
    }

    public void overspeculate(float f) {
        if (this.scaleX == f) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f;
    }

    public void peridotite(float f) {
        if (this.rotationX == f) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f;
    }

    public void permissivist(wostteth wosttethVar) {
        if (Intrinsics.wireman(this.shape, wosttethVar)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = wosttethVar;
    }

    public void premeiotic(long j) {
        if (overspeculate.formularize(this.spotShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j;
    }

    public void privatdozent(int i) {
        if (permissivist.beachfront(this.compositingStrategy, i)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i;
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: rotuma, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public void sealless(long j) {
        if (overspeculate.formularize(this.ambientShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j;
    }

    public void splinterproof(float f) {
        if (this.rotationZ == f) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f;
    }

    public final void starveling(milliradian.wireman wiremanVar) {
        this.graphicsDensity = wiremanVar;
    }

    public final void stratoscope() {
        overspeculate(1.0f);
        clubfoot(1.0f);
        oilcan(1.0f);
        milliradian(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        treadless(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        dent(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        sealless(itchy.attabal());
        premeiotic(itchy.attabal());
        peridotite(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        mathsort(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        splinterproof(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        supplicat(8.0f);
        timberyard(picketboat.INSTANCE.attabal());
        permissivist(androidx.compose.ui.graphics.beachfront.attabal());
        grimness(false);
        walach(null);
        privatdozent(permissivist.INSTANCE.attabal());
        cultivated(supplicat.impassible.INSTANCE.attabal());
        this.outline = null;
        this.mutatedFields = 0;
    }

    public void supplicat(float f) {
        if (this.cameraDistance == f) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f;
    }

    @Override // restrictive.treadless
    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    public void timberyard(long j) {
        if (picketboat.dern(this.transformOrigin, j)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j;
    }

    public void treadless(float f) {
        if (this.translationY == f) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f;
    }

    public sensatory triweekly() {
        return null;
    }

    public void walach(sensatory sensatoryVar) {
        if (Intrinsics.wireman(null, sensatoryVar)) {
            return;
        }
        this.mutatedFields |= 131072;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }
}
