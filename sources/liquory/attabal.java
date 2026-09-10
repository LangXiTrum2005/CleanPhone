package liquory;

import ads_mobile_sdk.kn0;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.ads.AdSize;
import com.google.common.base.triweekly;
import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.j;
import java.util.Objects;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \r2\u00020\u0001:\u0001\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u001f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b \u0010\u000eR\u0017\u0010#\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u0017\u0010\u0013¨\u0006$"}, d2 = {"Lliquory/attabal;", "", "", "width", "height", "<init>", "(II)V", "Landroid/content/Context;", "context", "marial", "(Landroid/content/Context;)I", "dern", "", "competently", "()Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "attabal", "I", "wireman", "saneness", "Z", "beachfront", "isAnchoredAdaptiveBanner", "impromptu", "isInlineAdaptiveBanner", "taiyuan", "isLargeAnchoredAdaptiveBanner", "Ljava/lang/String;", "formatString", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class attabal {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final attabal f33064impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final attabal f33065impromptu;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final String formatString;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final boolean isAnchoredAdaptiveBanner;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final boolean isLargeAnchoredAdaptiveBanner;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final boolean isInlineAdaptiveBanner;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final attabal f33066taiyuan = new attabal(AdSize.FULL_BANNER_WIDTH, 60);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final attabal f33062cutely = new attabal(320, 100);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final attabal f33060apical = new attabal(AdSize.LEADERBOARD_WIDTH, 90);

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final attabal f33063formularize = new attabal(AdSize.MEDIUM_RECTANGLE_WIDTH, AdSize.MEDIUM_RECTANGLE_HEIGHT);

    /* JADX INFO: renamed from: liquory.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010%\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u0014\u0010/\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0018R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0018¨\u00065"}, d2 = {"Lliquory/attabal$attabal;", "", "Landroid/content/Context;", "context", "", "width", "Lliquory/attabal;", "apical", "(Landroid/content/Context;I)Lliquory/attabal;", "cutely", "taiyuan", "formularize", "competently", "wireman", "impassible", "impromptu", "marial", "maxHeight", "beachfront", "(II)Lliquory/attabal;", "", "ADAPTIVE_MAXIMUM_PERCENT_HEIGHT", "D", "ANCHORED_ADAPTIVE_MAXIMUM_HEIGHT_PIXELS", "I", j.a, "Lliquory/attabal;", "BANNER_HEIGHT", "BANNER_WIDTH", "", "CUSTOM_AD_SIZE_SUFFIX", "Ljava/lang/String;", "FLUID", "FULL_BANNER", "FULL_BANNER_HEIGHT", "FULL_BANNER_WIDTH", "LARGE_ANCHORED_ADAPTIVE_MAXIMUM_HEIGHT_PIXELS", "LARGE_ANCHORED_ADAPTIVE_MAXIMUM_PERCENT_HEIGHT", "LARGE_BANNER", "LARGE_BANNER_HEIGHT", "LARGE_BANNER_WIDTH", j.d, "LEADERBOARD_HEIGHT", "LEADERBOARD_WIDTH", "MATCH_PARENT", "MAXIMALLY_UPSCALED_BANNER_HEIGHT", "MAXIMALLY_UPSCALED_FULL_BANNER_HEIGHT", j.g, "MEDIUM_RECTANGLE_HEIGHT", "MEDIUM_RECTANGLE_WIDTH", "MINIMUM_ADAPTIVE_BANNER_HEIGHT", "MINIMUM_RECOMMENDED_INLINE_HEIGHT", "WRAP_CONTENT", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static int attabal(Context context, int i) {
            Resources resources = context.getApplicationContext().getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return (i == resources.getConfiguration().orientation || i == 0) ? pastie.dern.wireman(displayMetrics.heightPixels / displayMetrics.density) : pastie.dern.wireman(displayMetrics.widthPixels / displayMetrics.density);
        }

        public static attabal dern(Context context, int i, int i2) {
            return new attabal(i, Math.max(Math.min(Math.max(100, pastie.dern.wireman((i / 320.0f) * 100)), Math.min(Opcodes.FCMPG, pastie.dern.dern(((double) attabal(context, i2)) * 0.2d))), 50), null, false, false, true, 28);
        }

        public static attabal saneness(Context context, int i, int i2) {
            int iWireman;
            int iMin = Math.min(90, pastie.dern.dern(((double) attabal(context, i2)) * 0.15d));
            if (i > 655) {
                iWireman = pastie.dern.wireman((i / 728.0f) * 90);
            } else if (i > 632) {
                iWireman = 81;
            } else if (i > 526) {
                iWireman = pastie.dern.wireman((i / 468.0f) * 60);
            } else {
                iWireman = i > 432 ? 68 : pastie.dern.wireman((i / 320.0f) * 50);
            }
            return new attabal(i, Math.max(Math.min(iWireman, iMin), 50), null, true, false, false, 52);
        }

        public final attabal apical(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dern(context, width, 1);
        }

        public final attabal beachfront(int width, int maxHeight) {
            if (maxHeight < 50) {
                triweekly triweeklyVar = kn0.a;
                kn0.c("The maximum height set for the inline adaptive ad size was " + maxHeight + " dp, which is below the minimum recommended value of 50 dp.", null);
            }
            if (maxHeight >= 1) {
                return new attabal(width, maxHeight, null, false, true, false, 44);
            }
            throw new IllegalArgumentException(("Invalid maxHeight for inline adaptive banner: " + maxHeight).toString());
        }

        @patroclinal.wireman
        public final attabal competently(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return saneness(context, width, 2);
        }

        public final attabal cutely(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dern(context, width, 2);
        }

        @patroclinal.wireman
        public final attabal formularize(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return saneness(context, width, 1);
        }

        public final attabal impassible(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return beachfront(width, attabal(context, 1));
        }

        public final attabal impromptu(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return beachfront(width, attabal(context, 2));
        }

        public final attabal marial(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return beachfront(width, attabal(context, 0));
        }

        public final attabal taiyuan(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dern(context, width, 0);
        }

        @patroclinal.wireman
        public final attabal wireman(Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            return saneness(context, width, 0);
        }

        public Companion() {
        }
    }

    static {
        boolean z = false;
        boolean z2 = false;
        f33065impromptu = new attabal(320, 50, "320x50_mb", false, z2, z, 56);
        f33064impassible = new attabal(-3, -4, "320x50_mb", z2, z, false, 56);
    }

    public attabal(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.width = i;
        this.height = i2;
        this.isAnchoredAdaptiveBanner = z;
        this.isInlineAdaptiveBanner = z2;
        this.isLargeAnchoredAdaptiveBanner = z3;
        if (str == null) {
            str = i + "x" + i2 + "_as";
        }
        this.formatString = str;
        if (i < 0 && i != -3) {
            throw new IllegalArgumentException(("Invalid width for AdSize: " + i).toString());
        }
        if (i2 < 0 && i2 != -4) {
            throw new IllegalArgumentException(("Invalid height for AdSize: " + i2).toString());
        }
        if (z2 && z) {
            throw new IllegalArgumentException("AdSize cannot be both inline and anchored adaptive");
        }
        if (z2 && z3) {
            throw new IllegalArgumentException("AdSize cannot be both inline and large anchored adaptive");
        }
        if (z && z3) {
            throw new IllegalArgumentException("AdSize cannot be both anchored and large anchored adaptive");
        }
        if (z2 && i2 < 1) {
            throw new IllegalArgumentException("An inline AdSize must have a positive height");
        }
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getFormatString() {
        return this.formatString;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final boolean getIsAnchoredAdaptiveBanner() {
        return this.isAnchoredAdaptiveBanner;
    }

    public final boolean competently() {
        return this.width == -3 && this.height == -4;
    }

    public final int dern(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.height;
        if (i == -4 || i == -3) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public boolean equals(Object other) {
        if (!(other instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) other;
        return this.width == attabalVar.width && this.height == attabalVar.height && Intrinsics.wireman(this.formatString, attabalVar.formatString);
    }

    public int hashCode() {
        return Objects.hash(this.formatString, Boolean.valueOf(competently()));
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final boolean getIsInlineAdaptiveBanner() {
        return this.isInlineAdaptiveBanner;
    }

    public final int marial(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.width;
        if (i == -4 || i == -3) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final boolean getIsLargeAnchoredAdaptiveBanner() {
        return this.isLargeAnchoredAdaptiveBanner;
    }

    public String toString() {
        return this.formatString + " " + (competently() ? "fluid" : "");
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ attabal(int i, int i2, String str, boolean z, boolean z2, boolean z3, int i3) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3);
    }

    public attabal(int i, int i2) {
        this(i, i2, null, false, false, false, 56);
    }
}
