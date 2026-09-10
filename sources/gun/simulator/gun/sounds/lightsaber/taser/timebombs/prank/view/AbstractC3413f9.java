package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3413f9 implements O4, ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4356a;
    public final Object b;

    public /* synthetic */ AbstractC3413f9(Object obj, int i) {
        this.f4356a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final List f() {
        return (List) this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final boolean g() {
        Object obj = this.b;
        if (((List) obj).isEmpty()) {
            return true;
        }
        return ((List) obj).size() == 1 && ((C5090yG) ((List) obj).get(0)).c();
    }

    public final void h(InterfaceC4226oV interfaceC4226oV) {
        Object obj = this.b;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(interfaceC4226oV);
        }
    }

    public final String toString() {
        int i = this.f4356a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) obj;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            case 3:
                return (String) obj;
            default:
                return super.toString();
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        return new C2745Sb((InterfaceC2867Wt) this.b, 2);
    }

    public AbstractC3413f9() {
        this.f4356a = 1;
        char[] cArr = Tg0.f3783a;
        this.b = new ArrayDeque(20);
    }

    public AbstractC3413f9(String str) {
        this.f4356a = 3;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("name cannot be null.");
    }
}
