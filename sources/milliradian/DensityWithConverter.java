package milliradian;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: milliradian.competently, reason: from toString */
/* JADX INFO: compiled from: AndroidDensity.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lmilliradian/competently;", "Lmilliradian/wireman;", "", "density", "fontScale", "Ltreadless/attabal;", "converter", "<init>", "(FFLtreadless/attabal;)V", "Lmilliradian/graveside;", "Lmilliradian/impromptu;", "impromptu", "(J)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "kowloon", "F", "getDensity", "()F", "arytenoidectomy", "kattegat", "monoploid", "Ltreadless/attabal;", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DensityWithConverter implements wireman {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata and from toString */
    public final float fontScale;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
    public final float density;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata and from toString */
    public final treadless.attabal converter;

    public DensityWithConverter(float f, float f2, treadless.attabal attabalVar) {
        this.density = f;
        this.fontScale = f2;
        this.converter = attabalVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) other;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && Intrinsics.wireman(this.converter, densityWithConverter.converter);
    }

    @Override // milliradian.wireman
    public float getDensity() {
        return this.density;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // milliradian.apical
    public float impromptu(long j) {
        if (dovishness.competently(graveside.competently(j), dovishness.INSTANCE.saneness())) {
            return impromptu.wireman(this.converter.attabal(graveside.impromptu(j)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // milliradian.apical
    /* JADX INFO: renamed from: kattegat, reason: from getter */
    public float getFontScale() {
        return this.fontScale;
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
