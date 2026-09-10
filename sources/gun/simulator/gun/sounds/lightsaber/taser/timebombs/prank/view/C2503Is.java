package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2503Is implements BI, AccessibilityViewCommand, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3243a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2503Is(Object obj, int i) {
        this.b = obj;
        this.f3243a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public void invoke(Object obj) {
        ((JU) obj).B((C3693iO) this.b, this.f3243a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.f3243a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Aj0.a((Intent) obj);
                break;
            case 1:
                int i2 = BinderC3024am0.b;
                ((C3113bm0) obj).b.trySetResult(null);
                break;
            case 2:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((SideSheetBehavior) this.b).lambda$createAccessibilityViewCommandForState$2(this.f3243a, view, commandArguments);
    }
}
