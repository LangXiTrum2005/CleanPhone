package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FD implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3058a;

    public /* synthetic */ FD(int i) {
        this.f3058a = i;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f3058a;
        return AbstractC4665tV.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f3058a) {
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
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return AbstractC4665tV.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f3058a;
        return AbstractC4665tV.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f3058a) {
            case 0:
                return IntentSanitizer.Builder.lambda$new$0((String) obj);
            case 1:
                return IntentSanitizer.Builder.lambda$new$1((Uri) obj);
            case 2:
                return IntentSanitizer.Builder.lambda$new$2((String) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$new$3((String) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$new$4((String) obj);
            case 5:
                return IntentSanitizer.Builder.lambda$new$5((ComponentName) obj);
            case 6:
                return IntentSanitizer.Builder.lambda$new$6((Uri) obj);
            case 7:
                return IntentSanitizer.Builder.lambda$new$7((ClipData) obj);
            case 8:
                return IntentSanitizer.Builder.lambda$allowExtra$12(obj);
            case 9:
                return IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj);
            case 10:
                return IntentSanitizer.Builder.lambda$allowExtra$14(obj);
            default:
                return AbstractC4665tV.h(obj);
        }
    }
}
