package androidx.compose.ui.graphics.colorspace;

import com.ironsource.C3414a2;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.dent;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000 92\u00020\u0001:\u0001(B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J'\u0010(\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\u0014J\u0019\u0010)\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010+R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u00107\u001a\u0004\b8\u00101R\u0011\u0010:\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b9\u00101R\u0014\u0010=\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/dern;", "", "", "name", "Landroidx/compose/ui/graphics/colorspace/saneness;", L6.B, "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component", "", "beachfront", "(I)F", "marial", "r", "g", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "apical", "(FFF)[F", "v", "formularize", "([F)[F", "v0", "v1", "v2", "", "cutely", "(FFF)J", "impassible", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lrestrictive/overspeculate;", "triweekly", "(FFFFLandroidx/compose/ui/graphics/colorspace/dern;)J", "attabal", "saneness", "toString", "()Ljava/lang/String;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "impromptu", "J", "competently", "()J", "I", "wireman", "dern", "componentCount", "taiyuan", "()Z", "isSrgb", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long model;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int id;

    public /* synthetic */ dern(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public final float[] apical(float r, float g, float b) {
        return formularize(new float[]{r, g, b});
    }

    public final float[] attabal(float x, float y, float z) {
        float[] fArr = new float[saneness.beachfront(this.model)];
        fArr[0] = x;
        fArr[1] = y;
        fArr[2] = z;
        return saneness(fArr);
    }

    public abstract float beachfront(int component);

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final long getModel() {
        return this.model;
    }

    public long cutely(float v0, float v1, float v2) {
        float[] fArrApical = apical(v0, v1, v2);
        float f = fArrApical[0];
        float f2 = fArrApical[1];
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public final int dern() {
        return saneness.beachfront(this.model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        dern dernVar = (dern) other;
        if (this.id == dernVar.id && Intrinsics.wireman(this.name, dernVar.name)) {
            return saneness.marial(this.model, dernVar.model);
        }
        return false;
    }

    public abstract float[] formularize(float[] v);

    public int hashCode() {
        return (((this.name.hashCode() * 31) + saneness.competently(this.model)) * 31) + this.id;
    }

    public float impassible(float v0, float v1, float v2) {
        return apical(v0, v1, v2)[2];
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public abstract float marial(int component);

    public abstract float[] saneness(float[] v);

    /* JADX INFO: renamed from: taiyuan */
    public boolean getIsSrgb() {
        return false;
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) saneness.impromptu(this.model)) + ')';
    }

    public long triweekly(float x, float y, float z, float a, dern colorSpace) {
        float[] fArrAttabal = attabal(x, y, z);
        return dent.attabal(fArrAttabal[0], fArrAttabal[1], fArrAttabal[2], a, colorSpace);
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public dern(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
