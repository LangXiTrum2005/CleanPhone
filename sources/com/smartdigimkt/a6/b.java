package com.smartdigimkt.a6;

import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    public interface a {
        void a(int i2, int i3);
    }

    public static void a(View view, boolean z2, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z2) {
            layoutParams.width = 0;
        }
        if (z3) {
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }

    public static float a(com.smartdigimkt.l5.b bVar, boolean z2, com.smartdigimkt.v6.a aVar) {
        return a(bVar, z2, aVar, true);
    }

    public static float a(com.smartdigimkt.l5.b bVar, boolean z2, com.smartdigimkt.v6.a aVar, boolean z3) {
        int iY;
        g gVar;
        g gVar2;
        if (aVar == null || (gVar2 = aVar.t) == null) {
            iY = 1;
        } else if (z2) {
            iY = gVar2.G();
        } else {
            iY = gVar2.Y();
        }
        float f = 1.0f;
        if (bVar != null) {
            if (iY == 2) {
                f = 1.5f;
            } else if (iY == 3) {
                f = 0.75f;
            } else if (iY == 4) {
                f = 0.5f;
            }
            a(bVar, f, (z2 && z3) ? 1.0d : (aVar == null || (gVar = aVar.t) == null) ? 1.0d : gVar.D());
        }
        return f;
    }

    public static void a(com.smartdigimkt.l5.b bVar, float f, double d) {
        if (bVar != null) {
            bVar.setClickAreaScaleFactor(f);
            bVar.setClickViewAlpha(d);
        }
    }

    public static boolean a(long j, com.smartdigimkt.v6.a aVar) {
        g gVar;
        if (aVar != null && (gVar = aVar.t) != null && gVar.f1() < 0) {
            return true;
        }
        if (j <= 0) {
            return false;
        }
        return aVar == null || aVar.t == null || System.currentTimeMillis() - j > aVar.t.f1();
    }
}
