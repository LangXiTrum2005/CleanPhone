package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class KM implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3313a;

    public /* synthetic */ KM(int i) {
        this.f3313a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f3313a) {
            case 0:
                return dynamicScheme.neutralPalette;
            case 1:
                return MaterialDynamicColors.lambda$inverseOnSurface$40(dynamicScheme);
            case 2:
                return dynamicScheme.tertiaryPalette;
            case 3:
                return dynamicScheme.secondaryPalette;
            case 4:
                return dynamicScheme.primaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$onPrimaryFixed$110(dynamicScheme);
            case 6:
                return dynamicScheme.errorPalette;
            case 7:
                return MaterialDynamicColors.lambda$error$92(dynamicScheme);
            case 8:
                return dynamicScheme.neutralPalette;
            case 9:
                return MaterialDynamicColors.lambda$textPrimaryInverse$153(dynamicScheme);
            case 10:
                return dynamicScheme.neutralPalette;
            case 11:
                return MaterialDynamicColors.lambda$surfaceContainer$26(dynamicScheme);
            case 12:
                return dynamicScheme.neutralVariantPalette;
            case 13:
                return MaterialDynamicColors.lambda$onSurfaceVariant$36(dynamicScheme);
            case 14:
                return dynamicScheme.neutralPalette;
            case 15:
                return MaterialDynamicColors.lambda$inverseSurface$38(dynamicScheme);
            case 16:
                return dynamicScheme.errorPalette;
            case 17:
                return MaterialDynamicColors.lambda$onErrorContainer$101(dynamicScheme);
            case 18:
                return dynamicScheme.neutralVariantPalette;
            case 19:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155(dynamicScheme);
            case 20:
                return dynamicScheme.errorPalette;
            case 21:
                return MaterialDynamicColors.lambda$errorContainer$98(dynamicScheme);
            case 22:
                return dynamicScheme.tertiaryPalette;
            case 23:
                return MaterialDynamicColors.lambda$tertiaryFixed$132(dynamicScheme);
            case 24:
                return dynamicScheme.primaryPalette;
            case 25:
                return MaterialDynamicColors.lambda$primary$53(dynamicScheme);
            case 26:
                return dynamicScheme.neutralPalette;
            case 27:
                return MaterialDynamicColors.lambda$scrim$49(dynamicScheme);
            case 28:
                return dynamicScheme.secondaryPalette;
            default:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128(dynamicScheme);
        }
    }
}
