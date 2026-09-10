package wi;

import android.window.BackEvent;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.HashMap;
import xi.p;
import xi.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f53209a;

    public a(n.j jVar) {
        v1.j jVar2 = new v1.j(3);
        p pVar = new p(jVar, "flutter/backgesture", v.f53830b);
        this.f53209a = pVar;
        pVar.b(jVar2);
    }

    public static HashMap a(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put(NotificationCompat.CATEGORY_PROGRESS, Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }
}
