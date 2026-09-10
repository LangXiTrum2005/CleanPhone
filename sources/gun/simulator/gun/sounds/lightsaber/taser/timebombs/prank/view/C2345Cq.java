package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TemperatureCache;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2345Cq implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2945a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2345Cq(Object obj, int i) {
        this.f2945a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2945a) {
            case 0:
                return DynamicColor.lambda$fromArgb$0((TonalPalette) this.b, (DynamicScheme) obj);
            case 1:
                return DynamicColor.lambda$fromArgb$1((Hct) this.b, (DynamicScheme) obj);
            default:
                return ((TemperatureCache) this.b).lambda$getHctsByTemp$0((Hct) obj);
        }
    }
}
