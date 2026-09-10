package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2809Un implements Cdo, Continuation, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3843a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C2809Un(C2777Th c2777Th, C2803Uh c2803Uh) {
        this.b = c2777Th;
        this.f3843a = true;
        this.c = c2803Uh;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cdo
    public final C3965lY a(int i, C3974ld0 c3974ld0, int[] iArr) {
        C3557go c3557go = (C3557go) this.b;
        C2939Zn c2939Zn = (C2939Zn) this.c;
        c3557go.getClass();
        C2835Vn c2835Vn = new C2835Vn(c3557go);
        C5086yC c5086yC = AC.b;
        FW.n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < c3974ld0.f4655a) {
            C2861Wn c2861Wn = new C2861Wn(i, c3974ld0, i2, c2939Zn, iArr[i2], this.f3843a, c2835Vn);
            int i4 = i3 + 1;
            if (objArrCopyOf.length < i4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i4));
            }
            objArrCopyOf[i3] = c2861Wn;
            i2++;
            i3 = i4;
        }
        return AC.h(i3, objArrCopyOf);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        C2777Th c2777Th = (C2777Th) this.b;
        boolean z = this.f3843a;
        C2803Uh c2803Uh = (C2803Uh) this.c;
        HashMap map = C2777Th.d;
        if (z) {
            synchronized (c2777Th) {
                c2777Th.c = Tasks.forResult(c2803Uh);
            }
        } else {
            c2777Th.getClass();
        }
        return Tasks.forResult(c2803Uh);
    }

    public /* synthetic */ C2809Un(Object obj, boolean z, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.f3843a = z;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Context context = (Context) this.b;
        Intent intent = (Intent) this.c;
        Object obj = C2478Ht.c;
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? C2478Ht.a(context, intent, this.f3843a).continueWith(new N5(21), new C2953a0(3)) : task;
    }
}
