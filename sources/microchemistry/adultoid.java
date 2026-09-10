package microchemistry;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoundedPolygon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001\u001fB'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b)\u0010\"¨\u0006+"}, d2 = {"Lmicrochemistry/adultoid;", "", "", "Lmicrochemistry/competently;", X3.a.v, "", "centerX", "centerY", "<init>", "(Ljava/util/List;FF)V", "Lmicrochemistry/monoploid;", "f", "impromptu", "(Lmicrochemistry/monoploid;)Lmicrochemistry/adultoid;", "", "toString", "()Ljava/lang/String;", "", "bounds", "wireman", "([F)[F", "", "approximate", "saneness", "([FZ)[F", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "attabal", "Ljava/util/List;", "competently", "()Ljava/util/List;", "F", "marial", "()F", "dern", "beachfront", "Lmicrochemistry/wireman;", "getCubics", "cubics", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class adultoid {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<competently> features;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final float centerY;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final float centerX;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<wireman> cubics;

    /* JADX INFO: renamed from: microchemistry.adultoid$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RoundedPolygon.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmicrochemistry/adultoid$attabal;", "", "<init>", "()V", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public adultoid(List<? extends competently> features, float f, float f2) {
        List<wireman> listPolloi;
        List<wireman> listPolloi2;
        wireman wiremanVar;
        List<wireman> listAttabal;
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
        this.centerX = f;
        this.centerY = f2;
        List listDern = p002kotlin.collections.graveside.dern();
        int i = 0;
        wireman wiremanVar2 = null;
        if (features.size() <= 0 || ((competently) features.get(0)).attabal().size() != 3) {
            listPolloi = null;
            listPolloi2 = null;
        } else {
            Pair<wireman, wireman> pairImpassible = ((competently) features.get(0)).attabal().get(1).impassible(0.5f);
            wireman wiremanVarComponent1 = pairImpassible.component1();
            wireman wiremanVarComponent2 = pairImpassible.component2();
            listPolloi2 = p002kotlin.collections.adultoid.polloi(((competently) features.get(0)).attabal().get(0), wiremanVarComponent1);
            listPolloi = p002kotlin.collections.adultoid.polloi(wiremanVarComponent2, ((competently) features.get(0)).attabal().get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i2 = 0;
            wireman wiremanVar3 = null;
            while (true) {
                if (i2 == 0 && listPolloi != null) {
                    listAttabal = listPolloi;
                } else if (i2 != this.features.size()) {
                    listAttabal = this.features.get(i2).attabal();
                } else if (listPolloi2 == null) {
                    break;
                } else {
                    listAttabal = listPolloi2;
                }
                int size2 = listAttabal.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    wireman wiremanVar4 = listAttabal.get(i3);
                    if (!wiremanVar4.arytenoidectomy()) {
                        if (wiremanVar3 != null) {
                            listDern.add(wiremanVar3);
                        }
                        if (wiremanVar2 == null) {
                            wiremanVar2 = wiremanVar4;
                            wiremanVar3 = wiremanVar2;
                        } else {
                            wiremanVar3 = wiremanVar4;
                        }
                    } else if (wiremanVar3 != null) {
                        wiremanVar3.getPoints()[6] = wiremanVar4.wireman();
                        wiremanVar3.getPoints()[7] = wiremanVar4.marial();
                    }
                }
                if (i2 == size) {
                    break;
                } else {
                    i2++;
                }
            }
            wiremanVar = wiremanVar2;
            wiremanVar2 = wiremanVar3;
        } else {
            wiremanVar = null;
        }
        if (wiremanVar2 != null && wiremanVar != null) {
            listDern.add(marial.attabal(wiremanVar2.saneness(), wiremanVar2.dern(), wiremanVar2.beachfront(), wiremanVar2.competently(), wiremanVar2.impromptu(), wiremanVar2.taiyuan(), wiremanVar.saneness(), wiremanVar.dern()));
        }
        List<wireman> listAttabal2 = p002kotlin.collections.graveside.attabal(listDern);
        this.cubics = listAttabal2;
        wireman wiremanVar5 = listAttabal2.get(listAttabal2.size() - 1);
        int size3 = listAttabal2.size();
        while (i < size3) {
            wireman wiremanVar6 = this.cubics.get(i);
            wireman wiremanVar7 = wiremanVar5;
            if (Math.abs(wiremanVar6.saneness() - wiremanVar7.wireman()) > 1.0E-4f || Math.abs(wiremanVar6.dern() - wiremanVar7.marial()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i++;
            wiremanVar5 = wiremanVar6;
        }
    }

    public static /* synthetic */ float[] dern(adultoid adultoidVar, float[] fArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return adultoidVar.saneness(fArr, z);
    }

    public final float[] attabal(float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return dern(this, bounds, false, 2, null);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final float getCenterY() {
        return this.centerY;
    }

    public final List<competently> competently() {
        return this.features;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof adultoid) {
            return Intrinsics.wireman(this.features, ((adultoid) other).features);
        }
        return false;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public final adultoid impromptu(monoploid f) {
        Intrinsics.checkNotNullParameter(f, "f");
        long jImpassible = arytenoidectomy.impassible(androidx.collection.competently.saneness(this.centerX, this.centerY), f);
        List listDern = p002kotlin.collections.graveside.dern();
        int size = this.features.size();
        for (int i = 0; i < size; i++) {
            listDern.add(this.features.get(i).saneness(f));
        }
        return new adultoid(p002kotlin.collections.graveside.attabal(listDern), arytenoidectomy.competently(jImpassible), arytenoidectomy.impromptu(jImpassible));
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final float getCenterX() {
        return this.centerX;
    }

    public final float[] saneness(float[] bounds, boolean approximate) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.cubics.size();
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            this.cubics.get(i).attabal(bounds, approximate);
            fMin = Math.min(fMin, bounds[0]);
            fMin2 = Math.min(fMin2, bounds[1]);
            fMax = Math.max(fMax, bounds[2]);
            fMax2 = Math.max(fMax2, bounds[3]);
        }
        bounds[0] = fMin;
        bounds[1] = fMin2;
        bounds[2] = fMax;
        bounds[3] = fMax2;
        return bounds;
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + CollectionsKt.preterite(this.cubics, null, null, null, 0, null, null, 63, null) + " || Features = " + CollectionsKt.preterite(this.features, null, null, null, 0, null, null, 63, null) + " || Center = (" + this.centerX + ", " + this.centerY + ")]";
    }

    public final float[] wireman(float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.cubics.size();
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < size; i++) {
            wireman wiremanVar = this.cubics.get(i);
            float fMarial = preprohormone.marial(wiremanVar.saneness() - this.centerX, wiremanVar.dern() - this.centerY);
            long jApical = wiremanVar.apical(0.5f);
            fMax = Math.max(fMax, Math.max(fMarial, preprohormone.marial(arytenoidectomy.competently(jApical) - this.centerX, arytenoidectomy.impromptu(jApical) - this.centerY)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        float f = this.centerX;
        bounds[0] = f - fSqrt;
        float f2 = this.centerY;
        bounds[1] = f2 - fSqrt;
        bounds[2] = f + fSqrt;
        bounds[3] = f2 + fSqrt;
        return bounds;
    }
}
