package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeMappingMode {
    public static final TypeMappingMode k = new TypeMappingMode(false, false, false, false, false, new TypeMappingMode(false, false, false, false, false, null, false, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), false, null, null, 988);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44017c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44018e;
    public final TypeMappingMode f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TypeMappingMode f44019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TypeMappingMode f44020i;
    public final boolean j;

    public static final class Companion {
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TypeMappingMode(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, TypeMappingMode typeMappingMode, boolean z7, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, int i2) {
        z2 = (i2 & 1) != 0 ? true : z2;
        z3 = (i2 & 2) != 0 ? true : z3;
        z4 = (i2 & 4) != 0 ? false : z4;
        z5 = (i2 & 8) != 0 ? false : z5;
        z6 = (i2 & 16) != 0 ? false : z6;
        typeMappingMode = (i2 & 32) != 0 ? null : typeMappingMode;
        z7 = (i2 & 64) != 0 ? true : z7;
        typeMappingMode2 = (i2 & 128) != 0 ? typeMappingMode : typeMappingMode2;
        typeMappingMode3 = (i2 & 256) != 0 ? typeMappingMode : typeMappingMode3;
        boolean z8 = (i2 & 512) == 0;
        this.f44015a = z2;
        this.f44016b = z3;
        this.f44017c = z4;
        this.d = z5;
        this.f44018e = z6;
        this.f = typeMappingMode;
        this.g = z7;
        this.f44019h = typeMappingMode2;
        this.f44020i = typeMappingMode3;
        this.j = z8;
    }
}
