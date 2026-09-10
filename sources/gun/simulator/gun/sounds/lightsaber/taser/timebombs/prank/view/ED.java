package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ED implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3015a;
    public final /* synthetic */ String b;

    public /* synthetic */ ED(String str, int i) {
        this.f3015a = i;
        this.b = str;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f3015a;
        return AbstractC4665tV.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f3015a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return AbstractC4665tV.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f3015a;
        return AbstractC4665tV.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        int i = this.f3015a;
        String str = this.b;
        switch (i) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowExtraOutput$16(str, (Uri) obj);
            case 1:
                return str.equals((String) obj);
            case 2:
                return IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(str, (ComponentName) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(str, (Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(str, (Uri) obj);
            case 5:
                return str.equals((String) obj);
            case 6:
                return str.equals((String) obj);
            case 7:
                return str.equals((String) obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(str, (Uri) obj);
        }
    }
}
