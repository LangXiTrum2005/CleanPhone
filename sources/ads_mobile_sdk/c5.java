package ads_mobile_sdk;

import android.view.InputEvent;
import saneness.glutethimide;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public static final Object b = new Object();
    public static c5 c;
    public final f5 a;

    public c5(d40 d40Var) {
        this.a = d40Var.a();
    }

    public final void a(InputEvent inputEvent) {
        lt2 lt2Var = this.a.b;
        glutethimide glutethimideVar = (glutethimide) lt2Var.f.get();
        if (glutethimideVar == null) {
            lt2Var.e.b(gf0.EVENT_ID_EARLY_INPUT_EVENT);
        } else {
            glutethimideVar.a(inputEvent);
        }
    }
}
