package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum br {
    BOOLEAN(4, 1),
    CHAR(5, 2),
    FLOAT(6, 4),
    DOUBLE(7, 8),
    BYTE(8, 1),
    SHORT(9, 2),
    INT(10, 4),
    LONG(11, 8);

    public static final a k = new a(0 == true ? 1 : 0);
    private static final Map<Integer, Integer> m;
    private static final Map<Integer, br> n;
    public final int i;
    public final int j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        br[] brVarArrValues = values();
        ArrayList arrayList = new ArrayList(brVarArrValues.length);
        for (br brVar : brVarArrValues) {
            arrayList.add(new C4839vT(Integer.valueOf(brVar.i), Integer.valueOf(brVar.j)));
        }
        m = U5.A0(arrayList);
        br[] brVarArrValues2 = values();
        ArrayList arrayList2 = new ArrayList(brVarArrValues2.length);
        for (br brVar2 : brVarArrValues2) {
            arrayList2.add(new C4839vT(Integer.valueOf(brVar2.i), brVar2));
        }
        n = U5.A0(arrayList2);
    }

    br(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
